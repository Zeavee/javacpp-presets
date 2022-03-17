/*
 * Copyright (C) 2018-2019 Samuel Audet, Alexander Merritt
 *
 * Licensed either under the Apache License, Version 2.0, or (at your option)
 * under the terms of the GNU General Public License as published by
 * the Free Software Foundation (subject to the "Classpath" exception),
 * either version 2, or any later version (collectively, the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *     http://www.gnu.org/licenses/
 *     http://www.gnu.org/software/classpath/license.html
 *
 * or as provided in the LICENSE.txt file that accompanied this code.
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.oracle.svm.shadowed.org.bytedeco.dnnl.presets;

import com.oracle.svm.shadowed.org.bytedeco.javacpp.annotation.Platform;
import com.oracle.svm.shadowed.org.bytedeco.javacpp.annotation.Properties;
import com.oracle.svm.shadowed.org.bytedeco.javacpp.tools.Info;
import com.oracle.svm.shadowed.org.bytedeco.javacpp.tools.InfoMap;
import com.oracle.svm.shadowed.org.bytedeco.javacpp.tools.InfoMapper;

/**
 *
 * @author Samuel Audet
 */
@Properties(
    value = {
        @Platform(
            value = {"linux-x86_64", "macosx-x86_64", "windows-x86_64"},
            compiler = "cpp11",
            define = {"GENERIC_EXCEPTION_CLASS dnnl::error", "GENERIC_EXCEPTION_TOSTRING toStdString().c_str()"},
            include = {"dnnl_config.h", "dnnl_types.h", /*"dnnl_debug.h",*/ "dnnl_version.h", "dnnl.h", "dnnl.hpp"},
            link = "dnnl@.1", preload = {"gomp@.1", "iomp5"}),
        @Platform(
            value = "macosx-x86_64",
            preload = {"gcc_s@.1", "gomp@.1", "stdc++@.6", "iomp5"},
            preloadpath = {"/usr/local/lib/gcc/8/", "/usr/local/lib/gcc/7/", "/usr/local/lib/gcc/6/", "/usr/local/lib/gcc/5/"}),
        @Platform(
            value = "windows-x86_64",
            preload = {"libwinpthread-1", "libgcc_s_seh-1", "libgomp-1", "libstdc++-6", "libiomp5md", "libdnnl"})},
    target = "com.oracle.svm.shadowed.org.bytedeco.dnnl", global = "com.oracle.svm.shadowed.org.bytedeco.dnnl.global.dnnl")
public class dnnl implements InfoMapper {
    public void map(InfoMap infoMap) {
        infoMap.put(new Info().enumerate())
               .put(new Info("DNNL_HELPER_DLL_IMPORT", "DNNL_HELPER_DLL_EXPORT", "DNNL_API",
                             "DNNL_MEMORY_NONE", "DNNL_MEMORY_ALLOCATE").cppTypes().annotations())
               .put(new Info("DNNL_VERSION_HASH").translate(false))
               .put(new Info("DNNL_DEPRECATED").cppText("#define DNNL_DEPRECATED deprecated").cppTypes())
               .put(new Info("deprecated").annotations("@Deprecated"))
               .put(new Info("DOXYGEN_SHOULD_SKIP_THIS").define())
               .put(new Info("DNNL_GPU_RUNTIME == DNNL_RUNTIME_OCL").define(false))

               .put(new Info("dnnl_dims_t").cppTypes("int64_t* const"))
               .put(new Info("dnnl_memory_t").valueTypes("dnnl_memory").pointerTypes("@ByPtrPtr dnnl_memory", "@Cast(\"dnnl_memory_t*\") PointerPointer"))
               .put(new Info("const_dnnl_memory_t").valueTypes("@Const dnnl_memory").pointerTypes("@Const @ByPtrPtr dnnl_memory", "@Cast(\"const_dnnl_memory_t*\") PointerPointer"))
               .put(new Info("dnnl_engine_t").valueTypes("dnnl_engine").pointerTypes("@ByPtrPtr dnnl_engine", "@Cast(\"dnnl_engine_t*\") PointerPointer"))
               .put(new Info("const_dnnl_engine_t").valueTypes("@Const dnnl_engine").pointerTypes("@Const @ByPtrPtr dnnl_engine", "@Cast(\"const_dnnl_engine_t*\") PointerPointer"))
               .put(new Info("dnnl_primitive_desc_iterator_t").valueTypes("dnnl_primitive_desc_iterator").pointerTypes("@ByPtrPtr dnnl_primitive_desc_iterator", "@Cast(\"dnnl_primitive_desc_iterator_t*\") PointerPointer"))
               .put(new Info("const_dnnl_primitive_desc_iterator_t").valueTypes("@Const dnnl_primitive_desc_iterator").pointerTypes("@Const @ByPtrPtr dnnl_primitive_desc_iterator", "@Cast(\"const_dnnl_primitive_desc_iterator_t*\") PointerPointer"))
               .put(new Info("dnnl_primitive_desc_t").valueTypes("dnnl_primitive_desc").pointerTypes("@ByPtrPtr dnnl_primitive_desc", "@Cast(\"dnnl_primitive_desc_t*\") PointerPointer"))
               .put(new Info("const_dnnl_primitive_desc_t").valueTypes("@Const dnnl_primitive_desc").pointerTypes("@Const @ByPtrPtr dnnl_primitive_desc", "@Cast(\"const_dnnl_primitive_desc_t*\") PointerPointer"))
               .put(new Info("dnnl_primitive_attr_t").valueTypes("dnnl_primitive_attr").pointerTypes("@ByPtrPtr dnnl_primitive_attr", "@Cast(\"dnnl_primitive_attr_t*\") PointerPointer"))
               .put(new Info("const_dnnl_primitive_attr_t").valueTypes("@Const dnnl_primitive_attr").pointerTypes("@Const @ByPtrPtr dnnl_primitive_attr", "@Cast(\"const_dnnl_primitive_attr_t*\") PointerPointer"))
               .put(new Info("dnnl_post_ops_t").valueTypes("dnnl_post_ops").pointerTypes("@ByPtrPtr dnnl_post_ops", "@Cast(\"dnnl_post_ops_t*\") PointerPointer"))
               .put(new Info("const_dnnl_post_ops_t").valueTypes("@Const dnnl_post_ops").pointerTypes("@Const @ByPtrPtr dnnl_post_ops", "@Cast(\"const_dnnl_post_ops_t*\") PointerPointer"))
               .put(new Info("dnnl_primitive_t").valueTypes("dnnl_primitive").pointerTypes("@ByPtrPtr dnnl_primitive", "@Cast(\"dnnl_primitive_t*\") PointerPointer"))
               .put(new Info("const_dnnl_primitive_t").valueTypes("@Const dnnl_primitive").pointerTypes("@Const @ByPtrPtr dnnl_primitive", "@Cast(\"const_dnnl_primitive_t*\") PointerPointer"))
               .put(new Info("dnnl_stream_t").valueTypes("dnnl_stream").pointerTypes("@ByPtrPtr dnnl_stream", "@Cast(\"dnnl_stream_t*\") PointerPointer"))
               .put(new Info("const_dnnl_stream_t").valueTypes("@Const dnnl_stream").pointerTypes("@Const @ByPtrPtr dnnl_stream", "@Cast(\"const_dnnl_stream_t*\") PointerPointer"))

               .put(new Info("dnnl::primitive_desc").pointerTypes("com.oracle.svm.shadowed.org.bytedeco.dnnl.primitive_desc"))
               .put(new Info("dnnl::memory::dims").annotations("@Cast({\"dnnl_dim_t*\", \"std::vector<dnnl_dim_t>&\"}) @StdVector(\"dnnl_dim_t\")").pointerTypes("LongPointer", "LongBuffer", "long[]"))
//               .put(new Info("std::vector<const_dnnl_primitive_desc_t>").annotations("@StdVector @Cast(\"const_dnnl_primitive_desc_t*\")").pointerTypes("PointerPointer"))
//               .put(new Info("dnnl::primitive::at").pointerTypes("primitive.at").define())
//               .put(new Info("dnnl::memory::primitive_desc").pointerTypes("memory.primitive_desc").define())
//               .put(new Info("std::vector<int64_t>", "std::vector<dnnl_dim_t>", "dnnl::memory::dims").pointerTypes("memory_dims").define())
               .put(new Info("std::vector<dnnl_primitive_desc_t>",
                             "std::vector<const_dnnl_primitive_desc_t>").cast().pointerTypes("dnnl_primitive_desc_vector").define())
               .put(new Info("std::vector<dnnl::primitive>").pointerTypes("primitive_vector").define())
//               .put(new Info("std::vector<dnnl::primitive::at>").pointerTypes("primitive_at_vector").define())
//               .put(new Info("std::vector<dnnl::memory::primitive_desc>").pointerTypes("memory_primitive_desc_vector").define())

               .put(new Info("dnnl::memory::data_type").pointerTypes("memory.data_type"))
               .put(new Info("dnnl::memory::format_tag").pointerTypes("memory.format_tag"))
               .put(new Info("dnnl::stream::flags").pointerTypes("stream.flags"))
               .put(new Info("dnnl::primitive::kind").pointerTypes("primitive.kind"))

               .put(new Info("dnnl::handle_traits").skip())
               .put(new Info("dnnl::handle<dnnl_engine_t>", "dnnl::handle<dnnl_engine_t,traits>").pointerTypes("dnnl_engine_handle"))
               .put(new Info("dnnl::handle<dnnl_memory_t>", "dnnl::handle<dnnl_memory_t,traits>").pointerTypes("dnnl_memory_handle"))
               .put(new Info("dnnl::handle<dnnl_primitive_desc_t>", "dnnl::handle<dnnl_primitive_desc_t,traits>").pointerTypes("dnnl_primitive_desc_handle"))
               .put(new Info("dnnl::handle<dnnl_primitive_attr_t>", "dnnl::handle<dnnl_primitive_attr_t,traits>").pointerTypes("dnnl_primitive_attr_handle"))
               .put(new Info("dnnl::handle<dnnl_post_ops_t>", "dnnl::handle<dnnl_post_ops_t,traits>").pointerTypes("dnnl_post_ops_handle"))
               .put(new Info("dnnl::handle<dnnl_primitive_t>", "dnnl::handle<dnnl_primitive_t,traits>").pointerTypes("dnnl_primitive_handle"))
               .put(new Info("dnnl::handle<dnnl_stream_t>", "dnnl::handle<dnnl_stream_t,traits>").pointerTypes("dnnl_stream_handle"))

               .put(new Info("std::unordered_map<int,dnnl::memory>").pointerTypes("IntMemoryMap").define())
               .put(new Info("dnnl::primitive::get_primitive_desc").javaNames("get_dnnl_primitive_desc"))
               .put(new Info("dnnl::eltwise_forward::desc<float>",
                             "dnnl::eltwise_backward::desc<float>",
                             "dnnl::batch_normalization_forward::desc<float>",
                             "dnnl::batch_normalization_backward::desc<float>").javaNames("desc").skipDefaults())

               .put(new Info("dnnl::rnn_cell::desc::operator const dnnl_rnn_cell_desc_t*()").javaText(
                         "public native @Name(\"operator const dnnl_rnn_cell_desc_t*\") @Const dnnl_rnn_cell_desc_t as_dnnl_rnn_cell_desc_t();\n"))

               .put(new Info("dnnl_stream_kind_t::dnnl_any_stream").javaNames("dnnl_any_stream"))
               .put(new Info("dnnl_stream_kind_t::dnnl_eager").javaNames("dnnl_eager"))
               .put(new Info("dnnl_stream_kind_t::dnnl_lazy").javaNames("dnnl_lazy"));
    }
}

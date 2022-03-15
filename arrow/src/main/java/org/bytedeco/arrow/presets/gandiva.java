/*
 * Copyright (C) 2020-2021 Samuel Audet
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

package com.oracle.svm.shadowed.org.bytedeco.arrow.presets;

import com.oracle.svm.shadowed.org.bytedeco.javacpp.Loader;
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
    inherit = arrow.class,
    value = {
        @Platform(
            include = {
                "gandiva/visibility.h",
                "gandiva/configuration.h",
                "gandiva/arrow.h",
//                "gandiva/logging.h",
                "gandiva/function_signature.h",
                "gandiva/gandiva_aliases.h",
                "gandiva/expression.h",
                "gandiva/expression_registry.h",
                "gandiva/condition.h",
                "gandiva/selection_vector.h",
                "gandiva/filter.h",
                "gandiva/projector.h",
                "gandiva/basic_decimal_scalar.h",
                "gandiva/decimal_scalar.h",
                "gandiva/tree_expr_builder.h",
            },
            link = "gandiva@.500"
        ),
    },
    target = "com.oracle.svm.shadowed.org.bytedeco.gandiva",
    global = "com.oracle.svm.shadowed.org.bytedeco.arrow.global.gandiva"
)
public class gandiva implements InfoMapper {
    static { Loader.checkVersion("com.oracle.svm.shadowed.org.bytedeco", "gandiva"); }

    public void map(InfoMap infoMap) {
        infoMap.put(new Info("GANDIVA_EXPORT").cppTypes().annotations())
               .put(new Info("std::hash<gandiva::DecimalScalar128>").pointerTypes("DecimalScalar128Hash"))
               .put(new Info("std::unordered_set<gandiva::DecimalScalar128>").pointerTypes("DecimalScalar128Set").define())
               .put(new Info("std::shared_ptr<gandiva::FunctionSignature>").annotations("@SharedPtr").pointerTypes("FunctionSignature"))
               .put(new Info("std::vector<std::shared_ptr<gandiva::FunctionSignature> >").pointerTypes("FunctionSignatureVector").define())
               .put(new Info("std::unordered_set<int32_t>").pointerTypes("IntSet").define())
               .put(new Info("std::unordered_set<int64_t>").pointerTypes("LongSet").define())
               .put(new Info("std::unordered_set<float>").pointerTypes("FloatSet").define())
               .put(new Info("std::unordered_set<double>").pointerTypes("DoubleSet").define())
               .put(new Info("std::unordered_set<std::string>").pointerTypes("StringSet").define())
        ;
    }
}

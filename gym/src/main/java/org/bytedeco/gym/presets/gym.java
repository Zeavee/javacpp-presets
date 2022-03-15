/*
 * Copyright (C) 2020 Samuel Audet
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

package com.oracle.svm.shadowed.org.bytedeco.gym.presets;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import com.oracle.svm.shadowed.org.bytedeco.javacpp.Loader;
import com.oracle.svm.shadowed.org.bytedeco.javacpp.annotation.NoException;
import com.oracle.svm.shadowed.org.bytedeco.javacpp.annotation.Platform;
import com.oracle.svm.shadowed.org.bytedeco.javacpp.annotation.Properties;
import com.oracle.svm.shadowed.org.bytedeco.javacpp.tools.Info;
import com.oracle.svm.shadowed.org.bytedeco.javacpp.tools.InfoMap;
import com.oracle.svm.shadowed.org.bytedeco.javacpp.tools.InfoMapper;

import com.oracle.svm.shadowed.org.bytedeco.opencv.*;
import com.oracle.svm.shadowed.org.bytedeco.scipy.presets.*;

/**
 *
 * @author Samuel Audet
 */
@Properties(
    inherit = {opencv_python3.class, scipy.class},
    value = {
        @Platform(
            resource = "python"
        )
    }
)
@NoException
public class gym {
    static { Loader.checkVersion("com.oracle.svm.shadowed.org.bytedeco", "gym"); }

    private static File packageFile = null;

    /** Returns {@code Loader.cacheResource("/com/oracle/svm/shadowed/org/bytedeco/gym/python/")}. */
    public static synchronized File cachePackage() throws IOException {
        if (packageFile != null) {
            return packageFile;
        }
        packageFile = Loader.cacheResource("/com/oracle/svm/shadowed/org/bytedeco/gym/python/");
        return packageFile;
    }

    /** Returns {@code {opencv_python3.cachePackages(), scipy.cachePackages(), gym.cachePackage()}}. */
    public static File[] cachePackages() throws IOException {
        File[] path = com.oracle.svm.shadowed.org.bytedeco.opencv.opencv_python3.cachePackages();
        path = Arrays.copyOf(path, path.length + 2);
        path[path.length - 2] = com.oracle.svm.shadowed.org.bytedeco.scipy.presets.scipy.cachePackage();
        path[path.length - 1] = cachePackage();
        return path;
    }
}

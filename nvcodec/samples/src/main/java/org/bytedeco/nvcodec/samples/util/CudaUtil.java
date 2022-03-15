package com.oracle.svm.shadowed.org.bytedeco.nvcodec.samples.util;

import com.oracle.svm.shadowed.org.bytedeco.nvcodec.samples.exceptions.CudaException;

public class CudaUtil {
    public static void checkCudaApiCall(int result) throws CudaException {
        if (result != 0) {
            throw new CudaException(result);
        }
    }
}

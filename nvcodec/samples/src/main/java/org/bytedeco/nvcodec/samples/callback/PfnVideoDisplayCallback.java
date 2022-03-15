package com.oracle.svm.shadowed.org.bytedeco.nvcodec.samples.callback;

import com.oracle.svm.shadowed.org.bytedeco.nvcodec.samples.decoder.NvDecoder;
import com.oracle.svm.shadowed.org.bytedeco.javacpp.Pointer;
import com.oracle.svm.shadowed.org.bytedeco.nvcodec.nvcuvid.CUVIDPARSERDISPINFO;
import com.oracle.svm.shadowed.org.bytedeco.nvcodec.nvcuvid.PFNVIDDISPLAYCALLBACK;

public class PfnVideoDisplayCallback extends PFNVIDDISPLAYCALLBACK {
    private NvDecoder decoder;
    private static PfnVideoDisplayCallback instance;

    public static PfnVideoDisplayCallback getInstance() {
        if (instance == null) {
            instance = new PfnVideoDisplayCallback().retainReference();
        }

        return instance;
    }

    public void setDecoder(NvDecoder decoder) {
        this.decoder = decoder;
    }

    private PfnVideoDisplayCallback() {
        super();
    }

    @Override
    public int call(Pointer pointer, CUVIDPARSERDISPINFO cuvidparserdispinfo) {
        return this.decoder.handlePictureDisplay(cuvidparserdispinfo);
    }
}

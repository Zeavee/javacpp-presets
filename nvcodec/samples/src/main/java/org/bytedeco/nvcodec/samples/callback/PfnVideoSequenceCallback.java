package com.oracle.svm.shadowed.org.bytedeco.nvcodec.samples.callback;

import com.oracle.svm.shadowed.org.bytedeco.nvcodec.samples.decoder.NvDecoder;
import com.oracle.svm.shadowed.org.bytedeco.javacpp.Pointer;
import com.oracle.svm.shadowed.org.bytedeco.nvcodec.nvcuvid.CUVIDEOFORMAT;
import com.oracle.svm.shadowed.org.bytedeco.nvcodec.nvcuvid.PFNVIDSEQUENCECALLBACK;

public class PfnVideoSequenceCallback extends PFNVIDSEQUENCECALLBACK {
    private NvDecoder decoder;
    private static PfnVideoSequenceCallback instance;

    public static PfnVideoSequenceCallback getInstance() {
        if(instance == null){
            instance = new PfnVideoSequenceCallback().retainReference();
        }

        return instance;
    }

    public void setDecoder(NvDecoder decoder) {
        this.decoder = decoder;
    }

    private PfnVideoSequenceCallback() {
        super();
    }

    @Override
    public int call(Pointer pointer, CUVIDEOFORMAT cuvideoformat) {
        return this.decoder.handleVideoSequence(cuvideoformat);
    }
}

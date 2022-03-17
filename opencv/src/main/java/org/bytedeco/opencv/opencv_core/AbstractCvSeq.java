package com.oracle.svm.shadowed.org.bytedeco.opencv.opencv_core;

import com.oracle.svm.shadowed.org.bytedeco.javacpp.*;
import com.oracle.svm.shadowed.org.bytedeco.javacpp.annotation.Properties;

import static com.oracle.svm.shadowed.org.bytedeco.opencv.global.opencv_core.*;

@Properties(inherit = com.oracle.svm.shadowed.org.bytedeco.opencv.presets.opencv_core.class)
public abstract class AbstractCvSeq extends CvArr {
    public AbstractCvSeq(Pointer p) { super(p); }

    public static CvSeq create(int seq_flags, int header_size, int elem_size, CvMemStorage storage) {
        return cvCreateSeq(seq_flags, header_size, elem_size, storage);
    }
}

package com.oracle.svm.shadowed.org.bytedeco.opencv.opencv_core;

import com.oracle.svm.shadowed.org.bytedeco.javacpp.*;
import com.oracle.svm.shadowed.org.bytedeco.javacpp.annotation.Properties;

import static com.oracle.svm.shadowed.org.bytedeco.opencv.global.opencv_core.*;

@Properties(inherit = com.oracle.svm.shadowed.org.bytedeco.opencv.presets.opencv_core.class)
public abstract class AbstractCvSet extends CvSeq {
    public AbstractCvSet(Pointer p) { super(p); }

    public static CvSet create(int set_flags, int header_size, int elem_size,
            CvMemStorage storage) {
        return cvCreateSet(set_flags, header_size, elem_size, storage);
    }
}

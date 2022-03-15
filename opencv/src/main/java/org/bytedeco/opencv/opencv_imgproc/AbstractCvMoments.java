package com.oracle.svm.shadowed.org.bytedeco.opencv.opencv_imgproc;

import com.oracle.svm.shadowed.org.bytedeco.javacpp.*;
import com.oracle.svm.shadowed.org.bytedeco.javacpp.annotation.Properties;

@Properties(inherit = com.oracle.svm.shadowed.org.bytedeco.opencv.presets.opencv_imgproc.class)
public abstract class AbstractCvMoments extends Pointer {
    public AbstractCvMoments(Pointer p) { super(p); }

    public static ThreadLocal<CvMoments> createThreadLocal() {
        return new ThreadLocal<CvMoments>() {
            @Override protected CvMoments initialValue() {
                return new CvMoments();
            }
        };
    }
}

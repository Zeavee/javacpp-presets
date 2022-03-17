package com.oracle.svm.shadowed.org.bytedeco.opencv.opencv_imgproc;

import com.oracle.svm.shadowed.org.bytedeco.javacpp.*;
import com.oracle.svm.shadowed.org.bytedeco.javacpp.annotation.Properties;
import com.oracle.svm.shadowed.org.bytedeco.opencv.opencv_core.CvHistogram;

import static com.oracle.svm.shadowed.org.bytedeco.opencv.global.opencv_core.*;
import static com.oracle.svm.shadowed.org.bytedeco.opencv.global.opencv_imgproc.*;

@Properties(inherit = com.oracle.svm.shadowed.org.bytedeco.opencv.presets.opencv_imgproc.class)
public abstract class AbstractCvHistogram extends Pointer {
    public AbstractCvHistogram(Pointer p) { super(p); }

    /**
     * Calls cvCreateHist(), and registers a deallocator.
     * @return CvHistogram created. Do not call cvReleaseHist() on it.
     */
    public static CvHistogram create(int dims, int[] sizes, int type,
            float[][] ranges/*=null*/, int uniform/*=1*/) {
        CvHistogram h = cvCreateHist(dims, sizes, type, ranges, uniform);
        if (h != null) {
            h.deallocator(new ReleaseDeallocator(h));
        }
        return h;
    }

    /**
     * Calls the deallocator, if registered, otherwise has no effect.
     */
    public void release() {
        deallocate();
    }
    static class ReleaseDeallocator extends CvHistogram implements Deallocator {
        ReleaseDeallocator(CvHistogram p) { super(p); }
        @Override public void deallocate() { cvReleaseHist(this); }
    }
}

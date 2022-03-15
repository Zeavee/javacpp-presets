package com.oracle.svm.shadowed.org.bytedeco.opencv.opencv_core;

import com.oracle.svm.shadowed.org.bytedeco.javacpp.*;
import com.oracle.svm.shadowed.org.bytedeco.javacpp.annotation.Name;
import com.oracle.svm.shadowed.org.bytedeco.javacpp.annotation.Properties;

@Properties(inherit = com.oracle.svm.shadowed.org.bytedeco.opencv.presets.opencv_core.class)
@Name("CvArr*")
public class CvArrArray extends PointerPointer<CvArr> {
    static { Loader.load(); }
    public CvArrArray(CvArr ... array) { this(array.length); put(array); position(0); }
    public CvArrArray(long size) { super(size); allocateArray(size); }
    public CvArrArray(Pointer p) { super(p); }
    private native void allocateArray(long size);

    @Override public CvArrArray position(long position) {
        return (CvArrArray)super.position(position);
    }

    public CvArrArray put(CvArr ... array) {
        for (int i = 0; i < array.length; i++) {
            position(i).put(array[i]);
        }
        return this;
    }

    public native CvArr get();
    public native CvArrArray put(CvArr p);
}

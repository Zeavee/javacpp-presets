package com.oracle.svm.shadowed.org.bytedeco.opencv.opencv_core;

import com.oracle.svm.shadowed.org.bytedeco.javacpp.*;
import com.oracle.svm.shadowed.org.bytedeco.javacpp.annotation.Name;
import com.oracle.svm.shadowed.org.bytedeco.javacpp.annotation.Properties;
import com.oracle.svm.shadowed.org.bytedeco.javacpp.annotation.ValueGetter;

@Properties(inherit = com.oracle.svm.shadowed.org.bytedeco.opencv.presets.opencv_core.class)
@Name("CvMat*")
public class CvMatArray extends CvArrArray {
    public CvMatArray(CvMat ... array) { this(array.length); put(array); position(0); }
    public CvMatArray(long size) { allocateArray(size); }
    public CvMatArray(Pointer p) { super(p); }
    private native void allocateArray(long size);

    @Override public CvMatArray position(long position) {
        return (CvMatArray)super.position(position);
    }
    @Override public CvMatArray put(CvArr ... array) {
        return (CvMatArray)super.put(array);
    }
    @Override @ValueGetter public native CvMat get();
    @Override public CvMatArray put(CvArr p) {
        if (p instanceof CvMat) {
            return (CvMatArray)super.put(p);
        } else {
            throw new ArrayStoreException(p.getClass().getName());
        }
    }
}

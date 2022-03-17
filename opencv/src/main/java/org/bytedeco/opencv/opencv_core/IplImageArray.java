package com.oracle.svm.shadowed.org.bytedeco.opencv.opencv_core;

import com.oracle.svm.shadowed.org.bytedeco.javacpp.*;
import com.oracle.svm.shadowed.org.bytedeco.javacpp.annotation.Name;
import com.oracle.svm.shadowed.org.bytedeco.javacpp.annotation.Properties;
import com.oracle.svm.shadowed.org.bytedeco.javacpp.annotation.ValueGetter;

@Properties(inherit = com.oracle.svm.shadowed.org.bytedeco.opencv.presets.opencv_core.class)
@Name("IplImage*")
public class IplImageArray extends CvArrArray {
    public IplImageArray(IplImage ... array) { this(array.length); put(array); position(0); }
    public IplImageArray(long size) { allocateArray(size); }
    public IplImageArray(Pointer p) { super(p); }
    private native void allocateArray(long size);

    @Override public IplImageArray position(long position) {
        return (IplImageArray)super.position(position);
    }
    @Override public IplImageArray put(CvArr ... array) {
        return (IplImageArray)super.put(array);
    }
    @Override @ValueGetter public native IplImage get();
    @Override public IplImageArray put(CvArr p) {
        if (p instanceof IplImage) {
            return (IplImageArray)super.put(p);
        } else {
            throw new ArrayStoreException(p.getClass().getName());
        }
    }
}

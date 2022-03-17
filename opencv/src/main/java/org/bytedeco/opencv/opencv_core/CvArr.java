package com.oracle.svm.shadowed.org.bytedeco.opencv.opencv_core;

import com.oracle.svm.shadowed.org.bytedeco.javacpp.*;
import com.oracle.svm.shadowed.org.bytedeco.javacpp.annotation.Properties;
import com.oracle.svm.shadowed.org.bytedeco.javacpp.annotation.Opaque;

@Properties(inherit = com.oracle.svm.shadowed.org.bytedeco.opencv.presets.opencv_core.class)
@Opaque public class CvArr extends AbstractArray {
    public CvArr(Pointer p) { super(p); }

    @Override public int arrayChannels()          { throw new UnsupportedOperationException(); }
    @Override public int arrayDepth()             { throw new UnsupportedOperationException(); }
    @Override public int arrayOrigin()            { throw new UnsupportedOperationException(); }
    @Override public void arrayOrigin(int origin) { throw new UnsupportedOperationException(); }
    @Override public int arrayWidth()             { throw new UnsupportedOperationException(); }
    @Override public int arrayHeight()            { throw new UnsupportedOperationException(); }
    @Override public IplROI arrayROI()            { throw new UnsupportedOperationException(); }
    @Override public long arraySize()             { throw new UnsupportedOperationException(); }
    @Override public BytePointer arrayData()      { throw new UnsupportedOperationException(); }
    @Override public long arrayStep()             { throw new UnsupportedOperationException(); }
}

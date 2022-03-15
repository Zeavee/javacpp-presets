module com.oracle.svm.shadowed.org.bytedeco.flycapture {
  requires transitive com.oracle.svm.shadowed.org.bytedeco.javacpp;
  exports com.oracle.svm.shadowed.org.bytedeco.flycapture.global;
  exports com.oracle.svm.shadowed.org.bytedeco.flycapture.presets;
  exports com.oracle.svm.shadowed.org.bytedeco.flycapture.FlyCapture2;
  exports com.oracle.svm.shadowed.org.bytedeco.flycapture.FlyCapture2_C;
}

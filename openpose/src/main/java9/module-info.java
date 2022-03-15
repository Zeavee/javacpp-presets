module com.oracle.svm.shadowed.org.bytedeco.openpose {
  requires transitive com.oracle.svm.shadowed.org.bytedeco.javacpp;
  requires transitive com.oracle.svm.shadowed.org.bytedeco.caffe;
  requires transitive com.oracle.svm.shadowed.org.bytedeco.hdf5;
  requires transitive com.oracle.svm.shadowed.org.bytedeco.opencv;
  requires transitive com.oracle.svm.shadowed.org.bytedeco.openblas;
  exports com.oracle.svm.shadowed.org.bytedeco.openpose.global;
  exports com.oracle.svm.shadowed.org.bytedeco.openpose.presets;
  exports com.oracle.svm.shadowed.org.bytedeco.openpose;
}

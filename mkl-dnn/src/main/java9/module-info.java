module com.oracle.svm.shadowed.org.bytedeco.mkldnn {
  requires transitive com.oracle.svm.shadowed.org.bytedeco.javacpp;
  exports com.oracle.svm.shadowed.org.bytedeco.mkldnn.global;
  exports com.oracle.svm.shadowed.org.bytedeco.mkldnn.presets;
  exports com.oracle.svm.shadowed.org.bytedeco.mkldnn;
}

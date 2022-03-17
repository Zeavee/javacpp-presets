module com.oracle.svm.shadowed.org.bytedeco.libpostal {
  requires transitive com.oracle.svm.shadowed.org.bytedeco.javacpp;
  exports com.oracle.svm.shadowed.org.bytedeco.libpostal.global;
  exports com.oracle.svm.shadowed.org.bytedeco.libpostal.presets;
  exports com.oracle.svm.shadowed.org.bytedeco.libpostal;
}

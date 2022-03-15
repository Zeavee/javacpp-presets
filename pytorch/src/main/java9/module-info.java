module com.oracle.svm.shadowed.org.bytedeco.pytorch {
  requires transitive com.oracle.svm.shadowed.org.bytedeco.javacpp;
  requires transitive com.oracle.svm.shadowed.org.bytedeco.openblas;
  exports com.oracle.svm.shadowed.org.bytedeco.pytorch.global;
  exports com.oracle.svm.shadowed.org.bytedeco.pytorch.presets;
  exports com.oracle.svm.shadowed.org.bytedeco.pytorch;
}

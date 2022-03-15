module com.oracle.svm.shadowed.org.bytedeco.arrow {
  requires transitive com.oracle.svm.shadowed.org.bytedeco.javacpp;
  exports com.oracle.svm.shadowed.org.bytedeco.arrow.global;
  exports com.oracle.svm.shadowed.org.bytedeco.arrow.presets;
  exports com.oracle.svm.shadowed.org.bytedeco.arrow;
}

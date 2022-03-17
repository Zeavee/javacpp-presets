module com.oracle.svm.shadowed.org.bytedeco.openblas {
  requires transitive com.oracle.svm.shadowed.org.bytedeco.javacpp;
  exports com.oracle.svm.shadowed.org.bytedeco.openblas.global;
  exports com.oracle.svm.shadowed.org.bytedeco.openblas.presets;
}

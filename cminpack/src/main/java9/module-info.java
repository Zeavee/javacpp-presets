module com.oracle.svm.shadowed.org.bytedeco.cminpack {
  requires transitive com.oracle.svm.shadowed.org.bytedeco.javacpp;
  requires transitive com.oracle.svm.shadowed.org.bytedeco.openblas;
  exports com.oracle.svm.shadowed.org.bytedeco.cminpack.global;
  exports com.oracle.svm.shadowed.org.bytedeco.cminpack.presets;
}

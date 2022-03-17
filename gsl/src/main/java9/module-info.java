module com.oracle.svm.shadowed.org.bytedeco.gsl {
  requires transitive com.oracle.svm.shadowed.org.bytedeco.javacpp;
  requires transitive com.oracle.svm.shadowed.org.bytedeco.openblas;
  exports com.oracle.svm.shadowed.org.bytedeco.gsl.global;
  exports com.oracle.svm.shadowed.org.bytedeco.gls.presets;
  exports com.oracle.svm.shadowed.org.bytedeco.gsl;
}

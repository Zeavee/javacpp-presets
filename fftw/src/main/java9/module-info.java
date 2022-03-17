module com.oracle.svm.shadowed.org.bytedeco.fftw {
  requires transitive com.oracle.svm.shadowed.org.bytedeco.javacpp;
  exports com.oracle.svm.shadowed.org.bytedeco.fftw.global;
  exports com.oracle.svm.shadowed.org.bytedeco.fftw.presets;
}

module com.oracle.svm.shadowed.org.bytedeco.numpy {
  requires transitive com.oracle.svm.shadowed.org.bytedeco.javacpp;
  exports com.oracle.svm.shadowed.org.bytedeco.numpy.global;
  exports com.oracle.svm.shadowed.org.bytedeco.numpy.presets;
  exports com.oracle.svm.shadowed.org.bytedeco.numpy;
}

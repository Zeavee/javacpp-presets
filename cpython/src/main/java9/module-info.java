module com.oracle.svm.shadowed.org.bytedeco.cpython {
  requires transitive com.oracle.svm.shadowed.org.bytedeco.javacpp;
  exports com.oracle.svm.shadowed.org.bytedeco.cpython.global;
  exports com.oracle.svm.shadowed.org.bytedeco.cpython.helper;
  exports com.oracle.svm.shadowed.org.bytedeco.cpython.presets;
  exports com.oracle.svm.shadowed.org.bytedeco.cpython;
}

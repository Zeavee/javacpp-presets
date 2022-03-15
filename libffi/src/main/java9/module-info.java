module com.oracle.svm.shadowed.org.bytedeco.libffi {
  requires transitive com.oracle.svm.shadowed.org.bytedeco.javacpp;
  exports com.oracle.svm.shadowed.org.bytedeco.libffi.global;
  exports com.oracle.svm.shadowed.org.bytedeco.libffi.presets;
  exports com.oracle.svm.shadowed.org.bytedeco.libffi;
}

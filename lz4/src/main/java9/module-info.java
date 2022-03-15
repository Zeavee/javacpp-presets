module com.oracle.svm.shadowed.org.bytedeco.lz4 {
  requires transitive com.oracle.svm.shadowed.org.bytedeco.javacpp;
  exports com.oracle.svm.shadowed.org.bytedeco.lz4;
  exports com.oracle.svm.shadowed.org.bytedeco.lz4.global;
  exports com.oracle.svm.shadowed.org.bytedeco.lz4.presets;
}

module com.oracle.svm.shadowed.org.bytedeco.hyperscan {
  requires transitive com.oracle.svm.shadowed.org.bytedeco.javacpp;
  exports com.oracle.svm.shadowed.org.bytedeco.hyperscan;
  exports com.oracle.svm.shadowed.org.bytedeco.hyperscan.global;
  exports com.oracle.svm.shadowed.org.bytedeco.hyperscan.presets;
}
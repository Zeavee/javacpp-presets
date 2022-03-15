module com.oracle.svm.shadowed.org.bytedeco.cpu_features {
  requires transitive com.oracle.svm.shadowed.org.bytedeco.javacpp;
  exports com.oracle.svm.shadowed.org.bytedeco.cpu_features.global;
  exports com.oracle.svm.shadowed.org.bytedeco.cpu_features.presets;
  exports com.oracle.svm.shadowed.org.bytedeco.cpu_features;
}

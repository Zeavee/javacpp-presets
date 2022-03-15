module com.oracle.svm.shadowed.org.bytedeco.tensorflowlite {
  requires transitive com.oracle.svm.shadowed.org.bytedeco.javacpp;
  exports com.oracle.svm.shadowed.org.bytedeco.tensorflowlite.global;
  exports com.oracle.svm.shadowed.org.bytedeco.tensorflowlite.presets;
  exports com.oracle.svm.shadowed.org.bytedeco.tensorflowlite;
}

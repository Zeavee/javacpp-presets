module com.oracle.svm.shadowed.org.bytedeco.chilitags {
  requires transitive com.oracle.svm.shadowed.org.bytedeco.javacpp;
  requires transitive com.oracle.svm.shadowed.org.bytedeco.opencv;
  exports com.oracle.svm.shadowed.org.bytedeco.chilitags.global;
  exports com.oracle.svm.shadowed.org.bytedeco.chilitags.presets;
  exports com.oracle.svm.shadowed.org.bytedeco.chilitags;
}

module com.oracle.svm.shadowed.org.bytedeco.flandmark {
  requires transitive com.oracle.svm.shadowed.org.bytedeco.javacpp;
  requires transitive com.oracle.svm.shadowed.org.bytedeco.opencv;
  exports com.oracle.svm.shadowed.org.bytedeco.flandmark.global;
  exports com.oracle.svm.shadowed.org.bytedeco.flandmark.presets;
  exports com.oracle.svm.shadowed.org.bytedeco.flandmark;
}

module com.oracle.svm.shadowed.org.bytedeco.spinnaker {
  requires transitive com.oracle.svm.shadowed.org.bytedeco.javacpp;
  exports com.oracle.svm.shadowed.org.bytedeco.spinnaker.global;
  exports com.oracle.svm.shadowed.org.bytedeco.spinnaker.presets;
  exports com.oracle.svm.shadowed.org.bytedeco.spinnaker.Spinnaker_C;
}

module com.oracle.svm.shadowed.org.bytedeco.arpackng {
  requires transitive com.oracle.svm.shadowed.org.bytedeco.javacpp;
  requires transitive com.oracle.svm.shadowed.org.bytedeco.openblas;
  exports com.oracle.svm.shadowed.org.bytedeco.arpackng.global;
  exports com.oracle.svm.shadowed.org.bytedeco.arpacking.presets;
}

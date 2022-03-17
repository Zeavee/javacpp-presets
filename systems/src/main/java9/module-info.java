module com.oracle.svm.shadowed.org.bytedeco.systems {
  requires transitive com.oracle.svm.shadowed.org.bytedeco.javacpp;
  exports com.oracle.svm.shadowed.org.bytedeco.systems.global;
  exports com.oracle.svm.shadowed.org.bytedeco.systems.presets;
  exports com.oracle.svm.shadowed.org.bytedeco.systems.linux;
  exports com.oracle.svm.shadowed.org.bytedeco.systems.macosx;
  exports com.oracle.svm.shadowed.org.bytedeco.systems.windows;
}

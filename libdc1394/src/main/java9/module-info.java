module com.oracle.svm.shadowed.org.bytedeco.libdc1394 {
  requires transitive com.oracle.svm.shadowed.org.bytedeco.javacpp;
  exports com.oracle.svm.shadowed.org.bytedeco.libdc1394.global;
  exports com.oracle.svm.shadowed.org.bytedeco.libdc1394.presets;
  exports com.oracle.svm.shadowed.org.bytedeco.libdc1394;
}

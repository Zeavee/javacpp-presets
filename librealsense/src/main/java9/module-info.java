module com.oracle.svm.shadowed.org.bytedeco.librealsense {
  requires transitive com.oracle.svm.shadowed.org.bytedeco.javacpp;
  exports com.oracle.svm.shadowed.org.bytedeco.librealsense.global;
  exports com.oracle.svm.shadowed.org.bytedeco.librealsense.presets;
  exports com.oracle.svm.shadowed.org.bytedeco.librealsense;
}

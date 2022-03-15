module com.oracle.svm.shadowed.org.bytedeco.opencl {
  requires transitive com.oracle.svm.shadowed.org.bytedeco.javacpp;
  exports com.oracle.svm.shadowed.org.bytedeco.opencl.global;
  exports com.oracle.svm.shadowed.org.bytedeco.opencl.presets;
  exports com.oracle.svm.shadowed.org.bytedeco.opencl;
}

module com.oracle.svm.shadowed.org.bytedeco.dnnl {
  requires transitive com.oracle.svm.shadowed.org.bytedeco.javacpp;
  exports com.oracle.svm.shadowed.org.bytedeco.dnnl.global;
  exports com.oracle.svm.shadowed.org.bytedeco.dnnl.presets;
  exports com.oracle.svm.shadowed.org.bytedeco.dnnl;
}

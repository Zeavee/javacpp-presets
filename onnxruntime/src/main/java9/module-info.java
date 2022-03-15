module com.oracle.svm.shadowed.org.bytedeco.onnxruntime {
  requires transitive com.oracle.svm.shadowed.org.bytedeco.javacpp;
  requires transitive com.oracle.svm.shadowed.org.bytedeco.dnnl;
  exports com.oracle.svm.shadowed.org.bytedeco.onnxruntime.global;
  exports com.oracle.svm.shadowed.org.bytedeco.onnxruntime.presets;
  exports com.oracle.svm.shadowed.org.bytedeco.onnxruntime;
}

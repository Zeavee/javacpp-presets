module com.oracle.svm.shadowed.org.bytedeco.onnx {
  requires transitive com.oracle.svm.shadowed.org.bytedeco.javacpp;
  exports com.oracle.svm.shadowed.org.bytedeco.onnx.global;
  exports com.oracle.svm.shadowed.org.bytedeco.onnx.presets;
  exports com.oracle.svm.shadowed.org.bytedeco.onnx;
}

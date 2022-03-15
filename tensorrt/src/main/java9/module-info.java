module com.oracle.svm.shadowed.org.bytedeco.tensorrt {
  requires transitive com.oracle.svm.shadowed.org.bytedeco.javacpp;
  requires transitive com.oracle.svm.shadowed.org.bytedeco.cuda;
  exports com.oracle.svm.shadowed.org.bytedeco.tensorrt.global;
  exports com.oracle.svm.shadowed.org.bytedeco.tensorrt.presets;
  exports com.oracle.svm.shadowed.org.bytedeco.tensorrt.nvinfer;
  exports com.oracle.svm.shadowed.org.bytedeco.tensorrt.nvinfer_plugin;
  exports com.oracle.svm.shadowed.org.bytedeco.tensorrt.nvonnxparser;
  exports com.oracle.svm.shadowed.org.bytedeco.tensorrt.nvparsers;
}

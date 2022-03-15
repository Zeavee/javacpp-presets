module com.oracle.svm.shadowed.org.bytedeco.cuda {
  requires transitive com.oracle.svm.shadowed.org.bytedeco.javacpp;
  exports com.oracle.svm.shadowed.org.bytedeco.cuda.global;
  exports com.oracle.svm.shadowed.org.bytedeco.cuda.presets;
  exports com.oracle.svm.shadowed.org.bytedeco.cuda.cublas;
  exports com.oracle.svm.shadowed.org.bytedeco.cuda.cudart;
  exports com.oracle.svm.shadowed.org.bytedeco.cuda.cudnn;
  exports com.oracle.svm.shadowed.org.bytedeco.cuda.cufftw;
  exports com.oracle.svm.shadowed.org.bytedeco.cuda.curand;
  exports com.oracle.svm.shadowed.org.bytedeco.cuda.cusolver;
  exports com.oracle.svm.shadowed.org.bytedeco.cuda.cusparse;
  exports com.oracle.svm.shadowed.org.bytedeco.cuda.nccl;
  exports com.oracle.svm.shadowed.org.bytedeco.cuda.nppc;
  exports com.oracle.svm.shadowed.org.bytedeco.cuda.nppicc;
//  exports com.oracle.svm.shadowed.org.bytedeco.cuda.nppicom;
  exports com.oracle.svm.shadowed.org.bytedeco.cuda.nppig;
//  exports com.oracle.svm.shadowed.org.bytedeco.cuda.nvgraph;
  exports com.oracle.svm.shadowed.org.bytedeco.cuda.nvml;
  exports com.oracle.svm.shadowed.org.bytedeco.cuda.nvrtc;
  exports com.oracle.svm.shadowed.org.bytedeco.cuda.nvToolsExt;
}

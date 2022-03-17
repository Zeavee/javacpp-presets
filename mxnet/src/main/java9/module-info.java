module com.oracle.svm.shadowed.org.bytedeco.mxnet {
  requires transitive com.oracle.svm.shadowed.org.bytedeco.javacpp;
  requires transitive com.oracle.svm.shadowed.org.bytedeco.mkldnn;
  requires transitive com.oracle.svm.shadowed.org.bytedeco.openblas;
  requires transitive com.oracle.svm.shadowed.org.bytedeco.opencv;
  exports com.oracle.svm.shadowed.org.bytedeco.mxnet.global;
  exports com.oracle.svm.shadowed.org.bytedeco.mxnet.presets;
  exports com.oracle.svm.shadowed.org.bytedeco.mxnet;

  exports org.apache.mxnet;
  exports org.apache.mxnet.contrib;
  exports org.apache.mxnet.module;
  exports org.apache.mxnet.annotation;
  exports org.apache.mxnet.util;
  exports org.apache.mxnet.utils;
  exports org.apache.mxnet.infer;
  exports org.apache.mxnet.infer.javaapi;
  exports org.apache.mxnet.init;
  exports org.apache.mxnet.io;
  exports org.apache.mxnet.javaapi;
  exports org.apache.mxnet.spark;
  exports org.apache.mxnet.spark.utils;
  exports org.apache.mxnet.spark.example;
  exports org.apache.mxnet.spark.transformer;
  exports org.apache.mxnet.spark.io;
  exports org.apache.mxnet.spark.optimizer;
}

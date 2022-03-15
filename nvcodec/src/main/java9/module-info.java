module com.oracle.svm.shadowed.org.bytedeco.nvcodec {
  requires transitive com.oracle.svm.shadowed.org.bytedeco.javacpp;
  requires transitive com.oracle.svm.shadowed.org.bytedeco.cuda;
  exports com.oracle.svm.shadowed.org.bytedeco.nvcodec.global;
  exports com.oracle.svm.shadowed.org.bytedeco.nvcodec.presets;
  exports com.oracle.svm.shadowed.org.bytedeco.nvcodec.nvcuvid;
  exports com.oracle.svm.shadowed.org.bytedeco.nvcodec.nvencodeapi;
}
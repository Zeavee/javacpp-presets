module com.oracle.svm.shadowed.org.bytedeco.tvm {
  requires transitive com.oracle.svm.shadowed.org.bytedeco.javacpp;
  requires transitive com.oracle.svm.shadowed.org.bytedeco.dnnl;
  requires transitive com.oracle.svm.shadowed.org.bytedeco.llvm;
  requires transitive com.oracle.svm.shadowed.org.bytedeco.scipy;
  exports com.oracle.svm.shadowed.org.bytedeco.tvm.global;
  exports com.oracle.svm.shadowed.org.bytedeco.tvm.presets;
  exports com.oracle.svm.shadowed.org.bytedeco.tvm;
}

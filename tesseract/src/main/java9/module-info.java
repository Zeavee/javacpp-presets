module com.oracle.svm.shadowed.org.bytedeco.tesseract {
  requires transitive com.oracle.svm.shadowed.org.bytedeco.javacpp;
  requires transitive com.oracle.svm.shadowed.org.bytedeco.leptonica;
  exports com.oracle.svm.shadowed.org.bytedeco.tesseract.global;
  exports com.oracle.svm.shadowed.org.bytedeco.tesseract.presets;
  exports com.oracle.svm.shadowed.org.bytedeco.tesseract.program;
  exports com.oracle.svm.shadowed.org.bytedeco.tesseract;
}

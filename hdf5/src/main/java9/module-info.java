module com.oracle.svm.shadowed.org.bytedeco.hdf5 {
  requires transitive com.oracle.svm.shadowed.org.bytedeco.javacpp;
  exports com.oracle.svm.shadowed.org.bytedeco.hdf5.global;
  exports com.oracle.svm.shadowed.org.bytedeco.hdf5.presets;
  exports com.oracle.svm.shadowed.org.bytedeco.hdf5;
}

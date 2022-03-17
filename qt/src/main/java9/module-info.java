module com.oracle.svm.shadowed.org.bytedeco.qt {
  requires transitive com.oracle.svm.shadowed.org.bytedeco.javacpp;
  exports com.oracle.svm.shadowed.org.bytedeco.qt.global;
  exports com.oracle.svm.shadowed.org.bytedeco.qt.presets;
  exports com.oracle.svm.shadowed.org.bytedeco.qt.Qt5Core;
  exports com.oracle.svm.shadowed.org.bytedeco.qt.Qt5Gui;
  exports com.oracle.svm.shadowed.org.bytedeco.qt.Qt5Widgets;
}

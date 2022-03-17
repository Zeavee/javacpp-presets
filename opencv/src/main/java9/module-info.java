module com.oracle.svm.shadowed.org.bytedeco.opencv {
  requires transitive com.oracle.svm.shadowed.org.bytedeco.javacpp;
  requires transitive com.oracle.svm.shadowed.org.bytedeco.openblas;

  exports com.oracle.svm.shadowed.org.bytedeco.opencv;
  exports com.oracle.svm.shadowed.org.bytedeco.opencv.global;
  exports com.oracle.svm.shadowed.org.bytedeco.opencv.presets;
  exports com.oracle.svm.shadowed.org.bytedeco.opencv.opencv_aruco;
  exports com.oracle.svm.shadowed.org.bytedeco.opencv.opencv_bgsegm;
  exports com.oracle.svm.shadowed.org.bytedeco.opencv.opencv_bioinspired;
  exports com.oracle.svm.shadowed.org.bytedeco.opencv.opencv_calib3d;
  exports com.oracle.svm.shadowed.org.bytedeco.opencv.opencv_core;

  /* comment out cuda exports if building on a system without cuda installed */
  exports com.oracle.svm.shadowed.org.bytedeco.opencv.opencv_cudaarithm;
  exports com.oracle.svm.shadowed.org.bytedeco.opencv.opencv_cudafilters;
  exports com.oracle.svm.shadowed.org.bytedeco.opencv.opencv_cudaimgproc;
  exports com.oracle.svm.shadowed.org.bytedeco.opencv.opencv_cudaobjdetect;
  exports com.oracle.svm.shadowed.org.bytedeco.opencv.opencv_cudaoptflow;

  exports com.oracle.svm.shadowed.org.bytedeco.opencv.opencv_dnn;
  exports com.oracle.svm.shadowed.org.bytedeco.opencv.opencv_face;
  exports com.oracle.svm.shadowed.org.bytedeco.opencv.opencv_features2d;
  exports com.oracle.svm.shadowed.org.bytedeco.opencv.opencv_flann;
  exports com.oracle.svm.shadowed.org.bytedeco.opencv.opencv_highgui;
  exports com.oracle.svm.shadowed.org.bytedeco.opencv.opencv_img_hash;
  exports com.oracle.svm.shadowed.org.bytedeco.opencv.opencv_imgproc;
  exports com.oracle.svm.shadowed.org.bytedeco.opencv.opencv_ml;
  exports com.oracle.svm.shadowed.org.bytedeco.opencv.opencv_objdetect;
  exports com.oracle.svm.shadowed.org.bytedeco.opencv.opencv_optflow;
  exports com.oracle.svm.shadowed.org.bytedeco.opencv.opencv_phase_unwrapping;
  exports com.oracle.svm.shadowed.org.bytedeco.opencv.opencv_photo;
  exports com.oracle.svm.shadowed.org.bytedeco.opencv.opencv_plot;
  exports com.oracle.svm.shadowed.org.bytedeco.opencv.opencv_quality;
  exports com.oracle.svm.shadowed.org.bytedeco.opencv.opencv_saliency;
  exports com.oracle.svm.shadowed.org.bytedeco.opencv.opencv_shape;
  exports com.oracle.svm.shadowed.org.bytedeco.opencv.opencv_stitching;
  exports com.oracle.svm.shadowed.org.bytedeco.opencv.opencv_structured_light;
  exports com.oracle.svm.shadowed.org.bytedeco.opencv.opencv_superres;
  exports com.oracle.svm.shadowed.org.bytedeco.opencv.opencv_text;
  exports com.oracle.svm.shadowed.org.bytedeco.opencv.opencv_tracking;
  exports com.oracle.svm.shadowed.org.bytedeco.opencv.opencv_videoio;
  exports com.oracle.svm.shadowed.org.bytedeco.opencv.opencv_video;
  exports com.oracle.svm.shadowed.org.bytedeco.opencv.opencv_videostab;
  exports com.oracle.svm.shadowed.org.bytedeco.opencv.opencv_xfeatures2d;
  exports com.oracle.svm.shadowed.org.bytedeco.opencv.opencv_ximgproc;
  exports com.oracle.svm.shadowed.org.bytedeco.opencv.opencv_xphoto;

  exports org.opencv.android;
  exports org.opencv.aruco;
  exports org.opencv.bgsegm;
  exports org.opencv.bioinspired;
  exports org.opencv.calib3d;
  exports org.opencv.core;
  exports org.opencv.dnn;
  exports org.opencv.face;
  exports org.opencv.features2d;
  exports org.opencv.highgui;
  exports org.opencv.imgcodecs;
  exports org.opencv.img_hash;
  exports org.opencv.imgproc;
  exports org.opencv.ml;
  exports org.opencv.objdetect;
  exports org.opencv.osgi;
  exports org.opencv.phase_unwrapping;
  exports org.opencv.photo;
  exports org.opencv.plot;
  exports org.opencv.structured_light;
  exports org.opencv.text;
  exports org.opencv.tracking;
  exports org.opencv.utils;
  exports org.opencv.video;
  exports org.opencv.videoio;
  exports org.opencv.xfeatures2d;
  exports org.opencv.ximgproc;
  exports org.opencv.xphoto;
}

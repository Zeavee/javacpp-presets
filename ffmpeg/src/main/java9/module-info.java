module com.oracle.svm.shadowed.org.bytedeco.ffmpeg {
  requires transitive com.oracle.svm.shadowed.org.bytedeco.javacpp;
  exports com.oracle.svm.shadowed.org.bytedeco.ffmpeg;
  exports com.oracle.svm.shadowed.org.bytedeco.ffmpeg.global;
  exports com.oracle.svm.shadowed.org.bytedeco.ffmpeg.presets;
  exports com.oracle.svm.shadowed.org.bytedeco.ffmpeg.avcodec;
  exports com.oracle.svm.shadowed.org.bytedeco.ffmpeg.avdevice;
  exports com.oracle.svm.shadowed.org.bytedeco.ffmpeg.avfilter;
  exports com.oracle.svm.shadowed.org.bytedeco.ffmpeg.avformat;
  exports com.oracle.svm.shadowed.org.bytedeco.ffmpeg.avutil;
  exports com.oracle.svm.shadowed.org.bytedeco.ffmpeg.postproc;
  exports com.oracle.svm.shadowed.org.bytedeco.ffmpeg.swresample;
  exports com.oracle.svm.shadowed.org.bytedeco.ffmpeg.swscale;
}

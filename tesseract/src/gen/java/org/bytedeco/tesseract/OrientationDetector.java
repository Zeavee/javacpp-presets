// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tesseract;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.leptonica.*;
import static org.bytedeco.leptonica.global.lept.*;

import static org.bytedeco.tesseract.global.tesseract.*;


@Namespace("tesseract") @NoOffset @Properties(inherit = org.bytedeco.tesseract.presets.tesseract.class)
public class OrientationDetector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OrientationDetector(Pointer p) { super(p); }

  public OrientationDetector(@StdVector IntPointer allowed_scripts,
                        OSResults results) { super((Pointer)null); allocate(allowed_scripts, results); }
  private native void allocate(@StdVector IntPointer allowed_scripts,
                        OSResults results);
  public OrientationDetector(@StdVector IntBuffer allowed_scripts,
                        OSResults results) { super((Pointer)null); allocate(allowed_scripts, results); }
  private native void allocate(@StdVector IntBuffer allowed_scripts,
                        OSResults results);
  public OrientationDetector(@StdVector int[] allowed_scripts,
                        OSResults results) { super((Pointer)null); allocate(allowed_scripts, results); }
  private native void allocate(@StdVector int[] allowed_scripts,
                        OSResults results);
  public native @Cast("bool") boolean detect_blob(BLOB_CHOICE_LIST scores);
  public native int get_orientation();
}

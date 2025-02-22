// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;



@Namespace("at") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class GlobalRecordFunctionCallbacksEntry extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GlobalRecordFunctionCallbacksEntry(Pointer p) { super(p); }

  public native @ByRef @Cast("at::RecordFunctionCallback*") Pointer callback(); public native GlobalRecordFunctionCallbacksEntry callback(Pointer setter);
  public native @Cast("at::CallbackHandle") long handle(); public native GlobalRecordFunctionCallbacksEntry handle(long setter);

  public GlobalRecordFunctionCallbacksEntry(@Cast("at::RecordFunctionCallback*") @ByRef(true) Pointer cb, @Cast("at::CallbackHandle") long h) { super((Pointer)null); allocate(cb, h); }
  private native void allocate(@Cast("at::RecordFunctionCallback*") @ByRef(true) Pointer cb, @Cast("at::CallbackHandle") long h);

  // Copying is fine despite std::atomic<bool> not being supposed to
  // have a copy/move constructor: adding & removing callbacks is
  // already not thread-safe.
  public GlobalRecordFunctionCallbacksEntry(
        @Const @ByRef GlobalRecordFunctionCallbacksEntry rhs) { super((Pointer)null); allocate(rhs); }
  private native void allocate(
        @Const @ByRef GlobalRecordFunctionCallbacksEntry rhs);

  public native @ByRef @Name("operator =") GlobalRecordFunctionCallbacksEntry put(@Const @ByRef GlobalRecordFunctionCallbacksEntry rhs);

  // Returns true if the status changed, false otherwise.
  public native @Cast("bool") boolean disable();

  // Returns true if the status changed, false otherwise.
  public native @Cast("bool") boolean enable();

  // Read the flag. Note that it is neither necessary nor correct to
  // check this before calling enable() or disable().
  public native @Cast("bool") boolean isEnabled();
}

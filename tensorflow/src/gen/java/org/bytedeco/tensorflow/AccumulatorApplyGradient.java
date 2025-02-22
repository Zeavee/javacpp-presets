// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** \defgroup data_flow_ops Data Flow Ops
 *  \{
 <p>
 *  Applies a gradient to a given accumulator.
 * 
 *  Does not add if local_step is lesser than the accumulator's global_step.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * handle: The handle to a accumulator.
 *  * local_step: The local_step value at which the gradient was computed.
 *  * gradient: A tensor of the gradient to be accumulated.
 * 
 *  Returns:
 *  * the created {@code Operation} */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class AccumulatorApplyGradient extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AccumulatorApplyGradient(Pointer p) { super(p); }

  public AccumulatorApplyGradient(@Const @ByRef Scope scope, @ByVal Input handle, @ByVal Input local_step,
                           @ByVal Input gradient) { super((Pointer)null); allocate(scope, handle, local_step, gradient); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input handle, @ByVal Input local_step,
                           @ByVal Input gradient);
  public native @ByVal @Name("operator tensorflow::Operation") Operation asOperation();

  public native @ByRef Operation operation(); public native AccumulatorApplyGradient operation(Operation setter);
}

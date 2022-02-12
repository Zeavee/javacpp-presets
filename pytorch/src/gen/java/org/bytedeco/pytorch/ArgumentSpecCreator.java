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


// ArgumentSpecCreator takes an initial graph and comes up with a set
// of simple instructions to compute the ArgumentSpec given a set of
// input tensors.
@Namespace("torch::jit") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ArgumentSpecCreator extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ArgumentSpecCreator(Pointer p) { super(p); }

  // instructs acts on a stack of a list of input IValues
  // at the beginning the stack contains a single list of the inputs to the
  // function the ENTER_ instructs descend into subobjects and push new lists
  // onto the stack
  public enum Inst {
    ENTER_TUPLE((byte)(0)), // consume a tuple ivalue from the top-most list, and push the
                 // list of its elements onto the stack as a new list
    ENTER_OBJECT((byte)(1)), // same as ENTER_TUPLE, but the input is a class
    LEAVE((byte)(2)), // pop the top-most list from the stack
    SKIP((byte)(3)), // consume an element from the top-most list, and discard
    SPECIALIZE_OPTIONAL_TENSOR((byte)(4)), // consume a optional tensor for the top-most
                                // list, and add it to the ArgSpec key being
                                // created
    SPECIALIZE_TENSOR((byte)(5)), // consume a tensor for the top-most
                       // list, and add it to the ArgSpec key being created
    SPECIALIZE_OPTIONAL((byte)(6));
    // consume a nontensor optional from the top-most list,
    // and add it to the ArgSpec key being created

      public final byte value;
      private Inst(byte v) { this.value = v; }
      private Inst(Inst e) { this.value = e.value; }
      public Inst intern() { for (Inst e : values()) if (e.value == value) return e; return this; }
      @Override public String toString() { return intern().name(); }
  }
  public ArgumentSpecCreator(@ByRef Graph graph) { super((Pointer)null); allocate(graph); }
  private native void allocate(@ByRef Graph graph);
  public native @ByVal ArgumentSpec create(@Cast("bool") boolean with_grad, @Const @ByRef IValueVector stack);
  public native void specializeTypes(@ByRef Graph g, @Const @ByRef ArgumentSpec spec);
  public native void dump();
}
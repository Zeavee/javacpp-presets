// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package com.oracle.svm.shadowed.org.bytedeco.llvm.LLVM;

import java.nio.*;
import com.oracle.svm.shadowed.org.bytedeco.javacpp.*;
import com.oracle.svm.shadowed.org.bytedeco.javacpp.annotation.*;

import static com.oracle.svm.shadowed.org.bytedeco.llvm.global.LLVM.*;


/** @see llvm::PassRegistry */
@Name("LLVMOpaquePassRegistry") @Opaque @Properties(inherit = com.oracle.svm.shadowed.org.bytedeco.llvm.presets.LLVM.class)
public class LLVMPassRegistryRef extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public LLVMPassRegistryRef() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LLVMPassRegistryRef(Pointer p) { super(p); }
}
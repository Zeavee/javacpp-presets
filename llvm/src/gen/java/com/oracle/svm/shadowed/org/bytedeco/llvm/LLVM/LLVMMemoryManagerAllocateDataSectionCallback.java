// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.LLVM;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.llvm.global.LLVM.*;

@Properties(inherit = org.bytedeco.llvm.presets.LLVM.class)
public class LLVMMemoryManagerAllocateDataSectionCallback extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    LLVMMemoryManagerAllocateDataSectionCallback(Pointer p) { super(p); }
    protected LLVMMemoryManagerAllocateDataSectionCallback() { allocate(); }
    private native void allocate();
    public native @Cast("uint8_t*") BytePointer call(
  Pointer Opaque, @Cast("uintptr_t") long Size, @Cast("unsigned") int Alignment, @Cast("unsigned") int SectionID,
  @Cast("const char*") BytePointer SectionName, @Cast("LLVMBool") int IsReadOnly);
}
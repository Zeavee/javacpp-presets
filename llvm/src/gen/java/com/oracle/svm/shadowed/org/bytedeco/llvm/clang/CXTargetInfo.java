// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package com.oracle.svm.shadowed.org.bytedeco.llvm.clang;

import java.nio.*;
import com.oracle.svm.shadowed.org.bytedeco.javacpp.*;
import com.oracle.svm.shadowed.org.bytedeco.javacpp.annotation.*;

import com.oracle.svm.shadowed.org.bytedeco.llvm.LLVM.*;
import static com.oracle.svm.shadowed.org.bytedeco.llvm.global.LLVM.*;

import static com.oracle.svm.shadowed.org.bytedeco.llvm.global.clang.*;


/**
 * An opaque type representing target information for a given translation
 * unit.
 */
@Name("CXTargetInfoImpl") @Opaque @Properties(inherit = com.oracle.svm.shadowed.org.bytedeco.llvm.presets.clang.class)
public class CXTargetInfo extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CXTargetInfo() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXTargetInfo(Pointer p) { super(p); }
}
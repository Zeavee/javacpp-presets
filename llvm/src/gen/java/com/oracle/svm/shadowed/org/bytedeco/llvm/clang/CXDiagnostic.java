// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package com.oracle.svm.shadowed.org.bytedeco.llvm.clang;

import java.nio.*;
import com.oracle.svm.shadowed.org.bytedeco.javacpp.*;
import com.oracle.svm.shadowed.org.bytedeco.javacpp.annotation.*;

import com.oracle.svm.shadowed.org.bytedeco.llvm.LLVM.*;
import static com.oracle.svm.shadowed.org.bytedeco.llvm.global.LLVM.*;

import static com.oracle.svm.shadowed.org.bytedeco.llvm.global.clang.*;


/**
 * A single diagnostic, containing the diagnostic's severity,
 * location, text, source ranges, and fix-it hints.
 */
@Namespace @Name("void") @Opaque @Properties(inherit = com.oracle.svm.shadowed.org.bytedeco.llvm.presets.clang.class)
public class CXDiagnostic extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CXDiagnostic() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXDiagnostic(Pointer p) { super(p); }
}
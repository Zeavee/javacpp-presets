// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;

@Name("std::vector<onnx::TypeProto*>") @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class TypeProtoVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TypeProtoVector(Pointer p) { super(p); }
    public TypeProtoVector(TypeProto value) { this(1); put(0, value); }
    public TypeProtoVector(TypeProto ... array) { this(array.length); put(array); }
    public TypeProtoVector()       { allocate();  }
    public TypeProtoVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator =") @ByRef TypeProtoVector put(@ByRef TypeProtoVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    @Index(function = "at") public native TypeProto get(@Cast("size_t") long i);
    public native TypeProtoVector put(@Cast("size_t") long i, TypeProto value);

    public native @ByVal Iterator insert(@ByVal Iterator pos, TypeProto value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *") @Const TypeProto get();
    }

    public TypeProto[] get() {
        TypeProto[] array = new TypeProto[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE];
        for (int i = 0; i < array.length; i++) {
            array[i] = get(i);
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.toString(get());
    }

    public TypeProto pop_back() {
        long size = size();
        TypeProto value = get(size - 1);
        resize(size - 1);
        return value;
    }
    public TypeProtoVector push_back(TypeProto value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public TypeProtoVector put(TypeProto value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public TypeProtoVector put(TypeProto ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

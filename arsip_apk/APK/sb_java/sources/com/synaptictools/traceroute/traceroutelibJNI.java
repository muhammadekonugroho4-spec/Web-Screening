package com.synaptictools.traceroute;

/* loaded from: classes2.dex */
public class traceroutelibJNI {
    static {
        System.loadLibrary("traceroute");     // Catch: UnsatisfiedLinkError -> L4
    L6:
        swig_module_init();
        return;
    L4:
        e = move-exception;
        System.err.println("Failed to load native library 'traceroutelib'\n" + e);
        goto L6
    }

    public traceroutelibJNI() {
    }

    public static final native long IntVector_capacity(long r02, IntVector r2);

    public static final native void IntVector_clear(long r02, IntVector r2);

    public static final native void IntVector_doAdd__SWIG_0(long r02, IntVector r2, int r3);

    public static final native void IntVector_doAdd__SWIG_1(long r02, IntVector r2, int r3, int r4);

    public static final native int IntVector_doGet(long r02, IntVector r2, int r3);

    public static final native int IntVector_doRemove(long r02, IntVector r2, int r3);

    public static final native void IntVector_doRemoveRange(long r02, IntVector r2, int r3, int r4);

    public static final native int IntVector_doSet(long r02, IntVector r2, int r3, int r4);

    public static final native int IntVector_doSize(long r02, IntVector r2);

    public static final native boolean IntVector_isEmpty(long r02, IntVector r2);

    public static final native void IntVector_reserve(long r02, IntVector r2, long r3);

    public static final native long StringVector_capacity(long r02, StringVector r2);

    public static final native void StringVector_clear(long r02, StringVector r2);

    public static final native void StringVector_doAdd__SWIG_0(long r02, StringVector r2, String r3);

    public static final native void StringVector_doAdd__SWIG_1(long r02, StringVector r2, int r3, String r4);

    public static final native String StringVector_doGet(long r02, StringVector r2, int r3);

    public static final native String StringVector_doRemove(long r02, StringVector r2, int r3);

    public static final native void StringVector_doRemoveRange(long r02, StringVector r2, int r3, int r4);

    public static final native String StringVector_doSet(long r02, StringVector r2, int r3, String r4);

    public static final native int StringVector_doSize(long r02, StringVector r2);

    public static final native boolean StringVector_isEmpty(long r02, StringVector r2);

    public static final native void StringVector_reserve(long r02, StringVector r2, long r3);

    public static void SwigDirector_TracerouteNative_onAppendResult(TracerouteNative r02, String r1) {
        r02.onAppendResult(r1);
    }

    public static void SwigDirector_TracerouteNative_onClearResult(TracerouteNative r02) {
        r02.onClearResult();
    }

    public static final native void TracerouteNative_change_ownership(TracerouteNative r02, long r1, boolean r3);

    public static final native void TracerouteNative_director_connect(TracerouteNative r02, long r1, boolean r3, boolean r4);

    public static final native int TracerouteNative_execute(long r02, TracerouteNative r2, long r3, StringVector r5);

    public static final native long TracerouteNative_instance();

    public static final native void TracerouteNative_onAppendResult(long r02, TracerouteNative r2, String r3);

    public static final native void TracerouteNative_onAppendResultSwigExplicitTracerouteNative(long r02, TracerouteNative r2, String r3);

    public static final native void TracerouteNative_onClearResult(long r02, TracerouteNative r2);

    public static final native void TracerouteNative_onClearResultSwigExplicitTracerouteNative(long r02, TracerouteNative r2);

    public static final native long VecDouble_capacity(long r02, VecDouble r2);

    public static final native void VecDouble_clear(long r02, VecDouble r2);

    public static final native void VecDouble_doAdd__SWIG_0(long r02, VecDouble r2, double r3);

    public static final native void VecDouble_doAdd__SWIG_1(long r02, VecDouble r2, int r3, double r4);

    public static final native double VecDouble_doGet(long r02, VecDouble r2, int r3);

    public static final native double VecDouble_doRemove(long r02, VecDouble r2, int r3);

    public static final native void VecDouble_doRemoveRange(long r02, VecDouble r2, int r3, int r4);

    public static final native double VecDouble_doSet(long r02, VecDouble r2, int r3, double r4);

    public static final native int VecDouble_doSize(long r02, VecDouble r2);

    public static final native boolean VecDouble_isEmpty(long r02, VecDouble r2);

    public static final native void VecDouble_reserve(long r02, VecDouble r2, long r3);

    public static final native void delete_IntVector(long r02);

    public static final native void delete_StringVector(long r02);

    public static final native void delete_TracerouteNative(long r02);

    public static final native void delete_VecDouble(long r02);

    public static final native long new_IntVector__SWIG_0();

    public static final native long new_IntVector__SWIG_1(long r02, IntVector r2);

    public static final native long new_IntVector__SWIG_2(int r02, int r1);

    public static final native long new_StringVector__SWIG_0();

    public static final native long new_StringVector__SWIG_1(long r02, StringVector r2);

    public static final native long new_StringVector__SWIG_2(int r02, String r1);

    public static final native long new_TracerouteNative();

    public static final native long new_VecDouble__SWIG_0();

    public static final native long new_VecDouble__SWIG_1(long r02, VecDouble r2);

    public static final native long new_VecDouble__SWIG_2(int r02, double r1);

    private static final native void swig_module_init();
}

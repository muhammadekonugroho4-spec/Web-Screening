package com.synaptictools.traceroute;

/* loaded from: classes2.dex */
public class TracerouteNative {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public TracerouteNative(long r1, boolean r3) {
        this.swigCMemOwn = r3;
        this.swigCPtr = r1;
    }

    public static long getCPtr(TracerouteNative r2) {
        if (r2 != null) goto L6;
        return 0;
    L6:
        return r2.swigCPtr;
    }

    public static TracerouteNative instance() {
        return new TracerouteNative(traceroutelibJNI.TracerouteNative_instance(), false);
    }

    public synchronized void delete() {
        monitor-enter(this);
        long r02 = this.swigCPtr;     // Catch: Throwable -> L8
        if (r02 != 0) goto L6;
    L11:
        monitor-exit(this);
        return;
    L6:
        if (this.swigCMemOwn == false) goto L10;
        this.swigCMemOwn = false;     // Catch: Throwable -> L8
        traceroutelibJNI.delete_TracerouteNative(r02);     // Catch: Throwable -> L8
    L10:
        this.swigCPtr = 0;     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        throw th;
    }

    public int execute(StringVector r7) {
        return traceroutelibJNI.TracerouteNative_execute(this.swigCPtr, this, StringVector.getCPtr(r7), r7);
    }

    public void finalize() {
        delete();
    }

    public void onAppendResult(String r3) {
        if (getClass() != TracerouteNative.class) goto L6;
        traceroutelibJNI.TracerouteNative_onAppendResult(this.swigCPtr, this, r3);
        return;
    L6:
        traceroutelibJNI.TracerouteNative_onAppendResultSwigExplicitTracerouteNative(this.swigCPtr, this, r3);
    }

    public void onClearResult() {
        if (getClass() != TracerouteNative.class) goto L6;
        traceroutelibJNI.TracerouteNative_onClearResult(this.swigCPtr, this);
        return;
    L6:
        traceroutelibJNI.TracerouteNative_onClearResultSwigExplicitTracerouteNative(this.swigCPtr, this);
    }

    public void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        traceroutelibJNI.TracerouteNative_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        traceroutelibJNI.TracerouteNative_change_ownership(this, this.swigCPtr, true);
    }

    public TracerouteNative() {
        this(traceroutelibJNI.new_TracerouteNative(), true);
        traceroutelibJNI.TracerouteNative_director_connect(this, this.swigCPtr, true, true);
    }
}

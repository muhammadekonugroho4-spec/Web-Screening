package com.google.android.gms.internal.time;

/* loaded from: classes5.dex */
public final class zzdl extends Exception {
    public zzdl(Throwable r1, zzeb r2, StackTraceElement[] r3) {
        super(r2.toString(), r1);
        setStackTrace(r3);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}

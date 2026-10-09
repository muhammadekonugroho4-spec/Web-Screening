package androidx.camera.core.impl;

import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.camera.core.impl.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2253c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f5375a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f5376b = null;

    static {
        f5375a = new Object();
        f5376b = new HashMap();
    }

    public static InterfaceC2289v a(Object r2) {
        Object r02 = f5375a;
        monitor-enter(r02);
        InterfaceC2289v r22 = (InterfaceC2289v) f5376b.get(r2);     // Catch: Throwable -> L9
        monitor-exit(r02);     // Catch: Throwable -> L9
        if (r22 == null) goto L8;
        return r22;
    L8:
        return InterfaceC2289v.f5632a;
    L9:
        th = move-exception;
        throw th;
    }
}

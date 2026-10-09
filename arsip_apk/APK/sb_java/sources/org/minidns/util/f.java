package org.minidns.util;

/* loaded from: classes3.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static Boolean f182903a;

    public static boolean a() {
        if (f182903a != null) goto L8;
        Class.forName("android.Manifest");     // Catch: Exception -> L6
        f182903a = Boolean.TRUE;     // Catch: Exception -> L6
    L6:
        f182903a = Boolean.FALSE;
    L8:
        return f182903a.booleanValue();
    }
}

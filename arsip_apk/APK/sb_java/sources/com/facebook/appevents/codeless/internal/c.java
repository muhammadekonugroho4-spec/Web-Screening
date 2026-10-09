package com.facebook.appevents.codeless.internal;

import android.util.Log;
import java.lang.reflect.Method;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f35876a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final String f35877b = null;

    /* renamed from: c, reason: collision with root package name */
    public static Class f35878c;

    static {
        f35876a = new c();
        f35877b = c.class.getCanonicalName();
    }

    public c() {
    }

    public static final void a() {
        d("UnityFacebookSDKPlugin", "CaptureViewHierarchy", "");
    }

    public static final void c(String r2) {
        d("UnityFacebookSDKPlugin", "OnReceiveMapping", r2);
    }

    public static final void d(String r5, String r6, String r7) {
    L16:
        e = move-exception;
        Log.e(f35877b, "Failed to send message to Unity", e);
        return;
    L4:
        if (f35878c != null) goto L6;
        f35878c = f35876a.b();     // Catch: Exception -> L16
    L6:
        Class r1 = f35878c;     // Catch: Exception -> L16
        Class r2 = null;
        if (r1 != null) goto L10;
        p.D("unityPlayer");     // Catch: Exception -> L16
        r1 = null;
    L10:
        Method r02 = r1.getMethod("UnitySendMessage", new Class[]{String.class, String.class, String.class});     // Catch: Exception -> L16
        Class r12 = f35878c;     // Catch: Exception -> L16
        if (r12 != null) goto L13;
        p.D("unityPlayer");     // Catch: Exception -> L16
    L14:
        r02.invoke(r2, new Object[]{r5, r6, r7});     // Catch: Exception -> L16
        return;
    L13:
        r2 = r12;
        goto L14
    }

    public final Class b() {
        Class<?> r02 = Class.forName("com.unity3d.player.UnityPlayer");
        p.k(r02, "forName(UNITY_PLAYER_CLASS)");
        return r02;
    }
}

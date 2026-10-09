package io.sentry.util;

/* loaded from: classes3.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f176894a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f176895b;

    static {
        f176894a = "The Android Project".equals(System.getProperty("java.vendor"));     // Catch: Throwable -> L5
    L19:
        String r1 = System.getProperty("java.specification.version");     // Catch: Throwable -> L15
        if (r1 != null) goto L9;
        f176895b = false;     // Catch: Throwable -> L15
        return;
    L9:
        if (Double.valueOf(r1).doubleValue() < 9.0d) goto L11;
        boolean r12 = true;
    L12:
        f176895b = r12;     // Catch: Throwable -> L15
        return;
    L11:
        r12 = false;
    L15:
        f176895b = false;
        return;
    L5:
        f176894a = false;
        goto L19
    }

    public static boolean a() {
        return f176894a;
    }

    public static boolean b() {
        return f176895b;
    }

    public static boolean c() {
        return !f176894a;
    }
}

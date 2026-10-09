package com.huawei.hms.hatool;

/* loaded from: classes6.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    private static a0 f39445a;

    static {
        f39445a = new a0();
    }

    public static void a(int r1) {
        f39445a.a(r1);
    }

    public static void b(String r2, String r3) {
        if (b() == false) goto L8;
        if (r2 == null) goto L9;
        if (r3 == null) goto L10;
        f39445a.b(6, r2, r3);
        return;
    L10:
        return;
    L9:
        return;
    }

    public static void c(String r2, String r3) {
        if (c() == false) goto L8;
        if (r2 == null) goto L9;
        if (r3 == null) goto L10;
        f39445a.b(4, r2, r3);
        return;
    L10:
        return;
    L9:
        return;
    }

    public static void d(String r2, String r3) {
        if (r2 == null) goto L6;
        if (r3 == null) goto L7;
        f39445a.b(4, r2, r3);
        return;
    L7:
        return;
    }

    public static void e(String r2, String r3) {
        if (r2 == null) goto L6;
        if (r3 == null) goto L7;
        f39445a.b(5, r2, r3);
        return;
    L7:
        return;
    }

    public static void f(String r2, String r3) {
        if (d() == false) goto L8;
        if (r2 == null) goto L9;
        if (r3 == null) goto L10;
        f39445a.b(5, r2, r3);
        return;
    L10:
        return;
    L9:
        return;
    }

    public static void a(String r2, String r3) {
        if (a() == false) goto L8;
        if (r2 == null) goto L9;
        if (r3 == null) goto L10;
        f39445a.b(3, r2, r3);
        return;
    L10:
        return;
    L9:
        return;
    }

    public static void b(String r02, String r1, Object... r2) {
        d(r02, String.format(r1, r2));
    }

    private static boolean c() {
        return f39445a.b(4);
    }

    private static boolean d() {
        return f39445a.b(5);
    }

    public static void a(String r1, String r2, Object... r3) {
        if (c() == false) goto L8;
        if (r1 == null) goto L9;
        if (r2 == null) goto L10;
        String r22 = String.format(r2, r3);
        f39445a.b(4, r1, r22);
        return;
    L10:
        return;
    L9:
        return;
    }

    private static boolean b() {
        return f39445a.b(6);
    }

    private static boolean a() {
        return f39445a.b(3);
    }
}

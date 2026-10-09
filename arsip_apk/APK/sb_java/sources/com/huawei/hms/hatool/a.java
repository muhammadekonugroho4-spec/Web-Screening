package com.huawei.hms.hatool;

/* loaded from: classes6.dex */
public abstract class a {
    public static String a(String r02, String r1) {
        j r03 = c(r02, r1);
        if (r03 != null) goto L5;
        return "";
    L5:
        return r03.a();
    }

    public static boolean b(String r02, String r1) {
        j r03 = c(r02, r1);
        if (r03 != null) goto L5;
        return false;
    L5:
        if (r03.e() == false) goto L10;
        return true;
    L10:
        return false;
    }

    private static j c(String r1, String r2) {
        m r12 = i.c().a(r1);
        if (r12 == null) goto L8;
        k r13 = r12.a(r2);
        if (r13 != null) goto L7;
        return null;
    L7:
        return r13.j();
    L8:
        return null;
    }

    public static String d(String r02, String r1) {
        j r03 = c(r02, r1);
        if (r03 != null) goto L5;
        return "";
    L5:
        return r03.b();
    }

    public static boolean e(String r02, String r1) {
        j r03 = c(r02, r1);
        if (r03 != null) goto L5;
        return false;
    L5:
        if (r03.f() == false) goto L10;
        return true;
    L10:
        return false;
    }

    public static boolean f(String r1, String r2) {
        m r12 = i.c().a(r1);
        if (r12 == null) goto L8;
        k r13 = r12.a(r2);
        if (r13 != null) goto L7;
        return false;
    L7:
        return r13.c();
    L8:
        return false;
    }

    public static String g(String r02, String r1) {
        j r03 = c(r02, r1);
        if (r03 != null) goto L5;
        return "";
    L5:
        return r03.d();
    }

    public static boolean h(String r02, String r1) {
        j r03 = c(r02, r1);
        if (r03 != null) goto L5;
        return false;
    L5:
        if (r03.g() == false) goto L10;
        return true;
    L10:
        return false;
    }

    public static boolean i(String r1, String r2) {
        m r12 = i.c().a(r1);
        if (r12 == null) goto L8;
        k r13 = r12.a(r2);
        if (r13 != null) goto L7;
        return false;
    L7:
        return r13.e();
    L8:
        return false;
    }

    public static String j(String r02, String r1) {
        j r03 = c(r02, r1);
        if (r03 != null) goto L5;
        return "";
    L5:
        return r03.c();
    }

    public static boolean k(String r02, String r1) {
        j r03 = c(r02, r1);
        if (r03 != null) goto L5;
        return false;
    L5:
        if (r03.h() == false) goto L10;
        return true;
    L10:
        return false;
    }
}

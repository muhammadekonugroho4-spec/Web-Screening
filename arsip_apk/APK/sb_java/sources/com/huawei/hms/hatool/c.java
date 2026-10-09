package com.huawei.hms.hatool;

import java.util.Map;

/* loaded from: classes6.dex */
public abstract class c {
    public static void a(String r02, String r1, long r2) {
        k r03 = h(r02, r1);
        if (r03 == null) goto L6;
        r03.a(r2);
        return;
    }

    public static int b(String r02, String r1) {
        k r03 = h(r02, r1);
        if (r03 != null) goto L5;
        return 7;
    L5:
        return r03.d();
    }

    public static boolean c(String r02, String r1) {
        k r03 = h(r02, r1);
        if (r03 != null) goto L5;
        return true;
    L5:
        return r03.g();
    }

    public static String d(String r02, String r1) {
        k r03 = h(r02, r1);
        if (r03 != null) goto L5;
        return "";
    L5:
        return r03.f();
    }

    public static boolean e(String r02, String r1) {
        k r03 = h(r02, r1);
        if (r03 != null) goto L5;
        return false;
    L5:
        return r03.i();
    }

    public static String f(String r02, String r1) {
        k r03 = h(r02, r1);
        if (r03 != null) goto L5;
        return "";
    L5:
        return r03.h();
    }

    public static String g(String r02, String r1) {
        k r03 = h(r02, r1);
        if (r03 != null) goto L5;
        return "";
    L5:
        return r03.n();
    }

    private static k h(String r1, String r2) {
        m r12 = i.c().a(r1);
        if (r12 != null) goto L5;
        return null;
    L5:
        if ("alltype".equals(r2) == false) goto L12;
        k r22 = r12.a("oper");
        if (r22 == null) goto L9;
        return r22;
    L9:
        return r12.a("maint");
    L12:
        return r12.a(r2);
    }

    public static Map<String, String> i(String r02, String r1) {
        k r03 = h(r02, r1);
        if (r03 != null) goto L5;
        return null;
    L5:
        return r03.k();
    }

    public static long j(String r02, String r1) {
        k r03 = h(r02, r1);
        if (r03 != null) goto L5;
        return 0;
    L5:
        return r03.l();
    }

    public static int k(String r02, String r1) {
        k r03 = h(r02, r1);
        if (r03 != null) goto L5;
        return 10;
    L5:
        return r03.b();
    }

    public static String l(String r02, String r1) {
        k r03 = h(r02, r1);
        if (r03 != null) goto L5;
        return "";
    L5:
        return r03.o();
    }

    public static String m(String r02, String r1) {
        k r03 = h(r02, r1);
        if (r03 != null) goto L5;
        return "";
    L5:
        return r03.q();
    }

    public static String n(String r02, String r1) {
        k r03 = h(r02, r1);
        if (r03 != null) goto L5;
        return "";
    L5:
        return r03.m();
    }

    public static String o(String r02, String r1) {
        k r03 = h(r02, r1);
        if (r03 != null) goto L5;
        return "";
    L5:
        return r03.p();
    }

    public static boolean a(String r02, String r1) {
        k r03 = h(r02, r1);
        if (r03 != null) goto L5;
        return true;
    L5:
        return r03.a();
    }
}

package com.stockbit.usecase.verification.helper;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f164435a = null;

    /* renamed from: b, reason: collision with root package name */
    public static String f164436b;

    /* renamed from: c, reason: collision with root package name */
    public static String f164437c;
    public static Boolean d;

    static {
        f164435a = new a();
    }

    public a() {
    }

    public final String a() {
        String r02 = f164437c;
        if (r02 != null) goto L6;
        return "UNSPECIFIED";
    L6:
        return r02;
    }

    public final String b() {
        String r02 = f164436b;
        if (r02 != null) goto L6;
        return "";
    L6:
        return r02;
    }

    public final boolean c() {
        Boolean r02 = d;
        if (r02 != null) goto L5;
        return false;
    L5:
        return r02.booleanValue();
    }

    public final void d() {
        f164436b = null;
        f164437c = null;
        d = null;
    }

    public final void e(String r2, String r3, boolean r4) {
        p.l(r2, "verificationToken");
        p.l(r3, "purpose");
        f164436b = r2;
        f164437c = r3;
        d = Boolean.valueOf(r4);
    }
}

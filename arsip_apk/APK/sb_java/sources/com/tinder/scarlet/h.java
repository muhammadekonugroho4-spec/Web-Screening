package com.tinder.scarlet;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public static final int f173669c = 0;
    public static final String d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final h f173670e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final a f173671f = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f173672a;

    /* renamed from: b, reason: collision with root package name */
    public final String f173673b;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }
    }

    static {
        f173671f = new a(null);
        f173669c = 1000;
        d = "Normal closure";
        f173670e = new h(1000, "Normal closure");
    }

    public h(int r2, String r3) {
        p.l(r3, "reason");
        this.f173672a = r2;
        this.f173673b = r3;
    }

    public final int a() {
        return this.f173672a;
    }

    public final String b() {
        return this.f173673b;
    }

    public final int c() {
        return this.f173672a;
    }

    public final String d() {
        return this.f173673b;
    }

    public boolean equals(Object r3) {
        if (this != r3) goto L4;
        return true;
    L4:
        if ((r3 instanceof h) == false) goto L10;
        h r32 = (h) r3;
        if (this.f173672a == r32.f173672a) goto L8;
        return false;
    L8:
        if (p.g(this.f173673b, r32.f173673b) == true) goto L16;
        return false;
    L16:
        return true;
    L10:
        return false;
    }

    public int hashCode() {
        int r02 = Integer.hashCode(this.f173672a) * 31;
        String r1 = this.f173673b;
        if (r1 == null) goto L5;
        int r12 = r1.hashCode();
    L7:
        return r02 + r12;
    L5:
        r12 = 0;
        goto L7
    }

    public String toString() {
        return "ShutdownReason(code=" + this.f173672a + ", reason=" + this.f173673b + ")";
    }
}

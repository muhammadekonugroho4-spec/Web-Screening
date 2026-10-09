package com.stockbit.feature.transaction.ui.composecomponent.component;

/* renamed from: com.stockbit.feature.transaction.ui.composecomponent.component.p0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C8577p0 {

    /* renamed from: e, reason: collision with root package name */
    public static final a f112482e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final C8577p0 f112483f = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f112484a;

    /* renamed from: b, reason: collision with root package name */
    public final String f112485b;

    /* renamed from: c, reason: collision with root package name */
    public final String f112486c;
    public final String d;

    /* renamed from: com.stockbit.feature.transaction.ui.composecomponent.component.p0$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final C8577p0 a() {
            return C8577p0.a();
        }

        public a() {
        }
    }

    static {
        f112482e = new a(null);
        String r3 = null;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        f112483f = new C8577p0(r3, r4, r5, r6, 15, null);
    }

    public C8577p0(String r2, String r3, String r4, String r5) {
        kotlin.jvm.internal.p.l(r2, "dropdownTagId");
        kotlin.jvm.internal.p.l(r3, "gfdTagId");
        kotlin.jvm.internal.p.l(r4, "gtcTagId");
        kotlin.jvm.internal.p.l(r5, "readOnlyBoxTagId");
        this.f112484a = r2;
        this.f112485b = r3;
        this.f112486c = r4;
        this.d = r5;
    }

    public static final /* synthetic */ C8577p0 a() {
        return f112483f;
    }

    public final String b() {
        return this.f112484a;
    }

    public final String c() {
        return this.f112485b;
    }

    public final String d() {
        return this.f112486c;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C8577p0) == true) goto L8;
        return false;
    L8:
        C8577p0 r52 = (C8577p0) r5;
        if (kotlin.jvm.internal.p.g(this.f112484a, r52.f112484a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f112485b, r52.f112485b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f112486c, r52.f112486c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f112484a.hashCode() * 31) + this.f112485b.hashCode()) * 31) + this.f112486c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "ExpiryRowIdentifier(dropdownTagId=" + this.f112484a + ", gfdTagId=" + this.f112485b + ", gtcTagId=" + this.f112486c + ", readOnlyBoxTagId=" + this.d + ')';
    }

    public /* synthetic */ C8577p0(String r2, String r3, String r4, String r5, int r6, kotlin.jvm.internal.i r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = "";
    L14:
        this(r2, r3, r4, r5);
    }
}

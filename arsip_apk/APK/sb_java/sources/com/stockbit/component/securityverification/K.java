package com.stockbit.component.securityverification;

/* loaded from: classes8.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public final String f76821a;

    /* renamed from: b, reason: collision with root package name */
    public final String f76822b;

    /* renamed from: c, reason: collision with root package name */
    public final String f76823c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f76824e;

    /* renamed from: f, reason: collision with root package name */
    public final String f76825f;

    static {
    }

    public K(String r2, String r3, String r4, String r5, boolean r6, String r7) {
        kotlin.jvm.internal.p.l(r2, "host");
        kotlin.jvm.internal.p.l(r3, "code");
        kotlin.jvm.internal.p.l(r4, "source");
        kotlin.jvm.internal.p.l(r5, "webViewVersion");
        kotlin.jvm.internal.p.l(r7, "message");
        this.f76821a = r2;
        this.f76822b = r3;
        this.f76823c = r4;
        this.d = r5;
        this.f76824e = r6;
        this.f76825f = r7;
    }

    public final String a() {
        return this.f76822b;
    }

    public final String b() {
        return this.f76821a;
    }

    public final String c() {
        return this.f76825f;
    }

    public final String d() {
        return this.f76823c;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof K) == true) goto L8;
        return false;
    L8:
        K r52 = (K) r5;
        if (kotlin.jvm.internal.p.g(this.f76821a, r52.f76821a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f76822b, r52.f76822b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f76823c, r52.f76823c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f76824e == r52.f76824e) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f76825f, r52.f76825f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final boolean f() {
        return this.f76824e;
    }

    public int hashCode() {
        return (((((((((this.f76821a.hashCode() * 31) + this.f76822b.hashCode()) * 31) + this.f76823c.hashCode()) * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.f76824e)) * 31) + this.f76825f.hashCode();
    }

    public String toString() {
        return "TurnstileLoadError(host=" + this.f76821a + ", code=" + this.f76822b + ", source=" + this.f76823c + ", webViewVersion=" + this.d + ", isOutdatedWebView=" + this.f76824e + ", message=" + this.f76825f + ')';
    }

    public /* synthetic */ K(String r8, String r9, String r10, String r11, boolean r12, String r13, int r14, kotlin.jvm.internal.i r15) {
        if ((r14 & 32) == 0) goto L5;
        r13 = "";
    L5:
        this(r8, r9, r10, r11, r12, r13);
    }
}

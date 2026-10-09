package com.stockbit.usecase.facerecognition.model;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f157729a;

    /* renamed from: b, reason: collision with root package name */
    public final String f157730b;

    /* renamed from: c, reason: collision with root package name */
    public final String f157731c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f157732e;

    public b(String r2, String r3, String r4, String r5, String r6) {
        p.l(r2, "userId");
        p.l(r3, "username");
        p.l(r4, "correlationId");
        p.l(r5, "userToken");
        p.l(r6, "baseUrl");
        this.f157729a = r2;
        this.f157730b = r3;
        this.f157731c = r4;
        this.d = r5;
        this.f157732e = r6;
    }

    public final String a() {
        return this.f157732e;
    }

    public final String b() {
        return this.f157731c;
    }

    public final String c() {
        return this.f157729a;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.f157730b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f157729a, r52.f157729a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f157730b, r52.f157730b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f157731c, r52.f157731c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f157732e, r52.f157732e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f157729a.hashCode() * 31) + this.f157730b.hashCode()) * 31) + this.f157731c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f157732e.hashCode();
    }

    public String toString() {
        return "FaceRecognitionSessionUIState(userId=" + this.f157729a + ", username=" + this.f157730b + ", correlationId=" + this.f157731c + ", userToken=" + this.d + ", baseUrl=" + this.f157732e + ')';
    }
}

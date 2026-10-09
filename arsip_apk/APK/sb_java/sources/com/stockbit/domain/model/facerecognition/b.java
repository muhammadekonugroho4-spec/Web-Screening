package com.stockbit.domain.model.facerecognition;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f83996a;

    /* renamed from: b, reason: collision with root package name */
    public final String f83997b;

    /* renamed from: c, reason: collision with root package name */
    public final String f83998c;

    public b(String r2, String r3, String r4) {
        p.l(r2, "correlationId");
        p.l(r3, "userToken");
        p.l(r4, "baseUrl");
        this.f83996a = r2;
        this.f83997b = r3;
        this.f83998c = r4;
    }

    public final String a() {
        return this.f83998c;
    }

    public final String b() {
        return this.f83996a;
    }

    public final String c() {
        return this.f83997b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f83996a, r52.f83996a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f83997b, r52.f83997b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f83998c, r52.f83998c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f83996a.hashCode() * 31) + this.f83997b.hashCode()) * 31) + this.f83998c.hashCode();
    }

    public String toString() {
        return "FaceRecognitionSessionEntity(correlationId=" + this.f83996a + ", userToken=" + this.f83997b + ", baseUrl=" + this.f83998c + ")";
    }
}

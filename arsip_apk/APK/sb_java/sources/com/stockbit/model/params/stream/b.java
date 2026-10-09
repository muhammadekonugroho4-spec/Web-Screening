package com.stockbit.model.params.stream;

import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f122135a;

    /* renamed from: b, reason: collision with root package name */
    public final String f122136b;

    /* renamed from: c, reason: collision with root package name */
    public final String f122137c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f122138e;

    /* renamed from: f, reason: collision with root package name */
    public final int f122139f;

    public b(String r2, String r3, String r4, String r5, String r6, int r7) {
        p.l(r2, "postId");
        p.l(r3, "content");
        this.f122135a = r2;
        this.f122136b = r3;
        this.f122137c = r4;
        this.d = r5;
        this.f122138e = r6;
        this.f122139f = r7;
    }

    public final String a() {
        return this.f122136b;
    }

    public final String b() {
        return this.f122138e;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f122135a;
    }

    public final String e() {
        return this.f122137c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f122135a, r52.f122135a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f122136b, r52.f122136b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f122137c, r52.f122137c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f122138e, r52.f122138e) == true) goto L24;
        return false;
    L24:
        if (this.f122139f == r52.f122139f) goto L26;
        return false;
    L26:
        return true;
    }

    public int hashCode() {
        int r02 = ((this.f122135a.hashCode() * 31) + this.f122136b.hashCode()) * 31;
        String r1 = this.f122137c;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.d;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (r03 + r14) * 31;
        String r15 = this.f122138e;
        if (r15 == null) goto L15;
        r2 = r15.hashCode();
    L15:
        return ((r04 + r2) * 31) + Integer.hashCode(this.f122139f);
    L9:
        r14 = r13.hashCode();
        goto L10
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "CreateReplyRequest(postId=" + this.f122135a + ", content=" + this.f122136b + ", replyTo=" + this.f122137c + ", imageUrl=" + this.d + ", fileUrl=" + this.f122138e + ", position=" + this.f122139f + ')';
    }
}

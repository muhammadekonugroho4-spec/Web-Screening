package com.stockbit.domain.model.param.stream;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f84596a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84597b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84598c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f84599e;

    /* renamed from: f, reason: collision with root package name */
    public final int f84600f;

    public c(String r2, String r3, String r4, String r5, String r6, int r7) {
        p.l(r2, "postId");
        p.l(r3, "content");
        this.f84596a = r2;
        this.f84597b = r3;
        this.f84598c = r4;
        this.d = r5;
        this.f84599e = r6;
        this.f84600f = r7;
    }

    public final int a() {
        return this.f84600f;
    }

    public final com.stockbit.model.params.stream.b b() {
        return new com.stockbit.model.params.stream.b(this.f84596a, this.f84597b, this.f84598c, this.d, this.f84599e, this.f84600f);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f84596a, r52.f84596a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f84597b, r52.f84597b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f84598c, r52.f84598c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f84599e, r52.f84599e) == true) goto L24;
        return false;
    L24:
        if (this.f84600f == r52.f84600f) goto L26;
        return false;
    L26:
        return true;
    }

    public int hashCode() {
        int r02 = ((this.f84596a.hashCode() * 31) + this.f84597b.hashCode()) * 31;
        String r1 = this.f84598c;
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
        String r15 = this.f84599e;
        if (r15 == null) goto L15;
        r2 = r15.hashCode();
    L15:
        return ((r04 + r2) * 31) + Integer.hashCode(this.f84600f);
    L9:
        r14 = r13.hashCode();
        goto L10
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "CreateReplyParam(postId=" + this.f84596a + ", content=" + this.f84597b + ", replyTo=" + this.f84598c + ", imageUrl=" + this.d + ", fileUrl=" + this.f84599e + ", position=" + this.f84600f + ')';
    }
}

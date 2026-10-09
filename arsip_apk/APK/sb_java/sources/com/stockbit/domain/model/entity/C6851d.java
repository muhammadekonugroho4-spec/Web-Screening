package com.stockbit.domain.model.entity;

import com.clevertap.android.sdk.Constants;

/* renamed from: com.stockbit.domain.model.entity.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6851d {

    /* renamed from: a, reason: collision with root package name */
    public final String f82704a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82705b;

    /* renamed from: c, reason: collision with root package name */
    public final String f82706c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f82707e;

    /* renamed from: f, reason: collision with root package name */
    public final String f82708f;

    public C6851d(String r2, String r3, String r4, String r5, String r6, String r7) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_KEY);
        kotlin.jvm.internal.p.l(r3, "awsAccessKeyId");
        kotlin.jvm.internal.p.l(r4, "successActionRedirect");
        kotlin.jvm.internal.p.l(r5, "policy");
        kotlin.jvm.internal.p.l(r6, "signature");
        kotlin.jvm.internal.p.l(r7, "contentType");
        this.f82704a = r2;
        this.f82705b = r3;
        this.f82706c = r4;
        this.d = r5;
        this.f82707e = r6;
        this.f82708f = r7;
    }

    public final String a() {
        return this.f82705b;
    }

    public final String b() {
        return this.f82708f;
    }

    public final String c() {
        return this.f82704a;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.f82707e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C6851d) == true) goto L8;
        return false;
    L8:
        C6851d r52 = (C6851d) r5;
        if (kotlin.jvm.internal.p.g(this.f82704a, r52.f82704a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f82705b, r52.f82705b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f82706c, r52.f82706c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f82707e, r52.f82707e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f82708f, r52.f82708f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final String f() {
        return this.f82706c;
    }

    public int hashCode() {
        return (((((((((this.f82704a.hashCode() * 31) + this.f82705b.hashCode()) * 31) + this.f82706c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f82707e.hashCode()) * 31) + this.f82708f.hashCode();
    }

    public String toString() {
        return "AwsTokenLegacy(key=" + this.f82704a + ", awsAccessKeyId=" + this.f82705b + ", successActionRedirect=" + this.f82706c + ", policy=" + this.d + ", signature=" + this.f82707e + ", contentType=" + this.f82708f + ')';
    }
}

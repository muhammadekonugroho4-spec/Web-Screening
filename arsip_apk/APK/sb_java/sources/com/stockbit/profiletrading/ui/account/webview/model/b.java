package com.stockbit.profiletrading.ui.account.webview.model;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f128525a;

    /* renamed from: b, reason: collision with root package name */
    public final String f128526b;

    /* renamed from: c, reason: collision with root package name */
    public final String f128527c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f128528e;

    static {
    }

    public b(String r2, String r3, String r4, String r5, String r6) {
        p.l(r2, "fn");
        p.l(r3, Constants.KEY_KEY);
        p.l(r4, "errorMessage");
        p.l(r5, "fileUrl");
        p.l(r6, "viewUrl");
        this.f128525a = r2;
        this.f128526b = r3;
        this.f128527c = r4;
        this.d = r5;
        this.f128528e = r6;
    }

    public final String a() {
        return this.f128527c;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f128525a;
    }

    public final String d() {
        return this.f128526b;
    }

    public final String e() {
        return this.f128528e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f128525a, r52.f128525a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f128526b, r52.f128526b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f128527c, r52.f128527c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f128528e, r52.f128528e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f128525a.hashCode() * 31) + this.f128526b.hashCode()) * 31) + this.f128527c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f128528e.hashCode();
    }

    public String toString() {
        return "PostMessageUploadDocument(fn=" + this.f128525a + ", key=" + this.f128526b + ", errorMessage=" + this.f128527c + ", fileUrl=" + this.d + ", viewUrl=" + this.f128528e + ')';
    }
}

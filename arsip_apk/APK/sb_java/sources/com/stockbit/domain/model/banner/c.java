package com.stockbit.domain.model.banner;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f80703a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80704b;

    /* renamed from: c, reason: collision with root package name */
    public final String f80705c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f80706e;

    /* renamed from: f, reason: collision with root package name */
    public final String f80707f;

    public c(String r2, String r3, String r4, String r5, String r6, String r7) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, "heading");
        p.l(r4, "body");
        p.l(r5, "iconLight");
        p.l(r6, "iconDark");
        p.l(r7, "viewType");
        this.f80703a = r2;
        this.f80704b = r3;
        this.f80705c = r4;
        this.d = r5;
        this.f80706e = r6;
        this.f80707f = r7;
    }

    public final String a() {
        return this.f80705c;
    }

    public final String b() {
        return this.f80704b;
    }

    public final String c() {
        return this.f80706e;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.f80703a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f80703a, r52.f80703a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f80704b, r52.f80704b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f80705c, r52.f80705c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f80706e, r52.f80706e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f80707f, r52.f80707f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final String f() {
        return this.f80707f;
    }

    public int hashCode() {
        return (((((((((this.f80703a.hashCode() * 31) + this.f80704b.hashCode()) * 31) + this.f80705c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f80706e.hashCode()) * 31) + this.f80707f.hashCode();
    }

    public String toString() {
        return "BannerInAppEntity(id=" + this.f80703a + ", heading=" + this.f80704b + ", body=" + this.f80705c + ", iconLight=" + this.d + ", iconDark=" + this.f80706e + ", viewType=" + this.f80707f + ")";
    }
}

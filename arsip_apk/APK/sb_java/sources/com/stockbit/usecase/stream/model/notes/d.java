package com.stockbit.usecase.stream.model.notes;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f163061a;

    /* renamed from: b, reason: collision with root package name */
    public final b f163062b;

    /* renamed from: c, reason: collision with root package name */
    public final List f163063c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public final String f163064e;

    /* renamed from: f, reason: collision with root package name */
    public final String f163065f;

    /* renamed from: g, reason: collision with root package name */
    public final String f163066g;

    /* renamed from: h, reason: collision with root package name */
    public final String f163067h;

    public d(int r2, b r3, List r4, List r5, String r6, String r7, String r8, String r9) {
        p.l(r3, "content");
        p.l(r4, "files");
        p.l(r5, "images");
        p.l(r6, "updatedAt");
        p.l(r7, "companyIconUrl");
        p.l(r8, "companyName");
        p.l(r9, "companySymbol");
        this.f163061a = r2;
        this.f163062b = r3;
        this.f163063c = r4;
        this.d = r5;
        this.f163064e = r6;
        this.f163065f = r7;
        this.f163066g = r8;
        this.f163067h = r9;
    }

    public final String a() {
        return this.f163065f;
    }

    public final String b() {
        return this.f163066g;
    }

    public final String c() {
        return this.f163067h;
    }

    public final b d() {
        return this.f163062b;
    }

    public final List e() {
        return this.f163063c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (this.f163061a == r52.f163061a) goto L12;
        return false;
    L12:
        if (p.g(this.f163062b, r52.f163062b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f163063c, r52.f163063c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f163064e, r52.f163064e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f163065f, r52.f163065f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f163066g, r52.f163066g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f163067h, r52.f163067h) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final int f() {
        return this.f163061a;
    }

    public final List g() {
        return this.d;
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.f163061a) * 31) + this.f163062b.hashCode()) * 31) + this.f163063c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f163064e.hashCode()) * 31) + this.f163065f.hashCode()) * 31) + this.f163066g.hashCode()) * 31) + this.f163067h.hashCode();
    }

    public String toString() {
        return "NoteUIState(id=" + this.f163061a + ", content=" + this.f163062b + ", files=" + this.f163063c + ", images=" + this.d + ", updatedAt=" + this.f163064e + ", companyIconUrl=" + this.f163065f + ", companyName=" + this.f163066g + ", companySymbol=" + this.f163067h + ")";
    }
}

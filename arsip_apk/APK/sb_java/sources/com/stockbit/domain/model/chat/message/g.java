package com.stockbit.domain.model.chat.message;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f81302a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81303b;

    /* renamed from: c, reason: collision with root package name */
    public final int f81304c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final String f81305e;

    /* renamed from: f, reason: collision with root package name */
    public final String f81306f;

    /* renamed from: g, reason: collision with root package name */
    public final int f81307g;

    /* renamed from: h, reason: collision with root package name */
    public final int f81308h;

    /* renamed from: i, reason: collision with root package name */
    public final String f81309i;

    /* renamed from: j, reason: collision with root package name */
    public final String f81310j;

    public g(String r2, String r3, int r4, int r5, String r6, String r7, int r8, int r9, String r10, String r11) {
        p.l(r2, "authorName");
        p.l(r3, "authorUrl");
        p.l(r6, "providerName");
        p.l(r7, "providerUrl");
        p.l(r10, "thumbnailUrl");
        p.l(r11, Constants.KEY_TITLE);
        this.f81302a = r2;
        this.f81303b = r3;
        this.f81304c = r4;
        this.d = r5;
        this.f81305e = r6;
        this.f81306f = r7;
        this.f81307g = r8;
        this.f81308h = r9;
        this.f81309i = r10;
        this.f81310j = r11;
    }

    public final String a() {
        return this.f81302a;
    }

    public final String b() {
        return this.f81303b;
    }

    public final int c() {
        return this.f81304c;
    }

    public final String d() {
        return this.f81305e;
    }

    public final String e() {
        return this.f81306f;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (p.g(this.f81302a, r52.f81302a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81303b, r52.f81303b) == true) goto L15;
        return false;
    L15:
        if (this.f81304c == r52.f81304c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (p.g(this.f81305e, r52.f81305e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f81306f, r52.f81306f) == true) goto L27;
        return false;
    L27:
        if (this.f81307g == r52.f81307g) goto L30;
        return false;
    L30:
        if (this.f81308h == r52.f81308h) goto L33;
        return false;
    L33:
        if (p.g(this.f81309i, r52.f81309i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f81310j, r52.f81310j) == true) goto L38;
        return false;
    L38:
        return true;
    }

    public final int f() {
        return this.f81307g;
    }

    public final String g() {
        return this.f81309i;
    }

    public final int h() {
        return this.f81308h;
    }

    public int hashCode() {
        return (((((((((((((((((this.f81302a.hashCode() * 31) + this.f81303b.hashCode()) * 31) + Integer.hashCode(this.f81304c)) * 31) + Integer.hashCode(this.d)) * 31) + this.f81305e.hashCode()) * 31) + this.f81306f.hashCode()) * 31) + Integer.hashCode(this.f81307g)) * 31) + Integer.hashCode(this.f81308h)) * 31) + this.f81309i.hashCode()) * 31) + this.f81310j.hashCode();
    }

    public final String i() {
        return this.f81310j;
    }

    public final int j() {
        return this.d;
    }

    public String toString() {
        return "YoutubeMetaEntity(authorName=" + this.f81302a + ", authorUrl=" + this.f81303b + ", height=" + this.f81304c + ", width=" + this.d + ", providerName=" + this.f81305e + ", providerUrl=" + this.f81306f + ", thumbnailHeight=" + this.f81307g + ", thumbnailWidth=" + this.f81308h + ", thumbnailUrl=" + this.f81309i + ", title=" + this.f81310j + ")";
    }
}

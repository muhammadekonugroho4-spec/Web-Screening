package com.stockbit.usecase.chat.model.chat;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f155228a;

    /* renamed from: b, reason: collision with root package name */
    public final String f155229b;

    /* renamed from: c, reason: collision with root package name */
    public final int f155230c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final String f155231e;

    /* renamed from: f, reason: collision with root package name */
    public final String f155232f;

    /* renamed from: g, reason: collision with root package name */
    public final int f155233g;

    /* renamed from: h, reason: collision with root package name */
    public final int f155234h;

    /* renamed from: i, reason: collision with root package name */
    public final String f155235i;

    /* renamed from: j, reason: collision with root package name */
    public final String f155236j;

    public j(String r2, String r3, int r4, int r5, String r6, String r7, int r8, int r9, String r10, String r11) {
        p.l(r2, "authorName");
        p.l(r3, "authorUrl");
        p.l(r6, "providerName");
        p.l(r7, "providerUrl");
        p.l(r10, "thumbnailUrl");
        p.l(r11, Constants.KEY_TITLE);
        this.f155228a = r2;
        this.f155229b = r3;
        this.f155230c = r4;
        this.d = r5;
        this.f155231e = r6;
        this.f155232f = r7;
        this.f155233g = r8;
        this.f155234h = r9;
        this.f155235i = r10;
        this.f155236j = r11;
    }

    public final String a() {
        return this.f155232f;
    }

    public final String b() {
        return this.f155235i;
    }

    public final String c() {
        return this.f155236j;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof j) == true) goto L8;
        return false;
    L8:
        j r52 = (j) r5;
        if (p.g(this.f155228a, r52.f155228a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f155229b, r52.f155229b) == true) goto L15;
        return false;
    L15:
        if (this.f155230c == r52.f155230c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (p.g(this.f155231e, r52.f155231e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f155232f, r52.f155232f) == true) goto L27;
        return false;
    L27:
        if (this.f155233g == r52.f155233g) goto L30;
        return false;
    L30:
        if (this.f155234h == r52.f155234h) goto L33;
        return false;
    L33:
        if (p.g(this.f155235i, r52.f155235i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f155236j, r52.f155236j) == true) goto L38;
        return false;
    L38:
        return true;
    }

    public int hashCode() {
        return (((((((((((((((((this.f155228a.hashCode() * 31) + this.f155229b.hashCode()) * 31) + Integer.hashCode(this.f155230c)) * 31) + Integer.hashCode(this.d)) * 31) + this.f155231e.hashCode()) * 31) + this.f155232f.hashCode()) * 31) + Integer.hashCode(this.f155233g)) * 31) + Integer.hashCode(this.f155234h)) * 31) + this.f155235i.hashCode()) * 31) + this.f155236j.hashCode();
    }

    public String toString() {
        return "YoutubeMetaUIState(authorName=" + this.f155228a + ", authorUrl=" + this.f155229b + ", height=" + this.f155230c + ", width=" + this.d + ", providerName=" + this.f155231e + ", providerUrl=" + this.f155232f + ", thumbnailHeight=" + this.f155233g + ", thumbnailWidth=" + this.f155234h + ", thumbnailUrl=" + this.f155235i + ", title=" + this.f155236j + ")";
    }
}

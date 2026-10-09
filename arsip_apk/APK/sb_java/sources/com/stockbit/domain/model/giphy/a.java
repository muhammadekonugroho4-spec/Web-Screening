package com.stockbit.domain.model.giphy;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f84076a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84077b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84078c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f84079e;

    /* renamed from: f, reason: collision with root package name */
    public final String f84080f;

    /* renamed from: g, reason: collision with root package name */
    public final String f84081g;

    /* renamed from: h, reason: collision with root package name */
    public final String f84082h;

    /* renamed from: i, reason: collision with root package name */
    public final String f84083i;

    /* renamed from: j, reason: collision with root package name */
    public final String f84084j;

    /* renamed from: k, reason: collision with root package name */
    public final String f84085k;

    /* renamed from: l, reason: collision with root package name */
    public final String f84086l;

    /* renamed from: m, reason: collision with root package name */
    public final String f84087m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f84088n;

    /* renamed from: o, reason: collision with root package name */
    public final String f84089o;

    /* renamed from: p, reason: collision with root package name */
    public final String f84090p;

    /* renamed from: q, reason: collision with root package name */
    public final String f84091q;

    /* renamed from: r, reason: collision with root package name */
    public final c f84092r;

    public a(String r17, String r18, String r19, String r20, String r21, String r22, String r23, String r24, String r25, String r26, String r27, String r28, String r29, boolean r30, String r31, String r32, String r33, c r34) {
        p.l(r17, "type");
        p.l(r18, Constants.KEY_ID);
        p.l(r19, "slug");
        p.l(r20, "url");
        p.l(r21, "bitlyGifUrl");
        p.l(r22, "bitlyUrl");
        p.l(r23, "embedUrl");
        p.l(r24, "username");
        p.l(r25, "source");
        p.l(r26, "rating");
        p.l(r27, "contentUrl");
        p.l(r28, "sourceTld");
        p.l(r29, "sourcePostUrl");
        p.l(r31, "importDatetime");
        p.l(r32, "trendingDatetime");
        p.l(r33, Constants.KEY_TITLE);
        p.l(r34, "images");
        this.f84076a = r17;
        this.f84077b = r18;
        this.f84078c = r19;
        this.d = r20;
        this.f84079e = r21;
        this.f84080f = r22;
        this.f84081g = r23;
        this.f84082h = r24;
        this.f84083i = r25;
        this.f84084j = r26;
        this.f84085k = r27;
        this.f84086l = r28;
        this.f84087m = r29;
        this.f84088n = r30;
        this.f84089o = r31;
        this.f84090p = r32;
        this.f84091q = r33;
        this.f84092r = r34;
    }

    public final String a() {
        return this.f84077b;
    }

    public final c b() {
        return this.f84092r;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f84076a, r52.f84076a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f84077b, r52.f84077b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f84078c, r52.f84078c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f84079e, r52.f84079e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f84080f, r52.f84080f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f84081g, r52.f84081g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f84082h, r52.f84082h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f84083i, r52.f84083i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f84084j, r52.f84084j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f84085k, r52.f84085k) == true) goto L42;
        return false;
    L42:
        if (p.g(this.f84086l, r52.f84086l) == true) goto L45;
        return false;
    L45:
        if (p.g(this.f84087m, r52.f84087m) == true) goto L48;
        return false;
    L48:
        if (this.f84088n == r52.f84088n) goto L51;
        return false;
    L51:
        if (p.g(this.f84089o, r52.f84089o) == true) goto L54;
        return false;
    L54:
        if (p.g(this.f84090p, r52.f84090p) == true) goto L57;
        return false;
    L57:
        if (p.g(this.f84091q, r52.f84091q) == true) goto L60;
        return false;
    L60:
        if (p.g(this.f84092r, r52.f84092r) == true) goto L62;
        return false;
    L62:
        return true;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((this.f84076a.hashCode() * 31) + this.f84077b.hashCode()) * 31) + this.f84078c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f84079e.hashCode()) * 31) + this.f84080f.hashCode()) * 31) + this.f84081g.hashCode()) * 31) + this.f84082h.hashCode()) * 31) + this.f84083i.hashCode()) * 31) + this.f84084j.hashCode()) * 31) + this.f84085k.hashCode()) * 31) + this.f84086l.hashCode()) * 31) + this.f84087m.hashCode()) * 31) + Boolean.hashCode(this.f84088n)) * 31) + this.f84089o.hashCode()) * 31) + this.f84090p.hashCode()) * 31) + this.f84091q.hashCode()) * 31) + this.f84092r.hashCode();
    }

    public String toString() {
        return "GiphyEntity(type=" + this.f84076a + ", id=" + this.f84077b + ", slug=" + this.f84078c + ", url=" + this.d + ", bitlyGifUrl=" + this.f84079e + ", bitlyUrl=" + this.f84080f + ", embedUrl=" + this.f84081g + ", username=" + this.f84082h + ", source=" + this.f84083i + ", rating=" + this.f84084j + ", contentUrl=" + this.f84085k + ", sourceTld=" + this.f84086l + ", sourcePostUrl=" + this.f84087m + ", isSticker=" + this.f84088n + ", importDatetime=" + this.f84089o + ", trendingDatetime=" + this.f84090p + ", title=" + this.f84091q + ", images=" + this.f84092r + ")";
    }
}

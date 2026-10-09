package com.stockbit.domain.model.valueobject.stream;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public String f87143a;

    /* renamed from: b, reason: collision with root package name */
    public final String f87144b;

    /* renamed from: c, reason: collision with root package name */
    public final String f87145c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f87146e;

    /* renamed from: f, reason: collision with root package name */
    public final String f87147f;

    /* renamed from: g, reason: collision with root package name */
    public String f87148g;

    public e(String r2, String r3, String r4, String r5, String r6, String r7, String r8) {
        p.l(r2, "lastPrice");
        p.l(r3, "change");
        p.l(r4, "pChange");
        p.l(r5, "volume");
        p.l(r6, "avgVolume");
        p.l(r7, Constants.KEY_DATE);
        p.l(r8, "formattedPrice");
        this.f87143a = r2;
        this.f87144b = r3;
        this.f87145c = r4;
        this.d = r5;
        this.f87146e = r6;
        this.f87147f = r7;
        this.f87148g = r8;
    }

    public final String a() {
        return this.f87148g;
    }

    public final String b() {
        return this.f87143a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f87143a, r52.f87143a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f87144b, r52.f87144b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f87145c, r52.f87145c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f87146e, r52.f87146e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f87147f, r52.f87147f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f87148g, r52.f87148g) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public int hashCode() {
        return (((((((((((this.f87143a.hashCode() * 31) + this.f87144b.hashCode()) * 31) + this.f87145c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f87146e.hashCode()) * 31) + this.f87147f.hashCode()) * 31) + this.f87148g.hashCode();
    }

    public String toString() {
        return "SinceMessageLatest(lastPrice=" + this.f87143a + ", change=" + this.f87144b + ", pChange=" + this.f87145c + ", volume=" + this.d + ", avgVolume=" + this.f87146e + ", date=" + this.f87147f + ", formattedPrice=" + this.f87148g + ')';
    }
}

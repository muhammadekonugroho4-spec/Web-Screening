package com.stockbit.usecase.academy.model;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f154308a;

    /* renamed from: b, reason: collision with root package name */
    public final String f154309b;

    /* renamed from: c, reason: collision with root package name */
    public final String f154310c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final UnboxingCategoryType f154311e;

    public b(String r2, String r3, String r4, String r5, UnboxingCategoryType r6) {
        p.l(r2, "volume");
        p.l(r3, "rawVolume");
        p.l(r4, "image");
        p.l(r5, Constants.KEY_TITLE);
        p.l(r6, "category");
        this.f154308a = r2;
        this.f154309b = r3;
        this.f154310c = r4;
        this.d = r5;
        this.f154311e = r6;
    }

    public final UnboxingCategoryType a() {
        return this.f154311e;
    }

    public final String b() {
        return this.f154310c;
    }

    public final String c() {
        return this.f154309b;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.f154308a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f154308a, r52.f154308a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f154309b, r52.f154309b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f154310c, r52.f154310c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f154311e == r52.f154311e) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f154308a.hashCode() * 31) + this.f154309b.hashCode()) * 31) + this.f154310c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f154311e.hashCode();
    }

    public String toString() {
        return "UnboxingItemUIState(volume=" + this.f154308a + ", rawVolume=" + this.f154309b + ", image=" + this.f154310c + ", title=" + this.d + ", category=" + this.f154311e + ")";
    }
}

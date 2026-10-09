package com.stockbit.domain.model.movers;

import com.clevertap.android.sdk.Constants;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f84353a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84354b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84355c;

    public d(boolean r2, String r3, String r4) {
        kotlin.jvm.internal.p.l(r3, "iconUrl");
        kotlin.jvm.internal.p.l(r4, Constants.KEY_TEXT);
        this.f84353a = r2;
        this.f84354b = r3;
        this.f84355c = r4;
    }

    public final boolean a() {
        return this.f84353a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (this.f84353a == r52.f84353a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f84354b, r52.f84354b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f84355c, r52.f84355c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f84353a) * 31) + this.f84354b.hashCode()) * 31) + this.f84355c.hashCode();
    }

    public String toString() {
        return "MoversCorpactionEntity(active=" + this.f84353a + ", iconUrl=" + this.f84354b + ", text=" + this.f84355c + ")";
    }
}

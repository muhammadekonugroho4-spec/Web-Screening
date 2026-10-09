package com.stockbit.domain.model.valueobject.sector;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public String f86939a;

    /* renamed from: b, reason: collision with root package name */
    public List f86940b;

    public b(String r2, List r3) {
        p.l(r2, "sectionName");
        p.l(r3, FirebaseAnalytics.Param.ITEMS);
        this.f86939a = r2;
        this.f86940b = r3;
    }

    public final List a() {
        return this.f86940b;
    }

    public final String b() {
        return this.f86939a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f86939a, r52.f86939a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f86940b, r52.f86940b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f86939a.hashCode() * 31) + this.f86940b.hashCode();
    }

    public String toString() {
        return "DiscoverSectorSection(sectionName=" + this.f86939a + ", items=" + this.f86940b + ')';
    }
}

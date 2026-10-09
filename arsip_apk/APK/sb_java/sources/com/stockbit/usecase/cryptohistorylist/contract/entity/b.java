package com.stockbit.usecase.cryptohistorylist.contract.entity;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f157213a;

    /* renamed from: b, reason: collision with root package name */
    public final String f157214b;

    public b(List r2, String r3) {
        p.l(r2, FirebaseAnalytics.Param.ITEMS);
        this.f157213a = r2;
        this.f157214b = r3;
    }

    public final List a() {
        return this.f157213a;
    }

    public final String b() {
        return this.f157214b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f157213a, r52.f157213a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f157214b, r52.f157214b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int r02 = this.f157213a.hashCode() * 31;
        String r1 = this.f157214b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "CryptoHistoryPage(items=" + this.f157213a + ", nextPageToken=" + this.f157214b + ")";
    }
}

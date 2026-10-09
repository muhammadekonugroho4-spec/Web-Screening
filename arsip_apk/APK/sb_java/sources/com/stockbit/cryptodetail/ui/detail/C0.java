package com.stockbit.cryptodetail.ui.detail;

import com.google.firebase.messaging.Constants;
import java.util.List;

/* loaded from: classes8.dex */
public final class C0 {

    /* renamed from: a, reason: collision with root package name */
    public final SeasonalityRowLabelType f79196a;

    /* renamed from: b, reason: collision with root package name */
    public final String f79197b;

    /* renamed from: c, reason: collision with root package name */
    public final List f79198c;

    static {
    }

    public C0(SeasonalityRowLabelType r2, String r3, List r4) {
        kotlin.jvm.internal.p.l(r2, "labelType");
        kotlin.jvm.internal.p.l(r3, Constants.ScionAnalytics.PARAM_LABEL);
        kotlin.jvm.internal.p.l(r4, "cells");
        this.f79196a = r2;
        this.f79197b = r3;
        this.f79198c = r4;
    }

    public final List a() {
        return this.f79198c;
    }

    public final String b() {
        return this.f79197b;
    }

    public final SeasonalityRowLabelType c() {
        return this.f79196a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C0) == true) goto L8;
        return false;
    L8:
        C0 r52 = (C0) r5;
        if (this.f79196a == r52.f79196a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f79197b, r52.f79197b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f79198c, r52.f79198c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f79196a.hashCode() * 31) + this.f79197b.hashCode()) * 31) + this.f79198c.hashCode();
    }

    public String toString() {
        return "SeasonalityTableRow(labelType=" + this.f79196a + ", label=" + this.f79197b + ", cells=" + this.f79198c + ')';
    }
}

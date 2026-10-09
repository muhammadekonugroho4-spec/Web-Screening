package com.stockbit.usecase.fda.model;

import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f157845a;

    /* renamed from: b, reason: collision with root package name */
    public final b f157846b;

    /* renamed from: c, reason: collision with root package name */
    public final b f157847c;

    public i(String r2, b r3, b r4) {
        p.l(r2, Constants.ScionAnalytics.PARAM_LABEL);
        p.l(r3, "percentage");
        p.l(r4, "value");
        this.f157845a = r2;
        this.f157846b = r3;
        this.f157847c = r4;
    }

    public final String a() {
        return this.f157845a;
    }

    public final b b() {
        return this.f157846b;
    }

    public final b c() {
        return this.f157847c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof i) == true) goto L8;
        return false;
    L8:
        i r52 = (i) r5;
        if (p.g(this.f157845a, r52.f157845a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f157846b, r52.f157846b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f157847c, r52.f157847c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f157845a.hashCode() * 31) + this.f157846b.hashCode()) * 31) + this.f157847c.hashCode();
    }

    public String toString() {
        return "FDAValuePercentageUIState(label=" + this.f157845a + ", percentage=" + this.f157846b + ", value=" + this.f157847c + ")";
    }

    public /* synthetic */ i(String r4, b r5, b r6, int r7, kotlin.jvm.internal.i r8) {
        if ((r7 & 1) == 0) goto L6;
        r4 = "";
    L6:
        if ((r7 & 2) == 0) goto L9;
        r5 = new b(null, 0.0f, 3, null);
    L9:
        if ((r7 & 4) == 0) goto L11;
        r6 = new b(null, 0.0f, 3, null);
    L11:
        this(r4, r5, r6);
    }
}

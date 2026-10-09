package com.stockbit.usecase.securities.model.portfolio;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;

/* renamed from: com.stockbit.usecase.securities.model.portfolio.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10927i {

    /* renamed from: a, reason: collision with root package name */
    public final String f161740a;

    /* renamed from: b, reason: collision with root package name */
    public final String f161741b;

    /* renamed from: c, reason: collision with root package name */
    public final String f161742c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f161743e;

    /* renamed from: f, reason: collision with root package name */
    public final String f161744f;

    /* renamed from: g, reason: collision with root package name */
    public final String f161745g;

    /* renamed from: h, reason: collision with root package name */
    public final String f161746h;

    /* renamed from: i, reason: collision with root package name */
    public final String f161747i;

    public C10927i(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10) {
        kotlin.jvm.internal.p.l(r2, AppMeasurementSdk.ConditionalUserProperty.ACTIVE);
        kotlin.jvm.internal.p.l(r3, "type");
        kotlin.jvm.internal.p.l(r4, FirebaseAnalytics.Param.PRICE);
        kotlin.jvm.internal.p.l(r5, "listingDate");
        kotlin.jvm.internal.p.l(r6, "expiredDate");
        kotlin.jvm.internal.p.l(r7, "matureDate");
        kotlin.jvm.internal.p.l(r8, "exerciseStartDate");
        kotlin.jvm.internal.p.l(r9, "exerciseEndDate");
        kotlin.jvm.internal.p.l(r10, "infoExercise");
        this.f161740a = r2;
        this.f161741b = r3;
        this.f161742c = r4;
        this.d = r5;
        this.f161743e = r6;
        this.f161744f = r7;
        this.f161745g = r8;
        this.f161746h = r9;
        this.f161747i = r10;
    }

    public final String a() {
        return this.f161740a;
    }

    public final String b() {
        return this.f161746h;
    }

    public final String c() {
        return this.f161745g;
    }

    public final String d() {
        return this.f161743e;
    }

    public final String e() {
        return this.f161747i;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C10927i) == true) goto L8;
        return false;
    L8:
        C10927i r52 = (C10927i) r5;
        if (kotlin.jvm.internal.p.g(this.f161740a, r52.f161740a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f161741b, r52.f161741b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f161742c, r52.f161742c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f161743e, r52.f161743e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f161744f, r52.f161744f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f161745g, r52.f161745g) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f161746h, r52.f161746h) == true) goto L33;
        return false;
    L33:
        if (kotlin.jvm.internal.p.g(this.f161747i, r52.f161747i) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public final String f() {
        return this.d;
    }

    public final String g() {
        return this.f161744f;
    }

    public final String h() {
        return this.f161742c;
    }

    public int hashCode() {
        return (((((((((((((((this.f161740a.hashCode() * 31) + this.f161741b.hashCode()) * 31) + this.f161742c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f161743e.hashCode()) * 31) + this.f161744f.hashCode()) * 31) + this.f161745g.hashCode()) * 31) + this.f161746h.hashCode()) * 31) + this.f161747i.hashCode();
    }

    public final String i() {
        return this.f161741b;
    }

    public String toString() {
        return "ExerciseUIState(active=" + this.f161740a + ", type=" + this.f161741b + ", price=" + this.f161742c + ", listingDate=" + this.d + ", expiredDate=" + this.f161743e + ", matureDate=" + this.f161744f + ", exerciseStartDate=" + this.f161745g + ", exerciseEndDate=" + this.f161746h + ", infoExercise=" + this.f161747i + ")";
    }

    public /* synthetic */ C10927i(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, int r11, kotlin.jvm.internal.i r12) {
        if ((r11 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r11 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r11 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r11 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r11 & 16) == 0) goto L18;
        r6 = "";
    L18:
        if ((r11 & 32) == 0) goto L21;
        r7 = "";
    L21:
        if ((r11 & 64) == 0) goto L24;
        r8 = "";
    L24:
        if ((r11 & 128) == 0) goto L27;
        r9 = "";
    L27:
        if ((r11 & 256) == 0) goto L30;
        String r112 = "";
    L29:
        String r102 = r9;
        String r92 = r8;
        String r82 = r7;
        String r72 = r6;
        String r62 = r5;
        String r52 = r4;
        String r42 = r3;
        this(r2, r42, r52, r62, r72, r82, r92, r102, r112);
        return;
    L30:
        r112 = r10;
        goto L29
    }
}

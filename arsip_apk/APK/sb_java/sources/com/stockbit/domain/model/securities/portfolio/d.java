package com.stockbit.domain.model.securities.portfolio;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f85615a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85616b;

    /* renamed from: c, reason: collision with root package name */
    public final String f85617c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f85618e;

    /* renamed from: f, reason: collision with root package name */
    public final String f85619f;

    /* renamed from: g, reason: collision with root package name */
    public final String f85620g;

    /* renamed from: h, reason: collision with root package name */
    public final String f85621h;

    /* renamed from: i, reason: collision with root package name */
    public final String f85622i;

    public d(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10) {
        p.l(r2, AppMeasurementSdk.ConditionalUserProperty.ACTIVE);
        p.l(r3, "type");
        p.l(r4, FirebaseAnalytics.Param.PRICE);
        p.l(r5, "listingDate");
        p.l(r6, "expiredDate");
        p.l(r7, "matureDate");
        p.l(r8, "exerciseStartDate");
        p.l(r9, "exerciseEndDate");
        p.l(r10, "infoExercise");
        this.f85615a = r2;
        this.f85616b = r3;
        this.f85617c = r4;
        this.d = r5;
        this.f85618e = r6;
        this.f85619f = r7;
        this.f85620g = r8;
        this.f85621h = r9;
        this.f85622i = r10;
    }

    public final String a() {
        return this.f85615a;
    }

    public final String b() {
        return this.f85621h;
    }

    public final String c() {
        return this.f85620g;
    }

    public final String d() {
        return this.f85618e;
    }

    public final String e() {
        return this.f85622i;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f85615a, r52.f85615a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f85616b, r52.f85616b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f85617c, r52.f85617c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f85618e, r52.f85618e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f85619f, r52.f85619f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f85620g, r52.f85620g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f85621h, r52.f85621h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f85622i, r52.f85622i) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public final String f() {
        return this.d;
    }

    public final String g() {
        return this.f85619f;
    }

    public final String h() {
        return this.f85617c;
    }

    public int hashCode() {
        return (((((((((((((((this.f85615a.hashCode() * 31) + this.f85616b.hashCode()) * 31) + this.f85617c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f85618e.hashCode()) * 31) + this.f85619f.hashCode()) * 31) + this.f85620g.hashCode()) * 31) + this.f85621h.hashCode()) * 31) + this.f85622i.hashCode();
    }

    public final String i() {
        return this.f85616b;
    }

    public String toString() {
        return "ExerciseEntity(active=" + this.f85615a + ", type=" + this.f85616b + ", price=" + this.f85617c + ", listingDate=" + this.d + ", expiredDate=" + this.f85618e + ", matureDate=" + this.f85619f + ", exerciseStartDate=" + this.f85620g + ", exerciseEndDate=" + this.f85621h + ", infoExercise=" + this.f85622i + ")";
    }

    public /* synthetic */ d(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, int r11, kotlin.jvm.internal.i r12) {
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

package com.stockbit.usecase.securities.model.order;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;

/* renamed from: com.stockbit.usecase.securities.model.order.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10910d {

    /* renamed from: a, reason: collision with root package name */
    public final String f161215a;

    /* renamed from: b, reason: collision with root package name */
    public final String f161216b;

    /* renamed from: c, reason: collision with root package name */
    public final String f161217c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final double f161218e;

    /* renamed from: f, reason: collision with root package name */
    public final String f161219f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f161220g;

    /* renamed from: h, reason: collision with root package name */
    public final String f161221h;

    /* renamed from: i, reason: collision with root package name */
    public final String f161222i;

    /* renamed from: j, reason: collision with root package name */
    public final String f161223j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f161224k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f161225l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f161226m;

    /* renamed from: n, reason: collision with root package name */
    public final String f161227n;

    /* renamed from: o, reason: collision with root package name */
    public final String f161228o;

    public C10910d(String r7, String r8, String r9, String r10, double r11, String r13, boolean r14, String r15, String r16, String r17, boolean r18, boolean r19, boolean r20, String r21, String r22) {
        kotlin.jvm.internal.p.l(r7, Constants.KEY_ID);
        kotlin.jvm.internal.p.l(r8, "symbol");
        kotlin.jvm.internal.p.l(r9, "symbolFormatter");
        kotlin.jvm.internal.p.l(r10, FirebaseAnalytics.Param.PRICE);
        kotlin.jvm.internal.p.l(r13, "amount");
        kotlin.jvm.internal.p.l(r15, NotificationCompat.CATEGORY_STATUS);
        kotlin.jvm.internal.p.l(r16, Constants.ScionAnalytics.PARAM_LABEL);
        kotlin.jvm.internal.p.l(r17, "proceedFee");
        kotlin.jvm.internal.p.l(r21, "lotOrdered");
        kotlin.jvm.internal.p.l(r22, "platformOrderType");
        this.f161215a = r7;
        this.f161216b = r8;
        this.f161217c = r9;
        this.d = r10;
        this.f161218e = r11;
        this.f161219f = r13;
        this.f161220g = r14;
        this.f161221h = r15;
        this.f161222i = r16;
        this.f161223j = r17;
        this.f161224k = r18;
        this.f161225l = r19;
        this.f161226m = r20;
        this.f161227n = r21;
        this.f161228o = r22;
    }

    public final String a() {
        return this.f161219f;
    }

    public final String b() {
        return this.f161215a;
    }

    public final String c() {
        return this.f161222i;
    }

    public final String d() {
        return this.f161227n;
    }

    public final double e() {
        return this.f161218e;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof C10910d) == true) goto L8;
        return false;
    L8:
        C10910d r82 = (C10910d) r8;
        if (kotlin.jvm.internal.p.g(this.f161215a, r82.f161215a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f161216b, r82.f161216b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f161217c, r82.f161217c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (Double.compare(this.f161218e, r82.f161218e) == 0) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f161219f, r82.f161219f) == true) goto L27;
        return false;
    L27:
        if (this.f161220g == r82.f161220g) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f161221h, r82.f161221h) == true) goto L33;
        return false;
    L33:
        if (kotlin.jvm.internal.p.g(this.f161222i, r82.f161222i) == true) goto L36;
        return false;
    L36:
        if (kotlin.jvm.internal.p.g(this.f161223j, r82.f161223j) == true) goto L39;
        return false;
    L39:
        if (this.f161224k == r82.f161224k) goto L42;
        return false;
    L42:
        if (this.f161225l == r82.f161225l) goto L45;
        return false;
    L45:
        if (this.f161226m == r82.f161226m) goto L48;
        return false;
    L48:
        if (kotlin.jvm.internal.p.g(this.f161227n, r82.f161227n) == true) goto L51;
        return false;
    L51:
        if (kotlin.jvm.internal.p.g(this.f161228o, r82.f161228o) == true) goto L53;
        return false;
    L53:
        return true;
    }

    public final String f() {
        return this.f161228o;
    }

    public final String g() {
        return this.d;
    }

    public final String h() {
        return this.f161223j;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((this.f161215a.hashCode() * 31) + this.f161216b.hashCode()) * 31) + this.f161217c.hashCode()) * 31) + this.d.hashCode()) * 31) + Double.hashCode(this.f161218e)) * 31) + this.f161219f.hashCode()) * 31) + Boolean.hashCode(this.f161220g)) * 31) + this.f161221h.hashCode()) * 31) + this.f161222i.hashCode()) * 31) + this.f161223j.hashCode()) * 31) + Boolean.hashCode(this.f161224k)) * 31) + Boolean.hashCode(this.f161225l)) * 31) + Boolean.hashCode(this.f161226m)) * 31) + this.f161227n.hashCode()) * 31) + this.f161228o.hashCode();
    }

    public final String i() {
        return this.f161221h;
    }

    public final String j() {
        return this.f161216b;
    }

    public final String k() {
        return this.f161217c;
    }

    public final boolean l() {
        return this.f161220g;
    }

    public String toString() {
        return "BracketOrderChildren(id=" + this.f161215a + ", symbol=" + this.f161216b + ", symbolFormatter=" + this.f161217c + ", price=" + this.d + ", percentage=" + this.f161218e + ", amount=" + this.f161219f + ", isGtc=" + this.f161220g + ", status=" + this.f161221h + ", label=" + this.f161222i + ", proceedFee=" + this.f161223j + ", isEnable=" + this.f161224k + ", isChecked=" + this.f161225l + ", isVisible=" + this.f161226m + ", lotOrdered=" + this.f161227n + ", platformOrderType=" + this.f161228o + ")";
    }
}

package com.stockbit.lib.trackerwrapper.sentry;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f120643a;

    /* renamed from: b, reason: collision with root package name */
    public final String f120644b;

    /* renamed from: c, reason: collision with root package name */
    public final String f120645c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f120646e;

    /* renamed from: f, reason: collision with root package name */
    public final String f120647f;

    /* renamed from: g, reason: collision with root package name */
    public final String f120648g;

    public h(String r2, String r3, String r4, String r5, Boolean r6, String r7, String r8) {
        p.l(r2, "userId");
        p.l(r3, "username");
        p.l(r4, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r5, "email");
        this.f120643a = r2;
        this.f120644b = r3;
        this.f120645c = r4;
        this.d = r5;
        this.f120646e = r6;
        this.f120647f = r7;
        this.f120648g = r8;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f120645c;
    }

    public final String c() {
        return this.f120643a;
    }

    public final String d() {
        return this.f120644b;
    }

    public final Boolean e() {
        return this.f120646e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof h) == true) goto L8;
        return false;
    L8:
        h r52 = (h) r5;
        if (p.g(this.f120643a, r52.f120643a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f120644b, r52.f120644b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f120645c, r52.f120645c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f120646e, r52.f120646e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f120647f, r52.f120647f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f120648g, r52.f120648g) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public int hashCode() {
        int r02 = ((((((this.f120643a.hashCode() * 31) + this.f120644b.hashCode()) * 31) + this.f120645c.hashCode()) * 31) + this.d.hashCode()) * 31;
        Boolean r1 = this.f120646e;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.f120647f;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (r03 + r14) * 31;
        String r15 = this.f120648g;
        if (r15 == null) goto L15;
        r2 = r15.hashCode();
    L15:
        return r04 + r2;
    L9:
        r14 = r13.hashCode();
        goto L10
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "SentryTrackerUserData(userId=" + this.f120643a + ", username=" + this.f120644b + ", name=" + this.f120645c + ", email=" + this.d + ", isPro=" + this.f120646e + ", loginMethod=" + this.f120647f + ", loginTimestamp=" + this.f120648g + ')';
    }

    public /* synthetic */ h(String r2, String r3, String r4, String r5, Boolean r6, String r7, String r8, int r9, i r10) {
        if ((r9 & 16) == 0) goto L6;
        r6 = null;
    L6:
        if ((r9 & 32) == 0) goto L9;
        r7 = null;
    L9:
        if ((r9 & 64) == 0) goto L12;
        String r92 = null;
    L13:
        this(r2, r3, r4, r5, r6, r7, r92);
        return;
    L12:
        r92 = r8;
        goto L13
    }
}

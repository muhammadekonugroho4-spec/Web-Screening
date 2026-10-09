package com.stockbit.common.utils;

import android.net.Uri;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;

/* renamed from: com.stockbit.common.utils.g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C5857g {

    /* renamed from: a, reason: collision with root package name */
    public final long f62316a;

    /* renamed from: b, reason: collision with root package name */
    public final String f62317b;

    /* renamed from: c, reason: collision with root package name */
    public final List f62318c;
    public final Uri d;

    /* renamed from: e, reason: collision with root package name */
    public final String f62319e;

    static {
    }

    public C5857g(long r2, String r4, List r5, Uri r6, String r7) {
        kotlin.jvm.internal.p.l(r4, AppMeasurementSdk.ConditionalUserProperty.NAME);
        kotlin.jvm.internal.p.l(r5, "phoneNumber");
        this.f62316a = r2;
        this.f62317b = r4;
        this.f62318c = r5;
        this.d = r6;
        this.f62319e = r7;
    }

    public final long a() {
        return this.f62316a;
    }

    public final String b() {
        return this.f62319e;
    }

    public final String c() {
        return this.f62317b;
    }

    public final List d() {
        return this.f62318c;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof C5857g) == true) goto L8;
        return false;
    L8:
        C5857g r82 = (C5857g) r8;
        if (this.f62316a == r82.f62316a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f62317b, r82.f62317b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f62318c, r82.f62318c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f62319e, r82.f62319e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        int r02 = ((((Long.hashCode(this.f62316a) * 31) + this.f62317b.hashCode()) * 31) + this.f62318c.hashCode()) * 31;
        Uri r1 = this.d;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.f62319e;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return r03 + r2;
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "ContactData(contactId=" + this.f62316a + ", name=" + this.f62317b + ", phoneNumber=" + this.f62318c + ", avatar=" + this.d + ", email=" + this.f62319e + ')';
    }
}

package com.stockbit.domain.model.valueobject.company.orderbook;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f86809a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86810b;

    /* renamed from: c, reason: collision with root package name */
    public final String f86811c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f86812e;

    public g(String r2, String r3, String r4, String r5, String r6) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, "code");
        p.l(r4, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r5, "permission");
        p.l(r6, "group");
        this.f86809a = r2;
        this.f86810b = r3;
        this.f86811c = r4;
        this.d = r5;
        this.f86812e = r6;
    }

    public final String a() {
        return this.f86810b;
    }

    public final String b() {
        return this.f86812e;
    }

    public final String c() {
        return this.f86809a;
    }

    public final String d() {
        return this.f86811c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (p.g(this.f86809a, r52.f86809a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f86810b, r52.f86810b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f86811c, r52.f86811c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f86812e, r52.f86812e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f86809a.hashCode() * 31) + this.f86810b.hashCode()) * 31) + this.f86811c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f86812e.hashCode();
    }

    public String toString() {
        return "BrokerCodeMarketDetector(id=" + this.f86809a + ", code=" + this.f86810b + ", name=" + this.f86811c + ", permission=" + this.d + ", group=" + this.f86812e + ')';
    }

    public /* synthetic */ g(String r2, String r3, String r4, String r5, String r6, int r7, i r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r7 & 16) == 0) goto L18;
        String r72 = "";
    L17:
        String r62 = r5;
        String r52 = r4;
        String r42 = r3;
        this(r2, r42, r52, r62, r72);
        return;
    L18:
        r72 = r6;
        goto L17
    }
}

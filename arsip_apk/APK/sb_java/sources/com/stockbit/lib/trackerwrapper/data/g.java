package com.stockbit.lib.trackerwrapper.data;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f120550a;

    /* renamed from: b, reason: collision with root package name */
    public final String f120551b;

    /* renamed from: c, reason: collision with root package name */
    public final String f120552c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f120553e;

    /* renamed from: f, reason: collision with root package name */
    public final String f120554f;

    /* renamed from: g, reason: collision with root package name */
    public final String f120555g;

    /* renamed from: h, reason: collision with root package name */
    public final String f120556h;

    /* renamed from: i, reason: collision with root package name */
    public Map f120557i;

    public g(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, Map r10) {
        p.l(r2, "userId");
        p.l(r3, "email");
        p.l(r4, "username");
        p.l(r5, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r6, Constants.DEVICE_ID_TAG);
        p.l(r7, "deviceModel");
        p.l(r8, "deviceOs");
        p.l(r9, "deviceBrand");
        p.l(r10, "cleverTapDataExtras");
        this.f120550a = r2;
        this.f120551b = r3;
        this.f120552c = r4;
        this.d = r5;
        this.f120553e = r6;
        this.f120554f = r7;
        this.f120555g = r8;
        this.f120556h = r9;
        this.f120557i = r10;
    }

    public final Map a() {
        return this.f120557i;
    }

    public final String b() {
        return this.f120556h;
    }

    public final String c() {
        return this.f120553e;
    }

    public final String d() {
        return this.f120554f;
    }

    public final String e() {
        return this.f120555g;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (p.g(this.f120550a, r52.f120550a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f120551b, r52.f120551b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f120552c, r52.f120552c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f120553e, r52.f120553e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f120554f, r52.f120554f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f120555g, r52.f120555g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f120556h, r52.f120556h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f120557i, r52.f120557i) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public final String f() {
        return this.f120551b;
    }

    public final String g() {
        return this.f120550a;
    }

    public final String h() {
        return this.f120552c;
    }

    public int hashCode() {
        return (((((((((((((((this.f120550a.hashCode() * 31) + this.f120551b.hashCode()) * 31) + this.f120552c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f120553e.hashCode()) * 31) + this.f120554f.hashCode()) * 31) + this.f120555g.hashCode()) * 31) + this.f120556h.hashCode()) * 31) + this.f120557i.hashCode();
    }

    public String toString() {
        return "TrackerUserModel(userId=" + this.f120550a + ", email=" + this.f120551b + ", username=" + this.f120552c + ", name=" + this.d + ", deviceId=" + this.f120553e + ", deviceModel=" + this.f120554f + ", deviceOs=" + this.f120555g + ", deviceBrand=" + this.f120556h + ", cleverTapDataExtras=" + this.f120557i + ')';
    }
}

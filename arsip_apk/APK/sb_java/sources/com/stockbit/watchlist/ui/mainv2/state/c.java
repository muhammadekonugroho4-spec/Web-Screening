package com.stockbit.watchlist.ui.mainv2.state;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f170889a;

    /* renamed from: b, reason: collision with root package name */
    public final String f170890b;

    /* renamed from: c, reason: collision with root package name */
    public final String f170891c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f170892e;

    /* renamed from: f, reason: collision with root package name */
    public final String f170893f;

    /* renamed from: g, reason: collision with root package name */
    public final String f170894g;

    static {
    }

    public c(String r2, String r3, String r4, String r5, String r6, String r7, String r8) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_ID);
        kotlin.jvm.internal.p.l(r3, "heading");
        kotlin.jvm.internal.p.l(r4, "body");
        kotlin.jvm.internal.p.l(r5, "actionUrl");
        kotlin.jvm.internal.p.l(r6, AppMeasurementSdk.ConditionalUserProperty.NAME);
        kotlin.jvm.internal.p.l(r7, "imageUrl");
        kotlin.jvm.internal.p.l(r8, "campaignId");
        this.f170889a = r2;
        this.f170890b = r3;
        this.f170891c = r4;
        this.d = r5;
        this.f170892e = r6;
        this.f170893f = r7;
        this.f170894g = r8;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f170891c;
    }

    public final String c() {
        return this.f170894g;
    }

    public final String d() {
        return this.f170890b;
    }

    public final String e() {
        return this.f170889a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (kotlin.jvm.internal.p.g(this.f170889a, r52.f170889a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f170890b, r52.f170890b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f170891c, r52.f170891c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f170892e, r52.f170892e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f170893f, r52.f170893f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f170894g, r52.f170894g) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public final String f() {
        return this.f170893f;
    }

    public final String g() {
        return this.f170892e;
    }

    public int hashCode() {
        return (((((((((((this.f170889a.hashCode() * 31) + this.f170890b.hashCode()) * 31) + this.f170891c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f170892e.hashCode()) * 31) + this.f170893f.hashCode()) * 31) + this.f170894g.hashCode();
    }

    public String toString() {
        return "WatchlistMainBannerUIState(id=" + this.f170889a + ", heading=" + this.f170890b + ", body=" + this.f170891c + ", actionUrl=" + this.d + ", name=" + this.f170892e + ", imageUrl=" + this.f170893f + ", campaignId=" + this.f170894g + ')';
    }
}

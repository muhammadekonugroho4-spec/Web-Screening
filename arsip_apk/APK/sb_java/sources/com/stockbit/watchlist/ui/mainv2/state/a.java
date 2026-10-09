package com.stockbit.watchlist.ui.mainv2.state;

import com.clevertap.android.sdk.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f170883a;

    /* renamed from: b, reason: collision with root package name */
    public final String f170884b;

    /* renamed from: c, reason: collision with root package name */
    public final String f170885c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f170886e;

    static {
    }

    public a(String r2, String r3, String r4, String r5, String r6) {
        kotlin.jvm.internal.p.l(r2, "amendId");
        kotlin.jvm.internal.p.l(r3, HiAnalyticsConstant.HaKey.BI_KEY_RESULT);
        kotlin.jvm.internal.p.l(r4, Constants.KEY_TITLE);
        kotlin.jvm.internal.p.l(r5, "description");
        kotlin.jvm.internal.p.l(r6, "ctaText");
        this.f170883a = r2;
        this.f170884b = r3;
        this.f170885c = r4;
        this.d = r5;
        this.f170886e = r6;
    }

    public final String a() {
        return this.f170883a;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f170884b;
    }

    public final String d() {
        return this.f170885c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (kotlin.jvm.internal.p.g(this.f170883a, r52.f170883a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f170884b, r52.f170884b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f170885c, r52.f170885c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f170886e, r52.f170886e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f170883a.hashCode() * 31) + this.f170884b.hashCode()) * 31) + this.f170885c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f170886e.hashCode();
    }

    public String toString() {
        return "WatchlistMainAmendBankUIState(amendId=" + this.f170883a + ", statusCode=" + this.f170884b + ", title=" + this.f170885c + ", description=" + this.d + ", ctaText=" + this.f170886e + ')';
    }
}

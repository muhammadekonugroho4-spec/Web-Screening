package com.stockbit.domain.model.socialsubscription;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a extends e {

    /* renamed from: a, reason: collision with root package name */
    public final int f85807a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85808b;

    /* renamed from: c, reason: collision with root package name */
    public final String f85809c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final String f85810e;

    /* renamed from: f, reason: collision with root package name */
    public final String f85811f;

    /* renamed from: g, reason: collision with root package name */
    public final String f85812g;

    /* renamed from: h, reason: collision with root package name */
    public final String f85813h;

    public a(int r2, String r3, String r4, int r5, String r6, String r7, String r8, String r9) {
        p.l(r3, "clientKey");
        p.l(r4, Constants.KEY_DATE);
        p.l(r6, FirebaseAnalytics.Param.METHOD);
        p.l(r7, "snapToken");
        p.l(r8, NotificationCompat.CATEGORY_STATUS);
        p.l(r9, "subscription");
        super(null);
        this.f85807a = r2;
        this.f85808b = r3;
        this.f85809c = r4;
        this.d = r5;
        this.f85810e = r6;
        this.f85811f = r7;
        this.f85812g = r8;
        this.f85813h = r9;
    }

    public final int a() {
        return this.f85807a;
    }

    public final String b() {
        return this.f85808b;
    }

    public final String c() {
        return this.f85809c;
    }

    public final int d() {
        return this.d;
    }

    public final String e() {
        return this.f85810e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f85807a == r52.f85807a) goto L12;
        return false;
    L12:
        if (p.g(this.f85808b, r52.f85808b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f85809c, r52.f85809c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (p.g(this.f85810e, r52.f85810e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f85811f, r52.f85811f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f85812g, r52.f85812g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f85813h, r52.f85813h) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final String f() {
        return this.f85811f;
    }

    public final String g() {
        return this.f85812g;
    }

    public final String h() {
        return this.f85813h;
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.f85807a) * 31) + this.f85808b.hashCode()) * 31) + this.f85809c.hashCode()) * 31) + Integer.hashCode(this.d)) * 31) + this.f85810e.hashCode()) * 31) + this.f85811f.hashCode()) * 31) + this.f85812g.hashCode()) * 31) + this.f85813h.hashCode();
    }

    public String toString() {
        return "SocialSubscriptionHistoryOrderEntity(amount=" + this.f85807a + ", clientKey=" + this.f85808b + ", date=" + this.f85809c + ", id=" + this.d + ", method=" + this.f85810e + ", snapToken=" + this.f85811f + ", status=" + this.f85812g + ", subscription=" + this.f85813h + ")";
    }
}

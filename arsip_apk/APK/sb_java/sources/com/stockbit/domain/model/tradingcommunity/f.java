package com.stockbit.domain.model.tradingcommunity;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f85972a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85973b;

    /* renamed from: c, reason: collision with root package name */
    public final String f85974c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f85975e;

    public f(String r2, String r3, String r4, String r5, String r6) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, "username");
        p.l(r4, "phone");
        p.l(r5, "joinAt");
        p.l(r6, NotificationCompat.CATEGORY_STATUS);
        this.f85972a = r2;
        this.f85973b = r3;
        this.f85974c = r4;
        this.d = r5;
        this.f85975e = r6;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f85974c;
    }

    public final String c() {
        return this.f85975e;
    }

    public final String d() {
        return this.f85973b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (p.g(this.f85972a, r52.f85972a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f85973b, r52.f85973b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f85974c, r52.f85974c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f85975e, r52.f85975e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f85972a.hashCode() * 31) + this.f85973b.hashCode()) * 31) + this.f85974c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f85975e.hashCode();
    }

    public String toString() {
        return "TradingCommunityMemberEntity(id=" + this.f85972a + ", username=" + this.f85973b + ", phone=" + this.f85974c + ", joinAt=" + this.d + ", status=" + this.f85975e + ")";
    }
}

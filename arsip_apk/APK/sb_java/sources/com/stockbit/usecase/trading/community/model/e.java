package com.stockbit.usecase.trading.community.model;

import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f163266a;

    /* renamed from: b, reason: collision with root package name */
    public final String f163267b;

    /* renamed from: c, reason: collision with root package name */
    public final String f163268c;
    public final CommunityLeaderDashboardMemberStatus d;

    public e(String r2, String r3, String r4, CommunityLeaderDashboardMemberStatus r5) {
        p.l(r2, "userName");
        p.l(r3, "phoneNumber");
        p.l(r4, "joinedAt");
        p.l(r5, NotificationCompat.CATEGORY_STATUS);
        this.f163266a = r2;
        this.f163267b = r3;
        this.f163268c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f163268c;
    }

    public final String b() {
        return this.f163267b;
    }

    public final CommunityLeaderDashboardMemberStatus c() {
        return this.d;
    }

    public final String d() {
        return this.f163266a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f163266a, r52.f163266a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f163267b, r52.f163267b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f163268c, r52.f163268c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f163266a.hashCode() * 31) + this.f163267b.hashCode()) * 31) + this.f163268c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "TradingCommunityMemberUIState(userName=" + this.f163266a + ", phoneNumber=" + this.f163267b + ", joinedAt=" + this.f163268c + ", status=" + this.d + ")";
    }
}

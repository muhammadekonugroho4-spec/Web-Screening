package com.stockbit.domain.model.tradingcommunity;

import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f85947a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85948b;

    public a(String r2, String r3) {
        p.l(r2, "webviewUrl");
        p.l(r3, NotificationCompat.CATEGORY_STATUS);
        this.f85947a = r2;
        this.f85948b = r3;
    }

    public final String a() {
        return this.f85948b;
    }

    public final String b() {
        return this.f85947a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f85947a, r52.f85947a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f85948b, r52.f85948b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f85947a.hashCode() * 31) + this.f85948b.hashCode();
    }

    public String toString() {
        return "TradingCommunityActivationUrlEntity(webviewUrl=" + this.f85947a + ", status=" + this.f85948b + ")";
    }
}

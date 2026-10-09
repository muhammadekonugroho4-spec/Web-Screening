package com.stockbit.usecase.banner.model;

import androidx.core.app.NotificationCompat;
import com.stockbit.usecase.banner.model.type.BannerStatusType;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f154403a;

    /* renamed from: b, reason: collision with root package name */
    public final BannerStatusType f154404b;

    public e(String r2, BannerStatusType r3) {
        p.l(r2, "bannerNotificationId");
        p.l(r3, NotificationCompat.CATEGORY_STATUS);
        this.f154403a = r2;
        this.f154404b = r3;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f154403a, r52.f154403a) == true) goto L12;
        return false;
    L12:
        if (this.f154404b == r52.f154404b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f154403a.hashCode() * 31) + this.f154404b.hashCode();
    }

    public String toString() {
        return "BannerUpdateStatusUIState(bannerNotificationId=" + this.f154403a + ", status=" + this.f154404b + ")";
    }
}

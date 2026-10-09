package com.stockbit.domain.model.securities.order;

import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f85432a;

    /* renamed from: b, reason: collision with root package name */
    public final DividendActionType f85433b;

    /* renamed from: c, reason: collision with root package name */
    public final String f85434c;

    public f(String r2, DividendActionType r3, String r4) {
        p.l(r2, "corpactId");
        p.l(r3, "actionType");
        p.l(r4, NotificationCompat.CATEGORY_STATUS);
        this.f85432a = r2;
        this.f85433b = r3;
        this.f85434c = r4;
    }

    public final DividendActionType a() {
        return this.f85433b;
    }

    public final String b() {
        return this.f85432a;
    }

    public final String c() {
        return this.f85434c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (p.g(this.f85432a, r52.f85432a) == true) goto L12;
        return false;
    L12:
        if (this.f85433b == r52.f85433b) goto L15;
        return false;
    L15:
        if (p.g(this.f85434c, r52.f85434c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f85432a.hashCode() * 31) + this.f85433b.hashCode()) * 31) + this.f85434c.hashCode();
    }

    public String toString() {
        return "OrderCorpactionInfo(corpactId=" + this.f85432a + ", actionType=" + this.f85433b + ", status=" + this.f85434c + ")";
    }
}

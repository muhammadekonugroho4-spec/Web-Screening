package com.stockbit.domain.model.brokeractivity;

import com.google.firebase.messaging.Constants;
import java.util.Date;
import java.util.Map;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Date f80867a;

    /* renamed from: b, reason: collision with root package name */
    public final Date f80868b;

    /* renamed from: c, reason: collision with root package name */
    public final Date f80869c;
    public final Map d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f80870e;

    public a(Date r2, Date r3, Date r4, Map r5, Map r6) {
        kotlin.jvm.internal.p.l(r2, Constants.MessagePayloadKeys.FROM);
        kotlin.jvm.internal.p.l(r3, "to");
        kotlin.jvm.internal.p.l(r4, "lastUpdated");
        kotlin.jvm.internal.p.l(r5, "chartDataValue");
        kotlin.jvm.internal.p.l(r6, "chartDataVolume");
        this.f80867a = r2;
        this.f80868b = r3;
        this.f80869c = r4;
        this.d = r5;
        this.f80870e = r6;
    }

    public final Map a() {
        return this.d;
    }

    public final Map b() {
        return this.f80870e;
    }

    public final Date c() {
        return this.f80867a;
    }

    public final Date d() {
        return this.f80869c;
    }

    public final Date e() {
        return this.f80868b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (kotlin.jvm.internal.p.g(this.f80867a, r52.f80867a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f80868b, r52.f80868b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f80869c, r52.f80869c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f80870e, r52.f80870e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f80867a.hashCode() * 31) + this.f80868b.hashCode()) * 31) + this.f80869c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f80870e.hashCode();
    }

    public String toString() {
        return "BrokerActivityChartEntity(from=" + this.f80867a + ", to=" + this.f80868b + ", lastUpdated=" + this.f80869c + ", chartDataValue=" + this.d + ", chartDataVolume=" + this.f80870e + ")";
    }
}

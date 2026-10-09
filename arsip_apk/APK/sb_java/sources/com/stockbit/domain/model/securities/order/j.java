package com.stockbit.domain.model.securities.order;

import androidx.core.app.NotificationCompat;
import com.stockbit.domain.param.securities.nego.OrderNegoSideType;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f85543a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85544b;

    /* renamed from: c, reason: collision with root package name */
    public final String f85545c;
    public final OrderNegoSideType d;

    /* renamed from: e, reason: collision with root package name */
    public final String f85546e;

    /* renamed from: f, reason: collision with root package name */
    public final String f85547f;

    /* renamed from: g, reason: collision with root package name */
    public final String f85548g;

    /* renamed from: h, reason: collision with root package name */
    public final String f85549h;

    /* renamed from: i, reason: collision with root package name */
    public final String f85550i;

    public j(String r2, String r3, String r4, OrderNegoSideType r5, String r6, String r7, String r8, String r9, String r10) {
        p.l(r2, "sequenceNumber");
        p.l(r3, "orderId");
        p.l(r4, "referenceId");
        p.l(r5, "orderSide");
        p.l(r6, "orderPrice");
        p.l(r7, NotificationCompat.CATEGORY_STATUS);
        p.l(r8, "shares");
        p.l(r9, "broker");
        p.l(r10, "queuedAt");
        this.f85543a = r2;
        this.f85544b = r3;
        this.f85545c = r4;
        this.d = r5;
        this.f85546e = r6;
        this.f85547f = r7;
        this.f85548g = r8;
        this.f85549h = r9;
        this.f85550i = r10;
    }

    public final String a() {
        return this.f85549h;
    }

    public final String b() {
        return this.f85544b;
    }

    public final String c() {
        return this.f85546e;
    }

    public final OrderNegoSideType d() {
        return this.d;
    }

    public final String e() {
        return this.f85550i;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof j) == true) goto L8;
        return false;
    L8:
        j r52 = (j) r5;
        if (p.g(this.f85543a, r52.f85543a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f85544b, r52.f85544b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f85545c, r52.f85545c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (p.g(this.f85546e, r52.f85546e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f85547f, r52.f85547f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f85548g, r52.f85548g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f85549h, r52.f85549h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f85550i, r52.f85550i) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public final String f() {
        return this.f85545c;
    }

    public final String g() {
        return this.f85543a;
    }

    public final String h() {
        return this.f85548g;
    }

    public int hashCode() {
        return (((((((((((((((this.f85543a.hashCode() * 31) + this.f85544b.hashCode()) * 31) + this.f85545c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f85546e.hashCode()) * 31) + this.f85547f.hashCode()) * 31) + this.f85548g.hashCode()) * 31) + this.f85549h.hashCode()) * 31) + this.f85550i.hashCode();
    }

    public final String i() {
        return this.f85547f;
    }

    public String toString() {
        return "OrderNegoQueueEntity(sequenceNumber=" + this.f85543a + ", orderId=" + this.f85544b + ", referenceId=" + this.f85545c + ", orderSide=" + this.d + ", orderPrice=" + this.f85546e + ", status=" + this.f85547f + ", shares=" + this.f85548g + ", broker=" + this.f85549h + ", queuedAt=" + this.f85550i + ")";
    }
}

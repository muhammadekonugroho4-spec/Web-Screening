package com.stockbit.domain.model.company.brokerflow;

import com.google.firebase.messaging.Constants;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Date f81414a;

    /* renamed from: b, reason: collision with root package name */
    public final Date f81415b;

    /* renamed from: c, reason: collision with root package name */
    public final Date f81416c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f81417e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f81418f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f81419g;

    public a(Date r2, Date r3, Date r4, List r5, Map r6, Map r7, Map r8) {
        p.l(r2, Constants.MessagePayloadKeys.FROM);
        p.l(r3, "to");
        p.l(r4, "lastUpdated");
        p.l(r5, "chartDataPrice");
        p.l(r6, "chartDataBrokersValue");
        p.l(r7, "chartDataBrokersVolume");
        p.l(r8, "chartDataBrokersNetValue");
        this.f81414a = r2;
        this.f81415b = r3;
        this.f81416c = r4;
        this.d = r5;
        this.f81417e = r6;
        this.f81418f = r7;
        this.f81419g = r8;
    }

    public final Map a() {
        return this.f81419g;
    }

    public final Map b() {
        return this.f81417e;
    }

    public final Map c() {
        return this.f81418f;
    }

    public final List d() {
        return this.d;
    }

    public final Date e() {
        return this.f81414a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f81414a, r52.f81414a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81415b, r52.f81415b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f81416c, r52.f81416c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f81417e, r52.f81417e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f81418f, r52.f81418f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f81419g, r52.f81419g) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public final Date f() {
        return this.f81415b;
    }

    public int hashCode() {
        return (((((((((((this.f81414a.hashCode() * 31) + this.f81415b.hashCode()) * 31) + this.f81416c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f81417e.hashCode()) * 31) + this.f81418f.hashCode()) * 31) + this.f81419g.hashCode();
    }

    public String toString() {
        return "BrokerFlowEntity(from=" + this.f81414a + ", to=" + this.f81415b + ", lastUpdated=" + this.f81416c + ", chartDataPrice=" + this.d + ", chartDataBrokersValue=" + this.f81417e + ", chartDataBrokersVolume=" + this.f81418f + ", chartDataBrokersNetValue=" + this.f81419g + ")";
    }
}

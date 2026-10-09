package com.stockbit.domain.model.brokeractivity;

import com.google.firebase.messaging.Constants;

/* loaded from: classes8.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final String f80941a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80942b;

    /* renamed from: c, reason: collision with root package name */
    public final String f80943c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final w f80944e;

    public v(String r2, String r3, String r4, String r5, w r6) {
        kotlin.jvm.internal.p.l(r2, Constants.MessagePayloadKeys.FROM);
        kotlin.jvm.internal.p.l(r3, "to");
        kotlin.jvm.internal.p.l(r4, "brokerCode");
        kotlin.jvm.internal.p.l(r5, "brokerName");
        kotlin.jvm.internal.p.l(r6, "transaction");
        this.f80941a = r2;
        this.f80942b = r3;
        this.f80943c = r4;
        this.d = r5;
        this.f80944e = r6;
    }

    public final String a() {
        return this.f80941a;
    }

    public final String b() {
        return this.f80942b;
    }

    public final w c() {
        return this.f80944e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof v) == true) goto L8;
        return false;
    L8:
        v r52 = (v) r5;
        if (kotlin.jvm.internal.p.g(this.f80941a, r52.f80941a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f80942b, r52.f80942b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f80943c, r52.f80943c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f80944e, r52.f80944e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f80941a.hashCode() * 31) + this.f80942b.hashCode()) * 31) + this.f80943c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f80944e.hashCode();
    }

    public String toString() {
        return "BrokerActivityListEntity(from=" + this.f80941a + ", to=" + this.f80942b + ", brokerCode=" + this.f80943c + ", brokerName=" + this.d + ", transaction=" + this.f80944e + ")";
    }
}

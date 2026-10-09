package com.stockbit.domain.model.brokeractivity;

import com.google.firebase.messaging.Constants;

/* loaded from: classes8.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final String f80929a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80930b;

    /* renamed from: c, reason: collision with root package name */
    public final String f80931c;

    public s(String r2, String r3, String r4) {
        kotlin.jvm.internal.p.l(r2, Constants.MessagePayloadKeys.FROM);
        kotlin.jvm.internal.p.l(r3, "to");
        kotlin.jvm.internal.p.l(r4, "idx");
        this.f80929a = r2;
        this.f80930b = r3;
        this.f80931c = r4;
    }

    public final String a() {
        return this.f80929a;
    }

    public final String b() {
        return this.f80931c;
    }

    public final String c() {
        return this.f80930b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof s) == true) goto L8;
        return false;
    L8:
        s r52 = (s) r5;
        if (kotlin.jvm.internal.p.g(this.f80929a, r52.f80929a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f80930b, r52.f80930b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f80931c, r52.f80931c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f80929a.hashCode() * 31) + this.f80930b.hashCode()) * 31) + this.f80931c.hashCode();
    }

    public String toString() {
        return "BrokerActivityDateEntity(from=" + this.f80929a + ", to=" + this.f80930b + ", idx=" + this.f80931c + ")";
    }
}

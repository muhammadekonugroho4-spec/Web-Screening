package com.stockbit.domain.model.valueobject;

import com.google.firebase.messaging.Constants;

/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f86847a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86848b;

    /* renamed from: c, reason: collision with root package name */
    public final String f86849c;
    public final String d;

    public j(String r2, String r3, String r4, String r5) {
        kotlin.jvm.internal.p.l(r2, "createdAt");
        kotlin.jvm.internal.p.l(r3, Constants.MessagePayloadKeys.FROM);
        kotlin.jvm.internal.p.l(r4, com.clevertap.android.sdk.Constants.KEY_ID);
        kotlin.jvm.internal.p.l(r5, "stock");
        this.f86847a = r2;
        this.f86848b = r3;
        this.f86849c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f86847a;
    }

    public final String b() {
        return this.f86848b;
    }

    public final String c() {
        return this.f86849c;
    }

    public final String d() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof j) == true) goto L8;
        return false;
    L8:
        j r52 = (j) r5;
        if (kotlin.jvm.internal.p.g(this.f86847a, r52.f86847a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f86848b, r52.f86848b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f86849c, r52.f86849c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f86847a.hashCode() * 31) + this.f86848b.hashCode()) * 31) + this.f86849c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "ReferralHistory(createdAt=" + this.f86847a + ", from=" + this.f86848b + ", id=" + this.f86849c + ", stock=" + this.d + ')';
    }
}

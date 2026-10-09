package com.stockbit.domain.model.user;

import com.google.gson.JsonObject;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f86631a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86632b;

    /* renamed from: c, reason: collision with root package name */
    public final JsonObject f86633c;

    public e(String r2, String r3, JsonObject r4) {
        kotlin.jvm.internal.p.l(r2, "token");
        kotlin.jvm.internal.p.l(r3, "nextState");
        this.f86631a = r2;
        this.f86632b = r3;
        this.f86633c = r4;
    }

    public final String a() {
        return this.f86632b;
    }

    public final JsonObject b() {
        return this.f86633c;
    }

    public final String c() {
        return this.f86631a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (kotlin.jvm.internal.p.g(this.f86631a, r52.f86631a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f86632b, r52.f86632b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f86633c, r52.f86633c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int r02 = ((this.f86631a.hashCode() * 31) + this.f86632b.hashCode()) * 31;
        JsonObject r1 = this.f86633c;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "ForgotPasswordEntity(token=" + this.f86631a + ", nextState=" + this.f86632b + ", supportingData=" + this.f86633c + ")";
    }
}

package com.stockbit.domain.model.auth;

import com.google.gson.JsonObject;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f80641a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80642b;

    /* renamed from: c, reason: collision with root package name */
    public final JsonObject f80643c;

    public d(String r2, String r3, JsonObject r4) {
        p.l(r2, "token");
        p.l(r3, "nextState");
        this.f80641a = r2;
        this.f80642b = r3;
        this.f80643c = r4;
    }

    public final String a() {
        return this.f80642b;
    }

    public final JsonObject b() {
        return this.f80643c;
    }

    public final String c() {
        return this.f80641a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f80641a, r52.f80641a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f80642b, r52.f80642b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f80643c, r52.f80643c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int r02 = ((this.f80641a.hashCode() * 31) + this.f80642b.hashCode()) * 31;
        JsonObject r1 = this.f80643c;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "ForgotPinEntity(token=" + this.f80641a + ", nextState=" + this.f80642b + ", supportingData=" + this.f80643c + ")";
    }
}

package com.stockbit.domain.model.verification;

import com.google.gson.JsonObject;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f87214a;

    /* renamed from: b, reason: collision with root package name */
    public final JsonObject f87215b;

    public d(String r2, JsonObject r3) {
        p.l(r2, "nextChallenge");
        this.f87214a = r2;
        this.f87215b = r3;
    }

    public final String a() {
        return this.f87214a;
    }

    public final JsonObject b() {
        return this.f87215b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f87214a, r52.f87214a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f87215b, r52.f87215b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int r02 = this.f87214a.hashCode() * 31;
        JsonObject r1 = this.f87215b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "VerificationChallengeEntity(nextChallenge=" + this.f87214a + ", supportingData=" + this.f87215b + ")";
    }
}

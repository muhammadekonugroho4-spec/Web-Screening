package com.appmattus.certificatetransparency;

import java.time.Instant;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class k implements m {

    /* renamed from: a, reason: collision with root package name */
    public final Instant f32299a;

    /* renamed from: b, reason: collision with root package name */
    public final Instant f32300b;

    public k(Instant r2, Instant r3) {
        p.l(r2, "timestamp");
        p.l(r3, "logServerValidUntil");
        this.f32299a = r2;
        this.f32300b = r3;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof k) == true) goto L8;
        return false;
    L8:
        k r52 = (k) r5;
        if (p.g(this.f32299a, r52.f32299a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f32300b, r52.f32300b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f32299a.hashCode() * 31) + this.f32300b.hashCode();
    }

    public String toString() {
        return "SCT timestamp, " + this.f32299a + ", is greater than the log server validity, " + this.f32300b + '.';
    }
}

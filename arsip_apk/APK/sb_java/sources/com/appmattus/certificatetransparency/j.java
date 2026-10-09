package com.appmattus.certificatetransparency;

import java.time.Instant;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class j implements m {

    /* renamed from: a, reason: collision with root package name */
    public final Instant f32297a;

    /* renamed from: b, reason: collision with root package name */
    public final Instant f32298b;

    public j(Instant r2, Instant r3) {
        p.l(r2, "timestamp");
        p.l(r3, "now");
        this.f32297a = r2;
        this.f32298b = r3;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof j) == true) goto L8;
        return false;
    L8:
        j r52 = (j) r5;
        if (p.g(this.f32297a, r52.f32297a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f32298b, r52.f32298b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f32297a.hashCode() * 31) + this.f32298b.hashCode();
    }

    public String toString() {
        return "SCT timestamp, " + this.f32297a + ", is in the future, current timestamp is " + this.f32298b + '.';
    }
}

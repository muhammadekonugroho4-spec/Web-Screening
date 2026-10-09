package com.stockbit.domain.model.screener;

import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f84886a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84887b;

    /* renamed from: c, reason: collision with root package name */
    public final double f84888c;
    public final String d;

    public f(int r2, String r3, double r4, String r6) {
        p.l(r3, "item");
        p.l(r6, Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
        this.f84886a = r2;
        this.f84887b = r3;
        this.f84888c = r4;
        this.d = r6;
    }

    public final String a() {
        return this.d;
    }

    public final int b() {
        return this.f84886a;
    }

    public final String c() {
        return this.f84887b;
    }

    public final double d() {
        return this.f84888c;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof f) == true) goto L8;
        return false;
    L8:
        f r82 = (f) r8;
        if (this.f84886a == r82.f84886a) goto L12;
        return false;
    L12:
        if (p.g(this.f84887b, r82.f84887b) == true) goto L15;
        return false;
    L15:
        if (Double.compare(this.f84888c, r82.f84888c) == 0) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f84886a) * 31) + this.f84887b.hashCode()) * 31) + Double.hashCode(this.f84888c)) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "ScreenerResultsBeanEntity(id=" + this.f84886a + ", item=" + this.f84887b + ", raw=" + this.f84888c + ", display=" + this.d + ")";
    }
}

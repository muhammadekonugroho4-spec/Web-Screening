package com.stockbit.usecase.screener.model;

import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f159734a;

    /* renamed from: b, reason: collision with root package name */
    public final String f159735b;

    /* renamed from: c, reason: collision with root package name */
    public final double f159736c;
    public final String d;

    public f(int r2, String r3, double r4, String r6) {
        p.l(r3, "item");
        p.l(r6, Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
        this.f159734a = r2;
        this.f159735b = r3;
        this.f159736c = r4;
        this.d = r6;
    }

    public final String a() {
        return this.d;
    }

    public final int b() {
        return this.f159734a;
    }

    public final String c() {
        return this.f159735b;
    }

    public final double d() {
        return this.f159736c;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof f) == true) goto L8;
        return false;
    L8:
        f r82 = (f) r8;
        if (this.f159734a == r82.f159734a) goto L12;
        return false;
    L12:
        if (p.g(this.f159735b, r82.f159735b) == true) goto L15;
        return false;
    L15:
        if (Double.compare(this.f159736c, r82.f159736c) == 0) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f159734a) * 31) + this.f159735b.hashCode()) * 31) + Double.hashCode(this.f159736c)) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "ScreenerResultsBeanUIState(id=" + this.f159734a + ", item=" + this.f159735b + ", raw=" + this.f159736c + ", display=" + this.d + ")";
    }
}

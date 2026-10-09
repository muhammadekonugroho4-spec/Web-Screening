package com.stockbit.domain.model.company.runningtrade;

import com.clevertap.android.sdk.Constants;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f81872a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f81873b;

    /* renamed from: c, reason: collision with root package name */
    public final long f81874c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public final String f81875e;

    public b(boolean r2, boolean r3, long r4, List r6, String r7) {
        p.l(r6, "runningTrade");
        p.l(r7, Constants.KEY_DATE);
        this.f81872a = r2;
        this.f81873b = r3;
        this.f81874c = r4;
        this.d = r6;
        this.f81875e = r7;
    }

    public final String a() {
        return this.f81875e;
    }

    public final List b() {
        return this.d;
    }

    public final boolean c() {
        return this.f81872a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof b) == true) goto L8;
        return false;
    L8:
        b r82 = (b) r8;
        if (this.f81872a == r82.f81872a) goto L12;
        return false;
    L12:
        if (this.f81873b == r82.f81873b) goto L15;
        return false;
    L15:
        if (this.f81874c == r82.f81874c) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f81875e, r82.f81875e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.f81872a) * 31) + Boolean.hashCode(this.f81873b)) * 31) + Long.hashCode(this.f81874c)) * 31) + this.d.hashCode()) * 31) + this.f81875e.hashCode();
    }

    public String toString() {
        return "RunningTradeEntity(isOpenMarket=" + this.f81872a + ", isShowBs=" + this.f81873b + ", breakTimeLeftSeconds=" + this.f81874c + ", runningTrade=" + this.d + ", date=" + this.f81875e + ")";
    }
}

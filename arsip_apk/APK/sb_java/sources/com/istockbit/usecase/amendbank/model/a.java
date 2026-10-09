package com.istockbit.usecase.amendbank.model;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f41000a;

    /* renamed from: b, reason: collision with root package name */
    public final long f41001b;

    /* renamed from: c, reason: collision with root package name */
    public final int f41002c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final String f41003e;

    public a(boolean r2, long r3, int r5, int r6, String r7) {
        p.l(r7, "triggerEvent");
        this.f41000a = r2;
        this.f41001b = r3;
        this.f41002c = r5;
        this.d = r6;
        this.f41003e = r7;
    }

    public final long a() {
        return this.f41001b;
    }

    public final int b() {
        return this.f41002c;
    }

    public final int c() {
        return this.d;
    }

    public final String d() {
        return this.f41003e;
    }

    public final boolean e() {
        return this.f41000a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (this.f41000a == r82.f41000a) goto L12;
        return false;
    L12:
        if (this.f41001b == r82.f41001b) goto L15;
        return false;
    L15:
        if (this.f41002c == r82.f41002c) goto L18;
        return false;
    L18:
        if (this.d == r82.d) goto L21;
        return false;
    L21:
        if (p.g(this.f41003e, r82.f41003e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.f41000a) * 31) + Long.hashCode(this.f41001b)) * 31) + Integer.hashCode(this.f41002c)) * 31) + Integer.hashCode(this.d)) * 31) + this.f41003e.hashCode();
    }

    public String toString() {
        return "SuspensionStatusUIState(isSuspended=" + this.f41000a + ", expiredTimeInMillis=" + this.f41001b + ", hours=" + this.f41002c + ", minutes=" + this.d + ", triggerEvent=" + this.f41003e + ")";
    }

    public /* synthetic */ a(boolean r8, long r9, int r11, int r12, String r13, int r14, i r15) {
        if ((r14 & 2) == 0) goto L5;
        r9 = 0;
    L5:
        long r2 = r9;
        if ((r14 & 4) == 0) goto L8;
        int r4 = 0;
    L10:
        if ((r14 & 8) == 0) goto L12;
        int r5 = 0;
    L14:
        if ((r14 & 16) == 0) goto L16;
        r13 = "";
    L16:
        this(r8, r2, r4, r5, r13);
        return;
    L12:
        r5 = r12;
        goto L14
    L8:
        r4 = r11;
        goto L10
    }
}

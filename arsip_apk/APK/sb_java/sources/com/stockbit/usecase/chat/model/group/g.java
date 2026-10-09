package com.stockbit.usecase.chat.model.group;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f155552a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f155553b;

    /* renamed from: c, reason: collision with root package name */
    public final int f155554c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final int f155555e;

    /* renamed from: f, reason: collision with root package name */
    public final long f155556f;

    public g(boolean r2, boolean r3, int r4, String r5, int r6, long r7) {
        p.l(r5, "roomName");
        this.f155552a = r2;
        this.f155553b = r3;
        this.f155554c = r4;
        this.d = r5;
        this.f155555e = r6;
        this.f155556f = r7;
    }

    public final int a() {
        return this.f155554c;
    }

    public final long b() {
        return this.f155556f;
    }

    public final String c() {
        return this.d;
    }

    public final int d() {
        return this.f155555e;
    }

    public final boolean e() {
        return this.f155552a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof g) == true) goto L8;
        return false;
    L8:
        g r82 = (g) r8;
        if (this.f155552a == r82.f155552a) goto L12;
        return false;
    L12:
        if (this.f155553b == r82.f155553b) goto L15;
        return false;
    L15:
        if (this.f155554c == r82.f155554c) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (this.f155555e == r82.f155555e) goto L24;
        return false;
    L24:
        if (this.f155556f == r82.f155556f) goto L26;
        return false;
    L26:
        return true;
    }

    public final boolean f() {
        return this.f155553b;
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.f155552a) * 31) + Boolean.hashCode(this.f155553b)) * 31) + Integer.hashCode(this.f155554c)) * 31) + this.d.hashCode()) * 31) + Integer.hashCode(this.f155555e)) * 31) + Long.hashCode(this.f155556f);
    }

    public String toString() {
        return "LeaveGroupUIState(isAdmin=" + this.f155552a + ", isOnlyAdminLeft=" + this.f155553b + ", groupId=" + this.f155554c + ", roomName=" + this.d + ", totalAdmin=" + this.f155555e + ", roomId=" + this.f155556f + ")";
    }
}

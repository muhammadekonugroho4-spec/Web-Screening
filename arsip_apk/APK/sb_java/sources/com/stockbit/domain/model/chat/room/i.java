package com.stockbit.domain.model.chat.room;

import com.stockbit.domain.model.profile.VerifiedStatusType;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f81353a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f81354b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f81355c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f81356e;

    /* renamed from: f, reason: collision with root package name */
    public final VerifiedStatusType f81357f;

    public i(int r2, boolean r3, boolean r4, boolean r5, boolean r6, VerifiedStatusType r7) {
        p.l(r7, "verifiedStatus");
        this.f81353a = r2;
        this.f81354b = r3;
        this.f81355c = r4;
        this.d = r5;
        this.f81356e = r6;
        this.f81357f = r7;
    }

    public final int a() {
        return this.f81353a;
    }

    public final VerifiedStatusType b() {
        return this.f81357f;
    }

    public final boolean c() {
        return this.f81355c;
    }

    public final boolean d() {
        return this.f81356e;
    }

    public final boolean e() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof i) == true) goto L8;
        return false;
    L8:
        i r52 = (i) r5;
        if (this.f81353a == r52.f81353a) goto L12;
        return false;
    L12:
        if (this.f81354b == r52.f81354b) goto L15;
        return false;
    L15:
        if (this.f81355c == r52.f81355c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (this.f81356e == r52.f81356e) goto L24;
        return false;
    L24:
        if (this.f81357f == r52.f81357f) goto L26;
        return false;
    L26:
        return true;
    }

    public final boolean f() {
        return this.f81354b;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f81353a) * 31) + Boolean.hashCode(this.f81354b)) * 31) + Boolean.hashCode(this.f81355c)) * 31) + Boolean.hashCode(this.d)) * 31) + Boolean.hashCode(this.f81356e)) * 31) + this.f81357f.hashCode();
    }

    public String toString() {
        return "RoomPersonalEntity(userId=" + this.f81353a + ", isVerified=" + this.f81354b + ", isAdmin=" + this.f81355c + ", isDeactivated=" + this.d + ", isBlocked=" + this.f81356e + ", verifiedStatus=" + this.f81357f + ")";
    }
}

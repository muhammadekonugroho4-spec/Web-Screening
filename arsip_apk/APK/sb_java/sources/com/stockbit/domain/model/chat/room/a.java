package com.stockbit.domain.model.chat.room;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final List f81323a;

    /* renamed from: b, reason: collision with root package name */
    public final int f81324b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f81325c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f81326e;

    public a(List r2, int r3, boolean r4, int r5, boolean r6) {
        p.l(r2, "rooms");
        this.f81323a = r2;
        this.f81324b = r3;
        this.f81325c = r4;
        this.d = r5;
        this.f81326e = r6;
    }

    public static /* synthetic */ a b(a r02, List r1, int r2, boolean r3, int r4, boolean r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r02.f81323a;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r02.f81324b;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = r02.f81325c;
    L12:
        if ((r6 & 8) == 0) goto L15;
        r4 = r02.d;
    L15:
        if ((r6 & 16) == 0) goto L17;
        r5 = r02.f81326e;
    L17:
        int r62 = r4;
        boolean r72 = r5;
        boolean r52 = r3;
        List r32 = r1;
        return r02.a(r32, r2, r52, r62, r72);
    }

    public final a a(List r8, int r9, boolean r10, int r11, boolean r12) {
        p.l(r8, "rooms");
        return new a(r8, r9, r10, r11, r12);
    }

    public final List c() {
        return this.f81323a;
    }

    public final int d() {
        return this.d;
    }

    public final boolean e() {
        return this.f81326e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f81323a, r52.f81323a) == true) goto L12;
        return false;
    L12:
        if (this.f81324b == r52.f81324b) goto L15;
        return false;
    L15:
        if (this.f81325c == r52.f81325c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (this.f81326e == r52.f81326e) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f81323a.hashCode() * 31) + Integer.hashCode(this.f81324b)) * 31) + Boolean.hashCode(this.f81325c)) * 31) + Integer.hashCode(this.d)) * 31) + Boolean.hashCode(this.f81326e);
    }

    public String toString() {
        return "ListRoomEntity(rooms=" + this.f81323a + ", totalInvited=" + this.f81324b + ", hasRequest=" + this.f81325c + ", unreadRequest=" + this.d + ", isLastPage=" + this.f81326e + ")";
    }
}

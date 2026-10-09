package com.stockbit.domain.model.chat.room;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final i f81331a;

    /* renamed from: b, reason: collision with root package name */
    public final f f81332b;

    public d(i r1, f r2) {
        this.f81331a = r1;
        this.f81332b = r2;
    }

    public final f a() {
        return this.f81332b;
    }

    public final i b() {
        return this.f81331a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f81331a, r52.f81331a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81332b, r52.f81332b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        i r02 = this.f81331a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        f r2 = this.f81332b;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "RoomAttributeEntity(personal=" + this.f81331a + ", group=" + this.f81332b + ")";
    }

    public /* synthetic */ d(i r2, f r3, int r4, kotlin.jvm.internal.i r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = null;
    L8:
        this(r2, r3);
    }
}

package com.stockbit.domain.model.chat.room;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f81360a;

    /* renamed from: b, reason: collision with root package name */
    public final RoomType f81361b;

    /* renamed from: c, reason: collision with root package name */
    public final g f81362c;
    public final RoomStateType d;

    /* renamed from: e, reason: collision with root package name */
    public final o f81363e;

    public k(int r2, RoomType r3, g r4, RoomStateType r5, o r6) {
        p.l(r3, "type");
        p.l(r4, "info");
        p.l(r5, RemoteConfigConstants.ResponseFieldKey.STATE);
        p.l(r6, "unreadMessage");
        this.f81360a = r2;
        this.f81361b = r3;
        this.f81362c = r4;
        this.d = r5;
        this.f81363e = r6;
    }

    public final int a() {
        return this.f81360a;
    }

    public final g b() {
        return this.f81362c;
    }

    public final RoomStateType c() {
        return this.d;
    }

    public final RoomType d() {
        return this.f81361b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof k) == true) goto L8;
        return false;
    L8:
        k r52 = (k) r5;
        if (this.f81360a == r52.f81360a) goto L12;
        return false;
    L12:
        if (this.f81361b == r52.f81361b) goto L15;
        return false;
    L15:
        if (p.g(this.f81362c, r52.f81362c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (p.g(this.f81363e, r52.f81363e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.f81360a) * 31) + this.f81361b.hashCode()) * 31) + this.f81362c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f81363e.hashCode();
    }

    public String toString() {
        return "RoomSmallEntity(id=" + this.f81360a + ", type=" + this.f81361b + ", info=" + this.f81362c + ", state=" + this.d + ", unreadMessage=" + this.f81363e + ")";
    }
}

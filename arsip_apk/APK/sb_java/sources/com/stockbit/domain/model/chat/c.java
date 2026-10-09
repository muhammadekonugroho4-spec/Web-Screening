package com.stockbit.domain.model.chat;

import com.stockbit.domain.model.chat.room.k;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final k f81196a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81197b;

    /* renamed from: c, reason: collision with root package name */
    public final List f81198c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final String f81199e;

    public c(k r2, String r3, List r4, int r5, String r6) {
        p.l(r2, "room");
        p.l(r3, "createdBy");
        p.l(r4, "members");
        p.l(r6, "remainingMembers");
        this.f81196a = r2;
        this.f81197b = r3;
        this.f81198c = r4;
        this.d = r5;
        this.f81199e = r6;
    }

    public final String a() {
        return this.f81197b;
    }

    public final List b() {
        return this.f81198c;
    }

    public final String c() {
        return this.f81199e;
    }

    public final k d() {
        return this.f81196a;
    }

    public final int e() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f81196a, r52.f81196a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81197b, r52.f81197b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f81198c, r52.f81198c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (p.g(this.f81199e, r52.f81199e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f81196a.hashCode() * 31) + this.f81197b.hashCode()) * 31) + this.f81198c.hashCode()) * 31) + Integer.hashCode(this.d)) * 31) + this.f81199e.hashCode();
    }

    public String toString() {
        return "InvitationPreviewEntity(room=" + this.f81196a + ", createdBy=" + this.f81197b + ", members=" + this.f81198c + ", totalMembers=" + this.d + ", remainingMembers=" + this.f81199e + ")";
    }
}

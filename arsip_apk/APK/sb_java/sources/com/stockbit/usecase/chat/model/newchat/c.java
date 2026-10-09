package com.stockbit.usecase.chat.model.newchat;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final b f155584a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f155585b;

    public c(b r2, boolean r3) {
        p.l(r2, "memberInfo");
        this.f155584a = r2;
        this.f155585b = r3;
    }

    public final b a() {
        return this.f155584a;
    }

    public final boolean b() {
        return this.f155585b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f155584a, r52.f155584a) == true) goto L12;
        return false;
    L12:
        if (this.f155585b == r52.f155585b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f155584a.hashCode() * 31) + Boolean.hashCode(this.f155585b);
    }

    public String toString() {
        return "MemberUserUIState(memberInfo=" + this.f155584a + ", isGroupMember=" + this.f155585b + ")";
    }
}

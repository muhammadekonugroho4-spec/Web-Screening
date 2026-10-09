package com.stockbit.usecase.chat.model.group;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final com.stockbit.usecase.chat.model.newchat.b f155541a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f155542b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f155543c;
    public final boolean d;

    public d(com.stockbit.usecase.chat.model.newchat.b r2, boolean r3, boolean r4, boolean r5) {
        p.l(r2, "user");
        this.f155541a = r2;
        this.f155542b = r3;
        this.f155543c = r4;
        this.d = r5;
    }

    public final com.stockbit.usecase.chat.model.newchat.b a() {
        return this.f155541a;
    }

    public final boolean b() {
        return this.f155542b;
    }

    public final boolean c() {
        return this.d;
    }

    public final boolean d() {
        return this.f155543c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f155541a, r52.f155541a) == true) goto L12;
        return false;
    L12:
        if (this.f155542b == r52.f155542b) goto L15;
        return false;
    L15:
        if (this.f155543c == r52.f155543c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f155541a.hashCode() * 31) + Boolean.hashCode(this.f155542b)) * 31) + Boolean.hashCode(this.f155543c)) * 31) + Boolean.hashCode(this.d);
    }

    public String toString() {
        return "GroupMemberUIState(user=" + this.f155541a + ", isAdmin=" + this.f155542b + ", isRoomAccepted=" + this.f155543c + ", isInteractable=" + this.d + ")";
    }
}

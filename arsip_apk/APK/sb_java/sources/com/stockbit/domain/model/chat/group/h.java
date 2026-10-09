package com.stockbit.domain.model.chat.group;

import androidx.core.app.NotificationCompat;
import com.stockbit.domain.model.chat.user.MemberEntity;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final MemberEntity f81224a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81225b;

    /* renamed from: c, reason: collision with root package name */
    public final String f81226c;
    public final boolean d;

    public h(MemberEntity r2, String r3, String r4, boolean r5) {
        kotlin.jvm.internal.p.l(r2, "user");
        kotlin.jvm.internal.p.l(r3, "role");
        kotlin.jvm.internal.p.l(r4, NotificationCompat.CATEGORY_STATUS);
        this.f81224a = r2;
        this.f81225b = r3;
        this.f81226c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f81225b;
    }

    public final String b() {
        return this.f81226c;
    }

    public final MemberEntity c() {
        return this.f81224a;
    }

    public final boolean d() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof h) == true) goto L8;
        return false;
    L8:
        h r52 = (h) r5;
        if (kotlin.jvm.internal.p.g(this.f81224a, r52.f81224a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f81225b, r52.f81225b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f81226c, r52.f81226c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f81224a.hashCode() * 31) + this.f81225b.hashCode()) * 31) + this.f81226c.hashCode()) * 31) + Boolean.hashCode(this.d);
    }

    public String toString() {
        return "GroupMemberEntity(user=" + this.f81224a + ", role=" + this.f81225b + ", status=" + this.f81226c + ", isInteractable=" + this.d + ")";
    }
}

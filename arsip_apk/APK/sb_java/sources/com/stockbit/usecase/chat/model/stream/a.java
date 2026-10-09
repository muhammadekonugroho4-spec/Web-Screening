package com.stockbit.usecase.chat.model.stream;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final List f155668a;

    /* renamed from: b, reason: collision with root package name */
    public final String f155669b;

    public a(List r2, String r3) {
        p.l(r2, "users");
        this.f155668a = r2;
        this.f155669b = r3;
    }

    public final String a() {
        return this.f155669b;
    }

    public final List b() {
        return this.f155668a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f155668a, r52.f155668a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f155669b, r52.f155669b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int r02 = this.f155668a.hashCode() * 31;
        String r1 = this.f155669b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "FollowingActivityUIState(users=" + this.f155668a + ", info=" + this.f155669b + ")";
    }
}

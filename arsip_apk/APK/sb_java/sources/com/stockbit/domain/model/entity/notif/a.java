package com.stockbit.domain.model.entity.notif;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f82790a;

    /* renamed from: b, reason: collision with root package name */
    public List f82791b;

    public a(int r2, List r3) {
        p.l(r3, "result");
        this.f82790a = r2;
        this.f82791b = r3;
    }

    public final int a() {
        return this.f82790a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f82790a == r52.f82790a) goto L12;
        return false;
    L12:
        if (p.g(this.f82791b, r52.f82791b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f82790a) * 31) + this.f82791b.hashCode();
    }

    public String toString() {
        return "NotificationPage(unread=" + this.f82790a + ", result=" + this.f82791b + ')';
    }
}

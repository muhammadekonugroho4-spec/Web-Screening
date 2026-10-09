package com.stockbit.domain.model.frienddiscovery;

import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f84067a;

    /* renamed from: b, reason: collision with root package name */
    public final int f84068b;

    public a(String r2, int r3) {
        p.l(r2, NotificationCompat.CATEGORY_STATUS);
        this.f84067a = r2;
        this.f84068b = r3;
    }

    public final String a() {
        return this.f84067a;
    }

    public final int b() {
        return this.f84068b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f84067a, r52.f84067a) == true) goto L12;
        return false;
    L12:
        if (this.f84068b == r52.f84068b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f84067a.hashCode() * 31) + Integer.hashCode(this.f84068b);
    }

    public String toString() {
        return "ContactStatusEntity(status=" + this.f84067a + ", total=" + this.f84068b + ")";
    }
}

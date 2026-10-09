package com.stockbit.domain.model.openingaccount;

import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final OAProgressStatusType f84529a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84530b;

    public e(OAProgressStatusType r2, String r3) {
        p.l(r2, NotificationCompat.CATEGORY_STATUS);
        p.l(r3, "stage");
        this.f84529a = r2;
        this.f84530b = r3;
    }

    public final String a() {
        return this.f84530b;
    }

    public final OAProgressStatusType b() {
        return this.f84529a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (this.f84529a == r52.f84529a) goto L12;
        return false;
    L12:
        if (p.g(this.f84530b, r52.f84530b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f84529a.hashCode() * 31) + this.f84530b.hashCode();
    }

    public String toString() {
        return "OAKycStatusEntity(status=" + this.f84529a + ", stage=" + this.f84530b + ")";
    }
}

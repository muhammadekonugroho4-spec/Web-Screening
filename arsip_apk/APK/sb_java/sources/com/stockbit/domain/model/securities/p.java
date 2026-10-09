package com.stockbit.domain.model.securities;

import androidx.core.app.NotificationCompat;

/* loaded from: classes8.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final SecuritiesMaintenanceStatusType f85595a;

    public p(SecuritiesMaintenanceStatusType r2) {
        kotlin.jvm.internal.p.l(r2, NotificationCompat.CATEGORY_STATUS);
        this.f85595a = r2;
    }

    public final SecuritiesMaintenanceStatusType a() {
        return this.f85595a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof p) == true) goto L9;
        return false;
    L9:
        if (this.f85595a == ((p) r4).f85595a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f85595a.hashCode();
    }

    public String toString() {
        return "SecuritiesMaintenanceStatusEntity(status=" + this.f85595a + ")";
    }
}

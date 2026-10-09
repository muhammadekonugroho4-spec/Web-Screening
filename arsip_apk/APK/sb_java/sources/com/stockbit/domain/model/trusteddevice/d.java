package com.stockbit.domain.model.trusteddevice;

import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f86126a;

    public d(String r2) {
        p.l(r2, NotificationCompat.CATEGORY_STATUS);
        this.f86126a = r2;
    }

    public final String a() {
        return this.f86126a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof d) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f86126a, ((d) r4).f86126a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f86126a.hashCode();
    }

    public String toString() {
        return "PromptApprovalTrustedDeviceEntity(status=" + this.f86126a + ")";
    }
}

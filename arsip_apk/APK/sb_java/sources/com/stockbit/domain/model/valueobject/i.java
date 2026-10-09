package com.stockbit.domain.model.valueobject;

import com.stockbit.domain.model.type.NotificationDirectionType;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public NotificationDirectionType f86845a;

    /* renamed from: b, reason: collision with root package name */
    public String f86846b;

    public i(NotificationDirectionType r1, String r2) {
        this.f86845a = r1;
        this.f86846b = r2;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof i) == true) goto L8;
        return false;
    L8:
        i r52 = (i) r5;
        if (this.f86845a == r52.f86845a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f86846b, r52.f86846b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        NotificationDirectionType r02 = this.f86845a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f86846b;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "NotificationLinkTo(type=" + this.f86845a + ", identifier=" + this.f86846b + ')';
    }
}

package com.stockbit.domain.model.securities.common;

import androidx.core.app.NotificationCompat;
import com.stockbit.domain.type.CashSweepInfoStatusType;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f85074a;

    /* renamed from: b, reason: collision with root package name */
    public final CashSweepInfoStatusType f85075b;

    /* renamed from: c, reason: collision with root package name */
    public final String f85076c;

    public c(boolean r2, CashSweepInfoStatusType r3, String r4) {
        p.l(r3, NotificationCompat.CATEGORY_STATUS);
        p.l(r4, "ineligibilityReason");
        this.f85074a = r2;
        this.f85075b = r3;
        this.f85076c = r4;
    }

    public final String a() {
        return this.f85076c;
    }

    public final CashSweepInfoStatusType b() {
        return this.f85075b;
    }

    public final boolean c() {
        return this.f85074a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (this.f85074a == r52.f85074a) goto L12;
        return false;
    L12:
        if (this.f85075b == r52.f85075b) goto L15;
        return false;
    L15:
        if (p.g(this.f85076c, r52.f85076c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f85074a) * 31) + this.f85075b.hashCode()) * 31) + this.f85076c.hashCode();
    }

    public String toString() {
        return "CashSweepInfoEntity(isShown=" + this.f85074a + ", status=" + this.f85075b + ", ineligibilityReason=" + this.f85076c + ")";
    }
}

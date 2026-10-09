package com.stockbit.domain.model.entity.securities;

import androidx.core.app.NotificationCompat;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f83489a;

    /* renamed from: b, reason: collision with root package name */
    public final int f83490b;

    /* renamed from: c, reason: collision with root package name */
    public final String f83491c;
    public final String d;

    public e(int r2, int r3, String r4, String r5) {
        kotlin.jvm.internal.p.l(r4, NotificationCompat.CATEGORY_STATUS);
        kotlin.jvm.internal.p.l(r5, "stockCode");
        this.f83489a = r2;
        this.f83490b = r3;
        this.f83491c = r4;
        this.d = r5;
    }

    public final int a() {
        return this.f83489a;
    }

    public final int b() {
        return this.f83490b;
    }

    public final String c() {
        return this.f83491c;
    }

    public final String d() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (this.f83489a == r52.f83489a) goto L12;
        return false;
    L12:
        if (this.f83490b == r52.f83490b) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f83491c, r52.f83491c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f83489a) * 31) + Integer.hashCode(this.f83490b)) * 31) + this.f83491c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "Cashback(amount=" + this.f83489a + ", price=" + this.f83490b + ", status=" + this.f83491c + ", stockCode=" + this.d + ')';
    }
}

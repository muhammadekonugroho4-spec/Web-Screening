package com.stockbit.usecase.trading.contract.entity;

import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final PhotoValidationStatus f163324a;

    /* renamed from: b, reason: collision with root package name */
    public final String f163325b;

    /* renamed from: c, reason: collision with root package name */
    public final String f163326c;

    public a(PhotoValidationStatus r2, String r3, String r4) {
        p.l(r2, NotificationCompat.CATEGORY_STATUS);
        p.l(r3, "titleMessage");
        p.l(r4, "subTitleMessage");
        this.f163324a = r2;
        this.f163325b = r3;
        this.f163326c = r4;
    }

    public final PhotoValidationStatus a() {
        return this.f163324a;
    }

    public final String b() {
        return this.f163326c;
    }

    public final String c() {
        return this.f163325b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f163324a == r52.f163324a) goto L12;
        return false;
    L12:
        if (p.g(this.f163325b, r52.f163325b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f163326c, r52.f163326c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f163324a.hashCode() * 31) + this.f163325b.hashCode()) * 31) + this.f163326c.hashCode();
    }

    public String toString() {
        return "ImageValidationEntity(status=" + this.f163324a + ", titleMessage=" + this.f163325b + ", subTitleMessage=" + this.f163326c + ")";
    }
}

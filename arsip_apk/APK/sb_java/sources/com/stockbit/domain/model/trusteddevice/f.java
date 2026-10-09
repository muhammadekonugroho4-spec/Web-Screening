package com.stockbit.domain.model.trusteddevice;

import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final PromptResultStatusEntity f86135a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86136b;

    /* renamed from: c, reason: collision with root package name */
    public final String f86137c;

    public f(PromptResultStatusEntity r2, String r3, String r4) {
        p.l(r2, NotificationCompat.CATEGORY_STATUS);
        p.l(r3, "acknowledgeToken");
        p.l(r4, "receivedAt");
        this.f86135a = r2;
        this.f86136b = r3;
        this.f86137c = r4;
    }

    public final String a() {
        return this.f86136b;
    }

    public final PromptResultStatusEntity b() {
        return this.f86135a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (this.f86135a == r52.f86135a) goto L12;
        return false;
    L12:
        if (p.g(this.f86136b, r52.f86136b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f86137c, r52.f86137c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f86135a.hashCode() * 31) + this.f86136b.hashCode()) * 31) + this.f86137c.hashCode();
    }

    public String toString() {
        return "PromptResultEntity(status=" + this.f86135a + ", acknowledgeToken=" + this.f86136b + ", receivedAt=" + this.f86137c + ")";
    }
}

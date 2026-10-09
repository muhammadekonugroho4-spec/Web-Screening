package com.stockbit.domain.model.trusteddevice;

import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f86154a;

    /* renamed from: b, reason: collision with root package name */
    public final int f86155b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f86156c;

    public m(String r2, int r3, boolean r4) {
        p.l(r2, NotificationCompat.CATEGORY_STATUS);
        this.f86154a = r2;
        this.f86155b = r3;
        this.f86156c = r4;
    }

    public final boolean a() {
        return this.f86156c;
    }

    public final int b() {
        return this.f86155b;
    }

    public final String c() {
        return this.f86154a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof m) == true) goto L8;
        return false;
    L8:
        m r52 = (m) r5;
        if (p.g(this.f86154a, r52.f86154a) == true) goto L12;
        return false;
    L12:
        if (this.f86155b == r52.f86155b) goto L15;
        return false;
    L15:
        if (this.f86156c == r52.f86156c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f86154a.hashCode() * 31) + Integer.hashCode(this.f86155b)) * 31) + Boolean.hashCode(this.f86156c);
    }

    public String toString() {
        return "TrustedDeviceStatusEntity(status=" + this.f86154a + ", pendingCount=" + this.f86155b + ", close=" + this.f86156c + ")";
    }
}

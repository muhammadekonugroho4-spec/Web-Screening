package com.stockbit.usecase.trusteddevice.model;

import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final TrustedDeviceStatus f164190a;

    /* renamed from: b, reason: collision with root package name */
    public final int f164191b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f164192c;

    public c(TrustedDeviceStatus r2, int r3, boolean r4) {
        p.l(r2, NotificationCompat.CATEGORY_STATUS);
        this.f164190a = r2;
        this.f164191b = r3;
        this.f164192c = r4;
    }

    public final boolean a() {
        return this.f164192c;
    }

    public final int b() {
        return this.f164191b;
    }

    public final TrustedDeviceStatus c() {
        return this.f164190a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (this.f164190a == r52.f164190a) goto L12;
        return false;
    L12:
        if (this.f164191b == r52.f164191b) goto L15;
        return false;
    L15:
        if (this.f164192c == r52.f164192c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f164190a.hashCode() * 31) + Integer.hashCode(this.f164191b)) * 31) + Boolean.hashCode(this.f164192c);
    }

    public String toString() {
        return "TrustedDevicePendingStatus(status=" + this.f164190a + ", pendingCount=" + this.f164191b + ", closed=" + this.f164192c + ')';
    }
}

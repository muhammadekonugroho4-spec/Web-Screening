package com.stockbit.domain.model.verification;

import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f87212a;

    /* renamed from: b, reason: collision with root package name */
    public final String f87213b;

    public c(String r2, String r3) {
        p.l(r2, NotificationCompat.CATEGORY_STATUS);
        p.l(r3, "completionToken");
        this.f87212a = r2;
        this.f87213b = r3;
    }

    public final String a() {
        return this.f87213b;
    }

    public final String b() {
        return this.f87212a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f87212a, r52.f87212a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f87213b, r52.f87213b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f87212a.hashCode() * 31) + this.f87213b.hashCode();
    }

    public String toString() {
        return "ReverseOTPSessionStatusEntity(status=" + this.f87212a + ", completionToken=" + this.f87213b + ")";
    }
}

package com.stockbit.usecase.securities.model.company;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public String f160503a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f160504b;

    /* renamed from: c, reason: collision with root package name */
    public String f160505c;
    public String d;

    public c(String r1, Integer r2, String r3, String r4) {
        this.f160503a = r1;
        this.f160504b = r2;
        this.f160505c = r3;
        this.d = r4;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f160503a, r52.f160503a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f160504b, r52.f160504b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f160505c, r52.f160505c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        String r02 = this.f160503a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Integer r2 = this.f160504b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f160505c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.d;
        if (r25 == null) goto L19;
        r1 = r25.hashCode();
    L19:
        return r06 + r1;
    L13:
        r24 = r23.hashCode();
        goto L14
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "MarketHourUIState(status=" + this.f160503a + ", timeLeft=" + this.f160504b + ", formattedTimeLeft=" + this.f160505c + ", suspendInfo=" + this.d + ")";
    }

    public /* synthetic */ c(String r2, Integer r3, String r4, String r5, int r6, i r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = "";
    L14:
        this(r2, r3, r4, r5);
    }
}

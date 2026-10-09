package com.stockbit.domain.model.valueobject;

import java.util.HashMap;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public String f86841a;

    /* renamed from: b, reason: collision with root package name */
    public String f86842b;

    /* renamed from: c, reason: collision with root package name */
    public HashMap f86843c;
    public HashMap d;

    /* renamed from: e, reason: collision with root package name */
    public i f86844e;

    public h(String r1, String r2, HashMap r3, HashMap r4, i r5) {
        this.f86841a = r1;
        this.f86842b = r2;
        this.f86843c = r3;
        this.d = r4;
        this.f86844e = r5;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof h) == true) goto L8;
        return false;
    L8:
        h r52 = (h) r5;
        if (kotlin.jvm.internal.p.g(this.f86841a, r52.f86841a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f86842b, r52.f86842b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f86843c, r52.f86843c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f86844e, r52.f86844e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        String r02 = this.f86841a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f86842b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        HashMap r23 = this.f86843c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        HashMap r25 = this.d;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        i r27 = this.f86844e;
        if (r27 == null) goto L23;
        r1 = r27.hashCode();
    L23:
        return r07 + r1;
    L17:
        r26 = r25.hashCode();
        goto L18
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
        return "NotificationData(avatar=" + this.f86841a + ", message=" + this.f86842b + ", messageMask=" + this.f86843c + ", messageMaskLegacy=" + this.d + ", linkTo=" + this.f86844e + ')';
    }

    public /* synthetic */ h(String r2, String r3, HashMap r4, HashMap r5, i r6, int r7, kotlin.jvm.internal.i r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r7 & 16) == 0) goto L18;
        i r72 = null;
    L17:
        HashMap r62 = r5;
        HashMap r52 = r4;
        this(r2, r3, r52, r62, r72);
        return;
    L18:
        r72 = r6;
        goto L17
    }
}

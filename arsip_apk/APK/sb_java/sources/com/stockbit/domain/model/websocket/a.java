package com.stockbit.domain.model.websocket;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f87238a;

    /* renamed from: b, reason: collision with root package name */
    public final String f87239b;

    public a(Integer r1, String r2) {
        this.f87238a = r1;
        this.f87239b = r2;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f87238a, r52.f87238a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f87239b, r52.f87239b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        Integer r02 = this.f87238a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f87239b;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "ErrorResponseWebSocket(code=" + this.f87238a + ", message=" + this.f87239b + ')';
    }

    public /* synthetic */ a(Integer r1, String r2, int r3, i r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = null;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = "";
    L8:
        this(r1, r2);
    }
}

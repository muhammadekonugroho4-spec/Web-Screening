package com.stockbit.feature.cryptohistory.ui.detail.state;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f93785a;

    /* renamed from: b, reason: collision with root package name */
    public final String f93786b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f93787c;
    public final CryptoHistoryValueTone d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f93788e;

    static {
    }

    public c(int r2, String r3, Integer r4, CryptoHistoryValueTone r5, boolean r6) {
        p.l(r3, "value");
        p.l(r5, "tone");
        this.f93785a = r2;
        this.f93786b = r3;
        this.f93787c = r4;
        this.d = r5;
        this.f93788e = r6;
    }

    public final int a() {
        return this.f93785a;
    }

    public final CryptoHistoryValueTone b() {
        return this.d;
    }

    public final String c() {
        return this.f93786b;
    }

    public final Integer d() {
        return this.f93787c;
    }

    public final boolean e() {
        return this.f93788e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (this.f93785a == r52.f93785a) goto L12;
        return false;
    L12:
        if (p.g(this.f93786b, r52.f93786b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f93787c, r52.f93787c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (this.f93788e == r52.f93788e) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        int r02 = ((Integer.hashCode(this.f93785a) * 31) + this.f93786b.hashCode()) * 31;
        Integer r1 = this.f93787c;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return ((((r02 + r12) * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.f93788e);
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "CryptoHistoryDetailRowUIData(labelRes=" + this.f93785a + ", value=" + this.f93786b + ", valueRes=" + this.f93787c + ", tone=" + this.d + ", isBold=" + this.f93788e + ')';
    }

    public /* synthetic */ c(int r7, String r8, Integer r9, CryptoHistoryValueTone r10, boolean r11, int r12, i r13) {
        if ((r12 & 2) == 0) goto L5;
        r8 = "";
    L5:
        String r2 = r8;
        if ((r12 & 4) == 0) goto L8;
        r9 = null;
    L8:
        Integer r3 = r9;
        if ((r12 & 8) == 0) goto L11;
        r10 = CryptoHistoryValueTone.DEFAULT;
    L11:
        CryptoHistoryValueTone r4 = r10;
        if ((r12 & 16) == 0) goto L14;
        r11 = false;
    L14:
        this(r7, r2, r3, r4, r11);
    }
}

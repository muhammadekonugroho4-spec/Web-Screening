package com.stockbit.component.dialog.blockingwithtriggerinfo;

import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f70153a;

    /* renamed from: b, reason: collision with root package name */
    public final int f70154b;

    /* renamed from: c, reason: collision with root package name */
    public final String f70155c;
    public final BlockingWithTriggerInfoType d;

    static {
    }

    public h(int r2, int r3, String r4, BlockingWithTriggerInfoType r5) {
        p.l(r4, "trigger");
        p.l(r5, "type");
        this.f70153a = r2;
        this.f70154b = r3;
        this.f70155c = r4;
        this.d = r5;
    }

    public final int a() {
        return this.f70153a;
    }

    public final int b() {
        return this.f70154b;
    }

    public final String c() {
        return this.f70155c;
    }

    public final BlockingWithTriggerInfoType d() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof h) == true) goto L8;
        return false;
    L8:
        h r52 = (h) r5;
        if (this.f70153a == r52.f70153a) goto L12;
        return false;
    L12:
        if (this.f70154b == r52.f70154b) goto L15;
        return false;
    L15:
        if (p.g(this.f70155c, r52.f70155c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f70153a) * 31) + Integer.hashCode(this.f70154b)) * 31) + this.f70155c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "BlockingWithTriggerInfoUIState(hours=" + this.f70153a + ", minutes=" + this.f70154b + ", trigger=" + this.f70155c + ", type=" + this.d + ')';
    }
}

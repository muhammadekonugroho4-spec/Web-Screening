package com.stockbit.lib.pocket.domain.entity;

import com.stockbit.lib.pocket.domain.k;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f120348a;

    /* renamed from: b, reason: collision with root package name */
    public final k f120349b;

    /* renamed from: c, reason: collision with root package name */
    public final String f120350c;

    public c(String r2, k r3, String r4) {
        p.l(r2, "oldKey");
        p.l(r3, "default");
        this.f120348a = r2;
        this.f120349b = r3;
        this.f120350c = r4;
    }

    public final k a() {
        return this.f120349b;
    }

    public final String b() {
        String r02 = this.f120350c;
        if (r02 == null) goto L5;
        return r02;
    L5:
        return this.f120348a;
    }

    public final String c() {
        return this.f120348a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f120348a, r52.f120348a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f120349b, r52.f120349b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f120350c, r52.f120350c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int r02 = ((this.f120348a.hashCode() * 31) + this.f120349b.hashCode()) * 31;
        String r1 = this.f120350c;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "MigrationConfig(oldKey=" + this.f120348a + ", default=" + this.f120349b + ", newKey=" + this.f120350c + ")";
    }
}

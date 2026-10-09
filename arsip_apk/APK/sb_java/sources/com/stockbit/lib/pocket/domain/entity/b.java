package com.stockbit.lib.pocket.domain.entity;

import com.stockbit.lib.pocket.domain.k;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f120345a;

    /* renamed from: b, reason: collision with root package name */
    public final k f120346b;

    /* renamed from: c, reason: collision with root package name */
    public final PocketLevel f120347c;

    public b(String r2, k r3, PocketLevel r4) {
        p.l(r2, "identifier");
        p.l(r3, "defaultValue");
        p.l(r4, "pocketLevel");
        this.f120345a = r2;
        this.f120346b = r3;
        this.f120347c = r4;
    }

    public final k a() {
        return this.f120346b;
    }

    public final String b() {
        return this.f120345a;
    }

    public final PocketLevel c() {
        return this.f120347c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f120345a, r52.f120345a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f120346b, r52.f120346b) == true) goto L15;
        return false;
    L15:
        if (this.f120347c == r52.f120347c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f120345a.hashCode() * 31) + this.f120346b.hashCode()) * 31) + this.f120347c.hashCode();
    }

    public String toString() {
        return "FlagConfig(identifier=" + this.f120345a + ", defaultValue=" + this.f120346b + ", pocketLevel=" + this.f120347c + ")";
    }

    public /* synthetic */ b(String r1, k r2, PocketLevel r3, int r4, i r5) {
        if ((r4 & 4) == 0) goto L5;
        r3 = PocketLevel.LEVEL_USER;
    L5:
        this(r1, r2, r3);
    }
}

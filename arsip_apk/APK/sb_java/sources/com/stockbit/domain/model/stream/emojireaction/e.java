package com.stockbit.domain.model.stream.emojireaction;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f85841a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85842b;

    /* renamed from: c, reason: collision with root package name */
    public final String f85843c;

    public e(String r2, String r3, String r4) {
        p.l(r2, "avatar");
        p.l(r3, "username");
        p.l(r4, "reaction");
        this.f85841a = r2;
        this.f85842b = r3;
        this.f85843c = r4;
    }

    public final String a() {
        return this.f85841a;
    }

    public final String b() {
        return this.f85843c;
    }

    public final String c() {
        return this.f85842b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f85841a, r52.f85841a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f85842b, r52.f85842b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f85843c, r52.f85843c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f85841a.hashCode() * 31) + this.f85842b.hashCode()) * 31) + this.f85843c.hashCode();
    }

    public String toString() {
        return "StreamReactionUserEntity(avatar=" + this.f85841a + ", username=" + this.f85842b + ", reaction=" + this.f85843c + ")";
    }
}

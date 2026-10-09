package com.stockbit.lib.pocket.utils.configurator;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.stockbit.lib.pocket.domain.entity.PocketLevel;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f120397a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f120398b;

    /* renamed from: c, reason: collision with root package name */
    public final PocketLevel f120399c;

    public b(String r2, Object r3, PocketLevel r4) {
        p.l(r2, "identifier");
        p.l(r4, FirebaseAnalytics.Param.LEVEL);
        this.f120397a = r2;
        this.f120398b = r3;
        this.f120399c = r4;
    }

    public final Object a() {
        return this.f120398b;
    }

    public final String b() {
        return this.f120397a;
    }

    public final PocketLevel c() {
        return this.f120399c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f120397a, r52.f120397a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f120398b, r52.f120398b) == true) goto L15;
        return false;
    L15:
        if (this.f120399c == r52.f120399c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int r02 = this.f120397a.hashCode() * 31;
        Object r1 = this.f120398b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return ((r02 + r12) * 31) + this.f120399c.hashCode();
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "ConfiguratorConfig(identifier=" + this.f120397a + ", defaultValue=" + this.f120398b + ", level=" + this.f120399c + ")";
    }
}

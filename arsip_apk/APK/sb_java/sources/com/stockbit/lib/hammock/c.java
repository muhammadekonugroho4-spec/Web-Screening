package com.stockbit.lib.hammock;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final List f120159a;

    /* renamed from: b, reason: collision with root package name */
    public final List f120160b;

    /* renamed from: c, reason: collision with root package name */
    public final List f120161c;
    public final kotlin.jvm.functions.a d;

    /* renamed from: e, reason: collision with root package name */
    public final l f120162e;

    /* renamed from: f, reason: collision with root package name */
    public final l f120163f;

    /* renamed from: g, reason: collision with root package name */
    public final l f120164g;

    /* renamed from: h, reason: collision with root package name */
    public final l f120165h;

    /* renamed from: i, reason: collision with root package name */
    public final kotlin.jvm.functions.a f120166i;

    /* renamed from: j, reason: collision with root package name */
    public final Map f120167j;

    public c(List r2, List r3, List r4, kotlin.jvm.functions.a r5, l r6, l r7, l r8, l r9, kotlin.jvm.functions.a r10, Map r11) {
        p.l(r2, "envPresets");
        p.l(r3, "sharedPreferencesFiles");
        p.l(r4, "dataStoreFiles");
        p.l(r5, "isLoggedInFlow");
        p.l(r6, "userIdProvider");
        p.l(r7, "usernameProvider");
        p.l(r8, "deviceIdProvider");
        p.l(r9, "fcmTokenProvider");
        p.l(r10, "onApplyEnvironment");
        p.l(r11, "currentEnv");
        this.f120159a = r2;
        this.f120160b = r3;
        this.f120161c = r4;
        this.d = r5;
        this.f120162e = r6;
        this.f120163f = r7;
        this.f120164g = r8;
        this.f120165h = r9;
        this.f120166i = r10;
        this.f120167j = r11;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f120159a, r52.f120159a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f120160b, r52.f120160b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f120161c, r52.f120161c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f120162e, r52.f120162e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f120163f, r52.f120163f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f120164g, r52.f120164g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f120165h, r52.f120165h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f120166i, r52.f120166i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f120167j, r52.f120167j) == true) goto L38;
        return false;
    L38:
        return true;
    }

    public int hashCode() {
        return (((((((((((((((((this.f120159a.hashCode() * 31) + this.f120160b.hashCode()) * 31) + this.f120161c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f120162e.hashCode()) * 31) + this.f120163f.hashCode()) * 31) + this.f120164g.hashCode()) * 31) + this.f120165h.hashCode()) * 31) + this.f120166i.hashCode()) * 31) + this.f120167j.hashCode();
    }

    public String toString() {
        return "HammockConfig(envPresets=" + this.f120159a + ", sharedPreferencesFiles=" + this.f120160b + ", dataStoreFiles=" + this.f120161c + ", isLoggedInFlow=" + this.d + ", userIdProvider=" + this.f120162e + ", usernameProvider=" + this.f120163f + ", deviceIdProvider=" + this.f120164g + ", fcmTokenProvider=" + this.f120165h + ", onApplyEnvironment=" + this.f120166i + ", currentEnv=" + this.f120167j + ')';
    }
}

package com.stockbit.usecase.alert.model;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f154346a;

    /* renamed from: b, reason: collision with root package name */
    public final String f154347b;

    /* renamed from: c, reason: collision with root package name */
    public final List f154348c;

    public a(String r2, String r3, List r4) {
        p.l(r2, "symbol");
        p.l(r3, "iconUrl");
        p.l(r4, "alerts");
        this.f154346a = r2;
        this.f154347b = r3;
        this.f154348c = r4;
    }

    public final List a() {
        return this.f154348c;
    }

    public final String b() {
        return this.f154347b;
    }

    public final String c() {
        return this.f154346a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f154346a, r52.f154346a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f154347b, r52.f154347b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f154348c, r52.f154348c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f154346a.hashCode() * 31) + this.f154347b.hashCode()) * 31) + this.f154348c.hashCode();
    }

    public String toString() {
        return "AlertActiveUIState(symbol=" + this.f154346a + ", iconUrl=" + this.f154347b + ", alerts=" + this.f154348c + ")";
    }
}

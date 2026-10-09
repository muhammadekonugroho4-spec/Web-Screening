package com.stockbit.domain.model.company;

import com.clevertap.android.sdk.Constants;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f81429a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81430b;

    /* renamed from: c, reason: collision with root package name */
    public final String f81431c;

    public c(boolean r2, String r3, String r4) {
        kotlin.jvm.internal.p.l(r3, Constants.KEY_ICON);
        kotlin.jvm.internal.p.l(r4, Constants.KEY_TEXT);
        this.f81429a = r2;
        this.f81430b = r3;
        this.f81431c = r4;
    }

    public final boolean a() {
        return this.f81429a;
    }

    public final String b() {
        return this.f81430b;
    }

    public final String c() {
        return this.f81431c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (this.f81429a == r52.f81429a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f81430b, r52.f81430b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f81431c, r52.f81431c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f81429a) * 31) + this.f81430b.hashCode()) * 31) + this.f81431c.hashCode();
    }

    public String toString() {
        return "CompanyCorpActionEntity(active=" + this.f81429a + ", icon=" + this.f81430b + ", text=" + this.f81431c + ")";
    }
}

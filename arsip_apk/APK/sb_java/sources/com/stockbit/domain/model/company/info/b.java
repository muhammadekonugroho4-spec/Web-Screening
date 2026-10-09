package com.stockbit.domain.model.company.info;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f81574a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81575b;

    /* renamed from: c, reason: collision with root package name */
    public final String f81576c;

    public b(boolean r2, String r3, String r4) {
        p.l(r3, Constants.KEY_ICON);
        p.l(r4, Constants.KEY_TEXT);
        this.f81574a = r2;
        this.f81575b = r3;
        this.f81576c = r4;
    }

    public final boolean a() {
        return this.f81574a;
    }

    public final String b() {
        return this.f81575b;
    }

    public final String c() {
        return this.f81576c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (this.f81574a == r52.f81574a) goto L12;
        return false;
    L12:
        if (p.g(this.f81575b, r52.f81575b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f81576c, r52.f81576c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f81574a) * 31) + this.f81575b.hashCode()) * 31) + this.f81576c.hashCode();
    }

    public String toString() {
        return "CompanyCorpActionEntity(active=" + this.f81574a + ", icon=" + this.f81575b + ", text=" + this.f81576c + ")";
    }
}

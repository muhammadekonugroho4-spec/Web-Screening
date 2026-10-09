package com.stockbit.domain.model.company.corpaction;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f81449a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81450b;

    /* renamed from: c, reason: collision with root package name */
    public final String f81451c;

    public c(boolean r2, String r3, String r4) {
        p.l(r3, Constants.KEY_ICON);
        p.l(r4, Constants.KEY_TEXT);
        this.f81449a = r2;
        this.f81450b = r3;
        this.f81451c = r4;
    }

    public final boolean a() {
        return this.f81449a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (this.f81449a == r52.f81449a) goto L12;
        return false;
    L12:
        if (p.g(this.f81450b, r52.f81450b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f81451c, r52.f81451c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f81449a) * 31) + this.f81450b.hashCode()) * 31) + this.f81451c.hashCode();
    }

    public String toString() {
        return "CorpActionStatusInfoEntity(active=" + this.f81449a + ", icon=" + this.f81450b + ", text=" + this.f81451c + ")";
    }
}

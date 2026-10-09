package com.stockbit.domain.model.stream.notes;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f85862a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85863b;

    /* renamed from: c, reason: collision with root package name */
    public final CompanyNoteMaskType f85864c;

    public f(String r2, String r3, CompanyNoteMaskType r4) {
        p.l(r2, "ref");
        p.l(r3, Constants.KEY_TEXT);
        p.l(r4, "type");
        this.f85862a = r2;
        this.f85863b = r3;
        this.f85864c = r4;
    }

    public final String a() {
        return this.f85862a;
    }

    public final String b() {
        return this.f85863b;
    }

    public final CompanyNoteMaskType c() {
        return this.f85864c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (p.g(this.f85862a, r52.f85862a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f85863b, r52.f85863b) == true) goto L15;
        return false;
    L15:
        if (this.f85864c == r52.f85864c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f85862a.hashCode() * 31) + this.f85863b.hashCode()) * 31) + this.f85864c.hashCode();
    }

    public String toString() {
        return "CompanyNoteMaskEntity(ref=" + this.f85862a + ", text=" + this.f85863b + ", type=" + this.f85864c + ")";
    }
}

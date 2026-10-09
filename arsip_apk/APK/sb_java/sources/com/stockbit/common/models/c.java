package com.stockbit.common.models;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f60906a;

    /* renamed from: b, reason: collision with root package name */
    public final ToastType f60907b;

    /* renamed from: c, reason: collision with root package name */
    public final int f60908c;
    public final int d;

    static {
    }

    public c(String r2, ToastType r3, int r4, int r5) {
        p.l(r2, Constants.KEY_TEXT);
        p.l(r3, "type");
        this.f60906a = r2;
        this.f60907b = r3;
        this.f60908c = r4;
        this.d = r5;
    }

    public final int a() {
        return this.f60908c;
    }

    public final String b() {
        return this.f60906a;
    }

    public final ToastType c() {
        return this.f60907b;
    }

    public final int d() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f60906a, r52.f60906a) == true) goto L12;
        return false;
    L12:
        if (this.f60907b == r52.f60907b) goto L15;
        return false;
    L15:
        if (this.f60908c == r52.f60908c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f60906a.hashCode() * 31) + this.f60907b.hashCode()) * 31) + Integer.hashCode(this.f60908c)) * 31) + Integer.hashCode(this.d);
    }

    public String toString() {
        return "ToastParam(text=" + this.f60906a + ", type=" + this.f60907b + ", duration=" + this.f60908c + ", yOffset=" + this.d + ')';
    }
}

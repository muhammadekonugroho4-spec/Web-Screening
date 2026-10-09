package com.stockbit.usecase.alert.model;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes6.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f154360a;

    /* renamed from: b, reason: collision with root package name */
    public final String f154361b;

    /* renamed from: c, reason: collision with root package name */
    public final b f154362c;
    public final String d;

    public d(String r2, String r3, b r4, String r5) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, "updated");
        p.l(r4, "command");
        p.l(r5, "iconUrl");
        this.f154360a = r2;
        this.f154361b = r3;
        this.f154362c = r4;
        this.d = r5;
    }

    public final b a() {
        return this.f154362c;
    }

    public final String b() {
        return this.f154360a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f154360a, r52.f154360a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f154361b, r52.f154361b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f154362c, r52.f154362c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f154360a.hashCode() * 31) + this.f154361b.hashCode()) * 31) + this.f154362c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "AlertItemUIState(id=" + this.f154360a + ", updated=" + this.f154361b + ", command=" + this.f154362c + ", iconUrl=" + this.d + ")";
    }
}

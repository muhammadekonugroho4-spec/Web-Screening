package com.stockbit.usecase.profile.model;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f159474a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f159475b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f159476c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f159477e;

    public f(String r2, boolean r3, boolean r4, String r5, String r6) {
        p.l(r2, Constants.KEY_ID);
        p.l(r5, Constants.KEY_TITLE);
        p.l(r6, "content");
        this.f159474a = r2;
        this.f159475b = r3;
        this.f159476c = r4;
        this.d = r5;
        this.f159477e = r6;
    }

    public final String a() {
        return this.f159477e;
    }

    public final String b() {
        return this.f159474a;
    }

    public final String c() {
        return this.d;
    }

    public final boolean d() {
        return this.f159476c;
    }

    public final boolean e() {
        return this.f159475b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (p.g(this.f159474a, r52.f159474a) == true) goto L12;
        return false;
    L12:
        if (this.f159475b == r52.f159475b) goto L15;
        return false;
    L15:
        if (this.f159476c == r52.f159476c) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f159477e, r52.f159477e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f159474a.hashCode() * 31) + Boolean.hashCode(this.f159475b)) * 31) + Boolean.hashCode(this.f159476c)) * 31) + this.d.hashCode()) * 31) + this.f159477e.hashCode();
    }

    public String toString() {
        return "PersonalAmendRequestUIState(id=" + this.f159474a + ", isOngoingAmend=" + this.f159475b + ", isForceAmend=" + this.f159476c + ", title=" + this.d + ", content=" + this.f159477e + ')';
    }
}

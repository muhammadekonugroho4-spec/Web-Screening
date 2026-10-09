package com.stockbit.domain.model.securities.profile;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f85717a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85718b;

    /* renamed from: c, reason: collision with root package name */
    public final String f85719c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final String f85720e;

    /* renamed from: f, reason: collision with root package name */
    public final String f85721f;

    public a(boolean r2, String r3, String r4, boolean r5, String r6, String r7) {
        p.l(r3, Constants.KEY_TITLE);
        p.l(r4, "kycNotes");
        p.l(r6, "userMessage");
        p.l(r7, "personalAmendId");
        this.f85717a = r2;
        this.f85718b = r3;
        this.f85719c = r4;
        this.d = r5;
        this.f85720e = r6;
        this.f85721f = r7;
    }

    public final boolean a() {
        return this.d;
    }

    public final String b() {
        return this.f85721f;
    }

    public final String c() {
        return this.f85718b;
    }

    public final String d() {
        return this.f85720e;
    }

    public final boolean e() {
        return this.f85717a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f85717a == r52.f85717a) goto L12;
        return false;
    L12:
        if (p.g(this.f85718b, r52.f85718b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f85719c, r52.f85719c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (p.g(this.f85720e, r52.f85720e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f85721f, r52.f85721f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.f85717a) * 31) + this.f85718b.hashCode()) * 31) + this.f85719c.hashCode()) * 31) + Boolean.hashCode(this.d)) * 31) + this.f85720e.hashCode()) * 31) + this.f85721f.hashCode();
    }

    public String toString() {
        return "PersonalAmendRequestStatusEntity(isOngoingAmend=" + this.f85717a + ", title=" + this.f85718b + ", kycNotes=" + this.f85719c + ", forceAmend=" + this.d + ", userMessage=" + this.f85720e + ", personalAmendId=" + this.f85721f + ")";
    }
}

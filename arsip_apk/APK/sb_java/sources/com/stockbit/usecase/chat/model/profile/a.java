package com.stockbit.usecase.chat.model.profile;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f155595a;

    /* renamed from: b, reason: collision with root package name */
    public final String f155596b;

    /* renamed from: c, reason: collision with root package name */
    public final String f155597c;

    public a(String r2, String r3, String r4) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, "username");
        p.l(r4, "avatar");
        this.f155595a = r2;
        this.f155596b = r3;
        this.f155597c = r4;
    }

    public final String a() {
        return this.f155597c;
    }

    public final String b() {
        return this.f155595a;
    }

    public final String c() {
        return this.f155596b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f155595a, r52.f155595a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f155596b, r52.f155596b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f155597c, r52.f155597c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f155595a.hashCode() * 31) + this.f155596b.hashCode()) * 31) + this.f155597c.hashCode();
    }

    public String toString() {
        return "ProfileUIState(id=" + this.f155595a + ", username=" + this.f155596b + ", avatar=" + this.f155597c + ")";
    }
}

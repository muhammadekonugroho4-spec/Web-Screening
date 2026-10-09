package com.stockbit.usecase.registration.entity;

import com.clevertap.android.sdk.Constants;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f159524a;

    /* renamed from: b, reason: collision with root package name */
    public final List f159525b;

    /* renamed from: c, reason: collision with root package name */
    public final String f159526c;

    public a(String r2, List r3, String r4) {
        p.l(r2, Constants.KEY_KEY);
        p.l(r3, "channels");
        p.l(r4, "defaultChannel");
        this.f159524a = r2;
        this.f159525b = r3;
        this.f159526c = r4;
    }

    public final List a() {
        return this.f159525b;
    }

    public final String b() {
        return this.f159526c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f159524a, r52.f159524a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f159525b, r52.f159525b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f159526c, r52.f159526c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f159524a.hashCode() * 31) + this.f159525b.hashCode()) * 31) + this.f159526c.hashCode();
    }

    public String toString() {
        return "RegistrationOTPChannelEntity(key=" + this.f159524a + ", channels=" + this.f159525b + ", defaultChannel=" + this.f159526c + ")";
    }
}

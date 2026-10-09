package com.stockbit.repository.registration.entity;

import com.clevertap.android.sdk.Constants;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f130373a;

    /* renamed from: b, reason: collision with root package name */
    public final List f130374b;

    /* renamed from: c, reason: collision with root package name */
    public final String f130375c;

    public a(String r2, List r3, String r4) {
        p.l(r2, Constants.KEY_KEY);
        p.l(r3, "channels");
        p.l(r4, "defaultChannel");
        this.f130373a = r2;
        this.f130374b = r3;
        this.f130375c = r4;
    }

    public final List a() {
        return this.f130374b;
    }

    public final String b() {
        return this.f130375c;
    }

    public final String c() {
        return this.f130373a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f130373a, r52.f130373a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f130374b, r52.f130374b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f130375c, r52.f130375c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f130373a.hashCode() * 31) + this.f130374b.hashCode()) * 31) + this.f130375c.hashCode();
    }

    public String toString() {
        return "RegistrationCheckPhoneEntity(key=" + this.f130373a + ", channels=" + this.f130374b + ", defaultChannel=" + this.f130375c + ")";
    }
}

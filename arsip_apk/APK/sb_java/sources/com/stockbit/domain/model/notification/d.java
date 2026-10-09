package com.stockbit.domain.model.notification;

import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f84507a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f84508b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84509c;
    public final String d;

    public d(String r2, boolean r3, String r4, String r5) {
        p.l(r2, "type");
        p.l(r4, Constants.ScionAnalytics.PARAM_LABEL);
        this.f84507a = r2;
        this.f84508b = r3;
        this.f84509c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f84509c;
    }

    public final String c() {
        return this.f84507a;
    }

    public final boolean d() {
        return this.f84508b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f84507a, r52.f84507a) == true) goto L12;
        return false;
    L12:
        if (this.f84508b == r52.f84508b) goto L15;
        return false;
    L15:
        if (p.g(this.f84509c, r52.f84509c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        int r02 = ((((this.f84507a.hashCode() * 31) + Boolean.hashCode(this.f84508b)) * 31) + this.f84509c.hashCode()) * 31;
        String r1 = this.d;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "NotificationSettingEntity(type=" + this.f84507a + ", isEnabled=" + this.f84508b + ", label=" + this.f84509c + ", info=" + this.d + ")";
    }
}

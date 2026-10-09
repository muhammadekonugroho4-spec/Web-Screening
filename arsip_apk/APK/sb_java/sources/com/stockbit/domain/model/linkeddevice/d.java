package com.stockbit.domain.model.linkeddevice;

import androidx.core.app.NotificationCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f84225a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84226b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f84227c;
    public final a d;

    /* renamed from: e, reason: collision with root package name */
    public final c f84228e;

    /* renamed from: f, reason: collision with root package name */
    public final e f84229f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f84230g;

    public d(String r2, String r3, boolean r4, a r5, c r6, e r7, boolean r8) {
        p.l(r2, "uuid");
        p.l(r3, NotificationCompat.CATEGORY_STATUS);
        p.l(r5, "device");
        p.l(r6, FirebaseAnalytics.Event.LOGIN);
        p.l(r7, "geoLocation");
        this.f84225a = r2;
        this.f84226b = r3;
        this.f84227c = r4;
        this.d = r5;
        this.f84228e = r6;
        this.f84229f = r7;
        this.f84230g = r8;
    }

    public final boolean a() {
        return this.f84230g;
    }

    public final a b() {
        return this.d;
    }

    public final e c() {
        return this.f84229f;
    }

    public final c d() {
        return this.f84228e;
    }

    public final String e() {
        return this.f84225a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f84225a, r52.f84225a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f84226b, r52.f84226b) == true) goto L15;
        return false;
    L15:
        if (this.f84227c == r52.f84227c) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f84228e, r52.f84228e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f84229f, r52.f84229f) == true) goto L27;
        return false;
    L27:
        if (this.f84230g == r52.f84230g) goto L29;
        return false;
    L29:
        return true;
    }

    public final boolean f() {
        return this.f84227c;
    }

    public int hashCode() {
        return (((((((((((this.f84225a.hashCode() * 31) + this.f84226b.hashCode()) * 31) + Boolean.hashCode(this.f84227c)) * 31) + this.d.hashCode()) * 31) + this.f84228e.hashCode()) * 31) + this.f84229f.hashCode()) * 31) + Boolean.hashCode(this.f84230g);
    }

    public String toString() {
        return "DeviceSessionEntity(uuid=" + this.f84225a + ", status=" + this.f84226b + ", isCurrentDevice=" + this.f84227c + ", device=" + this.d + ", login=" + this.f84228e + ", geoLocation=" + this.f84229f + ", canRemove=" + this.f84230g + ")";
    }
}

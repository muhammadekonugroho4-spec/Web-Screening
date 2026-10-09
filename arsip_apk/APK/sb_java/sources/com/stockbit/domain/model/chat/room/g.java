package com.stockbit.domain.model.chat.room;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f81344a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81345b;

    /* renamed from: c, reason: collision with root package name */
    public final String f81346c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f81347e;

    public g(String r2, String r3, String r4, String r5, boolean r6) {
        p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r3, "shortenedName");
        p.l(r4, "description");
        p.l(r5, "avatarUrl");
        this.f81344a = r2;
        this.f81345b = r3;
        this.f81346c = r4;
        this.d = r5;
        this.f81347e = r6;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f81346c;
    }

    public final String c() {
        return this.f81344a;
    }

    public final String d() {
        return this.f81345b;
    }

    public final boolean e() {
        return this.f81347e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (p.g(this.f81344a, r52.f81344a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81345b, r52.f81345b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f81346c, r52.f81346c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f81347e == r52.f81347e) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f81344a.hashCode() * 31) + this.f81345b.hashCode()) * 31) + this.f81346c.hashCode()) * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.f81347e);
    }

    public String toString() {
        return "RoomInfoEntity(name=" + this.f81344a + ", shortenedName=" + this.f81345b + ", description=" + this.f81346c + ", avatarUrl=" + this.d + ", isVerified=" + this.f81347e + ")";
    }

    public /* synthetic */ g(String r2, String r3, String r4, String r5, boolean r6, int r7, kotlin.jvm.internal.i r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r7 & 16) == 0) goto L17;
        r6 = false;
    L17:
        boolean r72 = r6;
        String r62 = r5;
        String r52 = r4;
        String r42 = r3;
        this(r2, r42, r52, r62, r72);
    }
}

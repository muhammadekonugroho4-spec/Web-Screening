package com.stockbit.domain.model.socialsubscription;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f85816a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85817b;

    /* renamed from: c, reason: collision with root package name */
    public final String f85818c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final String f85819e;

    /* renamed from: f, reason: collision with root package name */
    public final String f85820f;

    /* renamed from: g, reason: collision with root package name */
    public final String f85821g;

    /* renamed from: h, reason: collision with root package name */
    public final List f85822h;

    /* renamed from: i, reason: collision with root package name */
    public final int f85823i;

    /* renamed from: j, reason: collision with root package name */
    public final String f85824j;

    public c(int r2, String r3, String r4, int r5, String r6, String r7, String r8, List r9, int r10, String r11) {
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r4, "code");
        p.l(r6, "description");
        p.l(r7, "keyword");
        p.l(r8, "thumb");
        p.l(r9, Constants.KEY_TAGS);
        p.l(r11, "durationType");
        this.f85816a = r2;
        this.f85817b = r3;
        this.f85818c = r4;
        this.d = r5;
        this.f85819e = r6;
        this.f85820f = r7;
        this.f85821g = r8;
        this.f85822h = r9;
        this.f85823i = r10;
        this.f85824j = r11;
    }

    public final String a() {
        return this.f85818c;
    }

    public final String b() {
        return this.f85817b;
    }

    public final int c() {
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
        if (this.f85816a == r52.f85816a) goto L12;
        return false;
    L12:
        if (p.g(this.f85817b, r52.f85817b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f85818c, r52.f85818c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (p.g(this.f85819e, r52.f85819e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f85820f, r52.f85820f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f85821g, r52.f85821g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f85822h, r52.f85822h) == true) goto L33;
        return false;
    L33:
        if (this.f85823i == r52.f85823i) goto L36;
        return false;
    L36:
        if (p.g(this.f85824j, r52.f85824j) == true) goto L38;
        return false;
    L38:
        return true;
    }

    public int hashCode() {
        return (((((((((((((((((Integer.hashCode(this.f85816a) * 31) + this.f85817b.hashCode()) * 31) + this.f85818c.hashCode()) * 31) + Integer.hashCode(this.d)) * 31) + this.f85819e.hashCode()) * 31) + this.f85820f.hashCode()) * 31) + this.f85821g.hashCode()) * 31) + this.f85822h.hashCode()) * 31) + Integer.hashCode(this.f85823i)) * 31) + this.f85824j.hashCode();
    }

    public String toString() {
        return "SocialSubscriptionProductEntity(id=" + this.f85816a + ", name=" + this.f85817b + ", code=" + this.f85818c + ", price=" + this.d + ", description=" + this.f85819e + ", keyword=" + this.f85820f + ", thumb=" + this.f85821g + ", tags=" + this.f85822h + ", quantity=" + this.f85823i + ", durationType=" + this.f85824j + ")";
    }
}

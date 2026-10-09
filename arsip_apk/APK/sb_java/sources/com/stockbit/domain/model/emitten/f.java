package com.stockbit.domain.model.emitten;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f82252a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82253b;

    /* renamed from: c, reason: collision with root package name */
    public final List f82254c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f82255e;

    /* renamed from: f, reason: collision with root package name */
    public final String f82256f;

    /* renamed from: g, reason: collision with root package name */
    public final String f82257g;

    /* renamed from: h, reason: collision with root package name */
    public final List f82258h;

    /* renamed from: i, reason: collision with root package name */
    public final List f82259i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f82260j;

    public f(String r2, String r3, List r4, String r5, String r6, String r7, String r8, List r9, List r10, boolean r11) {
        p.l(r2, "symbol");
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r4, Constants.KEY_TAGS);
        p.l(r5, "country");
        p.l(r6, "exchange");
        p.l(r7, NotificationCompat.CATEGORY_STATUS);
        p.l(r8, "iconUrl");
        p.l(r9, "catalog");
        p.l(r10, "metadata");
        this.f82252a = r2;
        this.f82253b = r3;
        this.f82254c = r4;
        this.d = r5;
        this.f82255e = r6;
        this.f82256f = r7;
        this.f82257g = r8;
        this.f82258h = r9;
        this.f82259i = r10;
        this.f82260j = r11;
    }

    public final List a() {
        return this.f82259i;
    }

    public final String b() {
        return this.f82253b;
    }

    public final String c() {
        return this.f82252a;
    }

    public final List d() {
        return this.f82254c;
    }

    public final boolean e() {
        return this.f82260j;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (p.g(this.f82252a, r52.f82252a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f82253b, r52.f82253b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f82254c, r52.f82254c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f82255e, r52.f82255e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f82256f, r52.f82256f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f82257g, r52.f82257g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f82258h, r52.f82258h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f82259i, r52.f82259i) == true) goto L36;
        return false;
    L36:
        if (this.f82260j == r52.f82260j) goto L38;
        return false;
    L38:
        return true;
    }

    public int hashCode() {
        return (((((((((((((((((this.f82252a.hashCode() * 31) + this.f82253b.hashCode()) * 31) + this.f82254c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f82255e.hashCode()) * 31) + this.f82256f.hashCode()) * 31) + this.f82257g.hashCode()) * 31) + this.f82258h.hashCode()) * 31) + this.f82259i.hashCode()) * 31) + Boolean.hashCode(this.f82260j);
    }

    public String toString() {
        return "EmittenInfoEntity(symbol=" + this.f82252a + ", name=" + this.f82253b + ", tags=" + this.f82254c + ", country=" + this.d + ", exchange=" + this.f82255e + ", status=" + this.f82256f + ", iconUrl=" + this.f82257g + ", catalog=" + this.f82258h + ", metadata=" + this.f82259i + ", tradeable=" + this.f82260j + ")";
    }
}

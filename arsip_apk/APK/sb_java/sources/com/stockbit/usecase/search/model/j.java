package com.stockbit.usecase.search.model;

import com.clevertap.android.sdk.Constants;
import java.time.LocalDate;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final LocalDate f160020a;

    /* renamed from: b, reason: collision with root package name */
    public final String f160021b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f160022c;
    public final LocalDate d;

    public j(LocalDate r2, String r3, boolean r4, LocalDate r5) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_DATE);
        kotlin.jvm.internal.p.l(r3, "dateLabel");
        kotlin.jvm.internal.p.l(r5, "maxDate");
        this.f160020a = r2;
        this.f160021b = r3;
        this.f160022c = r4;
        this.d = r5;
    }

    public static /* synthetic */ j b(j r02, LocalDate r1, String r2, boolean r3, LocalDate r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r02.f160020a;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r02.f160021b;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r02.f160022c;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r02.d;
    L15:
        return r02.a(r1, r2, r3, r4);
    }

    public final j a(LocalDate r2, String r3, boolean r4, LocalDate r5) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_DATE);
        kotlin.jvm.internal.p.l(r3, "dateLabel");
        kotlin.jvm.internal.p.l(r5, "maxDate");
        return new j(r2, r3, r4, r5);
    }

    public final boolean c() {
        return this.f160022c;
    }

    public final LocalDate d() {
        return this.f160020a;
    }

    public final String e() {
        return this.f160021b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof j) == true) goto L8;
        return false;
    L8:
        j r52 = (j) r5;
        if (kotlin.jvm.internal.p.g(this.f160020a, r52.f160020a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f160021b, r52.f160021b) == true) goto L15;
        return false;
    L15:
        if (this.f160022c == r52.f160022c) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public final LocalDate f() {
        return this.d;
    }

    public int hashCode() {
        return (((((this.f160020a.hashCode() * 31) + this.f160021b.hashCode()) * 31) + Boolean.hashCode(this.f160022c)) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "MarketIHSGDateUIState(date=" + this.f160020a + ", dateLabel=" + this.f160021b + ", canClickNextDate=" + this.f160022c + ", maxDate=" + this.d + ")";
    }

    public /* synthetic */ j(LocalDate r2, String r3, boolean r4, LocalDate r5, int r6, kotlin.jvm.internal.i r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = LocalDate.now();
        kotlin.jvm.internal.p.k(r2, "now(...)");
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = false;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = LocalDate.now();
        kotlin.jvm.internal.p.k(r5, "now(...)");
    L14:
        this(r2, r3, r4, r5);
    }
}

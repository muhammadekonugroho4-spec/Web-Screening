package com.iab.digitalidentity.ui.theme.commons;

import android.graphics.Typeface;
import kotlin.jvm.internal.p;

/* loaded from: classes6.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public Typeface f40783a;

    /* renamed from: b, reason: collision with root package name */
    public Float f40784b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f40785c;

    public l(Typeface r1, Float r2, Integer r3) {
        this.f40783a = r1;
        this.f40784b = r2;
        this.f40785c = r3;
    }

    public final Typeface a() {
        return this.f40783a;
    }

    public final Integer b() {
        return this.f40785c;
    }

    public final Float c() {
        return this.f40784b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof l) == true) goto L8;
        return false;
    L8:
        l r52 = (l) r5;
        if (p.g(this.f40783a, r52.f40783a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f40784b, r52.f40784b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f40785c, r52.f40785c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        Typeface r02 = this.f40783a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Float r2 = this.f40784b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Integer r23 = this.f40785c;
        if (r23 == null) goto L15;
        r1 = r23.hashCode();
    L15:
        return r05 + r1;
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "DigitalIdentityTextAppearance(font=" + this.f40783a + ", textSize=" + this.f40784b + ", textColor=" + this.f40785c + ")";
    }
}

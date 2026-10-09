package com.iab.digitalidentity.ui.theme.commons;

import android.graphics.drawable.Drawable;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public Integer f40721a;

    /* renamed from: b, reason: collision with root package name */
    public List f40722b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f40723c;
    public Drawable d;

    public b(Integer r1, List r2, Integer r3, Drawable r4) {
        this.f40721a = r1;
        this.f40722b = r2;
        this.f40723c = r3;
        this.d = r4;
    }

    public final Integer a() {
        return this.f40721a;
    }

    public final Drawable b() {
        return this.d;
    }

    public final Integer c() {
        return this.f40723c;
    }

    public final List d() {
        return this.f40722b;
    }

    public final void e(b r2) {
        if (r2 != null) goto L4;
        return;
    L4:
        Integer r02 = r2.f40721a;
        if (r02 != null) goto L7;
        r02 = this.f40721a;
    L7:
        this.f40721a = r02;
        List r03 = r2.f40722b;
        if (r03 != null) goto L10;
        r03 = this.f40722b;
    L10:
        this.f40722b = r03;
        Integer r04 = r2.f40723c;
        if (r04 != null) goto L13;
        r04 = this.f40723c;
    L13:
        this.f40723c = r04;
        Drawable r22 = r2.d;
        if (r22 != null) goto L16;
        r22 = this.d;
    L16:
        this.d = r22;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f40721a, r52.f40721a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f40722b, r52.f40722b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f40723c, r52.f40723c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        Integer r02 = this.f40721a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        List r2 = this.f40722b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Integer r23 = this.f40723c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        Drawable r25 = this.d;
        if (r25 == null) goto L19;
        r1 = r25.hashCode();
    L19:
        return r06 + r1;
    L13:
        r24 = r23.hashCode();
        goto L14
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "DigitalIdentityBackground(color=" + this.f40721a + ", gradientColors=" + this.f40722b + ", drawableRes=" + this.f40723c + ", drawable=" + this.d + ")";
    }

    public /* synthetic */ b(Integer r2, List r3, Integer r4, Drawable r5, int r6, kotlin.jvm.internal.i r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = null;
    L14:
        this(r2, r3, r4, r5);
    }
}

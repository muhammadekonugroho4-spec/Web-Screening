package com.iab.digitalidentity.ui.theme.commons;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.p;

/* loaded from: classes6.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public Integer f40766a;

    /* renamed from: b, reason: collision with root package name */
    public Drawable f40767b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f40768c;
    public b d;

    public g(Integer r1, Drawable r2, Integer r3, b r4) {
        this.f40766a = r1;
        this.f40767b = r2;
        this.f40768c = r3;
        this.d = r4;
    }

    public final b a() {
        return this.d;
    }

    public final Integer b() {
        return this.f40766a;
    }

    public final Drawable c() {
        return this.f40767b;
    }

    public final Integer d() {
        return this.f40768c;
    }

    public final void e(g r2) {
        if (r2 != null) goto L4;
        return;
    L4:
        Integer r02 = r2.f40766a;
        if (r02 != null) goto L7;
        r02 = this.f40766a;
    L7:
        this.f40766a = r02;
        Drawable r03 = r2.f40767b;
        if (r03 != null) goto L10;
        r03 = this.f40767b;
    L10:
        this.f40767b = r03;
        Integer r04 = r2.f40768c;
        if (r04 != null) goto L13;
        r04 = this.f40768c;
    L13:
        this.f40768c = r04;
        b r22 = r2.d;
        if (r22 != null) goto L16;
        r22 = this.d;
    L16:
        this.d = r22;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (p.g(this.f40766a, r52.f40766a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f40767b, r52.f40767b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f40768c, r52.f40768c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        Integer r02 = this.f40766a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Drawable r2 = this.f40767b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Integer r23 = this.f40768c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        b r25 = this.d;
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
        return "DigitalIdentityImage(image=" + this.f40766a + ", imageDrawable=" + this.f40767b + ", imageTint=" + this.f40768c + ", background=" + this.d + ")";
    }

    public /* synthetic */ g(Integer r2, Drawable r3, Integer r4, b r5, int r6, kotlin.jvm.internal.i r7) {
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

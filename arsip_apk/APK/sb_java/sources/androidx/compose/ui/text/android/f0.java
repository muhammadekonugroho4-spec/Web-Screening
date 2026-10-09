package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f19737a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19738b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19739c;
    public final TextPaint d;

    /* renamed from: e, reason: collision with root package name */
    public final int f19740e;

    /* renamed from: f, reason: collision with root package name */
    public final TextDirectionHeuristic f19741f;

    /* renamed from: g, reason: collision with root package name */
    public final Layout.Alignment f19742g;

    /* renamed from: h, reason: collision with root package name */
    public final int f19743h;

    /* renamed from: i, reason: collision with root package name */
    public final TextUtils.TruncateAt f19744i;

    /* renamed from: j, reason: collision with root package name */
    public final int f19745j;

    /* renamed from: k, reason: collision with root package name */
    public final float f19746k;

    /* renamed from: l, reason: collision with root package name */
    public final float f19747l;

    /* renamed from: m, reason: collision with root package name */
    public final int f19748m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f19749n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f19750o;

    /* renamed from: p, reason: collision with root package name */
    public final int f19751p;

    /* renamed from: q, reason: collision with root package name */
    public final int f19752q;

    /* renamed from: r, reason: collision with root package name */
    public final int f19753r;

    /* renamed from: s, reason: collision with root package name */
    public final int f19754s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f19755t;

    /* renamed from: u, reason: collision with root package name */
    public final int[] f19756u;

    public f0(CharSequence r1, int r2, int r3, TextPaint r4, int r5, TextDirectionHeuristic r6, Layout.Alignment r7, int r8, TextUtils.TruncateAt r9, int r10, float r11, float r12, int r13, boolean r14, boolean r15, int r16, int r17, int r18, int r19, int[] r20, int[] r21) {
        this.f19737a = r1;
        this.f19738b = r2;
        this.f19739c = r3;
        this.d = r4;
        this.f19740e = r5;
        this.f19741f = r6;
        this.f19742g = r7;
        this.f19743h = r8;
        this.f19744i = r9;
        this.f19745j = r10;
        this.f19746k = r11;
        this.f19747l = r12;
        this.f19748m = r13;
        this.f19749n = r14;
        this.f19750o = r15;
        this.f19751p = r16;
        this.f19752q = r17;
        this.f19753r = r18;
        this.f19754s = r19;
        this.f19755t = r20;
        this.f19756u = r21;
        boolean r42 = true;
        if (r2 < 0) goto L6;
        if (r2 > r3) goto L6;
        boolean r22 = true;
    L7:
        if (r22 == true) goto L9;
        androidx.compose.ui.text.internal.a.a("invalid start value");
    L9:
        int r110 = r1.length();
        if (r3 < 0) goto L13;
        if (r3 > r110) goto L13;
        boolean r111 = true;
    L14:
        if (r111 == true) goto L16;
        androidx.compose.ui.text.internal.a.a("invalid end value");
    L16:
        if (r8 < 0) goto L18;
        boolean r112 = true;
    L19:
        if (r112 == true) goto L21;
        androidx.compose.ui.text.internal.a.a("invalid maxLines value");
    L21:
        if (r5 < 0) goto L23;
        boolean r113 = true;
    L24:
        if (r113 == true) goto L26;
        androidx.compose.ui.text.internal.a.a("invalid width value");
    L26:
        if (r10 < 0) goto L28;
        boolean r114 = true;
    L29:
        if (r114 == true) goto L32;
        androidx.compose.ui.text.internal.a.a("invalid ellipsizedWidth value");
    L32:
        if (r11 >= 0.0f) goto L35;
        r42 = false;
    L35:
        if (r42 == true) goto L38;
        androidx.compose.ui.text.internal.a.a("invalid lineSpacingMultiplier value");
        return;
    L38:
        return;
    L28:
        r114 = false;
        goto L29
    L23:
        r113 = false;
        goto L24
    L18:
        r112 = false;
    L13:
        r111 = false;
    L6:
        r22 = false;
        goto L7
    }

    public final Layout.Alignment a() {
        return this.f19742g;
    }

    public final int b() {
        return this.f19751p;
    }

    public final TextUtils.TruncateAt c() {
        return this.f19744i;
    }

    public final int d() {
        return this.f19745j;
    }

    public final int e() {
        return this.f19739c;
    }

    public final int f() {
        return this.f19754s;
    }

    public final boolean g() {
        return this.f19749n;
    }

    public final int h() {
        return this.f19748m;
    }

    public final int[] i() {
        return this.f19755t;
    }

    public final int j() {
        return this.f19752q;
    }

    public final int k() {
        return this.f19753r;
    }

    public final float l() {
        return this.f19747l;
    }

    public final float m() {
        return this.f19746k;
    }

    public final int n() {
        return this.f19743h;
    }

    public final TextPaint o() {
        return this.d;
    }

    public final int[] p() {
        return this.f19756u;
    }

    public final int q() {
        return this.f19738b;
    }

    public final CharSequence r() {
        return this.f19737a;
    }

    public final TextDirectionHeuristic s() {
        return this.f19741f;
    }

    public final boolean t() {
        return this.f19750o;
    }

    public final int u() {
        return this.f19740e;
    }
}

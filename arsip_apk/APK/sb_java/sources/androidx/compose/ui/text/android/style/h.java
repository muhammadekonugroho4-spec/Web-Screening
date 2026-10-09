package androidx.compose.ui.text.android.style;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import androidx.compose.ui.text.style.h;

/* loaded from: classes.dex */
public final class h implements LineHeightSpan {

    /* renamed from: a, reason: collision with root package name */
    public final float f19805a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19806b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19807c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f19808e;

    /* renamed from: f, reason: collision with root package name */
    public final float f19809f;

    /* renamed from: g, reason: collision with root package name */
    public final int f19810g;

    /* renamed from: h, reason: collision with root package name */
    public int f19811h;

    /* renamed from: i, reason: collision with root package name */
    public int f19812i;

    /* renamed from: j, reason: collision with root package name */
    public int f19813j;

    /* renamed from: k, reason: collision with root package name */
    public int f19814k;

    /* renamed from: l, reason: collision with root package name */
    public int f19815l;

    /* renamed from: m, reason: collision with root package name */
    public int f19816m;

    static {
    }

    public /* synthetic */ h(float r1, int r2, int r3, boolean r4, boolean r5, float r6, int r7, kotlin.jvm.internal.i r8) {
        this(r1, r2, r3, r4, r5, r6, r7);
    }

    public final void a(Paint.FontMetricsInt r8) {
        int r1 = (int) Math.ceil(this.f19805a);
        int r02 = r1 - i.a(r8);
        int r2 = this.f19810g;
        h.c.a r3 = h.c.f20282b;
        if (h.c.g(r2, r3.b()) == false) goto L7;
        if (r02 > 0) goto L7;
        int r03 = r8.ascent;
        this.f19812i = r03;
        int r82 = r8.descent;
        this.f19813j = r82;
        this.f19811h = r03;
        this.f19814k = r82;
        this.f19815l = 0;
        this.f19816m = 0;
        return;
    L7:
        float r22 = this.f19809f;
        if (r22 != (-1.0f)) goto L10;
        r22 = Math.abs(r8.ascent) / i.a(r8);
    L10:
        if (r02 > 0) goto L13;
        double r5 = Math.ceil(r02 * r22);
    L14:
        int r52 = r8.descent + ((int) r5);
        this.f19813j = r52;
        this.f19812i = r52 - r1;
        if (h.c.g(this.f19810g, r3.a()) == true) goto L31;
        if (r02 >= 0) goto L31;
        if (h.c.g(this.f19810g, r3.c()) == true) goto L21;
        return;
    L21:
        if (this.d == false) goto L23;
        int r04 = Math.max(r8.ascent, this.f19812i);
    L24:
        this.f19811h = r04;
        if (this.f19808e == false) goto L27;
        int r83 = Math.min(r8.descent, this.f19813j);
    L28:
        this.f19814k = r83;
        this.f19815l = 0;
        this.f19816m = 0;
        return;
    L27:
        r83 = Math.max(r8.descent, this.f19813j);
        goto L28
    L23:
        r04 = Math.min(r8.ascent, this.f19812i);
    L31:
        if (this.d == false) goto L33;
        int r05 = r8.ascent;
    L34:
        this.f19811h = r05;
        if (this.f19808e == false) goto L37;
        int r12 = r8.descent;
    L38:
        this.f19814k = r12;
        this.f19815l = r8.ascent - r05;
        this.f19816m = r12 - r8.descent;
        return;
    L37:
        r12 = this.f19813j;
        goto L38
    L33:
        r05 = this.f19812i;
        goto L34
    L13:
        r5 = Math.ceil(r02 * (1.0f - r22));
        goto L14
    }

    public final h b(int r10, int r11, boolean r12) {
        return new h(this.f19805a, r10, r11, r12, this.f19808e, this.f19809f, this.f19810g, null);
    }

    public final int c() {
        return this.f19815l;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence r1, int r2, int r3, int r4, int r5, Paint.FontMetricsInt r6) {
        if (i.a(r6) <= 0) goto L33;
        boolean r42 = false;
        if (r2 != this.f19806b) goto L8;
        boolean r12 = true;
    L10:
        if (r3 != this.f19807c) goto L12;
        r42 = true;
    L12:
        if (r12 == false) goto L22;
        if (r42 == false) goto L22;
        if (this.d == false) goto L22;
        if (this.f19808e == false) goto L22;
        if (h.c.g(this.f19810g, h.c.f20282b.c()) == true) goto L22;
        return;
    L22:
        if (this.f19811h != Integer.MIN_VALUE) goto L24;
        a(r6);
    L24:
        if (r12 == false) goto L26;
        int r13 = this.f19811h;
    L27:
        r6.ascent = r13;
        if (r42 == false) goto L30;
        int r14 = this.f19814k;
    L31:
        r6.descent = r14;
        return;
    L30:
        r14 = this.f19813j;
        goto L31
    L26:
        r13 = this.f19812i;
        goto L27
    L8:
        r12 = false;
        goto L10
    }

    public final int d() {
        return this.f19816m;
    }

    public final int e() {
        return this.f19810g;
    }

    public final boolean f() {
        return this.d;
    }

    public final boolean g() {
        return this.f19808e;
    }

    public h(float r1, int r2, int r3, boolean r4, boolean r5, float r6, int r7) {
        this.f19805a = r1;
        this.f19806b = r2;
        this.f19807c = r3;
        this.d = r4;
        this.f19808e = r5;
        this.f19809f = r6;
        this.f19810g = r7;
        this.f19811h = Integer.MIN_VALUE;
        this.f19812i = Integer.MIN_VALUE;
        this.f19813j = Integer.MIN_VALUE;
        this.f19814k = Integer.MIN_VALUE;
        if (0.0f > r6) goto L8;
        if (r6 > 1.0f) goto L8;
    L9:
        boolean r12 = true;
    L11:
        if (r12 == true) goto L14;
        androidx.compose.ui.text.internal.a.c("topRatio should be in [0..1] range or -1");
        return;
    L14:
        return;
    L8:
        if (r6 == (-1.0f)) goto L9;
        r12 = false;
        goto L11
    }
}

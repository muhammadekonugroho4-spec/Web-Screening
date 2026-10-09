package com.skydoves.balloon.vectortext;

import android.graphics.drawable.Drawable;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public Integer f44200a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f44201b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f44202c;
    public Integer d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f44203e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f44204f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable f44205g;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f44206h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f44207i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f44208j;

    /* renamed from: k, reason: collision with root package name */
    public final Integer f44209k;

    /* renamed from: l, reason: collision with root package name */
    public final Integer f44210l;

    /* renamed from: m, reason: collision with root package name */
    public final Integer f44211m;

    /* renamed from: n, reason: collision with root package name */
    public Integer f44212n;

    /* renamed from: o, reason: collision with root package name */
    public Integer f44213o;

    /* renamed from: p, reason: collision with root package name */
    public Integer f44214p;

    /* renamed from: q, reason: collision with root package name */
    public Integer f44215q;

    /* renamed from: r, reason: collision with root package name */
    public Integer f44216r;

    public a(Integer r2, Integer r3, Integer r4, Integer r5, Drawable r6, Drawable r7, Drawable r8, Drawable r9, boolean r10, CharSequence r11, Integer r12, Integer r13, Integer r14, Integer r15, Integer r16, Integer r17, Integer r18, Integer r19) {
        p.l(r11, "contentDescription");
        this.f44200a = r2;
        this.f44201b = r3;
        this.f44202c = r4;
        this.d = r5;
        this.f44203e = r6;
        this.f44204f = r7;
        this.f44205g = r8;
        this.f44206h = r9;
        this.f44207i = r10;
        this.f44208j = r11;
        this.f44209k = r12;
        this.f44210l = r13;
        this.f44211m = r14;
        this.f44212n = r15;
        this.f44213o = r16;
        this.f44214p = r17;
        this.f44215q = r18;
        this.f44216r = r19;
    }

    public final void A(boolean r1) {
        this.f44207i = r1;
    }

    public final Integer a() {
        return this.f44209k;
    }

    public final Integer b() {
        return this.f44212n;
    }

    public final CharSequence c() {
        return this.f44208j;
    }

    public final Drawable d() {
        return this.f44205g;
    }

    public final Integer e() {
        return this.f44202c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f44200a, r52.f44200a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f44201b, r52.f44201b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f44202c, r52.f44202c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f44203e, r52.f44203e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f44204f, r52.f44204f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f44205g, r52.f44205g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f44206h, r52.f44206h) == true) goto L33;
        return false;
    L33:
        if (this.f44207i == r52.f44207i) goto L36;
        return false;
    L36:
        if (p.g(this.f44208j, r52.f44208j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f44209k, r52.f44209k) == true) goto L42;
        return false;
    L42:
        if (p.g(this.f44210l, r52.f44210l) == true) goto L45;
        return false;
    L45:
        if (p.g(this.f44211m, r52.f44211m) == true) goto L48;
        return false;
    L48:
        if (p.g(this.f44212n, r52.f44212n) == true) goto L51;
        return false;
    L51:
        if (p.g(this.f44213o, r52.f44213o) == true) goto L54;
        return false;
    L54:
        if (p.g(this.f44214p, r52.f44214p) == true) goto L57;
        return false;
    L57:
        if (p.g(this.f44215q, r52.f44215q) == true) goto L60;
        return false;
    L60:
        if (p.g(this.f44216r, r52.f44216r) == true) goto L62;
        return false;
    L62:
        return true;
    }

    public final Drawable f() {
        return this.f44204f;
    }

    public final Integer g() {
        return this.f44201b;
    }

    public final Drawable h() {
        return this.f44203e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        Integer r02 = this.f44200a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Integer r2 = this.f44201b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Integer r23 = this.f44202c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        Integer r25 = this.d;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        Drawable r27 = this.f44203e;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        Drawable r29 = this.f44204f;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        Drawable r211 = this.f44205g;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        Drawable r213 = this.f44206h;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        boolean r215 = this.f44207i;
        int r216 = r215;
        if (r215 == 0) goto L37;
        r216 = 1;
    L37:
        int r012 = (((r011 + r216) * 31) + this.f44208j.hashCode()) * 31;
        Integer r217 = this.f44209k;
        if (r217 != null) goto L40;
        int r218 = 0;
    L41:
        int r013 = (r012 + r218) * 31;
        Integer r219 = this.f44210l;
        if (r219 != null) goto L44;
        int r220 = 0;
    L45:
        int r014 = (r013 + r220) * 31;
        Integer r221 = this.f44211m;
        if (r221 != null) goto L48;
        int r222 = 0;
    L49:
        int r015 = (r014 + r222) * 31;
        Integer r223 = this.f44212n;
        if (r223 != null) goto L52;
        int r224 = 0;
    L53:
        int r016 = (r015 + r224) * 31;
        Integer r225 = this.f44213o;
        if (r225 != null) goto L56;
        int r226 = 0;
    L57:
        int r017 = (r016 + r226) * 31;
        Integer r227 = this.f44214p;
        if (r227 != null) goto L60;
        int r228 = 0;
    L61:
        int r018 = (r017 + r228) * 31;
        Integer r229 = this.f44215q;
        if (r229 != null) goto L64;
        int r230 = 0;
    L65:
        int r019 = (r018 + r230) * 31;
        Integer r231 = this.f44216r;
        if (r231 == null) goto L70;
        r1 = r231.hashCode();
    L70:
        return r019 + r1;
    L64:
        r230 = r229.hashCode();
        goto L65
    L60:
        r228 = r227.hashCode();
        goto L61
    L56:
        r226 = r225.hashCode();
        goto L57
    L52:
        r224 = r223.hashCode();
        goto L53
    L48:
        r222 = r221.hashCode();
        goto L49
    L44:
        r220 = r219.hashCode();
        goto L45
    L40:
        r218 = r217.hashCode();
        goto L41
    L33:
        r214 = r213.hashCode();
        goto L34
    L29:
        r212 = r211.hashCode();
        goto L30
    L25:
        r210 = r29.hashCode();
        goto L26
    L21:
        r28 = r27.hashCode();
        goto L22
    L17:
        r26 = r25.hashCode();
        goto L18
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

    public final Integer i() {
        return this.f44200a;
    }

    public final Drawable j() {
        return this.f44206h;
    }

    public final Integer k() {
        return this.d;
    }

    public final Integer l() {
        return this.f44215q;
    }

    public final Integer m() {
        return this.f44211m;
    }

    public final Integer n() {
        return this.f44210l;
    }

    public final Integer o() {
        return this.f44216r;
    }

    public final Integer p() {
        return this.f44213o;
    }

    public final Integer q() {
        return this.f44214p;
    }

    public final boolean r() {
        return this.f44207i;
    }

    public final void s(Drawable r1) {
        this.f44205g = r1;
    }

    public final void t(Integer r1) {
        this.f44202c = r1;
    }

    public String toString() {
        return "VectorTextViewParams(drawableStartRes=" + this.f44200a + ", drawableEndRes=" + this.f44201b + ", drawableBottomRes=" + this.f44202c + ", drawableTopRes=" + this.d + ", drawableStart=" + this.f44203e + ", drawableEnd=" + this.f44204f + ", drawableBottom=" + this.f44205g + ", drawableTop=" + this.f44206h + ", isRtlLayout=" + this.f44207i + ", contentDescription=" + this.f44208j + ", compoundDrawablePadding=" + this.f44209k + ", iconWidth=" + this.f44210l + ", iconHeight=" + this.f44211m + ", compoundDrawablePaddingRes=" + this.f44212n + ", tintColor=" + this.f44213o + ", widthRes=" + this.f44214p + ", heightRes=" + this.f44215q + ", squareSizeRes=" + this.f44216r + ')';
    }

    public final void u(Drawable r1) {
        this.f44204f = r1;
    }

    public final void v(Integer r1) {
        this.f44201b = r1;
    }

    public final void w(Drawable r1) {
        this.f44203e = r1;
    }

    public final void x(Integer r1) {
        this.f44200a = r1;
    }

    public final void y(Drawable r1) {
        this.f44206h = r1;
    }

    public final void z(Integer r1) {
        this.d = r1;
    }

    public /* synthetic */ a(Integer r20, Integer r21, Integer r22, Integer r23, Drawable r24, Drawable r25, Drawable r26, Drawable r27, boolean r28, CharSequence r29, Integer r30, Integer r31, Integer r32, Integer r33, Integer r34, Integer r35, Integer r36, Integer r37, int r38, i r39) {
        if ((r38 & 1) == 0) goto L5;
        Integer r1 = null;
    L7:
        if ((r38 & 2) == 0) goto L9;
        Integer r3 = null;
    L11:
        if ((r38 & 4) == 0) goto L13;
        Integer r4 = null;
    L15:
        if ((r38 & 8) == 0) goto L17;
        Integer r5 = null;
    L19:
        if ((r38 & 16) == 0) goto L21;
        Drawable r6 = null;
    L23:
        if ((r38 & 32) == 0) goto L25;
        Drawable r7 = null;
    L27:
        if ((r38 & 64) == 0) goto L29;
        Drawable r8 = null;
    L31:
        if ((r38 & 128) == 0) goto L33;
        Drawable r9 = null;
    L35:
        if ((r38 & 256) == 0) goto L37;
        boolean r10 = false;
    L39:
        if ((r38 & 512) == 0) goto L41;
        y r11 = y.f177509a;
        CharSequence r112 = "";
    L43:
        if ((r38 & 1024) == 0) goto L45;
        Integer r12 = null;
    L47:
        if ((r38 & 2048) == 0) goto L49;
        Integer r13 = null;
    L51:
        if ((r38 & 4096) == 0) goto L53;
        Integer r14 = null;
    L55:
        if ((r38 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        Integer r15 = null;
    L59:
        if ((r38 & 16384) == 0) goto L61;
        Integer r2 = null;
    L63:
        if ((r38 & 32768) == 0) goto L65;
        Integer r16 = null;
    L67:
        if ((r38 & 65536) == 0) goto L69;
        Integer r17 = null;
    L71:
        if ((r38 & 131072) == 0) goto L74;
        Integer r382 = null;
    L75:
        this(r1, r3, r4, r5, r6, r7, r8, r9, r10, r112, r12, r13, r14, r15, r2, r16, r17, r382);
        return;
    L74:
        r382 = r37;
        goto L75
    L69:
        r17 = r36;
        goto L71
    L65:
        r16 = r35;
        goto L67
    L61:
        r2 = r34;
        goto L63
    L57:
        r15 = r33;
        goto L59
    L53:
        r14 = r32;
        goto L55
    L49:
        r13 = r31;
        goto L51
    L45:
        r12 = r30;
        goto L47
    L41:
        r112 = r29;
        goto L43
    L37:
        r10 = r28;
        goto L39
    L33:
        r9 = r27;
        goto L35
    L29:
        r8 = r26;
        goto L31
    L25:
        r7 = r25;
        goto L27
    L21:
        r6 = r24;
        goto L23
    L17:
        r5 = r23;
        goto L19
    L13:
        r4 = r22;
        goto L15
    L9:
        r3 = r21;
        goto L11
    L5:
        r1 = r20;
        goto L7
    }
}

package com.iab.digitalidentity.ui.theme.commons;

import com.iab.digitalidentity.ui.text.DigitalIdentityTypographyStyle;
import kotlin.jvm.internal.p;

/* loaded from: classes6.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public String f40778a;

    /* renamed from: b, reason: collision with root package name */
    public DigitalIdentityTextAlignment f40779b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f40780c;
    public l d;

    /* renamed from: e, reason: collision with root package name */
    public final b f40781e;

    /* renamed from: f, reason: collision with root package name */
    public DigitalIdentityTypographyStyle f40782f;

    public k(String r2, DigitalIdentityTextAlignment r3, Integer r4, l r5, b r6, DigitalIdentityTypographyStyle r7) {
        p.l(r6, "background");
        this.f40778a = r2;
        this.f40779b = r3;
        this.f40780c = r4;
        this.d = r5;
        this.f40781e = r6;
        this.f40782f = r7;
    }

    public static /* synthetic */ k b(k r02, String r1, DigitalIdentityTextAlignment r2, Integer r3, l r4, b r5, DigitalIdentityTypographyStyle r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r02.f40778a;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r02.f40779b;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = r02.f40780c;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r4 = r02.d;
    L15:
        if ((r7 & 16) == 0) goto L18;
        r5 = r02.f40781e;
    L18:
        if ((r7 & 32) == 0) goto L20;
        r6 = r02.f40782f;
    L20:
        b r72 = r5;
        DigitalIdentityTypographyStyle r82 = r6;
        Integer r52 = r3;
        l r62 = r4;
        return r02.a(r1, r2, r52, r62, r72, r82);
    }

    public final k a(String r9, DigitalIdentityTextAlignment r10, Integer r11, l r12, b r13, DigitalIdentityTypographyStyle r14) {
        p.l(r13, "background");
        return new k(r9, r10, r11, r12, r13, r14);
    }

    public final b c() {
        return this.f40781e;
    }

    public final String d() {
        return this.f40778a;
    }

    public final DigitalIdentityTextAlignment e() {
        return this.f40779b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof k) == true) goto L8;
        return false;
    L8:
        k r52 = (k) r5;
        if (p.g(this.f40778a, r52.f40778a) == true) goto L12;
        return false;
    L12:
        if (this.f40779b == r52.f40779b) goto L15;
        return false;
    L15:
        if (p.g(this.f40780c, r52.f40780c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f40781e, r52.f40781e) == true) goto L24;
        return false;
    L24:
        if (this.f40782f == r52.f40782f) goto L26;
        return false;
    L26:
        return true;
    }

    public final l f() {
        return this.d;
    }

    public final Integer g() {
        return this.f40780c;
    }

    public final DigitalIdentityTypographyStyle h() {
        return this.f40782f;
    }

    public int hashCode() {
        String r02 = this.f40778a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        DigitalIdentityTextAlignment r2 = this.f40779b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Integer r23 = this.f40780c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        l r25 = this.d;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r27 = (this.f40781e.hashCode() + ((r06 + r26) * 31)) * 31;
        DigitalIdentityTypographyStyle r07 = this.f40782f;
        if (r07 == null) goto L23;
        r1 = r07.hashCode();
    L23:
        return r27 + r1;
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

    public final void i(String r1) {
        this.f40778a = r1;
    }

    public final void j(k r2) {
        if (r2 != null) goto L4;
        return;
    L4:
        String r02 = r2.f40778a;
        if (r02 != null) goto L7;
        r02 = this.f40778a;
    L7:
        this.f40778a = r02;
        DigitalIdentityTextAlignment r03 = r2.f40779b;
        if (r03 != null) goto L10;
        r03 = this.f40779b;
    L10:
        this.f40779b = r03;
        Integer r04 = r2.f40780c;
        if (r04 != null) goto L13;
        r04 = this.f40780c;
    L13:
        this.f40780c = r04;
        DigitalIdentityTypographyStyle r05 = r2.f40782f;
        if (r05 != null) goto L16;
        r05 = this.f40782f;
    L16:
        this.f40782f = r05;
        l r06 = r2.d;
        if (r06 != null) goto L19;
        r06 = this.d;
    L19:
        this.d = r06;
        this.f40781e.e(r2.f40781e);
    }

    public String toString() {
        return "DigitalIdentityText(text=" + this.f40778a + ", textAlignment=" + this.f40779b + ", textAppearanceRes=" + this.f40780c + ", textAppearance=" + this.d + ", background=" + this.f40781e + ", typographyStyle=" + this.f40782f + ")";
    }

    public /* synthetic */ k(String r12, DigitalIdentityTextAlignment r13, Integer r14, l r15, b r16, DigitalIdentityTypographyStyle r17, int r18, kotlin.jvm.internal.i r19) {
        if ((r18 & 1) == 0) goto L6;
        r12 = null;
    L6:
        if ((r18 & 2) == 0) goto L9;
        r13 = null;
    L9:
        if ((r18 & 4) == 0) goto L11;
        Integer r02 = null;
    L13:
        if ((r18 & 8) == 0) goto L15;
        l r2 = null;
    L17:
        if ((r18 & 16) == 0) goto L19;
        b r4 = new b(null, null, null, null, 15, null);
    L21:
        if ((r18 & 32) == 0) goto L24;
        DigitalIdentityTypographyStyle r182 = null;
    L25:
        this(r12, r13, r02, r2, r4, r182);
        return;
    L24:
        r182 = r17;
        goto L25
    L19:
        r4 = r16;
        goto L21
    L15:
        r2 = r15;
        goto L17
    L11:
        r02 = r14;
        goto L13
    }
}

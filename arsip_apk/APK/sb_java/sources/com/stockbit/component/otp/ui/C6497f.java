package com.stockbit.component.otp.ui;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.OTPChannelValue;

/* renamed from: com.stockbit.component.otp.ui.f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6497f {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f73444a;

    /* renamed from: b, reason: collision with root package name */
    public final String f73445b;

    /* renamed from: c, reason: collision with root package name */
    public final String f73446c;
    public final OTPChannelValue d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f73447e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f73448f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f73449g;

    /* renamed from: h, reason: collision with root package name */
    public final String f73450h;

    /* renamed from: i, reason: collision with root package name */
    public final Integer f73451i;

    /* renamed from: j, reason: collision with root package name */
    public final C6498g f73452j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f73453k;

    static {
    }

    public C6497f(boolean r2, String r3, String r4, OTPChannelValue r5, Integer r6, Integer r7, Integer r8, String r9, Integer r10, C6498g r11, boolean r12) {
        kotlin.jvm.internal.p.l(r3, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        kotlin.jvm.internal.p.l(r4, "typedOTP");
        this.f73444a = r2;
        this.f73445b = r3;
        this.f73446c = r4;
        this.d = r5;
        this.f73447e = r6;
        this.f73448f = r7;
        this.f73449g = r8;
        this.f73450h = r9;
        this.f73451i = r10;
        this.f73452j = r11;
        this.f73453k = r12;
    }

    public static /* synthetic */ C6497f b(C6497f r02, boolean r1, String r2, String r3, OTPChannelValue r4, Integer r5, Integer r6, Integer r7, String r8, Integer r9, C6498g r10, boolean r11, int r12, Object r13) {
        if ((r12 & 1) == 0) goto L6;
        r1 = r02.f73444a;
    L6:
        if ((r12 & 2) == 0) goto L9;
        r2 = r02.f73445b;
    L9:
        if ((r12 & 4) == 0) goto L12;
        r3 = r02.f73446c;
    L12:
        if ((r12 & 8) == 0) goto L15;
        r4 = r02.d;
    L15:
        if ((r12 & 16) == 0) goto L18;
        r5 = r02.f73447e;
    L18:
        if ((r12 & 32) == 0) goto L21;
        r6 = r02.f73448f;
    L21:
        if ((r12 & 64) == 0) goto L24;
        r7 = r02.f73449g;
    L24:
        if ((r12 & 128) == 0) goto L27;
        r8 = r02.f73450h;
    L27:
        if ((r12 & 256) == 0) goto L30;
        r9 = r02.f73451i;
    L30:
        if ((r12 & 512) == 0) goto L33;
        r10 = r02.f73452j;
    L33:
        if ((r12 & 1024) == 0) goto L35;
        r11 = r02.f73453k;
    L35:
        C6498g r122 = r10;
        boolean r132 = r11;
        String r102 = r8;
        Integer r112 = r9;
        Integer r82 = r6;
        Integer r92 = r7;
        OTPChannelValue r62 = r4;
        Integer r72 = r5;
        String r52 = r3;
        boolean r32 = r1;
        return r02.a(r32, r2, r52, r62, r72, r82, r92, r102, r112, r122, r132);
    }

    public final C6497f a(boolean r14, String r15, String r16, OTPChannelValue r17, Integer r18, Integer r19, Integer r20, String r21, Integer r22, C6498g r23, boolean r24) {
        kotlin.jvm.internal.p.l(r15, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        kotlin.jvm.internal.p.l(r16, "typedOTP");
        return new C6497f(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24);
    }

    public final Integer c() {
        return this.f73449g;
    }

    public final String d() {
        return this.f73450h;
    }

    public final String e() {
        return this.f73445b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C6497f) == true) goto L8;
        return false;
    L8:
        C6497f r52 = (C6497f) r5;
        if (this.f73444a == r52.f73444a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f73445b, r52.f73445b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f73446c, r52.f73446c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f73447e, r52.f73447e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f73448f, r52.f73448f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f73449g, r52.f73449g) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f73450h, r52.f73450h) == true) goto L33;
        return false;
    L33:
        if (kotlin.jvm.internal.p.g(this.f73451i, r52.f73451i) == true) goto L36;
        return false;
    L36:
        if (kotlin.jvm.internal.p.g(this.f73452j, r52.f73452j) == true) goto L39;
        return false;
    L39:
        if (this.f73453k == r52.f73453k) goto L41;
        return false;
    L41:
        return true;
    }

    public final Integer f() {
        return this.f73451i;
    }

    public final C6498g g() {
        return this.f73452j;
    }

    public final OTPChannelValue h() {
        return this.d;
    }

    public int hashCode() {
        int r02 = ((((Boolean.hashCode(this.f73444a) * 31) + this.f73445b.hashCode()) * 31) + this.f73446c.hashCode()) * 31;
        OTPChannelValue r1 = this.d;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        Integer r13 = this.f73447e;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (r03 + r14) * 31;
        Integer r15 = this.f73448f;
        if (r15 != null) goto L13;
        int r16 = 0;
    L14:
        int r05 = (r04 + r16) * 31;
        Integer r17 = this.f73449g;
        if (r17 != null) goto L17;
        int r18 = 0;
    L18:
        int r06 = (r05 + r18) * 31;
        String r19 = this.f73450h;
        if (r19 != null) goto L21;
        int r110 = 0;
    L22:
        int r07 = (r06 + r110) * 31;
        Integer r111 = this.f73451i;
        if (r111 != null) goto L25;
        int r112 = 0;
    L26:
        int r08 = (r07 + r112) * 31;
        C6498g r113 = this.f73452j;
        if (r113 == null) goto L31;
        r2 = r113.hashCode();
    L31:
        return ((r08 + r2) * 31) + Boolean.hashCode(this.f73453k);
    L25:
        r112 = r111.hashCode();
        goto L26
    L21:
        r110 = r19.hashCode();
        goto L22
    L17:
        r18 = r17.hashCode();
        goto L18
    L13:
        r16 = r15.hashCode();
        goto L14
    L9:
        r14 = r13.hashCode();
        goto L10
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public final boolean i() {
        return this.f73453k;
    }

    public final Integer j() {
        return this.f73448f;
    }

    public final Integer k() {
        return this.f73447e;
    }

    public final String l() {
        return this.f73446c;
    }

    public final boolean m() {
        return this.f73444a;
    }

    public String toString() {
        return "OTPInputEventState(isLoading=" + this.f73444a + ", error=" + this.f73445b + ", typedOTP=" + this.f73446c + ", selectedChannel=" + this.d + ", title=" + this.f73447e + ", subTitle=" + this.f73448f + ", description=" + this.f73449g + ", descriptionValue=" + this.f73450h + ", icon=" + this.f73451i + ", otpInputLimit=" + this.f73452j + ", showOTPInputLimit=" + this.f73453k + ')';
    }

    public /* synthetic */ C6497f(boolean r3, String r4, String r5, OTPChannelValue r6, Integer r7, Integer r8, Integer r9, String r10, Integer r11, C6498g r12, boolean r13, int r14, kotlin.jvm.internal.i r15) {
        if ((r14 & 1) == 0) goto L6;
        r3 = false;
    L6:
        if ((r14 & 2) == 0) goto L9;
        r4 = "";
    L9:
        if ((r14 & 4) == 0) goto L12;
        r5 = "";
    L12:
        if ((r14 & 8) == 0) goto L15;
        r6 = null;
    L15:
        if ((r14 & 16) == 0) goto L18;
        r7 = null;
    L18:
        if ((r14 & 32) == 0) goto L21;
        r8 = null;
    L21:
        if ((r14 & 64) == 0) goto L24;
        r9 = null;
    L24:
        if ((r14 & 128) == 0) goto L27;
        r10 = null;
    L27:
        if ((r14 & 256) == 0) goto L30;
        r11 = null;
    L30:
        if ((r14 & 512) == 0) goto L33;
        r12 = null;
    L33:
        if ((r14 & 1024) == 0) goto L36;
        boolean r142 = false;
    L35:
        C6498g r132 = r12;
        Integer r122 = r11;
        String r112 = r10;
        Integer r102 = r9;
        Integer r92 = r8;
        Integer r82 = r7;
        OTPChannelValue r72 = r6;
        String r62 = r5;
        this(r3, r4, r62, r72, r82, r92, r102, r112, r122, r132, r142);
        return;
    L36:
        r142 = r13;
        goto L35
    }
}

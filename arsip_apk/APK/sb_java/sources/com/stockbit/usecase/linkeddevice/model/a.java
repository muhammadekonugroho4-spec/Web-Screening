package com.stockbit.usecase.linkeddevice.model;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f158197a;

    /* renamed from: b, reason: collision with root package name */
    public final String f158198b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f158199c;
    public final LoginTypeUIState d;

    /* renamed from: e, reason: collision with root package name */
    public final DeviceTypeUIState f158200e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f158201f;

    /* renamed from: g, reason: collision with root package name */
    public final String f158202g;

    /* renamed from: h, reason: collision with root package name */
    public final String f158203h;

    public a(String r2, String r3, boolean r4, LoginTypeUIState r5, DeviceTypeUIState r6, boolean r7, String r8, String r9) {
        p.l(r2, "uuid");
        p.l(r3, "deviceName");
        p.l(r5, "loginType");
        p.l(r6, "deviceType");
        p.l(r8, "formattedDate");
        p.l(r9, "formattedLocation");
        this.f158197a = r2;
        this.f158198b = r3;
        this.f158199c = r4;
        this.d = r5;
        this.f158200e = r6;
        this.f158201f = r7;
        this.f158202g = r8;
        this.f158203h = r9;
    }

    public final boolean a() {
        return this.f158201f;
    }

    public final String b() {
        return this.f158198b;
    }

    public final DeviceTypeUIState c() {
        return this.f158200e;
    }

    public final String d() {
        return this.f158202g;
    }

    public final String e() {
        return this.f158203h;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f158197a, r52.f158197a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f158198b, r52.f158198b) == true) goto L15;
        return false;
    L15:
        if (this.f158199c == r52.f158199c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (this.f158200e == r52.f158200e) goto L24;
        return false;
    L24:
        if (this.f158201f == r52.f158201f) goto L27;
        return false;
    L27:
        if (p.g(this.f158202g, r52.f158202g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f158203h, r52.f158203h) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final LoginTypeUIState f() {
        return this.d;
    }

    public final String g() {
        return this.f158197a;
    }

    public final boolean h() {
        return this.f158199c;
    }

    public int hashCode() {
        return (((((((((((((this.f158197a.hashCode() * 31) + this.f158198b.hashCode()) * 31) + Boolean.hashCode(this.f158199c)) * 31) + this.d.hashCode()) * 31) + this.f158200e.hashCode()) * 31) + Boolean.hashCode(this.f158201f)) * 31) + this.f158202g.hashCode()) * 31) + this.f158203h.hashCode();
    }

    public String toString() {
        return "DeviceSessionUIState(uuid=" + this.f158197a + ", deviceName=" + this.f158198b + ", isCurrentDevice=" + this.f158199c + ", loginType=" + this.d + ", deviceType=" + this.f158200e + ", canRemove=" + this.f158201f + ", formattedDate=" + this.f158202g + ", formattedLocation=" + this.f158203h + ")";
    }

    public /* synthetic */ a(String r3, String r4, boolean r5, LoginTypeUIState r6, DeviceTypeUIState r7, boolean r8, String r9, String r10, int r11, i r12) {
        if ((r11 & 1) == 0) goto L6;
        r3 = "";
    L6:
        if ((r11 & 2) == 0) goto L9;
        r4 = "";
    L9:
        if ((r11 & 4) == 0) goto L12;
        r5 = false;
    L12:
        if ((r11 & 8) == 0) goto L15;
        r6 = LoginTypeUIState.LOGIN_TYPE_UNSPECIFIED;
    L15:
        if ((r11 & 16) == 0) goto L18;
        r7 = DeviceTypeUIState.DEVICE_TYPE_UNSPECIFIED;
    L18:
        if ((r11 & 32) == 0) goto L21;
        r8 = false;
    L21:
        if ((r11 & 64) == 0) goto L24;
        r9 = "";
    L24:
        if ((r11 & 128) == 0) goto L27;
        String r112 = "";
    L26:
        String r102 = r9;
        boolean r92 = r8;
        DeviceTypeUIState r82 = r7;
        LoginTypeUIState r72 = r6;
        boolean r62 = r5;
        this(r3, r4, r62, r72, r82, r92, r102, r112);
        return;
    L27:
        r112 = r10;
        goto L26
    }
}

package com.stockbit.component.inputphone.uistate;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final int f72288e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f72289a;

    /* renamed from: b, reason: collision with root package name */
    public final String f72290b;

    /* renamed from: c, reason: collision with root package name */
    public final String f72291c;
    public final String d;

    static {
    }

    public a(String r2, String r3, String r4, String r5) {
        p.l(r2, "flagId");
        p.l(r3, "phoneCode");
        p.l(r4, "countryId");
        p.l(r5, "flagIconWithPhoneId");
        this.f72289a = r2;
        this.f72290b = r3;
        this.f72291c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f72290b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f72289a, r52.f72289a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f72290b, r52.f72290b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f72291c, r52.f72291c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f72289a.hashCode() * 31) + this.f72290b.hashCode()) * 31) + this.f72291c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "CountryPhoneCodeUIState(flagId=" + this.f72289a + ", phoneCode=" + this.f72290b + ", countryId=" + this.f72291c + ", flagIconWithPhoneId=" + this.d + ')';
    }

    public /* synthetic */ a(String r1, String r2, String r3, String r4, int r5, i r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = Constants.KEY_ID;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = "62";
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = "ID";
    L12:
        if ((r5 & 8) == 0) goto L14;
        r4 = "🇮🇩 +62";
    L14:
        this(r1, r2, r3, r4);
    }
}

package com.stockbit.personalamend.ui.changedata.otp.phonenumber;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class f implements InterfaceC4094y {

    /* renamed from: g, reason: collision with root package name */
    public static final a f125474g = null;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f125475a;

    /* renamed from: b, reason: collision with root package name */
    public final String f125476b;

    /* renamed from: c, reason: collision with root package name */
    public final String f125477c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f125478e;

    /* renamed from: f, reason: collision with root package name */
    public final String f125479f;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final f a(Bundle r10) {
            p.l(r10, "bundle");
            r10.setClassLoader(f.class.getClassLoader());
            if (r10.containsKey("isChangePhoneNumber") == false) goto L30;
            boolean r3 = r10.getBoolean("isChangePhoneNumber");
            if (r10.containsKey("changeSource") == false) goto L28;
            String r4 = r10.getString("changeSource");
            if (r10.containsKey("currentEmail") == false) goto L26;
            String r5 = r10.getString("currentEmail");
            if (r10.containsKey("changeToken") == false) goto L24;
            String r6 = r10.getString("changeToken");
            if (r6 == null) goto L22;
            String r2 = "";
            if (r10.containsKey("whatsapp") == false) goto L15;
            String r7 = r10.getString("whatsapp");
        L17:
            if (r10.containsKey("sms") == false) goto L20;
            r2 = r10.getString("sms");
        L20:
            return new f(r3, r4, r5, r6, r7, r2);
        L15:
            r7 = "";
            goto L17
        L22:
            throw new IllegalArgumentException("Argument \"changeToken\" is marked as non-null but was passed a null value.");
        L24:
            throw new IllegalArgumentException("Required argument \"changeToken\" is missing and does not have an android:defaultValue");
        L26:
            throw new IllegalArgumentException("Required argument \"currentEmail\" is missing and does not have an android:defaultValue");
        L28:
            throw new IllegalArgumentException("Required argument \"changeSource\" is missing and does not have an android:defaultValue");
        L30:
            throw new IllegalArgumentException("Required argument \"isChangePhoneNumber\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f125474g = new a(null);
    }

    public f(boolean r2, String r3, String r4, String r5, String r6, String r7) {
        p.l(r5, "changeToken");
        this.f125475a = r2;
        this.f125476b = r3;
        this.f125477c = r4;
        this.d = r5;
        this.f125478e = r6;
        this.f125479f = r7;
    }

    public static final f fromBundle(Bundle r1) {
        return f125474g.a(r1);
    }

    public final String a() {
        return this.f125476b;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f125477c;
    }

    public final String d() {
        return this.f125479f;
    }

    public final String e() {
        return this.f125478e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (this.f125475a == r52.f125475a) goto L12;
        return false;
    L12:
        if (p.g(this.f125476b, r52.f125476b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f125477c, r52.f125477c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f125478e, r52.f125478e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f125479f, r52.f125479f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final boolean f() {
        return this.f125475a;
    }

    public int hashCode() {
        int r02 = Boolean.hashCode(this.f125475a) * 31;
        String r1 = this.f125476b;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.f125477c;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (((r03 + r14) * 31) + this.d.hashCode()) * 31;
        String r15 = this.f125478e;
        if (r15 != null) goto L13;
        int r16 = 0;
    L14:
        int r05 = (r04 + r16) * 31;
        String r17 = this.f125479f;
        if (r17 == null) goto L19;
        r2 = r17.hashCode();
    L19:
        return r05 + r2;
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

    public String toString() {
        return "ChangeDataInputPhoneNumberOtpFragmentArgs(isChangePhoneNumber=" + this.f125475a + ", changeSource=" + this.f125476b + ", currentEmail=" + this.f125477c + ", changeToken=" + this.d + ", whatsapp=" + this.f125478e + ", sms=" + this.f125479f + ')';
    }
}

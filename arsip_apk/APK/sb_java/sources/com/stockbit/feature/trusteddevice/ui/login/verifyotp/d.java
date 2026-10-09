package com.stockbit.feature.trusteddevice.ui.login.verifyotp;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class d implements InterfaceC4094y {

    /* renamed from: e, reason: collision with root package name */
    public static final a f118461e = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f118462a;

    /* renamed from: b, reason: collision with root package name */
    public final String f118463b;

    /* renamed from: c, reason: collision with root package name */
    public final String f118464c;
    public final String d;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final d a(Bundle r6) {
            p.l(r6, "bundle");
            r6.setClassLoader(d.class.getClassLoader());
            if (r6.containsKey("token") == false) goto L27;
            String r02 = r6.getString("token");
            if (r02 == null) goto L25;
            if (r6.containsKey("email") == false) goto L23;
            String r1 = r6.getString("email");
            if (r1 == null) goto L21;
            if (r6.containsKey("phone") == false) goto L19;
            String r2 = r6.getString("phone");
            if (r6.containsKey("whatsapp") == false) goto L17;
            return new d(r02, r1, r2, r6.getString("whatsapp"));
        L17:
            throw new IllegalArgumentException("Required argument \"whatsapp\" is missing and does not have an android:defaultValue");
        L19:
            throw new IllegalArgumentException("Required argument \"phone\" is missing and does not have an android:defaultValue");
        L21:
            throw new IllegalArgumentException("Argument \"email\" is marked as non-null but was passed a null value.");
        L23:
            throw new IllegalArgumentException("Required argument \"email\" is missing and does not have an android:defaultValue");
        L25:
            throw new IllegalArgumentException("Argument \"token\" is marked as non-null but was passed a null value.");
        L27:
            throw new IllegalArgumentException("Required argument \"token\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f118461e = new a(null);
    }

    public d(String r2, String r3, String r4, String r5) {
        p.l(r2, "token");
        p.l(r3, "email");
        this.f118462a = r2;
        this.f118463b = r3;
        this.f118464c = r4;
        this.d = r5;
    }

    public static final d fromBundle(Bundle r1) {
        return f118461e.a(r1);
    }

    public final String a() {
        return this.f118463b;
    }

    public final String b() {
        return this.f118464c;
    }

    public final String c() {
        return this.f118462a;
    }

    public final String d() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f118462a, r52.f118462a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f118463b, r52.f118463b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f118464c, r52.f118464c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        int r02 = ((this.f118462a.hashCode() * 31) + this.f118463b.hashCode()) * 31;
        String r1 = this.f118464c;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.d;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return r03 + r2;
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "LoginVerifyOTPFragmentArgs(token=" + this.f118462a + ", email=" + this.f118463b + ", phone=" + this.f118464c + ", whatsapp=" + this.d + ')';
    }
}

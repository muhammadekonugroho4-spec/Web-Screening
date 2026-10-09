package com.stockbit.feature.trusteddevice.ui.setup.otp;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes9.dex */
public final class k implements InterfaceC4094y {

    /* renamed from: c, reason: collision with root package name */
    public static final a f118746c = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f118747a;

    /* renamed from: b, reason: collision with root package name */
    public final String f118748b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final k a(Bundle r4) {
            kotlin.jvm.internal.p.l(r4, "bundle");
            r4.setClassLoader(k.class.getClassLoader());
            if (r4.containsKey("email") == false) goto L19;
            String r02 = r4.getString("email");
            if (r02 == null) goto L17;
            if (r4.containsKey("phone") == false) goto L15;
            String r42 = r4.getString("phone");
            if (r42 == null) goto L13;
            return new k(r02, r42);
        L13:
            throw new IllegalArgumentException("Argument \"phone\" is marked as non-null but was passed a null value.");
        L15:
            throw new IllegalArgumentException("Required argument \"phone\" is missing and does not have an android:defaultValue");
        L17:
            throw new IllegalArgumentException("Argument \"email\" is marked as non-null but was passed a null value.");
        L19:
            throw new IllegalArgumentException("Required argument \"email\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f118746c = new a(null);
    }

    public k(String r2, String r3) {
        kotlin.jvm.internal.p.l(r2, "email");
        kotlin.jvm.internal.p.l(r3, "phone");
        this.f118747a = r2;
        this.f118748b = r3;
    }

    public static final k fromBundle(Bundle r1) {
        return f118746c.a(r1);
    }

    public final String a() {
        return this.f118747a;
    }

    public final String b() {
        return this.f118748b;
    }

    public final Bundle c() {
        Bundle r02 = new Bundle();
        r02.putString("email", this.f118747a);
        r02.putString("phone", this.f118748b);
        return r02;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof k) == true) goto L8;
        return false;
    L8:
        k r52 = (k) r5;
        if (kotlin.jvm.internal.p.g(this.f118747a, r52.f118747a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f118748b, r52.f118748b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f118747a.hashCode() * 31) + this.f118748b.hashCode();
    }

    public String toString() {
        return "SetupOTPFragmentArgs(email=" + this.f118747a + ", phone=" + this.f118748b + ')';
    }
}

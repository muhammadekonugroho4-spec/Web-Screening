package com.stockbit.onboarding.ui.forgotpassword.otp;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class c implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f123623b = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f123624a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final c a(Bundle r3) {
            p.l(r3, "bundle");
            r3.setClassLoader(c.class.getClassLoader());
            if (r3.containsKey("email") == false) goto L11;
            String r32 = r3.getString("email");
            if (r32 == null) goto L9;
            return new c(r32);
        L9:
            throw new IllegalArgumentException("Argument \"email\" is marked as non-null but was passed a null value.");
        L11:
            throw new IllegalArgumentException("Required argument \"email\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f123623b = new a(null);
    }

    public c(String r2) {
        p.l(r2, "email");
        this.f123624a = r2;
    }

    public static final c fromBundle(Bundle r1) {
        return f123623b.a(r1);
    }

    public final String a() {
        return this.f123624a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof c) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f123624a, ((c) r4).f123624a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f123624a.hashCode();
    }

    public String toString() {
        return "ForgotPasswordOTPFragmentArgs(email=" + this.f123624a + ')';
    }
}

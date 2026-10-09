package com.stockbit.feature.trusteddevice.ui.change.verifyotp;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class c implements InterfaceC4094y {
    public static final a d = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f118100a;

    /* renamed from: b, reason: collision with root package name */
    public final String f118101b;

    /* renamed from: c, reason: collision with root package name */
    public final String f118102c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final c a(Bundle r5) {
            p.l(r5, "bundle");
            r5.setClassLoader(c.class.getClassLoader());
            if (r5.containsKey("token") == false) goto L23;
            String r02 = r5.getString("token");
            if (r02 == null) goto L21;
            if (r5.containsKey("email") == false) goto L19;
            String r1 = r5.getString("email");
            if (r1 == null) goto L17;
            if (r5.containsKey("phone") == false) goto L15;
            return new c(r02, r1, r5.getString("phone"));
        L15:
            throw new IllegalArgumentException("Required argument \"phone\" is missing and does not have an android:defaultValue");
        L17:
            throw new IllegalArgumentException("Argument \"email\" is marked as non-null but was passed a null value.");
        L19:
            throw new IllegalArgumentException("Required argument \"email\" is missing and does not have an android:defaultValue");
        L21:
            throw new IllegalArgumentException("Argument \"token\" is marked as non-null but was passed a null value.");
        L23:
            throw new IllegalArgumentException("Required argument \"token\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        d = new a(null);
    }

    public c(String r2, String r3, String r4) {
        p.l(r2, "token");
        p.l(r3, "email");
        this.f118100a = r2;
        this.f118101b = r3;
        this.f118102c = r4;
    }

    public static final c fromBundle(Bundle r1) {
        return d.a(r1);
    }

    public final String a() {
        return this.f118101b;
    }

    public final String b() {
        return this.f118102c;
    }

    public final String c() {
        return this.f118100a;
    }

    public final Bundle d() {
        Bundle r02 = new Bundle();
        r02.putString("token", this.f118100a);
        r02.putString("email", this.f118101b);
        r02.putString("phone", this.f118102c);
        return r02;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f118100a, r52.f118100a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f118101b, r52.f118101b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f118102c, r52.f118102c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int r02 = ((this.f118100a.hashCode() * 31) + this.f118101b.hashCode()) * 31;
        String r1 = this.f118102c;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "ChangeVerifyOTPFragmentArgs(token=" + this.f118100a + ", email=" + this.f118101b + ", phone=" + this.f118102c + ')';
    }
}

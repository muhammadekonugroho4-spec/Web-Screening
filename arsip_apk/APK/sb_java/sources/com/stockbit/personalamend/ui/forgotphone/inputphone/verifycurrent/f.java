package com.stockbit.personalamend.ui.forgotphone.inputphone.verifycurrent;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes10.dex */
public final class f implements InterfaceC4094y {

    /* renamed from: c, reason: collision with root package name */
    public static final a f126162c = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f126163a;

    /* renamed from: b, reason: collision with root package name */
    public final String f126164b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final f a(Bundle r4) {
            kotlin.jvm.internal.p.l(r4, "bundle");
            r4.setClassLoader(f.class.getClassLoader());
            if (r4.containsKey("token") == false) goto L19;
            String r02 = r4.getString("token");
            if (r02 == null) goto L17;
            if (r4.containsKey("maskedCurrentPhoneNumber") == false) goto L15;
            String r42 = r4.getString("maskedCurrentPhoneNumber");
            if (r42 == null) goto L13;
            return new f(r02, r42);
        L13:
            throw new IllegalArgumentException("Argument \"maskedCurrentPhoneNumber\" is marked as non-null but was passed a null value.");
        L15:
            throw new IllegalArgumentException("Required argument \"maskedCurrentPhoneNumber\" is missing and does not have an android:defaultValue");
        L17:
            throw new IllegalArgumentException("Argument \"token\" is marked as non-null but was passed a null value.");
        L19:
            throw new IllegalArgumentException("Required argument \"token\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f126162c = new a(null);
    }

    public f(String r2, String r3) {
        kotlin.jvm.internal.p.l(r2, "token");
        kotlin.jvm.internal.p.l(r3, "maskedCurrentPhoneNumber");
        this.f126163a = r2;
        this.f126164b = r3;
    }

    public static final f fromBundle(Bundle r1) {
        return f126162c.a(r1);
    }

    public final String a() {
        return this.f126164b;
    }

    public final String b() {
        return this.f126163a;
    }

    public final Bundle c() {
        Bundle r02 = new Bundle();
        r02.putString("token", this.f126163a);
        r02.putString("maskedCurrentPhoneNumber", this.f126164b);
        return r02;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (kotlin.jvm.internal.p.g(this.f126163a, r52.f126163a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f126164b, r52.f126164b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f126163a.hashCode() * 31) + this.f126164b.hashCode();
    }

    public String toString() {
        return "InputLostPhoneNumberFragmentArgs(token=" + this.f126163a + ", maskedCurrentPhoneNumber=" + this.f126164b + ')';
    }
}

package com.stockbit.personalamend.ui.forgotpin.identity;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import com.stockbit.usecase.forgotpin.resource.ForgotPinLoginState;
import java.io.Serializable;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class a implements InterfaceC4094y {

    /* renamed from: c, reason: collision with root package name */
    public static final C1130a f126267c = null;
    public static final int d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ForgotPinLoginState f126268a;

    /* renamed from: b, reason: collision with root package name */
    public final String f126269b;

    /* renamed from: com.stockbit.personalamend.ui.forgotpin.identity.a$a, reason: collision with other inner class name */
    public static final class C1130a {
        public /* synthetic */ C1130a(i r1) {
            this();
        }

        public final a a(Bundle r4) {
            p.l(r4, "bundle");
            r4.setClassLoader(a.class.getClassLoader());
            if (r4.containsKey("loginState") == false) goto L26;
            if (Parcelable.class.isAssignableFrom(ForgotPinLoginState.class) == false) goto L7;
        L11:
            ForgotPinLoginState r02 = (ForgotPinLoginState) r4.get("loginState");
            if (r02 == null) goto L24;
            if (r4.containsKey("token") == false) goto L22;
            String r42 = r4.getString("token");
            if (r42 == null) goto L20;
            return new a(r02, r42);
        L20:
            throw new IllegalArgumentException("Argument \"token\" is marked as non-null but was passed a null value.");
        L22:
            throw new IllegalArgumentException("Required argument \"token\" is missing and does not have an android:defaultValue");
        L24:
            throw new IllegalArgumentException("Argument \"loginState\" is marked as non-null but was passed a null value.");
        L7:
            if (Serializable.class.isAssignableFrom(ForgotPinLoginState.class) == true) goto L11;
            throw new UnsupportedOperationException(ForgotPinLoginState.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        L26:
            throw new IllegalArgumentException("Required argument \"loginState\" is missing and does not have an android:defaultValue");
        }

        public C1130a() {
        }
    }

    static {
        f126267c = new C1130a(null);
        d = 8;
    }

    public a(ForgotPinLoginState r2, String r3) {
        p.l(r2, "loginState");
        p.l(r3, "token");
        this.f126268a = r2;
        this.f126269b = r3;
    }

    public static final a fromBundle(Bundle r1) {
        return f126267c.a(r1);
    }

    public final ForgotPinLoginState a() {
        return this.f126268a;
    }

    public final String b() {
        return this.f126269b;
    }

    public final Bundle c() {
        Bundle r02 = new Bundle();
        if (Parcelable.class.isAssignableFrom(ForgotPinLoginState.class) == false) goto L6;
        ForgotPinLoginState r1 = this.f126268a;
        p.j(r1, "null cannot be cast to non-null type android.os.Parcelable");
        r02.putParcelable("loginState", r1);
    L8:
        r02.putString("token", this.f126269b);
        return r02;
    L6:
        if (Serializable.class.isAssignableFrom(ForgotPinLoginState.class) == false) goto L11;
        Parcelable r12 = this.f126268a;
        p.j(r12, "null cannot be cast to non-null type java.io.Serializable");
        r02.putSerializable("loginState", (Serializable) r12);
        goto L8
    L11:
        throw new UnsupportedOperationException(ForgotPinLoginState.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f126268a, r52.f126268a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f126269b, r52.f126269b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f126268a.hashCode() * 31) + this.f126269b.hashCode();
    }

    public String toString() {
        return "ForgotPinIdentityFragmentArgs(loginState=" + this.f126268a + ", token=" + this.f126269b + ')';
    }
}

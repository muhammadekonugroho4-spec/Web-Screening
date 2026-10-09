package com.stockbit.personalamend.ui.forgotpin.pin.confirm;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import com.stockbit.usecase.forgotpin.resource.ForgotPinLoginState;
import java.io.Serializable;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class b implements InterfaceC4094y {

    /* renamed from: c, reason: collision with root package name */
    public static final a f126341c = null;
    public static final int d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ForgotPinLoginState f126342a;

    /* renamed from: b, reason: collision with root package name */
    public final String f126343b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final b a(Bundle r4) {
            p.l(r4, "bundle");
            r4.setClassLoader(b.class.getClassLoader());
            if (r4.containsKey("loginState") == false) goto L26;
            if (Parcelable.class.isAssignableFrom(ForgotPinLoginState.class) == false) goto L7;
        L11:
            ForgotPinLoginState r02 = (ForgotPinLoginState) r4.get("loginState");
            if (r02 == null) goto L24;
            if (r4.containsKey("token") == false) goto L22;
            String r42 = r4.getString("token");
            if (r42 == null) goto L20;
            return new b(r02, r42);
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

        public a() {
        }
    }

    static {
        f126341c = new a(null);
        d = 8;
    }

    public b(ForgotPinLoginState r2, String r3) {
        p.l(r2, "loginState");
        p.l(r3, "token");
        this.f126342a = r2;
        this.f126343b = r3;
    }

    public static final b fromBundle(Bundle r1) {
        return f126341c.a(r1);
    }

    public final ForgotPinLoginState a() {
        return this.f126342a;
    }

    public final String b() {
        return this.f126343b;
    }

    public final Bundle c() {
        Bundle r02 = new Bundle();
        if (Parcelable.class.isAssignableFrom(ForgotPinLoginState.class) == false) goto L6;
        ForgotPinLoginState r1 = this.f126342a;
        p.j(r1, "null cannot be cast to non-null type android.os.Parcelable");
        r02.putParcelable("loginState", r1);
    L8:
        r02.putString("token", this.f126343b);
        return r02;
    L6:
        if (Serializable.class.isAssignableFrom(ForgotPinLoginState.class) == false) goto L11;
        Parcelable r12 = this.f126342a;
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
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f126342a, r52.f126342a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f126343b, r52.f126343b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f126342a.hashCode() * 31) + this.f126343b.hashCode();
    }

    public String toString() {
        return "ForgotPinConfirmFragmentArgs(loginState=" + this.f126342a + ", token=" + this.f126343b + ')';
    }
}

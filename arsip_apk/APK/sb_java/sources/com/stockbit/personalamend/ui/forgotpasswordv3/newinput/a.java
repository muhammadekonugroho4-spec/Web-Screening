package com.stockbit.personalamend.ui.forgotpasswordv3.newinput;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import com.stockbit.usecase.personalamend.model.ForgotPasswordLoginState;
import java.io.Serializable;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class a implements InterfaceC4094y {

    /* renamed from: c, reason: collision with root package name */
    public static final C1123a f125986c = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f125987a;

    /* renamed from: b, reason: collision with root package name */
    public final ForgotPasswordLoginState f125988b;

    /* renamed from: com.stockbit.personalamend.ui.forgotpasswordv3.newinput.a$a, reason: collision with other inner class name */
    public static final class C1123a {
        public /* synthetic */ C1123a(i r1) {
            this();
        }

        public final a a(Bundle r5) {
            p.l(r5, "bundle");
            r5.setClassLoader(a.class.getClassLoader());
            if (r5.containsKey("token") == false) goto L26;
            String r02 = r5.getString("token");
            if (r02 == null) goto L24;
            if (r5.containsKey("loginState") == false) goto L22;
            if (Parcelable.class.isAssignableFrom(ForgotPasswordLoginState.class) == false) goto L11;
        L15:
            ForgotPasswordLoginState r52 = (ForgotPasswordLoginState) r5.get("loginState");
            if (r52 == null) goto L20;
            return new a(r02, r52);
        L20:
            throw new IllegalArgumentException("Argument \"loginState\" is marked as non-null but was passed a null value.");
        L11:
            if (Serializable.class.isAssignableFrom(ForgotPasswordLoginState.class) == true) goto L15;
            throw new UnsupportedOperationException(ForgotPasswordLoginState.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        L22:
            throw new IllegalArgumentException("Required argument \"loginState\" is missing and does not have an android:defaultValue");
        L24:
            throw new IllegalArgumentException("Argument \"token\" is marked as non-null but was passed a null value.");
        L26:
            throw new IllegalArgumentException("Required argument \"token\" is missing and does not have an android:defaultValue");
        }

        public C1123a() {
        }
    }

    static {
        f125986c = new C1123a(null);
    }

    public a(String r2, ForgotPasswordLoginState r3) {
        p.l(r2, "token");
        p.l(r3, "loginState");
        this.f125987a = r2;
        this.f125988b = r3;
    }

    public static final a fromBundle(Bundle r1) {
        return f125986c.a(r1);
    }

    public final ForgotPasswordLoginState a() {
        return this.f125988b;
    }

    public final String b() {
        return this.f125987a;
    }

    public final Bundle c() {
        Bundle r02 = new Bundle();
        r02.putString("token", this.f125987a);
        if (Parcelable.class.isAssignableFrom(ForgotPasswordLoginState.class) == false) goto L7;
        Object r1 = this.f125988b;
        p.j(r1, "null cannot be cast to non-null type android.os.Parcelable");
        r02.putParcelable("loginState", (Parcelable) r1);
        return r02;
    L7:
        if (Serializable.class.isAssignableFrom(ForgotPasswordLoginState.class) == false) goto L11;
        ForgotPasswordLoginState r12 = this.f125988b;
        p.j(r12, "null cannot be cast to non-null type java.io.Serializable");
        r02.putSerializable("loginState", r12);
        return r02;
    L11:
        throw new UnsupportedOperationException(ForgotPasswordLoginState.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f125987a, r52.f125987a) == true) goto L12;
        return false;
    L12:
        if (this.f125988b == r52.f125988b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f125987a.hashCode() * 31) + this.f125988b.hashCode();
    }

    public String toString() {
        return "ForgotPasswordNewInputFragmentArgs(token=" + this.f125987a + ", loginState=" + this.f125988b + ')';
    }
}

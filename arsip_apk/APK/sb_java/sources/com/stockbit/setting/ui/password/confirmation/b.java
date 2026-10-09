package com.stockbit.setting.ui.password.confirmation;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import com.stockbit.domain.model.type.PasswordConfirmationType;
import java.io.Serializable;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class b implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f136473b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f136474c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final PasswordConfirmationType f136475a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final b a(Bundle r4) {
            p.l(r4, "bundle");
            r4.setClassLoader(b.class.getClassLoader());
            if (r4.containsKey("validatePasswordType") == false) goto L18;
            if (Parcelable.class.isAssignableFrom(PasswordConfirmationType.class) == false) goto L7;
        L11:
            PasswordConfirmationType r42 = (PasswordConfirmationType) r4.get("validatePasswordType");
            if (r42 == null) goto L16;
            return new b(r42);
        L16:
            throw new IllegalArgumentException("Argument \"validatePasswordType\" is marked as non-null but was passed a null value.");
        L7:
            if (Serializable.class.isAssignableFrom(PasswordConfirmationType.class) == true) goto L11;
            throw new UnsupportedOperationException(PasswordConfirmationType.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        L18:
            throw new IllegalArgumentException("Required argument \"validatePasswordType\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f136473b = new a(null);
        f136474c = 8;
    }

    public b(PasswordConfirmationType r2) {
        p.l(r2, "validatePasswordType");
        this.f136475a = r2;
    }

    public static final b fromBundle(Bundle r1) {
        return f136473b.a(r1);
    }

    public final PasswordConfirmationType a() {
        return this.f136475a;
    }

    public final Bundle b() {
        Bundle r02 = new Bundle();
        if (Parcelable.class.isAssignableFrom(PasswordConfirmationType.class) == false) goto L7;
        PasswordConfirmationType r1 = this.f136475a;
        p.j(r1, "null cannot be cast to non-null type android.os.Parcelable");
        r02.putParcelable("validatePasswordType", r1);
        return r02;
    L7:
        if (Serializable.class.isAssignableFrom(PasswordConfirmationType.class) == false) goto L11;
        Parcelable r12 = this.f136475a;
        p.j(r12, "null cannot be cast to non-null type java.io.Serializable");
        r02.putSerializable("validatePasswordType", (Serializable) r12);
        return r02;
    L11:
        throw new UnsupportedOperationException(PasswordConfirmationType.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof b) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f136475a, ((b) r4).f136475a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f136475a.hashCode();
    }

    public String toString() {
        return "SettingPasswordConfirmationFragmentArgs(validatePasswordType=" + this.f136475a + ')';
    }
}

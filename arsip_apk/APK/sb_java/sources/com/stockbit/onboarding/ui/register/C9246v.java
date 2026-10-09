package com.stockbit.onboarding.ui.register;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import com.stockbit.domain.model.valueobject.Register;
import java.io.Serializable;

/* renamed from: com.stockbit.onboarding.ui.register.v, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9246v implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f124091b = null;

    /* renamed from: a, reason: collision with root package name */
    public final Register f124092a;

    /* renamed from: com.stockbit.onboarding.ui.register.v$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final C9246v a(Bundle r4) {
            kotlin.jvm.internal.p.l(r4, "bundle");
            r4.setClassLoader(C9246v.class.getClassLoader());
            if (r4.containsKey("registerParams") == false) goto L14;
            if (Parcelable.class.isAssignableFrom(Register.class) == true) goto L12;
            if (Serializable.class.isAssignableFrom(Register.class) == true) goto L12;
            throw new UnsupportedOperationException(Register.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        L12:
            return new C9246v((Register) r4.get("registerParams"));
        L14:
            throw new IllegalArgumentException("Required argument \"registerParams\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f124091b = new a(null);
    }

    public C9246v(Register r1) {
        this.f124092a = r1;
    }

    public static final C9246v fromBundle(Bundle r1) {
        return f124091b.a(r1);
    }

    public final Register a() {
        return this.f124092a;
    }

    public final Bundle b() {
        Bundle r02 = new Bundle();
        if (Parcelable.class.isAssignableFrom(Register.class) == false) goto L7;
        r02.putParcelable("registerParams", this.f124092a);
        return r02;
    L7:
        if (Serializable.class.isAssignableFrom(Register.class) == false) goto L11;
        r02.putSerializable("registerParams", (Serializable) this.f124092a);
        return r02;
    L11:
        throw new UnsupportedOperationException(Register.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof C9246v) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f124092a, ((C9246v) r4).f124092a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        Register r02 = this.f124092a;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public String toString() {
        return "RegisterPhoneNumberFragmentArgs(registerParams=" + this.f124092a + ')';
    }
}

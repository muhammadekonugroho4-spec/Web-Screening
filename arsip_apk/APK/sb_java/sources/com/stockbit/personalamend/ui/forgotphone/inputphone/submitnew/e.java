package com.stockbit.personalamend.ui.forgotphone.inputphone.submitnew;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes10.dex */
public final class e implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f126105b = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f126106a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final e a(Bundle r3) {
            kotlin.jvm.internal.p.l(r3, "bundle");
            r3.setClassLoader(e.class.getClassLoader());
            if (r3.containsKey("token") == false) goto L11;
            String r32 = r3.getString("token");
            if (r32 == null) goto L9;
            return new e(r32);
        L9:
            throw new IllegalArgumentException("Argument \"token\" is marked as non-null but was passed a null value.");
        L11:
            throw new IllegalArgumentException("Required argument \"token\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f126105b = new a(null);
    }

    public e(String r2) {
        kotlin.jvm.internal.p.l(r2, "token");
        this.f126106a = r2;
    }

    public static final e fromBundle(Bundle r1) {
        return f126105b.a(r1);
    }

    public final String a() {
        return this.f126106a;
    }

    public final Bundle b() {
        Bundle r02 = new Bundle();
        r02.putString("token", this.f126106a);
        return r02;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof e) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f126106a, ((e) r4).f126106a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f126106a.hashCode();
    }

    public String toString() {
        return "InputNewPhoneNumberFragmentArgs(token=" + this.f126106a + ')';
    }
}

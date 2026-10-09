package com.stockbit.personalamend.ui.forgotphone.facematching;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class a implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final C1127a f126062b = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f126063a;

    /* renamed from: com.stockbit.personalamend.ui.forgotphone.facematching.a$a, reason: collision with other inner class name */
    public static final class C1127a {
        public /* synthetic */ C1127a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final a a(Bundle r3) {
            p.l(r3, "bundle");
            r3.setClassLoader(a.class.getClassLoader());
            if (r3.containsKey("refId") == false) goto L11;
            String r32 = r3.getString("refId");
            if (r32 == null) goto L9;
            return new a(r32);
        L9:
            throw new IllegalArgumentException("Argument \"refId\" is marked as non-null but was passed a null value.");
        L11:
            throw new IllegalArgumentException("Required argument \"refId\" is missing and does not have an android:defaultValue");
        }

        public C1127a() {
        }
    }

    static {
        f126062b = new C1127a(null);
    }

    public a(String r2) {
        p.l(r2, "refId");
        this.f126063a = r2;
    }

    public static final a fromBundle(Bundle r1) {
        return f126062b.a(r1);
    }

    public final String a() {
        return this.f126063a;
    }

    public final Bundle b() {
        Bundle r02 = new Bundle();
        r02.putString("refId", this.f126063a);
        return r02;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof a) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f126063a, ((a) r4).f126063a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f126063a.hashCode();
    }

    public String toString() {
        return "ForgotPhoneValidateFaceMatchingFragmentArgs(refId=" + this.f126063a + ')';
    }
}

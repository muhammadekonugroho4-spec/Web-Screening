package com.stockbit.feature.trusteddevice.ui.change.verifypin;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class c implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f118158b = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f118159a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final c a(Bundle r3) {
            p.l(r3, "bundle");
            r3.setClassLoader(c.class.getClassLoader());
            if (r3.containsKey("token") == false) goto L11;
            String r32 = r3.getString("token");
            if (r32 == null) goto L9;
            return new c(r32);
        L9:
            throw new IllegalArgumentException("Argument \"token\" is marked as non-null but was passed a null value.");
        L11:
            throw new IllegalArgumentException("Required argument \"token\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f118158b = new a(null);
    }

    public c(String r2) {
        p.l(r2, "token");
        this.f118159a = r2;
    }

    public static final c fromBundle(Bundle r1) {
        return f118158b.a(r1);
    }

    public final String a() {
        return this.f118159a;
    }

    public final Bundle b() {
        Bundle r02 = new Bundle();
        r02.putString("token", this.f118159a);
        return r02;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof c) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f118159a, ((c) r4).f118159a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f118159a.hashCode();
    }

    public String toString() {
        return "ChangeVerifyPINFragmentArgs(token=" + this.f118159a + ')';
    }
}

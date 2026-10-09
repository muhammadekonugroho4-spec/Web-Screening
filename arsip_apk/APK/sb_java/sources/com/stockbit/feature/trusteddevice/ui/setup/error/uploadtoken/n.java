package com.stockbit.feature.trusteddevice.ui.setup.error.uploadtoken;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes9.dex */
public final class n implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f118655b = null;

    /* renamed from: a, reason: collision with root package name */
    public final long f118656a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final n a(Bundle r3) {
            kotlin.jvm.internal.p.l(r3, "bundle");
            r3.setClassLoader(n.class.getClassLoader());
            if (r3.containsKey("timeleft") == false) goto L7;
            return new n(r3.getLong("timeleft"));
        L7:
            throw new IllegalArgumentException("Required argument \"timeleft\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f118655b = new a(null);
    }

    public n(long r1) {
        this.f118656a = r1;
    }

    public static final n fromBundle(Bundle r1) {
        return f118655b.a(r1);
    }

    public final long a() {
        return this.f118656a;
    }

    public final Bundle b() {
        Bundle r02 = new Bundle();
        r02.putLong("timeleft", this.f118656a);
        return r02;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof n) == true) goto L9;
        return false;
    L9:
        if (this.f118656a == ((n) r8).f118656a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Long.hashCode(this.f118656a);
    }

    public String toString() {
        return "SetupErrorTokenFragmentArgs(timeleft=" + this.f118656a + ')';
    }
}

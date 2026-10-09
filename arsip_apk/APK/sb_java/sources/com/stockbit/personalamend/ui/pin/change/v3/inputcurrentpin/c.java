package com.stockbit.personalamend.ui.pin.change.v3.inputcurrentpin;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class c implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f126855b = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f126856a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final c a(Bundle r3) {
            p.l(r3, "bundle");
            r3.setClassLoader(c.class.getClassLoader());
            if (r3.containsKey("sessionToken") == false) goto L7;
            return new c(r3.getString("sessionToken"));
        L7:
            throw new IllegalArgumentException("Required argument \"sessionToken\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f126855b = new a(null);
    }

    public c(String r1) {
        this.f126856a = r1;
    }

    public static final c fromBundle(Bundle r1) {
        return f126855b.a(r1);
    }

    public final String a() {
        return this.f126856a;
    }

    public final Bundle b() {
        Bundle r02 = new Bundle();
        r02.putString("sessionToken", this.f126856a);
        return r02;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof c) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f126856a, ((c) r4).f126856a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        String r02 = this.f126856a;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public String toString() {
        return "InputCurrentPinFragmentArgs(sessionToken=" + this.f126856a + ')';
    }
}

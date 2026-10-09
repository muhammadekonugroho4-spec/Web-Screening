package com.stockbit.linkeddevice.ui.passwordconfirmation;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class b implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f121049b = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f121050a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final b a(Bundle r3) {
            p.l(r3, "bundle");
            r3.setClassLoader(b.class.getClassLoader());
            if (r3.containsKey("uuid") == false) goto L11;
            String r32 = r3.getString("uuid");
            if (r32 == null) goto L9;
            return new b(r32);
        L9:
            throw new IllegalArgumentException("Argument \"uuid\" is marked as non-null but was passed a null value.");
        L11:
            throw new IllegalArgumentException("Required argument \"uuid\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f121049b = new a(null);
    }

    public b(String r2) {
        p.l(r2, "uuid");
        this.f121050a = r2;
    }

    public static final b fromBundle(Bundle r1) {
        return f121049b.a(r1);
    }

    public final String a() {
        return this.f121050a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof b) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f121050a, ((b) r4).f121050a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f121050a.hashCode();
    }

    public String toString() {
        return "LinkedDevicePasswordConfirmationFragmentArgs(uuid=" + this.f121050a + ')';
    }
}

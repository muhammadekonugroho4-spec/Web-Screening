package com.stockbit.personalamend.ui.pin.change.v3.createnewpin;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class b implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f126794b = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f126795a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final b a(Bundle r3) {
            p.l(r3, "bundle");
            r3.setClassLoader(b.class.getClassLoader());
            if (r3.containsKey("token") == false) goto L11;
            String r32 = r3.getString("token");
            if (r32 == null) goto L9;
            return new b(r32);
        L9:
            throw new IllegalArgumentException("Argument \"token\" is marked as non-null but was passed a null value.");
        L11:
            throw new IllegalArgumentException("Required argument \"token\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f126794b = new a(null);
    }

    public b(String r2) {
        p.l(r2, "token");
        this.f126795a = r2;
    }

    public static final b fromBundle(Bundle r1) {
        return f126794b.a(r1);
    }

    public final String a() {
        return this.f126795a;
    }

    public final Bundle b() {
        Bundle r02 = new Bundle();
        r02.putString("token", this.f126795a);
        return r02;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof b) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f126795a, ((b) r4).f126795a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f126795a.hashCode();
    }

    public String toString() {
        return "CreateNewPinFragmentArgs(token=" + this.f126795a + ')';
    }
}

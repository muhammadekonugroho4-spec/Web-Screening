package com.stockbit.personalamend.ui.pin.change.v3.facematching;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class d implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f126823b = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f126824a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final d a(Bundle r3) {
            p.l(r3, "bundle");
            r3.setClassLoader(d.class.getClassLoader());
            if (r3.containsKey("refId") == false) goto L11;
            String r32 = r3.getString("refId");
            if (r32 == null) goto L9;
            return new d(r32);
        L9:
            throw new IllegalArgumentException("Argument \"refId\" is marked as non-null but was passed a null value.");
        L11:
            throw new IllegalArgumentException("Required argument \"refId\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f126823b = new a(null);
    }

    public d(String r2) {
        p.l(r2, "refId");
        this.f126824a = r2;
    }

    public static final d fromBundle(Bundle r1) {
        return f126823b.a(r1);
    }

    public final String a() {
        return this.f126824a;
    }

    public final Bundle b() {
        Bundle r02 = new Bundle();
        r02.putString("refId", this.f126824a);
        return r02;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof d) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f126824a, ((d) r4).f126824a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f126824a.hashCode();
    }

    public String toString() {
        return "ChangePinFaceMatchingFragmentArgs(refId=" + this.f126824a + ')';
    }
}

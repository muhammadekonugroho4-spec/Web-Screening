package com.stockbit.personalamend.ui.pin.change.v3.confirmnewpin;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class a implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final C1147a f126765b = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f126766a;

    /* renamed from: com.stockbit.personalamend.ui.pin.change.v3.confirmnewpin.a$a, reason: collision with other inner class name */
    public static final class C1147a {
        public /* synthetic */ C1147a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final a a(Bundle r3) {
            p.l(r3, "bundle");
            r3.setClassLoader(a.class.getClassLoader());
            if (r3.containsKey("token") == false) goto L11;
            String r32 = r3.getString("token");
            if (r32 == null) goto L9;
            return new a(r32);
        L9:
            throw new IllegalArgumentException("Argument \"token\" is marked as non-null but was passed a null value.");
        L11:
            throw new IllegalArgumentException("Required argument \"token\" is missing and does not have an android:defaultValue");
        }

        public C1147a() {
        }
    }

    static {
        f126765b = new C1147a(null);
    }

    public a(String r2) {
        p.l(r2, "token");
        this.f126766a = r2;
    }

    public static final a fromBundle(Bundle r1) {
        return f126765b.a(r1);
    }

    public final String a() {
        return this.f126766a;
    }

    public final Bundle b() {
        Bundle r02 = new Bundle();
        r02.putString("token", this.f126766a);
        return r02;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof a) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f126766a, ((a) r4).f126766a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f126766a.hashCode();
    }

    public String toString() {
        return "ConfirmNewPinFragmentArgs(token=" + this.f126766a + ')';
    }
}

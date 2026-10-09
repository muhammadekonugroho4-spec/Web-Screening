package com.stockbit.personalamend.ui.changepassword.newinput;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class a implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final C1119a f125794b = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f125795a;

    /* renamed from: com.stockbit.personalamend.ui.changepassword.newinput.a$a, reason: collision with other inner class name */
    public static final class C1119a {
        public /* synthetic */ C1119a(i r1) {
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

        public C1119a() {
        }
    }

    static {
        f125794b = new C1119a(null);
    }

    public a(String r2) {
        p.l(r2, "token");
        this.f125795a = r2;
    }

    public static final a fromBundle(Bundle r1) {
        return f125794b.a(r1);
    }

    public final String a() {
        return this.f125795a;
    }

    public final Bundle b() {
        Bundle r02 = new Bundle();
        r02.putString("token", this.f125795a);
        return r02;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof a) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f125795a, ((a) r4).f125795a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f125795a.hashCode();
    }

    public String toString() {
        return "ChangePasswordNewInputFragmentArgs(token=" + this.f125795a + ')';
    }
}

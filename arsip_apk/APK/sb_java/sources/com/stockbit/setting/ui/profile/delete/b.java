package com.stockbit.setting.ui.profile.delete;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class b implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f136635b = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f136636a;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final b a(Bundle r3) {
            p.l(r3, "bundle");
            r3.setClassLoader(b.class.getClassLoader());
            if (r3.containsKey("webiewUrl") == false) goto L11;
            String r32 = r3.getString("webiewUrl");
            if (r32 == null) goto L9;
            return new b(r32);
        L9:
            throw new IllegalArgumentException("Argument \"webiewUrl\" is marked as non-null but was passed a null value.");
        L11:
            throw new IllegalArgumentException("Required argument \"webiewUrl\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f136635b = new a(null);
    }

    public b(String r2) {
        p.l(r2, "webiewUrl");
        this.f136636a = r2;
    }

    public static final b fromBundle(Bundle r1) {
        return f136635b.a(r1);
    }

    public final String a() {
        return this.f136636a;
    }

    public final Bundle b() {
        Bundle r02 = new Bundle();
        r02.putString("webiewUrl", this.f136636a);
        return r02;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof b) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f136636a, ((b) r4).f136636a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f136636a.hashCode();
    }

    public String toString() {
        return "DeleteAccountFragmentArgs(webiewUrl=" + this.f136636a + ')';
    }
}

package com.stockbit.feature.cryptotransaction.ui.buy;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class f implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f95706b = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f95707a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final f a(Bundle r3) {
            p.l(r3, "bundle");
            r3.setClassLoader(f.class.getClassLoader());
            if (r3.containsKey("coinSymbol") == false) goto L11;
            String r32 = r3.getString("coinSymbol");
            if (r32 == null) goto L9;
            return new f(r32);
        L9:
            throw new IllegalArgumentException("Argument \"coinSymbol\" is marked as non-null but was passed a null value.");
        L11:
            throw new IllegalArgumentException("Required argument \"coinSymbol\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f95706b = new a(null);
    }

    public f(String r2) {
        p.l(r2, "coinSymbol");
        this.f95707a = r2;
    }

    public static final f fromBundle(Bundle r1) {
        return f95706b.a(r1);
    }

    public final String a() {
        return this.f95707a;
    }

    public final Bundle b() {
        Bundle r02 = new Bundle();
        r02.putString("coinSymbol", this.f95707a);
        return r02;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof f) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f95707a, ((f) r4).f95707a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f95707a.hashCode();
    }

    public String toString() {
        return "CryptoBuyFragmentArgs(coinSymbol=" + this.f95707a + ')';
    }
}

package com.stockbit.feature.cryptotransaction.ui.sell;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class e implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f96049b = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f96050a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final e a(Bundle r3) {
            p.l(r3, "bundle");
            r3.setClassLoader(e.class.getClassLoader());
            if (r3.containsKey("coinSymbol") == false) goto L11;
            String r32 = r3.getString("coinSymbol");
            if (r32 == null) goto L9;
            return new e(r32);
        L9:
            throw new IllegalArgumentException("Argument \"coinSymbol\" is marked as non-null but was passed a null value.");
        L11:
            throw new IllegalArgumentException("Required argument \"coinSymbol\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f96049b = new a(null);
    }

    public e(String r2) {
        p.l(r2, "coinSymbol");
        this.f96050a = r2;
    }

    public static final e fromBundle(Bundle r1) {
        return f96049b.a(r1);
    }

    public final String a() {
        return this.f96050a;
    }

    public final Bundle b() {
        Bundle r02 = new Bundle();
        r02.putString("coinSymbol", this.f96050a);
        return r02;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof e) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f96050a, ((e) r4).f96050a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f96050a.hashCode();
    }

    public String toString() {
        return "CryptoSellFragmentArgs(coinSymbol=" + this.f96050a + ')';
    }
}

package com.stockbit.feature.portfolio.presentation.warrant;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes9.dex */
public final class L implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f105941b = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f105942a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final L a(Bundle r3) {
            kotlin.jvm.internal.p.l(r3, "bundle");
            r3.setClassLoader(L.class.getClassLoader());
            if (r3.containsKey("extraSymbol") == false) goto L11;
            String r32 = r3.getString("extraSymbol");
            if (r32 == null) goto L9;
            return new L(r32);
        L9:
            throw new IllegalArgumentException("Argument \"extraSymbol\" is marked as non-null but was passed a null value.");
        L11:
            throw new IllegalArgumentException("Required argument \"extraSymbol\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f105941b = new a(null);
    }

    public L(String r2) {
        kotlin.jvm.internal.p.l(r2, "extraSymbol");
        this.f105942a = r2;
    }

    public static final L fromBundle(Bundle r1) {
        return f105941b.a(r1);
    }

    public final String a() {
        return this.f105942a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof L) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f105942a, ((L) r4).f105942a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f105942a.hashCode();
    }

    public String toString() {
        return "PortfolioWarrantDetailFragmentArgs(extraSymbol=" + this.f105942a + ')';
    }
}

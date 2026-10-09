package com.stockbit.feature.bonds.ui.catalog;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* renamed from: com.stockbit.feature.bonds.ui.catalog.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C7247b implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f92697b = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f92698a;

    /* renamed from: com.stockbit.feature.bonds.ui.catalog.b$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final C7247b a(Bundle r3) {
            kotlin.jvm.internal.p.l(r3, "bundle");
            r3.setClassLoader(C7247b.class.getClassLoader());
            if (r3.containsKey("sectorId") == false) goto L11;
            String r32 = r3.getString("sectorId");
            if (r32 == null) goto L9;
            return new C7247b(r32);
        L9:
            throw new IllegalArgumentException("Argument \"sectorId\" is marked as non-null but was passed a null value.");
        L11:
            throw new IllegalArgumentException("Required argument \"sectorId\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f92697b = new a(null);
    }

    public C7247b(String r2) {
        kotlin.jvm.internal.p.l(r2, "sectorId");
        this.f92698a = r2;
    }

    public static final C7247b fromBundle(Bundle r1) {
        return f92697b.a(r1);
    }

    public final String a() {
        return this.f92698a;
    }

    public final Bundle b() {
        Bundle r02 = new Bundle();
        r02.putString("sectorId", this.f92698a);
        return r02;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof C7247b) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f92698a, ((C7247b) r4).f92698a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f92698a.hashCode();
    }

    public String toString() {
        return "BondCatalogComposeFragmentArgs(sectorId=" + this.f92698a + ')';
    }
}

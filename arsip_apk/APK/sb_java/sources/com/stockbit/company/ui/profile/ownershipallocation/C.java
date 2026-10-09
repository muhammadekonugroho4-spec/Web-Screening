package com.stockbit.company.ui.profile.ownershipallocation;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes7.dex */
public final class C implements InterfaceC4094y {

    /* renamed from: c, reason: collision with root package name */
    public static final a f67842c = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f67843a;

    /* renamed from: b, reason: collision with root package name */
    public final String f67844b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final C a(Bundle r4) {
            kotlin.jvm.internal.p.l(r4, "bundle");
            r4.setClassLoader(C.class.getClassLoader());
            if (r4.containsKey("shareholderId") == false) goto L11;
            String r02 = r4.getString("shareholderId");
            if (r4.containsKey("symbolId") == false) goto L9;
            return new C(r02, r4.getString("symbolId"));
        L9:
            throw new IllegalArgumentException("Required argument \"symbolId\" is missing and does not have an android:defaultValue");
        L11:
            throw new IllegalArgumentException("Required argument \"shareholderId\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f67842c = new a(null);
    }

    public C(String r1, String r2) {
        this.f67843a = r1;
        this.f67844b = r2;
    }

    public static final C fromBundle(Bundle r1) {
        return f67842c.a(r1);
    }

    public final String a() {
        return this.f67843a;
    }

    public final String b() {
        return this.f67844b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C) == true) goto L8;
        return false;
    L8:
        C r52 = (C) r5;
        if (kotlin.jvm.internal.p.g(this.f67843a, r52.f67843a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f67844b, r52.f67844b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        String r02 = this.f67843a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f67844b;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "OwnerShipAllocationComposeFragmentArgs(shareholderId=" + this.f67843a + ", symbolId=" + this.f67844b + ')';
    }
}

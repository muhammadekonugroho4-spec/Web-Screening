package com.stockbit.personalamend.ui.phonenumber.change;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes10.dex */
public final class j implements InterfaceC4094y {

    /* renamed from: e, reason: collision with root package name */
    public static final a f126426e = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f126427a;

    /* renamed from: b, reason: collision with root package name */
    public final String f126428b;

    /* renamed from: c, reason: collision with root package name */
    public final String f126429c;
    public final boolean d;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final j a(Bundle r6) {
            kotlin.jvm.internal.p.l(r6, "bundle");
            r6.setClassLoader(j.class.getClassLoader());
            if (r6.containsKey("changeSource") == false) goto L23;
            String r02 = r6.getString("changeSource");
            if (r6.containsKey("currentPhoneNumber") == false) goto L21;
            String r1 = r6.getString("currentPhoneNumber");
            if (r6.containsKey("changeToken") == false) goto L19;
            String r2 = r6.getString("changeToken");
            if (r2 == null) goto L17;
            if (r6.containsKey("isWhatsapp") == false) goto L13;
            boolean r62 = r6.getBoolean("isWhatsapp");
        L15:
            return new j(r02, r1, r2, r62);
        L13:
            r62 = true;
            goto L15
        L17:
            throw new IllegalArgumentException("Argument \"changeToken\" is marked as non-null but was passed a null value.");
        L19:
            throw new IllegalArgumentException("Required argument \"changeToken\" is missing and does not have an android:defaultValue");
        L21:
            throw new IllegalArgumentException("Required argument \"currentPhoneNumber\" is missing and does not have an android:defaultValue");
        L23:
            throw new IllegalArgumentException("Required argument \"changeSource\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f126426e = new a(null);
    }

    public j(String r2, String r3, String r4, boolean r5) {
        kotlin.jvm.internal.p.l(r4, "changeToken");
        this.f126427a = r2;
        this.f126428b = r3;
        this.f126429c = r4;
        this.d = r5;
    }

    public static final j fromBundle(Bundle r1) {
        return f126426e.a(r1);
    }

    public final String a() {
        return this.f126427a;
    }

    public final String b() {
        return this.f126429c;
    }

    public final String c() {
        return this.f126428b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof j) == true) goto L8;
        return false;
    L8:
        j r52 = (j) r5;
        if (kotlin.jvm.internal.p.g(this.f126427a, r52.f126427a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f126428b, r52.f126428b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f126429c, r52.f126429c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        String r02 = this.f126427a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f126428b;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return ((((r04 + r1) * 31) + this.f126429c.hashCode()) * 31) + Boolean.hashCode(this.d);
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "ChangePhoneNumberFragmentArgs(changeSource=" + this.f126427a + ", currentPhoneNumber=" + this.f126428b + ", changeToken=" + this.f126429c + ", isWhatsapp=" + this.d + ')';
    }
}

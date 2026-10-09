package com.stockbit.personalamend.ui.phonenumber.v2.facematching;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class d implements InterfaceC4094y {
    public static final a d = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f126563a;

    /* renamed from: b, reason: collision with root package name */
    public final String f126564b;

    /* renamed from: c, reason: collision with root package name */
    public final String f126565c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final d a(Bundle r5) {
            p.l(r5, "bundle");
            r5.setClassLoader(d.class.getClassLoader());
            if (r5.containsKey("token") == false) goto L23;
            String r02 = r5.getString("token");
            if (r02 == null) goto L21;
            if (r5.containsKey("correlationId") == false) goto L19;
            String r1 = r5.getString("correlationId");
            if (r1 == null) goto L17;
            if (r5.containsKey("newPhoneNumber") == false) goto L13;
            String r52 = r5.getString("newPhoneNumber");
        L15:
            return new d(r02, r1, r52);
        L13:
            r52 = null;
            goto L15
        L17:
            throw new IllegalArgumentException("Argument \"correlationId\" is marked as non-null but was passed a null value.");
        L19:
            throw new IllegalArgumentException("Required argument \"correlationId\" is missing and does not have an android:defaultValue");
        L21:
            throw new IllegalArgumentException("Argument \"token\" is marked as non-null but was passed a null value.");
        L23:
            throw new IllegalArgumentException("Required argument \"token\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        d = new a(null);
    }

    public d(String r2, String r3, String r4) {
        p.l(r2, "token");
        p.l(r3, "correlationId");
        this.f126563a = r2;
        this.f126564b = r3;
        this.f126565c = r4;
    }

    public static final d fromBundle(Bundle r1) {
        return d.a(r1);
    }

    public final String a() {
        return this.f126565c;
    }

    public final String b() {
        return this.f126563a;
    }

    public final Bundle c() {
        Bundle r02 = new Bundle();
        r02.putString("token", this.f126563a);
        r02.putString("correlationId", this.f126564b);
        r02.putString("newPhoneNumber", this.f126565c);
        return r02;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f126563a, r52.f126563a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f126564b, r52.f126564b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f126565c, r52.f126565c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int r02 = ((this.f126563a.hashCode() * 31) + this.f126564b.hashCode()) * 31;
        String r1 = this.f126565c;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "ChangePhoneFaceMatchingFragmentArgs(token=" + this.f126563a + ", correlationId=" + this.f126564b + ", newPhoneNumber=" + this.f126565c + ')';
    }
}

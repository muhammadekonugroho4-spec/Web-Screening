package com.stockbit.personalamend.ui.phonenumber.v2.createnewphone;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes10.dex */
public final class j implements InterfaceC4094y {
    public static final a d = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f126512a;

    /* renamed from: b, reason: collision with root package name */
    public final String f126513b;

    /* renamed from: c, reason: collision with root package name */
    public final String f126514c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final j a(Bundle r5) {
            kotlin.jvm.internal.p.l(r5, "bundle");
            r5.setClassLoader(j.class.getClassLoader());
            if (r5.containsKey("token") == false) goto L27;
            String r02 = r5.getString("token");
            if (r02 == null) goto L25;
            if (r5.containsKey("currentPhoneNumber") == false) goto L23;
            String r1 = r5.getString("currentPhoneNumber");
            if (r1 == null) goto L21;
            if (r5.containsKey("newPhoneNumber") == false) goto L19;
            String r52 = r5.getString("newPhoneNumber");
            if (r52 == null) goto L17;
            return new j(r02, r1, r52);
        L17:
            throw new IllegalArgumentException("Argument \"newPhoneNumber\" is marked as non-null but was passed a null value.");
        L19:
            throw new IllegalArgumentException("Required argument \"newPhoneNumber\" is missing and does not have an android:defaultValue");
        L21:
            throw new IllegalArgumentException("Argument \"currentPhoneNumber\" is marked as non-null but was passed a null value.");
        L23:
            throw new IllegalArgumentException("Required argument \"currentPhoneNumber\" is missing and does not have an android:defaultValue");
        L25:
            throw new IllegalArgumentException("Argument \"token\" is marked as non-null but was passed a null value.");
        L27:
            throw new IllegalArgumentException("Required argument \"token\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        d = new a(null);
    }

    public j(String r2, String r3, String r4) {
        kotlin.jvm.internal.p.l(r2, "token");
        kotlin.jvm.internal.p.l(r3, "currentPhoneNumber");
        kotlin.jvm.internal.p.l(r4, "newPhoneNumber");
        this.f126512a = r2;
        this.f126513b = r3;
        this.f126514c = r4;
    }

    public static final j fromBundle(Bundle r1) {
        return d.a(r1);
    }

    public final String a() {
        return this.f126513b;
    }

    public final String b() {
        return this.f126514c;
    }

    public final String c() {
        return this.f126512a;
    }

    public final Bundle d() {
        Bundle r02 = new Bundle();
        r02.putString("token", this.f126512a);
        r02.putString("currentPhoneNumber", this.f126513b);
        r02.putString("newPhoneNumber", this.f126514c);
        return r02;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof j) == true) goto L8;
        return false;
    L8:
        j r52 = (j) r5;
        if (kotlin.jvm.internal.p.g(this.f126512a, r52.f126512a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f126513b, r52.f126513b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f126514c, r52.f126514c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f126512a.hashCode() * 31) + this.f126513b.hashCode()) * 31) + this.f126514c.hashCode();
    }

    public String toString() {
        return "CreateNewPhoneFragmentArgs(token=" + this.f126512a + ", currentPhoneNumber=" + this.f126513b + ", newPhoneNumber=" + this.f126514c + ')';
    }
}

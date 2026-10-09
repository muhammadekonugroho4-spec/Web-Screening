package com.stockbit.personalamend.ui.phonenumber.v2.verifyidentity;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class b implements InterfaceC4094y {

    /* renamed from: c, reason: collision with root package name */
    public static final a f126647c = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f126648a;

    /* renamed from: b, reason: collision with root package name */
    public final String f126649b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final b a(Bundle r4) {
            p.l(r4, "bundle");
            r4.setClassLoader(b.class.getClassLoader());
            if (r4.containsKey("token") == false) goto L15;
            String r02 = r4.getString("token");
            if (r02 == null) goto L13;
            if (r4.containsKey("newPhoneNumber") == false) goto L9;
            String r42 = r4.getString("newPhoneNumber");
        L11:
            return new b(r02, r42);
        L9:
            r42 = null;
            goto L11
        L13:
            throw new IllegalArgumentException("Argument \"token\" is marked as non-null but was passed a null value.");
        L15:
            throw new IllegalArgumentException("Required argument \"token\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f126647c = new a(null);
    }

    public b(String r2, String r3) {
        p.l(r2, "token");
        this.f126648a = r2;
        this.f126649b = r3;
    }

    public static final b fromBundle(Bundle r1) {
        return f126647c.a(r1);
    }

    public final String a() {
        return this.f126649b;
    }

    public final String b() {
        return this.f126648a;
    }

    public final Bundle c() {
        Bundle r02 = new Bundle();
        r02.putString("token", this.f126648a);
        r02.putString("newPhoneNumber", this.f126649b);
        return r02;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f126648a, r52.f126648a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f126649b, r52.f126649b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int r02 = this.f126648a.hashCode() * 31;
        String r1 = this.f126649b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "ChangePhoneVerifyIdentityFragmentArgs(token=" + this.f126648a + ", newPhoneNumber=" + this.f126649b + ')';
    }
}

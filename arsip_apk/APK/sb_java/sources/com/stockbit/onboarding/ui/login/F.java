package com.stockbit.onboarding.ui.login;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes10.dex */
public final class F implements InterfaceC4094y {
    public static final a d = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f123642a;

    /* renamed from: b, reason: collision with root package name */
    public final String f123643b;

    /* renamed from: c, reason: collision with root package name */
    public final String f123644c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final F a(Bundle r6) {
            kotlin.jvm.internal.p.l(r6, "bundle");
            r6.setClassLoader(F.class.getClassLoader());
            String r2 = null;
            if (r6.containsKey("loginInfoMsg") == false) goto L5;
            String r02 = r6.getString("loginInfoMsg");
        L7:
            if (r6.containsKey("loginSuccessInfoMsg") == false) goto L9;
            String r1 = r6.getString("loginSuccessInfoMsg");
        L11:
            if (r6.containsKey("userRegisteredEmail") == false) goto L14;
            r2 = r6.getString("userRegisteredEmail");
        L14:
            return new F(r02, r1, r2);
        L9:
            r1 = null;
            goto L11
        L5:
            r02 = null;
            goto L7
        }

        public a() {
        }
    }

    static {
        d = new a(null);
    }

    public F(String r1, String r2, String r3) {
        this.f123642a = r1;
        this.f123643b = r2;
        this.f123644c = r3;
    }

    public static final F fromBundle(Bundle r1) {
        return d.a(r1);
    }

    public final String a() {
        return this.f123642a;
    }

    public final String b() {
        return this.f123643b;
    }

    public final String c() {
        return this.f123644c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof F) == true) goto L8;
        return false;
    L8:
        F r52 = (F) r5;
        if (kotlin.jvm.internal.p.g(this.f123642a, r52.f123642a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f123643b, r52.f123643b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f123644c, r52.f123644c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        String r02 = this.f123642a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f123643b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f123644c;
        if (r23 == null) goto L15;
        r1 = r23.hashCode();
    L15:
        return r05 + r1;
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "LoginFragmentArgs(loginInfoMsg=" + this.f123642a + ", loginSuccessInfoMsg=" + this.f123643b + ", userRegisteredEmail=" + this.f123644c + ')';
    }
}

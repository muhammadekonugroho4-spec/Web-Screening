package com.stockbit.personalamend.ui.changedata.otp.email;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class f implements InterfaceC4094y {

    /* renamed from: f, reason: collision with root package name */
    public static final a f125420f = null;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f125421a;

    /* renamed from: b, reason: collision with root package name */
    public final String f125422b;

    /* renamed from: c, reason: collision with root package name */
    public final String f125423c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f125424e;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final f a(Bundle r9) {
            p.l(r9, "bundle");
            r9.setClassLoader(f.class.getClassLoader());
            if (r9.containsKey("isChangeEmail") == false) goto L31;
            boolean r3 = r9.getBoolean("isChangeEmail");
            if (r9.containsKey("changeSource") == false) goto L29;
            String r4 = r9.getString("changeSource");
            if (r9.containsKey("currentPhoneNumber") == false) goto L27;
            String r5 = r9.getString("currentPhoneNumber");
            if (r9.containsKey("changeToken") == false) goto L25;
            String r6 = r9.getString("changeToken");
            if (r6 == null) goto L23;
            if (r9.containsKey("email") == false) goto L19;
            String r92 = r9.getString("email");
            if (r92 == null) goto L18;
        L21:
            return new f(r3, r4, r5, r6, r92);
        L18:
            throw new IllegalArgumentException("Argument \"email\" is marked as non-null but was passed a null value.");
        L19:
            r92 = "";
            goto L21
        L23:
            throw new IllegalArgumentException("Argument \"changeToken\" is marked as non-null but was passed a null value.");
        L25:
            throw new IllegalArgumentException("Required argument \"changeToken\" is missing and does not have an android:defaultValue");
        L27:
            throw new IllegalArgumentException("Required argument \"currentPhoneNumber\" is missing and does not have an android:defaultValue");
        L29:
            throw new IllegalArgumentException("Required argument \"changeSource\" is missing and does not have an android:defaultValue");
        L31:
            throw new IllegalArgumentException("Required argument \"isChangeEmail\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f125420f = new a(null);
    }

    public f(boolean r2, String r3, String r4, String r5, String r6) {
        p.l(r5, "changeToken");
        p.l(r6, "email");
        this.f125421a = r2;
        this.f125422b = r3;
        this.f125423c = r4;
        this.d = r5;
        this.f125424e = r6;
    }

    public static final f fromBundle(Bundle r1) {
        return f125420f.a(r1);
    }

    public final String a() {
        return this.f125422b;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f125423c;
    }

    public final String d() {
        return this.f125424e;
    }

    public final boolean e() {
        return this.f125421a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (this.f125421a == r52.f125421a) goto L12;
        return false;
    L12:
        if (p.g(this.f125422b, r52.f125422b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f125423c, r52.f125423c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f125424e, r52.f125424e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        int r02 = Boolean.hashCode(this.f125421a) * 31;
        String r1 = this.f125422b;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.f125423c;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return ((((r03 + r2) * 31) + this.d.hashCode()) * 31) + this.f125424e.hashCode();
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "ChangeDataInputEmailOtpFragmentArgs(isChangeEmail=" + this.f125421a + ", changeSource=" + this.f125422b + ", currentPhoneNumber=" + this.f125423c + ", changeToken=" + this.d + ", email=" + this.f125424e + ')';
    }
}

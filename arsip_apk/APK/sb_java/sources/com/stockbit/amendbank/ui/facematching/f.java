package com.stockbit.amendbank.ui.facematching;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes6.dex */
public final class f implements InterfaceC4094y {

    /* renamed from: f, reason: collision with root package name */
    public static final a f46349f = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f46350a;

    /* renamed from: b, reason: collision with root package name */
    public final String f46351b;

    /* renamed from: c, reason: collision with root package name */
    public final String f46352c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f46353e;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final f a(Bundle r9) {
            kotlin.jvm.internal.p.l(r9, "bundle");
            r9.setClassLoader(f.class.getClassLoader());
            if (r9.containsKey("identityImageUrl") == false) goto L43;
            String r3 = r9.getString("identityImageUrl");
            if (r3 == null) goto L41;
            if (r9.containsKey("token") == false) goto L39;
            String r4 = r9.getString("token");
            if (r4 == null) goto L37;
            if (r9.containsKey("accountName") == false) goto L35;
            String r5 = r9.getString("accountName");
            if (r5 == null) goto L33;
            if (r9.containsKey("accountNumber") == false) goto L31;
            String r6 = r9.getString("accountNumber");
            if (r6 == null) goto L29;
            if (r9.containsKey("bankId") == false) goto L27;
            String r7 = r9.getString("bankId");
            if (r7 == null) goto L25;
            return new f(r3, r4, r5, r6, r7);
        L25:
            throw new IllegalArgumentException("Argument \"bankId\" is marked as non-null but was passed a null value.");
        L27:
            throw new IllegalArgumentException("Required argument \"bankId\" is missing and does not have an android:defaultValue");
        L29:
            throw new IllegalArgumentException("Argument \"accountNumber\" is marked as non-null but was passed a null value.");
        L31:
            throw new IllegalArgumentException("Required argument \"accountNumber\" is missing and does not have an android:defaultValue");
        L33:
            throw new IllegalArgumentException("Argument \"accountName\" is marked as non-null but was passed a null value.");
        L35:
            throw new IllegalArgumentException("Required argument \"accountName\" is missing and does not have an android:defaultValue");
        L37:
            throw new IllegalArgumentException("Argument \"token\" is marked as non-null but was passed a null value.");
        L39:
            throw new IllegalArgumentException("Required argument \"token\" is missing and does not have an android:defaultValue");
        L41:
            throw new IllegalArgumentException("Argument \"identityImageUrl\" is marked as non-null but was passed a null value.");
        L43:
            throw new IllegalArgumentException("Required argument \"identityImageUrl\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f46349f = new a(null);
    }

    public f(String r2, String r3, String r4, String r5, String r6) {
        kotlin.jvm.internal.p.l(r2, "identityImageUrl");
        kotlin.jvm.internal.p.l(r3, "token");
        kotlin.jvm.internal.p.l(r4, "accountName");
        kotlin.jvm.internal.p.l(r5, "accountNumber");
        kotlin.jvm.internal.p.l(r6, "bankId");
        this.f46350a = r2;
        this.f46351b = r3;
        this.f46352c = r4;
        this.d = r5;
        this.f46353e = r6;
    }

    public static final f fromBundle(Bundle r1) {
        return f46349f.a(r1);
    }

    public final String a() {
        return this.f46352c;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f46353e;
    }

    public final String d() {
        return this.f46350a;
    }

    public final String e() {
        return this.f46351b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (kotlin.jvm.internal.p.g(this.f46350a, r52.f46350a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f46351b, r52.f46351b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f46352c, r52.f46352c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f46353e, r52.f46353e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f46350a.hashCode() * 31) + this.f46351b.hashCode()) * 31) + this.f46352c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f46353e.hashCode();
    }

    public String toString() {
        return "AmendBankFaceMatchingFragmentArgs(identityImageUrl=" + this.f46350a + ", token=" + this.f46351b + ", accountName=" + this.f46352c + ", accountNumber=" + this.d + ", bankId=" + this.f46353e + ')';
    }
}

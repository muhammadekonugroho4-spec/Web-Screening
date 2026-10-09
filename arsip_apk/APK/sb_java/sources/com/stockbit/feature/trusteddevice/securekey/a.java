package com.stockbit.feature.trusteddevice.securekey;

import android.content.Context;
import com.stockbit.authenticator.contract.c;
import com.stockbit.authenticator.contract.e;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final c f117923a;

    /* renamed from: b, reason: collision with root package name */
    public final e f117924b;

    /* renamed from: com.stockbit.feature.trusteddevice.securekey.a$a, reason: collision with other inner class name */
    public static final class C1017a {

        /* renamed from: a, reason: collision with root package name */
        public final String f117925a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f117926b;

        static {
        }

        public C1017a(String r2, boolean r3) {
            p.l(r2, "publicKey");
            this.f117925a = r2;
            this.f117926b = r3;
        }

        public final String a() {
            return this.f117925a;
        }

        public final boolean b() {
            return this.f117926b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C1017a) == true) goto L8;
            return false;
        L8:
            C1017a r52 = (C1017a) r5;
            if (p.g(this.f117925a, r52.f117925a) == true) goto L12;
            return false;
        L12:
            if (this.f117926b == r52.f117926b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f117925a.hashCode() * 31) + Boolean.hashCode(this.f117926b);
        }

        public String toString() {
            return "ProvisionedKey(publicKey=" + this.f117925a + ", isSecureKey=" + this.f117926b + ')';
        }
    }

    static {
    }

    public a(c r2, e r3) {
        p.l(r2, "biometricAuthenticatorViewHelper");
        p.l(r3, "trustedDeviceSecureKeyStore");
        this.f117923a = r2;
        this.f117924b = r3;
    }

    public final C1017a a() {
        com.stockbit.common.utils.security.a r02 = com.stockbit.common.utils.security.a.f62399a;
        r02.a();
        String r03 = r02.c();
        if (r03 != null) goto L6;
        r03 = "";
    L6:
        return new C1017a(r03, false);
    }

    public final C1017a b(Context r3) {
        p.l(r3, "context");
        if (this.f117923a.b(r3) == false) goto L5;
        String r32 = this.f117924b.c();
        if (r32 != null) goto L9;
        this.f117924b.b();
        return a();
    L9:
        return new C1017a(r32, true);
    L5:
        return a();
    }
}

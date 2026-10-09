package com.stockbit.amendbank.ui.uploadidentity;

import android.os.Bundle;
import androidx.navigation.InterfaceC4081o0;

/* loaded from: classes6.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final b f46478a = null;

    public static final class a implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f46479a;

        /* renamed from: b, reason: collision with root package name */
        public final String f46480b;

        /* renamed from: c, reason: collision with root package name */
        public final String f46481c;
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final String f46482e;

        /* renamed from: f, reason: collision with root package name */
        public final int f46483f;

        public a(String r2, String r3, String r4, String r5, String r6) {
            kotlin.jvm.internal.p.l(r2, "identityImageUrl");
            kotlin.jvm.internal.p.l(r3, "token");
            kotlin.jvm.internal.p.l(r4, "accountName");
            kotlin.jvm.internal.p.l(r5, "accountNumber");
            kotlin.jvm.internal.p.l(r6, "bankId");
            this.f46479a = r2;
            this.f46480b = r3;
            this.f46481c = r4;
            this.d = r5;
            this.f46482e = r6;
            this.f46483f = com.stockbit.amendbank.c.f45877e;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putString("identityImageUrl", this.f46479a);
            r02.putString("token", this.f46480b);
            r02.putString("accountName", this.f46481c);
            r02.putString("accountNumber", this.d);
            r02.putString("bankId", this.f46482e);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f46483f;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (kotlin.jvm.internal.p.g(this.f46479a, r52.f46479a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f46480b, r52.f46480b) == true) goto L15;
            return false;
        L15:
            if (kotlin.jvm.internal.p.g(this.f46481c, r52.f46481c) == true) goto L18;
            return false;
        L18:
            if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
            return false;
        L21:
            if (kotlin.jvm.internal.p.g(this.f46482e, r52.f46482e) == true) goto L23;
            return false;
        L23:
            return true;
        }

        public int hashCode() {
            return (((((((this.f46479a.hashCode() * 31) + this.f46480b.hashCode()) * 31) + this.f46481c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f46482e.hashCode();
        }

        public String toString() {
            return "ActionAmendBankUploadIdentityFragmentToAmendBankFaceMatchingFragment(identityImageUrl=" + this.f46479a + ", token=" + this.f46480b + ", accountName=" + this.f46481c + ", accountNumber=" + this.d + ", bankId=" + this.f46482e + ')';
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.i r1) {
            this();
        }

        public final InterfaceC4081o0 a(String r8, String r9, String r10, String r11, String r12) {
            kotlin.jvm.internal.p.l(r8, "identityImageUrl");
            kotlin.jvm.internal.p.l(r9, "token");
            kotlin.jvm.internal.p.l(r10, "accountName");
            kotlin.jvm.internal.p.l(r11, "accountNumber");
            kotlin.jvm.internal.p.l(r12, "bankId");
            return new a(r8, r9, r10, r11, r12);
        }

        public b() {
        }
    }

    static {
        f46478a = new b(null);
    }
}

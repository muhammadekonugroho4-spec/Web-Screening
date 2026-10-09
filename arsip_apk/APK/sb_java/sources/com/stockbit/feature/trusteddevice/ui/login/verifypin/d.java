package com.stockbit.feature.trusteddevice.ui.login.verifypin;

import android.os.Bundle;
import androidx.navigation.InterfaceC4081o0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final b f118508a = null;

    public static final class a implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f118509a;

        /* renamed from: b, reason: collision with root package name */
        public final String f118510b;

        /* renamed from: c, reason: collision with root package name */
        public final String f118511c;
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final int f118512e;

        public a(String r2, String r3, String r4, String r5) {
            p.l(r2, "token");
            p.l(r3, "email");
            this.f118509a = r2;
            this.f118510b = r3;
            this.f118511c = r4;
            this.d = r5;
            this.f118512e = com.stockbit.feature.trusteddevice.c.f117764i;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putString("token", this.f118509a);
            r02.putString("email", this.f118510b);
            r02.putString("phone", this.f118511c);
            r02.putString("whatsapp", this.d);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f118512e;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (p.g(this.f118509a, r52.f118509a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f118510b, r52.f118510b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f118511c, r52.f118511c) == true) goto L18;
            return false;
        L18:
            if (p.g(this.d, r52.d) == true) goto L20;
            return false;
        L20:
            return true;
        }

        public int hashCode() {
            int r02 = ((this.f118509a.hashCode() * 31) + this.f118510b.hashCode()) * 31;
            String r1 = this.f118511c;
            int r2 = 0;
            if (r1 != null) goto L5;
            int r12 = 0;
        L6:
            int r03 = (r02 + r12) * 31;
            String r13 = this.d;
            if (r13 == null) goto L11;
            r2 = r13.hashCode();
        L11:
            return r03 + r2;
        L5:
            r12 = r1.hashCode();
            goto L6
        }

        public String toString() {
            return "ActionLoginVerifyPinFragmentToLoginVerifyOTPFragment(token=" + this.f118509a + ", email=" + this.f118510b + ", phone=" + this.f118511c + ", whatsapp=" + this.d + ')';
        }
    }

    public static final class b {
        public /* synthetic */ b(i r1) {
            this();
        }

        public final InterfaceC4081o0 a(String r2, String r3, String r4, String r5) {
            p.l(r2, "token");
            p.l(r3, "email");
            return new a(r2, r3, r4, r5);
        }

        public b() {
        }
    }

    static {
        f118508a = new b(null);
    }
}

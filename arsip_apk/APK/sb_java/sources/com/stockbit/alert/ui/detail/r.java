package com.stockbit.alert.ui.detail;

import android.os.Bundle;
import androidx.navigation.InterfaceC4081o0;

/* loaded from: classes6.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final b f45380a = null;

    public static final class a implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final int f45381a;

        /* renamed from: b, reason: collision with root package name */
        public final String f45382b;

        /* renamed from: c, reason: collision with root package name */
        public final String f45383c;
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f45384e;

        /* renamed from: f, reason: collision with root package name */
        public final int f45385f;

        public a(int r1, String r2, String r3, String r4, boolean r5) {
            this.f45381a = r1;
            this.f45382b = r2;
            this.f45383c = r3;
            this.d = r4;
            this.f45384e = r5;
            this.f45385f = com.stockbit.alert.f.f44650b;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putString("subscriptionDesc", this.f45382b);
            r02.putString("subscriptionValue", this.f45383c);
            r02.putInt("product_id", this.f45381a);
            r02.putString("company_id", this.d);
            r02.putBoolean("is_new_user", this.f45384e);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f45385f;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (this.f45381a == r52.f45381a) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f45382b, r52.f45382b) == true) goto L15;
            return false;
        L15:
            if (kotlin.jvm.internal.p.g(this.f45383c, r52.f45383c) == true) goto L18;
            return false;
        L18:
            if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
            return false;
        L21:
            if (this.f45384e == r52.f45384e) goto L23;
            return false;
        L23:
            return true;
        }

        public int hashCode() {
            int r02 = Integer.hashCode(this.f45381a) * 31;
            String r1 = this.f45382b;
            int r2 = 0;
            if (r1 != null) goto L5;
            int r12 = 0;
        L6:
            int r03 = (r02 + r12) * 31;
            String r13 = this.f45383c;
            if (r13 != null) goto L9;
            int r14 = 0;
        L10:
            int r04 = (r03 + r14) * 31;
            String r15 = this.d;
            if (r15 == null) goto L15;
            r2 = r15.hashCode();
        L15:
            return ((r04 + r2) * 31) + Boolean.hashCode(this.f45384e);
        L9:
            r14 = r13.hashCode();
            goto L10
        L5:
            r12 = r1.hashCode();
            goto L6
        }

        public String toString() {
            return "ActionAlertDetailFragmentToPaywallPriceAlertDialogFragment(productId=" + this.f45381a + ", subscriptionDesc=" + this.f45382b + ", subscriptionValue=" + this.f45383c + ", companyId=" + this.d + ", isNewUser=" + this.f45384e + ')';
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.i r1) {
            this();
        }

        public final InterfaceC4081o0 a(int r7, String r8, String r9, String r10, boolean r11) {
            return new a(r7, r8, r9, r10, r11);
        }

        public b() {
        }
    }

    static {
        f45380a = new b(null);
    }
}

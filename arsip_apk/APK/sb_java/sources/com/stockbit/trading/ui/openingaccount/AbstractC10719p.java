package com.stockbit.trading.ui.openingaccount;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4081o0;
import com.stockbit.domain.model.valueobject.securities.JagoBindingType;
import java.io.Serializable;

/* renamed from: com.stockbit.trading.ui.openingaccount.p, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC10719p {

    /* renamed from: a, reason: collision with root package name */
    public static final a f148187a = null;

    /* renamed from: com.stockbit.trading.ui.openingaccount.p$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public static /* synthetic */ InterfaceC4081o0 e(a r1, String r2, String r3, int r4, Object r5) {
            if ((r4 & 1) == 0) goto L6;
            r2 = null;
        L6:
            if ((r4 & 2) == 0) goto L9;
            r3 = null;
        L9:
            return r1.d(r2, r3);
        }

        public final InterfaceC4081o0 a(boolean r2) {
            return new b(r2);
        }

        public final InterfaceC4081o0 b(boolean r2, String r3, JagoBindingType r4, boolean r5) {
            kotlin.jvm.internal.p.l(r4, "bindingType");
            return new c(r2, r3, r4, r5);
        }

        public final InterfaceC4081o0 c(String r2, boolean r3) {
            return new d(r2, r3);
        }

        public final InterfaceC4081o0 d(String r2, String r3) {
            return new e(r2, r3);
        }

        public a() {
        }
    }

    /* renamed from: com.stockbit.trading.ui.openingaccount.p$b */
    public static final class b implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f148188a;

        /* renamed from: b, reason: collision with root package name */
        public final int f148189b;

        public b(boolean r1) {
            this.f148188a = r1;
            this.f148189b = com.stockbit.trading.h.P1;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putBoolean("isSharia", this.f148188a);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f148189b;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (this.f148188a == ((b) r4).f148188a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f148188a);
        }

        public String toString() {
            return "OpenJagoActivation(isSharia=" + this.f148188a + ')';
        }
    }

    /* renamed from: com.stockbit.trading.ui.openingaccount.p$c */
    public static final class c implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f148190a;

        /* renamed from: b, reason: collision with root package name */
        public final String f148191b;

        /* renamed from: c, reason: collision with root package name */
        public final JagoBindingType f148192c;
        public final boolean d;

        /* renamed from: e, reason: collision with root package name */
        public final int f148193e;

        public c(boolean r2, String r3, JagoBindingType r4, boolean r5) {
            kotlin.jvm.internal.p.l(r4, "bindingType");
            this.f148190a = r2;
            this.f148191b = r3;
            this.f148192c = r4;
            this.d = r5;
            this.f148193e = com.stockbit.trading.h.Q1;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putBoolean("isAlreadyBind", this.f148190a);
            r02.putString("url", this.f148191b);
            r02.putBoolean("isSharia", this.d);
            if (Parcelable.class.isAssignableFrom(JagoBindingType.class) == false) goto L7;
            Object r1 = this.f148192c;
            kotlin.jvm.internal.p.j(r1, "null cannot be cast to non-null type android.os.Parcelable");
            r02.putParcelable("bindingType", (Parcelable) r1);
            return r02;
        L7:
            if (Serializable.class.isAssignableFrom(JagoBindingType.class) == false) goto L11;
            JagoBindingType r12 = this.f148192c;
            kotlin.jvm.internal.p.j(r12, "null cannot be cast to non-null type java.io.Serializable");
            r02.putSerializable("bindingType", r12);
            return r02;
        L11:
            throw new UnsupportedOperationException(JagoBindingType.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f148193e;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (this.f148190a == r52.f148190a) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f148191b, r52.f148191b) == true) goto L15;
            return false;
        L15:
            if (this.f148192c == r52.f148192c) goto L18;
            return false;
        L18:
            if (this.d == r52.d) goto L20;
            return false;
        L20:
            return true;
        }

        public int hashCode() {
            int r02 = Boolean.hashCode(this.f148190a) * 31;
            String r1 = this.f148191b;
            if (r1 != null) goto L5;
            int r12 = 0;
        L7:
            return ((((r02 + r12) * 31) + this.f148192c.hashCode()) * 31) + Boolean.hashCode(this.d);
        L5:
            r12 = r1.hashCode();
            goto L7
        }

        public String toString() {
            return "OpenJagoBinding(isAlreadyBind=" + this.f148190a + ", url=" + this.f148191b + ", bindingType=" + this.f148192c + ", isSharia=" + this.d + ')';
        }
    }

    /* renamed from: com.stockbit.trading.ui.openingaccount.p$d */
    public static final class d implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f148194a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f148195b;

        /* renamed from: c, reason: collision with root package name */
        public final int f148196c;

        public d(String r1, boolean r2) {
            this.f148194a = r1;
            this.f148195b = r2;
            this.f148196c = com.stockbit.trading.h.R1;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putString("referralCode", this.f148194a);
            r02.putBoolean("isFromSocialRegister", this.f148195b);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f148196c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof d) == true) goto L8;
            return false;
        L8:
            d r52 = (d) r5;
            if (kotlin.jvm.internal.p.g(this.f148194a, r52.f148194a) == true) goto L12;
            return false;
        L12:
            if (this.f148195b == r52.f148195b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            String r02 = this.f148194a;
            if (r02 != null) goto L5;
            int r03 = 0;
        L7:
            return (r03 * 31) + Boolean.hashCode(this.f148195b);
        L5:
            r03 = r02.hashCode();
            goto L7
        }

        public String toString() {
            return "OpenReferral(referralCode=" + this.f148194a + ", isFromSocialRegister=" + this.f148195b + ')';
        }
    }

    /* renamed from: com.stockbit.trading.ui.openingaccount.p$e */
    public static final class e implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f148197a;

        /* renamed from: b, reason: collision with root package name */
        public final String f148198b;

        /* renamed from: c, reason: collision with root package name */
        public final int f148199c;

        public e(String r1, String r2) {
            this.f148197a = r1;
            this.f148198b = r2;
            this.f148199c = com.stockbit.trading.h.S1;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putString("EXTRA_LAUNCH_LIVE_SUPPORT", this.f148197a);
            r02.putString("EXTRA_LAUNCH_LIVE_SUPPORT_MESSAGE", this.f148198b);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f148199c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof e) == true) goto L8;
            return false;
        L8:
            e r52 = (e) r5;
            if (kotlin.jvm.internal.p.g(this.f148197a, r52.f148197a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f148198b, r52.f148198b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            String r02 = this.f148197a;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            String r2 = this.f148198b;
            if (r2 == null) goto L11;
            r1 = r2.hashCode();
        L11:
            return r04 + r1;
        L5:
            r03 = r02.hashCode();
            goto L6
        }

        public String toString() {
            return "OpenSupport(EXTRALAUNCHLIVESUPPORT=" + this.f148197a + ", EXTRALAUNCHLIVESUPPORTMESSAGE=" + this.f148198b + ')';
        }
    }

    static {
        f148187a = new a(null);
    }
}

package com.stockbit.brokeractivity.ui.topbroker;

import android.os.Bundle;
import androidx.navigation.InterfaceC4081o0;

/* loaded from: classes7.dex */
public abstract class E {

    /* renamed from: a, reason: collision with root package name */
    public static final b f49106a = null;

    public static final class a implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f49107a;

        /* renamed from: b, reason: collision with root package name */
        public final String f49108b;

        /* renamed from: c, reason: collision with root package name */
        public final String f49109c;
        public final boolean d;

        /* renamed from: e, reason: collision with root package name */
        public final String f49110e;

        /* renamed from: f, reason: collision with root package name */
        public final String f49111f;

        /* renamed from: g, reason: collision with root package name */
        public final String f49112g;

        /* renamed from: h, reason: collision with root package name */
        public final String f49113h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f49114i;

        /* renamed from: j, reason: collision with root package name */
        public final String f49115j;

        /* renamed from: k, reason: collision with root package name */
        public final int f49116k;

        public a(String r2, String r3, String r4, boolean r5, String r6, String r7, String r8, String r9, boolean r10, String r11) {
            kotlin.jvm.internal.p.l(r2, "brokerCode");
            this.f49107a = r2;
            this.f49108b = r3;
            this.f49109c = r4;
            this.d = r5;
            this.f49110e = r6;
            this.f49111f = r7;
            this.f49112g = r8;
            this.f49113h = r9;
            this.f49114i = r10;
            this.f49115j = r11;
            this.f49116k = com.stockbit.brokeractivity.f.f48222a;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putString("brokerCode", this.f49107a);
            r02.putString("brokerTitle", this.f49108b);
            r02.putString("brokerType", this.f49109c);
            r02.putBoolean("isFromDeeplink", this.d);
            r02.putString("startDate", this.f49110e);
            r02.putString("endDate", this.f49111f);
            r02.putString("marketType", this.f49112g);
            r02.putString("investorType", this.f49113h);
            r02.putBoolean("isDateChangedFromDatePicker", this.f49114i);
            r02.putString("periodType", this.f49115j);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f49116k;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (kotlin.jvm.internal.p.g(this.f49107a, r52.f49107a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f49108b, r52.f49108b) == true) goto L15;
            return false;
        L15:
            if (kotlin.jvm.internal.p.g(this.f49109c, r52.f49109c) == true) goto L18;
            return false;
        L18:
            if (this.d == r52.d) goto L21;
            return false;
        L21:
            if (kotlin.jvm.internal.p.g(this.f49110e, r52.f49110e) == true) goto L24;
            return false;
        L24:
            if (kotlin.jvm.internal.p.g(this.f49111f, r52.f49111f) == true) goto L27;
            return false;
        L27:
            if (kotlin.jvm.internal.p.g(this.f49112g, r52.f49112g) == true) goto L30;
            return false;
        L30:
            if (kotlin.jvm.internal.p.g(this.f49113h, r52.f49113h) == true) goto L33;
            return false;
        L33:
            if (this.f49114i == r52.f49114i) goto L36;
            return false;
        L36:
            if (kotlin.jvm.internal.p.g(this.f49115j, r52.f49115j) == true) goto L38;
            return false;
        L38:
            return true;
        }

        public int hashCode() {
            int r02 = this.f49107a.hashCode() * 31;
            String r1 = this.f49108b;
            int r2 = 0;
            if (r1 != null) goto L5;
            int r12 = 0;
        L6:
            int r03 = (r02 + r12) * 31;
            String r13 = this.f49109c;
            if (r13 != null) goto L9;
            int r14 = 0;
        L10:
            int r04 = (((r03 + r14) * 31) + Boolean.hashCode(this.d)) * 31;
            String r15 = this.f49110e;
            if (r15 != null) goto L13;
            int r16 = 0;
        L14:
            int r05 = (r04 + r16) * 31;
            String r17 = this.f49111f;
            if (r17 != null) goto L17;
            int r18 = 0;
        L18:
            int r06 = (r05 + r18) * 31;
            String r19 = this.f49112g;
            if (r19 != null) goto L21;
            int r110 = 0;
        L22:
            int r07 = (r06 + r110) * 31;
            String r111 = this.f49113h;
            if (r111 != null) goto L25;
            int r112 = 0;
        L26:
            int r08 = (((r07 + r112) * 31) + Boolean.hashCode(this.f49114i)) * 31;
            String r113 = this.f49115j;
            if (r113 == null) goto L31;
            r2 = r113.hashCode();
        L31:
            return r08 + r2;
        L25:
            r112 = r111.hashCode();
            goto L26
        L21:
            r110 = r19.hashCode();
            goto L22
        L17:
            r18 = r17.hashCode();
            goto L18
        L13:
            r16 = r15.hashCode();
            goto L14
        L9:
            r14 = r13.hashCode();
            goto L10
        L5:
            r12 = r1.hashCode();
            goto L6
        }

        public String toString() {
            return "ActionFragmentTopBrokerActivityToBrokerActivityListComposeFragment(brokerCode=" + this.f49107a + ", brokerTitle=" + this.f49108b + ", brokerType=" + this.f49109c + ", isFromDeeplink=" + this.d + ", startDate=" + this.f49110e + ", endDate=" + this.f49111f + ", marketType=" + this.f49112g + ", investorType=" + this.f49113h + ", isDateChangedFromDatePicker=" + this.f49114i + ", periodType=" + this.f49115j + ')';
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.i r1) {
            this();
        }

        public static /* synthetic */ InterfaceC4081o0 b(b r2, String r3, String r4, String r5, boolean r6, String r7, String r8, String r9, String r10, boolean r11, String r12, int r13, Object r14) {
            if ((r13 & 1) == 0) goto L6;
            r3 = "";
        L6:
            if ((r13 & 2) == 0) goto L9;
            r4 = null;
        L9:
            if ((r13 & 4) == 0) goto L12;
            r5 = null;
        L12:
            if ((r13 & 8) == 0) goto L15;
            r6 = false;
        L15:
            if ((r13 & 16) == 0) goto L18;
            r7 = null;
        L18:
            if ((r13 & 32) == 0) goto L21;
            r8 = null;
        L21:
            if ((r13 & 64) == 0) goto L24;
            r9 = null;
        L24:
            if ((r13 & 128) == 0) goto L27;
            r10 = null;
        L27:
            if ((r13 & 256) == 0) goto L30;
            r11 = false;
        L30:
            if ((r13 & 512) == 0) goto L32;
            String r142 = null;
            String r122 = r10;
            boolean r132 = r11;
            String r102 = r8;
            String r112 = r9;
            boolean r82 = r6;
            String r92 = r7;
            String r62 = r4;
            String r72 = r5;
            b r42 = r2;
            String r52 = r3;
        L34:
            return r42.a(r52, r62, r72, r82, r92, r102, r112, r122, r132, r142);
        L32:
            r142 = r12;
            r132 = r11;
            r112 = r9;
            r122 = r10;
            r92 = r7;
            r102 = r8;
            r72 = r5;
            r82 = r6;
            r52 = r3;
            r62 = r4;
            r42 = r2;
            goto L34
        }

        public final InterfaceC4081o0 a(String r13, String r14, String r15, boolean r16, String r17, String r18, String r19, String r20, boolean r21, String r22) {
            kotlin.jvm.internal.p.l(r13, "brokerCode");
            return new a(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22);
        }

        public b() {
        }
    }

    static {
        f49106a = new b(null);
    }
}

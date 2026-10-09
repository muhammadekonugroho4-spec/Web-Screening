package com.stockbit.referral.ui;

import android.os.Bundle;
import androidx.navigation.InterfaceC4081o0;
import com.stockbit.domain.model.valueobject.CouponData;
import java.util.Arrays;

/* loaded from: classes10.dex */
public abstract class J {

    /* renamed from: a, reason: collision with root package name */
    public static final b f128938a = null;

    public static final class a implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final int f128939a;

        /* renamed from: b, reason: collision with root package name */
        public final CouponData[] f128940b;

        /* renamed from: c, reason: collision with root package name */
        public final int f128941c;

        public a(int r1, CouponData[] r2) {
            this.f128939a = r1;
            this.f128940b = r2;
            this.f128941c = com.stockbit.referral.c.f128592c;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putInt("totalCoupon", this.f128939a);
            r02.putParcelableArray("couponList", this.f128940b);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f128941c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (this.f128939a == r52.f128939a) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f128940b, r52.f128940b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            int r02 = Integer.hashCode(this.f128939a) * 31;
            CouponData[] r1 = this.f128940b;
            if (r1 != null) goto L5;
            int r12 = 0;
        L7:
            return r02 + r12;
        L5:
            r12 = Arrays.hashCode(r1);
            goto L7
        }

        public String toString() {
            return "ActionUserReferralFragmentToMainSpinWheelFragment(totalCoupon=" + this.f128939a + ", couponList=" + Arrays.toString(this.f128940b) + ')';
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.i r1) {
            this();
        }

        public final InterfaceC4081o0 a(int r2, CouponData[] r3) {
            return new a(r2, r3);
        }

        public b() {
        }
    }

    static {
        f128938a = new b(null);
    }
}

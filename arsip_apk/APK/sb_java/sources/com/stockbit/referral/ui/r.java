package com.stockbit.referral.ui;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import com.stockbit.domain.model.valueobject.CouponData;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class r implements InterfaceC4094y {

    /* renamed from: c, reason: collision with root package name */
    public static final a f129046c = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f129047a;

    /* renamed from: b, reason: collision with root package name */
    public final CouponData[] f129048b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final r a(Bundle r8) {
            kotlin.jvm.internal.p.l(r8, "bundle");
            r8.setClassLoader(r.class.getClassLoader());
            if (r8.containsKey("totalCoupon") == false) goto L5;
            int r02 = r8.getInt("totalCoupon");
        L6:
            CouponData[] r4 = null;
            if (r8.containsKey("couponList") == false) goto L15;
            Parcelable[] r82 = r8.getParcelableArray("couponList");
            if (r82 == null) goto L15;
            ArrayList r1 = new ArrayList(r82.length);
            int r3 = r82.length;
            int r42 = 0;
        L11:
            if (r42 >= r3) goto L13;
            Parcelable r5 = r82[r42];
            kotlin.jvm.internal.p.j(r5, "null cannot be cast to non-null type com.stockbit.domain.model.valueobject.CouponData");
            r1.add((CouponData) r5);
            r42 = r42 + 1;
            goto L11
        L13:
            r4 = (CouponData[]) r1.toArray(new CouponData[0]);
        L15:
            return new r(r02, r4);
        L5:
            r02 = 0;
            goto L6
        }

        public a() {
        }
    }

    static {
        f129046c = new a(null);
    }

    public r(int r1, CouponData[] r2) {
        this.f129047a = r1;
        this.f129048b = r2;
    }

    public static final r fromBundle(Bundle r1) {
        return f129046c.a(r1);
    }

    public final CouponData[] a() {
        return this.f129048b;
    }

    public final int b() {
        return this.f129047a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof r) == true) goto L8;
        return false;
    L8:
        r r52 = (r) r5;
        if (this.f129047a == r52.f129047a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f129048b, r52.f129048b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int r02 = Integer.hashCode(this.f129047a) * 31;
        CouponData[] r1 = this.f129048b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = Arrays.hashCode(r1);
        goto L7
    }

    public String toString() {
        return "MainSpinWheelFragmentArgs(totalCoupon=" + this.f129047a + ", couponList=" + Arrays.toString(this.f129048b) + ')';
    }
}

package com.stockbit.feature.transaction.ui.nego.orderstock;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.stockbit.feature.transaction.contract.model.type.OrderNegoScreenType;
import java.io.Serializable;

/* loaded from: classes9.dex */
public final class j0 implements InterfaceC4094y {

    /* renamed from: e, reason: collision with root package name */
    public static final a f114825e = null;

    /* renamed from: a, reason: collision with root package name */
    public final OrderNegoScreenType f114826a;

    /* renamed from: b, reason: collision with root package name */
    public final String f114827b;

    /* renamed from: c, reason: collision with root package name */
    public final String f114828c;
    public final String d;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final j0 a(Bundle r7) {
            kotlin.jvm.internal.p.l(r7, "bundle");
            r7.setClassLoader(j0.class.getClassLoader());
            String r2 = "";
            if (r7.containsKey("symbol") == false) goto L9;
            String r02 = r7.getString("symbol");
            if (r02 != null) goto L11;
            throw new IllegalArgumentException("Argument \"symbol\" is marked as non-null but was passed a null value.");
        L11:
            if (r7.containsKey(AppMeasurementSdk.ConditionalUserProperty.NAME) == false) goto L17;
            String r1 = r7.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
            if (r1 != null) goto L19;
            throw new IllegalArgumentException("Argument \"name\" is marked as non-null but was passed a null value.");
        L19:
            if (r7.containsKey("companyType") == false) goto L26;
            r2 = r7.getString("companyType");
            if (r2 != null) goto L26;
            throw new IllegalArgumentException("Argument \"companyType\" is marked as non-null but was passed a null value.");
        L26:
            if (r7.containsKey("orderNegoScreenType") == false) goto L41;
            if (Parcelable.class.isAssignableFrom(OrderNegoScreenType.class) == false) goto L30;
        L34:
            OrderNegoScreenType r72 = (OrderNegoScreenType) r7.get("orderNegoScreenType");
            if (r72 == null) goto L39;
            return new j0(r72, r02, r1, r2);
        L39:
            throw new IllegalArgumentException("Argument \"orderNegoScreenType\" is marked as non-null but was passed a null value.");
        L30:
            if (Serializable.class.isAssignableFrom(OrderNegoScreenType.class) == true) goto L34;
            throw new UnsupportedOperationException(OrderNegoScreenType.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        L41:
            throw new IllegalArgumentException("Required argument \"orderNegoScreenType\" is missing and does not have an android:defaultValue");
        L17:
            r1 = "";
            goto L19
        L9:
            r02 = "";
            goto L11
        }

        public a() {
        }
    }

    static {
        f114825e = new a(null);
    }

    public j0(OrderNegoScreenType r2, String r3, String r4, String r5) {
        kotlin.jvm.internal.p.l(r2, "orderNegoScreenType");
        kotlin.jvm.internal.p.l(r3, "symbol");
        kotlin.jvm.internal.p.l(r4, AppMeasurementSdk.ConditionalUserProperty.NAME);
        kotlin.jvm.internal.p.l(r5, "companyType");
        this.f114826a = r2;
        this.f114827b = r3;
        this.f114828c = r4;
        this.d = r5;
    }

    public static final j0 fromBundle(Bundle r1) {
        return f114825e.a(r1);
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f114828c;
    }

    public final OrderNegoScreenType c() {
        return this.f114826a;
    }

    public final String d() {
        return this.f114827b;
    }

    public final Bundle e() {
        Bundle r02 = new Bundle();
        r02.putString("symbol", this.f114827b);
        r02.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, this.f114828c);
        r02.putString("companyType", this.d);
        if (Parcelable.class.isAssignableFrom(OrderNegoScreenType.class) == false) goto L7;
        Object r1 = this.f114826a;
        kotlin.jvm.internal.p.j(r1, "null cannot be cast to non-null type android.os.Parcelable");
        r02.putParcelable("orderNegoScreenType", (Parcelable) r1);
        return r02;
    L7:
        if (Serializable.class.isAssignableFrom(OrderNegoScreenType.class) == false) goto L11;
        OrderNegoScreenType r12 = this.f114826a;
        kotlin.jvm.internal.p.j(r12, "null cannot be cast to non-null type java.io.Serializable");
        r02.putSerializable("orderNegoScreenType", r12);
        return r02;
    L11:
        throw new UnsupportedOperationException(OrderNegoScreenType.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof j0) == true) goto L8;
        return false;
    L8:
        j0 r52 = (j0) r5;
        if (this.f114826a == r52.f114826a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f114827b, r52.f114827b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f114828c, r52.f114828c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f114826a.hashCode() * 31) + this.f114827b.hashCode()) * 31) + this.f114828c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "OrderNegoStockFragmentArgs(orderNegoScreenType=" + this.f114826a + ", symbol=" + this.f114827b + ", name=" + this.f114828c + ", companyType=" + this.d + ')';
    }
}

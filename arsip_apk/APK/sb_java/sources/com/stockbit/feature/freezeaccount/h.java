package com.stockbit.feature.freezeaccount;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import com.stockbit.feature.freezeaccount.contract.FreezeAccountSecuritiesMaintenanceParam;
import java.io.Serializable;

/* loaded from: classes9.dex */
public final class h implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f96584b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f96585c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final FreezeAccountSecuritiesMaintenanceParam f96586a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final h a(Bundle r4) {
            kotlin.jvm.internal.p.l(r4, "bundle");
            r4.setClassLoader(h.class.getClassLoader());
            if (r4.containsKey("securitiesMaintenanceParam") == false) goto L18;
            if (Parcelable.class.isAssignableFrom(FreezeAccountSecuritiesMaintenanceParam.class) == false) goto L7;
        L11:
            FreezeAccountSecuritiesMaintenanceParam r42 = (FreezeAccountSecuritiesMaintenanceParam) r4.get("securitiesMaintenanceParam");
            if (r42 == null) goto L16;
            return new h(r42);
        L16:
            throw new IllegalArgumentException("Argument \"securitiesMaintenanceParam\" is marked as non-null but was passed a null value.");
        L7:
            if (Serializable.class.isAssignableFrom(FreezeAccountSecuritiesMaintenanceParam.class) == true) goto L11;
            throw new UnsupportedOperationException(FreezeAccountSecuritiesMaintenanceParam.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        L18:
            throw new IllegalArgumentException("Required argument \"securitiesMaintenanceParam\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f96584b = new a(null);
        f96585c = FreezeAccountSecuritiesMaintenanceParam.f96509c;
    }

    public h(FreezeAccountSecuritiesMaintenanceParam r2) {
        kotlin.jvm.internal.p.l(r2, "securitiesMaintenanceParam");
        this.f96586a = r2;
    }

    public static final h fromBundle(Bundle r1) {
        return f96584b.a(r1);
    }

    public final FreezeAccountSecuritiesMaintenanceParam a() {
        return this.f96586a;
    }

    public final Bundle b() {
        Bundle r02 = new Bundle();
        if (Parcelable.class.isAssignableFrom(FreezeAccountSecuritiesMaintenanceParam.class) == false) goto L7;
        FreezeAccountSecuritiesMaintenanceParam r1 = this.f96586a;
        kotlin.jvm.internal.p.j(r1, "null cannot be cast to non-null type android.os.Parcelable");
        r02.putParcelable("securitiesMaintenanceParam", r1);
        return r02;
    L7:
        if (Serializable.class.isAssignableFrom(FreezeAccountSecuritiesMaintenanceParam.class) == false) goto L11;
        Parcelable r12 = this.f96586a;
        kotlin.jvm.internal.p.j(r12, "null cannot be cast to non-null type java.io.Serializable");
        r02.putSerializable("securitiesMaintenanceParam", (Serializable) r12);
        return r02;
    L11:
        throw new UnsupportedOperationException(FreezeAccountSecuritiesMaintenanceParam.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof h) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f96586a, ((h) r4).f96586a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f96586a.hashCode();
    }

    public String toString() {
        return "FreezeAccountFragmentArgs(securitiesMaintenanceParam=" + this.f96586a + ')';
    }
}

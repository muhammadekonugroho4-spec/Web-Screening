package com.stockbit.virtual.ui.detailorderlist;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import com.stockbit.domain.model.entity.virtual.TradingOrderList;
import java.io.Serializable;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class j implements InterfaceC4094y {

    /* renamed from: c, reason: collision with root package name */
    public static final a f166887c = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f166888a;

    /* renamed from: b, reason: collision with root package name */
    public final TradingOrderList f166889b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final j a(Bundle r4) {
            p.l(r4, "bundle");
            r4.setClassLoader(j.class.getClassLoader());
            if (r4.containsKey("EXTRA_PARCEL_ORDERLIST_DETAIL") == true) goto L5;
            TradingOrderList r02 = null;
        L14:
            if (r4.containsKey("EXTRA_PARCEL_ORDERLIST_PAGE_STATUS") == false) goto L18;
            return new j(r4.getString("EXTRA_PARCEL_ORDERLIST_PAGE_STATUS"), r02);
        L18:
            throw new IllegalArgumentException("Required argument \"EXTRA_PARCEL_ORDERLIST_PAGE_STATUS\" is missing and does not have an android:defaultValue");
        L5:
            if (Parcelable.class.isAssignableFrom(TradingOrderList.class) == false) goto L7;
        L11:
            r02 = (TradingOrderList) r4.get("EXTRA_PARCEL_ORDERLIST_DETAIL");
            goto L14
        L7:
            if (Serializable.class.isAssignableFrom(TradingOrderList.class) == true) goto L11;
            throw new UnsupportedOperationException(TradingOrderList.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }

        public a() {
        }
    }

    static {
        f166887c = new a(null);
    }

    public j(String r1, TradingOrderList r2) {
        this.f166888a = r1;
        this.f166889b = r2;
    }

    public static final j fromBundle(Bundle r1) {
        return f166887c.a(r1);
    }

    public final Bundle a() {
        Bundle r02 = new Bundle();
        if (Parcelable.class.isAssignableFrom(TradingOrderList.class) == false) goto L6;
        r02.putParcelable("EXTRA_PARCEL_ORDERLIST_DETAIL", this.f166889b);
    L8:
        r02.putString("EXTRA_PARCEL_ORDERLIST_PAGE_STATUS", this.f166888a);
        return r02;
    L6:
        if (Serializable.class.isAssignableFrom(TradingOrderList.class) == false) goto L8;
        r02.putSerializable("EXTRA_PARCEL_ORDERLIST_DETAIL", (Serializable) this.f166889b);
        goto L8
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof j) == true) goto L8;
        return false;
    L8:
        j r52 = (j) r5;
        if (p.g(this.f166888a, r52.f166888a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f166889b, r52.f166889b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        String r02 = this.f166888a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        TradingOrderList r2 = this.f166889b;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "VirtualDetailOrderlistFragmentArgs(EXTRAPARCELORDERLISTPAGESTATUS=" + this.f166888a + ", EXTRAPARCELORDERLISTDETAIL=" + this.f166889b + ')';
    }
}

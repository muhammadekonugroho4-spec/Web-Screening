package com.stockbit.feature.stocksfilter.ui.single;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class n implements InterfaceC4094y {

    /* renamed from: c, reason: collision with root package name */
    public static final a f106868c = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f106869a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f106870b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final n a(Bundle r4) {
            p.l(r4, "bundle");
            r4.setClassLoader(n.class.getClassLoader());
            if (r4.containsKey("current_stocks") == false) goto L5;
            String r02 = r4.getString("current_stocks");
        L7:
            if (r4.containsKey("is_from_order_book") == false) goto L9;
            boolean r42 = r4.getBoolean("is_from_order_book");
        L11:
            return new n(r02, r42);
        L9:
            r42 = false;
            goto L11
        L5:
            r02 = "";
            goto L7
        }

        public a() {
        }
    }

    static {
        f106868c = new a(null);
    }

    public n(String r1, boolean r2) {
        this.f106869a = r1;
        this.f106870b = r2;
    }

    public static final n fromBundle(Bundle r1) {
        return f106868c.a(r1);
    }

    public final String a() {
        return this.f106869a;
    }

    public final boolean b() {
        return this.f106870b;
    }

    public final Bundle c() {
        Bundle r02 = new Bundle();
        r02.putString("current_stocks", this.f106869a);
        r02.putBoolean("is_from_order_book", this.f106870b);
        return r02;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof n) == true) goto L8;
        return false;
    L8:
        n r52 = (n) r5;
        if (p.g(this.f106869a, r52.f106869a) == true) goto L12;
        return false;
    L12:
        if (this.f106870b == r52.f106870b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        String r02 = this.f106869a;
        if (r02 != null) goto L5;
        int r03 = 0;
    L7:
        return (r03 * 31) + Boolean.hashCode(this.f106870b);
    L5:
        r03 = r02.hashCode();
        goto L7
    }

    public String toString() {
        return "StockFilterFragmentArgs(currentStocks=" + this.f106869a + ", isFromOrderBook=" + this.f106870b + ')';
    }
}

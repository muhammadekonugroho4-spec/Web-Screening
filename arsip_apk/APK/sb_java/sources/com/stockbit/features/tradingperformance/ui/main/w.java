package com.stockbit.features.tradingperformance.ui.main;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import com.stockbit.features.tradingperformance.contract.TradingPerformanceTab;
import java.io.Serializable;

/* loaded from: classes10.dex */
public final class w implements InterfaceC4094y {

    /* renamed from: c, reason: collision with root package name */
    public static final a f119213c = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f119214a;

    /* renamed from: b, reason: collision with root package name */
    public final TradingPerformanceTab f119215b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final w a(Bundle r5) {
            kotlin.jvm.internal.p.l(r5, "bundle");
            r5.setClassLoader(w.class.getClassLoader());
            if (r5.containsKey("symbol") == false) goto L9;
            String r02 = r5.getString("symbol");
            if (r02 != null) goto L11;
            throw new IllegalArgumentException("Argument \"symbol\" is marked as non-null but was passed a null value.");
        L11:
            if (r5.containsKey("initialPage") == true) goto L13;
            TradingPerformanceTab r52 = TradingPerformanceTab.TAB_PORTFOLIO;
        L26:
            return new w(r02, r52);
        L13:
            if (Parcelable.class.isAssignableFrom(TradingPerformanceTab.class) == false) goto L15;
        L19:
            r52 = (TradingPerformanceTab) r5.get("initialPage");
            if (r52 != null) goto L26;
            throw new IllegalArgumentException("Argument \"initialPage\" is marked as non-null but was passed a null value.");
        L15:
            if (Serializable.class.isAssignableFrom(TradingPerformanceTab.class) == true) goto L19;
            throw new UnsupportedOperationException(TradingPerformanceTab.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        L9:
            r02 = "";
            goto L11
        }

        public a() {
        }
    }

    static {
        f119213c = new a(null);
    }

    public w(String r2, TradingPerformanceTab r3) {
        kotlin.jvm.internal.p.l(r2, "symbol");
        kotlin.jvm.internal.p.l(r3, "initialPage");
        this.f119214a = r2;
        this.f119215b = r3;
    }

    public static final w fromBundle(Bundle r1) {
        return f119213c.a(r1);
    }

    public final TradingPerformanceTab a() {
        return this.f119215b;
    }

    public final String b() {
        return this.f119214a;
    }

    public final Bundle c() {
        Bundle r02 = new Bundle();
        r02.putString("symbol", this.f119214a);
        if (Parcelable.class.isAssignableFrom(TradingPerformanceTab.class) == false) goto L7;
        Object r1 = this.f119215b;
        kotlin.jvm.internal.p.j(r1, "null cannot be cast to non-null type android.os.Parcelable");
        r02.putParcelable("initialPage", (Parcelable) r1);
        return r02;
    L7:
        if (Serializable.class.isAssignableFrom(TradingPerformanceTab.class) == false) goto L9;
        TradingPerformanceTab r12 = this.f119215b;
        kotlin.jvm.internal.p.j(r12, "null cannot be cast to non-null type java.io.Serializable");
        r02.putSerializable("initialPage", r12);
    L9:
        return r02;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof w) == true) goto L8;
        return false;
    L8:
        w r52 = (w) r5;
        if (kotlin.jvm.internal.p.g(this.f119214a, r52.f119214a) == true) goto L12;
        return false;
    L12:
        if (this.f119215b == r52.f119215b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f119214a.hashCode() * 31) + this.f119215b.hashCode();
    }

    public String toString() {
        return "TradingPerformanceComposeFragmentArgs(symbol=" + this.f119214a + ", initialPage=" + this.f119215b + ')';
    }

    public /* synthetic */ w(String r1, TradingPerformanceTab r2, int r3, kotlin.jvm.internal.i r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = "";
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = TradingPerformanceTab.TAB_PORTFOLIO;
    L8:
        this(r1, r2);
    }
}

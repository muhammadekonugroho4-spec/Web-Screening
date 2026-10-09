package com.stockbit.virtual.ui.detailportfolio;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import com.stockbit.domain.model.entity.virtual.TradingPortfolioResult;
import java.io.Serializable;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class g implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f166936b = null;

    /* renamed from: a, reason: collision with root package name */
    public final TradingPortfolioResult f166937a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final g a(Bundle r4) {
            p.l(r4, "bundle");
            r4.setClassLoader(g.class.getClassLoader());
            if (r4.containsKey("EXTRA_PARCEL_PORTFOLIO_DETAIL") == true) goto L5;
            TradingPortfolioResult r42 = null;
        L14:
            return new g(r42);
        L5:
            if (Parcelable.class.isAssignableFrom(TradingPortfolioResult.class) == false) goto L7;
        L11:
            r42 = (TradingPortfolioResult) r4.get("EXTRA_PARCEL_PORTFOLIO_DETAIL");
            goto L14
        L7:
            if (Serializable.class.isAssignableFrom(TradingPortfolioResult.class) == true) goto L11;
            throw new UnsupportedOperationException(TradingPortfolioResult.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }

        public a() {
        }
    }

    static {
        f166936b = new a(null);
    }

    public g(TradingPortfolioResult r1) {
        this.f166937a = r1;
    }

    public static final g fromBundle(Bundle r1) {
        return f166936b.a(r1);
    }

    public final TradingPortfolioResult a() {
        return this.f166937a;
    }

    public final Bundle b() {
        Bundle r02 = new Bundle();
        if (Parcelable.class.isAssignableFrom(TradingPortfolioResult.class) == false) goto L7;
        r02.putParcelable("EXTRA_PARCEL_PORTFOLIO_DETAIL", this.f166937a);
        return r02;
    L7:
        if (Serializable.class.isAssignableFrom(TradingPortfolioResult.class) == false) goto L9;
        r02.putSerializable("EXTRA_PARCEL_PORTFOLIO_DETAIL", (Serializable) this.f166937a);
    L9:
        return r02;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof g) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f166937a, ((g) r4).f166937a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        TradingPortfolioResult r02 = this.f166937a;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public String toString() {
        return "VirtualDetailPortfolioFragmentArgs(EXTRAPARCELPORTFOLIODETAIL=" + this.f166937a + ')';
    }
}

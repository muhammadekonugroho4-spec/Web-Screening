package com.stockbit.tradingcommunity.ui.leader;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4081o0;
import com.stockbit.domain.model.type.tradingcommunity.TradingCommunityFilterParam;
import java.io.Serializable;

/* loaded from: classes11.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final b f149749a = null;

    public static final class a implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final TradingCommunityFilterParam f149750a;

        /* renamed from: b, reason: collision with root package name */
        public final int f149751b;

        public a(TradingCommunityFilterParam r1) {
            this.f149750a = r1;
            this.f149751b = com.stockbit.tradingcommunity.d.f149008m;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            if (Parcelable.class.isAssignableFrom(TradingCommunityFilterParam.class) == false) goto L7;
            r02.putParcelable("tradingCommunityFilter", this.f149750a);
            return r02;
        L7:
            if (Serializable.class.isAssignableFrom(TradingCommunityFilterParam.class) == false) goto L11;
            r02.putSerializable("tradingCommunityFilter", (Serializable) this.f149750a);
            return r02;
        L11:
            throw new UnsupportedOperationException(TradingCommunityFilterParam.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f149751b;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f149750a, ((a) r4).f149750a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            TradingCommunityFilterParam r02 = this.f149750a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "ActionTradingCommunityLeaderDashboardFragmentToTradingCommunityLeaderDashboardFilterFragment(tradingCommunityFilter=" + this.f149750a + ')';
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.i r1) {
            this();
        }

        public final InterfaceC4081o0 a(TradingCommunityFilterParam r2) {
            return new a(r2);
        }

        public b() {
        }
    }

    static {
        f149749a = new b(null);
    }
}

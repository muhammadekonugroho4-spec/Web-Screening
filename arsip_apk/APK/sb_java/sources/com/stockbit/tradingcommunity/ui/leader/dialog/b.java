package com.stockbit.tradingcommunity.ui.leader.dialog;

import com.clevertap.android.sdk.Constants;
import com.stockbit.domain.model.type.tradingcommunity.TradingCommunityFilterParam;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public abstract class b {

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final TradingCommunityFilterParam f149732a;

        static {
        }

        public a(TradingCommunityFilterParam r2) {
            p.l(r2, "params");
            super(null);
            this.f149732a = r2;
        }

        public final TradingCommunityFilterParam a() {
            return this.f149732a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f149732a, ((a) r4).f149732a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f149732a.hashCode();
        }

        public String toString() {
            return "ApplyFilter(params=" + this.f149732a + ')';
        }
    }

    /* renamed from: com.stockbit.tradingcommunity.ui.leader.dialog.b$b, reason: collision with other inner class name */
    public static final class C1359b extends b {

        /* renamed from: a, reason: collision with root package name */
        public final String f149733a;

        static {
        }

        public C1359b(String r2) {
            p.l(r2, Constants.KEY_KEY);
            super(null);
            this.f149733a = r2;
        }

        public final String a() {
            return this.f149733a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1359b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f149733a, ((C1359b) r4).f149733a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f149733a.hashCode();
        }

        public String toString() {
            return "OpenDatePicker(key=" + this.f149733a + ')';
        }
    }

    static {
    }

    public /* synthetic */ b(i r1) {
        this();
    }

    public b() {
    }
}

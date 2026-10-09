package com.stockbit.tradingcommunity.ui.input;

import com.google.firebase.messaging.Constants;
import com.stockbit.domain.model.type.tradingcommunity.TradingCommunityConfirmationParam;

/* loaded from: classes11.dex */
public abstract class a {

    /* renamed from: com.stockbit.tradingcommunity.ui.input.a$a, reason: collision with other inner class name */
    public static final class C1356a extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final C1356a f149597a = null;

        static {
            f149597a = new C1356a();
        }

        public C1356a() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C1356a) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 460916603;
        }

        public String toString() {
            return "ErrorTradingSessionExpired";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f149598a = null;

        static {
            f149598a = new b();
        }

        public b() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof b) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 1983602345;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public final TradingCommunityConfirmationParam f149599a;

        static {
        }

        public c(TradingCommunityConfirmationParam r2) {
            kotlin.jvm.internal.p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f149599a = r2;
        }

        public final TradingCommunityConfirmationParam a() {
            return this.f149599a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f149599a, ((c) r4).f149599a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f149599a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f149599a + ')';
        }
    }

    static {
    }

    public /* synthetic */ a(kotlin.jvm.internal.i r1) {
        this();
    }

    public a() {
    }
}

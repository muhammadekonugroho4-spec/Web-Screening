package com.stockbit.feature.cryptoportfolio.ui.portfoliolist.state;

import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public interface c {

    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public static final a f94995a = null;

        static {
            f94995a = new a();
        }

        public a() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof a) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -343740019;
        }

        public String toString() {
            return "Empty";
        }
    }

    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public static final b f94996a = null;

        static {
            f94996a = new b();
        }

        public b() {
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
            return -343589304;
        }

        public String toString() {
            return "Error";
        }
    }

    /* renamed from: com.stockbit.feature.cryptoportfolio.ui.portfoliolist.state.c$c, reason: collision with other inner class name */
    public static final class C0899c implements c {

        /* renamed from: a, reason: collision with root package name */
        public static final C0899c f94997a = null;

        static {
            f94997a = new C0899c();
        }

        public C0899c() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C0899c) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -1956168324;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class d implements c {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.feature.cryptoportfolio.ui.portfoliolist.state.b f94998a;

        static {
        }

        public d(com.stockbit.feature.cryptoportfolio.ui.portfoliolist.state.b r2) {
            p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f94998a = r2;
        }

        public final com.stockbit.feature.cryptoportfolio.ui.portfoliolist.state.b a() {
            return this.f94998a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof d) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f94998a, ((d) r4).f94998a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f94998a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f94998a + ')';
        }
    }
}

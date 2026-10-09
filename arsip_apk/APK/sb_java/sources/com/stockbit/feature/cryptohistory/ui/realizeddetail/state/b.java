package com.stockbit.feature.cryptohistory.ui.realizeddetail.state;

import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public interface b {

    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.feature.cryptohistory.ui.detail.state.b f94149a;

        static {
        }

        public a(com.stockbit.feature.cryptohistory.ui.detail.state.b r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.f94149a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f94149a, ((a) r4).f94149a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f94149a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f94149a + ')';
        }
    }

    /* renamed from: com.stockbit.feature.cryptohistory.ui.realizeddetail.state.b$b, reason: collision with other inner class name */
    public static final class C0892b implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final C0892b f94150a = null;

        static {
            f94150a = new C0892b();
        }

        public C0892b() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C0892b) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 1810426568;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.feature.cryptohistory.ui.realizeddetail.state.a f94151a;

        static {
        }

        public c(com.stockbit.feature.cryptohistory.ui.realizeddetail.state.a r2) {
            p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f94151a = r2;
        }

        public final com.stockbit.feature.cryptohistory.ui.realizeddetail.state.a a() {
            return this.f94151a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f94151a, ((c) r4).f94151a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f94151a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f94151a + ')';
        }
    }
}

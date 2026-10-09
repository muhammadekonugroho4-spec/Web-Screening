package com.stockbit.feature.cryptohistory.ui.common.state;

import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public interface b {

    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f93681a = null;

        static {
            f93681a = new a();
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
            return 960617774;
        }

        public String toString() {
            return "Loading";
        }
    }

    /* renamed from: com.stockbit.feature.cryptohistory.ui.common.state.b$b, reason: collision with other inner class name */
    public static final class C0886b implements b {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.feature.cryptohistory.ui.common.state.a f93682a;

        static {
        }

        public C0886b(com.stockbit.feature.cryptohistory.ui.common.state.a r2) {
            p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f93682a = r2;
        }

        public final com.stockbit.feature.cryptohistory.ui.common.state.a a() {
            return this.f93682a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C0886b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f93682a, ((C0886b) r4).f93682a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f93682a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f93682a + ')';
        }
    }
}

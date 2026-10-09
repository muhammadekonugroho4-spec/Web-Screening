package com.stockbit.cryptodetail.ui.detail.state;

import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public interface c {

    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.cryptodetail.ui.detail.state.a f79703a;

        static {
        }

        public a(com.stockbit.cryptodetail.ui.detail.state.a r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.f79703a = r2;
        }

        public final com.stockbit.cryptodetail.ui.detail.state.a a() {
            return this.f79703a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f79703a, ((a) r4).f79703a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f79703a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f79703a + ')';
        }
    }

    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public static final b f79704a = null;

        static {
            f79704a = new b();
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
            return -1755461519;
        }

        public String toString() {
            return "Loading";
        }
    }

    /* renamed from: com.stockbit.cryptodetail.ui.detail.state.c$c, reason: collision with other inner class name */
    public static final class C0755c implements c {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.cryptodetail.ui.detail.state.b f79705a;

        static {
        }

        public C0755c(com.stockbit.cryptodetail.ui.detail.state.b r2) {
            p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f79705a = r2;
        }

        public final com.stockbit.cryptodetail.ui.detail.state.b a() {
            return this.f79705a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C0755c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f79705a, ((C0755c) r4).f79705a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f79705a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f79705a + ')';
        }
    }
}

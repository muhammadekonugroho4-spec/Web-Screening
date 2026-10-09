package com.stockbit.feature.cryptoorder.ui.state;

import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public interface c {

    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.feature.cryptoorder.ui.state.a f94585a;

        static {
        }

        public a(com.stockbit.feature.cryptoorder.ui.state.a r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.f94585a = r2;
        }

        public final com.stockbit.feature.cryptoorder.ui.state.a a() {
            return this.f94585a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f94585a, ((a) r4).f94585a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f94585a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f94585a + ')';
        }
    }

    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public static final b f94586a = null;

        static {
            f94586a = new b();
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
            return -824076127;
        }

        public String toString() {
            return "Loading";
        }
    }

    /* renamed from: com.stockbit.feature.cryptoorder.ui.state.c$c, reason: collision with other inner class name */
    public static final class C0896c implements c {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.feature.cryptoorder.ui.state.b f94587a;

        static {
        }

        public C0896c(com.stockbit.feature.cryptoorder.ui.state.b r2) {
            p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f94587a = r2;
        }

        public final C0896c a(com.stockbit.feature.cryptoorder.ui.state.b r2) {
            p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            return new C0896c(r2);
        }

        public final com.stockbit.feature.cryptoorder.ui.state.b b() {
            return this.f94587a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C0896c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f94587a, ((C0896c) r4).f94587a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f94587a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f94587a + ')';
        }
    }
}

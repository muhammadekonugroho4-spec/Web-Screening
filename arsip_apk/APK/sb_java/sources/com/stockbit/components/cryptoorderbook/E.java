package com.stockbit.components.cryptoorderbook;

import com.google.firebase.messaging.Constants;

/* loaded from: classes8.dex */
public interface E {

    public static final class a implements E {

        /* renamed from: a, reason: collision with root package name */
        public static final a f78329a = null;

        static {
            f78329a = new a();
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
            return 1652471323;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class b implements E {

        /* renamed from: a, reason: collision with root package name */
        public final D f78330a;

        static {
        }

        public b(D r2) {
            kotlin.jvm.internal.p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f78330a = r2;
        }

        public final D a() {
            return this.f78330a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f78330a, ((b) r4).f78330a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f78330a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f78330a + ')';
        }
    }
}

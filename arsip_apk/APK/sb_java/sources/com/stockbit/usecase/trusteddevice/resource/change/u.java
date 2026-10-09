package com.stockbit.usecase.trusteddevice.resource.change;

import com.google.firebase.messaging.Constants;

/* loaded from: classes2.dex */
public interface u {

    public static final class a implements u {

        /* renamed from: a, reason: collision with root package name */
        public static final a f164296a = null;

        static {
            f164296a = new a();
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
            return 932001912;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class b implements u {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.usecase.trusteddevice.model.a f164297a;

        public b(com.stockbit.usecase.trusteddevice.model.a r2) {
            kotlin.jvm.internal.p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f164297a = r2;
        }

        public final com.stockbit.usecase.trusteddevice.model.a a() {
            return this.f164297a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f164297a, ((b) r4).f164297a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f164297a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f164297a + ')';
        }
    }
}

package com.stockbit.usecase.trusteddevice.resource.login;

import com.google.firebase.messaging.Constants;

/* loaded from: classes2.dex */
public interface l {

    public static final class a implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f164335a = null;

        static {
            f164335a = new a();
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
            return 849479574;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class b implements l {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.usecase.trusteddevice.model.b f164336a;

        public b(com.stockbit.usecase.trusteddevice.model.b r2) {
            kotlin.jvm.internal.p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f164336a = r2;
        }

        public final com.stockbit.usecase.trusteddevice.model.b a() {
            return this.f164336a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f164336a, ((b) r4).f164336a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f164336a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f164336a + ')';
        }
    }
}

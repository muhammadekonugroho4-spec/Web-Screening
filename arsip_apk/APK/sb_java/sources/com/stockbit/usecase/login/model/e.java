package com.stockbit.usecase.login.model;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;

/* loaded from: classes2.dex */
public interface e {

    public interface a extends e {

        /* renamed from: com.stockbit.usecase.login.model.e$a$a, reason: collision with other inner class name */
        public static final class C1525a implements a {

            /* renamed from: a, reason: collision with root package name */
            public final DomainExodusException f158354a;

            public C1525a(DomainExodusException r2) {
                kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                this.f158354a = r2;
            }

            public final DomainExodusException a() {
                return this.f158354a;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof C1525a) == true) goto L9;
                return false;
            L9:
                if (kotlin.jvm.internal.p.g(this.f158354a, ((C1525a) r4).f158354a) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f158354a.hashCode();
            }

            public String toString() {
                return "General(error=" + this.f158354a + ')';
            }
        }

        public static final class b implements a {

            /* renamed from: a, reason: collision with root package name */
            public final DomainExodusException f158355a;

            public b(DomainExodusException r2) {
                kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                this.f158355a = r2;
            }

            public final DomainExodusException a() {
                return this.f158355a;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof b) == true) goto L9;
                return false;
            L9:
                if (kotlin.jvm.internal.p.g(this.f158355a, ((b) r4).f158355a) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f158355a.hashCode();
            }

            public String toString() {
                return "LimitExceeded(error=" + this.f158355a + ')';
            }
        }

        public static final class c implements a {

            /* renamed from: a, reason: collision with root package name */
            public static final c f158356a = null;

            static {
                f158356a = new c();
            }

            public c() {
            }
        }
    }

    public static final class b implements e {

        /* renamed from: a, reason: collision with root package name */
        public static final b f158357a = null;

        static {
            f158357a = new b();
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
            return -1831694790;
        }

        public String toString() {
            return "Loading";
        }
    }
}

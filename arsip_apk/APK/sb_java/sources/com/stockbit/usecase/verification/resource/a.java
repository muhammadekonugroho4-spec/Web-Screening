package com.stockbit.usecase.verification.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;

/* loaded from: classes2.dex */
public interface a {

    /* renamed from: com.stockbit.usecase.verification.resource.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1710a implements a {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f164452a;

        /* renamed from: com.stockbit.usecase.verification.resource.a$a$a, reason: collision with other inner class name */
        public static final class C1711a extends AbstractC1710a {

            /* renamed from: b, reason: collision with root package name */
            public final DomainExodusException f164453b;

            public C1711a(DomainExodusException r2) {
                kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                super(r2, null);
                this.f164453b = r2;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof C1711a) == true) goto L9;
                return false;
            L9:
                if (kotlin.jvm.internal.p.g(this.f164453b, ((C1711a) r4).f164453b) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f164453b.hashCode();
            }

            public String toString() {
                return "General(error=" + this.f164453b + ')';
            }
        }

        /* renamed from: com.stockbit.usecase.verification.resource.a$a$b */
        public static final class b extends AbstractC1710a {

            /* renamed from: b, reason: collision with root package name */
            public final DomainExodusException f164454b;

            public b(DomainExodusException r2) {
                kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                super(r2, null);
                this.f164454b = r2;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof b) == true) goto L9;
                return false;
            L9:
                if (kotlin.jvm.internal.p.g(this.f164454b, ((b) r4).f164454b) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f164454b.hashCode();
            }

            public String toString() {
                return "InvalidSession(error=" + this.f164454b + ')';
            }
        }

        public /* synthetic */ AbstractC1710a(DomainExodusException r1, kotlin.jvm.internal.i r2) {
            this(r1);
        }

        public AbstractC1710a(DomainExodusException r1) {
            this.f164452a = r1;
        }
    }

    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f164455a = null;

        static {
            f164455a = new b();
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
            return 2039075581;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f164456a;

        public c(boolean r1) {
            this.f164456a = r1;
        }

        public final boolean a() {
            return this.f164456a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (this.f164456a == ((c) r4).f164456a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f164456a);
        }

        public String toString() {
            return "Success(hasFinished=" + this.f164456a + ')';
        }
    }
}

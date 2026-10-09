package com.stockbit.usecase.verification.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;

/* loaded from: classes2.dex */
public interface c {

    public static abstract class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f164462a;

        /* renamed from: com.stockbit.usecase.verification.resource.c$a$a, reason: collision with other inner class name */
        public static final class C1715a extends a {

            /* renamed from: b, reason: collision with root package name */
            public final DomainExodusException f164463b;

            public C1715a(DomainExodusException r2) {
                kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                super(r2, null);
                this.f164463b = r2;
            }

            @Override // com.stockbit.usecase.verification.resource.c.a
            public DomainExodusException a() {
                return this.f164463b;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof C1715a) == true) goto L9;
                return false;
            L9:
                if (kotlin.jvm.internal.p.g(this.f164463b, ((C1715a) r4).f164463b) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f164463b.hashCode();
            }

            public String toString() {
                return "General(error=" + this.f164463b + ')';
            }
        }

        public static final class b extends a {

            /* renamed from: b, reason: collision with root package name */
            public final DomainExodusException f164464b;

            public b(DomainExodusException r2) {
                kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                super(r2, null);
                this.f164464b = r2;
            }

            @Override // com.stockbit.usecase.verification.resource.c.a
            public DomainExodusException a() {
                return this.f164464b;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof b) == true) goto L9;
                return false;
            L9:
                if (kotlin.jvm.internal.p.g(this.f164464b, ((b) r4).f164464b) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f164464b.hashCode();
            }

            public String toString() {
                return "InvalidParameter(error=" + this.f164464b + ')';
            }
        }

        /* renamed from: com.stockbit.usecase.verification.resource.c$a$c, reason: collision with other inner class name */
        public static final class C1716c extends a {

            /* renamed from: b, reason: collision with root package name */
            public final DomainExodusException f164465b;

            public C1716c(DomainExodusException r2) {
                kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                super(r2, null);
                this.f164465b = r2;
            }

            @Override // com.stockbit.usecase.verification.resource.c.a
            public DomainExodusException a() {
                return this.f164465b;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof C1716c) == true) goto L9;
                return false;
            L9:
                if (kotlin.jvm.internal.p.g(this.f164465b, ((C1716c) r4).f164465b) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f164465b.hashCode();
            }

            public String toString() {
                return "InvalidSession(error=" + this.f164465b + ')';
            }
        }

        public static final class d extends a {

            /* renamed from: b, reason: collision with root package name */
            public final DomainExodusException f164466b;

            public d(DomainExodusException r2) {
                kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                super(r2, null);
                this.f164466b = r2;
            }

            @Override // com.stockbit.usecase.verification.resource.c.a
            public DomainExodusException a() {
                return this.f164466b;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof d) == true) goto L9;
                return false;
            L9:
                if (kotlin.jvm.internal.p.g(this.f164466b, ((d) r4).f164466b) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f164466b.hashCode();
            }

            public String toString() {
                return "NetworkError(error=" + this.f164466b + ')';
            }
        }

        public static final class e extends a {

            /* renamed from: b, reason: collision with root package name */
            public final DomainExodusException f164467b;

            public e(DomainExodusException r2) {
                kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                super(r2, null);
                this.f164467b = r2;
            }

            @Override // com.stockbit.usecase.verification.resource.c.a
            public DomainExodusException a() {
                return this.f164467b;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof e) == true) goto L9;
                return false;
            L9:
                if (kotlin.jvm.internal.p.g(this.f164467b, ((e) r4).f164467b) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f164467b.hashCode();
            }

            public String toString() {
                return "RequestLimitExceeded(error=" + this.f164467b + ')';
            }
        }

        public static final class f extends a {

            /* renamed from: b, reason: collision with root package name */
            public final DomainExodusException f164468b;

            public f(DomainExodusException r2) {
                kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                super(r2, null);
                this.f164468b = r2;
            }

            @Override // com.stockbit.usecase.verification.resource.c.a
            public DomainExodusException a() {
                return this.f164468b;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof f) == true) goto L9;
                return false;
            L9:
                if (kotlin.jvm.internal.p.g(this.f164468b, ((f) r4).f164468b) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f164468b.hashCode();
            }

            public String toString() {
                return "SystemError(error=" + this.f164468b + ')';
            }
        }

        public static final class g extends a {

            /* renamed from: b, reason: collision with root package name */
            public final DomainExodusException f164469b;

            public g(DomainExodusException r2) {
                kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                super(r2, null);
                this.f164469b = r2;
            }

            @Override // com.stockbit.usecase.verification.resource.c.a
            public DomainExodusException a() {
                return this.f164469b;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof g) == true) goto L9;
                return false;
            L9:
                if (kotlin.jvm.internal.p.g(this.f164469b, ((g) r4).f164469b) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f164469b.hashCode();
            }

            public String toString() {
                return "TooManyRequest(error=" + this.f164469b + ')';
            }
        }

        public /* synthetic */ a(DomainExodusException r1, kotlin.jvm.internal.i r2) {
            this(r1);
        }

        public abstract DomainExodusException a();

        public a(DomainExodusException r1) {
            this.f164462a = r1;
        }
    }

    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public static final b f164470a = null;

        static {
            f164470a = new b();
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
            return -777080144;
        }

        public String toString() {
            return "Loading";
        }
    }

    /* renamed from: com.stockbit.usecase.verification.resource.c$c, reason: collision with other inner class name */
    public static final class C1717c implements c {

        /* renamed from: a, reason: collision with root package name */
        public static final C1717c f164471a = null;

        static {
            f164471a = new C1717c();
        }

        public C1717c() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C1717c) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 1314066807;
        }

        public String toString() {
            return "Success";
        }
    }
}

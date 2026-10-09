package com.stockbit.usecase.forgotphone.resource;

import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public interface b {

    public static abstract class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f157964a;

        /* renamed from: com.stockbit.usecase.forgotphone.resource.b$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC1494a extends a {

            /* renamed from: com.stockbit.usecase.forgotphone.resource.b$a$a$a, reason: collision with other inner class name */
            public static final class C1495a extends AbstractC1494a {

                /* renamed from: b, reason: collision with root package name */
                public final DomainExodusException f157965b;

                public C1495a(DomainExodusException r2) {
                    p.l(r2, "domainExodusException");
                    super(r2, null);
                    this.f157965b = r2;
                }

                public boolean equals(Object r4) {
                    if (this != r4) goto L6;
                    return true;
                L6:
                    if ((r4 instanceof C1495a) == true) goto L9;
                    return false;
                L9:
                    if (p.g(this.f157965b, ((C1495a) r4).f157965b) == true) goto L11;
                    return false;
                L11:
                    return true;
                }

                public int hashCode() {
                    return this.f157965b.hashCode();
                }

                public String toString() {
                    return "InvalidParam(domainExodusException=" + this.f157965b + ")";
                }
            }

            /* renamed from: com.stockbit.usecase.forgotphone.resource.b$a$a$b, reason: collision with other inner class name */
            public static final class C1496b extends AbstractC1494a {

                /* renamed from: b, reason: collision with root package name */
                public final DomainExodusException f157966b;

                public C1496b(DomainExodusException r2) {
                    p.l(r2, "domainExodusException");
                    super(r2, null);
                    this.f157966b = r2;
                }

                public boolean equals(Object r4) {
                    if (this != r4) goto L6;
                    return true;
                L6:
                    if ((r4 instanceof C1496b) == true) goto L9;
                    return false;
                L9:
                    if (p.g(this.f157966b, ((C1496b) r4).f157966b) == true) goto L11;
                    return false;
                L11:
                    return true;
                }

                public int hashCode() {
                    return this.f157966b.hashCode();
                }

                public String toString() {
                    return "Unknown(domainExodusException=" + this.f157966b + ")";
                }
            }

            public /* synthetic */ AbstractC1494a(DomainExodusException r1, i r2) {
                this(r1);
            }

            public AbstractC1494a(DomainExodusException r2) {
                super(r2, null);
            }
        }

        /* renamed from: com.stockbit.usecase.forgotphone.resource.b$a$b, reason: collision with other inner class name */
        public static final class C1497b extends a {

            /* renamed from: b, reason: collision with root package name */
            public final DomainExodusException f157967b;

            public C1497b(DomainExodusException r2) {
                p.l(r2, "domainExodusException");
                super(r2, null);
                this.f157967b = r2;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof C1497b) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f157967b, ((C1497b) r4).f157967b) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f157967b.hashCode();
            }

            public String toString() {
                return "InvalidSession(domainExodusException=" + this.f157967b + ")";
            }
        }

        public static final class c extends a {

            /* renamed from: b, reason: collision with root package name */
            public final DomainExodusException f157968b;

            public c(DomainExodusException r2) {
                p.l(r2, "domainExodusException");
                super(r2, null);
                this.f157968b = r2;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof c) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f157968b, ((c) r4).f157968b) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f157968b.hashCode();
            }

            public String toString() {
                return "OnAmendBlocked(domainExodusException=" + this.f157968b + ")";
            }
        }

        public static final class d extends a {

            /* renamed from: b, reason: collision with root package name */
            public final DomainExodusException f157969b;

            public d(DomainExodusException r2) {
                p.l(r2, "domainExodusException");
                super(r2, null);
                this.f157969b = r2;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof d) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f157969b, ((d) r4).f157969b) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f157969b.hashCode();
            }

            public String toString() {
                return "OnKycProcess(domainExodusException=" + this.f157969b + ")";
            }
        }

        public /* synthetic */ a(DomainExodusException r1, i r2) {
            this(r1);
        }

        public final DomainExodusException a() {
            return this.f157964a;
        }

        public a(DomainExodusException r1) {
            this.f157964a = r1;
        }
    }
}

package com.stockbit.domains.usecase.notificationdiagnostic.resource;

import com.stockbit.domains.usecase.notificationdiagnostic.model.NotificationDiagnosticType;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public abstract class a {

    /* renamed from: com.stockbit.domains.usecase.notificationdiagnostic.resource.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0837a extends a {

        /* renamed from: com.stockbit.domains.usecase.notificationdiagnostic.resource.a$a$a, reason: collision with other inner class name */
        public static final class C0838a extends AbstractC0837a {

            /* renamed from: a, reason: collision with root package name */
            public final NotificationDiagnosticType f88334a;

            /* renamed from: b, reason: collision with root package name */
            public final String f88335b;

            public C0838a(NotificationDiagnosticType r2, String r3) {
                p.l(r2, "diagnosticType");
                super(null);
                this.f88334a = r2;
                this.f88335b = r3;
            }

            public final NotificationDiagnosticType a() {
                return this.f88334a;
            }

            public final String b() {
                return this.f88335b;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof C0838a) == true) goto L8;
                return false;
            L8:
                C0838a r52 = (C0838a) r5;
                if (this.f88334a == r52.f88334a) goto L12;
                return false;
            L12:
                if (p.g(this.f88335b, r52.f88335b) == true) goto L14;
                return false;
            L14:
                return true;
            }

            public int hashCode() {
                int r02 = this.f88334a.hashCode() * 31;
                String r1 = this.f88335b;
                if (r1 != null) goto L5;
                int r12 = 0;
            L7:
                return r02 + r12;
            L5:
                r12 = r1.hashCode();
                goto L7
            }

            public String toString() {
                return "General(diagnosticType=" + this.f88334a + ", message=" + this.f88335b + ")";
            }

            public /* synthetic */ C0838a(NotificationDiagnosticType r1, String r2, int r3, i r4) {
                if ((r3 & 2) == 0) goto L5;
                r2 = null;
            L5:
                this(r1, r2);
            }
        }

        /* renamed from: com.stockbit.domains.usecase.notificationdiagnostic.resource.a$a$b */
        public static final class b extends AbstractC0837a {

            /* renamed from: a, reason: collision with root package name */
            public final NotificationDiagnosticType f88336a;

            public b(NotificationDiagnosticType r2) {
                p.l(r2, "diagnosticType");
                super(null);
                this.f88336a = r2;
            }

            public final NotificationDiagnosticType a() {
                return this.f88336a;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof b) == true) goto L9;
                return false;
            L9:
                if (this.f88336a == ((b) r4).f88336a) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f88336a.hashCode();
            }

            public String toString() {
                return "Permission(diagnosticType=" + this.f88336a + ")";
            }
        }

        public /* synthetic */ AbstractC0837a(i r1) {
            this();
        }

        public AbstractC0837a() {
            super(null);
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final NotificationDiagnosticType f88337a;

        public b(NotificationDiagnosticType r2) {
            p.l(r2, "diagnosticType");
            super(null);
            this.f88337a = r2;
        }

        public final NotificationDiagnosticType a() {
            return this.f88337a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (this.f88337a == ((b) r4).f88337a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f88337a.hashCode();
        }

        public String toString() {
            return "Loading(diagnosticType=" + this.f88337a + ")";
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public final NotificationDiagnosticType f88338a;

        public c(NotificationDiagnosticType r2) {
            p.l(r2, "diagnosticType");
            super(null);
            this.f88338a = r2;
        }

        public final NotificationDiagnosticType a() {
            return this.f88338a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (this.f88338a == ((c) r4).f88338a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f88338a.hashCode();
        }

        public String toString() {
            return "Success(diagnosticType=" + this.f88338a + ")";
        }
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}

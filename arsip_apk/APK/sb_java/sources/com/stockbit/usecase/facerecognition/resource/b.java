package com.stockbit.usecase.facerecognition.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public interface b {

    public static abstract class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f157762a;

        /* renamed from: com.stockbit.usecase.facerecognition.resource.b$a$a, reason: collision with other inner class name */
        public static final class C1484a extends a {

            /* renamed from: b, reason: collision with root package name */
            public final DomainExodusException f157763b;

            public C1484a(DomainExodusException r2) {
                p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                super(r2, null);
                this.f157763b = r2;
            }

            @Override // com.stockbit.usecase.facerecognition.resource.b.a
            public DomainExodusException a() {
                return this.f157763b;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof C1484a) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f157763b, ((C1484a) r4).f157763b) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f157763b.hashCode();
            }

            public String toString() {
                return "GenericError(error=" + this.f157763b + ')';
            }
        }

        /* renamed from: com.stockbit.usecase.facerecognition.resource.b$a$b, reason: collision with other inner class name */
        public static final class C1485b extends a {

            /* renamed from: b, reason: collision with root package name */
            public final DomainExodusException f157764b;

            public C1485b(DomainExodusException r2) {
                p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                super(r2, null);
                this.f157764b = r2;
            }

            @Override // com.stockbit.usecase.facerecognition.resource.b.a
            public DomainExodusException a() {
                return this.f157764b;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof C1485b) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f157764b, ((C1485b) r4).f157764b) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f157764b.hashCode();
            }

            public String toString() {
                return "InvalidParameterError(error=" + this.f157764b + ')';
            }
        }

        public static final class c extends a {

            /* renamed from: b, reason: collision with root package name */
            public final DomainExodusException f157765b;

            public c(DomainExodusException r2) {
                p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                super(r2, null);
                this.f157765b = r2;
            }

            @Override // com.stockbit.usecase.facerecognition.resource.b.a
            public DomainExodusException a() {
                return this.f157765b;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof c) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f157765b, ((c) r4).f157765b) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f157765b.hashCode();
            }

            public String toString() {
                return "InvalidRequestSessionError(error=" + this.f157765b + ')';
            }
        }

        public static final class d extends a {

            /* renamed from: b, reason: collision with root package name */
            public final DomainExodusException f157766b;

            public d(DomainExodusException r2) {
                p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                super(r2, null);
                this.f157766b = r2;
            }

            @Override // com.stockbit.usecase.facerecognition.resource.b.a
            public DomainExodusException a() {
                return this.f157766b;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof d) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f157766b, ((d) r4).f157766b) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f157766b.hashCode();
            }

            public String toString() {
                return "ThirdPartyError(error=" + this.f157766b + ')';
            }
        }

        public /* synthetic */ a(DomainExodusException r1, i r2) {
            this(r1);
        }

        public abstract DomainExodusException a();

        public a(DomainExodusException r1) {
            this.f157762a = r1;
        }
    }

    /* renamed from: com.stockbit.usecase.facerecognition.resource.b$b, reason: collision with other inner class name */
    public static final class C1486b implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final C1486b f157767a = null;

        static {
            f157767a = new C1486b();
        }

        public C1486b() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C1486b) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 1048272744;
        }

        public String toString() {
            return "Loading";
        }
    }
}

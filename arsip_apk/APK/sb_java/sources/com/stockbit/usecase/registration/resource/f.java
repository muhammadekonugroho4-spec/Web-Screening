package com.stockbit.usecase.registration.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public interface f {

    public static abstract class a implements f {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f159534a;

        /* renamed from: com.stockbit.usecase.registration.resource.f$a$a, reason: collision with other inner class name */
        public static final class C1596a extends a {

            /* renamed from: b, reason: collision with root package name */
            public final DomainExodusException f159535b;

            public C1596a(DomainExodusException r2) {
                p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                super(r2, null);
                this.f159535b = r2;
            }

            @Override // com.stockbit.usecase.registration.resource.f.a
            public DomainExodusException a() {
                return this.f159535b;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof C1596a) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f159535b, ((C1596a) r4).f159535b) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f159535b.hashCode();
            }

            public String toString() {
                return "EmailRegisteredError(error=" + this.f159535b + ")";
            }
        }

        public static final class b extends a {

            /* renamed from: b, reason: collision with root package name */
            public final DomainExodusException f159536b;

            public b(DomainExodusException r2) {
                p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                super(r2, null);
                this.f159536b = r2;
            }

            @Override // com.stockbit.usecase.registration.resource.f.a
            public DomainExodusException a() {
                return this.f159536b;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof b) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f159536b, ((b) r4).f159536b) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f159536b.hashCode();
            }

            public String toString() {
                return "GeneralError(error=" + this.f159536b + ")";
            }
        }

        public static final class c extends a {

            /* renamed from: b, reason: collision with root package name */
            public final DomainExodusException f159537b;

            public c(DomainExodusException r2) {
                p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                super(r2, null);
                this.f159537b = r2;
            }

            @Override // com.stockbit.usecase.registration.resource.f.a
            public DomainExodusException a() {
                return this.f159537b;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof c) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f159537b, ((c) r4).f159537b) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f159537b.hashCode();
            }

            public String toString() {
                return "OtpInvalidError(error=" + this.f159537b + ")";
            }
        }

        public static final class d extends a {

            /* renamed from: b, reason: collision with root package name */
            public final DomainExodusException f159538b;

            public d(DomainExodusException r2) {
                p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                super(r2, null);
                this.f159538b = r2;
            }

            @Override // com.stockbit.usecase.registration.resource.f.a
            public DomainExodusException a() {
                return this.f159538b;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof d) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f159538b, ((d) r4).f159538b) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f159538b.hashCode();
            }

            public String toString() {
                return "PhoneNumberRegisteredError(error=" + this.f159538b + ")";
            }
        }

        public static final class e extends a {

            /* renamed from: b, reason: collision with root package name */
            public final DomainExodusException f159539b;

            public e(DomainExodusException r2) {
                p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                super(r2, null);
                this.f159539b = r2;
            }

            @Override // com.stockbit.usecase.registration.resource.f.a
            public DomainExodusException a() {
                return this.f159539b;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof e) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f159539b, ((e) r4).f159539b) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f159539b.hashCode();
            }

            public String toString() {
                return "UsernameRegisteredError(error=" + this.f159539b + ")";
            }
        }

        public /* synthetic */ a(DomainExodusException r1, i r2) {
            this(r1);
        }

        public abstract DomainExodusException a();

        public a(DomainExodusException r1) {
            this.f159534a = r1;
        }
    }
}

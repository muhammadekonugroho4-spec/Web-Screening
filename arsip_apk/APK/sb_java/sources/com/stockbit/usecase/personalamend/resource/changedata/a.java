package com.stockbit.usecase.personalamend.resource.changedata;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public interface a {

    /* renamed from: com.stockbit.usecase.personalamend.resource.changedata.a$a, reason: collision with other inner class name */
    public static final class C1553a implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final C1553a f159099a = null;

        static {
            f159099a = new C1553a();
        }

        public C1553a() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C1553a) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 1541450441;
        }

        public String toString() {
            return "Eligible";
        }
    }

    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f159100a;

        public b(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.f159100a = r2;
        }

        public final DomainExodusException a() {
            return this.f159100a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f159100a, ((b) r4).f159100a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f159100a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f159100a + ")";
        }
    }

    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f159101a = null;

        static {
            f159101a = new c();
        }

        public c() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof c) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 1491503626;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class d implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f159102a = null;

        static {
            f159102a = new d();
        }

        public d() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof d) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -410998462;
        }

        public String toString() {
            return "PengkinianDataInProgress";
        }
    }

    public static final class e implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final e f159103a = null;

        static {
            f159103a = new e();
        }

        public e() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof e) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 2098532733;
        }

        public String toString() {
            return "RegistrationInProgress";
        }
    }

    public static final class f implements a {

        /* renamed from: a, reason: collision with root package name */
        public final long f159104a;

        public f(long r1) {
            this.f159104a = r1;
        }

        public final long a() {
            return this.f159104a;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof f) == true) goto L9;
            return false;
        L9:
            if (this.f159104a == ((f) r8).f159104a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Long.hashCode(this.f159104a);
        }

        public String toString() {
            return "Uneligible(timeMillisInFuture=" + this.f159104a + ")";
        }
    }
}

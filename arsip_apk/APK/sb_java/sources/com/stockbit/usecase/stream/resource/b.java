package com.stockbit.usecase.stream.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public interface b {

    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f163072a;

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.f163072a = r2;
        }

        public final DomainExodusException a() {
            return this.f163072a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f163072a, ((a) r4).f163072a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f163072a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f163072a + ")";
        }
    }

    /* renamed from: com.stockbit.usecase.stream.resource.b$b, reason: collision with other inner class name */
    public static final class C1666b implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final C1666b f163073a = null;

        static {
            f163073a = new C1666b();
        }

        public C1666b() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C1666b) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -568581220;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public final String f163074a;

        public c(String r2) {
            p.l(r2, "message");
            this.f163074a = r2;
        }

        public final String a() {
            return this.f163074a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f163074a, ((c) r4).f163074a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f163074a.hashCode();
        }

        public String toString() {
            return "Success(message=" + this.f163074a + ")";
        }
    }
}

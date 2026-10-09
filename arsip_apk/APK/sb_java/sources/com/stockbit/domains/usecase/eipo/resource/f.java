package com.stockbit.domains.usecase.eipo.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public interface f {

    public static final class a implements f {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f88292a;

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.f88292a = r2;
        }

        public final DomainExodusException a() {
            return this.f88292a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f88292a, ((a) r4).f88292a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f88292a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f88292a + ")";
        }
    }

    public static final class b implements f {

        /* renamed from: a, reason: collision with root package name */
        public static final b f88293a = null;

        static {
            f88293a = new b();
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
            return 167601487;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c implements f {

        /* renamed from: a, reason: collision with root package name */
        public final String f88294a;

        public c(String r2) {
            p.l(r2, "url");
            this.f88294a = r2;
        }

        public final String a() {
            return this.f88294a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f88294a, ((c) r4).f88294a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f88294a.hashCode();
        }

        public String toString() {
            return "Success(url=" + this.f88294a + ")";
        }
    }
}

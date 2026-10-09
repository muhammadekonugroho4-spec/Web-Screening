package com.stockbit.domains.usecase.eipo.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public interface c {

    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f88288a;

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.f88288a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f88288a, ((a) r4).f88288a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f88288a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f88288a + ")";
        }
    }

    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f88289a;

        public b(boolean r1) {
            this.f88289a = r1;
        }

        public final boolean a() {
            return this.f88289a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (this.f88289a == ((b) r4).f88289a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f88289a);
        }

        public String toString() {
            return "Loading(show=" + this.f88289a + ")";
        }
    }
}

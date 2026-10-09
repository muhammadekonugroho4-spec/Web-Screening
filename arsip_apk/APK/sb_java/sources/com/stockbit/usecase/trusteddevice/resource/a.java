package com.stockbit.usecase.trusteddevice.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public interface a {

    /* renamed from: com.stockbit.usecase.trusteddevice.resource.a$a, reason: collision with other inner class name */
    public static final class C1707a implements a {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f164243a;

        public C1707a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.f164243a = r2;
        }

        public final DomainExodusException a() {
            return this.f164243a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1707a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f164243a, ((C1707a) r4).f164243a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f164243a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f164243a + ')';
        }
    }

    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f164244a = null;

        static {
            f164244a = new b();
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
            return -745071691;
        }

        public String toString() {
            return "Success";
        }
    }
}

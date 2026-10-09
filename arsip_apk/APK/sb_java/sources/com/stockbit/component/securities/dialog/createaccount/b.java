package com.stockbit.component.securities.dialog.createaccount;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainSecuritiesException;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public interface b {

    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final DomainSecuritiesException f76117a;

        static {
        }

        public a(DomainSecuritiesException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.f76117a = r2;
        }

        public final DomainSecuritiesException a() {
            return this.f76117a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f76117a, ((a) r4).f76117a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f76117a.hashCode();
        }

        public String toString() {
            return "OnUnauthorized(error=" + this.f76117a + ')';
        }
    }
}

package com.stockbit.usecase.securities.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainSecuritiesException;

/* loaded from: classes2.dex */
public interface J {

    public static final class a implements J {

        /* renamed from: a, reason: collision with root package name */
        public final DomainSecuritiesException f162060a;

        public a(DomainSecuritiesException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.f162060a = r2;
        }

        public final DomainSecuritiesException a() {
            return this.f162060a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f162060a, ((a) r4).f162060a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f162060a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f162060a + ")";
        }
    }

    public static final class b implements J {

        /* renamed from: a, reason: collision with root package name */
        public static final b f162061a = null;

        static {
            f162061a = new b();
        }

        public b() {
        }
    }
}

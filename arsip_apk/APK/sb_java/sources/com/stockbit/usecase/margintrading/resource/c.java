package com.stockbit.usecase.margintrading.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainSecuritiesException;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public interface c {

    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public final DomainSecuritiesException f158463a;

        public a(DomainSecuritiesException r2) {
            p.l(r2, "exception");
            this.f158463a = r2;
        }

        public final DomainSecuritiesException a() {
            return this.f158463a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f158463a, ((a) r4).f158463a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f158463a.hashCode();
        }

        public String toString() {
            return "Error(exception=" + this.f158463a + ")";
        }
    }

    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public final List f158464a;

        public b(List r2) {
            p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f158464a = r2;
        }

        public final List a() {
            return this.f158464a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f158464a, ((b) r4).f158464a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f158464a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f158464a + ")";
        }
    }
}

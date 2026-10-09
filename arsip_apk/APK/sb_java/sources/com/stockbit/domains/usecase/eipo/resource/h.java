package com.stockbit.domains.usecase.eipo.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainSecuritiesException;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public interface h {

    public static final class a implements h {

        /* renamed from: a, reason: collision with root package name */
        public final DomainSecuritiesException f88298a;

        public a(DomainSecuritiesException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.f88298a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f88298a, ((a) r4).f88298a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f88298a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f88298a + ")";
        }
    }

    public static final class b implements h {

        /* renamed from: a, reason: collision with root package name */
        public static final b f88299a = null;

        static {
            f88299a = new b();
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
            return 642708752;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c implements h {

        /* renamed from: a, reason: collision with root package name */
        public final List f88300a;

        public c(List r2) {
            p.l(r2, "images");
            this.f88300a = r2;
        }

        public final List a() {
            return this.f88300a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f88300a, ((c) r4).f88300a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f88300a.hashCode();
        }

        public String toString() {
            return "Success(images=" + this.f88300a + ")";
        }
    }
}

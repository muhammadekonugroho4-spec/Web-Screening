package com.stockbit.domains.usecase.eipo.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainSecuritiesException;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public interface i {

    public static final class a implements i {

        /* renamed from: a, reason: collision with root package name */
        public final DomainSecuritiesException f88301a;

        public a(DomainSecuritiesException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.f88301a = r2;
        }

        public final DomainSecuritiesException a() {
            return this.f88301a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f88301a, ((a) r4).f88301a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f88301a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f88301a + ")";
        }
    }

    public static final class b implements i {

        /* renamed from: a, reason: collision with root package name */
        public static final b f88302a = null;

        static {
            f88302a = new b();
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
            return -341372167;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c implements i {

        /* renamed from: a, reason: collision with root package name */
        public static final c f88303a = null;

        static {
            f88303a = new c();
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
            return 1749774784;
        }

        public String toString() {
            return "Success";
        }
    }
}

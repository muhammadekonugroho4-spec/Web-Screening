package com.stockbit.usecase.securities.auth.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainSecuritiesException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class b {

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final DomainSecuritiesException f160226a;

        public a(DomainSecuritiesException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f160226a = r2;
        }

        public final DomainSecuritiesException a() {
            return this.f160226a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f160226a, ((a) r4).f160226a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f160226a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f160226a + ")";
        }
    }

    /* renamed from: com.stockbit.usecase.securities.auth.resource.b$b, reason: collision with other inner class name */
    public static final class C1614b extends b {

        /* renamed from: a, reason: collision with root package name */
        public final String f160227a;

        public C1614b(String r2) {
            p.l(r2, "token");
            super(null);
            this.f160227a = r2;
        }

        public final String a() {
            return this.f160227a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1614b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f160227a, ((C1614b) r4).f160227a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f160227a.hashCode();
        }

        public String toString() {
            return "Success(token=" + this.f160227a + ")";
        }
    }

    public /* synthetic */ b(i r1) {
        this();
    }

    public b() {
    }
}

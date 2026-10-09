package com.stockbit.usecase.transaction.model.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainSecuritiesException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: com.stockbit.usecase.transaction.model.resource.a$a, reason: collision with other inner class name */
    public static final class C1694a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final DomainSecuritiesException f163937a;

        public C1694a(DomainSecuritiesException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f163937a = r2;
        }

        public final DomainSecuritiesException a() {
            return this.f163937a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1694a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f163937a, ((C1694a) r4).f163937a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f163937a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f163937a + ")";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f163938a = null;

        static {
            f163938a = new b();
        }

        public b() {
            super(null);
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
            return 409816337;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f163939a;

        public c(String r2) {
            p.l(r2, "orderId");
            super(null);
            this.f163939a = r2;
        }

        public final String a() {
            return this.f163939a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f163939a, ((c) r4).f163939a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f163939a.hashCode();
        }

        public String toString() {
            return "Success(orderId=" + this.f163939a + ")";
        }
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}

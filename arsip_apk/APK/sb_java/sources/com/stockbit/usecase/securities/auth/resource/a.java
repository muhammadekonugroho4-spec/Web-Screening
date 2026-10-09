package com.stockbit.usecase.securities.auth.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainSecuritiesException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: com.stockbit.usecase.securities.auth.resource.a$a, reason: collision with other inner class name */
    public static final class C1613a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final DomainSecuritiesException f160224a;

        public C1613a(DomainSecuritiesException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f160224a = r2;
        }

        public final DomainSecuritiesException a() {
            return this.f160224a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1613a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f160224a, ((C1613a) r4).f160224a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f160224a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f160224a + ")";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f160225a = null;

        static {
            f160225a = new b();
        }

        public b() {
            super(null);
        }
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}

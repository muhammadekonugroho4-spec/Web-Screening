package com.stockbit.usecase.orderbook.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainSecuritiesException;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class b {

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public DomainSecuritiesException f158909a;

        public a(DomainSecuritiesException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f158909a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f158909a, ((a) r4).f158909a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f158909a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f158909a + ")";
        }
    }

    /* renamed from: com.stockbit.usecase.orderbook.resource.b$b, reason: collision with other inner class name */
    public static final class C1540b extends b {

        /* renamed from: a, reason: collision with root package name */
        public final List f158910a;

        public C1540b(List r2) {
            p.l(r2, "prices");
            super(null);
            this.f158910a = r2;
        }

        public final List a() {
            return this.f158910a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1540b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f158910a, ((C1540b) r4).f158910a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f158910a.hashCode();
        }

        public String toString() {
            return "Success(prices=" + this.f158910a + ")";
        }
    }

    public /* synthetic */ b(i r1) {
        this();
    }

    public b() {
    }
}

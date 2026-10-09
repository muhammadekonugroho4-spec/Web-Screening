package com.stockbit.usecase.transaction.model.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainSecuritiesException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class b {

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final DomainSecuritiesException f163940a;

        public a(DomainSecuritiesException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f163940a = r2;
        }

        public final DomainSecuritiesException a() {
            return this.f163940a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f163940a, ((a) r4).f163940a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f163940a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f163940a + ")";
        }
    }

    /* renamed from: com.stockbit.usecase.transaction.model.resource.b$b, reason: collision with other inner class name */
    public static final class C1695b extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final C1695b f163941a = null;

        static {
            f163941a = new C1695b();
        }

        public C1695b() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C1695b) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 787171528;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c extends b {

        /* renamed from: a, reason: collision with root package name */
        public final String f163942a;

        /* renamed from: b, reason: collision with root package name */
        public final int f163943b;

        public c(String r2, int r3) {
            p.l(r2, "orderId");
            super(null);
            this.f163942a = r2;
            this.f163943b = r3;
        }

        public final String a() {
            return this.f163942a;
        }

        public final int b() {
            return this.f163943b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (p.g(this.f163942a, r52.f163942a) == true) goto L12;
            return false;
        L12:
            if (this.f163943b == r52.f163943b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f163942a.hashCode() * 31) + Integer.hashCode(this.f163943b);
        }

        public String toString() {
            return "Success(orderId=" + this.f163942a + ", orderLimitTodayCount=" + this.f163943b + ")";
        }
    }

    public /* synthetic */ b(i r1) {
        this();
    }

    public b() {
    }
}

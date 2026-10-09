package com.stockbit.usecase.transaction.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainSecuritiesException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class c {

    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public final DomainSecuritiesException f164008a;

        public a(DomainSecuritiesException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f164008a = r2;
        }

        public final DomainSecuritiesException a() {
            return this.f164008a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f164008a, ((a) r4).f164008a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f164008a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f164008a + ")";
        }
    }

    public static final class b extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final b f164009a = null;

        static {
            f164009a = new b();
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
            return 1129475669;
        }

        public String toString() {
            return "Loading";
        }
    }

    /* renamed from: com.stockbit.usecase.transaction.resource.c$c, reason: collision with other inner class name */
    public static final class C1699c extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final C1699c f164010a = null;

        static {
            f164010a = new C1699c();
        }

        public C1699c() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C1699c) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -1434862075;
        }

        public String toString() {
            return "ShowTnc";
        }
    }

    public static final class d extends c {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f164011a;

        /* renamed from: b, reason: collision with root package name */
        public final String f164012b;

        public d(boolean r2, String r3) {
            p.l(r3, "orderId");
            super(null);
            this.f164011a = r2;
            this.f164012b = r3;
        }

        public final String a() {
            return this.f164012b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof d) == true) goto L8;
            return false;
        L8:
            d r52 = (d) r5;
            if (this.f164011a == r52.f164011a) goto L12;
            return false;
        L12:
            if (p.g(this.f164012b, r52.f164012b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f164011a) * 31) + this.f164012b.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f164011a + ", orderId=" + this.f164012b + ")";
        }
    }

    public /* synthetic */ c(i r1) {
        this();
    }

    public c() {
    }
}

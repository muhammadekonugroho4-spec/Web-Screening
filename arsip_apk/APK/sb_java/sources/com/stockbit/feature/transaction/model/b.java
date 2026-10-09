package com.stockbit.feature.transaction.model;

import com.stockbit.features.model.DomainSecuritiesException;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public interface b {

    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final DomainSecuritiesException f108265a;

        static {
        }

        public a(DomainSecuritiesException r1) {
            this.f108265a = r1;
        }

        public final DomainSecuritiesException a() {
            return this.f108265a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f108265a, ((a) r4).f108265a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            DomainSecuritiesException r02 = this.f108265a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f108265a + ')';
        }
    }

    /* renamed from: com.stockbit.feature.transaction.model.b$b, reason: collision with other inner class name */
    public static final class C0969b implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final C0969b f108266a = null;

        static {
            f108266a = new C0969b();
        }

        public C0969b() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C0969b) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 177175951;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public final String f108267a;

        /* renamed from: b, reason: collision with root package name */
        public final int f108268b;

        static {
        }

        public c(String r2, int r3) {
            p.l(r2, "orderId");
            this.f108267a = r2;
            this.f108268b = r3;
        }

        public final String a() {
            return this.f108267a;
        }

        public final int b() {
            return this.f108268b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (p.g(this.f108267a, r52.f108267a) == true) goto L12;
            return false;
        L12:
            if (this.f108268b == r52.f108268b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f108267a.hashCode() * 31) + Integer.hashCode(this.f108268b);
        }

        public String toString() {
            return "Success(orderId=" + this.f108267a + ", orderLimitTodayCount=" + this.f108268b + ')';
        }
    }

    public static final class d implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final d f108269a = null;

        static {
            f108269a = new d();
        }

        public d() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof d) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -1049311734;
        }

        public String toString() {
            return "Unspecified";
        }
    }
}

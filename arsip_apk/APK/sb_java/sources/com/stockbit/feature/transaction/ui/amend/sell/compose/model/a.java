package com.stockbit.feature.transaction.ui.amend.sell.compose.model;

import com.stockbit.features.model.DomainSecuritiesError;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public abstract class a {

    /* renamed from: com.stockbit.feature.transaction.ui.amend.sell.compose.model.a$a, reason: collision with other inner class name */
    public static final class C0985a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f110096a;

        static {
        }

        public C0985a(String r2) {
            p.l(r2, "errorType");
            super(null);
            this.f110096a = r2;
        }

        public final String a() {
            return this.f110096a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C0985a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f110096a, ((C0985a) r4).f110096a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f110096a.hashCode();
        }

        public String toString() {
            return "AuthRequired(errorType=" + this.f110096a + ')';
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f110097a;

        static {
        }

        public b(String r2) {
            p.l(r2, "message");
            super(null);
            this.f110097a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f110097a, ((b) r4).f110097a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f110097a.hashCode();
        }

        public String toString() {
            return "DayTradeExceedTimeLimit(message=" + this.f110097a + ')';
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f110098a;

        static {
        }

        public c(String r2) {
            p.l(r2, "message");
            super(null);
            this.f110098a = r2;
        }

        public final String a() {
            return this.f110098a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f110098a, ((c) r4).f110098a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f110098a.hashCode();
        }

        public String toString() {
            return "Error(message=" + this.f110098a + ')';
        }
    }

    public static final class d extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f110099a;

        static {
        }

        public d(String r2) {
            p.l(r2, "message");
            super(null);
            this.f110099a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof d) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f110099a, ((d) r4).f110099a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f110099a.hashCode();
        }

        public String toString() {
            return "FullyMatchedError(message=" + this.f110099a + ')';
        }
    }

    public static final class e extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final e f110100a = null;

        static {
            f110100a = new e();
        }

        public e() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof e) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 1183576080;
        }

        public String toString() {
            return "Initial";
        }
    }

    public static final class f extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final f f110101a = null;

        static {
            f110101a = new f();
        }

        public f() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof f) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -428115448;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class g extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f110102a;

        static {
        }

        public g(String r2) {
            p.l(r2, "message");
            super(null);
            this.f110102a = r2;
        }

        public final String a() {
            return this.f110102a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof g) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f110102a, ((g) r4).f110102a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f110102a.hashCode();
        }

        public String toString() {
            return "NonCancellationError(message=" + this.f110102a + ')';
        }
    }

    public static final class h extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f110103a;

        static {
        }

        public h(String r2) {
            p.l(r2, "message");
            super(null);
            this.f110103a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof h) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f110103a, ((h) r4).f110103a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f110103a.hashCode();
        }

        public String toString() {
            return "PriceOrQuantityNotChanged(message=" + this.f110103a + ')';
        }
    }

    public static final class i extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f110104a;

        static {
        }

        public i(String r2) {
            p.l(r2, "message");
            super(null);
            this.f110104a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof i) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f110104a, ((i) r4).f110104a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f110104a.hashCode();
        }

        public String toString() {
            return "Success(message=" + this.f110104a + ')';
        }
    }

    public static final class j extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f110105a;

        /* renamed from: b, reason: collision with root package name */
        public final DomainSecuritiesError f110106b;

        static {
        }

        public j(String r2, DomainSecuritiesError r3) {
            p.l(r2, "message");
            p.l(r3, "type");
            super(null);
            this.f110105a = r2;
            this.f110106b = r3;
        }

        public final String a() {
            return this.f110105a;
        }

        public final DomainSecuritiesError b() {
            return this.f110106b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof j) == true) goto L8;
            return false;
        L8:
            j r52 = (j) r5;
            if (p.g(this.f110105a, r52.f110105a) == true) goto L12;
            return false;
        L12:
            if (this.f110106b == r52.f110106b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f110105a.hashCode() * 31) + this.f110106b.hashCode();
        }

        public String toString() {
            return "SuspendedOrDefaultError(message=" + this.f110105a + ", type=" + this.f110106b + ')';
        }
    }

    static {
    }

    public /* synthetic */ a(kotlin.jvm.internal.i r1) {
        this();
    }

    public a() {
    }
}

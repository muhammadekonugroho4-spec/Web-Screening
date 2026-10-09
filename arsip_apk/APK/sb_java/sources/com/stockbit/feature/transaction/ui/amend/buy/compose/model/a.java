package com.stockbit.feature.transaction.ui.amend.buy.compose.model;

import com.stockbit.features.model.DomainSecuritiesError;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public abstract class a {

    /* renamed from: com.stockbit.feature.transaction.ui.amend.buy.compose.model.a$a, reason: collision with other inner class name */
    public static final class C0975a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f109178a;

        static {
        }

        public C0975a(String r2) {
            p.l(r2, "errorType");
            super(null);
            this.f109178a = r2;
        }

        public final String a() {
            return this.f109178a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C0975a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f109178a, ((C0975a) r4).f109178a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f109178a.hashCode();
        }

        public String toString() {
            return "AuthRequired(errorType=" + this.f109178a + ')';
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f109179a;

        static {
        }

        public b(String r2) {
            p.l(r2, "message");
            super(null);
            this.f109179a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f109179a, ((b) r4).f109179a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f109179a.hashCode();
        }

        public String toString() {
            return "DayTradeExceedTimeLimit(message=" + this.f109179a + ')';
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f109180a;

        static {
        }

        public c(String r2) {
            p.l(r2, "message");
            super(null);
            this.f109180a = r2;
        }

        public final String a() {
            return this.f109180a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f109180a, ((c) r4).f109180a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f109180a.hashCode();
        }

        public String toString() {
            return "Error(message=" + this.f109180a + ')';
        }
    }

    public static final class d extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f109181a;

        static {
        }

        public d(String r2) {
            p.l(r2, "message");
            super(null);
            this.f109181a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof d) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f109181a, ((d) r4).f109181a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f109181a.hashCode();
        }

        public String toString() {
            return "FullyMatchedError(message=" + this.f109181a + ')';
        }
    }

    public static final class e extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final e f109182a = null;

        static {
            f109182a = new e();
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
            return 1702838188;
        }

        public String toString() {
            return "Initial";
        }
    }

    public static final class f extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final f f109183a = null;

        static {
            f109183a = new f();
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
            return 91146660;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class g extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f109184a;

        static {
        }

        public g(String r2) {
            p.l(r2, "message");
            super(null);
            this.f109184a = r2;
        }

        public final String a() {
            return this.f109184a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof g) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f109184a, ((g) r4).f109184a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f109184a.hashCode();
        }

        public String toString() {
            return "NonCancellationError(message=" + this.f109184a + ')';
        }
    }

    public static final class h extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f109185a;

        static {
        }

        public h(String r2) {
            p.l(r2, "message");
            super(null);
            this.f109185a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof h) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f109185a, ((h) r4).f109185a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f109185a.hashCode();
        }

        public String toString() {
            return "PriceOrQuantityNotChanged(message=" + this.f109185a + ')';
        }
    }

    public static final class i extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f109186a;

        static {
        }

        public i(String r2) {
            p.l(r2, "message");
            super(null);
            this.f109186a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof i) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f109186a, ((i) r4).f109186a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f109186a.hashCode();
        }

        public String toString() {
            return "Success(message=" + this.f109186a + ')';
        }
    }

    public static final class j extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f109187a;

        /* renamed from: b, reason: collision with root package name */
        public final DomainSecuritiesError f109188b;

        static {
        }

        public j(String r2, DomainSecuritiesError r3) {
            p.l(r2, "message");
            p.l(r3, "type");
            super(null);
            this.f109187a = r2;
            this.f109188b = r3;
        }

        public final String a() {
            return this.f109187a;
        }

        public final DomainSecuritiesError b() {
            return this.f109188b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof j) == true) goto L8;
            return false;
        L8:
            j r52 = (j) r5;
            if (p.g(this.f109187a, r52.f109187a) == true) goto L12;
            return false;
        L12:
            if (this.f109188b == r52.f109188b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f109187a.hashCode() * 31) + this.f109188b.hashCode();
        }

        public String toString() {
            return "SuspendedOrDefaultError(message=" + this.f109187a + ", type=" + this.f109188b + ')';
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

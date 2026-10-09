package com.stockbit.feature.order.ui.detailnego.component;

/* loaded from: classes9.dex */
public abstract class i {

    public static final class a extends i {

        /* renamed from: a, reason: collision with root package name */
        public final kotlin.jvm.functions.a f101573a;

        static {
        }

        public a(kotlin.jvm.functions.a r2) {
            kotlin.jvm.internal.p.l(r2, "onAbort");
            super(null);
            this.f101573a = r2;
        }

        public final kotlin.jvm.functions.a a() {
            return this.f101573a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f101573a, ((a) r4).f101573a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f101573a.hashCode();
        }

        public String toString() {
            return "AbortMatchingPendingOrder(onAbort=" + this.f101573a + ')';
        }
    }

    public static final class b extends i {

        /* renamed from: a, reason: collision with root package name */
        public final kotlin.jvm.functions.a f101574a;

        static {
        }

        public b(kotlin.jvm.functions.a r2) {
            kotlin.jvm.internal.p.l(r2, "onAbort");
            super(null);
            this.f101574a = r2;
        }

        public final kotlin.jvm.functions.a a() {
            return this.f101574a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f101574a, ((b) r4).f101574a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f101574a.hashCode();
        }

        public String toString() {
            return "AbortRequestCancelOrder(onAbort=" + this.f101574a + ')';
        }
    }

    public static final class c extends i {

        /* renamed from: a, reason: collision with root package name */
        public final kotlin.jvm.functions.a f101575a;

        /* renamed from: b, reason: collision with root package name */
        public final kotlin.jvm.functions.a f101576b;

        static {
        }

        public c(kotlin.jvm.functions.a r2, kotlin.jvm.functions.a r3) {
            kotlin.jvm.internal.p.l(r2, "onReject");
            kotlin.jvm.internal.p.l(r3, "onApprove");
            super(null);
            this.f101575a = r2;
            this.f101576b = r3;
        }

        public final kotlin.jvm.functions.a a() {
            return this.f101576b;
        }

        public final kotlin.jvm.functions.a b() {
            return this.f101575a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (kotlin.jvm.internal.p.g(this.f101575a, r52.f101575a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f101576b, r52.f101576b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f101575a.hashCode() * 31) + this.f101576b.hashCode();
        }

        public String toString() {
            return "HandleMatchingPendingOrder(onReject=" + this.f101575a + ", onApprove=" + this.f101576b + ')';
        }
    }

    public static final class d extends i {

        /* renamed from: a, reason: collision with root package name */
        public final kotlin.jvm.functions.a f101577a;

        /* renamed from: b, reason: collision with root package name */
        public final kotlin.jvm.functions.a f101578b;

        static {
        }

        public d(kotlin.jvm.functions.a r2, kotlin.jvm.functions.a r3) {
            kotlin.jvm.internal.p.l(r2, "onReject");
            kotlin.jvm.internal.p.l(r3, "onAccept");
            super(null);
            this.f101577a = r2;
            this.f101578b = r3;
        }

        public final kotlin.jvm.functions.a a() {
            return this.f101578b;
        }

        public final kotlin.jvm.functions.a b() {
            return this.f101577a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof d) == true) goto L8;
            return false;
        L8:
            d r52 = (d) r5;
            if (kotlin.jvm.internal.p.g(this.f101577a, r52.f101577a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f101578b, r52.f101578b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f101577a.hashCode() * 31) + this.f101578b.hashCode();
        }

        public String toString() {
            return "HandleRequestCancelOrder(onReject=" + this.f101577a + ", onAccept=" + this.f101578b + ')';
        }
    }

    public static final class e extends i {

        /* renamed from: a, reason: collision with root package name */
        public static final e f101579a = null;

        static {
            f101579a = new e();
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
            return -139633395;
        }

        public String toString() {
            return "NoAction";
        }
    }

    public static final class f extends i {

        /* renamed from: a, reason: collision with root package name */
        public final kotlin.jvm.functions.a f101580a;

        static {
        }

        public f(kotlin.jvm.functions.a r2) {
            kotlin.jvm.internal.p.l(r2, "onRequest");
            super(null);
            this.f101580a = r2;
        }

        public final kotlin.jvm.functions.a a() {
            return this.f101580a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof f) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f101580a, ((f) r4).f101580a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f101580a.hashCode();
        }

        public String toString() {
            return "RequestCancelOrder(onRequest=" + this.f101580a + ')';
        }
    }

    static {
    }

    public /* synthetic */ i(kotlin.jvm.internal.i r1) {
        this();
    }

    public i() {
    }
}

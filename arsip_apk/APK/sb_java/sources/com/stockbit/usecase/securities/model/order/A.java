package com.stockbit.usecase.securities.model.order;

import com.clevertap.android.sdk.Constants;

/* loaded from: classes2.dex */
public abstract class A {

    public static final class a extends A {

        /* renamed from: a, reason: collision with root package name */
        public final OrderActionType f160884a;

        public a(OrderActionType r2) {
            kotlin.jvm.internal.p.l(r2, Constants.KEY_ACTION);
            super(null);
            this.f160884a = r2;
        }

        public final OrderActionType a() {
            return this.f160884a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (this.f160884a == ((a) r4).f160884a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f160884a.hashCode();
        }

        public String toString() {
            return "Action(action=" + this.f160884a + ")";
        }
    }

    public static final class b extends A {

        /* renamed from: a, reason: collision with root package name */
        public final OrderActionType f160885a;

        /* renamed from: b, reason: collision with root package name */
        public final String f160886b;

        public b(OrderActionType r2, String r3) {
            kotlin.jvm.internal.p.l(r2, Constants.KEY_ACTION);
            kotlin.jvm.internal.p.l(r3, "symbol");
            super(null);
            this.f160885a = r2;
            this.f160886b = r3;
        }

        public final OrderActionType a() {
            return this.f160885a;
        }

        public final String b() {
            return this.f160886b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (this.f160885a == r52.f160885a) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f160886b, r52.f160886b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f160885a.hashCode() * 31) + this.f160886b.hashCode();
        }

        public String toString() {
            return "ActionAndSymbol(action=" + this.f160885a + ", symbol=" + this.f160886b + ")";
        }
    }

    public static final class c extends A {

        /* renamed from: a, reason: collision with root package name */
        public static final c f160887a = null;

        static {
            f160887a = new c();
        }

        public c() {
            super(null);
        }
    }

    public static final class d extends A {

        /* renamed from: a, reason: collision with root package name */
        public final String f160888a;

        public d(String r2) {
            kotlin.jvm.internal.p.l(r2, "symbol");
            super(null);
            this.f160888a = r2;
        }

        public final String a() {
            return this.f160888a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof d) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f160888a, ((d) r4).f160888a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f160888a.hashCode();
        }

        public String toString() {
            return "Symbol(symbol=" + this.f160888a + ")";
        }
    }

    public /* synthetic */ A(kotlin.jvm.internal.i r1) {
        this();
    }

    public A() {
    }
}

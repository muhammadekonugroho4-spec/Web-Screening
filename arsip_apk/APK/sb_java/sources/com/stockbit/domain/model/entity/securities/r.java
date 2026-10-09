package com.stockbit.domain.model.entity.securities;

import com.clevertap.android.sdk.Constants;

/* loaded from: classes8.dex */
public abstract class r {

    public static final class a extends r {

        /* renamed from: a, reason: collision with root package name */
        public final OrderActionType f83520a;

        public a(OrderActionType r2) {
            kotlin.jvm.internal.p.l(r2, Constants.KEY_ACTION);
            super(null);
            this.f83520a = r2;
        }

        public final OrderActionType a() {
            return this.f83520a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (this.f83520a == ((a) r4).f83520a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f83520a.hashCode();
        }

        public String toString() {
            return "Action(action=" + this.f83520a + ')';
        }
    }

    public static final class b extends r {

        /* renamed from: a, reason: collision with root package name */
        public final OrderActionType f83521a;

        /* renamed from: b, reason: collision with root package name */
        public final String f83522b;

        public b(OrderActionType r2, String r3) {
            kotlin.jvm.internal.p.l(r2, Constants.KEY_ACTION);
            kotlin.jvm.internal.p.l(r3, "symbol");
            super(null);
            this.f83521a = r2;
            this.f83522b = r3;
        }

        public final OrderActionType a() {
            return this.f83521a;
        }

        public final String b() {
            return this.f83522b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (this.f83521a == r52.f83521a) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f83522b, r52.f83522b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f83521a.hashCode() * 31) + this.f83522b.hashCode();
        }

        public String toString() {
            return "ActionAndSymbol(action=" + this.f83521a + ", symbol=" + this.f83522b + ')';
        }
    }

    public static final class c extends r {

        /* renamed from: a, reason: collision with root package name */
        public static final c f83523a = null;

        static {
            f83523a = new c();
        }

        public c() {
            super(null);
        }
    }

    public static final class d extends r {

        /* renamed from: a, reason: collision with root package name */
        public final String f83524a;

        public d(String r2) {
            kotlin.jvm.internal.p.l(r2, "symbol");
            super(null);
            this.f83524a = r2;
        }

        public final String a() {
            return this.f83524a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof d) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f83524a, ((d) r4).f83524a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f83524a.hashCode();
        }

        public String toString() {
            return "Symbol(symbol=" + this.f83524a + ')';
        }
    }

    public /* synthetic */ r(kotlin.jvm.internal.i r1) {
        this();
    }

    public r() {
    }
}

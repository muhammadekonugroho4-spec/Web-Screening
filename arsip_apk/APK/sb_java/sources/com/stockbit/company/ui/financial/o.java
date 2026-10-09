package com.stockbit.company.ui.financial;

import java.util.List;

/* loaded from: classes7.dex */
public abstract class o {

    public static final class a extends o {

        /* renamed from: a, reason: collision with root package name */
        public final int f65875a;

        /* renamed from: b, reason: collision with root package name */
        public final List f65876b;

        /* renamed from: c, reason: collision with root package name */
        public final List f65877c;

        static {
        }

        public a(int r2, List r3, List r4) {
            kotlin.jvm.internal.p.l(r3, "childHeaderRows");
            kotlin.jvm.internal.p.l(r4, "childCellRows");
            super(null);
            this.f65875a = r2;
            this.f65876b = r3;
            this.f65877c = r4;
        }

        public final List a() {
            return this.f65877c;
        }

        public final List b() {
            return this.f65876b;
        }

        public final int c() {
            return this.f65875a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (this.f65875a == r52.f65875a) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f65876b, r52.f65876b) == true) goto L15;
            return false;
        L15:
            if (kotlin.jvm.internal.p.g(this.f65877c, r52.f65877c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f65875a) * 31) + this.f65876b.hashCode()) * 31) + this.f65877c.hashCode();
        }

        public String toString() {
            return "OnAddRowRangeTable(rowPosition=" + this.f65875a + ", childHeaderRows=" + this.f65876b + ", childCellRows=" + this.f65877c + ')';
        }
    }

    public static final class b extends o {

        /* renamed from: a, reason: collision with root package name */
        public final int f65878a;

        /* renamed from: b, reason: collision with root package name */
        public final int f65879b;

        static {
        }

        public b(int r2, int r3) {
            super(null);
            this.f65878a = r2;
            this.f65879b = r3;
        }

        public final int a() {
            return this.f65879b;
        }

        public final int b() {
            return this.f65878a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (this.f65878a == r52.f65878a) goto L12;
            return false;
        L12:
            if (this.f65879b == r52.f65879b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f65878a) * 31) + Integer.hashCode(this.f65879b);
        }

        public String toString() {
            return "OnRemoveRowRangeTable(rowPosition=" + this.f65878a + ", counter=" + this.f65879b + ')';
        }
    }

    static {
    }

    public /* synthetic */ o(kotlin.jvm.internal.i r1) {
        this();
    }

    public o() {
    }
}

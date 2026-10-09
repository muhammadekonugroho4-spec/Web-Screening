package com.stockbit.usecase.securities.param;

import com.stockbit.usecase.securities.model.PeriodType;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public interface h {

    public static final class a implements h {

        /* renamed from: a, reason: collision with root package name */
        public final String f161970a;

        /* renamed from: b, reason: collision with root package name */
        public final String f161971b;

        public a(String r2, String r3) {
            p.l(r2, "start");
            p.l(r3, "end");
            this.f161970a = r2;
            this.f161971b = r3;
        }

        public final String a() {
            return this.f161971b;
        }

        public final String b() {
            return this.f161970a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (p.g(this.f161970a, r52.f161970a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f161971b, r52.f161971b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f161970a.hashCode() * 31) + this.f161971b.hashCode();
        }

        public String toString() {
            return "PeriodCustom(start=" + this.f161970a + ", end=" + this.f161971b + ")";
        }
    }

    public static final class b implements h {

        /* renamed from: a, reason: collision with root package name */
        public final PeriodType f161972a;

        public b(PeriodType r2) {
            p.l(r2, "period");
            this.f161972a = r2;
        }

        public final PeriodType a() {
            return this.f161972a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (this.f161972a == ((b) r4).f161972a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f161972a.hashCode();
        }

        public String toString() {
            return "PeriodFixed(period=" + this.f161972a + ")";
        }
    }
}

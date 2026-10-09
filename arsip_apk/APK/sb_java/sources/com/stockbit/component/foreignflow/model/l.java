package com.stockbit.component.foreignflow.model;

import java.time.LocalDate;

/* loaded from: classes7.dex */
public interface l {

    public static final class a implements l {

        /* renamed from: a, reason: collision with root package name */
        public final LocalDate f71976a;

        /* renamed from: b, reason: collision with root package name */
        public final LocalDate f71977b;

        static {
        }

        public a(LocalDate r2, LocalDate r3) {
            kotlin.jvm.internal.p.l(r2, "anchorDate");
            kotlin.jvm.internal.p.l(r3, "lastAvailableDate");
            this.f71976a = r2;
            this.f71977b = r3;
        }

        public static /* synthetic */ a b(a r02, LocalDate r1, LocalDate r2, int r3, Object r4) {
            if ((r3 & 1) == 0) goto L6;
            r1 = r02.f71976a;
        L6:
            if ((r3 & 2) == 0) goto L9;
            r2 = r02.f71977b;
        L9:
            return r02.a(r1, r2);
        }

        public final a a(LocalDate r2, LocalDate r3) {
            kotlin.jvm.internal.p.l(r2, "anchorDate");
            kotlin.jvm.internal.p.l(r3, "lastAvailableDate");
            return new a(r2, r3);
        }

        public final LocalDate c() {
            return this.f71976a;
        }

        public final LocalDate d() {
            return this.f71977b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (kotlin.jvm.internal.p.g(this.f71976a, r52.f71976a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f71977b, r52.f71977b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f71976a.hashCode() * 31) + this.f71977b.hashCode();
        }

        public String toString() {
            return "Bounded(anchorDate=" + this.f71976a + ", lastAvailableDate=" + this.f71977b + ')';
        }

        public /* synthetic */ a(LocalDate r1, LocalDate r2, int r3, kotlin.jvm.internal.i r4) {
            if ((r3 & 1) == 0) goto L6;
            r1 = LocalDate.MIN;
            kotlin.jvm.internal.p.k(r1, "MIN");
        L6:
            if ((r3 & 2) == 0) goto L8;
            r2 = r1;
        L8:
            this(r1, r2);
        }
    }

    public static final class b implements l {

        /* renamed from: a, reason: collision with root package name */
        public final LocalDate f71978a;

        static {
        }

        public b(LocalDate r2) {
            kotlin.jvm.internal.p.l(r2, "anchorDate");
            this.f71978a = r2;
        }

        public final b a(LocalDate r2) {
            kotlin.jvm.internal.p.l(r2, "anchorDate");
            return new b(r2);
        }

        public final LocalDate b() {
            return this.f71978a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f71978a, ((b) r4).f71978a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f71978a.hashCode();
        }

        public String toString() {
            return "PreviousOnly(anchorDate=" + this.f71978a + ')';
        }
    }

    public static final class c implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final c f71979a = null;

        static {
            f71979a = new c();
        }

        public c() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof c) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -566860211;
        }

        public String toString() {
            return "Unavailable";
        }
    }
}

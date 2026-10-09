package com.stockbit.usecase.company.model.tradebook;

import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class d {

    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        public final List f156623a;

        public a(List r2) {
            p.l(r2, "excludes");
            super(null);
            this.f156623a = r2;
        }

        public final a a(List r2) {
            p.l(r2, "excludes");
            return new a(r2);
        }

        public final List b() {
            return this.f156623a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f156623a, ((a) r4).f156623a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f156623a.hashCode();
        }

        public String toString() {
            return "Chart(excludes=" + this.f156623a + ")";
        }
    }

    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        public final List f156624a;

        public b(List r2) {
            p.l(r2, "columns");
            super(null);
            this.f156624a = r2;
        }

        public final b a(List r2) {
            p.l(r2, "columns");
            return new b(r2);
        }

        public final List b() {
            return this.f156624a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f156624a, ((b) r4).f156624a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f156624a.hashCode();
        }

        public String toString() {
            return "Price(columns=" + this.f156624a + ")";
        }
    }

    public /* synthetic */ d(i r1) {
        this();
    }

    public d() {
    }
}

package com.stockbit.search.ui.catalog.sort;

import kotlin.jvm.internal.i;

/* loaded from: classes11.dex */
public abstract class f {

    public static final class a extends f {

        /* renamed from: a, reason: collision with root package name */
        public final int f133989a;

        static {
        }

        public a(int r2) {
            super(null);
            this.f133989a = r2;
        }

        public final int a() {
            return this.f133989a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (this.f133989a == ((a) r4).f133989a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Integer.hashCode(this.f133989a);
        }

        public String toString() {
            return "SortData(chosenSort=" + this.f133989a + ')';
        }
    }

    static {
    }

    public /* synthetic */ f(i r1) {
        this();
    }

    public f() {
    }
}

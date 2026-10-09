package com.stockbit.company.ui.seasonality.latestyear;

import kotlin.jvm.internal.i;

/* loaded from: classes7.dex */
public abstract class e {

    public static final class a extends e {

        /* renamed from: a, reason: collision with root package name */
        public final int f68097a;

        static {
        }

        public a(int r2) {
            super(null);
            this.f68097a = r2;
        }

        public final int a() {
            return this.f68097a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (this.f68097a == ((a) r4).f68097a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Integer.hashCode(this.f68097a);
        }

        public String toString() {
            return "Done(selectedYear=" + this.f68097a + ')';
        }
    }

    static {
    }

    public /* synthetic */ e(i r1) {
        this();
    }

    public e() {
    }
}

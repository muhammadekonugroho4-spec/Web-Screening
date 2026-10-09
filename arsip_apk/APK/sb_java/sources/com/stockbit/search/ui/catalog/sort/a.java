package com.stockbit.search.ui.catalog.sort;

import kotlin.jvm.internal.i;

/* loaded from: classes11.dex */
public abstract class a {

    /* renamed from: com.stockbit.search.ui.catalog.sort.a$a, reason: collision with other inner class name */
    public static final class C1205a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final int f133983a;

        static {
        }

        public C1205a(int r2) {
            super(null);
            this.f133983a = r2;
        }

        public final int a() {
            return this.f133983a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1205a) == true) goto L9;
            return false;
        L9:
            if (this.f133983a == ((C1205a) r4).f133983a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Integer.hashCode(this.f133983a);
        }

        public String toString() {
            return "OnChoiceSelected(chosenSort=" + this.f133983a + ')';
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f133984a = null;

        static {
            f133984a = new b();
        }

        public b() {
            super(null);
        }
    }

    static {
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}

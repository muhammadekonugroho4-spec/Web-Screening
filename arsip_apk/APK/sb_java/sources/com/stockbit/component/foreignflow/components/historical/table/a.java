package com.stockbit.component.foreignflow.components.historical.table;

import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f71717a;

    /* renamed from: b, reason: collision with root package name */
    public final float f71718b;

    /* renamed from: com.stockbit.component.foreignflow.components.historical.table.a$a, reason: collision with other inner class name */
    public static final class C0711a extends a {

        /* renamed from: c, reason: collision with root package name */
        public static final C0711a f71719c = null;

        static {
            f71719c = new C0711a();
        }

        public C0711a() {
            super(com.stockbit.component.foreignflow.n.f72000B, androidx.compose.ui.unit.i.h(152), null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C0711a) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -1396775303;
        }

        public String toString() {
            return "ForeignDomestic";
        }
    }

    public static final class b extends a {

        /* renamed from: c, reason: collision with root package name */
        public final kotlin.jvm.functions.l f71720c;

        static {
        }

        public /* synthetic */ b(int r1, float r2, kotlin.jvm.functions.l r3, kotlin.jvm.internal.i r4) {
            this(r1, r2, r3);
        }

        public final kotlin.jvm.functions.l c() {
            return this.f71720c;
        }

        public b(int r2, float r3, kotlin.jvm.functions.l r4) {
            p.l(r4, "selector");
            super(r2, r3, null);
            this.f71720c = r4;
        }
    }

    public static final class c extends a {

        /* renamed from: c, reason: collision with root package name */
        public final kotlin.jvm.functions.l f71721c;

        static {
        }

        public /* synthetic */ c(int r1, float r2, kotlin.jvm.functions.l r3, kotlin.jvm.internal.i r4) {
            this(r1, r2, r3);
        }

        public final kotlin.jvm.functions.l c() {
            return this.f71721c;
        }

        public c(int r2, float r3, kotlin.jvm.functions.l r4) {
            p.l(r4, "selector");
            super(r2, r3, null);
            this.f71721c = r4;
        }
    }

    public /* synthetic */ a(int r1, float r2, kotlin.jvm.internal.i r3) {
        this(r1, r2);
    }

    public final int a() {
        return this.f71717a;
    }

    public final float b() {
        return this.f71718b;
    }

    public a(int r1, float r2) {
        this.f71717a = r1;
        this.f71718b = r2;
    }
}

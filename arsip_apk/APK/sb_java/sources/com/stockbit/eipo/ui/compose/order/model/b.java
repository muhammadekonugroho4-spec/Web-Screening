package com.stockbit.eipo.ui.compose.order.model;

import kotlin.jvm.internal.i;

/* loaded from: classes8.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f90510a;

    public static final class a extends b {

        /* renamed from: b, reason: collision with root package name */
        public static final a f90511b = null;

        static {
            f90511b = new a();
        }

        public a() {
            super(2, null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof a) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -1298854326;
        }

        public String toString() {
            return "Finish";
        }
    }

    /* renamed from: com.stockbit.eipo.ui.compose.order.model.b$b, reason: collision with other inner class name */
    public static final class C0862b extends b {

        /* renamed from: b, reason: collision with root package name */
        public static final C0862b f90512b = null;

        static {
            f90512b = new C0862b();
        }

        public C0862b() {
            super(0, null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C0862b) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -33328457;
        }

        public String toString() {
            return "Order";
        }
    }

    public static final class c extends b {

        /* renamed from: b, reason: collision with root package name */
        public static final c f90513b = null;

        static {
            f90513b = new c();
        }

        public c() {
            super(1, null);
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
            return -958760689;
        }

        public String toString() {
            return "Review";
        }
    }

    static {
    }

    public /* synthetic */ b(int r1, i r2) {
        this(r1);
    }

    public b(int r1) {
        this.f90510a = r1;
    }
}

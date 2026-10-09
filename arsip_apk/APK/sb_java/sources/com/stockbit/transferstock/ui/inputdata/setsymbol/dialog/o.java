package com.stockbit.transferstock.ui.inputdata.setsymbol.dialog;

import com.stockbit.domain.model.valueobject.FieldValueArray;

/* loaded from: classes11.dex */
public abstract class o {

    public static final class a extends o {

        /* renamed from: a, reason: collision with root package name */
        public static final a f150961a = null;

        static {
            f150961a = new a();
        }

        public a() {
            super(null);
        }
    }

    public static final class b extends o {

        /* renamed from: a, reason: collision with root package name */
        public final FieldValueArray f150962a;

        static {
        }

        public b(FieldValueArray r2) {
            kotlin.jvm.internal.p.l(r2, "stock");
            super(null);
            this.f150962a = r2;
        }

        public final FieldValueArray a() {
            return this.f150962a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f150962a, ((b) r4).f150962a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f150962a.hashCode();
        }

        public String toString() {
            return "SaveSymbol(stock=" + this.f150962a + ')';
        }
    }

    public static final class c extends o {

        /* renamed from: a, reason: collision with root package name */
        public final int f150963a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f150964b;

        static {
        }

        public c(int r2, boolean r3) {
            super(null);
            this.f150963a = r2;
            this.f150964b = r3;
        }

        public final int a() {
            return this.f150963a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (this.f150963a == r52.f150963a) goto L12;
            return false;
        L12:
            if (this.f150964b == r52.f150964b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f150963a) * 31) + Boolean.hashCode(this.f150964b);
        }

        public String toString() {
            return "ShowTooltip(view=" + this.f150963a + ", isBottom=" + this.f150964b + ')';
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

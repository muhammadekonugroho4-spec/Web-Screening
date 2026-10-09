package com.stockbit.cashsweep.state;

import kotlin.jvm.internal.i;

/* loaded from: classes7.dex */
public abstract class d {

    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        public static final a f52004a = null;

        static {
            f52004a = new a();
        }

        public a() {
            super(null);
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
            return 362050758;
        }

        public String toString() {
            return "HideLoading";
        }
    }

    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        public static final b f52005a = null;

        static {
            f52005a = new b();
        }

        public b() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof b) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 870620843;
        }

        public String toString() {
            return "ShowLoading";
        }
    }

    static {
    }

    public /* synthetic */ d(i r1) {
        this();
    }

    public d() {
    }
}

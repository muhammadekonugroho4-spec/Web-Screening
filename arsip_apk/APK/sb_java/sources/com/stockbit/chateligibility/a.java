package com.stockbit.chateligibility;

import kotlin.jvm.internal.i;

/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: com.stockbit.chateligibility.a$a, reason: collision with other inner class name */
    public static final class C0624a extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0624a f59384a = null;

        static {
            f59384a = new C0624a();
        }

        public C0624a() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C0624a) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 1052511732;
        }

        public String toString() {
            return "HideLoading";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f59385a;

        static {
        }

        public b(boolean r2) {
            super(null);
            this.f59385a = r2;
        }

        public final boolean a() {
            return this.f59385a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (this.f59385a == ((b) r4).f59385a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f59385a);
        }

        public String toString() {
            return "OnIneligible(isSecuritiesAccount=" + this.f59385a + ')';
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f59386a = null;

        static {
            f59386a = new c();
        }

        public c() {
            super(null);
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
            return 1561081817;
        }

        public String toString() {
            return "ShowLoading";
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

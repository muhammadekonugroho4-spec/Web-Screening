package com.stockbit.usecase.exercise.model;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: com.stockbit.usecase.exercise.model.a$a, reason: collision with other inner class name */
    public static final class C1471a extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final C1471a f157604a = null;

        static {
            f157604a = new C1471a();
        }

        public C1471a() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C1471a) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 94377956;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.usecase.companyprice.model.d f157605a;

        public b(com.stockbit.usecase.companyprice.model.d r2) {
            p.l(r2, "uiState");
            super(null);
            this.f157605a = r2;
        }

        public final com.stockbit.usecase.companyprice.model.d a() {
            return this.f157605a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f157605a, ((b) r4).f157605a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f157605a.hashCode();
        }

        public String toString() {
            return "Subscribed(uiState=" + this.f157605a + ")";
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f157606a = null;

        static {
            f157606a = new c();
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
            return 703717899;
        }

        public String toString() {
            return "Unsubscribed";
        }
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}

package com.stockbit.usecase.exercise.model;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public interface b {

    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f157607a = null;

        static {
            f157607a = new a();
        }

        public a() {
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
            return 1646964267;
        }

        public String toString() {
            return "Error";
        }
    }

    /* renamed from: com.stockbit.usecase.exercise.model.b$b, reason: collision with other inner class name */
    public static final class C1472b implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final C1472b f157608a = null;

        static {
            f157608a = new C1472b();
        }

        public C1472b() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C1472b) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -294633313;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public com.stockbit.usecase.exercise.model.c f157609a;

        public c(com.stockbit.usecase.exercise.model.c r2) {
            p.l(r2, "exerciseDetailUiState");
            this.f157609a = r2;
        }

        public final com.stockbit.usecase.exercise.model.c a() {
            return this.f157609a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f157609a, ((c) r4).f157609a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f157609a.hashCode();
        }

        public String toString() {
            return "Success(exerciseDetailUiState=" + this.f157609a + ")";
        }
    }
}

package com.stockbit.usecase.exercise.model;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class e {

    public static final class a extends e {

        /* renamed from: a, reason: collision with root package name */
        public static final a f157627a = null;

        static {
            f157627a = new a();
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
            return 1174138760;
        }

        public String toString() {
            return "MinusShareValue";
        }
    }

    public static final class b extends e {

        /* renamed from: a, reason: collision with root package name */
        public static final b f157628a = null;

        static {
            f157628a = new b();
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
            return -321555419;
        }

        public String toString() {
            return "NoData";
        }
    }

    public static final class c extends e {

        /* renamed from: a, reason: collision with root package name */
        public final f f157629a;

        public c(f r2) {
            p.l(r2, "previewExerciseUiState");
            super(null);
            this.f157629a = r2;
        }

        public final f a() {
            return this.f157629a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f157629a, ((c) r4).f157629a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f157629a.hashCode();
        }

        public String toString() {
            return "Success(previewExerciseUiState=" + this.f157629a + ")";
        }
    }

    public /* synthetic */ e(i r1) {
        this();
    }

    public e() {
    }
}

package com.stockbit.feature.transaction.ui.exercise;

/* loaded from: classes9.dex */
public abstract class a {

    /* renamed from: com.stockbit.feature.transaction.ui.exercise.a$a, reason: collision with other inner class name */
    public static final class C0994a extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0994a f113529a = null;

        static {
            f113529a = new C0994a();
        }

        public C0994a() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C0994a) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -420282109;
        }

        public String toString() {
            return "HideKeyboard";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f113530a = null;

        static {
            f113530a = new b();
        }

        public b() {
            super(null);
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.usecase.exercise.model.f f113531a;

        static {
        }

        public c(com.stockbit.usecase.exercise.model.f r2) {
            kotlin.jvm.internal.p.l(r2, "previewExerciseUiState");
            super(null);
            this.f113531a = r2;
        }

        public final com.stockbit.usecase.exercise.model.f a() {
            return this.f113531a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f113531a, ((c) r4).f113531a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f113531a.hashCode();
        }

        public String toString() {
            return "NavigateToTradingConfirmation(previewExerciseUiState=" + this.f113531a + ')';
        }
    }

    public static final class d extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f113532a = null;

        static {
            f113532a = new d();
        }

        public d() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof d) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 1322081929;
        }

        public String toString() {
            return "ShowErrorExercise";
        }
    }

    static {
    }

    public /* synthetic */ a(kotlin.jvm.internal.i r1) {
        this();
    }

    public a() {
    }
}

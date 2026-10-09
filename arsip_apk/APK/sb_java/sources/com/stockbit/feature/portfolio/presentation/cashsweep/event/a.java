package com.stockbit.feature.portfolio.presentation.cashsweep.event;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public abstract class a {

    /* renamed from: com.stockbit.feature.portfolio.presentation.cashsweep.event.a$a, reason: collision with other inner class name */
    public static final class C0940a extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0940a f104942a = null;

        static {
            f104942a = new C0940a();
        }

        public C0940a() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C0940a) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -961149552;
        }

        public String toString() {
            return "AddOnBoardingBottomSheet";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f104943a = null;

        static {
            f104943a = new b();
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
            return 1444521498;
        }

        public String toString() {
            return "HideLoadingGetCashSweepStats";
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f104944a;

        static {
        }

        public c(String r2) {
            p.l(r2, "message");
            super(null);
            this.f104944a = r2;
        }

        public final String a() {
            return this.f104944a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f104944a, ((c) r4).f104944a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f104944a.hashCode();
        }

        public String toString() {
            return "OpenCashSweepEligibilityBottomSheet(message=" + this.f104944a + ')';
        }
    }

    public static final class d extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f104945a = null;

        static {
            f104945a = new d();
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
            return 178097163;
        }

        public String toString() {
            return "OpenCashSweepInProgressBottomSheet";
        }
    }

    public static final class e extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final e f104946a = null;

        static {
            f104946a = new e();
        }

        public e() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof e) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 2142124452;
        }

        public String toString() {
            return "OpenCashSweepRejectBibitBottomSheet";
        }
    }

    public static final class f extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final f f104947a = null;

        static {
            f104947a = new f();
        }

        public f() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof f) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -1972850784;
        }

        public String toString() {
            return "OpenCashSweepRejectIdentityBottomSheet";
        }
    }

    public static final class g extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final g f104948a = null;

        static {
            f104948a = new g();
        }

        public g() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof g) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -178618721;
        }

        public String toString() {
            return "OpenCashSweepShariaBottomSheet";
        }
    }

    public static final class h extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final h f104949a = null;

        static {
            f104949a = new h();
        }

        public h() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof h) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -713039147;
        }

        public String toString() {
            return "ShowLoadingGetCashSweepStats";
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

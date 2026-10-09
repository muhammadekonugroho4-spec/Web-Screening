package com.stockbit.feature.verification.model;

import com.stockbit.verification.contract.model.CancelledReason;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public interface a {

    /* renamed from: com.stockbit.feature.verification.model.a$a, reason: collision with other inner class name */
    public static final class C1029a implements a {

        /* renamed from: a, reason: collision with root package name */
        public final CancelledReason f118876a;

        static {
        }

        public C1029a(CancelledReason r2) {
            p.l(r2, "reason");
            this.f118876a = r2;
        }

        public final CancelledReason a() {
            return this.f118876a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1029a) == true) goto L9;
            return false;
        L9:
            if (this.f118876a == ((C1029a) r4).f118876a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f118876a.hashCode();
        }

        public String toString() {
            return "Cancelled(reason=" + this.f118876a + ')';
        }
    }

    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f118877a = null;

        static {
            f118877a = new b();
        }

        public b() {
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
            return 1789958480;
        }

        public String toString() {
            return "Failed";
        }
    }

    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f118878a = null;

        static {
            f118878a = new c();
        }

        public c() {
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
            return -1212967246;
        }

        public String toString() {
            return "InvalidSession";
        }
    }

    public static final class d implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f118879a = null;

        static {
            f118879a = new d();
        }

        public d() {
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
            return -1126441648;
        }

        public String toString() {
            return "Success";
        }
    }
}

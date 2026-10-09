package com.stockbit.lib.pocket.flipt.domain;

import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public interface a {

    /* renamed from: com.stockbit.lib.pocket.flipt.domain.a$a, reason: collision with other inner class name */
    public static final class C1041a implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final C1041a f120360a = null;

        static {
            f120360a = new C1041a();
        }

        public C1041a() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C1041a) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 393042230;
        }

        public String toString() {
            return "Empty";
        }
    }

    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public final String f120361a;

        public b(String r1) {
            this.f120361a = r1;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f120361a, ((b) r4).f120361a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            String r02 = this.f120361a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f120361a + ")";
        }
    }

    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f120362a;

        public c(Object r1) {
            this.f120362a = r1;
        }

        public final Object a() {
            return this.f120362a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f120362a, ((c) r4).f120362a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            Object r02 = this.f120362a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f120362a + ")";
        }
    }
}

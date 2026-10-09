package com.stockbit.usecase.personalamend.resource.changedata;

import com.stockbit.usecase.personalamend.model.m;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public interface e {

    public static final class a implements e {

        /* renamed from: a, reason: collision with root package name */
        public final m f159125a;

        public a(m r2) {
            p.l(r2, "uiState");
            this.f159125a = r2;
        }

        public final m a() {
            return this.f159125a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f159125a, ((a) r4).f159125a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f159125a.hashCode();
        }

        public String toString() {
            return "Error(uiState=" + this.f159125a + ")";
        }
    }

    public static final class b implements e {

        /* renamed from: a, reason: collision with root package name */
        public static final b f159126a = null;

        static {
            f159126a = new b();
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
            return -695679935;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c implements e {

        /* renamed from: a, reason: collision with root package name */
        public static final c f159127a = null;

        static {
            f159127a = new c();
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
            return 1395467016;
        }

        public String toString() {
            return "Success";
        }
    }
}

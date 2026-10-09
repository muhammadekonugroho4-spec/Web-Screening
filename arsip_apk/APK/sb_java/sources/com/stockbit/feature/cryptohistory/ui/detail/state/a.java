package com.stockbit.feature.cryptohistory.ui.detail.state;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public interface a {

    /* renamed from: com.stockbit.feature.cryptohistory.ui.detail.state.a$a, reason: collision with other inner class name */
    public static final class C0888a implements a {

        /* renamed from: a, reason: collision with root package name */
        public final f f93781a;

        static {
        }

        public C0888a(f r2) {
            p.l(r2, "section");
            this.f93781a = r2;
        }

        public final f a() {
            return this.f93781a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C0888a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f93781a, ((C0888a) r4).f93781a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f93781a.hashCode();
        }

        public String toString() {
            return "Order(section=" + this.f93781a + ')';
        }
    }

    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public final List f93782a;

        static {
        }

        public b(List r2) {
            p.l(r2, "rows");
            this.f93782a = r2;
        }

        public final List a() {
            return this.f93782a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f93782a, ((b) r4).f93782a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f93782a.hashCode();
        }

        public String toString() {
            return "Rows(rows=" + this.f93782a + ')';
        }
    }
}

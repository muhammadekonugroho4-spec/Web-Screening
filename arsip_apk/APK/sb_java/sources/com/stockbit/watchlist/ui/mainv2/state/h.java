package com.stockbit.watchlist.ui.mainv2.state;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;

/* loaded from: classes2.dex */
public interface h {

    public static final class a implements h {

        /* renamed from: a, reason: collision with root package name */
        public static final a f170951a = null;

        static {
            f170951a = new a();
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
            return 226432730;
        }

        public String toString() {
            return "Empty";
        }
    }

    public static final class b implements h {

        /* renamed from: a, reason: collision with root package name */
        public static final b f170952a = null;

        static {
            f170952a = new b();
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
            return 518996873;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c implements h {

        /* renamed from: a, reason: collision with root package name */
        public final List f170953a;

        static {
        }

        public c(List r2) {
            kotlin.jvm.internal.p.l(r2, FirebaseAnalytics.Param.ITEMS);
            this.f170953a = r2;
        }

        public final List a() {
            return this.f170953a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f170953a, ((c) r4).f170953a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f170953a.hashCode();
        }

        public String toString() {
            return "Success(items=" + this.f170953a + ')';
        }
    }
}

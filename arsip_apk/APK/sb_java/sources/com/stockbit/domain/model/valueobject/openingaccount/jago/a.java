package com.stockbit.domain.model.valueobject.openingaccount.jago;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public abstract class a {

    /* renamed from: com.stockbit.domain.model.valueobject.openingaccount.jago.a$a, reason: collision with other inner class name */
    public static final class C0804a extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0804a f86910a = null;

        static {
            f86910a = new C0804a();
        }

        public C0804a() {
            super(null);
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final a f86911a;

        public b(a r2) {
            p.l(r2, Constants.KEY_ACTION);
            super(null);
            this.f86911a = r2;
        }

        public final a a() {
            return this.f86911a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f86911a, ((b) r4).f86911a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f86911a.hashCode();
        }

        public String toString() {
            return "OpenJagoShariaBenefit(action=" + this.f86911a + ')';
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f86912a = null;

        static {
            f86912a = new c();
        }

        public c() {
            super(null);
        }
    }

    public static final class d extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f86913a;

        public d(String r2) {
            p.l(r2, "url");
            super(null);
            this.f86913a = r2;
        }

        public final String a() {
            return this.f86913a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof d) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f86913a, ((d) r4).f86913a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f86913a.hashCode();
        }

        public String toString() {
            return "Webview(url=" + this.f86913a + ')';
        }
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}

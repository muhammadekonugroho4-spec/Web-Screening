package com.stockbit.usecase.search.model.nego;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: com.stockbit.usecase.search.model.nego.a$a, reason: collision with other inner class name */
    public static final class C1604a extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final C1604a f160036a = null;

        static {
            f160036a = new C1604a();
        }

        public C1604a() {
            super(null);
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f160037a;

        public b(String r2) {
            p.l(r2, "originalSymbol");
            super(null);
            this.f160037a = r2;
        }

        public final String a() {
            return this.f160037a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f160037a, ((b) r4).f160037a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f160037a.hashCode();
        }

        public String toString() {
            return "Delete(originalSymbol=" + this.f160037a + ")";
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.usecase.search.model.nego.b f160038a;

        public c(com.stockbit.usecase.search.model.nego.b r2) {
            p.l(r2, "item");
            super(null);
            this.f160038a = r2;
        }

        public final com.stockbit.usecase.search.model.nego.b a() {
            return this.f160038a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f160038a, ((c) r4).f160038a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f160038a.hashCode();
        }

        public String toString() {
            return "Save(item=" + this.f160038a + ")";
        }
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}

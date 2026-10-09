package com.stockbit.usecase.foreignflow.resource;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: com.stockbit.usecase.foreignflow.resource.a$a, reason: collision with other inner class name */
    public static final class C1491a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f157925a;

        public C1491a(String r2) {
            p.l(r2, "message");
            super(null);
            this.f157925a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1491a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f157925a, ((C1491a) r4).f157925a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f157925a.hashCode();
        }

        public String toString() {
            return "Empty(message=" + this.f157925a + ")";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f157926a;

        public b(String r2) {
            p.l(r2, "message");
            super(null);
            this.f157926a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f157926a, ((b) r4).f157926a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f157926a.hashCode();
        }

        public String toString() {
            return "Failed(message=" + this.f157926a + ")";
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f157927a;

        public c(Object r2) {
            super(null);
            this.f157927a = r2;
        }

        public final Object a() {
            return this.f157927a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f157927a, ((c) r4).f157927a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            Object r02 = this.f157927a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f157927a + ")";
        }
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}

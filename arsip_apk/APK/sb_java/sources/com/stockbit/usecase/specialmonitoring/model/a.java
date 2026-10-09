package com.stockbit.usecase.specialmonitoring.model;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: com.stockbit.usecase.specialmonitoring.model.a$a, reason: collision with other inner class name */
    public static final class C1664a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f163010a;

        public C1664a(String r2) {
            super(null);
            this.f163010a = r2;
        }

        public final String a() {
            return this.f163010a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1664a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f163010a, ((C1664a) r4).f163010a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            String r02 = this.f163010a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "Error(errorMessage=" + this.f163010a + ")";
        }

        public /* synthetic */ C1664a(String r1, int r2, i r3) {
            if ((r2 & 1) == 0) goto L5;
            r1 = null;
        L5:
            this(r1);
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f163011a = null;

        static {
            f163011a = new b();
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
            return 798573309;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f163012a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f163013b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f163014c;

        public c(String r2, boolean r3, boolean r4) {
            p.l(r2, "url");
            super(null);
            this.f163012a = r2;
            this.f163013b = r3;
            this.f163014c = r4;
        }

        public static /* synthetic */ c b(c r02, String r1, boolean r2, boolean r3, int r4, Object r5) {
            if ((r4 & 1) == 0) goto L6;
            r1 = r02.f163012a;
        L6:
            if ((r4 & 2) == 0) goto L9;
            r2 = r02.f163013b;
        L9:
            if ((r4 & 4) == 0) goto L12;
            r3 = r02.f163014c;
        L12:
            return r02.a(r1, r2, r3);
        }

        public final c a(String r2, boolean r3, boolean r4) {
            p.l(r2, "url");
            return new c(r2, r3, r4);
        }

        public final String c() {
            return this.f163012a;
        }

        public final boolean d() {
            return this.f163013b;
        }

        public final boolean e() {
            return this.f163014c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (p.g(this.f163012a, r52.f163012a) == true) goto L12;
            return false;
        L12:
            if (this.f163013b == r52.f163013b) goto L15;
            return false;
        L15:
            if (this.f163014c == r52.f163014c) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.f163012a.hashCode() * 31) + Boolean.hashCode(this.f163013b)) * 31) + Boolean.hashCode(this.f163014c);
        }

        public String toString() {
            return "Success(url=" + this.f163012a + ", isLoading=" + this.f163013b + ", isRestricted=" + this.f163014c + ")";
        }

        public /* synthetic */ c(String r1, boolean r2, boolean r3, int r4, i r5) {
            if ((r4 & 4) == 0) goto L5;
            r3 = false;
        L5:
            this(r1, r2, r3);
        }
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}

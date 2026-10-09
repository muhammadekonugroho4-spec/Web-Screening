package com.tinder.scarlet;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: com.tinder.scarlet.a$a, reason: collision with other inner class name */
    public static final class C1807a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f173637a;

        public C1807a(Throwable r2) {
            p.l(r2, "throwable");
            super(null);
            this.f173637a = r2;
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L4;
            return true;
        L4:
            if ((r2 instanceof C1807a) == true) goto L6;
            return false;
        L6:
            if (p.g(this.f173637a, ((C1807a) r2).f173637a) == true) goto L13;
            return false;
        L13:
            return true;
        }

        public int hashCode() {
            Throwable r02 = this.f173637a;
            if (r02 != null) goto L5;
            return 0;
        L5:
            return r02.hashCode();
        }

        public String toString() {
            return "Error(throwable=" + this.f173637a + ")";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f173638a;

        public b(Object r2) {
            super(null);
            this.f173638a = r2;
        }

        public final Object a() {
            return this.f173638a;
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L4;
            return true;
        L4:
            if ((r2 instanceof b) == true) goto L6;
            return false;
        L6:
            if (p.g(this.f173638a, ((b) r2).f173638a) == true) goto L13;
            return false;
        L13:
            return true;
        }

        public int hashCode() {
            Object r02 = this.f173638a;
            if (r02 != null) goto L5;
            return 0;
        L5:
            return r02.hashCode();
        }

        public String toString() {
            return "Success(value=" + this.f173638a + ")";
        }
    }

    public a() {
    }

    public /* synthetic */ a(kotlin.jvm.internal.i r1) {
        this();
    }
}

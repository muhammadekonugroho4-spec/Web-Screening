package com.stockbit.domain.model.websocket;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public abstract class b {

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final String f87240a;

        public a(String r2) {
            p.l(r2, "reason");
            super(null);
            this.f87240a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f87240a, ((a) r4).f87240a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f87240a.hashCode();
        }

        public String toString() {
            return "Closed(reason=" + this.f87240a + ")";
        }
    }

    /* renamed from: com.stockbit.domain.model.websocket.b$b, reason: collision with other inner class name */
    public static final class C0805b extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final C0805b f87241a = null;

        static {
            f87241a = new C0805b();
        }

        public C0805b() {
            super(null);
        }
    }

    public static final class c extends b {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f87242a;

        public c(Throwable r2) {
            p.l(r2, "throwable");
            super(null);
            this.f87242a = r2;
        }

        public final Throwable a() {
            return this.f87242a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f87242a, ((c) r4).f87242a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f87242a.hashCode();
        }

        public String toString() {
            return "Failed(throwable=" + this.f87242a + ")";
        }
    }

    public static final class d extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final d f87243a = null;

        static {
            f87243a = new d();
        }

        public d() {
            super(null);
        }
    }

    public /* synthetic */ b(i r1) {
        this();
    }

    public b() {
    }
}

package com.stockbit.domain.model.websocket.trading;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public interface a {

    /* renamed from: com.stockbit.domain.model.websocket.trading.a$a, reason: collision with other inner class name */
    public static final class C0812a implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0812a f87317a = null;

        static {
            f87317a = new C0812a();
        }

        public C0812a() {
        }
    }

    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public final d f87318a;

        public b(d r2) {
            p.l(r2, "requestType");
            this.f87318a = r2;
        }

        public final d a() {
            return this.f87318a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f87318a, ((b) r4).f87318a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f87318a.hashCode();
        }

        public String toString() {
            return "Subscribe(requestType=" + this.f87318a + ")";
        }
    }

    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        public final d f87319a;

        public c(d r2) {
            p.l(r2, "requestType");
            this.f87319a = r2;
        }

        public final d a() {
            return this.f87319a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f87319a, ((c) r4).f87319a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f87319a.hashCode();
        }

        public String toString() {
            return "Unsubscribe(requestType=" + this.f87319a + ")";
        }
    }
}

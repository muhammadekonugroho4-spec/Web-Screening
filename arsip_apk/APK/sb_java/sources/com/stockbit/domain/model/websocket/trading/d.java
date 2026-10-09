package com.stockbit.domain.model.websocket.trading;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public interface d {

    public static final class a implements d {

        /* renamed from: a, reason: collision with root package name */
        public static final a f87345a = null;

        static {
            f87345a = new a();
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
            return -2122526139;
        }

        public String toString() {
            return "LivePrice";
        }
    }

    public static final class b implements d {

        /* renamed from: a, reason: collision with root package name */
        public final String f87346a;

        public b(String r2) {
            p.l(r2, "symbol");
            this.f87346a = r2;
        }

        public final String a() {
            return this.f87346a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f87346a, ((b) r4).f87346a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f87346a.hashCode();
        }

        public String toString() {
            return "OrderBookNego(symbol=" + this.f87346a + ")";
        }
    }
}

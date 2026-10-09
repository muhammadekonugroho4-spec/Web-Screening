package com.stockbit.domain.model.websocket.transaction;

import com.stockbit.domain.model.financial.c;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public interface b {

    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final c f87349a;

        public a(c r2) {
            p.l(r2, "livePrice");
            this.f87349a = r2;
        }

        public final c a() {
            return this.f87349a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f87349a, ((a) r4).f87349a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f87349a.hashCode();
        }

        public String toString() {
            return "LivePrice(livePrice=" + this.f87349a + ")";
        }
    }

    /* renamed from: com.stockbit.domain.model.websocket.transaction.b$b, reason: collision with other inner class name */
    public static final class C0819b implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final C0819b f87350a = null;

        static {
            f87350a = new C0819b();
        }

        public C0819b() {
        }
    }
}

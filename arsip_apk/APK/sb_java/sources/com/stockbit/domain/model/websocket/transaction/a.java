package com.stockbit.domain.model.websocket.transaction;

import java.util.List;
import kotlin.collections.AbstractC11776u;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public interface a {

    /* renamed from: com.stockbit.domain.model.websocket.transaction.a$a, reason: collision with other inner class name */
    public interface InterfaceC0816a extends a {

        /* renamed from: com.stockbit.domain.model.websocket.transaction.a$a$a, reason: collision with other inner class name */
        public static final class C0817a implements InterfaceC0816a {

            /* renamed from: a, reason: collision with root package name */
            public final List f87347a;

            public C0817a(List r2) {
                p.l(r2, "symbol");
                this.f87347a = r2;
            }

            public final List a() {
                return this.f87347a;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof C0817a) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f87347a, ((C0817a) r4).f87347a) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f87347a.hashCode();
            }

            public String toString() {
                return "LivePrice(symbol=" + this.f87347a + ")";
            }

            public C0817a(String r2) {
                p.l(r2, "symbol");
                this(AbstractC11776u.e(r2));
            }
        }
    }

    public interface b extends a {

        /* renamed from: com.stockbit.domain.model.websocket.transaction.a$b$a, reason: collision with other inner class name */
        public static final class C0818a implements b {

            /* renamed from: a, reason: collision with root package name */
            public static final C0818a f87348a = null;

            static {
                f87348a = new C0818a();
            }

            public C0818a() {
            }
        }
    }
}

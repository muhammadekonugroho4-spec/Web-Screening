package com.stockbit.domain.model.websocket.social;

import java.util.List;
import kotlin.collections.AbstractC11776u;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public abstract class a {

    /* renamed from: com.stockbit.domain.model.websocket.social.a$a, reason: collision with other inner class name */
    public static final class C0808a extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0808a f87310a = null;

        static {
            f87310a = new C0808a();
        }

        public C0808a() {
            super(null);
        }
    }

    public static abstract class b extends a {

        /* renamed from: com.stockbit.domain.model.websocket.social.a$b$a, reason: collision with other inner class name */
        public static final class C0809a extends b {

            /* renamed from: a, reason: collision with root package name */
            public final List f87311a;

            public C0809a(List r2) {
                p.l(r2, "roomIds");
                super(null);
                this.f87311a = r2;
            }

            public final List a() {
                return this.f87311a;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof C0809a) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f87311a, ((C0809a) r4).f87311a) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f87311a.hashCode();
            }

            public String toString() {
                return "Room(roomIds=" + this.f87311a + ")";
            }

            public C0809a(int r1) {
                this(AbstractC11776u.e(Integer.valueOf(r1)));
            }
        }

        /* renamed from: com.stockbit.domain.model.websocket.social.a$b$b, reason: collision with other inner class name */
        public static final class C0810b extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final C0810b f87312a = null;

            static {
                f87312a = new C0810b();
            }

            public C0810b() {
                super(null);
            }
        }

        public /* synthetic */ b(i r1) {
            this();
        }

        public b() {
            super(null);
        }
    }

    public static abstract class c extends a {

        /* renamed from: com.stockbit.domain.model.websocket.social.a$c$a, reason: collision with other inner class name */
        public static final class C0811a extends c {

            /* renamed from: a, reason: collision with root package name */
            public final List f87313a;

            public C0811a(List r2) {
                p.l(r2, "roomIds");
                super(null);
                this.f87313a = r2;
            }

            public final List a() {
                return this.f87313a;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof C0811a) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f87313a, ((C0811a) r4).f87313a) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f87313a.hashCode();
            }

            public String toString() {
                return "Room(roomIds=" + this.f87313a + ")";
            }

            public C0811a(int r1) {
                this(AbstractC11776u.e(Integer.valueOf(r1)));
            }
        }

        public static final class b extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final b f87314a = null;

            static {
                f87314a = new b();
            }

            public b() {
                super(null);
            }
        }

        public /* synthetic */ c(i r1) {
            this();
        }

        public c() {
            super(null);
        }
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}

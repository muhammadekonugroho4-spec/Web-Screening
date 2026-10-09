package com.tinder.scarlet;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public interface c extends org.reactivestreams.a {

    public static abstract class a {

        /* renamed from: com.tinder.scarlet.c$a$a, reason: collision with other inner class name */
        public static final class C1812a extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final C1812a f173645a = null;

            static {
                f173645a = new C1812a();
            }

            public C1812a() {
                super(null);
            }
        }

        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f173646a = null;

            static {
                f173646a = new b();
            }

            public b() {
                super(null);
            }
        }

        /* renamed from: com.tinder.scarlet.c$a$c, reason: collision with other inner class name */
        public static abstract class AbstractC1813c extends a {

            /* renamed from: com.tinder.scarlet.c$a$c$a, reason: collision with other inner class name */
            public static final class C1814a extends AbstractC1813c {

                /* renamed from: a, reason: collision with root package name */
                public static final C1814a f173647a = null;

                static {
                    f173647a = new C1814a();
                }

                public C1814a() {
                    super(null);
                }
            }

            /* renamed from: com.tinder.scarlet.c$a$c$b */
            public static final class b extends AbstractC1813c {

                /* renamed from: a, reason: collision with root package name */
                public final h f173648a;

                public /* synthetic */ b(h r1, int r2, kotlin.jvm.internal.i r3) {
                    if ((r2 & 1) == 0) goto L5;
                    r1 = h.f173670e;
                L5:
                    this(r1);
                }

                public final h a() {
                    return this.f173648a;
                }

                public boolean equals(Object r2) {
                    if (this != r2) goto L4;
                    return true;
                L4:
                    if ((r2 instanceof b) == true) goto L6;
                    return false;
                L6:
                    if (p.g(this.f173648a, ((b) r2).f173648a) == true) goto L13;
                    return false;
                L13:
                    return true;
                }

                public int hashCode() {
                    h r02 = this.f173648a;
                    if (r02 != null) goto L5;
                    return 0;
                L5:
                    return r02.hashCode();
                }

                public String toString() {
                    return "WithReason(shutdownReason=" + this.f173648a + ")";
                }

                public b(h r2) {
                    p.l(r2, "shutdownReason");
                    super(null);
                    this.f173648a = r2;
                }
            }

            public AbstractC1813c() {
                super(null);
            }

            public /* synthetic */ AbstractC1813c(kotlin.jvm.internal.i r1) {
                this();
            }
        }

        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }
    }

    c a(c... r1);
}

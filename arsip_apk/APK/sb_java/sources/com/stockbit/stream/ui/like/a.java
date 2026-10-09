package com.stockbit.stream.ui.like;

import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public abstract class a {

    /* renamed from: com.stockbit.stream.ui.like.a$a, reason: collision with other inner class name */
    public static final class C1284a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f143471a;

        static {
        }

        public C1284a(String r2) {
            p.l(r2, "message");
            super(null);
            this.f143471a = r2;
        }

        public final String a() {
            return this.f143471a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1284a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f143471a, ((C1284a) r4).f143471a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f143471a.hashCode();
        }

        public String toString() {
            return "ErrorFollowUser(message=" + this.f143471a + ')';
        }
    }

    static {
    }

    public /* synthetic */ a(kotlin.jvm.internal.i r1) {
        this();
    }

    public a() {
    }
}

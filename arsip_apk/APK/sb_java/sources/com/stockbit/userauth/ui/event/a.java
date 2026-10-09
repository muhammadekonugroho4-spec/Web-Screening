package com.stockbit.userauth.ui.event;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: com.stockbit.userauth.ui.event.a$a, reason: collision with other inner class name */
    public static final class C1741a extends a {
        static {
        }

        public C1741a() {
            super(null);
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f165269a;

        static {
        }

        public b(String r2) {
            p.l(r2, "formattedSeconds");
            super(null);
            this.f165269a = r2;
        }

        public final String a() {
            return this.f165269a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f165269a, ((b) r4).f165269a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f165269a.hashCode();
        }

        public String toString() {
            return "OnTick(formattedSeconds=" + this.f165269a + ')';
        }
    }

    static {
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}

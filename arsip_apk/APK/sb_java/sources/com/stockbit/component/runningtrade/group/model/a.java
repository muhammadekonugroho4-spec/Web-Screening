package com.stockbit.component.runningtrade.group.model;

import com.stockbit.usecase.runningtrade.model.c;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: com.stockbit.component.runningtrade.group.model.a$a, reason: collision with other inner class name */
    public static final class C0723a extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0723a f74618a = null;

        static {
            f74618a = new C0723a();
        }

        public C0723a() {
            super(null);
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final c f74619a;

        static {
        }

        public b(c r2) {
            super(null);
            this.f74619a = r2;
        }

        public final c a() {
            return this.f74619a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f74619a, ((b) r4).f74619a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            c r02 = this.f74619a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "Selected(item=" + this.f74619a + ')';
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

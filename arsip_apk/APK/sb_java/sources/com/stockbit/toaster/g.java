package com.stockbit.toaster;

import android.content.Context;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public abstract class g {

    public static final class a extends g {

        /* renamed from: a, reason: collision with root package name */
        public final String f146208a;

        static {
        }

        public a(String r2) {
            p.l(r2, "value");
            super(null);
            this.f146208a = r2;
        }

        public final String b() {
            return this.f146208a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f146208a, ((a) r4).f146208a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f146208a.hashCode();
        }

        public String toString() {
            return "DynamicString(value=" + this.f146208a + ')';
        }
    }

    public static final class b extends g {

        /* renamed from: a, reason: collision with root package name */
        public final int f146209a;

        /* renamed from: b, reason: collision with root package name */
        public final Object[] f146210b;

        static {
        }

        public b(int r2, Object... r3) {
            p.l(r3, "args");
            super(null);
            this.f146209a = r2;
            this.f146210b = r3;
        }

        public final Object[] b() {
            return this.f146210b;
        }

        public final int c() {
            return this.f146209a;
        }
    }

    static {
    }

    public /* synthetic */ g(i r1) {
        this();
    }

    public final String a(Context r4) {
        p.l(r4, "context");
        if ((this instanceof a) == false) goto L7;
        return ((a) this).b();
    L7:
        if ((this instanceof b) == false) goto L11;
        b r02 = (b) this;
        int r1 = r02.c();
        Object[] r03 = r02.b();
        String r42 = r4.getString(r1, Arrays.copyOf(r03, r03.length));
        p.k(r42, "getString(...)");
        return r42;
    L11:
        throw new NoWhenBranchMatchedException();
    }

    public g() {
    }
}

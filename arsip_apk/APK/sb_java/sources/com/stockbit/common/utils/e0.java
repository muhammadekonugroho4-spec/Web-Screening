package com.stockbit.common.utils;

import android.content.Context;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes7.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f62291a = 0;

    public static final class a extends e0 {

        /* renamed from: b, reason: collision with root package name */
        public final int f62292b;

        /* renamed from: c, reason: collision with root package name */
        public final Object[] f62293c;

        static {
        }

        public a(int r2, Object... r3) {
            kotlin.jvm.internal.p.l(r3, "args");
            super(null);
            this.f62292b = r2;
            this.f62293c = r3;
        }

        public final Object[] b() {
            return this.f62293c;
        }

        public final int c() {
            return this.f62292b;
        }
    }

    static {
    }

    public /* synthetic */ e0(kotlin.jvm.internal.i r1) {
        this();
    }

    public final String a(Context r4) {
        kotlin.jvm.internal.p.l(r4, "context");
        if ((this instanceof a) == false) goto L7;
        a r02 = (a) this;
        int r1 = r02.c();
        Object[] r03 = r02.b();
        String r42 = r4.getString(r1, Arrays.copyOf(r03, r03.length));
        kotlin.jvm.internal.p.k(r42, "getString(...)");
        return r42;
    L7:
        throw new NoWhenBranchMatchedException();
    }

    public e0() {
    }
}

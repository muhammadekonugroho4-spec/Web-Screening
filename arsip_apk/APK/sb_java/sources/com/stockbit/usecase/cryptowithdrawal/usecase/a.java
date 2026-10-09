package com.stockbit.usecase.cryptowithdrawal.usecase;

import com.stockbit.usecase.cryptowithdrawal.contract.entity.c;
import kotlin.jvm.internal.i;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final C1462a f157515a = null;

    /* renamed from: com.stockbit.usecase.cryptowithdrawal.usecase.a$a, reason: collision with other inner class name */
    public static final class C1462a {
        public /* synthetic */ C1462a(i r1) {
            this();
        }

        public C1462a() {
        }
    }

    static {
        f157515a = new C1462a(null);
    }

    public a() {
    }

    public final c a(long r10) {
        if (r10 >= 250000000) goto L6;
        long r1 = 2500;
    L5:
        long r4 = r1;
        long r6 = r10 - r4;
        if (r10 < 250000000) goto L11;
        boolean r102 = true;
    L13:
        return new c(r4, r6, r102);
    L11:
        r102 = false;
        goto L13
    L6:
        r1 = 4500;
        goto L5
    }
}

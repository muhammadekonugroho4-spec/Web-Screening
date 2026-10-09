package com.stockbit.watchlist.utils;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f171347a = null;

    static {
        f171347a = new a();
    }

    public a() {
    }

    public final int a(long r4, long r6) {
        Calendar r02 = Calendar.getInstance();
        r02.setTimeInMillis(r4);
        int r1 = r02.get(11);
        long r03 = (((23 - r1) * 3600000) + ((59 - r02.get(12)) * 60000)) + r4;
        if (r6 > r03) goto L5;
        return 0;
    L5:
        return ((int) ((r6 - r03) / TimeUnit.DAYS.toMillis(1))) + 1;
    }
}

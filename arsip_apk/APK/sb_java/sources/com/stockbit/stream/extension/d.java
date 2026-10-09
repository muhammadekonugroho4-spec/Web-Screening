package com.stockbit.stream.extension;

import java.util.Calendar;
import java.util.Date;

/* loaded from: classes11.dex */
public abstract class d {
    public static final long a(int r1, int r2) {
        Calendar r02 = Calendar.getInstance();
        r02.add(r1, r2);
        return r02.getTime().getTime();
    }

    public static final long b(int r2, int r3, int r4) {
        Calendar r02 = Calendar.getInstance();
        r02.set(1, r2);
        r02.set(2, r3);
        r02.set(5, r4);
        return r02.getTime().getTime();
    }

    public static final boolean c(long r6) {
        if (r6 != 0) goto L5;
        return false;
    L5:
        Date r02 = new Date();
        Calendar r2 = Calendar.getInstance();
        r2.getTime().setTime(r6 * 1000);
        if (r2.getTime().getTime() >= r02.getTime()) goto L9;
        return true;
    L9:
        return false;
    }
}

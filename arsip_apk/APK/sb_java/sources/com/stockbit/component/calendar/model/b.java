package com.stockbit.component.calendar.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public abstract class b {
    public static final Day a() {
        GregorianCalendar r02 = new GregorianCalendar();
        return new Day(r02.get(1), r02.get(2), r02.get(5));
    }

    public static final String b(Day r3) {
        if (r3 != null) goto L5;
        return null;
    L5:
        Calendar r02 = Calendar.getInstance();
        r02.set(1, r3.c());
        r02.set(2, r3.b());
        r02.set(5, r3.a());
        String r32 = new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(r02.getTime());
        p.k(r32, "format(...)");
        return r32;
    }
}

package com.stockbit.android.extension;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

/* loaded from: classes6.dex */
public abstract class K0 {
    public static final Calendar a(LocalDate r3) {
        if (r3 != null) goto L5;
        return null;
    L5:
        Calendar r02 = Calendar.getInstance();
        r02.set(r3.getYear(), r3.getMonthValue() - 1, r3.getDayOfMonth());
        return r02;
    }

    public static final LocalDate b(String r1, String r2) {
        kotlin.jvm.internal.p.l(r2, "pattern");
        if (r1 != null) goto L10;
        LocalDate r12 = LocalDate.now();
        kotlin.jvm.internal.p.k(r12, "now(...)");
        return r12;
    L10:
        LocalDate r13 = LocalDate.parse(r1, DateTimeFormatter.ofPattern(r2));     // Catch: Throwable -> L8
        kotlin.jvm.internal.p.k(r13, "parse(...)");     // Catch: Throwable -> L8
        return r13;
    L8:
        LocalDate r14 = LocalDate.now();
        kotlin.jvm.internal.p.k(r14, "now(...)");
        return r14;
    }

    public static final LocalDate c(Calendar r3) {
        if (r3 != null) goto L5;
        LocalDate r32 = LocalDate.now();
        kotlin.jvm.internal.p.k(r32, "now(...)");
        return r32;
    L5:
        LocalDate r33 = LocalDate.of(r3.get(1), r3.get(2) + 1, r3.get(5));
        kotlin.jvm.internal.p.k(r33, "of(...)");
        return r33;
    }

    public static final LocalDate d(Calendar r3) {
        if (r3 != null) goto L6;
        return null;
    L6:
        return LocalDate.of(r3.get(1), r3.get(2) + 1, r3.get(5));
    }

    public static final String e(LocalDate r1, String r2) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        kotlin.jvm.internal.p.l(r2, "format");
        String r12 = r1.format(DateTimeFormatter.ofPattern(r2));
        kotlin.jvm.internal.p.k(r12, "format(...)");
        return r12;
    }
}

package com.stockbit.company.ui.orderbook.brokerdistribution.utils;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0685a f67251b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f67252c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final DecimalFormat f67253a;

    /* renamed from: com.stockbit.company.ui.orderbook.brokerdistribution.utils.a$a, reason: collision with other inner class name */
    public static final class C0685a {
        public /* synthetic */ C0685a(i r1) {
            this();
        }

        public C0685a() {
        }
    }

    static {
        f67251b = new C0685a(null);
        f67252c = 8;
    }

    public a() {
        DecimalFormat r02 = new DecimalFormat();
        DecimalFormatSymbols r1 = new DecimalFormatSymbols(Locale.US);
        r1.setDecimalSeparator('.');
        r1.setGroupingSeparator(',');
        r02.setDecimalFormatSymbols(r1);
        r02.setMinimumFractionDigits(2);
        r02.setMaximumFractionDigits(2);
        this.f67253a = r02;
    }

    public final String a(float r4) {
        if (r4 < 1.0E12f) goto L7;
        return this.f67253a.format(Float.valueOf(r4 / 1.0E12f)) + " T";
    L7:
        if (r4 < 1.0E9f) goto L11;
        return this.f67253a.format(Float.valueOf(r4 / 1.0E9f)) + " B";
    L11:
        if (r4 < 1000000.0f) goto L15;
        return this.f67253a.format(Float.valueOf(r4 / 1000000.0f)) + " M";
    L15:
        if (r4 >= 1000.0f) goto L17;
        String r42 = this.f67253a.format(Float.valueOf(r4));
        p.k(r42, "format(...)");
        return r42;
    L17:
        return this.f67253a.format(Float.valueOf(r4 / 1000.0f)) + " K";
    }
}

package com.stockbit.component.chart.utils;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f69797a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final DecimalFormatSymbols f69798b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final DecimalFormat f69799c = null;
    public static final DecimalFormat d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final int f69800e = 0;

    static {
        f69797a = new a();
        DecimalFormatSymbols r02 = DecimalFormatSymbols.getInstance(Locale.US);
        f69798b = r02;
        f69799c = new DecimalFormat("#,###.##");
        d = new DecimalFormat("#,###.###", r02);
        f69800e = 8;
    }

    public a() {
    }
}

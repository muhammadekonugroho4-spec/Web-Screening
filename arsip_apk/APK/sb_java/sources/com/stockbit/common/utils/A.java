package com.stockbit.common.utils;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* loaded from: classes7.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public static final A f61861a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final DecimalFormatSymbols f61862b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final DecimalFormat f61863c = null;
    public static final DecimalFormat d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final DecimalFormat f61864e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final DecimalFormat f61865f = null;

    /* renamed from: g, reason: collision with root package name */
    public static final DecimalFormat f61866g = null;

    /* renamed from: h, reason: collision with root package name */
    public static final DecimalFormat f61867h = null;

    /* renamed from: i, reason: collision with root package name */
    public static final DecimalFormat f61868i = null;

    /* renamed from: j, reason: collision with root package name */
    public static final DecimalFormat f61869j = null;

    /* renamed from: k, reason: collision with root package name */
    public static final DecimalFormat f61870k = null;

    /* renamed from: l, reason: collision with root package name */
    public static final DecimalFormat f61871l = null;

    /* renamed from: m, reason: collision with root package name */
    public static final DecimalFormat f61872m = null;

    /* renamed from: n, reason: collision with root package name */
    public static final DecimalFormat f61873n = null;

    /* renamed from: o, reason: collision with root package name */
    public static final DecimalFormat f61874o = null;

    /* renamed from: p, reason: collision with root package name */
    public static final DecimalFormat f61875p = null;

    /* renamed from: q, reason: collision with root package name */
    public static final int f61876q = 0;

    static {
        f61861a = new A();
        DecimalFormatSymbols r02 = DecimalFormatSymbols.getInstance(Locale.US);
        f61862b = r02;
        f61863c = new DecimalFormat(" #,##0.00 '%'");
        d = new DecimalFormat("#,##0.00");
        f61864e = new DecimalFormat("#,###.####");
        f61865f = new DecimalFormat("#,###");
        f61866g = new DecimalFormat("#,###", r02);
        f61867h = new DecimalFormat("#,###");
        f61868i = new DecimalFormat("#,###.##");
        f61869j = new DecimalFormat("#,###.##", r02);
        f61870k = new DecimalFormat("#,###.###", r02);
        f61871l = new DecimalFormat("#,###", r02);
        f61872m = new DecimalFormat("+#,###;-#,###");
        f61873n = new DecimalFormat("#,###;#,###");
        f61874o = new DecimalFormat("+#,##0.00;-#,##0.00");
        f61875p = new DecimalFormat("#,##0.00;#,##0.00");
        f61876q = 8;
    }

    public A() {
    }

    public final DecimalFormat a() {
        return f61864e;
    }

    public final DecimalFormat b() {
        return f61865f;
    }

    public final DecimalFormat c() {
        return f61871l;
    }

    public final DecimalFormat d() {
        return f61866g;
    }

    public final DecimalFormatSymbols e() {
        return f61862b;
    }
}

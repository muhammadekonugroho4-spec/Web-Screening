package com.stockbit.cryptodetail.ui.detail;

import com.stockbit.cryptodetail.ui.detail.model.CryptoChartFilterType;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/* loaded from: classes8.dex */
public abstract class V {

    /* renamed from: a, reason: collision with root package name */
    public static final DateTimeFormatter f79362a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final DateTimeFormatter f79363b = null;

    static {
        Locale r02 = Locale.US;
        DateTimeFormatter r1 = DateTimeFormatter.ofPattern("HH:mm", r02);
        kotlin.jvm.internal.p.k(r1, "ofPattern(...)");
        f79362a = r1;
        DateTimeFormatter r03 = DateTimeFormatter.ofPattern("dd MMM yyyy", r02);
        kotlin.jvm.internal.p.k(r03, "ofPattern(...)");
        f79363b = r03;
    }

    public static final /* synthetic */ String a(long r02, CryptoChartFilterType r2) {
        return b(r02, r2);
    }

    public static final String b(long r2, CryptoChartFilterType r4) {
        if (r2 > 0) goto L7;
        return "";
    L7:
        if (r4 != CryptoChartFilterType.ONE_DAY) goto L9;
        DateTimeFormatter r42 = f79362a;
    L10:
        String r22 = Instant.ofEpochSecond(r2).atZone(ZoneId.systemDefault()).format(r42);
        kotlin.jvm.internal.p.k(r22, "format(...)");
        return r22;
    L9:
        r42 = f79363b;
        goto L10
    }
}

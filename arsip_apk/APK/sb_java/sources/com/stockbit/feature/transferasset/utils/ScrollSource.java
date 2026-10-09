package com.stockbit.feature.transferasset.utils;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/feature/transferasset/utils/ScrollSource;", "", "<init>", "(Ljava/lang/String;I)V", "USER", "SYSTEM", "transferasset_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public enum ScrollSource extends Enum<ScrollSource> {
    public static final ScrollSource SYSTEM = null;
    public static final ScrollSource USER = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ScrollSource[] f117454a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f117455b = null;

    static {
        USER = new ScrollSource("USER", 0);
        SYSTEM = new ScrollSource("SYSTEM", 1);
        ScrollSource[] r02 = a();
        f117454a = r02;
        f117455b = b.a(r02);
    }

    ScrollSource(String r1, int r2) {
    }

    public static final /* synthetic */ ScrollSource[] a() {
        return new ScrollSource[]{USER, SYSTEM};
    }

    public static a getEntries() {
        return f117455b;
    }

    public static ScrollSource valueOf(String r1) {
        return (ScrollSource) Enum.valueOf(ScrollSource.class, r1);
    }

    public static ScrollSource[] values() {
        return (ScrollSource[]) f117454a.clone();
    }
}

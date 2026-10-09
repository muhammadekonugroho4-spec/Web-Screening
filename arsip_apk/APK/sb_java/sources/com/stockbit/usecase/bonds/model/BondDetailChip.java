package com.stockbit.usecase.bonds.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/usecase/bonds/model/BondDetailChip;", "", "<init>", "(Ljava/lang/String;I)V", "YIELD", "BUY_PRICE", "SELL_PRICE", "usecase-bonds"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public enum BondDetailChip extends Enum<BondDetailChip> {
    public static final BondDetailChip BUY_PRICE = null;
    public static final BondDetailChip SELL_PRICE = null;
    public static final BondDetailChip YIELD = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ BondDetailChip[] f154471a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f154472b = null;

    static {
        YIELD = new BondDetailChip("YIELD", 0);
        BUY_PRICE = new BondDetailChip("BUY_PRICE", 1);
        SELL_PRICE = new BondDetailChip("SELL_PRICE", 2);
        BondDetailChip[] r02 = a();
        f154471a = r02;
        f154472b = kotlin.enums.b.a(r02);
    }

    BondDetailChip(String r1, int r2) {
    }

    public static final /* synthetic */ BondDetailChip[] a() {
        return new BondDetailChip[]{YIELD, BUY_PRICE, SELL_PRICE};
    }

    public static kotlin.enums.a getEntries() {
        return f154472b;
    }

    public static BondDetailChip valueOf(String r1) {
        return (BondDetailChip) Enum.valueOf(BondDetailChip.class, r1);
    }

    public static BondDetailChip[] values() {
        return (BondDetailChip[]) f154471a.clone();
    }
}

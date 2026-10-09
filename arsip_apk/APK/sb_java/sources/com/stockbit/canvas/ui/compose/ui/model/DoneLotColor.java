package com.stockbit.canvas.ui.compose.ui.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/stockbit/canvas/ui/compose/ui/model/DoneLotColor;", "", "<init>", "(Ljava/lang/String;I)V", "BUY", "SELL", "NEGOTIATION", "CASH", "PRIMARY", "canvas_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public enum DoneLotColor extends Enum<DoneLotColor> {
    public static final DoneLotColor BUY = null;
    public static final DoneLotColor CASH = null;
    public static final DoneLotColor NEGOTIATION = null;
    public static final DoneLotColor PRIMARY = null;
    public static final DoneLotColor SELL = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ DoneLotColor[] f51786a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f51787b = null;

    static {
        BUY = new DoneLotColor("BUY", 0);
        SELL = new DoneLotColor("SELL", 1);
        NEGOTIATION = new DoneLotColor("NEGOTIATION", 2);
        CASH = new DoneLotColor("CASH", 3);
        PRIMARY = new DoneLotColor("PRIMARY", 4);
        DoneLotColor[] r02 = a();
        f51786a = r02;
        f51787b = kotlin.enums.b.a(r02);
    }

    DoneLotColor(String r1, int r2) {
    }

    public static final /* synthetic */ DoneLotColor[] a() {
        return new DoneLotColor[]{BUY, SELL, NEGOTIATION, CASH, PRIMARY};
    }

    public static kotlin.enums.a getEntries() {
        return f51787b;
    }

    public static DoneLotColor valueOf(String r1) {
        return (DoneLotColor) Enum.valueOf(DoneLotColor.class, r1);
    }

    public static DoneLotColor[] values() {
        return (DoneLotColor[]) f51786a.clone();
    }
}

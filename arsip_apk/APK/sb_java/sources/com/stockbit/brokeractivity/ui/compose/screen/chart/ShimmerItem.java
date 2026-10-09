package com.stockbit.brokeractivity.ui.compose.screen.chart;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/brokeractivity/ui/compose/screen/chart/ShimmerItem;", "", "<init>", "(Ljava/lang/String;I)V", "Empty", "Rect", "Circle", "brokeractivity_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public enum ShimmerItem extends Enum<ShimmerItem> {
    public static final ShimmerItem Circle = null;
    public static final ShimmerItem Empty = null;
    public static final ShimmerItem Rect = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ShimmerItem[] f48505a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f48506b = null;

    static {
        Empty = new ShimmerItem("Empty", 0);
        Rect = new ShimmerItem("Rect", 1);
        Circle = new ShimmerItem("Circle", 2);
        ShimmerItem[] r02 = a();
        f48505a = r02;
        f48506b = kotlin.enums.b.a(r02);
    }

    ShimmerItem(String r1, int r2) {
    }

    public static final /* synthetic */ ShimmerItem[] a() {
        return new ShimmerItem[]{Empty, Rect, Circle};
    }

    public static kotlin.enums.a getEntries() {
        return f48506b;
    }

    public static ShimmerItem valueOf(String r1) {
        return (ShimmerItem) Enum.valueOf(ShimmerItem.class, r1);
    }

    public static ShimmerItem[] values() {
        return (ShimmerItem[]) f48505a.clone();
    }
}

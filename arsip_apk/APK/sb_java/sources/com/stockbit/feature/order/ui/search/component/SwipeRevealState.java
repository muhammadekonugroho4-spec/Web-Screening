package com.stockbit.feature.order.ui.search.component;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/feature/order/ui/search/component/SwipeRevealState;", "", "<init>", "(Ljava/lang/String;I)V", "Closed", "Open", "order_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
enum SwipeRevealState extends Enum<SwipeRevealState> {
    public static final SwipeRevealState Closed = null;
    public static final SwipeRevealState Open = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ SwipeRevealState[] f103291a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f103292b = null;

    static {
        Closed = new SwipeRevealState("Closed", 0);
        Open = new SwipeRevealState("Open", 1);
        SwipeRevealState[] r02 = a();
        f103291a = r02;
        f103292b = kotlin.enums.b.a(r02);
    }

    SwipeRevealState(String r1, int r2) {
    }

    public static final /* synthetic */ SwipeRevealState[] a() {
        return new SwipeRevealState[]{Closed, Open};
    }

    public static kotlin.enums.a getEntries() {
        return f103292b;
    }

    public static SwipeRevealState valueOf(String r1) {
        return (SwipeRevealState) Enum.valueOf(SwipeRevealState.class, r1);
    }

    public static SwipeRevealState[] values() {
        return (SwipeRevealState[]) f103291a.clone();
    }
}

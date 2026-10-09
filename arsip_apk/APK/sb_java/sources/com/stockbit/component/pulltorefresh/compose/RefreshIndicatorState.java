package com.stockbit.component.pulltorefresh.compose;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/stockbit/component/pulltorefresh/compose/RefreshIndicatorState;", "", "<init>", "(Ljava/lang/String;I)V", "Default", "PullingDown", "ReachedThreshold", "Refreshing", "pulltorefresh_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public enum RefreshIndicatorState extends Enum<RefreshIndicatorState> {
    public static final RefreshIndicatorState Default = null;
    public static final RefreshIndicatorState PullingDown = null;
    public static final RefreshIndicatorState ReachedThreshold = null;
    public static final RefreshIndicatorState Refreshing = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ RefreshIndicatorState[] f74248a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f74249b = null;

    static {
        Default = new RefreshIndicatorState("Default", 0);
        PullingDown = new RefreshIndicatorState("PullingDown", 1);
        ReachedThreshold = new RefreshIndicatorState("ReachedThreshold", 2);
        Refreshing = new RefreshIndicatorState("Refreshing", 3);
        RefreshIndicatorState[] r02 = a();
        f74248a = r02;
        f74249b = kotlin.enums.b.a(r02);
    }

    RefreshIndicatorState(String r1, int r2) {
    }

    public static final /* synthetic */ RefreshIndicatorState[] a() {
        return new RefreshIndicatorState[]{Default, PullingDown, ReachedThreshold, Refreshing};
    }

    public static kotlin.enums.a getEntries() {
        return f74249b;
    }

    public static RefreshIndicatorState valueOf(String r1) {
        return (RefreshIndicatorState) Enum.valueOf(RefreshIndicatorState.class, r1);
    }

    public static RefreshIndicatorState[] values() {
        return (RefreshIndicatorState[]) f74248a.clone();
    }
}

package com.stockbit.common.uikit.keyboard.expandableView;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/stockbit/common/uikit/keyboard/expandableView/ExpandableState;", "", "<init>", "(Ljava/lang/String;I)V", "COLLAPSED", "COLLAPSING", "EXPANDED", "EXPANDING", "common_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public enum ExpandableState extends Enum<ExpandableState> {
    public static final ExpandableState COLLAPSED = null;
    public static final ExpandableState COLLAPSING = null;
    public static final ExpandableState EXPANDED = null;
    public static final ExpandableState EXPANDING = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ExpandableState[] f61791a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f61792b = null;

    static {
        COLLAPSED = new ExpandableState("COLLAPSED", 0);
        COLLAPSING = new ExpandableState("COLLAPSING", 1);
        EXPANDED = new ExpandableState("EXPANDED", 2);
        EXPANDING = new ExpandableState("EXPANDING", 3);
        ExpandableState[] r02 = a();
        f61791a = r02;
        f61792b = kotlin.enums.b.a(r02);
    }

    ExpandableState(String r1, int r2) {
    }

    public static final /* synthetic */ ExpandableState[] a() {
        return new ExpandableState[]{COLLAPSED, COLLAPSING, EXPANDED, EXPANDING};
    }

    public static kotlin.enums.a getEntries() {
        return f61792b;
    }

    public static ExpandableState valueOf(String r1) {
        return (ExpandableState) Enum.valueOf(ExpandableState.class, r1);
    }

    public static ExpandableState[] values() {
        return (ExpandableState[]) f61791a.clone();
    }
}

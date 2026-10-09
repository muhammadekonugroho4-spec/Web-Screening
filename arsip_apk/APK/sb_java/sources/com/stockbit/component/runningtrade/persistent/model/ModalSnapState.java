package com.stockbit.component.runningtrade.persistent.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/component/runningtrade/persistent/model/ModalSnapState;", "", "<init>", "(Ljava/lang/String;I)V", "SlightlyExpanded", "HalfExpanded", "FullyExpanded", "runningtrade_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public enum ModalSnapState extends Enum<ModalSnapState> {
    public static final ModalSnapState FullyExpanded = null;
    public static final ModalSnapState HalfExpanded = null;
    public static final ModalSnapState SlightlyExpanded = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ModalSnapState[] f75102a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f75103b = null;

    static {
        SlightlyExpanded = new ModalSnapState("SlightlyExpanded", 0);
        HalfExpanded = new ModalSnapState("HalfExpanded", 1);
        FullyExpanded = new ModalSnapState("FullyExpanded", 2);
        ModalSnapState[] r02 = a();
        f75102a = r02;
        f75103b = kotlin.enums.b.a(r02);
    }

    ModalSnapState(String r1, int r2) {
    }

    public static final /* synthetic */ ModalSnapState[] a() {
        return new ModalSnapState[]{SlightlyExpanded, HalfExpanded, FullyExpanded};
    }

    public static kotlin.enums.a getEntries() {
        return f75103b;
    }

    public static ModalSnapState valueOf(String r1) {
        return (ModalSnapState) Enum.valueOf(ModalSnapState.class, r1);
    }

    public static ModalSnapState[] values() {
        return (ModalSnapState[]) f75102a.clone();
    }
}

package com.stockbit.company.ui.orderbook.brokerdistribution.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/company/ui/orderbook/brokerdistribution/model/AnimationDirection;", "", "<init>", "(Ljava/lang/String;I)V", "LEFT_TO_RIGHT", "RIGHT_TO_LEFT", "company_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public enum AnimationDirection extends Enum<AnimationDirection> {
    public static final AnimationDirection LEFT_TO_RIGHT = null;
    public static final AnimationDirection RIGHT_TO_LEFT = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AnimationDirection[] f67203a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f67204b = null;

    static {
        LEFT_TO_RIGHT = new AnimationDirection("LEFT_TO_RIGHT", 0);
        RIGHT_TO_LEFT = new AnimationDirection("RIGHT_TO_LEFT", 1);
        AnimationDirection[] r02 = a();
        f67203a = r02;
        f67204b = kotlin.enums.b.a(r02);
    }

    AnimationDirection(String r1, int r2) {
    }

    public static final /* synthetic */ AnimationDirection[] a() {
        return new AnimationDirection[]{LEFT_TO_RIGHT, RIGHT_TO_LEFT};
    }

    public static kotlin.enums.a getEntries() {
        return f67204b;
    }

    public static AnimationDirection valueOf(String r1) {
        return (AnimationDirection) Enum.valueOf(AnimationDirection.class, r1);
    }

    public static AnimationDirection[] values() {
        return (AnimationDirection[]) f67203a.clone();
    }
}

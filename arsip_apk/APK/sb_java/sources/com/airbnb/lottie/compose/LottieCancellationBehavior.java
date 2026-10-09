package com.airbnb.lottie.compose;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCancellationBehavior;", "", "(Ljava/lang/String;I)V", "Immediately", "OnIterationFinish", "lottie-compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public enum LottieCancellationBehavior extends Enum<LottieCancellationBehavior> {
    public static final LottieCancellationBehavior Immediately = null;
    public static final LottieCancellationBehavior OnIterationFinish = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ LottieCancellationBehavior[] f31075a = null;

    static {
        Immediately = new LottieCancellationBehavior("Immediately", 0);
        OnIterationFinish = new LottieCancellationBehavior("OnIterationFinish", 1);
        f31075a = a();
    }

    LottieCancellationBehavior(String r1, int r2) {
    }

    public static final /* synthetic */ LottieCancellationBehavior[] a() {
        return new LottieCancellationBehavior[]{Immediately, OnIterationFinish};
    }

    public static LottieCancellationBehavior valueOf(String r1) {
        return (LottieCancellationBehavior) Enum.valueOf(LottieCancellationBehavior.class, r1);
    }

    public static LottieCancellationBehavior[] values() {
        return (LottieCancellationBehavior[]) f31075a.clone();
    }
}

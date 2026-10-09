package io.reactivex.internal.operators.flowable;

/* loaded from: classes2.dex */
public enum FlowableInternalHelper$RequestMax extends Enum<FlowableInternalHelper$RequestMax> implements io.reactivex.functions.c {
    public static final FlowableInternalHelper$RequestMax INSTANCE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ FlowableInternalHelper$RequestMax[] f174494a = null;

    static {
        FlowableInternalHelper$RequestMax r02 = new FlowableInternalHelper$RequestMax("INSTANCE", 0);
        INSTANCE = r02;
        f174494a = new FlowableInternalHelper$RequestMax[]{r02};
    }

    FlowableInternalHelper$RequestMax(String r1, int r2) {
    }

    public static FlowableInternalHelper$RequestMax valueOf(String r1) {
        return (FlowableInternalHelper$RequestMax) Enum.valueOf(FlowableInternalHelper$RequestMax.class, r1);
    }

    public static FlowableInternalHelper$RequestMax[] values() {
        return (FlowableInternalHelper$RequestMax[]) f174494a.clone();
    }

    @Override // io.reactivex.functions.c
    public /* bridge */ /* synthetic */ void accept(Object r1) throws Exception {
        accept((org.reactivestreams.c) r1);
    }

    public void accept(org.reactivestreams.c r3) throws Exception {
        r3.request(Long.MAX_VALUE);
    }
}

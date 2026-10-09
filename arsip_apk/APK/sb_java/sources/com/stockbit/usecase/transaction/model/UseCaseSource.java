package com.stockbit.usecase.transaction.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/usecase/transaction/model/UseCaseSource;", "", "<init>", "(Ljava/lang/String;I)V", "TERMS_CONDITION", "BUY_FRAGMENT", "usecase-transaction"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum UseCaseSource extends Enum<UseCaseSource> {
    public static final UseCaseSource BUY_FRAGMENT = null;
    public static final UseCaseSource TERMS_CONDITION = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ UseCaseSource[] f163774a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f163775b = null;

    static {
        TERMS_CONDITION = new UseCaseSource("TERMS_CONDITION", 0);
        BUY_FRAGMENT = new UseCaseSource("BUY_FRAGMENT", 1);
        UseCaseSource[] r02 = a();
        f163774a = r02;
        f163775b = kotlin.enums.b.a(r02);
    }

    UseCaseSource(String r1, int r2) {
    }

    public static final /* synthetic */ UseCaseSource[] a() {
        return new UseCaseSource[]{TERMS_CONDITION, BUY_FRAGMENT};
    }

    public static kotlin.enums.a getEntries() {
        return f163775b;
    }

    public static UseCaseSource valueOf(String r1) {
        return (UseCaseSource) Enum.valueOf(UseCaseSource.class, r1);
    }

    public static UseCaseSource[] values() {
        return (UseCaseSource[]) f163774a.clone();
    }
}

package com.stockbit.repository;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/repository/FetchProfileStrategy;", "", "<init>", "(Ljava/lang/String;I)V", "LOCAL_ONLY", "REMOTE_ONLY", "REMOTE_WITH_LOCAL_FALLBACK", "repository-profile"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum FetchProfileStrategy extends Enum<FetchProfileStrategy> {
    public static final FetchProfileStrategy LOCAL_ONLY = null;
    public static final FetchProfileStrategy REMOTE_ONLY = null;
    public static final FetchProfileStrategy REMOTE_WITH_LOCAL_FALLBACK = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ FetchProfileStrategy[] f129789a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f129790b = null;

    static {
        LOCAL_ONLY = new FetchProfileStrategy("LOCAL_ONLY", 0);
        REMOTE_ONLY = new FetchProfileStrategy("REMOTE_ONLY", 1);
        REMOTE_WITH_LOCAL_FALLBACK = new FetchProfileStrategy("REMOTE_WITH_LOCAL_FALLBACK", 2);
        FetchProfileStrategy[] r02 = a();
        f129789a = r02;
        f129790b = kotlin.enums.b.a(r02);
    }

    FetchProfileStrategy(String r1, int r2) {
    }

    public static final /* synthetic */ FetchProfileStrategy[] a() {
        return new FetchProfileStrategy[]{LOCAL_ONLY, REMOTE_ONLY, REMOTE_WITH_LOCAL_FALLBACK};
    }

    public static kotlin.enums.a getEntries() {
        return f129790b;
    }

    public static FetchProfileStrategy valueOf(String r1) {
        return (FetchProfileStrategy) Enum.valueOf(FetchProfileStrategy.class, r1);
    }

    public static FetchProfileStrategy[] values() {
        return (FetchProfileStrategy[]) f129789a.clone();
    }
}

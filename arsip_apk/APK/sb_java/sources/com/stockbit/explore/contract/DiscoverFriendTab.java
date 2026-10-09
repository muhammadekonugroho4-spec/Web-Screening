package com.stockbit.explore.contract;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/explore/contract/DiscoverFriendTab;", "", "<init>", "(Ljava/lang/String;I)V", "TRENDING", "SUGGESTED", "FRIENDS", "explore-contract_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum DiscoverFriendTab extends Enum<DiscoverFriendTab> {
    public static final DiscoverFriendTab FRIENDS = null;
    public static final DiscoverFriendTab SUGGESTED = null;
    public static final DiscoverFriendTab TRENDING = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ DiscoverFriendTab[] f91688a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f91689b = null;

    static {
        TRENDING = new DiscoverFriendTab("TRENDING", 0);
        SUGGESTED = new DiscoverFriendTab("SUGGESTED", 1);
        FRIENDS = new DiscoverFriendTab("FRIENDS", 2);
        DiscoverFriendTab[] r02 = a();
        f91688a = r02;
        f91689b = kotlin.enums.b.a(r02);
    }

    DiscoverFriendTab(String r1, int r2) {
    }

    public static final /* synthetic */ DiscoverFriendTab[] a() {
        return new DiscoverFriendTab[]{TRENDING, SUGGESTED, FRIENDS};
    }

    public static kotlin.enums.a getEntries() {
        return f91689b;
    }

    public static DiscoverFriendTab valueOf(String r1) {
        return (DiscoverFriendTab) Enum.valueOf(DiscoverFriendTab.class, r1);
    }

    public static DiscoverFriendTab[] values() {
        return (DiscoverFriendTab[]) f91688a.clone();
    }
}

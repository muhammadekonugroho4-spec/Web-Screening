package com.stockbit.explore.contract;

import com.stockbit.navigation.container.ModularNavParam;

/* loaded from: classes8.dex */
public interface a {
    static /* synthetic */ ModularNavParam b(a r02, DiscoverFriendTab r1, int r2, Object r3) {
        if (r3 != null) goto L9;
        if ((r2 & 1) == 0) goto L7;
        r1 = DiscoverFriendTab.TRENDING;
    L7:
        return r02.a(r1);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSuggestionUserNavParam");
    }

    ModularNavParam a(DiscoverFriendTab r1);
}

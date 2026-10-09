package com.stockbit.watchlist.ui.mainv2.delegate;

import com.stockbit.domain.model.Resource;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f170145a = null;

    static {
        int[] r02 = new int[Resource.Status.values().length];
        r02[Resource.Status.SUCCESS.ordinal()] = 1;
        r02[Resource.Status.ERROR.ordinal()] = 2;
        r02[Resource.Status.LOADING.ordinal()] = 3;
        f170145a = r02;
    }
}

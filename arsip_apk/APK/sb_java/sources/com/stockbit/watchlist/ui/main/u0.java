package com.stockbit.watchlist.ui.main;

import com.stockbit.domain.model.Resource;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f169888a = null;

    static {
        int[] r02 = new int[Resource.Status.values().length];
        r02[Resource.Status.LOADING.ordinal()] = 1;     // Catch: NoSuchFieldError -> L8
    L11:
        r02[Resource.Status.SUCCESS.ordinal()] = 2;     // Catch: NoSuchFieldError -> L9
    L15:
        r02[Resource.Status.ERROR.ordinal()] = 3;     // Catch: NoSuchFieldError -> L10
    L6:
        f169888a = r02;
    }
}

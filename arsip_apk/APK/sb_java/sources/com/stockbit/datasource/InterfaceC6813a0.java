package com.stockbit.datasource;

import com.stockbit.datasource.param.screener.ScreenerTemplateDataParam;

/* renamed from: com.stockbit.datasource.a0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC6813a0 {
    Object a(String r1, String r2, kotlin.coroutines.e r3);

    Object b(int r1, int r2, kotlin.coroutines.e r3);

    Object createNewScreener(ScreenerTemplateDataParam r1, kotlin.coroutines.e r2);

    Object deleteScreenerSaved(String r1, kotlin.coroutines.e r2);

    Object getFavoriteScreener(kotlin.coroutines.e r1);

    Object getScreenerSaved(kotlin.coroutines.e r1);
}

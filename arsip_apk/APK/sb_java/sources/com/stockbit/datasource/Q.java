package com.stockbit.datasource;

import com.stockbit.datasource.param.margintrading.CollateralRequestDataParam;
import java.util.List;

/* loaded from: classes8.dex */
public interface Q {
    Object a(List r1, String r2, kotlin.coroutines.e r3);

    Object b(String r1, String r2, kotlin.coroutines.e r3);

    Object getMarginTradingActivation(kotlin.coroutines.e r1);

    Object postMarginActivationCollaterals(CollateralRequestDataParam r1, kotlin.coroutines.e r2);

    Object postMarginAdditionalCollaterals(CollateralRequestDataParam r1, kotlin.coroutines.e r2);
}

package com.stockbit.usecase.movers.mapper;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {
    public a() {
    }

    public com.stockbit.usecase.movers.model.b a(List r9) {
        p.l(r9, "entity");
        if (r9.isEmpty() == false) goto L7;
        return null;
    L7:
        return new com.stockbit.usecase.movers.model.b(r9.contains("FILTER_STOCKS_TYPE_MAIN_BOARD"), r9.contains("FILTER_STOCKS_TYPE_DEVELOPMENT_BOARD"), r9.contains("FILTER_STOCKS_TYPE_ACCELERATION_BOARD"), r9.contains("FILTER_STOCKS_TYPE_NEW_ECONOMY_BOARD"), r9.contains("FILTER_STOCKS_TYPE_SPECIAL_MONITORING_BOARD"), r9.contains("FILTER_STOCKS_TYPE_WARRANT_AND_RIGHT"), r9.contains("FILTER_STOCKS_TYPE_SHARIA"));
    }
}

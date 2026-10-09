package com.stockbit.repository.search.interactor.mapper;

import com.stockbit.dto.search.RecentNegoStockSearchDto;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class b implements com.stockbit.repository.interactor.helper.b {
    public b() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((RecentNegoStockSearchDto) r1);
    }

    public com.stockbit.domain.model.search.c b(RecentNegoStockSearchDto r5) {
        p.l(r5, "dataModel");
        return new com.stockbit.domain.model.search.c(r5.d(), r5.c(), r5.a(), r5.b());
    }

    public final RecentNegoStockSearchDto c(com.stockbit.domain.model.search.c r5) {
        p.l(r5, "entity");
        return new RecentNegoStockSearchDto(r5.d(), r5.c(), r5.a(), r5.b());
    }
}

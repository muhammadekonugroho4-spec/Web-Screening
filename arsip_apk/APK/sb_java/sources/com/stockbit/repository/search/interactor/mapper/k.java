package com.stockbit.repository.search.interactor.mapper;

import com.stockbit.dto.search.SearchPaginationDTO;

/* loaded from: classes10.dex */
public final class k implements com.stockbit.repository.interactor.helper.b {
    public k() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((SearchPaginationDTO) r1);
    }

    public com.stockbit.domain.model.search.j b(SearchPaginationDTO r5) {
        boolean r1 = false;
        if (r5 == null) goto L7;
        Boolean r2 = r5.a();
        if (r2 == null) goto L7;
        boolean r22 = r2.booleanValue();
    L8:
        if (r5 == null) goto L12;
        Boolean r3 = r5.b();
        if (r3 == null) goto L12;
        boolean r32 = r3.booleanValue();
    L13:
        if (r5 == null) goto L18;
        Boolean r52 = r5.c();
        if (r52 == null) goto L18;
        r1 = r52.booleanValue();
    L18:
        return new com.stockbit.domain.model.search.j(r22, r32, r1);
    L12:
        r32 = false;
    L7:
        r22 = false;
        goto L8
    }
}

package com.stockbit.domain.model.mapper.virtual;

import com.stockbit.model.entity.virtual.VirtualAmendResponseData;

/* loaded from: classes8.dex */
public final class e implements com.stockbit.domain.model.mapper.base.a {
    public e() {
    }

    @Override // com.stockbit.domain.model.mapper.base.a
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((VirtualAmendResponseData) r1);
    }

    public com.stockbit.domain.model.entity.virtual.a b(VirtualAmendResponseData r2) {
        if (r2 != null) goto L4;
        return null;
    L4:
        return new com.stockbit.domain.model.entity.virtual.a(r2.a());
    }
}

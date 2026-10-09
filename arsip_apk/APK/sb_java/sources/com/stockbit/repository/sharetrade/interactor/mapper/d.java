package com.stockbit.repository.sharetrade.interactor.mapper;

import com.stockbit.dto.sharetrade.ShareTradeTargetDTO;

/* loaded from: classes4.dex */
public final class d implements com.stockbit.repository.interactor.helper.b {
    public d() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((ShareTradeTargetDTO) r1);
    }

    public com.stockbit.domain.model.sharetrade.c b(ShareTradeTargetDTO r12) {
        Boolean r1 = null;
        if (r12 == null) goto L5;
        Integer r2 = r12.c();
    L6:
        if (r12 == null) goto L8;
        String r3 = r12.f();
    L9:
        if (r12 == null) goto L11;
        String r4 = r12.e();
    L12:
        if (r12 == null) goto L14;
        String r5 = r12.d();
    L15:
        if (r12 == null) goto L17;
        String r6 = r12.b();
    L18:
        if (r12 == null) goto L20;
        String r7 = r12.a();
    L21:
        if (r12 == null) goto L23;
        Boolean r8 = r12.i();
    L24:
        if (r12 == null) goto L26;
        Boolean r9 = r12.g();
    L27:
        if (r12 == null) goto L30;
        r1 = r12.h();
    L30:
        return new com.stockbit.domain.model.sharetrade.c(r2, r3, r4, r5, r6, r7, r8, r9, r1);
    L26:
        r9 = null;
        goto L27
    L23:
        r8 = null;
        goto L24
    L20:
        r7 = null;
        goto L21
    L17:
        r6 = null;
        goto L18
    L14:
        r5 = null;
        goto L15
    L11:
        r4 = null;
        goto L12
    L8:
        r3 = null;
        goto L9
    L5:
        r2 = null;
        goto L6
    }
}

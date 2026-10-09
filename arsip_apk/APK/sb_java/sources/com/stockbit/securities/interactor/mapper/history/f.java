package com.stockbit.securities.interactor.mapper.history;

import com.stockbit.dto.securities.HistorySBNDTO;

/* loaded from: classes11.dex */
public final class f implements com.stockbit.repository.interactor.helper.b {
    public f() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((HistorySBNDTO) r1);
    }

    public com.stockbit.domain.model.securities.i b(HistorySBNDTO r8) {
        String r1 = null;
        if (r8 == null) goto L5;
        String r2 = r8.b();
    L7:
        if (r2 != null) goto L9;
        r2 = "";
    L9:
        if (r8 == null) goto L11;
        String r4 = r8.d();
    L12:
        if (r4 != null) goto L14;
        r4 = "";
    L14:
        if (r8 == null) goto L16;
        String r5 = r8.c();
    L17:
        if (r5 != null) goto L19;
        r5 = "";
    L19:
        if (r8 == null) goto L21;
        String r6 = r8.e();
    L22:
        if (r6 != null) goto L24;
        r6 = "";
    L24:
        if (r8 == null) goto L26;
        r1 = r8.a();
    L26:
        if (r1 != null) goto L29;
        String r12 = r5;
        String r52 = "";
        String r3 = r12;
    L31:
        return new com.stockbit.domain.model.securities.i(r2, r4, r3, r6, r52);
    L29:
        r3 = r5;
        r52 = r1;
        goto L31
    L21:
        r6 = null;
        goto L22
    L16:
        r5 = null;
        goto L17
    L11:
        r4 = null;
        goto L12
    L5:
        r2 = null;
        goto L7
    }
}

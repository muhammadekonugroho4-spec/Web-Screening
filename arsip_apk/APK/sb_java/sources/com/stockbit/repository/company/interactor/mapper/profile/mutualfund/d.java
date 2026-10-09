package com.stockbit.repository.company.interactor.mapper.profile.mutualfund;

import com.stockbit.dto.mutualfund.profile.MutualFundFileDTO;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class d implements com.stockbit.repository.interactor.helper.b {
    public d() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((MutualFundFileDTO) r1);
    }

    public com.stockbit.domain.model.mutualfund.profile.c b(MutualFundFileDTO r6) {
        p.l(r6, "dataModel");
        String r1 = r6.c();
        String r2 = "";
        if (r1 != null) goto L5;
        r1 = "";
    L5:
        String r3 = r6.b();
        if (r3 != null) goto L8;
        r3 = "";
    L8:
        String r4 = r6.a();
        if (r4 != null) goto L11;
        r4 = "";
    L11:
        String r62 = r6.d();
        if (r62 == null) goto L16;
        r2 = r62;
    L16:
        return new com.stockbit.domain.model.mutualfund.profile.c(r1, r3, r4, r2);
    }
}

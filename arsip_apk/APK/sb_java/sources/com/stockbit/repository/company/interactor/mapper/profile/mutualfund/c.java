package com.stockbit.repository.company.interactor.mapper.profile.mutualfund;

import com.stockbit.dto.mutualfund.profile.MutualFundFeeDTO;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class c implements com.stockbit.repository.interactor.helper.b {
    public c() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((MutualFundFeeDTO) r1);
    }

    public com.stockbit.domain.model.mutualfund.profile.b b(MutualFundFeeDTO r4) {
        p.l(r4, "dataModel");
        String r1 = r4.a();
        String r2 = "";
        if (r1 != null) goto L5;
        r1 = "";
    L5:
        String r42 = r4.b();
        if (r42 == null) goto L10;
        r2 = r42;
    L10:
        return new com.stockbit.domain.model.mutualfund.profile.b(r1, r2);
    }
}

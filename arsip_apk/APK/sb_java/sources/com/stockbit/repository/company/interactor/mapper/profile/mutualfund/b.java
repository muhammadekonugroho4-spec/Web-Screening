package com.stockbit.repository.company.interactor.mapper.profile.mutualfund;

import com.stockbit.dto.mutualfund.profile.MutualFundAssetAllocationDTO;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class b implements com.stockbit.repository.interactor.helper.b {
    public b() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((MutualFundAssetAllocationDTO) r1);
    }

    public com.stockbit.domain.model.mutualfund.profile.a b(MutualFundAssetAllocationDTO r4) {
        p.l(r4, "dataModel");
        String r1 = r4.b();
        String r2 = "";
        if (r1 != null) goto L5;
        r1 = "";
    L5:
        String r42 = r4.a();
        if (r42 == null) goto L10;
        r2 = r42;
    L10:
        return new com.stockbit.domain.model.mutualfund.profile.a(r1, r2);
    }
}

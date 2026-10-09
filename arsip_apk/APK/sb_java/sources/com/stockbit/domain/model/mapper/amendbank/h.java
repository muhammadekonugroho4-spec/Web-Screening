package com.stockbit.domain.model.mapper.amendbank;

import com.stockbit.domain.model.entity.k;
import com.stockbit.model.entity.LivenessScoreResponseData;

/* loaded from: classes8.dex */
public final class h implements com.stockbit.domain.model.mapper.base.a {
    public h() {
    }

    @Override // com.stockbit.domain.model.mapper.base.a
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((LivenessScoreResponseData) r1);
    }

    public k b(LivenessScoreResponseData r4) {
        Boolean r1 = null;
        if (r4 == null) goto L5;
        String r2 = r4.a();
    L6:
        if (r4 == null) goto L9;
        r1 = r4.b();
    L9:
        return new k(r2, com.stockbit.domain.extension.a.a(r1));
    L5:
        r2 = null;
        goto L6
    }
}

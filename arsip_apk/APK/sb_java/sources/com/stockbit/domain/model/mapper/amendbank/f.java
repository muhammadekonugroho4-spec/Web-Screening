package com.stockbit.domain.model.mapper.amendbank;

import com.stockbit.domain.model.entity.j;
import com.stockbit.model.entity.LivenessLicenseResponseData;

/* loaded from: classes8.dex */
public final class f implements com.stockbit.domain.model.mapper.base.a {
    public f() {
    }

    @Override // com.stockbit.domain.model.mapper.base.a
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((LivenessLicenseResponseData) r1);
    }

    public j b(LivenessLicenseResponseData r4) {
        String r1 = null;
        if (r4 == null) goto L5;
        String r2 = r4.b();
    L6:
        if (r4 == null) goto L9;
        r1 = r4.a();
    L9:
        return new j(r2, r1);
    L5:
        r2 = null;
        goto L6
    }
}

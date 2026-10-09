package com.stockbit.domain.model.mapper.oa;

import com.stockbit.domain.model.valueobject.openingaccount.OAVerificationStep;
import com.stockbit.model.entity.oastatus.OAVerificationStepResponseData;

/* loaded from: classes8.dex */
public final class g implements com.stockbit.domain.model.mapper.base.a {
    public g() {
    }

    @Override // com.stockbit.domain.model.mapper.base.a
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return c((OAVerificationStepResponseData) r1);
    }

    public OAVerificationStepResponseData b(OAVerificationStep r4) {
        String r1 = null;
        if (r4 == null) goto L5;
        Integer r2 = r4.a();
    L6:
        if (r4 == null) goto L9;
        r1 = r4.b();
    L9:
        return new OAVerificationStepResponseData(r2, r1);
    L5:
        r2 = null;
        goto L6
    }

    public OAVerificationStep c(OAVerificationStepResponseData r3) {
        if (r3 != null) goto L6;
        return null;
    L6:
        return new OAVerificationStep(r3.a(), r3.b());
    }
}

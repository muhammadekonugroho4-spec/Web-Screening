package com.stockbit.domain.model.mapper.oa;

import com.stockbit.domain.model.valueobject.openingaccount.OAAccountCitizenship;
import com.stockbit.model.entity.oastatus.OAAccountCitizenshipResponseData;

/* loaded from: classes8.dex */
public final class a implements com.stockbit.domain.model.mapper.base.a {
    public a() {
    }

    @Override // com.stockbit.domain.model.mapper.base.a
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return c((OAAccountCitizenshipResponseData) r1);
    }

    public OAAccountCitizenshipResponseData b(OAAccountCitizenship r2) {
        if (r2 == null) goto L5;
        String r22 = r2.a();
    L7:
        return new OAAccountCitizenshipResponseData(r22);
    L5:
        r22 = null;
        goto L7
    }

    public OAAccountCitizenship c(OAAccountCitizenshipResponseData r2) {
        if (r2 != null) goto L6;
        return null;
    L6:
        return new OAAccountCitizenship(r2.a());
    }
}

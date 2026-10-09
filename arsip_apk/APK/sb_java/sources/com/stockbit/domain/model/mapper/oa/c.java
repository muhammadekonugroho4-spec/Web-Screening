package com.stockbit.domain.model.mapper.oa;

import com.stockbit.domain.model.valueobject.openingaccount.OANoteError;
import com.stockbit.model.entity.oastatus.OANoteErrorResponseData;

/* loaded from: classes8.dex */
public final class c implements com.stockbit.domain.model.mapper.base.a {
    public c() {
    }

    @Override // com.stockbit.domain.model.mapper.base.a
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return c((OANoteErrorResponseData) r1);
    }

    public OANoteErrorResponseData b(OANoteError r4) {
        String r1 = null;
        if (r4 == null) goto L5;
        String r2 = r4.b();
    L6:
        if (r4 == null) goto L9;
        r1 = r4.a();
    L9:
        return new OANoteErrorResponseData(r2, r1);
    L5:
        r2 = null;
        goto L6
    }

    public OANoteError c(OANoteErrorResponseData r3) {
        if (r3 != null) goto L6;
        return null;
    L6:
        return new OANoteError(r3.b(), r3.a());
    }
}

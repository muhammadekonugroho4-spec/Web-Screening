package com.stockbit.domain.model.mapper.stream;

import com.stockbit.model.entity.YoutubeMetaResponseData;

/* loaded from: classes8.dex */
public final class n implements com.stockbit.domain.model.mapper.base.a {
    public n() {
    }

    @Override // com.stockbit.domain.model.mapper.base.a
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((YoutubeMetaResponseData) r1);
    }

    public com.stockbit.domain.model.valueobject.stream.n b(YoutubeMetaResponseData r7) {
        if (r7 != null) goto L6;
        return null;
    L6:
        return new com.stockbit.domain.model.valueobject.stream.n(r7.e(), r7.a(), r7.b(), r7.d(), r7.c());
    }
}

package com.stockbit.domain.model.mapper.stream;

import com.stockbit.domain.model.valueobject.Sentiment;
import com.stockbit.model.entity.SentimentResponseData;

/* loaded from: classes8.dex */
public final class e implements com.stockbit.domain.model.mapper.base.a {
    public e() {
    }

    @Override // com.stockbit.domain.model.mapper.base.a
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return c((SentimentResponseData) r1);
    }

    public SentimentResponseData b(Sentiment r5) {
        if (r5 != null) goto L4;
        return null;
    L4:
        return new SentimentResponseData(r5.c(), r5.a(), r5.d(), r5.b());
    }

    public Sentiment c(SentimentResponseData r5) {
        if (r5 != null) goto L4;
        return null;
    L4:
        return new Sentiment(r5.c(), r5.a(), r5.d(), r5.b());
    }
}

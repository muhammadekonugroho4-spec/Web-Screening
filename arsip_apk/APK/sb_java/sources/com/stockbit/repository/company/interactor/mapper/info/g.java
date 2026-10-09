package com.stockbit.repository.company.interactor.mapper.info;

import com.stockbit.domain.model.company.info.h;
import com.stockbit.dto.company.info.CompanySentimentDTO;

/* loaded from: classes10.dex */
public final class g implements com.stockbit.repository.interactor.helper.b {
    public g() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((CompanySentimentDTO) r1);
    }

    public h b(CompanySentimentDTO r11) {
        String r1 = null;
        if (r11 == null) goto L5;
        Double r2 = r11.c();
    L6:
        double r22 = com.stockbit.repository.interactor.helper.d.a(r2);
        if (r11 == null) goto L9;
        Double r4 = r11.a();
    L10:
        double r42 = com.stockbit.repository.interactor.helper.d.a(r4);
        if (r11 == null) goto L13;
        Double r6 = r11.d();
    L14:
        double r62 = com.stockbit.repository.interactor.helper.d.a(r6);
        if (r11 == null) goto L17;
        r1 = r11.b();
    L17:
        if (r1 != null) goto L20;
        r1 = "";
    L20:
        return new h(r22, r42, r62, r1);
    L13:
        r6 = null;
        goto L14
    L9:
        r4 = null;
        goto L10
    L5:
        r2 = null;
        goto L6
    }
}

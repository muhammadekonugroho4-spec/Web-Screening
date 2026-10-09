package com.data.repositories.stream.interactor.mapper.notes;

import com.stockbit.domain.model.stream.notes.h;
import com.stockbit.dto.stream.notes.CompanyNoteUserDTO;

/* loaded from: classes4.dex */
public final class f implements com.stockbit.repository.interactor.helper.b {
    public f() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((CompanyNoteUserDTO) r1);
    }

    public h b(CompanyNoteUserDTO r4) {
        String r1 = null;
        if (r4 == null) goto L5;
        Integer r2 = r4.a();
    L6:
        int r22 = com.stockbit.repository.interactor.helper.d.b(r2);
        if (r4 == null) goto L9;
        r1 = r4.b();
    L9:
        if (r1 != null) goto L12;
        r1 = "";
    L12:
        return new h(r22, r1);
    L5:
        r2 = null;
        goto L6
    }
}

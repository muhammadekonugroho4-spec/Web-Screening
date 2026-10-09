package com.data.repositories.login.interactor.mapper;

import com.stockbit.dto.auth.BiometricSetupDTO;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class b implements com.stockbit.repository.interactor.helper.b {
    public b() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((BiometricSetupDTO) r1);
    }

    public String b(BiometricSetupDTO r2) {
        p.l(r2, "dataModel");
        String r22 = r2.a();
        if (r22 != null) goto L6;
        return "";
    L6:
        return r22;
    }
}

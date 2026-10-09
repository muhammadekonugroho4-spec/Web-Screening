package com.stockbit.repositories.trusteddevice.interactor.mapper;

import com.stockbit.dto.trusteddevice.LoginRequesterDetailDTO;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class c implements com.stockbit.repository.interactor.helper.b {
    public c() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((LoginRequesterDetailDTO) r1);
    }

    public com.stockbit.domain.model.trusteddevice.c b(LoginRequesterDetailDTO r11) {
        p.l(r11, "dataModel");
        String r02 = r11.g();
        if (r02 != null) goto L5;
        r02 = "";
    L5:
        String r3 = r11.d();
        if (r3 != null) goto L8;
        r3 = "";
    L8:
        String r4 = r11.h();
        if (r4 != null) goto L11;
        r4 = "";
    L11:
        String r5 = r11.c();
        if (r5 != null) goto L14;
        r5 = "";
    L14:
        String r6 = r11.e();
        if (r6 != null) goto L17;
        r6 = "";
    L17:
        String r7 = r11.a();
        if (r7 != null) goto L20;
        r7 = "";
    L20:
        String r8 = r11.b();
        if (r8 != null) goto L23;
        r8 = "";
    L23:
        String r112 = r11.f();
        if (r112 != null) goto L27;
        String r9 = "";
    L29:
        return new com.stockbit.domain.model.trusteddevice.c(r02, r3, r4, r5, r6, r7, r8, r9);
    L27:
        r9 = r112;
        goto L29
    }
}

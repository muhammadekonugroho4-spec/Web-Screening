package com.stockbit.repositories.gifinteractor.mapper;

import com.stockbit.dto.giphy.GiphyImageContentDTO;

/* loaded from: classes10.dex */
public final class a implements com.stockbit.repository.interactor.helper.b {
    public a() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((GiphyImageContentDTO) r1);
    }

    public com.stockbit.domain.model.giphy.b b(GiphyImageContentDTO r11) {
        String r1 = null;
        if (r11 == null) goto L5;
        String r2 = r11.e();
    L7:
        if (r2 != null) goto L9;
        r2 = "";
    L9:
        if (r11 == null) goto L11;
        String r4 = r11.h();
    L12:
        if (r4 != null) goto L14;
        r4 = "";
    L14:
        if (r11 == null) goto L16;
        String r5 = r11.a();
    L17:
        if (r5 != null) goto L19;
        r5 = "";
    L19:
        if (r11 == null) goto L21;
        String r6 = r11.d();
    L22:
        if (r6 != null) goto L24;
        r6 = "";
    L24:
        if (r11 == null) goto L26;
        String r7 = r11.b();
    L27:
        if (r7 != null) goto L29;
        r7 = "";
    L29:
        if (r11 == null) goto L31;
        String r8 = r11.c();
    L32:
        if (r8 != null) goto L34;
        r8 = "";
    L34:
        if (r11 == null) goto L36;
        String r9 = r11.f();
    L37:
        if (r9 != null) goto L39;
        r9 = "";
    L39:
        if (r11 == null) goto L41;
        r1 = r11.g();
    L41:
        if (r1 != null) goto L44;
        String r12 = r2;
        String r22 = r4;
        String r42 = r6;
        String r62 = r8;
        String r82 = "";
    L46:
        return new com.stockbit.domain.model.giphy.b(r12, r22, r5, r42, r7, r62, r9, r82);
    L44:
        String r3 = r8;
        r82 = r1;
        r12 = r2;
        r22 = r4;
        r42 = r6;
        r62 = r3;
        goto L46
    L36:
        r9 = null;
        goto L37
    L31:
        r8 = null;
        goto L32
    L26:
        r7 = null;
        goto L27
    L21:
        r6 = null;
        goto L22
    L16:
        r5 = null;
        goto L17
    L11:
        r4 = null;
        goto L12
    L5:
        r2 = null;
        goto L7
    }
}

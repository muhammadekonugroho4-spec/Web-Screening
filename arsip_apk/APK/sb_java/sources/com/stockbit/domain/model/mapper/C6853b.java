package com.stockbit.domain.model.mapper;

import com.stockbit.domain.model.entity.C6851d;
import com.stockbit.model.entity.AwsTokenLegacyResponseData;

/* renamed from: com.stockbit.domain.model.mapper.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6853b implements com.stockbit.domain.model.mapper.base.a {
    public C6853b() {
    }

    @Override // com.stockbit.domain.model.mapper.base.a
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return c((AwsTokenLegacyResponseData) r1);
    }

    public AwsTokenLegacyResponseData b(C6851d r9) {
        String r1 = null;
        if (r9 == null) goto L5;
        String r2 = r9.c();
    L6:
        if (r9 == null) goto L8;
        String r3 = r9.a();
    L10:
        if (r3 != null) goto L12;
        r3 = "";
    L12:
        if (r9 == null) goto L14;
        String r5 = r9.f();
    L15:
        if (r5 != null) goto L17;
        r5 = "";
    L17:
        if (r9 == null) goto L19;
        String r6 = r9.d();
    L20:
        if (r6 != null) goto L22;
        r6 = "";
    L22:
        if (r9 == null) goto L24;
        String r7 = r9.e();
    L25:
        if (r7 != null) goto L27;
        r7 = "";
    L27:
        if (r9 == null) goto L29;
        r1 = r9.b();
    L29:
        if (r1 != null) goto L32;
        String r12 = r6;
        String r62 = "";
        String r4 = r12;
    L34:
        return new AwsTokenLegacyResponseData(r2, r3, r5, r4, r7, r62);
    L32:
        r4 = r6;
        r62 = r1;
        goto L34
    L24:
        r7 = null;
        goto L25
    L19:
        r6 = null;
        goto L20
    L14:
        r5 = null;
        goto L15
    L8:
        r3 = null;
        goto L10
    L5:
        r2 = null;
        goto L6
    }

    public C6851d c(AwsTokenLegacyResponseData r8) {
        if (r8 != null) goto L5;
        return null;
    L5:
        String r1 = r8.c();
        if (r1 != null) goto L9;
        r1 = "";
    L9:
        return new C6851d(r1, r8.a(), r8.f(), r8.d(), r8.e(), r8.b());
    }
}

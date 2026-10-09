package com.stockbit.cryptotransaction.interactor.mapper.ws;

import com.stockbit.dto.cryptotransaction.ws.CryptoTickerPatchDTO;
import com.stockbit.usecase.cryptotransaction.contract.entity.k;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {
    public b() {
    }

    public final k a(k r23, CryptoTickerPatchDTO r24) {
        p.l(r24, "patch");
        String r02 = r24.c();
        Double r2 = null;
        if (r02 != null) goto L9;
        if (r23 == null) goto L6;
        r02 = r23.c();
    L7:
        if (r02 != null) goto L9;
        r02 = "";
        goto L9
    L6:
        r02 = null;
    L9:
        Double r3 = r24.e();
        double r4 = 0.0d;
        if (r3 == null) goto L12;
    L11:
        double r6 = r3.doubleValue();
    L18:
        Double r32 = r24.a();
        if (r32 == null) goto L21;
    L20:
        double r8 = r32.doubleValue();
    L27:
        Double r33 = r24.b();
        if (r33 == null) goto L30;
    L29:
        double r10 = r33.doubleValue();
    L36:
        Double r34 = r24.g();
        if (r34 == null) goto L39;
    L38:
        double r12 = r34.doubleValue();
    L45:
        Double r35 = r24.d();
        if (r35 == null) goto L48;
    L47:
        double r14 = r35.doubleValue();
    L54:
        Double r36 = r24.f();
        if (r36 == null) goto L57;
    L56:
        double r16 = r36.doubleValue();
    L63:
        Double r37 = r24.h();
        if (r37 == null) goto L67;
        r4 = r37.doubleValue();
    L72:
        return new k(r02, r6, r8, r10, r12, r14, r16, r4);
    L67:
        if (r23 == null) goto L69;
        r2 = Double.valueOf(r23.h());
    L69:
        if (r2 == null) goto L72;
        r4 = r2.doubleValue();
        goto L72
    L57:
        if (r23 == null) goto L59;
        r36 = Double.valueOf(r23.f());
    L60:
        if (r36 != null) goto L56;
        r16 = 0.0d;
        goto L63
    L59:
        r36 = null;
        goto L60
    L48:
        if (r23 == null) goto L50;
        r35 = Double.valueOf(r23.d());
    L51:
        if (r35 != null) goto L47;
        r14 = 0.0d;
        goto L54
    L50:
        r35 = null;
        goto L51
    L39:
        if (r23 == null) goto L41;
        r34 = Double.valueOf(r23.g());
    L42:
        if (r34 != null) goto L38;
        r12 = 0.0d;
        goto L45
    L41:
        r34 = null;
        goto L42
    L30:
        if (r23 == null) goto L32;
        r33 = Double.valueOf(r23.b());
    L33:
        if (r33 != null) goto L29;
        r10 = 0.0d;
        goto L36
    L32:
        r33 = null;
        goto L33
    L21:
        if (r23 == null) goto L23;
        r32 = Double.valueOf(r23.a());
    L24:
        if (r32 != null) goto L20;
        r8 = 0.0d;
        goto L27
    L23:
        r32 = null;
        goto L24
    L12:
        if (r23 == null) goto L14;
        r3 = Double.valueOf(r23.e());
    L15:
        if (r3 != null) goto L11;
        r6 = 0.0d;
        goto L18
    L14:
        r3 = null;
        goto L15
    }
}

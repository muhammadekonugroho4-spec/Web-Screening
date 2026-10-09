package com.stockbit.repository.insider;

import com.stockbit.domain.param.company.b;
import java.util.List;
import kotlin.coroutines.e;

/* loaded from: classes10.dex */
public interface a {
    Object a(String r1, String r2, String r3, int r4, String r5, String r6, e r7);

    Object b(int r1, List r2, String r3, String r4, String r5, String r6, String r7, e r8);

    Object c(String r1, String r2, String r3, e r4);

    Object d(String r1, String r2, int r3, e r4);

    Object e(b r1, e r2);

    Object getShareholdingCompanies(String r1, e r2);

    Object getShareholdingInvestor(String r1, e r2);
}

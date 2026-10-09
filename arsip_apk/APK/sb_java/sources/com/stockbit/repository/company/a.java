package com.stockbit.repository.company;

import java.util.List;
import kotlin.coroutines.e;

/* loaded from: classes10.dex */
public interface a {
    static /* synthetic */ Object B(a r1, String r2, String r3, String r4, String r5, boolean r6, e r7, int r8, Object r9) {
        if (r9 != null) goto L15;
        if ((r8 & 2) == 0) goto L7;
        r3 = "";
    L7:
        if ((r8 & 4) == 0) goto L10;
        r4 = "";
    L10:
        if ((r8 & 16) == 0) goto L13;
        r6 = false;
    L13:
        return r1.h(r2, r3, r4, r5, r6, r7);
    L15:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCompanyChart");
    }

    Object A(String r1, e r2);

    Object a(String r1, int r2, int r3, e r4);

    Object b(String r1, String r2, String r3, String r4, List r5, String r6, boolean r7, e r8);

    Object c(String r1, e r2);

    Object d(String r1, e r2);

    Object deleteCompanyCompetitor(String r1, String r2, e r3);

    Object e(String r1, Integer r2, e r3);

    Object f(String r1, int r2, int r3, e r4);

    Object g(int r1, String r2, String r3, List r4, String r5, String r6, Integer r7, Integer r8, Float r9, Float r10, Double r11, Double r12, Integer r13, String r14, String r15, String r16, String r17, String r18, String r19, e r20);

    Object getAnalystConsensus(String r1, e r2);

    Object getAnalystRating(String r1, e r2);

    Object getBrokerFlow(String r1, List r2, String r3, String r4, String r5, String r6, String r7, e r8);

    Object getCompanyCompetitors(String r1, e r2);

    Object getCompanyMarketPrice(String r1, String r2, List r3, e r4);

    Object getCompanyPricePerformance(String r1, e r2);

    Object getCompanyProfile(String r1, e r2);

    Object getCompanyResearch(String r1, e r2);

    Object getCompanyShareholderToken(e r1);

    Object getCompanySubsidiary(String r1, e r2);

    Object getCorpActionStatus(String r1, e r2);

    Object getCorpActionStockConversion(String r1, int r2, int r3, e r4);

    Object getForeignDomesticPeriod(String r1, e r2);

    Object getMutualFundProfile(String r1, e r2);

    Object getSeasonalityYears(String r1, e r2);

    Object h(String r1, String r2, String r3, String r4, boolean r5, e r6);

    Object i(String r1, e r2);

    Object j(String r1, e r2);

    Object k(String r1, e r2);

    Object l(String r1, boolean r2, e r3);

    Object m(String r1, e r2);

    Object n(String r1, String r2, e r3);

    Object o(String r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, boolean r10, e r11);

    Object p(String r1, String r2, e r3);

    Object q(String r1, String r2, String r3, e r4);

    Object r(String r1, e r2);

    Object s(String r1, e r2);

    Object t(String r1, e r2);

    Object u(String r1, String r2, String r3, String r4, String r5, e r6);

    Object v(int r1, String r2, String r3, String r4, String r5, List r6, String r7, Integer r8, Integer r9, Float r10, Float r11, Double r12, Double r13, Integer r14, Integer r15, String r16, String r17, String r18, String r19, String r20, String r21, String r22, Integer r23, String r24, e r25);

    Object w(String r1, e r2);

    Object x(String r1, e r2);

    Object y(String r1, e r2);

    Object z(com.stockbit.domain.param.company.a r1, e r2);
}

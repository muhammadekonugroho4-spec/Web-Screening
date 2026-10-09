package com.stockbit.domain.model.mapper.withdrawaldeposit.withdrawal.foreign;

import com.stockbit.model.entity.withdrawal.foreign.WithdrawalForeignBankRulesCurrencyData;

/* loaded from: classes8.dex */
public final class b implements com.stockbit.domain.model.mapper.base.a {
    public b() {
    }

    @Override // com.stockbit.domain.model.mapper.base.a
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((WithdrawalForeignBankRulesCurrencyData) r1);
    }

    public com.stockbit.domain.model.entity.withdrawal.foreign.b b(WithdrawalForeignBankRulesCurrencyData r6) {
        if (r6 != null) goto L6;
        return null;
    L6:
        return new com.stockbit.domain.model.entity.withdrawal.foreign.b(r6.a(), r6.b(), r6.b() + " (" + r6.a() + ')');
    }
}

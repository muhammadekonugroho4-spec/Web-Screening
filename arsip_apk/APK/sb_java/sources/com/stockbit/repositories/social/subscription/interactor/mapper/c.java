package com.stockbit.repositories.social.subscription.interactor.mapper;

import com.stockbit.domain.model.socialsubscription.d;
import com.stockbit.dto.socialsubscription.SocialSubscriptionVerifyDTO;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class c implements com.stockbit.repository.interactor.helper.b {
    public c() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((SocialSubscriptionVerifyDTO) r1);
    }

    public d b(SocialSubscriptionVerifyDTO r5) {
        p.l(r5, "dataModel");
        SocialSubscriptionVerifyDTO.SubscriptionDTO r1 = r5.a();
        String r2 = null;
        if (r1 == null) goto L5;
        String r12 = r1.a();
    L6:
        String r3 = "";
        if (r12 != null) goto L9;
        r12 = "";
    L9:
        SocialSubscriptionVerifyDTO.SubscriptionDTO r52 = r5.a();
        if (r52 == null) goto L12;
        r2 = r52.b();
    L12:
        if (r2 == null) goto L16;
        r3 = r2;
    L16:
        return new d(r12, r3);
    L5:
        r12 = null;
        goto L6
    }
}

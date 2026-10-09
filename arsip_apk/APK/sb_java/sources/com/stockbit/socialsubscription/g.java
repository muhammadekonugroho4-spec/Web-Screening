package com.stockbit.socialsubscription;

import androidx.fragment.app.DialogInterfaceOnCancelListenerC3947l;
import com.stockbit.socialsubscription.ui.dialog.SubscriptionSuccessDialog;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class g implements com.stockbit.socialsubscription.contract.b {
    static {
    }

    public g() {
    }

    @Override // com.stockbit.socialsubscription.contract.b
    public DialogInterfaceOnCancelListenerC3947l a(String r2, String r3) {
        p.l(r2, "duration");
        p.l(r3, "expiredDate");
        return SubscriptionSuccessDialog.f137745u.a(r2, r3);
    }
}

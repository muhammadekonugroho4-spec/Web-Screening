package com.stockbit.tradingcommunity.ui.loading;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class b extends Dialog {
    static {
    }

    public b(Context r2) {
        p.l(r2, "context");
        super(r2, com.stockbit.tradingcommunity.g.f149346b);
    }

    public final void a() {
        dismiss();
    }

    public final void b() {
        show();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle r1) {
        super.onCreate(r1);
        requestWindowFeature(1);
        setContentView(com.stockbit.tradingcommunity.e.f149262j);
        setCancelable(false);
    }
}

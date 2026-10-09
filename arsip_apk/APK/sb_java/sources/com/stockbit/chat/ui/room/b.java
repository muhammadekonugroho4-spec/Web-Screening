package com.stockbit.chat.ui.room;

import androidx.lifecycle.F;
import com.clevertap.android.sdk.Constants;
import com.stockbit.common.utils.C5872w;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class b implements F {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.functions.l f58007a;

    static {
    }

    public b(kotlin.jvm.functions.l r2) {
        p.l(r2, Constants.KEY_ACTION);
        this.f58007a = r2;
    }

    @Override // androidx.lifecycle.F
    public /* bridge */ /* synthetic */ void a(Object r1) {
        b((C5872w) r1);
    }

    public void b(C5872w r2) {
        p.l(r2, "value");
        com.stockbit.chat.ui.more.k r22 = (com.stockbit.chat.ui.more.k) r2.a();
        if (r22 == null) goto L6;
        this.f58007a.invoke(r22);
        return;
    }
}

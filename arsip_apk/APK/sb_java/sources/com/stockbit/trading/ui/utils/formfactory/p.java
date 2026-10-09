package com.stockbit.trading.ui.utils.formfactory;

import android.view.View;
import com.stockbit.domain.model.valueobject.securities.Field;

/* loaded from: classes11.dex */
public interface p {
    boolean a();

    default void b(Field r2) {
        kotlin.jvm.internal.p.l(r2, "field");
    }

    void c(kotlin.jvm.functions.p r1);

    default void d() {
    }

    default void e(String r2, kotlin.jvm.functions.a r3) {
        kotlin.jvm.internal.p.l(r2, "fieldKey");
        kotlin.jvm.internal.p.l(r3, "clear");
        if (com.stockbit.trading.ui.utils.e.f148718a.b().contains(r2) == false) goto L5;
        return;
    L5:
        r3.invoke();
    }

    void f();

    View g();
}

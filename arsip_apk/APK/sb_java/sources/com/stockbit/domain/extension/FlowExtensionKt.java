package com.stockbit.domain.extension;

import kotlin.jvm.internal.p;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes8.dex */
public abstract class FlowExtensionKt {
    public static final Flow a(final Flow r1, final com.stockbit.domain.model.mapper.base.a r2) {
        p.l(r1, "<this>");
        p.l(r2, "domain");
        return new FlowExtensionKt$mapListResource$$inlined$map$1(r1, r2);
    }

    public static final Flow b(final Flow r1, final com.stockbit.domain.model.mapper.base.a r2) {
        p.l(r1, "<this>");
        p.l(r2, "domain");
        return new FlowExtensionKt$mapListResourceLegacy$$inlined$map$1(r1, r2);
    }

    public static final Flow c(final Flow r1, final com.stockbit.domain.model.mapper.base.a r2) {
        p.l(r1, "<this>");
        p.l(r2, "domain");
        return new FlowExtensionKt$mapResource$$inlined$map$1(r1, r2);
    }

    public static final Flow d(final Flow r1, final com.stockbit.domain.model.mapper.base.a r2) {
        p.l(r1, "<this>");
        p.l(r2, "domain");
        return new FlowExtensionKt$mapResourceLegacy$$inlined$map$1(r1, r2);
    }
}

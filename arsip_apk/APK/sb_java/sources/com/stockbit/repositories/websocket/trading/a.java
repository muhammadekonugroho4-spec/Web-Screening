package com.stockbit.repositories.websocket.trading;

import kotlinx.coroutines.flow.Flow;

/* loaded from: classes10.dex */
public interface a {
    void a(com.stockbit.domain.model.websocket.trading.a r1);

    Flow b();

    Flow observeResponse();
}

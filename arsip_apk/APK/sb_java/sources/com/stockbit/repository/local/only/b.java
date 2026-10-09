package com.stockbit.repository.local.only;

import com.stockbit.domain.model.auth.f;
import com.stockbit.domain.model.session.TradingLoginState;
import java.util.List;
import kotlin.coroutines.e;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes10.dex */
public interface b {
    Flow a();

    Object b(String r1, e r2);

    Flow c();

    void d(List r1);

    Object e(f r1, e r2);

    Object f(String r1, com.stockbit.domain.param.movers.a r2, e r3);

    Object g(Boolean r1, e r2);

    Flow getUserId();

    Flow h(String r1);

    List i();

    Object j(TradingLoginState r1, e r2);

    Object k(String r1, e r2);

    String l();

    Object m(String r1, e r2);

    Object n(String r1, e r2);

    List o();

    Object p(String r1, e r2);

    Flow q();

    Flow r();

    Object s(List r1, e r2);

    void t(List r1);

    Object u(String r1, e r2);

    Object v(String r1, e r2);

    Object w(f r1, boolean r2, e r3);

    Integer x();

    Integer y();
}

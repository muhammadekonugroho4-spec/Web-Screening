package com.stockbit.academy.util;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.AbstractC11777v;

/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f44446a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final Lazy f44447b = null;

    static {
        f44446a = new c();
        f44447b = LazyKt.lazy(new b());
    }

    public c() {
    }

    public static /* synthetic */ List a() {
        return c();
    }

    public static final List c() {
        return AbstractC11777v.r(new String[]{"net::ERR_TIMED_OUT", "net::ERR_ACCESS_DENIED", "net::ERR_CLEARTEXT_NOT_PERMITTED", "net::ERR_CONNECTION_FAILED", "net::ERR_NAME_NOT_RESOLVED", "net::ERR_ADDRESS_UNREACHABLE", "net::ERR_CONNECTION_TIMED_OUT", "net::ERR_CONNECTION_ABORTED", "net::ERR_CONNECTION_RESET", "net::ERR_CONNECTION_CLOSED", "net::ERR_HTTP2_PING_FAILED", "net::ERR_NETWORK_ACCESS_DENIED", "net::ERR_INTERNET_DISCONNECTED", "stockbit::ERR_SSL"});
    }

    public final List b() {
        return (List) f44447b.getValue();
    }
}

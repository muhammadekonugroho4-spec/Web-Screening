package com.stockbit.android.util.pocket;

import com.stockbit.lib.pocket.domain.j;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes6.dex */
public final class a implements j {

    /* renamed from: a, reason: collision with root package name */
    public final com.stockbit.lib.pocket.domain.a f47994a;

    /* renamed from: b, reason: collision with root package name */
    public final List f47995b;

    static {
    }

    public a(com.stockbit.lib.pocket.domain.a r2, List r3) {
        p.l(r2, "firebaseRemoteContract");
        p.l(r3, "migrationProvider");
        this.f47994a = r2;
        this.f47995b = r3;
    }

    @Override // com.stockbit.lib.pocket.domain.j
    public com.stockbit.lib.pocket.domain.a a() {
        return this.f47994a;
    }

    @Override // com.stockbit.lib.pocket.domain.j
    public List b() {
        return this.f47995b;
    }
}

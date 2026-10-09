package dev.chrisbanes.snapper;

import androidx.compose.foundation.lazy.InterfaceC2658q;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b extends e {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2658q f174039a;

    public b(InterfaceC2658q r2) {
        p.l(r2, "lazyListItem");
        this.f174039a = r2;
    }

    @Override // dev.chrisbanes.snapper.e
    public int a() {
        return this.f174039a.getIndex();
    }

    @Override // dev.chrisbanes.snapper.e
    public int b() {
        return this.f174039a.getOffset();
    }

    @Override // dev.chrisbanes.snapper.e
    public int c() {
        return this.f174039a.getSize();
    }
}

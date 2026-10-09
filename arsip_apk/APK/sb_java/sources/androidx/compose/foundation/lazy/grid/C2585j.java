package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.AbstractC2649w;

/* renamed from: androidx.compose.foundation.lazy.grid.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2585j implements AbstractC2649w.a {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.functions.l f8540a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlin.jvm.functions.p f8541b;

    /* renamed from: c, reason: collision with root package name */
    public final kotlin.jvm.functions.l f8542c;
    public final kotlin.jvm.functions.r d;

    static {
    }

    public C2585j(kotlin.jvm.functions.l r1, kotlin.jvm.functions.p r2, kotlin.jvm.functions.l r3, kotlin.jvm.functions.r r4) {
        this.f8540a = r1;
        this.f8541b = r2;
        this.f8542c = r3;
        this.d = r4;
    }

    public final kotlin.jvm.functions.r a() {
        return this.d;
    }

    public final kotlin.jvm.functions.p b() {
        return this.f8541b;
    }

    @Override // androidx.compose.foundation.lazy.layout.AbstractC2649w.a
    public kotlin.jvm.functions.l getKey() {
        return this.f8540a;
    }

    @Override // androidx.compose.foundation.lazy.layout.AbstractC2649w.a
    public kotlin.jvm.functions.l getType() {
        return this.f8542c;
    }
}

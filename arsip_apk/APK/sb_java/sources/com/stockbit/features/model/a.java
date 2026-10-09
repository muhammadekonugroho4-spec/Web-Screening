package com.stockbit.features.model;

import kotlin.jvm.internal.p;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineDispatcher f119109a;

    /* renamed from: b, reason: collision with root package name */
    public final CoroutineDispatcher f119110b;

    /* renamed from: c, reason: collision with root package name */
    public final CoroutineDispatcher f119111c;

    public a(CoroutineDispatcher r2, CoroutineDispatcher r3, CoroutineDispatcher r4) {
        p.l(r2, "main");
        p.l(r3, "io");
        p.l(r4, "default");
        this.f119109a = r2;
        this.f119110b = r3;
        this.f119111c = r4;
    }

    public final CoroutineDispatcher a() {
        return this.f119111c;
    }

    public final CoroutineDispatcher b() {
        return this.f119110b;
    }

    public final CoroutineDispatcher c() {
        return this.f119109a;
    }
}

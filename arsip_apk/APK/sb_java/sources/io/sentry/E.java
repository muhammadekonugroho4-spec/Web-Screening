package io.sentry;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class E {

    /* renamed from: b, reason: collision with root package name */
    public static final E f174767b = null;

    /* renamed from: a, reason: collision with root package name */
    public final List f174768a;

    public interface a {
    }

    static {
        f174767b = new E();
    }

    public E() {
        this.f174768a = new CopyOnWriteArrayList();
    }

    public static E a() {
        return f174767b;
    }

    public void b(a r2) {
        this.f174768a.add(r2);
    }
}

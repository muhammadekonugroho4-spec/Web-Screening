package kotlinx.serialization.json.internal;

import kotlin.collections.C11769m;

/* renamed from: kotlinx.serialization.json.internal.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11981h {

    /* renamed from: a, reason: collision with root package name */
    public final C11769m f180867a;

    /* renamed from: b, reason: collision with root package name */
    public int f180868b;

    public AbstractC11981h() {
        this.f180867a = new C11769m();
    }

    public final void a(char[] r3) {
        kotlin.jvm.internal.p.l(r3, "array");
        monitor-enter(this);
    L7:
        th = move-exception;
        throw th;
    L5:
        if ((this.f180868b + r3.length) >= AbstractC11979f.a()) goto L9;
        this.f180868b += r3.length;
        this.f180867a.addLast(r3);     // Catch: Throwable -> L7
    L9:
        kotlin.w r32 = kotlin.w.f180450a;     // Catch: Throwable -> L7
        monitor-exit(this);
    }

    public final char[] b(int r4) {
        monitor-enter(this);
        char[] r02 = (char[]) this.f180867a.s();     // Catch: Throwable -> L7
        if (r02 == null) goto L9;
        this.f180868b -= r02.length;
    L10:
        monitor-exit(this);
        if (r02 == null) goto L13;
        return r02;
    L13:
        return new char[r4];
    L9:
        r02 = null;
    L7:
        th = move-exception;
        throw th;
    }
}

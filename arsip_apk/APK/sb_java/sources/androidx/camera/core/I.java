package androidx.camera.core;

import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.W;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class I implements W {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4822a;

    /* renamed from: b, reason: collision with root package name */
    public final W f4823b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f4824c;

    public interface a {
        void e(W r1);
    }

    public I(W r2) {
        this.f4822a = new Object();
        this.f4824c = new HashSet();
        this.f4823b = r2;
    }

    @Override // androidx.camera.core.W
    public W.a[] S() {
        return this.f4823b.S();
    }

    @Override // androidx.camera.core.W
    public void Y0(Rect r2) {
        this.f4823b.Y0(r2);
    }

    public void c(a r3) {
        Object r02 = this.f4822a;
        monitor-enter(r02);
        this.f4824c.add(r3);     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // androidx.camera.core.W, java.lang.AutoCloseable
    public void close() {
        this.f4823b.close();
        f();
    }

    public void f() {
        Object r02 = this.f4822a;
        monitor-enter(r02);
        HashSet r1 = new HashSet(this.f4824c);     // Catch: Throwable -> L11
        monitor-exit(r02);     // Catch: Throwable -> L11
        Iterator r03 = r1.iterator();
    L8:
        if (r03.hasNext() == false) goto L10;
        ((a) r03.next()).e(this);
        goto L8
    L10:
        return;
    L11:
        th = move-exception;
        throw th;
    }

    @Override // androidx.camera.core.W
    public int getHeight() {
        return this.f4823b.getHeight();
    }

    @Override // androidx.camera.core.W
    public int getWidth() {
        return this.f4823b.getWidth();
    }

    @Override // androidx.camera.core.W
    public S m0() {
        return this.f4823b.m0();
    }

    @Override // androidx.camera.core.W
    public int q() {
        return this.f4823b.q();
    }

    @Override // androidx.camera.core.W
    public Image z1() {
        return this.f4823b.z1();
    }
}

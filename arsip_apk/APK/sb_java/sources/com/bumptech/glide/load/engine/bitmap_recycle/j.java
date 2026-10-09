package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public class j implements d {

    /* renamed from: k, reason: collision with root package name */
    public static final Bitmap.Config f32691k = null;

    /* renamed from: a, reason: collision with root package name */
    public final k f32692a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f32693b;

    /* renamed from: c, reason: collision with root package name */
    public final long f32694c;
    public final a d;

    /* renamed from: e, reason: collision with root package name */
    public long f32695e;

    /* renamed from: f, reason: collision with root package name */
    public long f32696f;

    /* renamed from: g, reason: collision with root package name */
    public int f32697g;

    /* renamed from: h, reason: collision with root package name */
    public int f32698h;

    /* renamed from: i, reason: collision with root package name */
    public int f32699i;

    /* renamed from: j, reason: collision with root package name */
    public int f32700j;

    public interface a {
        void a(Bitmap r1);

        void b(Bitmap r1);
    }

    public static final class b implements a {
        public b() {
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.j.a
        public void a(Bitmap r1) {
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.j.a
        public void b(Bitmap r1) {
        }
    }

    static {
        f32691k = Bitmap.Config.ARGB_8888;
    }

    public j(long r1, k r3, Set r4) {
        this.f32694c = r1;
        this.f32695e = r1;
        this.f32692a = r3;
        this.f32693b = r4;
        this.d = new b();
    }

    public static void f(Bitmap.Config r3) {
        if (r3 == Bitmap.Config.HARDWARE) goto L6;
        return;
    L6:
        throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + r3 + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
    }

    public static Bitmap g(int r02, int r1, Bitmap.Config r2) {
        if (r2 != null) goto L6;
        r2 = f32691k;
    L6:
        return Bitmap.createBitmap(r02, r1, r2);
    }

    public static Set k() {
        HashSet r02 = new HashSet(Arrays.asList(Bitmap.Config.values()));
        r02.add(null);
        r02.remove(Bitmap.Config.HARDWARE);
        return Collections.unmodifiableSet(r02);
    }

    public static k l() {
        return new m();
    }

    public static void o(Bitmap r1) {
        r1.setPremultiplied(true);
    }

    public static void p(Bitmap r1) {
        r1.setHasAlpha(true);
        o(r1);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.d
    public void a(int r5) {
        if (Log.isLoggable("LruBitmapPool", 3) == false) goto L6;
        Log.d("LruBitmapPool", "trimMemory, level=" + r5);
    L6:
        if (r5 < 40) goto L8;
    L17:
        b();
        return;
    L8:
        if (r5 >= 20) goto L17;
        if (r5 < 20) goto L12;
    L15:
        q(n() / 2);
        return;
    L12:
        if (r5 == 15) goto L15;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.d
    public void b() {
        if (Log.isLoggable("LruBitmapPool", 3) == false) goto L5;
        Log.d("LruBitmapPool", "clearMemory");
    L5:
        q(0);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.d
    public synchronized void c(Bitmap r7) {
        monitor-enter(this);
        if (r7 == null) goto L30;
        if (r7.isRecycled() == true) goto L28;
        if (r7.isMutable() == false) goto L22;
        if (this.f32692a.b(r7) > this.f32695e) goto L22;
        if (this.f32693b.contains(r7.getConfig()) == false) goto L22;
        int r02 = this.f32692a.b(r7);     // Catch: Throwable -> L16
        this.f32692a.c(r7);     // Catch: Throwable -> L16
        this.d.a(r7);     // Catch: Throwable -> L16
        this.f32699i++;
        this.f32696f += r02;
        if (Log.isLoggable("LruBitmapPool", 2) == false) goto L18;
        Log.v("LruBitmapPool", "Put bitmap in pool=" + this.f32692a.e(r7));     // Catch: Throwable -> L16
    L18:
        h();     // Catch: Throwable -> L16
        j();     // Catch: Throwable -> L16
        monitor-exit(this);
        return;
    L22:
        if (Log.isLoggable("LruBitmapPool", 2) == false) goto L24;
        Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f32692a.e(r7) + ", is mutable: " + r7.isMutable() + ", is allowed config: " + this.f32693b.contains(r7.getConfig()));     // Catch: Throwable -> L16
    L24:
        r7.recycle();     // Catch: Throwable -> L16
        monitor-exit(this);
        return;
    L28:
        throw new IllegalStateException("Cannot pool recycled bitmap");     // Catch: Throwable -> L16
    L30:
        throw new NullPointerException("Bitmap must not be null");     // Catch: Throwable -> L16
    L16:
        th = move-exception;
        throw th;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.d
    public Bitmap d(int r2, int r3, Bitmap.Config r4) {
        Bitmap r02 = m(r2, r3, r4);
        if (r02 == null) goto L7;
        r02.eraseColor(0);
        return r02;
    L7:
        return g(r2, r3, r4);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.d
    public Bitmap e(int r2, int r3, Bitmap.Config r4) {
        Bitmap r02 = m(r2, r3, r4);
        if (r02 == null) goto L5;
        return r02;
    L5:
        return g(r2, r3, r4);
    }

    public final void h() {
        if (Log.isLoggable("LruBitmapPool", 2) == false) goto L6;
        i();
        return;
    }

    public final void i() {
        Log.v("LruBitmapPool", "Hits=" + this.f32697g + ", misses=" + this.f32698h + ", puts=" + this.f32699i + ", evictions=" + this.f32700j + ", currentSize=" + this.f32696f + ", maxSize=" + this.f32695e + "\nStrategy=" + this.f32692a);
    }

    public final void j() {
        q(this.f32695e);
    }

    public final synchronized Bitmap m(int r6, int r7, Bitmap.Config r8) {
        monitor-enter(this);
        f(r8);     // Catch: Throwable -> L12
        k r02 = this.f32692a;     // Catch: Throwable -> L12
        if (r8 == null) goto L6;
        Bitmap.Config r1 = r8;
    L7:
        Bitmap r03 = r02.d(r6, r7, r1);     // Catch: Throwable -> L12
        if (r03 == null) goto L10;
        this.f32697g++;
        this.f32696f -= this.f32692a.b(r03);
        this.d.b(r03);     // Catch: Throwable -> L12
        p(r03);     // Catch: Throwable -> L12
    L17:
        if (Log.isLoggable("LruBitmapPool", 2) == false) goto L19;
        Log.v("LruBitmapPool", "Get bitmap=" + this.f32692a.a(r6, r7, r8));     // Catch: Throwable -> L12
    L19:
        h();     // Catch: Throwable -> L12
        monitor-exit(this);
        return r03;
    L10:
        if (Log.isLoggable("LruBitmapPool", 3) == false) goto L14;
        Log.d("LruBitmapPool", "Missing bitmap=" + this.f32692a.a(r6, r7, r8));     // Catch: Throwable -> L12
    L14:
        this.f32698h++;
        goto L17
    L6:
        r1 = f32691k;     // Catch: Throwable -> L12
    L12:
        th = move-exception;
        throw th;
    }

    public long n() {
        return this.f32695e;
    }

    public final synchronized void q(long r6) {
        monitor-enter(this);
    L24:
    L10:
        th = move-exception;
        throw th;
    L4:
        if (this.f32696f <= r6) goto L20;
        Bitmap r02 = this.f32692a.removeLast();     // Catch: Throwable -> L10
        if (r02 == null) goto L8;
        this.d.b(r02);     // Catch: Throwable -> L10
        this.f32696f -= this.f32692a.b(r02);
        this.f32700j++;
        if (Log.isLoggable("LruBitmapPool", 3) == false) goto L18;
        Log.d("LruBitmapPool", "Evicting bitmap=" + this.f32692a.e(r02));     // Catch: Throwable -> L10
    L18:
        h();     // Catch: Throwable -> L10
        r02.recycle();     // Catch: Throwable -> L10
        goto L24
    L8:
        if (Log.isLoggable("LruBitmapPool", 5) == false) goto L12;
        Log.w("LruBitmapPool", "Size mismatch, resetting");     // Catch: Throwable -> L10
        i();     // Catch: Throwable -> L10
    L12:
        this.f32696f = 0;     // Catch: Throwable -> L10
        monitor-exit(this);
        return;
    L20:
        monitor-exit(this);
    }

    public j(long r3) {
        this(r3, l(), k());
    }
}

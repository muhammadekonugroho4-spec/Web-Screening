package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.W;
import androidx.camera.core.impl.R0;
import java.nio.ByteBuffer;

/* renamed from: androidx.camera.core.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2206a implements W {

    /* renamed from: a, reason: collision with root package name */
    public final Image f4914a;

    /* renamed from: b, reason: collision with root package name */
    public final C0041a[] f4915b;

    /* renamed from: c, reason: collision with root package name */
    public final S f4916c;

    /* renamed from: androidx.camera.core.a$a, reason: collision with other inner class name */
    public static final class C0041a implements W.a {

        /* renamed from: a, reason: collision with root package name */
        public final Image.Plane f4917a;

        public C0041a(Image.Plane r1) {
            this.f4917a = r1;
        }

        @Override // androidx.camera.core.W.a
        public ByteBuffer g() {
            return this.f4917a.getBuffer();
        }

        @Override // androidx.camera.core.W.a
        public int h() {
            return this.f4917a.getRowStride();
        }

        @Override // androidx.camera.core.W.a
        public int i() {
            return this.f4917a.getPixelStride();
        }
    }

    public C2206a(Image r8) {
        this.f4914a = r8;
        Image.Plane[] r02 = r8.getPlanes();
        int r1 = 0;
        if (r02 == null) goto L8;
        this.f4915b = new C0041a[r02.length];
    L6:
        if (r1 >= r02.length) goto L9;
        this.f4915b[r1] = new C0041a(r02[r1]);
        r1 = r1 + 1;
    L9:
        this.f4916c = Z.d(R0.b(), r8.getTimestamp(), 0, new Matrix(), 0);
        return;
    L8:
        this.f4915b = new C0041a[0];
        goto L9
    }

    @Override // androidx.camera.core.W
    public W.a[] S() {
        return this.f4915b;
    }

    @Override // androidx.camera.core.W
    public void Y0(Rect r2) {
        this.f4914a.setCropRect(r2);
    }

    @Override // androidx.camera.core.W, java.lang.AutoCloseable
    public void close() {
        this.f4914a.close();
    }

    @Override // androidx.camera.core.W
    public int getHeight() {
        return this.f4914a.getHeight();
    }

    @Override // androidx.camera.core.W
    public int getWidth() {
        return this.f4914a.getWidth();
    }

    @Override // androidx.camera.core.W
    public S m0() {
        return this.f4916c;
    }

    @Override // androidx.camera.core.W
    public int q() {
        return this.f4914a.getFormat();
    }

    @Override // androidx.camera.core.W
    public Image z1() {
        return this.f4914a;
    }
}

package androidx.camera.core.imagecapture;

import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.imagecapture.b0;

/* renamed from: androidx.camera.core.imagecapture.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2230h extends b0.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f5112a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageCaptureException f5113b;

    public C2230h(int r1, ImageCaptureException r2) {
        this.f5112a = r1;
        if (r2 == null) goto L7;
        this.f5113b = r2;
        return;
    L7:
        throw new NullPointerException("Null imageCaptureException");
    }

    @Override // androidx.camera.core.imagecapture.b0.a
    public ImageCaptureException a() {
        return this.f5113b;
    }

    @Override // androidx.camera.core.imagecapture.b0.a
    public int b() {
        return this.f5112a;
    }

    public boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof b0.a) == false) goto L12;
        b0.a r52 = (b0.a) r5;
        if (this.f5112a != r52.b()) goto L12;
        if (this.f5113b.equals(r52.a()) == false) goto L12;
        return true;
    L12:
        return false;
    }

    public int hashCode() {
        return ((this.f5112a ^ 1000003) * 1000003) ^ this.f5113b.hashCode();
    }

    public String toString() {
        return "CaptureError{requestId=" + this.f5112a + ", imageCaptureException=" + this.f5113b + "}";
    }
}

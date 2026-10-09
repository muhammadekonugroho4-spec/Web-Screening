package com.journeyapps.barcodescanner.camera;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.view.SurfaceHolder;

/* loaded from: classes6.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public SurfaceHolder f41130a;

    /* renamed from: b, reason: collision with root package name */
    public SurfaceTexture f41131b;

    public d(SurfaceHolder r2) {
        if (r2 == null) goto L7;
        this.f41130a = r2;
        return;
    L7:
        throw new IllegalArgumentException("surfaceHolder may not be null");
    }

    public void a(Camera r2) {
        SurfaceHolder r02 = this.f41130a;
        if (r02 == null) goto L6;
        r2.setPreviewDisplay(r02);
        return;
    L6:
        r2.setPreviewTexture(this.f41131b);
    }

    public d(SurfaceTexture r2) {
        if (r2 == null) goto L7;
        this.f41131b = r2;
        return;
    L7:
        throw new IllegalArgumentException("surfaceTexture may not be null");
    }
}

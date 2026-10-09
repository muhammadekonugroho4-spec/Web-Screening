package androidx.compose.ui.graphics;

import android.graphics.Matrix;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class B1 {

    /* renamed from: a, reason: collision with root package name */
    public Matrix f17073a;

    /* renamed from: b, reason: collision with root package name */
    public Shader f17074b;

    static {
    }

    public B1() {
    }

    public final Shader a() {
        return this.f17074b;
    }

    public final Matrix b() {
        Matrix r02 = this.f17073a;
        if (r02 != null) goto L6;
        Matrix r03 = new Matrix();
        this.f17073a = r03;
        return r03;
    L6:
        return r02;
    }

    public final void c(Shader r2) {
        Matrix r02 = this.f17073a;
        if (r02 == null) goto L6;
        if (r2 == null) goto L6;
        r2.setLocalMatrix(r02);
    L6:
        this.f17074b = r2;
    }

    public final void d(float[] r2) {
        if (r2 != null) goto L4;
        Matrix r22 = null;
        this.f17073a = null;
    L5:
        Shader r02 = this.f17074b;
        if (r02 == null) goto L9;
        r02.setLocalMatrix(r22);
        return;
    L9:
        return;
    L4:
        Matrix r03 = b();
        O.a(r03, r2);
        r22 = r03;
        goto L5
    }
}

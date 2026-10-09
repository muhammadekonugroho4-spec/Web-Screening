package androidx.compose.ui.graphics;

import android.graphics.Shader;
import android.os.Build;
import androidx.compose.ui.graphics.w1;

/* renamed from: androidx.compose.ui.graphics.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3495b0 {
    public static final Shader.TileMode a(int r2) {
        w1.a r02 = w1.f17861a;
        if (w1.f(r2, r02.a()) == false) goto L7;
        return Shader.TileMode.CLAMP;
    L7:
        if (w1.f(r2, r02.d()) == false) goto L11;
        return Shader.TileMode.REPEAT;
    L11:
        if (w1.f(r2, r02.c()) == false) goto L15;
        return Shader.TileMode.MIRROR;
    L15:
        if (w1.f(r2, r02.b()) == false) goto L23;
        if (Build.VERSION.SDK_INT < 31) goto L21;
        return y1.f17865a.a();
    L21:
        return Shader.TileMode.CLAMP;
    L23:
        return Shader.TileMode.CLAMP;
    }
}

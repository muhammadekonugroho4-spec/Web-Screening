package androidx.compose.ui.graphics;

import android.graphics.RenderEffect;
import android.graphics.Shader;

/* loaded from: classes.dex */
public abstract /* synthetic */ class k1 {
    public static /* bridge */ /* synthetic */ RenderEffect a(float r02, float r1, Shader.TileMode r2) {
        return RenderEffect.createBlurEffect(r02, r1, r2);
    }
}

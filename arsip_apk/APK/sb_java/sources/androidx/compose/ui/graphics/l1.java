package androidx.compose.ui.graphics;

import android.graphics.RenderEffect;
import android.graphics.Shader;

/* loaded from: classes.dex */
public abstract /* synthetic */ class l1 {
    public static /* bridge */ /* synthetic */ RenderEffect a(float r02, float r1, RenderEffect r2, Shader.TileMode r3) {
        return RenderEffect.createBlurEffect(r02, r1, r2, r3);
    }
}

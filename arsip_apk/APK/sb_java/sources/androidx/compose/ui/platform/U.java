package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
public abstract /* synthetic */ class U {
    public static /* bridge */ /* synthetic */ void a(View r02, Matrix r1) {
        r02.transformMatrixToGlobal(r1);
    }
}

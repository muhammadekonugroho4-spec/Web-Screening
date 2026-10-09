package androidx.transition;

import android.content.Context;
import android.graphics.Path;
import android.util.AttributeSet;

/* loaded from: classes4.dex */
public abstract class PathMotion {
    public PathMotion() {
    }

    public abstract Path getPath(float r1, float r2, float r3, float r4);

    public PathMotion(Context r1, AttributeSet r2) {
    }
}

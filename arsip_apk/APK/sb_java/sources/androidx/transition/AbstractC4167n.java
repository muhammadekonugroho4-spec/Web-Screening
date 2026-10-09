package androidx.transition;

import android.animation.PropertyValuesHolder;
import android.graphics.Path;
import android.util.Property;

/* renamed from: androidx.transition.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4167n {

    /* renamed from: androidx.transition.n$a */
    public static class a {
        public static PropertyValuesHolder a(Property r1, Path r2) {
            return PropertyValuesHolder.ofObject(r1, null, r2);
        }
    }

    public static PropertyValuesHolder a(Property r02, Path r1) {
        return a.a(r02, r1);
    }
}

package androidx.transition;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.util.Property;

/* renamed from: androidx.transition.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4166m {

    /* renamed from: androidx.transition.m$a */
    public static class a {
        public static ObjectAnimator a(Object r1, Property r2, Path r3) {
            return ObjectAnimator.ofObject(r1, r2, null, r3);
        }
    }

    public static ObjectAnimator a(Object r02, Property r1, Path r2) {
        return a.a(r02, r1, r2);
    }
}

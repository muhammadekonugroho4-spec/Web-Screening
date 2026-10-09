package androidx.core.view;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;

@Deprecated
/* loaded from: classes4.dex */
public final class GestureDetectorCompat {

    /* renamed from: a, reason: collision with root package name */
    public final GestureDetector f23123a;

    public GestureDetectorCompat(Context r2, GestureDetector.OnGestureListener r3) {
        this(r2, r3, null);
    }

    public boolean a(MotionEvent r2) {
        return this.f23123a.onTouchEvent(r2);
    }

    public GestureDetectorCompat(Context r2, GestureDetector.OnGestureListener r3, Handler r4) {
        this.f23123a = new GestureDetector(r2, r3, r4);
    }
}

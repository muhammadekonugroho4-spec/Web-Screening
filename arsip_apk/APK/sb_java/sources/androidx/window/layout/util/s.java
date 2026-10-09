package androidx.window.layout.util;

import android.graphics.Point;
import android.view.Display;
import com.google.firebase.messaging.Constants;

/* loaded from: classes4.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final s f29007a = null;

    static {
        f29007a = new s();
    }

    public s() {
    }

    public final Point a(Display r2) {
        kotlin.jvm.internal.p.l(r2, Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
        Point r02 = new Point();
        r2.getRealSize(r02);
        return r02;
    }
}

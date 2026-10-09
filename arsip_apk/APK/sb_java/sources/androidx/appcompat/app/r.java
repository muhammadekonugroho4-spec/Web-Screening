package androidx.appcompat.app;

import android.util.AttributeSet;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Deque;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public final Deque f2550a;

    public r() {
        this.f2550a = new ArrayDeque();
    }

    public static boolean b(XmlPullParser r3) {
        if (r3 != null) goto L13;
    L11:
        return true;
    L13:
        if (r3.getEventType() == 3) goto L11;
        if (r3.getEventType() == 1) goto L11;
        return false;
    }

    public static XmlPullParser c(Deque r2) {
    L3:
        if (r2.isEmpty() == true) goto L8;
        XmlPullParser r02 = (XmlPullParser) ((WeakReference) r2.peek()).get();
        if (b(r02) == false) goto L7;
        r2.pop();
        goto L3
    L7:
        return r02;
    L8:
        return null;
    }

    public static boolean d(XmlPullParser r1, XmlPullParser r2) {
        if (r2 == null) goto L8;
        if (r1 == r2) goto L13;
        if (r2.getEventType() != 2) goto L14;
        return "include".equals(r2.getName());
    L14:
        return false;
    L15:
        return false;
    L13:
        return false;
    L8:
        return false;
    }

    public boolean a(AttributeSet r5) {
        if ((r5 instanceof XmlPullParser) == false) goto L9;
        XmlPullParser r52 = (XmlPullParser) r5;
        if (r52.getDepth() != 1) goto L11;
        XmlPullParser r02 = c(this.f2550a);
        this.f2550a.push(new WeakReference(r52));
        if (d(r52, r02) == false) goto L12;
        return true;
    L12:
        return false;
    L11:
        return false;
    L9:
        return false;
    }
}

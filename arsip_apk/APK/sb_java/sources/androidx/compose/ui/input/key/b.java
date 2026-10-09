package androidx.compose.ui.input.key;

import android.view.KeyEvent;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final KeyEvent f18018a;

    public /* synthetic */ b(KeyEvent r1) {
        this.f18018a = r1;
    }

    public static final /* synthetic */ b a(KeyEvent r1) {
        return new b(r1);
    }

    public static KeyEvent b(KeyEvent r02) {
        return r02;
    }

    public static boolean c(KeyEvent r2, Object r3) {
        if ((r3 instanceof b) == true) goto L6;
        return false;
    L6:
        if (p.g(r2, ((b) r3).f()) == true) goto L8;
        return false;
    L8:
        return true;
    }

    public static int d(KeyEvent r02) {
        return r02.hashCode();
    }

    public static String e(KeyEvent r2) {
        return "KeyEvent(nativeKeyEvent=" + r2 + ')';
    }

    public boolean equals(Object r2) {
        return c(this.f18018a, r2);
    }

    public final /* synthetic */ KeyEvent f() {
        return this.f18018a;
    }

    public int hashCode() {
        return d(this.f18018a);
    }

    public String toString() {
        return e(this.f18018a);
    }
}

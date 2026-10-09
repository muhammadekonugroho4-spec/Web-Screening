package androidx.core.view;

import android.content.Context;
import android.view.PointerIcon;

/* loaded from: classes4.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final PointerIcon f23129a;

    public static class a {
        public static PointerIcon a(Context r02, int r1) {
            return PointerIcon.getSystemIcon(r02, r1);
        }
    }

    public O(PointerIcon r1) {
        this.f23129a = r1;
    }

    public static O b(Context r1, int r2) {
        return new O(a.a(r1, r2));
    }

    public Object a() {
        return this.f23129a;
    }
}

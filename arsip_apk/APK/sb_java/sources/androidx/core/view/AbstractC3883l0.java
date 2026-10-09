package androidx.core.view;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* renamed from: androidx.core.view.l0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3883l0 {

    /* renamed from: androidx.core.view.l0$a */
    public static class a {
        public static boolean a(ViewParent r02, View r1, float r2, float r3, boolean r4) {
            return r02.onNestedFling(r1, r2, r3, r4);
        }

        public static boolean b(ViewParent r02, View r1, float r2, float r3) {
            return r02.onNestedPreFling(r1, r2, r3);
        }

        public static void c(ViewParent r02, View r1, int r2, int r3, int[] r4) {
            r02.onNestedPreScroll(r1, r2, r3, r4);
        }

        public static void d(ViewParent r02, View r1, int r2, int r3, int r4, int r5) {
            r02.onNestedScroll(r1, r2, r3, r4, r5);
        }

        public static void e(ViewParent r02, View r1, View r2, int r3) {
            r02.onNestedScrollAccepted(r1, r2, r3);
        }

        public static boolean f(ViewParent r02, View r1, View r2, int r3) {
            return r02.onStartNestedScroll(r1, r2, r3);
        }

        public static void g(ViewParent r02, View r1) {
            r02.onStopNestedScroll(r1);
        }
    }

    public static boolean a(ViewParent r02, View r1, float r2, float r3, boolean r4) {
        return a.a(r02, r1, r2, r3, r4);
    L4:
        e = move-exception;
        Log.e("ViewParentCompat", "ViewParent " + r02 + " does not implement interface method onNestedFling", e);
        return false;
    }

    public static boolean b(ViewParent r02, View r1, float r2, float r3) {
        return a.b(r02, r1, r2, r3);
    L4:
        e = move-exception;
        Log.e("ViewParentCompat", "ViewParent " + r02 + " does not implement interface method onNestedPreFling", e);
        return false;
    }

    public static void c(ViewParent r1, View r2, int r3, int r4, int[] r5, int r6) {
        if ((r1 instanceof G) == false) goto L6;
        ((G) r1).onNestedPreScroll(r2, r3, r4, r5, r6);
        return;
    L6:
        if (r6 != 0) goto L14;
        a.c(r1, r2, r3, r4, r5);     // Catch: AbstractMethodError -> L9
        return;
    L9:
        e = move-exception;
        Log.e("ViewParentCompat", "ViewParent " + r1 + " does not implement interface method onNestedPreScroll", e);
        return;
    }

    public static void d(ViewParent r3, View r4, int r5, int r6, int r7, int r8, int r9, int[] r10) {
        if ((r3 instanceof H) == false) goto L6;
        ((H) r3).onNestedScroll(r4, r5, r6, r7, r8, r9, r10);
        return;
    L6:
        r10[0] = r10[0] + r7;
        r10[1] = r10[1] + r8;
        if ((r3 instanceof G) == false) goto L10;
        ((G) r3).onNestedScroll(r4, r5, r6, r7, r8, r9);
        return;
    L10:
        if (r9 == 0) goto L17;
        return;
    L17:
        a.d(r3, r4, r5, r6, r7, r8);     // Catch: AbstractMethodError -> L14
        return;
    L14:
        e = move-exception;
        Log.e("ViewParentCompat", "ViewParent " + r3 + " does not implement interface method onNestedScroll", e);
    }

    public static void e(ViewParent r1, View r2, View r3, int r4, int r5) {
        if ((r1 instanceof G) == false) goto L6;
        ((G) r1).onNestedScrollAccepted(r2, r3, r4, r5);
        return;
    L6:
        if (r5 != 0) goto L14;
        a.e(r1, r2, r3, r4);     // Catch: AbstractMethodError -> L9
        return;
    L9:
        e = move-exception;
        Log.e("ViewParentCompat", "ViewParent " + r1 + " does not implement interface method onNestedScrollAccepted", e);
        return;
    }

    public static boolean f(ViewParent r1, View r2, View r3, int r4, int r5) {
        if ((r1 instanceof G) == true) goto L5;
        if (r5 != 0) goto L15;
        return a.f(r1, r2, r3, r4);
    L9:
        e = move-exception;
        Log.e("ViewParentCompat", "ViewParent " + r1 + " does not implement interface method onStartNestedScroll", e);
        return false;
    L15:
        return false;
    L5:
        return ((G) r1).onStartNestedScroll(r2, r3, r4, r5);
    }

    public static void g(ViewParent r1, View r2, int r3) {
        if ((r1 instanceof G) == false) goto L6;
        ((G) r1).onStopNestedScroll(r2, r3);
        return;
    L6:
        if (r3 != 0) goto L14;
        a.g(r1, r2);     // Catch: AbstractMethodError -> L9
        return;
    L9:
        e = move-exception;
        Log.e("ViewParentCompat", "ViewParent " + r1 + " does not implement interface method onStopNestedScroll", e);
        return;
    }
}

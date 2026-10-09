package androidx.transition;

import android.view.View;

/* loaded from: classes4.dex */
public abstract class W extends B {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f28410a = null;

    static {
        f28410a = new String[]{"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};
    }

    public W() {
    }

    public static int d(E r2, int r3) {
        if (r2 != null) goto L5;
        return -1;
    L5:
        int[] r22 = (int[]) r2.f28319a.get("android:visibilityPropagation:center");
        if (r22 != null) goto L9;
        return -1;
    L9:
        return r22[r3];
    }

    @Override // androidx.transition.B
    public void a(E r7) {
        View r02 = r7.f28320b;
        Integer r1 = (Integer) r7.f28319a.get("android:visibility:visibility");
        if (r1 != null) goto L5;
        r1 = Integer.valueOf(r02.getVisibility());
    L5:
        r7.f28319a.put("android:visibilityPropagation:visibility", r1);
        int[] r2 = {r4, 0};
        r02.getLocationOnScreen(r2);
        int r4 = r2[0] + Math.round(r02.getTranslationX());
        r2[0] = r4 + (r02.getWidth() / 2);
        int r42 = r2[1] + Math.round(r02.getTranslationY());
        r2[1] = r42;
        r2[1] = r42 + (r02.getHeight() / 2);
        r7.f28319a.put("android:visibilityPropagation:center", r2);
    }

    @Override // androidx.transition.B
    public String[] b() {
        return f28410a;
    }

    public int e(E r3) {
        if (r3 != null) goto L5;
        return 8;
    L5:
        Integer r32 = (Integer) r3.f28319a.get("android:visibilityPropagation:visibility");
        if (r32 != null) goto L9;
        return 8;
    L9:
        return r32.intValue();
    }

    public int f(E r2) {
        return d(r2, 0);
    }

    public int g(E r2) {
        return d(r2, 1);
    }
}

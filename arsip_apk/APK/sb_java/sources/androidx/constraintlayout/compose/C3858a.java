package androidx.constraintlayout.compose;

import android.util.Log;

/* renamed from: androidx.constraintlayout.compose.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3858a {

    /* renamed from: a, reason: collision with root package name */
    public static final C3858a f20888a = null;

    static {
        f20888a = new C3858a();
    }

    public C3858a() {
    }

    public final String a(int r3) {
        if (r3 != 0) goto L5;
        return "top";
    L5:
        if (r3 == 1) goto L8;
        Log.e("CCL", "horizontalAnchorIndexToAnchorName: Unknown horizontal index");
        return "top";
    L8:
        return "bottom";
    }

    public final String b(int r3) {
        if (r3 != (-2)) goto L5;
        return "start";
    L5:
        if (r3 == (-1)) goto L15;
        if (r3 != 0) goto L8;
        return "left";
    L8:
        if (r3 == 1) goto L11;
        Log.e("CCL", "verticalAnchorIndexToAnchorName: Unknown vertical index");
        return "start";
    L11:
        return "right";
    L15:
        return "end";
    }
}

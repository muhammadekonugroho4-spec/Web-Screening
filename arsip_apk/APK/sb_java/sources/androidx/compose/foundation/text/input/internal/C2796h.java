package androidx.compose.foundation.text.input.internal;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;

/* renamed from: androidx.compose.foundation.text.input.internal.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2796h {

    /* renamed from: a, reason: collision with root package name */
    public static final C2796h f10296a = null;

    static {
        f10296a = new C2796h();
    }

    public C2796h() {
    }

    public final boolean a(InputConnection r1, InputContentInfo r2, int r3, Bundle r4) {
        return r1.commitContent(r2, r3, r4);
    }
}

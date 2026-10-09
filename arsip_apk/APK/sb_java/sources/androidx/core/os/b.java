package androidx.core.os;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f22962a = null;

    static {
        f22962a = new b();
    }

    public b() {
    }

    public static final void a(Bundle r02, String r1, Size r2) {
        r02.putSize(r1, r2);
    }

    public static final void b(Bundle r02, String r1, SizeF r2) {
        r02.putSizeF(r1, r2);
    }
}

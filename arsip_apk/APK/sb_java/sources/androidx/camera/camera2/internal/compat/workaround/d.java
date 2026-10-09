package androidx.camera.camera2.internal.compat.workaround;

import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final SmallDisplaySizeQuirk f4396a;

    public d() {
        this.f4396a = (SmallDisplaySizeQuirk) androidx.camera.camera2.internal.compat.quirk.e.b(SmallDisplaySizeQuirk.class);
    }

    public Size a() {
        SmallDisplaySizeQuirk r02 = this.f4396a;
        if (r02 != null) goto L5;
        return null;
    L5:
        return r02.d();
    }
}

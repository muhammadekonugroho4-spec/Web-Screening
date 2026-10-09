package androidx.camera.extensions.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.D0;
import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/camera/extensions/internal/compat/quirk/EnsurePostviewFormatEquivalenceQuirk;", "Landroidx/camera/core/impl/D0;", "<init>", "()V", "a", "camera-extensions_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EnsurePostviewFormatEquivalenceQuirk implements D0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f6123a = null;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final boolean a() {
            if (Build.VERSION.SDK_INT != 34) goto L6;
            return true;
        L6:
            return false;
        }

        public a() {
        }
    }

    static {
        f6123a = new a(null);
    }

    public EnsurePostviewFormatEquivalenceQuirk() {
    }

    public static final boolean d() {
        return f6123a.a();
    }
}

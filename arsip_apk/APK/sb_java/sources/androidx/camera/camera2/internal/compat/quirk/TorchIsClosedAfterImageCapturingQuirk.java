package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.D0;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class TorchIsClosedAfterImageCapturingQuirk implements D0 {

    /* renamed from: a, reason: collision with root package name */
    public static final List f4376a = null;

    static {
        f4376a = Arrays.asList(new String[]{"mi a1", "mi a2", "mi a2 lite", "redmi 4x", "redmi 5a", "redmi note 5", "redmi note 5 pro", "redmi 6 pro", "redmi note 6 pro"});
    }

    public TorchIsClosedAfterImageCapturingQuirk() {
    }

    public static boolean d() {
        return f4376a.contains(Build.MODEL.toLowerCase(Locale.US));
    }
}

package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Size;
import androidx.camera.core.impl.D0;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public class SmallDisplaySizeQuirk implements D0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f4373a = null;

    static {
        HashMap r02 = new HashMap();
        f4373a = r02;
        r02.put("REDMI NOTE 8", new Size(1080, 2340));
        r02.put("REDMI NOTE 7", new Size(1080, 2340));
        r02.put("SM-A207M", new Size(720, 1560));
        r02.put("REDMI NOTE 7S", new Size(1080, 2340));
        r02.put("SM-A127F", new Size(720, 1600));
        r02.put("SM-A536E", new Size(1080, 2400));
        r02.put("220233L2I", new Size(720, 1600));
        r02.put("V2149", new Size(720, 1600));
        r02.put("VIVO 1920", new Size(1080, 2340));
        r02.put("CPH2223", new Size(1080, 2400));
        r02.put("V2029", new Size(720, 1600));
        r02.put("CPH1901", new Size(720, 1520));
        r02.put("REDMI Y3", new Size(720, 1520));
        r02.put("SM-A045M", new Size(720, 1600));
        r02.put("SM-A146U", new Size(1080, 2408));
        r02.put("CPH1909", new Size(720, 1520));
        r02.put("NOKIA 4.2", new Size(720, 1520));
        r02.put("SM-G960U1", new Size(1440, 2960));
        r02.put("SM-A137F", new Size(1080, 2408));
        r02.put("VIVO 1816", new Size(720, 1520));
        r02.put("INFINIX X6817", new Size(720, 1612));
        r02.put("SM-A037F", new Size(720, 1600));
        r02.put("NOKIA 2.4", new Size(720, 1600));
        r02.put("SM-A125M", new Size(720, 1600));
        r02.put("INFINIX X670", new Size(1080, 2400));
    }

    public SmallDisplaySizeQuirk() {
    }

    public static boolean e() {
        return f4373a.containsKey(Build.MODEL.toUpperCase(Locale.US));
    }

    public Size d() {
        return (Size) f4373a.get(Build.MODEL.toUpperCase(Locale.US));
    }
}

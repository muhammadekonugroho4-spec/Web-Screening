package androidx.camera.core.impl;

import android.util.ArrayMap;
import android.util.Pair;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class R0 {

    /* renamed from: b, reason: collision with root package name */
    public static final R0 f5261b = null;

    /* renamed from: a, reason: collision with root package name */
    public final Map f5262a;

    static {
        f5261b = new R0(new ArrayMap());
    }

    public R0(Map r1) {
        this.f5262a = r1;
    }

    public static R0 a(Pair r2) {
        ArrayMap r02 = new ArrayMap();
        r02.put((String) r2.first, r2.second);
        return new R0(r02);
    }

    public static R0 b() {
        return f5261b;
    }

    public static R0 c(R0 r4) {
        ArrayMap r02 = new ArrayMap();
        Iterator r1 = r4.e().iterator();
    L4:
        if (r1.hasNext() == false) goto L7;
        String r2 = (String) r1.next();
        r02.put(r2, r4.d(r2));
        goto L4
    L7:
        return new R0(r02);
    }

    public Object d(String r2) {
        return this.f5262a.get(r2);
    }

    public Set e() {
        return this.f5262a.keySet();
    }

    public final String toString() {
        return "android.hardware.camera2.CaptureRequest.setTag.CX";
    }
}

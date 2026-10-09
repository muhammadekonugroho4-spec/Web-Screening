package androidx.camera.core.impl;

import android.util.ArrayMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: androidx.camera.core.impl.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2292w0 extends R0 {
    public C2292w0(Map r1) {
        super(r1);
    }

    public static C2292w0 g() {
        return new C2292w0(new ArrayMap());
    }

    public static C2292w0 h(R0 r4) {
        ArrayMap r02 = new ArrayMap();
        Iterator r1 = r4.e().iterator();
    L4:
        if (r1.hasNext() == false) goto L7;
        String r2 = (String) r1.next();
        r02.put(r2, r4.d(r2));
        goto L4
    L7:
        return new C2292w0(r02);
    }

    public void f(R0 r2) {
        Map r02 = this.f5262a;
        if (r02 == null) goto L8;
        Map r22 = r2.f5262a;
        if (r22 == null) goto L9;
        r02.putAll(r22);
        return;
    L9:
        return;
    }

    public void i(String r2, Object r3) {
        this.f5262a.put(r2, r3);
    }
}

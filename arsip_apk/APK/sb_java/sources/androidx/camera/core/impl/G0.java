package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class G0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f5220a;

    public G0(List r2) {
        this.f5220a = new ArrayList(r2);
    }

    public static String d(G0 r2) {
        ArrayList r02 = new ArrayList();
        Iterator r22 = r2.f5220a.iterator();
    L4:
        if (r22.hasNext() == false) goto L7;
        r02.add(((D0) r22.next()).getClass().getSimpleName());
        goto L4
    L7:
        return String.join(" | ", r02);
    }

    public boolean a(Class r3) {
        Iterator r02 = this.f5220a.iterator();
    L4:
        if (r02.hasNext() == false) goto L9;
        if (r3.isAssignableFrom(((D0) r02.next()).getClass()) == false) goto L4;
        return true;
    L9:
        return false;
    }

    public D0 b(Class r4) {
        Iterator r02 = this.f5220a.iterator();
    L4:
        if (r02.hasNext() == false) goto L8;
        D0 r1 = (D0) r02.next();
        if (r1.getClass() != r4) goto L4;
        return r1;
    L8:
        return null;
    }

    public List c(Class r5) {
        ArrayList r02 = new ArrayList();
        Iterator r1 = this.f5220a.iterator();
    L4:
        if (r1.hasNext() == false) goto L8;
        D0 r2 = (D0) r1.next();
        if (r5.isAssignableFrom(r2.getClass()) == false) goto L4;
        r02.add(r2);
        goto L4
    L8:
        return r02;
    }
}

package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f177508a;

    public x(int r2) {
        this.f177508a = new ArrayList(r2);
    }

    public void a(Object r2) {
        this.f177508a.add(r2);
    }

    public void b(Object r4) {
        if (r4 != null) goto L5;
        return;
    L5:
        if ((r4 instanceof Object[]) == false) goto L11;
        Object[] r42 = (Object[]) r4;
        if (r42.length <= 0) goto L26;
        ArrayList r02 = this.f177508a;
        r02.ensureCapacity(r02.size() + r42.length);
        Collections.addAll(this.f177508a, r42);
        return;
    L26:
        return;
    L11:
        if ((r4 instanceof Collection) == false) goto L15;
        this.f177508a.addAll((Collection) r4);
        return;
    L15:
        if ((r4 instanceof Iterable) == false) goto L21;
        Iterator r43 = ((Iterable) r4).iterator();
    L18:
        if (r43.hasNext() == false) goto L32;
        this.f177508a.add(r43.next());
        goto L18
    L32:
        return;
    L21:
        if ((r4 instanceof Iterator) == false) goto L28;
        Iterator r44 = (Iterator) r4;
    L24:
        if (r44.hasNext() == false) goto L33;
        this.f177508a.add(r44.next());
        goto L24
    L33:
        return;
    L28:
        throw new UnsupportedOperationException("Don't know how to spread " + r4.getClass());
    }

    public int c() {
        return this.f177508a.size();
    }

    public Object[] d(Object[] r2) {
        return this.f177508a.toArray(r2);
    }
}

package androidx.constraintlayout.widget;

import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public SparseIntArray f22531a;

    /* renamed from: b, reason: collision with root package name */
    public HashMap f22532b;

    public interface a {
    }

    public f() {
        this.f22531a = new SparseIntArray();
        this.f22532b = new HashMap();
    }

    public void a(int r3, a r4) {
        HashSet r02 = (HashSet) this.f22532b.get(Integer.valueOf(r3));
        if (r02 != null) goto L5;
        r02 = new HashSet();
        this.f22532b.put(Integer.valueOf(r3), r02);
    L5:
        r02.add(new WeakReference(r4));
    }

    public void b(int r5, a r6) {
        HashSet r52 = (HashSet) this.f22532b.get(Integer.valueOf(r5));
        if (r52 != null) goto L5;
        return;
    L5:
        ArrayList r02 = new ArrayList();
        Iterator r1 = r52.iterator();
    L7:
        if (r1.hasNext() == false) goto L12;
        WeakReference r2 = (WeakReference) r1.next();
        a r3 = (a) r2.get();
        if (r3 == null) goto L11;
        if (r3 != r6) goto L7;
    L11:
        r02.add(r2);
        goto L7
    L12:
        r52.removeAll(r02);
    }
}

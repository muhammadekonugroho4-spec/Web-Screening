package androidx.coordinatorlayout.widget;

import androidx.collection.g0;
import androidx.core.util.e;
import androidx.core.util.f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final e f22583a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f22584b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f22585c;
    public final HashSet d;

    public b() {
        this.f22583a = new f(10);
        this.f22584b = new g0();
        this.f22585c = new ArrayList();
        this.d = new HashSet();
    }

    public void a(Object r3, Object r4) {
        if (this.f22584b.containsKey(r3) == false) goto L12;
        if (this.f22584b.containsKey(r4) == false) goto L12;
        ArrayList r02 = (ArrayList) this.f22584b.get(r3);
        if (r02 != null) goto L9;
        r02 = f();
        this.f22584b.put(r3, r02);
    L9:
        r02.add(r4);
        return;
    L12:
        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
    }

    public void b(Object r3) {
        if (this.f22584b.containsKey(r3) == true) goto L6;
        this.f22584b.put(r3, null);
        return;
    }

    public void c() {
        int r02 = this.f22584b.size();
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L8;
        ArrayList r2 = (ArrayList) this.f22584b.l(r1);
        if (r2 == null) goto L7;
        k(r2);
    L7:
        r1 = r1 + 1;
        goto L3
    L8:
        this.f22584b.clear();
    }

    public boolean d(Object r2) {
        return this.f22584b.containsKey(r2);
    }

    public final void e(Object r5, ArrayList r6, HashSet r7) {
        if (r6.contains(r5) == false) goto L6;
        return;
    L6:
        if (r7.contains(r5) == true) goto L15;
        r7.add(r5);
        ArrayList r02 = (ArrayList) this.f22584b.get(r5);
        if (r02 == null) goto L12;
        int r1 = r02.size();
        int r2 = 0;
    L10:
        if (r2 >= r1) goto L12;
        e(r02.get(r2), r6, r7);
        r2 = r2 + 1;
    L12:
        r7.remove(r5);
        r6.add(r5);
        return;
    L15:
        throw new RuntimeException("This graph contains cyclic dependencies");
    }

    public final ArrayList f() {
        ArrayList r02 = (ArrayList) this.f22583a.acquire();
        if (r02 == null) goto L5;
        return r02;
    L5:
        return new ArrayList();
    }

    public List g(Object r2) {
        return (List) this.f22584b.get(r2);
    }

    public List h(Object r5) {
        int r02 = this.f22584b.size();
        ArrayList r1 = null;
        int r2 = 0;
    L3:
        if (r2 >= r02) goto L12;
        ArrayList r3 = (ArrayList) this.f22584b.l(r2);
        if (r3 == null) goto L11;
        if (r3.contains(r5) == false) goto L11;
        if (r1 != null) goto L10;
        r1 = new ArrayList();
    L10:
        r1.add(this.f22584b.g(r2));
    L11:
        r2 = r2 + 1;
        goto L3
    L12:
        return r1;
    }

    public ArrayList i() {
        this.f22585c.clear();
        this.d.clear();
        int r02 = this.f22584b.size();
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L6;
        e(this.f22584b.g(r1), this.f22585c, this.d);
        r1 = r1 + 1;
        goto L3
    L6:
        return this.f22585c;
    }

    public boolean j(Object r5) {
        int r02 = this.f22584b.size();
        int r2 = 0;
    L3:
        if (r2 >= r02) goto L11;
        ArrayList r3 = (ArrayList) this.f22584b.l(r2);
        if (r3 == null) goto L10;
        if (r3.contains(r5) == false) goto L10;
        return true;
    L10:
        r2 = r2 + 1;
        goto L3
    L11:
        return false;
    }

    public final void k(ArrayList r2) {
        r2.clear();
        this.f22583a.a(r2);
    }
}

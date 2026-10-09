package androidx.core.widget;

import android.widget.ListView;

/* loaded from: classes4.dex */
public class h extends a {

    /* renamed from: s, reason: collision with root package name */
    public final ListView f23439s;

    public h(ListView r1) {
        super(r1);
        this.f23439s = r1;
    }

    @Override // androidx.core.widget.a
    public boolean a(int r1) {
        return false;
    }

    @Override // androidx.core.widget.a
    public boolean b(int r8) {
        ListView r02 = this.f23439s;
        int r1 = r02.getCount();
        if (r1 != 0) goto L5;
        return false;
    L5:
        int r3 = r02.getChildCount();
        int r4 = r02.getFirstVisiblePosition();
        int r5 = r4 + r3;
        if (r8 <= 0) goto L11;
        if (r5 >= r1) goto L9;
    L16:
        return true;
    L9:
        if (r02.getChildAt(r3 - 1).getBottom() > r02.getHeight()) goto L16;
        return false;
    L11:
        if (r8 >= 0) goto L17;
        if (r4 > 0) goto L16;
        if (r02.getChildAt(0).getTop() < 0) goto L16;
        return false;
    L17:
        return false;
    }

    @Override // androidx.core.widget.a
    public void j(int r1, int r2) {
        this.f23439s.scrollListBy(r2);
    }
}

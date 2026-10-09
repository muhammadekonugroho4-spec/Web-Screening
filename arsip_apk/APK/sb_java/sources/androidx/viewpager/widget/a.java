package androidx.viewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final DataSetObservable f28685a;

    /* renamed from: b, reason: collision with root package name */
    public DataSetObserver f28686b;

    public a() {
        this.f28685a = new DataSetObservable();
    }

    public abstract void a(ViewGroup r1, int r2, Object r3);

    public void b(View r1) {
    }

    public void c(ViewGroup r1) {
        b(r1);
    }

    public abstract int d();

    public int e(Object r1) {
        return -1;
    }

    public CharSequence f(int r1) {
        return null;
    }

    public float g(int r1) {
        return 1.0f;
    }

    public abstract Object h(ViewGroup r1, int r2);

    public abstract boolean i(View r1, Object r2);

    public void j() {
        monitor-enter(this);
        DataSetObserver r02 = this.f28686b;     // Catch: Throwable -> L6
        if (r02 == null) goto L8;
        r02.onChanged();     // Catch: Throwable -> L6
    L8:
        monitor-exit(this);     // Catch: Throwable -> L6
        this.f28685a.notifyChanged();
        return;
    L6:
        th = move-exception;
        throw th;
    }

    public void k(DataSetObserver r2) {
        this.f28685a.registerObserver(r2);
    }

    public void l(Parcelable r1, ClassLoader r2) {
    }

    public Parcelable m() {
        return null;
    }

    public void n(View r1, int r2, Object r3) {
    }

    public void o(ViewGroup r1, int r2, Object r3) {
        n(r1, r2, r3);
    }

    public void p(DataSetObserver r1) {
        monitor-enter(this);
        this.f28686b = r1;     // Catch: Throwable -> L6
        monitor-exit(this);     // Catch: Throwable -> L6
        return;
    L6:
        th = move-exception;
        throw th;
    }

    public void q(View r1) {
    }

    public void r(ViewGroup r1) {
        q(r1);
    }

    public void s(DataSetObserver r2) {
        this.f28685a.unregisterObserver(r2);
    }
}

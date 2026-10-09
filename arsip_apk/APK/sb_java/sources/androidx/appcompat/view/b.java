package androidx.appcompat.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public Object f2870a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2871b;

    public interface a {
        boolean a(b r1, Menu r2);

        boolean b(b r1, MenuItem r2);

        boolean c(b r1, Menu r2);

        void d(b r1);
    }

    public b() {
    }

    public abstract void a();

    public abstract View b();

    public abstract Menu c();

    public abstract MenuInflater d();

    public abstract CharSequence e();

    public Object f() {
        return this.f2870a;
    }

    public abstract CharSequence g();

    public boolean h() {
        return this.f2871b;
    }

    public abstract void i();

    public abstract boolean j();

    public abstract void k(View r1);

    public abstract void l(int r1);

    public abstract void m(CharSequence r1);

    public void n(Object r1) {
        this.f2870a = r1;
    }

    public abstract void o(int r1);

    public abstract void p(CharSequence r1);

    public void q(boolean r1) {
        this.f2871b = r1;
    }
}

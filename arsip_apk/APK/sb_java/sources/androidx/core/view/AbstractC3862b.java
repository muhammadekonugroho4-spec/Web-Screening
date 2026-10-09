package androidx.core.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: androidx.core.view.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3862b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f23206a;

    /* renamed from: b, reason: collision with root package name */
    public a f23207b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0173b f23208c;

    /* renamed from: androidx.core.view.b$a */
    public interface a {
        void a(boolean r1);
    }

    /* renamed from: androidx.core.view.b$b, reason: collision with other inner class name */
    public interface InterfaceC0173b {
        void onActionProviderVisibilityChanged(boolean r1);
    }

    public AbstractC3862b(Context r1) {
        this.f23206a = r1;
    }

    public abstract boolean a();

    public boolean b() {
        return true;
    }

    public abstract View c();

    public View d(MenuItem r1) {
        return c();
    }

    public boolean e() {
        return false;
    }

    public abstract void f(SubMenu r1);

    public boolean g() {
        return false;
    }

    public void h() {
        this.f23208c = null;
        this.f23207b = null;
    }

    public void i(a r1) {
        this.f23207b = r1;
    }

    public void j(InterfaceC0173b r3) {
        if (this.f23208c == null) goto L6;
        if (r3 == null) goto L6;
        Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
    L6:
        this.f23208c = r3;
    }

    public void k(boolean r2) {
        a r02 = this.f23207b;
        if (r02 == null) goto L6;
        r02.a(r2);
        return;
    }
}

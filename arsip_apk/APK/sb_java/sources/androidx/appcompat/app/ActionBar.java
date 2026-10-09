package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import androidx.appcompat.view.b;
import com.google.android.material.navigation.NavigationBarView;

/* loaded from: classes.dex */
public abstract class ActionBar {

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f2328a;

        public LayoutParams(Context r3, AttributeSet r4) {
            super(r3, r4);
            this.f2328a = 0;
            TypedArray r32 = r3.obtainStyledAttributes(r4, androidx.appcompat.j.f2853t);
            this.f2328a = r32.getInt(androidx.appcompat.j.f2855u, 0);
            r32.recycle();
        }

        public LayoutParams(int r1, int r2) {
            super(r1, r2);
            this.f2328a = NavigationBarView.ITEM_GRAVITY_START_CENTER;
        }

        public LayoutParams(LayoutParams r2) {
            super(r2);
            this.f2328a = 0;
            this.f2328a = r2.f2328a;
        }

        public LayoutParams(ViewGroup.LayoutParams r1) {
            super(r1);
            this.f2328a = 0;
        }
    }

    public static abstract class a {
    }

    public ActionBar() {
    }

    public boolean g() {
        return false;
    }

    public abstract boolean h();

    public abstract void i(boolean r1);

    public abstract int j();

    public abstract Context k();

    public abstract void l();

    public boolean m() {
        return false;
    }

    public void n(Configuration r1) {
    }

    public void o() {
    }

    public abstract boolean p(int r1, KeyEvent r2);

    public boolean q(KeyEvent r1) {
        return false;
    }

    public boolean r() {
        return false;
    }

    public abstract void s(boolean r1);

    public abstract void t(boolean r1);

    public abstract void u(boolean r1);

    public abstract void v(int r1);

    public abstract void w(boolean r1);

    public abstract void x(CharSequence r1);

    public abstract void y(CharSequence r1);

    public androidx.appcompat.view.b z(b.a r1) {
        return null;
    }
}

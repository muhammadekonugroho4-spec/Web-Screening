package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.collection.g0;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2994a;

    /* renamed from: b, reason: collision with root package name */
    public g0 f2995b;

    /* renamed from: c, reason: collision with root package name */
    public g0 f2996c;

    public c(Context r1) {
        this.f2994a = r1;
    }

    public final MenuItem c(MenuItem r3) {
        if ((r3 instanceof androidx.core.internal.view.b) == false) goto L11;
        androidx.core.internal.view.b r32 = (androidx.core.internal.view.b) r3;
        if (this.f2995b != null) goto L7;
        this.f2995b = new g0();
    L7:
        MenuItem r02 = (MenuItem) this.f2995b.get(r32);
        if (r02 != null) goto L12;
        j r03 = new j(this.f2994a, r32);
        this.f2995b.put(r32, r03);
        return r03;
    L12:
        return r02;
    L11:
        return r3;
    }

    public final SubMenu d(SubMenu r1) {
        return r1;
    }

    public final void e() {
        g0 r02 = this.f2995b;
        if (r02 == null) goto L5;
        r02.clear();
    L5:
        g0 r03 = this.f2996c;
        if (r03 == null) goto L9;
        r03.clear();
        return;
    }

    public final void f(int r3) {
        if (this.f2995b == null) goto L12;
        int r02 = 0;
    L7:
        if (r02 >= this.f2995b.size()) goto L16;
        if (((androidx.core.internal.view.b) this.f2995b.g(r02)).getGroupId() != r3) goto L11;
        this.f2995b.i(r02);
        r02 = r02 - 1;
    L11:
        r02 = r02 + 1;
        goto L7
    L16:
        return;
    }

    public final void g(int r3) {
        if (this.f2995b == null) goto L13;
        int r02 = 0;
    L7:
        if (r02 >= this.f2995b.size()) goto L16;
        if (((androidx.core.internal.view.b) this.f2995b.g(r02)).getItemId() == r3) goto L10;
        r02 = r02 + 1;
        goto L7
    L10:
        this.f2995b.i(r02);
        return;
    L16:
        return;
    }
}

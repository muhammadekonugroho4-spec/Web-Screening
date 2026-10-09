package androidx.compose.foundation.text.contextmenu.internal;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/* loaded from: classes.dex */
public final class I extends ActionMode.Callback2 implements ActionMode.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Q f9771a;

    public I(Q r1) {
        this.f9771a = r1;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(ActionMode r2, MenuItem r3) {
        return this.f9771a.onActionItemClicked(r2, r3);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(ActionMode r2, Menu r3) {
        return this.f9771a.onCreateActionMode(r2, r3);
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(ActionMode r2) {
        this.f9771a.onDestroyActionMode(r2);
    }

    @Override // android.view.ActionMode.Callback2
    public void onGetContentRect(ActionMode r3, View r4, Rect r5) {
        androidx.compose.ui.geometry.g r32 = this.f9771a.a(r3, r4);
        r5.set(Math.round(r32.k()), Math.round(r32.n()), Math.round(r32.l()), Math.round(r32.e()));
    }

    @Override // android.view.ActionMode.Callback
    public boolean onPrepareActionMode(ActionMode r2, Menu r3) {
        return this.f9771a.onPrepareActionMode(r2, r3);
    }
}

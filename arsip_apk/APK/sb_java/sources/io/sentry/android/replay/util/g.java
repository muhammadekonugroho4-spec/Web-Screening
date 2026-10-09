package io.sentry.android.replay.util;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class g implements Window.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Window.Callback f176009a;

    public g(Window.Callback r1) {
        this.f176009a = r1;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent r2) {
        Window.Callback r02 = this.f176009a;
        if (r02 != null) goto L7;
        return false;
    L7:
        return r02.dispatchGenericMotionEvent(r2);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent r2) {
        Window.Callback r02 = this.f176009a;
        if (r02 != null) goto L7;
        return false;
    L7:
        return r02.dispatchKeyEvent(r2);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent r2) {
        Window.Callback r02 = this.f176009a;
        if (r02 != null) goto L7;
        return false;
    L7:
        return r02.dispatchKeyShortcutEvent(r2);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent r2) {
        Window.Callback r02 = this.f176009a;
        if (r02 != null) goto L7;
        return false;
    L7:
        return r02.dispatchPopulateAccessibilityEvent(r2);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent r2) {
        Window.Callback r02 = this.f176009a;
        if (r02 != null) goto L7;
        return false;
    L7:
        return r02.dispatchTouchEvent(r2);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(MotionEvent r2) {
        Window.Callback r02 = this.f176009a;
        if (r02 != null) goto L7;
        return false;
    L7:
        return r02.dispatchTrackballEvent(r2);
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(ActionMode r2) {
        Window.Callback r02 = this.f176009a;
        if (r02 != null) goto L5;
        return;
    L5:
        r02.onActionModeFinished(r2);
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(ActionMode r2) {
        Window.Callback r02 = this.f176009a;
        if (r02 != null) goto L5;
        return;
    L5:
        r02.onActionModeStarted(r2);
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
        Window.Callback r02 = this.f176009a;
        if (r02 != null) goto L5;
        return;
    L5:
        r02.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public void onContentChanged() {
        Window.Callback r02 = this.f176009a;
        if (r02 != null) goto L5;
        return;
    L5:
        r02.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int r2, Menu r3) {
        Window.Callback r02 = this.f176009a;
        if (r02 != null) goto L7;
        return false;
    L7:
        return r02.onCreatePanelMenu(r2, r3);
    }

    @Override // android.view.Window.Callback
    public View onCreatePanelView(int r2) {
        Window.Callback r02 = this.f176009a;
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.onCreatePanelView(r2);
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
        Window.Callback r02 = this.f176009a;
        if (r02 != null) goto L5;
        return;
    L5:
        r02.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int r2, MenuItem r3) {
        Window.Callback r02 = this.f176009a;
        if (r02 != null) goto L7;
        return false;
    L7:
        return r02.onMenuItemSelected(r2, r3);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int r2, Menu r3) {
        Window.Callback r02 = this.f176009a;
        if (r02 != null) goto L7;
        return false;
    L7:
        return r02.onMenuOpened(r2, r3);
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int r2, Menu r3) {
        Window.Callback r02 = this.f176009a;
        if (r02 != null) goto L5;
        return;
    L5:
        r02.onPanelClosed(r2, r3);
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean r2) {
        Window.Callback r02 = this.f176009a;
        if (r02 != null) goto L5;
        return;
    L5:
        r02.onPointerCaptureChanged(r2);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int r2, View r3, Menu r4) {
        Window.Callback r02 = this.f176009a;
        if (r02 != null) goto L7;
        return false;
    L7:
        return r02.onPreparePanel(r2, r3, r4);
    }

    @Override // android.view.Window.Callback
    public void onProvideKeyboardShortcuts(List r2, Menu r3, int r4) {
        Window.Callback r02 = this.f176009a;
        if (r02 != null) goto L5;
        return;
    L5:
        r02.onProvideKeyboardShortcuts(r2, r3, r4);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        Window.Callback r02 = this.f176009a;
        if (r02 != null) goto L7;
        return false;
    L7:
        return r02.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams r2) {
        Window.Callback r02 = this.f176009a;
        if (r02 != null) goto L5;
        return;
    L5:
        r02.onWindowAttributesChanged(r2);
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean r2) {
        Window.Callback r02 = this.f176009a;
        if (r02 != null) goto L5;
        return;
    L5:
        r02.onWindowFocusChanged(r2);
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback r2) {
        Window.Callback r02 = this.f176009a;
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.onWindowStartingActionMode(r2);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested(SearchEvent r2) {
        Window.Callback r02 = this.f176009a;
        if (r02 != null) goto L7;
        return false;
    L7:
        return r02.onSearchRequested(r2);
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback r2, int r3) {
        Window.Callback r02 = this.f176009a;
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.onWindowStartingActionMode(r2, r3);
    }
}

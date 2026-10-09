package io.sentry.android.core.internal.gestures;

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

/* loaded from: classes3.dex */
public final class b implements Window.Callback {
    public b() {
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent r1) {
        return false;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent r1) {
        return false;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent r1) {
        return false;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent r1) {
        return false;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent r1) {
        return false;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(MotionEvent r1) {
        return false;
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(ActionMode r1) {
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(ActionMode r1) {
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
    }

    @Override // android.view.Window.Callback
    public void onContentChanged() {
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int r1, Menu r2) {
        return false;
    }

    @Override // android.view.Window.Callback
    public View onCreatePanelView(int r1) {
        return null;
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int r1, MenuItem r2) {
        return false;
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int r1, Menu r2) {
        return false;
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int r1, Menu r2) {
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int r1, View r2, Menu r3) {
        return false;
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        return false;
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams r1) {
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean r1) {
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback r1) {
        return null;
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested(SearchEvent r1) {
        return false;
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback r1, int r2) {
        return null;
    }
}

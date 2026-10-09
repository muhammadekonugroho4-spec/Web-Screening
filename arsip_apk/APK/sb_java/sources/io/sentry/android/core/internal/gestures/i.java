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
public abstract class i implements Window.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Window.Callback f175419a;

    public i(Window.Callback r1) {
        this.f175419a = r1;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent r2) {
        return this.f175419a.dispatchGenericMotionEvent(r2);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent r2) {
        return this.f175419a.dispatchKeyEvent(r2);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent r2) {
        return this.f175419a.dispatchKeyShortcutEvent(r2);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent r2) {
        return this.f175419a.dispatchPopulateAccessibilityEvent(r2);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent r2) {
        return this.f175419a.dispatchTouchEvent(r2);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(MotionEvent r2) {
        return this.f175419a.dispatchTrackballEvent(r2);
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(ActionMode r2) {
        this.f175419a.onActionModeFinished(r2);
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(ActionMode r2) {
        this.f175419a.onActionModeStarted(r2);
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
        this.f175419a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public void onContentChanged() {
        this.f175419a.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int r2, Menu r3) {
        return this.f175419a.onCreatePanelMenu(r2, r3);
    }

    @Override // android.view.Window.Callback
    public View onCreatePanelView(int r2) {
        return this.f175419a.onCreatePanelView(r2);
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f175419a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int r2, MenuItem r3) {
        return this.f175419a.onMenuItemSelected(r2, r3);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int r2, Menu r3) {
        return this.f175419a.onMenuOpened(r2, r3);
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int r2, Menu r3) {
        this.f175419a.onPanelClosed(r2, r3);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int r2, View r3, Menu r4) {
        return this.f175419a.onPreparePanel(r2, r3, r4);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        return this.f175419a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams r2) {
        this.f175419a.onWindowAttributesChanged(r2);
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean r2) {
        this.f175419a.onWindowFocusChanged(r2);
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback r2) {
        return this.f175419a.onWindowStartingActionMode(r2);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested(SearchEvent r2) {
        return this.f175419a.onSearchRequested(r2);
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback r2, int r3) {
        return this.f175419a.onWindowStartingActionMode(r2, r3);
    }
}

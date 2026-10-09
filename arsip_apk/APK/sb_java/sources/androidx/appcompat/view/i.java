package androidx.appcompat.view;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* loaded from: classes.dex */
public abstract class i implements Window.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Window.Callback f2935a;

    public static class a {
        public static boolean a(Window.Callback r02, SearchEvent r1) {
            return r02.onSearchRequested(r1);
        }

        public static ActionMode b(Window.Callback r02, ActionMode.Callback r1, int r2) {
            return r02.onWindowStartingActionMode(r1, r2);
        }
    }

    public static class b {
        public static void a(Window.Callback r02, List<KeyboardShortcutGroup> r1, Menu r2, int r3) {
            r02.onProvideKeyboardShortcuts(r1, r2, r3);
        }
    }

    public static class c {
        public static void a(Window.Callback r02, boolean r1) {
            r02.onPointerCaptureChanged(r1);
        }
    }

    public i(Window.Callback r2) {
        if (r2 == null) goto L7;
        this.f2935a = r2;
        return;
    L7:
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public final Window.Callback a() {
        return this.f2935a;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent r2) {
        return this.f2935a.dispatchGenericMotionEvent(r2);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent r2) {
        return this.f2935a.dispatchKeyEvent(r2);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent r2) {
        return this.f2935a.dispatchKeyShortcutEvent(r2);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent r2) {
        return this.f2935a.dispatchPopulateAccessibilityEvent(r2);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent r2) {
        return this.f2935a.dispatchTouchEvent(r2);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(MotionEvent r2) {
        return this.f2935a.dispatchTrackballEvent(r2);
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(ActionMode r2) {
        this.f2935a.onActionModeFinished(r2);
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(ActionMode r2) {
        this.f2935a.onActionModeStarted(r2);
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
        this.f2935a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int r2, Menu r3) {
        return this.f2935a.onCreatePanelMenu(r2, r3);
    }

    @Override // android.view.Window.Callback
    public View onCreatePanelView(int r2) {
        return this.f2935a.onCreatePanelView(r2);
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f2935a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int r2, MenuItem r3) {
        return this.f2935a.onMenuItemSelected(r2, r3);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int r2, Menu r3) {
        return this.f2935a.onMenuOpened(r2, r3);
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int r2, Menu r3) {
        this.f2935a.onPanelClosed(r2, r3);
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean r2) {
        c.a(this.f2935a, r2);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int r2, View r3, Menu r4) {
        return this.f2935a.onPreparePanel(r2, r3, r4);
    }

    @Override // android.view.Window.Callback
    public void onProvideKeyboardShortcuts(List r2, Menu r3, int r4) {
        b.a(this.f2935a, r2, r3, r4);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested(SearchEvent r2) {
        return a.a(this.f2935a, r2);
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams r2) {
        this.f2935a.onWindowAttributesChanged(r2);
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean r2) {
        this.f2935a.onWindowFocusChanged(r2);
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback r2, int r3) {
        return a.b(this.f2935a, r2, r3);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        return this.f2935a.onSearchRequested();
    }
}

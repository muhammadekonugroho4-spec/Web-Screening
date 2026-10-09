package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* loaded from: classes.dex */
public class o extends c implements Menu {
    public final androidx.core.internal.view.a d;

    public o(Context r1, androidx.core.internal.view.a r2) {
        super(r1);
        if (r2 == null) goto L7;
        this.d = r2;
        return;
    L7:
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence r2) {
        return c(this.d.add(r2));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int r12, int r13, int r14, ComponentName r15, Intent[] r16, Intent r17, int r18, MenuItem[] r19) {
        if (r19 == null) goto L6;
        MenuItem[] r1 = new MenuItem[r19.length];
    L5:
        MenuItem[] r10 = r1;
        int r122 = this.d.addIntentOptions(r12, r13, r14, r15, r16, r17, r18, r10);
        if (r10 == null) goto L12;
        int r132 = r10.length;
        int r142 = 0;
    L10:
        if (r142 >= r132) goto L12;
        r19[r142] = c(r10[r142]);
        r142 = r142 + 1;
    L12:
        return r122;
    L6:
        r1 = null;
        goto L5
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence r2) {
        return d(this.d.addSubMenu(r2));
    }

    @Override // android.view.Menu
    public void clear() {
        e();
        this.d.clear();
    }

    @Override // android.view.Menu
    public void close() {
        this.d.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int r2) {
        return c(this.d.findItem(r2));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int r2) {
        return c(this.d.getItem(r2));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int r2, KeyEvent r3) {
        return this.d.isShortcutKey(r2, r3);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int r2, int r3) {
        return this.d.performIdentifierAction(r2, r3);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int r2, KeyEvent r3, int r4) {
        return this.d.performShortcut(r2, r3, r4);
    }

    @Override // android.view.Menu
    public void removeGroup(int r2) {
        f(r2);
        this.d.removeGroup(r2);
    }

    @Override // android.view.Menu
    public void removeItem(int r2) {
        g(r2);
        this.d.removeItem(r2);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int r2, boolean r3, boolean r4) {
        this.d.setGroupCheckable(r2, r3, r4);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int r2, boolean r3) {
        this.d.setGroupEnabled(r2, r3);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int r2, boolean r3) {
        this.d.setGroupVisible(r2, r3);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean r2) {
        this.d.setQwertyMode(r2);
    }

    @Override // android.view.Menu
    public int size() {
        return this.d.size();
    }

    @Override // android.view.Menu
    public MenuItem add(int r2) {
        return c(this.d.add(r2));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int r2) {
        return d(this.d.addSubMenu(r2));
    }

    @Override // android.view.Menu
    public MenuItem add(int r2, int r3, int r4, CharSequence r5) {
        return c(this.d.add(r2, r3, r4, r5));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int r2, int r3, int r4, CharSequence r5) {
        return d(this.d.addSubMenu(r2, r3, r4, r5));
    }

    @Override // android.view.Menu
    public MenuItem add(int r2, int r3, int r4, int r5) {
        return c(this.d.add(r2, r3, r4, r5));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int r2, int r3, int r4, int r5) {
        return d(this.d.addSubMenu(r2, r3, r4, r5));
    }
}

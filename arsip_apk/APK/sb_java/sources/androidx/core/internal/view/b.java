package androidx.core.internal.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import android.view.View;
import androidx.core.view.AbstractC3862b;

/* loaded from: classes.dex */
public interface b extends MenuItem {
    AbstractC3862b a();

    b b(AbstractC3862b r1);

    @Override // android.view.MenuItem
    boolean collapseActionView();

    @Override // android.view.MenuItem
    boolean expandActionView();

    @Override // android.view.MenuItem
    View getActionView();

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    boolean isActionViewExpanded();

    @Override // android.view.MenuItem
    MenuItem setActionView(int r1);

    @Override // android.view.MenuItem
    MenuItem setActionView(View r1);

    @Override // android.view.MenuItem
    MenuItem setAlphabeticShortcut(char r1, int r2);

    @Override // android.view.MenuItem
    b setContentDescription(CharSequence r1);

    @Override // android.view.MenuItem
    MenuItem setIconTintList(ColorStateList r1);

    @Override // android.view.MenuItem
    MenuItem setIconTintMode(PorterDuff.Mode r1);

    @Override // android.view.MenuItem
    MenuItem setNumericShortcut(char r1, int r2);

    @Override // android.view.MenuItem
    MenuItem setShortcut(char r1, char r2, int r3, int r4);

    @Override // android.view.MenuItem
    void setShowAsAction(int r1);

    @Override // android.view.MenuItem
    MenuItem setShowAsActionFlags(int r1);

    @Override // android.view.MenuItem
    b setTooltipText(CharSequence r1);
}

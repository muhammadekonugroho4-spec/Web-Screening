package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC3862b;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class j extends androidx.appcompat.view.menu.c implements MenuItem {
    public final androidx.core.internal.view.b d;

    /* renamed from: e, reason: collision with root package name */
    public Method f3082e;

    public class a extends AbstractC3862b implements ActionProvider.VisibilityListener {
        public AbstractC3862b.InterfaceC0173b d;

        /* renamed from: e, reason: collision with root package name */
        public final ActionProvider f3083e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ j f3084f;

        public a(j r1, Context r2, ActionProvider r3) {
            this.f3084f = r1;
            super(r2);
            this.f3083e = r3;
        }

        public static /* synthetic */ ActionProvider l(a r02) {
            return r02.f3083e;
        }

        @Override // androidx.core.view.AbstractC3862b
        public boolean a() {
            return this.f3083e.hasSubMenu();
        }

        @Override // androidx.core.view.AbstractC3862b
        public boolean b() {
            return this.f3083e.isVisible();
        }

        @Override // androidx.core.view.AbstractC3862b
        public View c() {
            return this.f3083e.onCreateActionView();
        }

        @Override // androidx.core.view.AbstractC3862b
        public View d(MenuItem r2) {
            return this.f3083e.onCreateActionView(r2);
        }

        @Override // androidx.core.view.AbstractC3862b
        public boolean e() {
            return this.f3083e.onPerformDefaultAction();
        }

        @Override // androidx.core.view.AbstractC3862b
        public void f(SubMenu r3) {
            this.f3083e.onPrepareSubMenu(this.f3084f.d(r3));
        }

        @Override // androidx.core.view.AbstractC3862b
        public boolean g() {
            return this.f3083e.overridesItemVisibility();
        }

        @Override // androidx.core.view.AbstractC3862b
        public void j(AbstractC3862b.InterfaceC0173b r2) {
            this.d = r2;
            ActionProvider r02 = this.f3083e;
            if (r2 == null) goto L5;
            a r22 = this;
        L6:
            r02.setVisibilityListener(r22);
            return;
        L5:
            r22 = null;
            goto L6
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean r2) {
            AbstractC3862b.InterfaceC0173b r02 = this.d;
            if (r02 == null) goto L6;
            r02.onActionProviderVisibilityChanged(r2);
            return;
        }
    }

    public static class b extends FrameLayout implements androidx.appcompat.view.c {

        /* renamed from: a, reason: collision with root package name */
        public final CollapsibleActionView f3085a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(View r2) {
            super(r2.getContext());
            this.f3085a = (CollapsibleActionView) r2;
            addView(r2);
        }

        @Override // androidx.appcompat.view.c
        public void a() {
            this.f3085a.onActionViewCollapsed();
        }

        @Override // androidx.appcompat.view.c
        public void b() {
            this.f3085a.onActionViewExpanded();
        }

        public View c() {
            return (View) this.f3085a;
        }
    }

    public class c implements MenuItem.OnActionExpandListener {

        /* renamed from: a, reason: collision with root package name */
        public final MenuItem.OnActionExpandListener f3086a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j f3087b;

        public c(j r1, MenuItem.OnActionExpandListener r2) {
            this.f3087b = r1;
            this.f3086a = r2;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem r3) {
            return this.f3086a.onMenuItemActionCollapse(this.f3087b.c(r3));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem r3) {
            return this.f3086a.onMenuItemActionExpand(this.f3087b.c(r3));
        }
    }

    public class d implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final MenuItem.OnMenuItemClickListener f3088a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j f3089b;

        public d(j r1, MenuItem.OnMenuItemClickListener r2) {
            this.f3089b = r1;
            this.f3088a = r2;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem r3) {
            return this.f3088a.onMenuItemClick(this.f3089b.c(r3));
        }
    }

    public j(Context r1, androidx.core.internal.view.b r2) {
        super(r1);
        if (r2 == null) goto L7;
        this.d = r2;
        return;
    L7:
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        AbstractC3862b r02 = this.d.a();
        if ((r02 instanceof a) == true) goto L5;
        return null;
    L5:
        return a.l((a) r02);
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View r02 = this.d.getActionView();
        if ((r02 instanceof b) == true) goto L5;
        return r02;
    L5:
        return ((b) r02).c();
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return d(this.d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.d.getTooltipText();
    }

    public void h(boolean r4) {
    L5:
        e = move-exception;
        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
        return;
    L3:
        if (this.f3082e != null) goto L7;
        this.f3082e = this.d.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});     // Catch: Exception -> L5
    L7:
        this.f3082e.invoke(this.d, new Object[]{Boolean.valueOf(r4)});     // Catch: Exception -> L5
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider r3) {
        a r02 = new a(this, this.f2994a, r3);
        androidx.core.internal.view.b r1 = this.d;
        if (r3 != null) goto L6;
        r02 = null;
    L6:
        r1.b(r02);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View r2) {
        if ((r2 instanceof CollapsibleActionView) == false) goto L5;
        r2 = new b(r2);
    L5:
        this.d.setActionView(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char r2) {
        this.d.setAlphabeticShortcut(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean r2) {
        this.d.setCheckable(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean r2) {
        this.d.setChecked(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence r2) {
        this.d.setContentDescription(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean r2) {
        this.d.setEnabled(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable r2) {
        this.d.setIcon(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList r2) {
        this.d.setIconTintList(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode r2) {
        this.d.setIconTintMode(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent r2) {
        this.d.setIntent(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char r2) {
        this.d.setNumericShortcut(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener r3) {
        androidx.core.internal.view.b r02 = this.d;
        if (r3 == null) goto L5;
        c r1 = new c(this, r3);
    L6:
        r02.setOnActionExpandListener(r1);
        return this;
    L5:
        r1 = null;
        goto L6
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener r3) {
        androidx.core.internal.view.b r02 = this.d;
        if (r3 == null) goto L5;
        d r1 = new d(this, r3);
    L6:
        r02.setOnMenuItemClickListener(r1);
        return this;
    L5:
        r1 = null;
        goto L6
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char r2, char r3) {
        this.d.setShortcut(r2, r3);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int r2) {
        this.d.setShowAsAction(r2);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int r2) {
        this.d.setShowAsActionFlags(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence r2) {
        this.d.setTitle(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence r2) {
        this.d.setTitleCondensed(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence r2) {
        this.d.setTooltipText(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean r2) {
        return this.d.setVisible(r2);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char r2, int r3) {
        this.d.setAlphabeticShortcut(r2, r3);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int r2) {
        this.d.setIcon(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char r2, int r3) {
        this.d.setNumericShortcut(r2, r3);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char r2, char r3, int r4, int r5) {
        this.d.setShortcut(r2, r3, r4, r5);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int r2) {
        this.d.setTitle(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int r3) {
        this.d.setActionView(r3);
        View r32 = this.d.getActionView();
        if ((r32 instanceof CollapsibleActionView) == false) goto L5;
        this.d.setActionView(new b(r32));
    L5:
        return this;
    }
}

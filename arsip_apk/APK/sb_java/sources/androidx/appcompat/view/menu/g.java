package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.AbstractC3862b;
import androidx.core.view.AbstractC3875h0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class g implements androidx.core.internal.view.a {
    private static final String ACTION_VIEW_STATES_KEY = "android:menu:actionviewstates";
    private static final String EXPANDED_ACTION_VIEW_ID = "android:menu:expandedactionview";
    private static final String PRESENTER_KEY = "android:menu:presenters";
    private static final String TAG = "MenuBuilder";
    private static final int[] sCategoryToOrder = null;
    private ArrayList<i> mActionItems;
    private a mCallback;
    private final Context mContext;
    private ContextMenu.ContextMenuInfo mCurrentMenuInfo;
    private int mDefaultShowAsAction;
    private i mExpandedItem;
    private boolean mGroupDividerEnabled;
    Drawable mHeaderIcon;
    CharSequence mHeaderTitle;
    View mHeaderView;
    private boolean mIsActionItemsStale;
    private boolean mIsClosing;
    private boolean mIsVisibleItemsStale;
    private ArrayList<i> mItems;
    private boolean mItemsChangedWhileDispatchPrevented;
    private ArrayList<i> mNonActionItems;
    private boolean mOptionalIconsVisible;
    private boolean mOverrideVisibleItems;
    private CopyOnWriteArrayList<WeakReference<m>> mPresenters;
    private boolean mPreventDispatchingItemsChanged;
    private boolean mQwertyMode;
    private final Resources mResources;
    private boolean mShortcutsVisible;
    private boolean mStructureChangedWhileDispatchPrevented;
    private ArrayList<i> mTempShortcutItemList;
    private ArrayList<i> mVisibleItems;

    public interface a {
        boolean onMenuItemSelected(g r1, MenuItem r2);

        void onMenuModeChange(g r1);
    }

    public interface b {
        boolean c(i r1);
    }

    static {
        sCategoryToOrder = new int[]{1, 4, 5, 3, 2, 0};
    }

    public g(Context r3) {
        this.mDefaultShowAsAction = 0;
        this.mPreventDispatchingItemsChanged = false;
        this.mItemsChangedWhileDispatchPrevented = false;
        this.mStructureChangedWhileDispatchPrevented = false;
        this.mOptionalIconsVisible = false;
        this.mIsClosing = false;
        this.mTempShortcutItemList = new ArrayList();
        this.mPresenters = new CopyOnWriteArrayList();
        this.mGroupDividerEnabled = false;
        this.mContext = r3;
        this.mResources = r3.getResources();
        this.mItems = new ArrayList();
        this.mVisibleItems = new ArrayList();
        this.mIsVisibleItemsStale = true;
        this.mActionItems = new ArrayList();
        this.mNonActionItems = new ArrayList();
        this.mIsActionItemsStale = true;
        j(true);
    }

    public static int f(ArrayList r2, int r3) {
        int r02 = r2.size() - 1;
    L3:
        if (r02 < 0) goto L9;
        if (((i) r2.get(r02)).f() <= r3) goto L7;
        r02 = r02 - 1;
        goto L3
    L7:
        return r02 + 1;
    L9:
        return 0;
    }

    public static int g(int r3) {
        int r02 = ((-65536) & r3) >> 16;
        if (r02 < 0) goto L9;
        int[] r1 = sCategoryToOrder;
        if (r02 >= r1.length) goto L9;
        int r32 = r3 & 65535;
        return r32 | (r1[r02] << 16);
    L9:
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public final i a(int r9, int r10, int r11, int r12, CharSequence r13, int r14) {
        return new i(this, r9, r10, r11, r12, r13, r14);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence r2) {
        return addInternal(0, 0, 0, r2);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int r8, int r9, int r10, ComponentName r11, Intent[] r12, Intent r13, int r14, MenuItem[] r15) {
        PackageManager r02 = this.mContext.getPackageManager();
        int r1 = 0;
        List<ResolveInfo> r112 = r02.queryIntentActivityOptions(r11, r12, r13, 0);
        if (r112 == null) goto L5;
        int r2 = r112.size();
    L7:
        if ((r14 & 1) != 0) goto L9;
        removeGroup(r8);
    L9:
        if (r1 >= r2) goto L20;
        ResolveInfo r142 = r112.get(r1);
        int r4 = r142.specificIndex;
        if (r4 >= 0) goto L13;
        Intent r42 = r13;
    L14:
        Intent r3 = new Intent(r42);
        ActivityInfo r5 = r142.activityInfo;
        r3.setComponent(new ComponentName(r5.applicationInfo.packageName, r5.name));
        MenuItem r32 = add(r8, r9, r10, r142.loadLabel(r02)).setIcon(r142.loadIcon(r02)).setIntent(r3);
        if (r15 == null) goto L19;
        int r143 = r142.specificIndex;
        if (r143 < 0) goto L19;
        r15[r143] = r32;
    L19:
        r1 = r1 + 1;
        goto L9
    L13:
        r42 = r12[r4];
        goto L14
    L20:
        return r2;
    L5:
        r2 = 0;
        goto L7
    }

    public MenuItem addInternal(int r8, int r9, int r10, CharSequence r11) {
        int r4 = g(r10);
        i r82 = a(r8, r9, r10, r4, r11, this.mDefaultShowAsAction);
        ContextMenu.ContextMenuInfo r92 = this.mCurrentMenuInfo;
        if (r92 == null) goto L5;
        r82.v(r92);
    L5:
        ArrayList<i> r93 = this.mItems;
        r93.add(f(r93, r4), r82);
        onItemsChanged(true);
        return r82;
    }

    public void addMenuPresenter(m r2) {
        addMenuPresenter(r2, this.mContext);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence r2) {
        return addSubMenu(0, 0, 0, r2);
    }

    public final void b(boolean r4) {
        if (this.mPresenters.isEmpty() == false) goto L5;
        return;
    L5:
        stopDispatchingItemsChanged();
        Iterator<WeakReference<m>> r02 = this.mPresenters.iterator();
    L7:
        if (r02.hasNext() == false) goto L12;
        WeakReference<m> r1 = r02.next();
        m r2 = r1.get();
        if (r2 == null) goto L10;
        r2.updateMenuView(r4);
        goto L7
    L10:
        this.mPresenters.remove(r1);
        goto L7
    L12:
        startDispatchingItemsChanged();
    }

    public final void c(Bundle r4) {
        SparseArray r42 = r4.getSparseParcelableArray(PRESENTER_KEY);
        if (r42 != null) goto L5;
        return;
    L5:
        if (this.mPresenters.isEmpty() == true) goto L29;
        Iterator<WeakReference<m>> r02 = this.mPresenters.iterator();
    L9:
        if (r02.hasNext() == false) goto L30;
        WeakReference<m> r1 = r02.next();
        m r2 = r1.get();
        if (r2 == null) goto L12;
        int r12 = r2.getId();
        if (r12 <= 0) goto L9;
        Parcelable r13 = (Parcelable) r42.get(r12);
        if (r13 == null) goto L9;
        r2.onRestoreInstanceState(r13);
        goto L9
    L12:
        this.mPresenters.remove(r1);
        goto L9
    L30:
        return;
    }

    public void changeMenuMode() {
        a r02 = this.mCallback;
        if (r02 == null) goto L6;
        r02.onMenuModeChange(this);
        return;
    }

    @Override // android.view.Menu
    public void clear() {
        i r02 = this.mExpandedItem;
        if (r02 == null) goto L5;
        collapseItemActionView(r02);
    L5:
        this.mItems.clear();
        onItemsChanged(true);
    }

    public void clearAll() {
        this.mPreventDispatchingItemsChanged = true;
        clear();
        clearHeader();
        this.mPresenters.clear();
        this.mPreventDispatchingItemsChanged = false;
        this.mItemsChangedWhileDispatchPrevented = false;
        this.mStructureChangedWhileDispatchPrevented = false;
        onItemsChanged(true);
    }

    public void clearHeader() {
        this.mHeaderIcon = null;
        this.mHeaderTitle = null;
        this.mHeaderView = null;
        onItemsChanged(false);
    }

    public final void close(boolean r4) {
        if (this.mIsClosing == false) goto L5;
        return;
    L5:
        this.mIsClosing = true;
        Iterator<WeakReference<m>> r02 = this.mPresenters.iterator();
    L7:
        if (r02.hasNext() == false) goto L12;
        WeakReference<m> r1 = r02.next();
        m r2 = r1.get();
        if (r2 == null) goto L10;
        r2.onCloseMenu(this, r4);
        goto L7
    L10:
        this.mPresenters.remove(r1);
        goto L7
    L12:
        this.mIsClosing = false;
    }

    public boolean collapseItemActionView(i r5) {
        boolean r1 = false;
        if (this.mPresenters.isEmpty() == false) goto L5;
    L18:
        return r1;
    L5:
        if (this.mExpandedItem != r5) goto L18;
        stopDispatchingItemsChanged();
        Iterator<WeakReference<m>> r02 = this.mPresenters.iterator();
    L9:
        if (r02.hasNext() == false) goto L15;
        WeakReference<m> r2 = r02.next();
        m r3 = r2.get();
        if (r3 == null) goto L12;
        r1 = r3.collapseItemActionView(this, r5);
        if (r1 == false) goto L9;
    L12:
        this.mPresenters.remove(r2);
    L15:
        startDispatchingItemsChanged();
        if (r1 == false) goto L18;
        this.mExpandedItem = null;
        goto L18
    }

    public final void d(Bundle r5) {
        if (this.mPresenters.isEmpty() == false) goto L5;
        return;
    L5:
        SparseArray<? extends Parcelable> r02 = new SparseArray();
        Iterator<WeakReference<m>> r1 = this.mPresenters.iterator();
    L7:
        if (r1.hasNext() == false) goto L16;
        WeakReference<m> r2 = r1.next();
        m r3 = r2.get();
        if (r3 == null) goto L10;
        int r22 = r3.getId();
        if (r22 <= 0) goto L7;
        Parcelable r32 = r3.onSaveInstanceState();
        if (r32 == null) goto L7;
        r02.put(r22, r32);
        goto L7
    L10:
        this.mPresenters.remove(r2);
        goto L7
    L16:
        r5.putSparseParcelableArray(PRESENTER_KEY, r02);
    }

    public boolean dispatchMenuItemSelected(g r2, MenuItem r3) {
        a r02 = this.mCallback;
        if (r02 != null) goto L5;
        return false;
    L5:
        if (r02.onMenuItemSelected(r2, r3) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public final boolean e(r r4, m r5) {
        boolean r1 = false;
        if (this.mPresenters.isEmpty() == false) goto L5;
        return false;
    L5:
        if (r5 == null) goto L7;
        r1 = r5.onSubMenuSelected(r4);
    L7:
        Iterator<WeakReference<m>> r52 = this.mPresenters.iterator();
    L9:
        if (r52.hasNext() == false) goto L15;
        WeakReference<m> r02 = r52.next();
        m r2 = r02.get();
        if (r2 == null) goto L12;
        if (r1 == true) goto L9;
        r1 = r2.onSubMenuSelected(r4);
        goto L9
    L12:
        this.mPresenters.remove(r02);
        goto L9
    L15:
        return r1;
    }

    public boolean expandItemActionView(i r5) {
        boolean r1 = false;
        if (this.mPresenters.isEmpty() == false) goto L5;
        return false;
    L5:
        stopDispatchingItemsChanged();
        Iterator<WeakReference<m>> r02 = this.mPresenters.iterator();
    L7:
        if (r02.hasNext() == false) goto L13;
        WeakReference<m> r2 = r02.next();
        m r3 = r2.get();
        if (r3 == null) goto L10;
        r1 = r3.expandItemActionView(this, r5);
        if (r1 == false) goto L7;
    L10:
        this.mPresenters.remove(r2);
    L13:
        startDispatchingItemsChanged();
        if (r1 == false) goto L16;
        this.mExpandedItem = r5;
    L16:
        return r1;
    }

    public int findGroupIndex(int r2) {
        return findGroupIndex(r2, 0);
    }

    @Override // android.view.Menu
    public MenuItem findItem(int r5) {
        int r02 = size();
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L13;
        i r2 = this.mItems.get(r1);
        if (r2.getItemId() == r5) goto L6;
        if (r2.hasSubMenu() == false) goto L12;
        MenuItem r22 = r2.getSubMenu().findItem(r5);
        if (r22 == null) goto L12;
        return r22;
    L12:
        r1 = r1 + 1;
        goto L3
    L6:
        return r2;
    L13:
        return null;
    }

    public int findItemIndex(int r4) {
        int r02 = size();
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L8;
        if (this.mItems.get(r1).getItemId() == r4) goto L6;
        r1 = r1 + 1;
        goto L3
    L6:
        return r1;
    L8:
        return -1;
    }

    public i findItemWithShortcutForKey(int r12, KeyEvent r13) {
        ArrayList<i> r02 = this.mTempShortcutItemList;
        r02.clear();
        findItemsWithShortcutForKey(r02, r12, r13);
        if (r02.isEmpty() == false) goto L5;
        return null;
    L5:
        int r1 = r13.getMetaState();
        KeyCharacterMap.KeyData r3 = new KeyCharacterMap.KeyData();
        r13.getKeyData(r3);
        int r132 = r02.size();
        if (r132 == 1) goto L8;
        boolean r4 = isQwertyMode();
        int r6 = 0;
    L10:
        if (r6 >= r132) goto L30;
        i r7 = r02.get(r6);
        if (r4 == false) goto L14;
        char r8 = r7.getAlphabeticShortcut();
    L15:
        char[] r9 = r3.meta;
        if (r8 != r9[0]) goto L20;
        if ((r1 & 2) != 0) goto L20;
    L28:
        return r7;
    L20:
        if (r8 == r9[2]) goto L22;
    L23:
        if (r4 == false) goto L29;
        if (r8 != '\b') goto L29;
        if (r12 == 67) goto L28;
    L29:
        r6 = r6 + 1;
        goto L10
    L22:
        if ((r1 & 2) != 0) goto L28;
    L14:
        r8 = r7.getNumericShortcut();
        goto L15
    L30:
        return null;
    L8:
        return r02.get(0);
    }

    public void findItemsWithShortcutForKey(List<i> r13, int r14, KeyEvent r15) {
        boolean r02 = isQwertyMode();
        int r1 = r15.getModifiers();
        KeyCharacterMap.KeyData r2 = new KeyCharacterMap.KeyData();
        if (r15.getKeyData(r2) == true) goto L6;
        if (r14 == 67) goto L6;
        return;
    L6:
        int r3 = this.mItems.size();
        int r6 = 0;
    L7:
        if (r6 >= r3) goto L41;
        i r7 = this.mItems.get(r6);
        if (r7.hasSubMenu() == false) goto L11;
        ((g) r7.getSubMenu()).findItemsWithShortcutForKey(r13, r14, r15);
    L11:
        if (r02 == false) goto L13;
        char r8 = r7.getAlphabeticShortcut();
    L14:
        if (r02 == false) goto L16;
        int r9 = r7.getAlphabeticModifiers();
    L18:
        if ((r1 & 69647) != (r9 & 69647)) goto L31;
        if (r8 == 0) goto L31;
        char[] r92 = r2.meta;
        if (r8 == r92[0]) goto L29;
        if (r8 == r92[2]) goto L29;
        if (r02 == false) goto L31;
        if (r8 != '\b') goto L31;
        if (r14 != 67) goto L31;
    L29:
        if (r7.isEnabled() == false) goto L31;
        r13.add(r7);
    L31:
        r6 = r6 + 1;
        goto L7
    L16:
        r9 = r7.getNumericModifiers();
        goto L18
    L13:
        r8 = r7.getNumericShortcut();
        goto L14
    }

    public void flagActionItems() {
        ArrayList<i> r02 = getVisibleItems();
        if (this.mIsActionItemsStale == true) goto L5;
        return;
    L5:
        Iterator<WeakReference<m>> r1 = this.mPresenters.iterator();
        boolean r3 = false;
    L7:
        if (r1.hasNext() == false) goto L12;
        WeakReference<m> r4 = r1.next();
        m r5 = r4.get();
        if (r5 == null) goto L10;
        r3 = r3 | r5.flagActionItems();
        goto L7
    L10:
        this.mPresenters.remove(r4);
        goto L7
    L12:
        if (r3 == false) goto L20;
        this.mActionItems.clear();
        this.mNonActionItems.clear();
        int r12 = r02.size();
        int r32 = 0;
    L14:
        if (r32 >= r12) goto L21;
        i r42 = r02.get(r32);
        if (r42.l() == false) goto L18;
        this.mActionItems.add(r42);
    L19:
        r32 = r32 + 1;
        goto L14
    L18:
        this.mNonActionItems.add(r42);
    L21:
        this.mIsActionItemsStale = false;
        return;
    L20:
        this.mActionItems.clear();
        this.mNonActionItems.clear();
        this.mNonActionItems.addAll(getVisibleItems());
        goto L21
    }

    public ArrayList<i> getActionItems() {
        flagActionItems();
        return this.mActionItems;
    }

    public String getActionViewStatesKey() {
        return ACTION_VIEW_STATES_KEY;
    }

    public Context getContext() {
        return this.mContext;
    }

    public i getExpandedItem() {
        return this.mExpandedItem;
    }

    public Drawable getHeaderIcon() {
        return this.mHeaderIcon;
    }

    public CharSequence getHeaderTitle() {
        return this.mHeaderTitle;
    }

    public View getHeaderView() {
        return this.mHeaderView;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int r2) {
        return this.mItems.get(r2);
    }

    public ArrayList<i> getNonActionItems() {
        flagActionItems();
        return this.mNonActionItems;
    }

    public boolean getOptionalIconsVisible() {
        return this.mOptionalIconsVisible;
    }

    public Resources getResources() {
        return this.mResources;
    }

    public g getRootMenu() {
        return this;
    }

    public ArrayList<i> getVisibleItems() {
        if (this.mIsVisibleItemsStale == false) goto L5;
        this.mVisibleItems.clear();
        int r02 = this.mItems.size();
        int r2 = 0;
    L7:
        if (r2 >= r02) goto L12;
        i r3 = this.mItems.get(r2);
        if (r3.isVisible() == false) goto L11;
        this.mVisibleItems.add(r3);
    L11:
        r2 = r2 + 1;
        goto L7
    L12:
        this.mIsVisibleItemsStale = false;
        this.mIsActionItemsStale = true;
        return this.mVisibleItems;
    L5:
        return this.mVisibleItems;
    }

    public final void h(int r2, boolean r3) {
        if (r2 >= 0) goto L4;
        return;
    L4:
        if (r2 >= this.mItems.size()) goto L12;
        this.mItems.remove(r2);
        if (r3 == false) goto L11;
        onItemsChanged(true);
        return;
    L11:
        return;
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.mOverrideVisibleItems == false) goto L5;
        return true;
    L5:
        int r02 = size();
        int r3 = 0;
    L6:
        if (r3 >= r02) goto L11;
        if (this.mItems.get(r3).isVisible() == true) goto L9;
        r3 = r3 + 1;
        goto L6
    L9:
        return true;
    L11:
        return false;
    }

    public final void i(int r3, CharSequence r4, int r5, Drawable r6, View r7) {
        Resources r02 = getResources();
        if (r7 == null) goto L5;
        this.mHeaderView = r7;
        this.mHeaderTitle = null;
        this.mHeaderIcon = null;
    L14:
        onItemsChanged(false);
        return;
    L5:
        if (r3 <= 0) goto L7;
        this.mHeaderTitle = r02.getText(r3);
    L9:
        if (r5 <= 0) goto L11;
        this.mHeaderIcon = androidx.core.content.b.getDrawable(getContext(), r5);
    L13:
        this.mHeaderView = null;
        goto L14
    L11:
        if (r6 == null) goto L13;
        this.mHeaderIcon = r6;
        goto L13
    L7:
        if (r4 == null) goto L9;
        this.mHeaderTitle = r4;
        goto L9
    }

    public boolean isDispatchingItemsChanged() {
        return !this.mPreventDispatchingItemsChanged;
    }

    public boolean isGroupDividerEnabled() {
        return this.mGroupDividerEnabled;
    }

    public boolean isQwertyMode() {
        return this.mQwertyMode;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int r1, KeyEvent r2) {
        if (findItemWithShortcutForKey(r1, r2) == null) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean isShortcutsVisible() {
        return this.mShortcutsVisible;
    }

    public final void j(boolean r3) {
        if (r3 == false) goto L8;
        boolean r02 = true;
        if (this.mResources.getConfiguration().keyboard == 1) goto L8;
        if (AbstractC3875h0.j(ViewConfiguration.get(this.mContext), this.mContext) == false) goto L8;
    L9:
        this.mShortcutsVisible = r02;
        return;
    L8:
        r02 = false;
        goto L9
    }

    public void onItemActionRequestChanged(i r1) {
        this.mIsActionItemsStale = true;
        onItemsChanged(true);
    }

    public void onItemVisibleChanged(i r1) {
        this.mIsVisibleItemsStale = true;
        onItemsChanged(true);
    }

    public void onItemsChanged(boolean r3) {
        if (this.mPreventDispatchingItemsChanged == true) goto L8;
        if (r3 == false) goto L6;
        this.mIsVisibleItemsStale = true;
        this.mIsActionItemsStale = true;
    L6:
        b(r3);
        return;
    L8:
        this.mItemsChangedWhileDispatchPrevented = true;
        if (r3 == false) goto L12;
        this.mStructureChangedWhileDispatchPrevented = true;
        return;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int r1, int r2) {
        return performItemAction(findItem(r1), r2);
    }

    public boolean performItemAction(MenuItem r2, int r3) {
        return performItemAction(r2, null, r3);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int r1, KeyEvent r2, int r3) {
        i r12 = findItemWithShortcutForKey(r1, r2);
        if (r12 == null) goto L5;
        boolean r13 = performItemAction(r12, r3);
    L7:
        if ((r3 & 2) == 0) goto L9;
        close(true);
    L9:
        return r13;
    L5:
        r13 = false;
        goto L7
    }

    @Override // android.view.Menu
    public void removeGroup(int r6) {
        int r02 = findGroupIndex(r6);
        if (r02 < 0) goto L14;
        int r1 = this.mItems.size() - r02;
        int r3 = 0;
    L5:
        int r4 = r3 + 1;
        if (r3 >= r1) goto L10;
        if (this.mItems.get(r02).getGroupId() != r6) goto L10;
        h(r02, false);
        r3 = r4;
    L10:
        onItemsChanged(true);
        return;
    }

    @Override // android.view.Menu
    public void removeItem(int r2) {
        h(findItemIndex(r2), true);
    }

    public void removeItemAt(int r2) {
        h(r2, true);
    }

    public void removeMenuPresenter(m r4) {
        Iterator<WeakReference<m>> r02 = this.mPresenters.iterator();
    L4:
        if (r02.hasNext() == false) goto L9;
        WeakReference<m> r1 = r02.next();
        m r2 = r1.get();
        if (r2 == null) goto L8;
        if (r2 != r4) goto L4;
    L8:
        this.mPresenters.remove(r1);
        goto L4
    }

    public void restoreActionViewStates(Bundle r8) {
        if (r8 == null) goto L26;
        SparseArray<Parcelable> r02 = r8.getSparseParcelableArray(getActionViewStatesKey());
        int r1 = size();
        int r2 = 0;
    L5:
        if (r2 >= r1) goto L15;
        MenuItem r3 = getItem(r2);
        View r4 = r3.getActionView();
        if (r4 == null) goto L12;
        if (r4.getId() == (-1)) goto L12;
        r4.restoreHierarchyState(r02);
    L12:
        if (r3.hasSubMenu() == false) goto L14;
        ((r) r3.getSubMenu()).restoreActionViewStates(r8);
    L14:
        r2 = r2 + 1;
        goto L5
    L15:
        int r82 = r8.getInt(EXPANDED_ACTION_VIEW_ID);
        if (r82 <= 0) goto L24;
        MenuItem r83 = findItem(r82);
        if (r83 == null) goto L25;
        r83.expandActionView();
        return;
    L25:
        return;
    L24:
        return;
    }

    public void restorePresenterStates(Bundle r1) {
        c(r1);
    }

    public void saveActionViewStates(Bundle r8) {
        int r02 = size();
        SparseArray<? extends Parcelable> r1 = null;
        int r2 = 0;
    L3:
        if (r2 >= r02) goto L17;
        MenuItem r3 = getItem(r2);
        View r4 = r3.getActionView();
        if (r4 == null) goto L14;
        if (r4.getId() == (-1)) goto L14;
        if (r1 != null) goto L10;
        r1 = new SparseArray();
    L10:
        r4.saveHierarchyState(r1);
        if (r3.isActionViewExpanded() == false) goto L14;
        r8.putInt(EXPANDED_ACTION_VIEW_ID, r3.getItemId());
    L14:
        if (r3.hasSubMenu() == false) goto L16;
        ((r) r3.getSubMenu()).saveActionViewStates(r8);
    L16:
        r2 = r2 + 1;
        goto L3
    L17:
        if (r1 == null) goto L23;
        r8.putSparseParcelableArray(getActionViewStatesKey(), r1);
        return;
    }

    public void savePresenterStates(Bundle r1) {
        d(r1);
    }

    public void setCallback(a r1) {
        this.mCallback = r1;
    }

    public void setCurrentMenuInfo(ContextMenu.ContextMenuInfo r1) {
        this.mCurrentMenuInfo = r1;
    }

    public g setDefaultShowAsAction(int r1) {
        this.mDefaultShowAsAction = r1;
        return this;
    }

    public void setExclusiveItemChecked(MenuItem r7) {
        int r02 = r7.getGroupId();
        int r1 = this.mItems.size();
        stopDispatchingItemsChanged();
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L17;
        i r4 = this.mItems.get(r3);
        if (r4.getGroupId() != r02) goto L16;
        if (r4.m() == false) goto L16;
        if (r4.isCheckable() == false) goto L16;
        if (r4 != r7) goto L14;
        boolean r5 = true;
    L15:
        r4.s(r5);
        goto L16
    L14:
        r5 = false;
    L16:
        r3 = r3 + 1;
        goto L3
    L17:
        startDispatchingItemsChanged();
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int r5, boolean r6, boolean r7) {
        int r02 = this.mItems.size();
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L8;
        i r2 = this.mItems.get(r1);
        if (r2.getGroupId() != r5) goto L7;
        r2.t(r7);
        r2.setCheckable(r6);
    L7:
        r1 = r1 + 1;
        goto L3
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean r1) {
        this.mGroupDividerEnabled = r1;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int r5, boolean r6) {
        int r02 = this.mItems.size();
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L8;
        i r2 = this.mItems.get(r1);
        if (r2.getGroupId() != r5) goto L7;
        r2.setEnabled(r6);
    L7:
        r1 = r1 + 1;
        goto L3
    }

    @Override // android.view.Menu
    public void setGroupVisible(int r7, boolean r8) {
        int r02 = this.mItems.size();
        int r1 = 0;
        boolean r2 = false;
    L4:
        if (r1 >= r02) goto L11;
        i r4 = this.mItems.get(r1);
        if (r4.getGroupId() != r7) goto L10;
        if (r4.y(r8) == false) goto L10;
        r2 = true;
    L10:
        r1 = r1 + 1;
        goto L4
    L11:
        if (r2 == false) goto L18;
        onItemsChanged(true);
        return;
    }

    public g setHeaderIconInt(Drawable r7) {
        i(0, null, 0, r7, null);
        return this;
    }

    public g setHeaderTitleInt(CharSequence r7) {
        i(0, r7, 0, null, null);
        return this;
    }

    public g setHeaderViewInt(View r7) {
        i(0, null, 0, null, r7);
        return this;
    }

    public void setOptionalIconsVisible(boolean r1) {
        this.mOptionalIconsVisible = r1;
    }

    public void setOverrideVisibleItems(boolean r1) {
        this.mOverrideVisibleItems = r1;
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean r1) {
        this.mQwertyMode = r1;
        onItemsChanged(false);
    }

    public void setShortcutsVisible(boolean r2) {
        if (this.mShortcutsVisible != r2) goto L5;
        return;
    L5:
        j(r2);
        onItemsChanged(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.mItems.size();
    }

    public void startDispatchingItemsChanged() {
        this.mPreventDispatchingItemsChanged = false;
        if (this.mItemsChangedWhileDispatchPrevented == false) goto L6;
        this.mItemsChangedWhileDispatchPrevented = false;
        onItemsChanged(this.mStructureChangedWhileDispatchPrevented);
        return;
    }

    public void stopDispatchingItemsChanged() {
        if (this.mPreventDispatchingItemsChanged == true) goto L6;
        this.mPreventDispatchingItemsChanged = true;
        this.mItemsChangedWhileDispatchPrevented = false;
        this.mStructureChangedWhileDispatchPrevented = false;
        return;
    }

    @Override // android.view.Menu
    public MenuItem add(int r2) {
        return addInternal(0, 0, 0, this.mResources.getString(r2));
    }

    public void addMenuPresenter(m r3, Context r4) {
        this.mPresenters.add(new WeakReference(r3));
        r3.initForMenu(r4, this);
        this.mIsActionItemsStale = true;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int r2) {
        return addSubMenu(0, 0, 0, this.mResources.getString(r2));
    }

    public int findGroupIndex(int r3, int r4) {
        int r02 = size();
        if (r4 >= 0) goto L5;
        r4 = 0;
    L5:
        if (r4 >= r02) goto L10;
        if (this.mItems.get(r4).getGroupId() == r3) goto L8;
        r4 = r4 + 1;
        goto L5
    L8:
        return r4;
    L10:
        return -1;
    }

    public boolean performItemAction(MenuItem r7, m r8, int r9) {
        i r72 = (i) r7;
        if (r72 != null) goto L5;
    L40:
        return false;
    L5:
        if (r72.isEnabled() == false) goto L40;
        boolean r1 = r72.k();
        AbstractC3862b r2 = r72.a();
        if (r2 != null) goto L10;
    L12:
        boolean r4 = false;
    L14:
        if (r72.j() == false) goto L20;
        boolean r73 = r72.expandActionView() | r1;
        if (r73 == false) goto L18;
        close(true);
    L18:
        return r73;
    L20:
        if (r72.hasSubMenu() == true) goto L28;
        if (r4 == true) goto L28;
        if ((r9 & 1) != 0) goto L26;
        close(true);
    L26:
        return r1;
    L28:
        if ((r9 & 4) != 0) goto L31;
        close(false);
    L31:
        if (r72.hasSubMenu() == true) goto L33;
        r72.x(new r(getContext(), this, r72));
    L33:
        r r74 = (r) r72.getSubMenu();
        if (r4 == false) goto L36;
        r2.f(r74);
    L36:
        boolean r75 = e(r74, r8) | r1;
        if (r75 == true) goto L39;
        close(true);
    L39:
        return r75;
    L10:
        if (r2.a() == false) goto L12;
        r4 = true;
        goto L14
    }

    public g setHeaderIconInt(int r7) {
        i(0, null, r7, null, null);
        return this;
    }

    public g setHeaderTitleInt(int r7) {
        i(r7, null, 0, null, null);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem add(int r1, int r2, int r3, CharSequence r4) {
        return addInternal(r1, r2, r3, r4);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int r1, int r2, int r3, CharSequence r4) {
        i r12 = (i) addInternal(r1, r2, r3, r4);
        r r22 = new r(this.mContext, this, r12);
        r12.x(r22);
        return r22;
    }

    @Override // android.view.Menu
    public MenuItem add(int r2, int r3, int r4, int r5) {
        return addInternal(r2, r3, r4, this.mResources.getString(r5));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int r2, int r3, int r4, int r5) {
        return addSubMenu(r2, r3, r4, this.mResources.getString(r5));
    }

    @Override // android.view.Menu
    public void close() {
        close(true);
    }
}

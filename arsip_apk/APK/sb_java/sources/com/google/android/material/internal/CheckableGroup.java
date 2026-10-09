package com.google.android.material.internal;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.internal.MaterialCheckable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public class CheckableGroup<T extends MaterialCheckable<T>> {
    private final Map<Integer, T> checkables;
    private final Set<Integer> checkedIds;
    private OnCheckedStateChangeListener onCheckedStateChangeListener;
    private boolean selectionRequired;
    private boolean singleSelection;

    public interface OnCheckedStateChangeListener {
        void onCheckedStateChanged(Set<Integer> r1);
    }

    public CheckableGroup() {
        this.checkables = new HashMap();
        this.checkedIds = new HashSet();
    }

    public static /* synthetic */ boolean access$000(CheckableGroup r02, MaterialCheckable r1) {
        return r02.checkInternal(r1);
    }

    public static /* synthetic */ boolean access$100(CheckableGroup r02) {
        return r02.selectionRequired;
    }

    public static /* synthetic */ boolean access$200(CheckableGroup r02, MaterialCheckable r1, boolean r2) {
        return r02.uncheckInternal(r1, r2);
    }

    public static /* synthetic */ void access$300(CheckableGroup r02) {
        r02.onCheckedStateChanged();
    }

    private boolean checkInternal(MaterialCheckable<T> r5) {
        int r02 = r5.getId();
        if (this.checkedIds.contains(Integer.valueOf(r02)) == false) goto L5;
        return false;
    L5:
        T r1 = this.checkables.get(Integer.valueOf(getSingleCheckedId()));
        if (r1 == null) goto L8;
        uncheckInternal(r1, false);
    L8:
        boolean r03 = this.checkedIds.add(Integer.valueOf(r02));
        if (r5.isChecked() == true) goto L11;
        r5.setChecked(true);
    L11:
        return r03;
    }

    private void onCheckedStateChanged() {
        OnCheckedStateChangeListener r02 = this.onCheckedStateChangeListener;
        if (r02 == null) goto L6;
        r02.onCheckedStateChanged(getCheckedIds());
        return;
    }

    private boolean uncheckInternal(MaterialCheckable<T> r5, boolean r6) {
        int r02 = r5.getId();
        if (this.checkedIds.contains(Integer.valueOf(r02)) == true) goto L5;
        return false;
    L5:
        if (r6 == true) goto L7;
    L12:
        boolean r62 = this.checkedIds.remove(Integer.valueOf(r02));
        if (r5.isChecked() == false) goto L15;
        r5.setChecked(false);
    L15:
        return r62;
    L7:
        if (this.checkedIds.size() != 1) goto L12;
        if (this.checkedIds.contains(Integer.valueOf(r02)) == false) goto L12;
        r5.setChecked(true);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addCheckable(T r3) {
        this.checkables.put(Integer.valueOf(r3.getId()), r3);
        if (r3.isChecked() == false) goto L5;
        checkInternal(r3);
    L5:
        r3.setInternalOnCheckedChangeListener(new AnonymousClass1(this));
    }

    public void check(int r2) {
        T r22 = this.checkables.get(Integer.valueOf(r2));
        if (r22 != null) goto L6;
        return;
    L6:
        if (checkInternal(r22) == false) goto L9;
        onCheckedStateChanged();
        return;
    }

    public void clearCheck() {
        boolean r02 = this.checkedIds.isEmpty();
        Iterator<T> r1 = this.checkables.values().iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        uncheckInternal(r1.next(), false);
        goto L4
    L6:
        if (r02 == true) goto L10;
        onCheckedStateChanged();
        return;
    }

    public Set<Integer> getCheckedIds() {
        return new HashSet(this.checkedIds);
    }

    public List<Integer> getCheckedIdsSortedByChildOrder(ViewGroup r6) {
        Set<Integer> r02 = getCheckedIds();
        ArrayList r1 = new ArrayList();
        int r2 = 0;
    L4:
        if (r2 >= r6.getChildCount()) goto L11;
        View r3 = r6.getChildAt(r2);
        if ((r3 instanceof MaterialCheckable) == false) goto L10;
        if (r02.contains(Integer.valueOf(r3.getId())) == false) goto L10;
        r1.add(Integer.valueOf(r3.getId()));
    L10:
        r2 = r2 + 1;
        goto L4
    L11:
        return r1;
    }

    public int getSingleCheckedId() {
        if (this.singleSelection == true) goto L5;
        return -1;
    L5:
        if (this.checkedIds.isEmpty() == false) goto L7;
        return -1;
    L7:
        return this.checkedIds.iterator().next().intValue();
    }

    public boolean isSelectionRequired() {
        return this.selectionRequired;
    }

    public boolean isSingleSelection() {
        return this.singleSelection;
    }

    public void removeCheckable(T r3) {
        r3.setInternalOnCheckedChangeListener(null);
        this.checkables.remove(Integer.valueOf(r3.getId()));
        this.checkedIds.remove(Integer.valueOf(r3.getId()));
    }

    public void setOnCheckedStateChangeListener(OnCheckedStateChangeListener r1) {
        this.onCheckedStateChangeListener = r1;
    }

    public void setSelectionRequired(boolean r1) {
        this.selectionRequired = r1;
    }

    public void setSingleSelection(boolean r2) {
        if (this.singleSelection == r2) goto L6;
        this.singleSelection = r2;
        clearCheck();
        return;
    }

    public void uncheck(int r2) {
        T r22 = this.checkables.get(Integer.valueOf(r2));
        if (r22 != null) goto L6;
        return;
    L6:
        if (uncheckInternal(r22, this.selectionRequired) == false) goto L9;
        onCheckedStateChanged();
        return;
    }
}

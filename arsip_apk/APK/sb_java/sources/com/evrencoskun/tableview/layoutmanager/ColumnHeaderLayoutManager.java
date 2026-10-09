package com.evrencoskun.tableview.layoutmanager;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.evrencoskun.tableview.ITableView;

/* loaded from: classes4.dex */
public class ColumnHeaderLayoutManager extends LinearLayoutManager {

    /* renamed from: a, reason: collision with root package name */
    public final SparseIntArray f35423a;

    /* renamed from: b, reason: collision with root package name */
    public final ITableView f35424b;

    public ColumnHeaderLayoutManager(Context r1, ITableView r2) {
        super(r1);
        this.f35423a = new SparseIntArray();
        this.f35424b = r2;
        setOrientation(0);
    }

    public int A() {
        return findViewByPosition(findFirstVisibleItemPosition()).getLeft();
    }

    public void B(int r2, int r3) {
        this.f35423a.put(r2, r3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void measureChild(View r3, int r4, int r5) {
        if (this.f35424b.a() == false) goto L6;
        super.measureChild(r3, r4, r5);
        return;
    L6:
        int r02 = z(getPosition(r3));
        if (r02 == (-1)) goto L10;
        com.evrencoskun.tableview.util.a.a(r3, r02);
        return;
    L10:
        super.measureChild(r3, r4, r5);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void measureChildWithMargins(View r2, int r3, int r4) {
        super.measureChildWithMargins(r2, r3, r4);
        if (this.f35424b.a() == false) goto L5;
        return;
    L5:
        measureChild(r2, r3, r4);
    }

    public void x() {
        this.f35423a.clear();
    }

    public void y() {
        int r02 = A();
        int r1 = findFirstVisibleItemPosition();
    L4:
        if (r1 >= (findLastVisibleItemPosition() + 1)) goto L6;
        int r2 = z(r1) + r02;
        View r4 = findViewByPosition(r1);
        r4.setLeft(r02);
        r4.setRight(r2);
        layoutDecoratedWithMargins(r4, r4.getLeft(), r4.getTop(), r4.getRight(), r4.getBottom());
        r02 = r2 + 1;
        r1 = r1 + 1;
        goto L4
    }

    public int z(int r3) {
        return this.f35423a.get(r3, -1);
    }
}

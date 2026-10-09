package com.evrencoskun.tableview.adapter.recyclerview.holder;

import android.view.View;
import com.evrencoskun.tableview.sort.SortState;

/* loaded from: classes4.dex */
public abstract class a extends AbstractViewHolder {

    /* renamed from: b, reason: collision with root package name */
    public SortState f35363b;

    public a(View r1) {
        super(r1);
        this.f35363b = SortState.UNSORTED;
    }

    public void A(SortState r1) {
        this.f35363b = r1;
    }
}

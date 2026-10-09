package com.evrencoskun.tableview.adapter.recyclerview.holder;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public abstract class AbstractViewHolder extends RecyclerView.D {

    /* renamed from: a, reason: collision with root package name */
    public SelectionState f35361a;

    public enum SelectionState extends Enum<SelectionState> {
        public static final SelectionState SELECTED = null;
        public static final SelectionState SHADOWED = null;
        public static final SelectionState UNSELECTED = null;

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ SelectionState[] f35362a = null;

        static {
            SelectionState r02 = new SelectionState("SELECTED", 0);
            SELECTED = r02;
            SelectionState r1 = new SelectionState("UNSELECTED", 1);
            UNSELECTED = r1;
            SelectionState r2 = new SelectionState("SHADOWED", 2);
            SHADOWED = r2;
            f35362a = new SelectionState[]{r02, r1, r2};
        }

        SelectionState(String r1, int r2) {
        }

        public static SelectionState valueOf(String r1) {
            return (SelectionState) Enum.valueOf(SelectionState.class, r1);
        }

        public static SelectionState[] values() {
            return (SelectionState[]) f35362a.clone();
        }
    }

    public AbstractViewHolder(View r1) {
        super(r1);
        this.f35361a = SelectionState.UNSELECTED;
    }

    public boolean w() {
        return false;
    }

    public void x() {
    }

    public void y(int r2) {
        this.itemView.setBackgroundColor(r2);
    }

    public void z(SelectionState r2) {
        this.f35361a = r2;
        if (r2 != SelectionState.SELECTED) goto L7;
        this.itemView.setSelected(true);
        return;
    L7:
        if (r2 != SelectionState.UNSELECTED) goto L10;
        this.itemView.setSelected(false);
        return;
    }
}

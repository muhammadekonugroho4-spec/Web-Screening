package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Parcelable;

/* loaded from: classes.dex */
public interface m {

    public interface a {
        boolean a(g r1);

        void onCloseMenu(g r1, boolean r2);
    }

    boolean collapseItemActionView(g r1, i r2);

    boolean expandItemActionView(g r1, i r2);

    boolean flagActionItems();

    int getId();

    void initForMenu(Context r1, g r2);

    void onCloseMenu(g r1, boolean r2);

    void onRestoreInstanceState(Parcelable r1);

    Parcelable onSaveInstanceState();

    boolean onSubMenuSelected(r r1);

    void setCallback(a r1);

    void updateMenuView(boolean r1);
}

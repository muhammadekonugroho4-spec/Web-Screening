package androidx.compose.foundation.text.contextmenu.internal;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/* loaded from: classes.dex */
public interface Q {
    androidx.compose.ui.geometry.g a(ActionMode r1, View r2);

    boolean onActionItemClicked(ActionMode r1, MenuItem r2);

    boolean onCreateActionMode(ActionMode r1, Menu r2);

    void onDestroyActionMode(ActionMode r1);

    boolean onPrepareActionMode(ActionMode r1, Menu r2);
}

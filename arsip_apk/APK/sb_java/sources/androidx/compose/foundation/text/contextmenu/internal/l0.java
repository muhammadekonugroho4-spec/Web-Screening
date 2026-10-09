package androidx.compose.foundation.text.contextmenu.internal;

import android.R;
import android.app.RemoteAction;
import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import android.view.textclassifier.TextClassification;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final l0 f9832a = null;

    static {
        f9832a = new l0();
    }

    public l0() {
    }

    public static /* synthetic */ boolean a(RemoteAction r02, MenuItem r1) {
        return g(r02, r1);
    }

    public static /* synthetic */ boolean b(Context r02, TextClassification r1, MenuItem r2) {
        return d(r02, r1, r2);
    }

    public static final boolean d(Context r02, TextClassification r1, MenuItem r2) {
        V.f9789a.a(r02, r1);
        return true;
    }

    public static final boolean g(RemoteAction r02, MenuItem r1) {
        V.f9789a.b(r02.getActionIntent());
        return true;
    }

    public final void c(Menu r3, int r4, final Context r5, final TextClassification r6) {
        MenuItem r32 = r3.add(R.id.textAssist, R.id.textAssist, r4, r6.getLabel());
        r32.setShowAsAction(2);
        r32.setIcon(r6.getIcon());
        r32.setOnMenuItemClickListener(new j0(r5, r6));
    }

    public final void e(Menu r8, int r9, Context r10, TextClassification r11, int r12) {
        if (r12 >= 0) goto L5;
        c(r8, r9, r10, r11);
        return;
    L5:
        if (r12 != 0) goto L8;
        boolean r02 = true;
    L7:
        boolean r5 = r02;
        f(r8, r9, r10, r5, (RemoteAction) W.a(r11).get(r12));
        return;
    L8:
        r02 = false;
        goto L7
    }

    public final void f(Menu r5, int r6, Context r7, boolean r8, final RemoteAction r9) {
        int r02 = 0;
        if (r8 == false) goto L5;
        int r2 = 16908353;
    L6:
        MenuItem r52 = r5.add(R.id.textAssist, r2, r6, r9.getTitle());
        if (r8 == false) goto L9;
        r02 = 2;
    L9:
        r52.setShowAsAction(r02);
        if (r8 == false) goto L12;
    L13:
        r52.setIcon(r9.getIcon().loadDrawable(r7));
    L14:
        r52.setOnMenuItemClickListener(new k0(r9));
        return;
    L12:
        if (X.a(r9) == false) goto L14;
    L5:
        r2 = 0;
        goto L6
    }
}

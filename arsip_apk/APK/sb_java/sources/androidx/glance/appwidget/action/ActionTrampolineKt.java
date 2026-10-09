package androidx.glance.appwidget.action;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.StrictMode;
import androidx.compose.ui.unit.l;
import androidx.glance.appwidget.Q;

/* loaded from: classes4.dex */
public abstract class ActionTrampolineKt {
    public static final void a(kotlin.jvm.functions.a r3) {
        StrictMode.VmPolicy r02 = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT < 31) goto L5;
        StrictMode.VmPolicy r1 = h.f24905a.a(new StrictMode.VmPolicy.Builder(r02)).build();
    L6:
        StrictMode.setVmPolicy(r1);
        r3.invoke();
        StrictMode.setVmPolicy(r02);
        return;
    L5:
        r1 = new StrictMode.VmPolicy.Builder().build();
        goto L6
    }

    public static final Intent b(Intent r9, Q r10, int r11, ActionTrampolineType r12, Bundle r13) {
        if (r12 != ActionTrampolineType.ACTIVITY) goto L5;
        Class r02 = ActionTrampolineActivity.class;
    L6:
        Intent r1 = new Intent(r10.l(), r02);
        r1.setData(e(r10, r11, r12, null, 8, null));
        r1.putExtra("ACTION_TYPE", r12.name());
        r1.putExtra("ACTION_INTENT", r9);
        if (r13 == null) goto L9;
        r1.putExtra("ACTIVITY_OPTIONS", r13);
    L9:
        return r1;
    L5:
        r02 = InvisibleActionTrampolineActivity.class;
        goto L6
    }

    public static /* synthetic */ Intent c(Intent r02, Q r1, int r2, ActionTrampolineType r3, Bundle r4, int r5, Object r6) {
        if ((r5 & 8) == 0) goto L6;
        r4 = null;
    L6:
        return b(r02, r1, r2, r3, r4);
    }

    public static final Uri d(Q r2, int r3, ActionTrampolineType r4, String r5) {
        Uri.Builder r02 = new Uri.Builder();
        r02.scheme("glance-action");
        r02.path(r4.name());
        r02.appendQueryParameter("appWidgetId", String.valueOf(r2.k()));
        r02.appendQueryParameter("viewId", String.valueOf(r3));
        r02.appendQueryParameter("viewSize", l.j(r2.q()));
        r02.appendQueryParameter("extraData", r5);
        if (r2.t() == false) goto L6;
        r02.appendQueryParameter("lazyCollection", String.valueOf(r2.o()));
        r02.appendQueryParameter("lazeViewItem", String.valueOf(r2.n()));
    L6:
        return r02.build();
    }

    public static /* synthetic */ Uri e(Q r02, int r1, ActionTrampolineType r2, String r3, int r4, Object r5) {
        if ((r4 & 8) == 0) goto L6;
        r3 = "";
    L6:
        return d(r02, r1, r2, r3);
    }

    public static final void f(final Activity r3, Intent r4) {
        Parcelable r02 = r4.getParcelableExtra("ACTION_INTENT");
        if (r02 == null) goto L14;
        final Intent r03 = (Intent) r02;
        if (r4.hasExtra("android.widget.extra.CHECKED") == false) goto L7;
        r03.putExtra("android.widget.extra.CHECKED", r4.getBooleanExtra("android.widget.extra.CHECKED", false));
    L7:
        final String r1 = r4.getStringExtra("ACTION_TYPE");
        if (r1 == null) goto L12;
        final Bundle r42 = r4.getBundleExtra("ACTIVITY_OPTIONS");
        a(new ActionTrampolineKt$launchTrampolineAction$1(r1, r3, r03, r42));
        r3.finish();
        return;
    L12:
        throw new IllegalArgumentException("List adapter activity trampoline invoked without trampoline type");
    L14:
        throw new IllegalArgumentException("List adapter activity trampoline invoked without specifying target intent.");
    }
}

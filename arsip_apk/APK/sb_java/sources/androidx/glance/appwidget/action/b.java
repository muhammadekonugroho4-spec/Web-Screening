package androidx.glance.appwidget.action;

import android.content.ComponentName;
import android.content.Intent;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f24897a = null;

    static {
        f24897a = new b();
    }

    public b() {
    }

    public final Intent a(ComponentName r2, String r3, int r4) {
        return new Intent().setComponent(r2).setAction("ACTION_TRIGGER_LAMBDA").putExtra("EXTRA_ACTION_KEY", r3).putExtra("EXTRA_APPWIDGET_ID", r4);
    }
}

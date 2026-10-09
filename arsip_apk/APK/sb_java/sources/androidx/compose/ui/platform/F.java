package androidx.compose.ui.platform;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes.dex */
public final class F implements P0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f19155a;

    static {
    }

    public F(Context r1) {
        this.f19155a = r1;
    }

    @Override // androidx.compose.ui.platform.P0
    public void a(String r5) {
        this.f19155a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(r5)));     // Catch: ActivityNotFoundException -> L4
        return;
    L4:
        e = move-exception;
        throw new IllegalArgumentException("Can't open " + r5 + '.', e);
    }
}

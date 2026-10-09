package androidx.glance.appwidget;

import android.widget.RemoteViews;

/* renamed from: androidx.glance.appwidget.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3967f {

    /* renamed from: a, reason: collision with root package name */
    public static final C3967f f24913a = null;

    static {
        f24913a = new C3967f();
    }

    public C3967f() {
    }

    public final void a(RemoteViews r1, int r2, C r3) {
        r1.setRemoteAdapter(r2, b(r3));
    }

    public final RemoteViews.RemoteCollectionItems b(C r7) {
        RemoteViews.RemoteCollectionItems.Builder r02 = new RemoteViews.RemoteCollectionItems.Builder().setHasStableIds(r7.f()).setViewTypeCount(r7.e());
        int r1 = r7.b();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L6;
        r02.addItem(r7.c(r2), r7.d(r2));
        r2 = r2 + 1;
        goto L3
    L6:
        return r02.build();
    }
}

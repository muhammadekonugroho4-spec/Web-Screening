package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class J extends ContextWrapper {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f3389c = null;
    public static ArrayList d;

    /* renamed from: a, reason: collision with root package name */
    public final Resources f3390a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f3391b;

    static {
        f3389c = new Object();
    }

    public J(Context r3) {
        super(r3);
        if (T.c() == false) goto L6;
        T r02 = new T(this, r3.getResources());
        this.f3390a = r02;
        Resources.Theme r03 = r02.newTheme();
        this.f3391b = r03;
        r03.setTo(r3.getTheme());
        return;
    L6:
        this.f3390a = new L(this, r3.getResources());
        this.f3391b = null;
    }

    public static boolean a(Context r2) {
        if ((r2 instanceof J) == false) goto L5;
    L13:
        return false;
    L5:
        if ((r2.getResources() instanceof L) == true) goto L13;
        if ((r2.getResources() instanceof T) == true) goto L13;
        if (T.c() == false) goto L13;
        return true;
    }

    public static Context b(Context r4) {
        if (a(r4) == false) goto L36;
        Object r02 = f3389c;
        monitor-enter(r02);
        ArrayList r1 = d;     // Catch: Throwable -> L9
        if (r1 != null) goto L11;
        d = new ArrayList();     // Catch: Throwable -> L9
    L31:
        J r12 = new J(r4);     // Catch: Throwable -> L9
        d.add(new WeakReference(r12));     // Catch: Throwable -> L9
        monitor-exit(r02);     // Catch: Throwable -> L9
        return r12;
    L11:
        int r13 = r1.size() - 1;
    L12:
        if (r13 < 0) goto L19;
        WeakReference r2 = (WeakReference) d.get(r13);     // Catch: Throwable -> L9
        if (r2 != null) goto L16;
    L17:
        d.remove(r13);     // Catch: Throwable -> L9
    L18:
        r13 = r13 - 1;
        goto L12
    L16:
        if (r2.get() != null) goto L18;
    L19:
        int r14 = d.size() - 1;
    L20:
        if (r14 < 0) goto L31;
        WeakReference r22 = (WeakReference) d.get(r14);     // Catch: Throwable -> L9
        if (r22 == null) goto L24;
        J r23 = (J) r22.get();     // Catch: Throwable -> L9
    L25:
        if (r23 == null) goto L30;
        if (r23.getBaseContext() != r4) goto L30;
        monitor-exit(r02);     // Catch: Throwable -> L9
        return r23;
    L30:
        r14 = r14 - 1;
        goto L20
    L24:
        r23 = null;
    L9:
        th = move-exception;
        throw th;
    L36:
        return r4;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f3390a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f3390a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme r02 = this.f3391b;
        if (r02 == null) goto L5;
        return r02;
    L5:
        return super.getTheme();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int r3) {
        Resources.Theme r02 = this.f3391b;
        if (r02 != null) goto L6;
        super.setTheme(r3);
        return;
    L6:
        r02.applyStyle(r3, true);
    }
}

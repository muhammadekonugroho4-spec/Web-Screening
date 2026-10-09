package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* loaded from: classes.dex */
public class d extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    public static Configuration f2872f;

    /* renamed from: a, reason: collision with root package name */
    public int f2873a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f2874b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f2875c;
    public Configuration d;

    /* renamed from: e, reason: collision with root package name */
    public Resources f2876e;

    public d(Context r1, int r2) {
        super(r1);
        this.f2873a = r2;
    }

    public static boolean e(Configuration r2) {
        if (r2 != null) goto L6;
        return true;
    L6:
        if (f2872f != null) goto L9;
        Configuration r02 = new Configuration();
        r02.fontScale = 0.0f;
        f2872f = r02;
    L9:
        return r2.equals(f2872f);
    }

    public void a(Configuration r2) {
        if (this.f2876e != null) goto L11;
        if (this.d != null) goto L9;
        this.d = new Configuration(r2);
        return;
    L9:
        throw new IllegalStateException("Override configuration has already been set");
    L11:
        throw new IllegalStateException("getResources() or getAssets() has already been called");
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context r1) {
        super.attachBaseContext(r1);
    }

    public final Resources b() {
        if (this.f2876e != null) goto L12;
        Configuration r02 = this.d;
        if (r02 != null) goto L7;
    L10:
        this.f2876e = super.getResources();
        goto L12
    L7:
        if (e(r02) == true) goto L10;
        this.f2876e = createConfigurationContext(this.d).getResources();
    L12:
        return this.f2876e;
    }

    public int c() {
        return this.f2873a;
    }

    public final void d() {
        if (this.f2874b != null) goto L5;
        boolean r02 = true;
    L6:
        if (r02 == false) goto L10;
        this.f2874b = getResources().newTheme();
        Resources.Theme r1 = getBaseContext().getTheme();
        if (r1 == null) goto L10;
        this.f2874b.setTo(r1);
    L10:
        f(this.f2874b, this.f2873a, r02);
        return;
    L5:
        r02 = false;
        goto L6
    }

    public void f(Resources.Theme r1, int r2, boolean r3) {
        r1.applyStyle(r2, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String r2) {
        if ("layout_inflater".equals(r2) == false) goto L10;
        if (this.f2875c != null) goto L8;
        this.f2875c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
    L8:
        return this.f2875c;
    L10:
        return getBaseContext().getSystemService(r2);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme r02 = this.f2874b;
        if (r02 == null) goto L6;
        return r02;
    L6:
        if (this.f2873a != 0) goto L8;
        this.f2873a = androidx.appcompat.i.f2774h;
    L8:
        d();
        return this.f2874b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int r2) {
        if (this.f2873a == r2) goto L6;
        this.f2873a = r2;
        d();
        return;
    }

    public d(Context r1, Resources.Theme r2) {
        super(r1);
        this.f2874b = r2;
    }
}

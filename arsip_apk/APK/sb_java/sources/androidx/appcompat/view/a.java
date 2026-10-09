package androidx.appcompat.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import androidx.appcompat.j;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public Context f2869a;

    public a(Context r1) {
        this.f2869a = r1;
    }

    public static a b(Context r1) {
        return new a(r1);
    }

    public boolean a() {
        if (this.f2869a.getApplicationInfo().targetSdkVersion >= 14) goto L6;
        return true;
    L6:
        return false;
    }

    public int c() {
        return this.f2869a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration r02 = this.f2869a.getResources().getConfiguration();
        int r1 = r02.screenWidthDp;
        int r2 = r02.screenHeightDp;
        if (r02.smallestScreenWidthDp > 600) goto L27;
        if (r1 <= 600) goto L6;
        return 5;
    L6:
        if (r1 <= 960) goto L8;
        if (r2 <= 720) goto L8;
        return 5;
    L8:
        if (r1 <= 720) goto L12;
        if (r2 <= 960) goto L12;
        return 5;
    L12:
        if (r1 < 500) goto L14;
        return 4;
    L14:
        if (r1 <= 640) goto L16;
        if (r2 <= 480) goto L16;
        return 4;
    L16:
        if (r1 <= 480) goto L20;
        if (r2 <= 640) goto L20;
        return 4;
    L20:
        if (r1 < 360) goto L23;
        return 3;
    L23:
        return 2;
    L27:
        return 5;
    }

    public int e() {
        return this.f2869a.getResources().getDimensionPixelSize(androidx.appcompat.d.f2620b);
    }

    public int f() {
        TypedArray r02 = this.f2869a.obtainStyledAttributes(null, j.f2816a, androidx.appcompat.a.f2305c, 0);
        int r1 = r02.getLayoutDimension(j.f2833j, 0);
        Resources r2 = this.f2869a.getResources();
        if (g() == true) goto L5;
        r1 = Math.min(r1, r2.getDimensionPixelSize(androidx.appcompat.d.f2619a));
    L5:
        r02.recycle();
        return r1;
    }

    public boolean g() {
        return this.f2869a.getResources().getBoolean(androidx.appcompat.b.f2611a);
    }

    public boolean h() {
        return true;
    }
}

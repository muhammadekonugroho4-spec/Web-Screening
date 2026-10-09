package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.browser.customtabs.a;
import com.google.common.net.HttpHeaders;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f3882a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f3883b;

    public static class a {
        public static String a() {
            LocaleList r02 = LocaleList.getAdjustedDefault();
            if (r02.size() > 0) goto L5;
            return null;
        L5:
            return r02.get(0).toLanguageTag();
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Intent f3884a;

        /* renamed from: b, reason: collision with root package name */
        public final a.C0036a f3885b;

        /* renamed from: c, reason: collision with root package name */
        public ArrayList f3886c;
        public Bundle d;

        /* renamed from: e, reason: collision with root package name */
        public ArrayList f3887e;

        /* renamed from: f, reason: collision with root package name */
        public SparseArray f3888f;

        /* renamed from: g, reason: collision with root package name */
        public Bundle f3889g;

        /* renamed from: h, reason: collision with root package name */
        public int f3890h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f3891i;

        public b() {
            this.f3884a = new Intent("android.intent.action.VIEW");
            this.f3885b = new a.C0036a();
            this.f3890h = 0;
            this.f3891i = true;
        }

        public b a() {
            f(1);
            return this;
        }

        public d b() {
            if (this.f3884a.hasExtra("android.support.customtabs.extra.SESSION") == true) goto L5;
            e(null, null);
        L5:
            ArrayList<? extends Parcelable> r02 = this.f3886c;
            if (r02 == null) goto L8;
            this.f3884a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", r02);
        L8:
            ArrayList<? extends Parcelable> r03 = this.f3887e;
            if (r03 == null) goto L11;
            this.f3884a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", r03);
        L11:
            this.f3884a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f3891i);
            this.f3884a.putExtras(this.f3885b.a().a());
            Bundle r04 = this.f3889g;
            if (r04 == null) goto L15;
            this.f3884a.putExtras(r04);
        L15:
            if (this.f3888f == null) goto L17;
            Bundle r05 = new Bundle();
            r05.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f3888f);
            this.f3884a.putExtras(r05);
        L17:
            this.f3884a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f3890h);
            c();
            return new d(this.f3884a, this.d);
        }

        public final void c() {
            String r02 = a.a();
            if (TextUtils.isEmpty(r02) == false) goto L5;
            return;
        L5:
            if (this.f3884a.hasExtra("com.android.browser.headers") == false) goto L7;
            Bundle r1 = this.f3884a.getBundleExtra("com.android.browser.headers");
        L9:
            if (r1.containsKey(HttpHeaders.ACCEPT_LANGUAGE) == true) goto L13;
            r1.putString(HttpHeaders.ACCEPT_LANGUAGE, r02);
            this.f3884a.putExtra("com.android.browser.headers", r1);
            return;
        L13:
            return;
        L7:
            r1 = new Bundle();
            goto L9
        }

        public b d(g r3) {
            this.f3884a.setPackage(r3.d().getPackageName());
            e(r3.c(), r3.e());
            return this;
        }

        public final void e(IBinder r3, PendingIntent r4) {
            Bundle r02 = new Bundle();
            androidx.core.app.g.b(r02, "android.support.customtabs.extra.SESSION", r3);
            if (r4 == null) goto L5;
            r02.putParcelable("android.support.customtabs.extra.SESSION_ID", r4);
        L5:
            this.f3884a.putExtras(r02);
        }

        public b f(int r4) {
            if (r4 < 0) goto L15;
            if (r4 > 2) goto L15;
            this.f3890h = r4;
            if (r4 != 1) goto L9;
            this.f3884a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
            return this;
        L9:
            if (r4 != 2) goto L12;
            this.f3884a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
            return this;
        L12:
            this.f3884a.removeExtra("android.support.customtabs.extra.SHARE_MENU_ITEM");
            return this;
        L15:
            throw new IllegalArgumentException("Invalid value for the shareState argument");
        }

        public b g(boolean r3) {
            this.f3884a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", r3 ? 1 : 0);
            return this;
        }

        public b h(int r2) {
            this.f3885b.b(r2);
            return this;
        }

        public b(g r3) {
            this.f3884a = new Intent("android.intent.action.VIEW");
            this.f3885b = new a.C0036a();
            this.f3890h = 0;
            this.f3891i = true;
            if (r3 == null) goto L6;
            d(r3);
            return;
        }
    }

    public d(Intent r1, Bundle r2) {
        this.f3882a = r1;
        this.f3883b = r2;
    }

    public void a(Context r2, Uri r3) {
        this.f3882a.setData(r3);
        androidx.core.content.b.startActivity(r2, this.f3882a, this.f3883b);
    }
}

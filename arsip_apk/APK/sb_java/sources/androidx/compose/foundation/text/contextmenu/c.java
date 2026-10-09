package androidx.compose.foundation.text.contextmenu;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import androidx.compose.ui.text.E1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.s;
import kotlin.w;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f9713a = null;

    /* renamed from: b, reason: collision with root package name */
    public static l f9714b;

    /* renamed from: c, reason: collision with root package name */
    public static s f9715c;
    public static final int d = 0;

    static {
        f9713a = new c();
        f9714b = new a();
        f9715c = new b();
        d = 8;
    }

    public c() {
    }

    public static /* synthetic */ List a(Context r02) {
        return i(r02);
    }

    public static /* synthetic */ w b(Context r02, ResolveInfo r1, boolean r2, CharSequence r3, E1 r4) {
        return h(r02, r1, r2, r3, r4);
    }

    public static final w h(Context r3, ResolveInfo r4, boolean r5, CharSequence r6, E1 r7) {
        String r62 = r6.subSequence(E1.l(r7.r()), E1.k(r7.r())).toString();
        Intent r42 = f9713a.d(r4, r5);
        r42.putExtra("android.intent.extra.PROCESS_TEXT", r62);
        r3.startActivity(r42);
        return w.f180450a;
    }

    public static final List i(Context r7) {
        int r2 = 0;
        List<ResolveInfo> r02 = r7.getPackageManager().queryIntentActivities(f9713a.c(), 0);
        ArrayList r1 = new ArrayList(r02.size());
        int r3 = r02.size();
    L3:
        if (r2 >= r3) goto L8;
        ResolveInfo r4 = r02.get(r2);
        c r6 = f9713a;
        if (r6.g(r4, r7) == false) goto L7;
        r1.add(r4);
    L7:
        r2 = r2 + 1;
        goto L3
    L8:
        return r1;
    }

    public final Intent c() {
        return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
    }

    public final Intent d(ResolveInfo r3, boolean r4) {
        Intent r42 = c().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", r4);
        ActivityInfo r32 = r3.activityInfo;
        return r42.setClassName(r32.packageName, r32.name);
    }

    public final s e() {
        return f9715c;
    }

    public final boolean f(ActivityInfo r2, Context r3) {
        if (r2.exported == false) goto L10;
        String r22 = r2.permission;
        if (r22 != null) goto L7;
        return true;
    L7:
        if (r3.checkSelfPermission(r22) != 0) goto L13;
        return true;
    L13:
        return false;
    L10:
        return false;
    }

    public final boolean g(ResolveInfo r3, Context r4) {
        if (r4.getPackageName().equals(r3.activityInfo.packageName) == false) goto L5;
        return true;
    L5:
        if (f(r3.activityInfo, r4) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final List j(Context r2) {
        return (List) f9714b.invoke(r2);
    }
}

package androidx.appcompat.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import com.clevertap.android.sdk.Constants;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* renamed from: androidx.appcompat.widget.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2086c extends DataSetObservable {

    /* renamed from: m, reason: collision with root package name */
    public static final String f3593m = "c";

    /* renamed from: n, reason: collision with root package name */
    public static final Object f3594n = null;

    /* renamed from: o, reason: collision with root package name */
    public static final Map f3595o = null;

    /* renamed from: a, reason: collision with root package name */
    public final Object f3596a;

    /* renamed from: b, reason: collision with root package name */
    public final List f3597b;

    /* renamed from: c, reason: collision with root package name */
    public final List f3598c;
    public final Context d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3599e;

    /* renamed from: f, reason: collision with root package name */
    public Intent f3600f;

    /* renamed from: g, reason: collision with root package name */
    public b f3601g;

    /* renamed from: h, reason: collision with root package name */
    public int f3602h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3603i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3604j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3605k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3606l;

    /* renamed from: androidx.appcompat.widget.c$a */
    public static final class a implements Comparable {

        /* renamed from: a, reason: collision with root package name */
        public final ResolveInfo f3607a;

        /* renamed from: b, reason: collision with root package name */
        public float f3608b;

        public a(ResolveInfo r1) {
            this.f3607a = r1;
        }

        public int a(a r2) {
            return Float.floatToIntBits(r2.f3608b) - Float.floatToIntBits(this.f3608b);
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object r1) {
            return a((a) r1);
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if (r5 != null) goto L9;
            return false;
        L9:
            if (a.class == r5.getClass()) goto L12;
            return false;
        L12:
            if (Float.floatToIntBits(this.f3608b) == Float.floatToIntBits(((a) r5).f3608b)) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f3608b) + 31;
        }

        public String toString() {
            return Constants.AES_PREFIX + "resolveInfo:" + this.f3607a.toString() + "; weight:" + new BigDecimal(this.f3608b) + Constants.AES_SUFFIX;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$b */
    public interface b {
        void a(Intent r1, List r2, List r3);
    }

    /* renamed from: androidx.appcompat.widget.c$c, reason: collision with other inner class name */
    public static final class C0030c implements b {

        /* renamed from: a, reason: collision with root package name */
        public final Map f3609a;

        public C0030c() {
            this.f3609a = new HashMap();
        }

        @Override // androidx.appcompat.widget.C2086c.b
        public void a(Intent r7, List r8, List r9) {
            Map r72 = this.f3609a;
            r72.clear();
            int r02 = r8.size();
            int r1 = 0;
        L3:
            if (r1 >= r02) goto L5;
            a r2 = (a) r8.get(r1);
            r2.f3608b = 0.0f;
            ActivityInfo r4 = r2.f3607a.activityInfo;
            r72.put(new ComponentName(r4.packageName, r4.name), r2);
            r1 = r1 + 1;
            goto L3
        L5:
            int r03 = r9.size() - 1;
            float r12 = 1.0f;
        L6:
            if (r03 < 0) goto L11;
            d r22 = (d) r9.get(r03);
            a r3 = (a) r72.get(r22.f3610a);
            if (r3 == null) goto L10;
            r3.f3608b += r22.f3612c * r12;
            r12 = r12 * 0.95f;
        L10:
            r03 = r03 - 1;
            goto L6
        L11:
            Collections.sort(r8);
        }
    }

    /* renamed from: androidx.appcompat.widget.c$d */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final ComponentName f3610a;

        /* renamed from: b, reason: collision with root package name */
        public final long f3611b;

        /* renamed from: c, reason: collision with root package name */
        public final float f3612c;

        public d(String r1, long r2, float r4) {
            this(ComponentName.unflattenFromString(r1), r2, r4);
        }

        public boolean equals(Object r7) {
            if (this != r7) goto L6;
            return true;
        L6:
            if (r7 != null) goto L9;
            return false;
        L9:
            if (d.class == r7.getClass()) goto L11;
            return false;
        L11:
            d r72 = (d) r7;
            ComponentName r2 = this.f3610a;
            if (r2 != null) goto L17;
            if (r72.f3610a == null) goto L20;
            return false;
        L20:
            if (this.f3611b == r72.f3611b) goto L23;
            return false;
        L23:
            if (Float.floatToIntBits(this.f3612c) == Float.floatToIntBits(r72.f3612c)) goto L25;
            return false;
        L25:
            return true;
        L17:
            if (r2.equals(r72.f3610a) == true) goto L20;
            return false;
        }

        public int hashCode() {
            ComponentName r02 = this.f3610a;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            long r2 = this.f3611b;
            return ((((r03 + 31) * 31) + ((int) (r2 ^ (r2 >>> 32)))) * 31) + Float.floatToIntBits(this.f3612c);
        L5:
            r03 = r02.hashCode();
            goto L6
        }

        public String toString() {
            return Constants.AES_PREFIX + "; activity:" + this.f3610a + "; time:" + this.f3611b + "; weight:" + new BigDecimal(this.f3612c) + Constants.AES_SUFFIX;
        }

        public d(ComponentName r1, long r2, float r4) {
            this.f3610a = r1;
            this.f3611b = r2;
            this.f3612c = r4;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$e */
    public final class e extends AsyncTask {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C2086c f3613a;

        public e(C2086c r1) {
            this.f3613a = r1;
        }

        public Void a(Object... r15) {
            List r4 = (List) r15[0];
            String r152 = (String) r15[1];
            FileOutputStream r153 = this.f3613a.d.openFileOutput(r152, 0);     // Catch: FileNotFoundException -> L38
            XmlSerializer r7 = Xml.newSerializer();
            r7.setOutput(r153, null);     // Catch: Throwable -> L8 IOException -> L10 IllegalStateException -> L12 IllegalArgumentException -> L14
            r7.startDocument("UTF-8", Boolean.TRUE);     // Catch: Throwable -> L8 IOException -> L10 IllegalStateException -> L12 IllegalArgumentException -> L14
            r7.startTag(null, "historical-records");     // Catch: Throwable -> L8 IOException -> L10 IllegalStateException -> L12 IllegalArgumentException -> L14
            int r8 = r4.size();     // Catch: Throwable -> L8 IOException -> L10 IllegalStateException -> L12 IllegalArgumentException -> L14
            int r9 = 0;
        L6:
            if (r9 >= r8) goto L16;
            d r10 = (d) r4.remove(0);     // Catch: Throwable -> L8 IOException -> L10 IllegalStateException -> L12 IllegalArgumentException -> L14
            r7.startTag(null, "historical-record");     // Catch: Throwable -> L8 IOException -> L10 IllegalStateException -> L12 IllegalArgumentException -> L14
            r7.attribute(null, "activity", r10.f3610a.flattenToString());     // Catch: Throwable -> L8 IOException -> L10 IllegalStateException -> L12 IllegalArgumentException -> L14
            r7.attribute(null, CrashHianalyticsData.TIME, String.valueOf(r10.f3611b));     // Catch: Throwable -> L8 IOException -> L10 IllegalStateException -> L12 IllegalArgumentException -> L14
            r7.attribute(null, "weight", String.valueOf(r10.f3612c));     // Catch: Throwable -> L8 IOException -> L10 IllegalStateException -> L12 IllegalArgumentException -> L14
            r7.endTag(null, "historical-record");     // Catch: Throwable -> L8 IOException -> L10 IllegalStateException -> L12 IllegalArgumentException -> L14
            r9 = r9 + 1;     // Catch: Throwable -> L8 IOException -> L10 IllegalStateException -> L12 IllegalArgumentException -> L14
            goto L6
        L16:
            r7.endTag(null, "historical-records");     // Catch: Throwable -> L8 IOException -> L10 IllegalStateException -> L12 IllegalArgumentException -> L14
            r7.endDocument();     // Catch: Throwable -> L8 IOException -> L10 IllegalStateException -> L12 IllegalArgumentException -> L14
            this.f3613a.f3603i = true;
            if (r153 != null) goto L44;
        L33:
            return null;
        L44:
            r153.close();     // Catch: IOException -> L41
            goto L33
        L8:
            th = move-exception;
            this.f3613a.f3603i = true;
            if (r153 != null) goto L49;
        L37:
            throw th;
        L49:
            r153.close();     // Catch: IOException -> L42
        L10:
            e = move-exception;
            Log.e(C2086c.f3593m, "Error writing historical record file: " + this.f3613a.f3599e, e);     // Catch: Throwable -> L8
            this.f3613a.f3603i = true;
            if (r153 == null) goto L33;
        L12:
            e = move-exception;
            Log.e(C2086c.f3593m, "Error writing historical record file: " + this.f3613a.f3599e, e);     // Catch: Throwable -> L8
            this.f3613a.f3603i = true;
            if (r153 == null) goto L33;
        L14:
            e = move-exception;
            Log.e(C2086c.f3593m, "Error writing historical record file: " + this.f3613a.f3599e, e);     // Catch: Throwable -> L8
            this.f3613a.f3603i = true;
            if (r153 == null) goto L33;
        L38:
            e = move-exception;
            Log.e(C2086c.f3593m, "Error writing historical record file: " + r152, e);
            return null;
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Object doInBackground(Object[] r1) {
            return a(r1);
        }
    }

    static {
        f3594n = new Object();
        f3595o = new HashMap();
    }

    public C2086c(Context r3, String r4) {
        this.f3596a = new Object();
        this.f3597b = new ArrayList();
        this.f3598c = new ArrayList();
        this.f3601g = new C0030c();
        this.f3602h = 50;
        this.f3603i = true;
        this.f3604j = false;
        this.f3605k = true;
        this.f3606l = false;
        this.d = r3.getApplicationContext();
        if (TextUtils.isEmpty(r4) == false) goto L5;
    L8:
        this.f3599e = r4;
        return;
    L5:
        if (r4.endsWith(".xml") == true) goto L8;
        this.f3599e = r4 + ".xml";
    }

    public static C2086c d(Context r3, String r4) {
        Object r02 = f3594n;
        monitor-enter(r02);
        Map r1 = f3595o;     // Catch: Throwable -> L7
        C2086c r2 = (C2086c) r1.get(r4);     // Catch: Throwable -> L7
        if (r2 != null) goto L9;
        r2 = new C2086c(r3, r4);     // Catch: Throwable -> L7
        r1.put(r4, r2);     // Catch: Throwable -> L7
    L9:
        monitor-exit(r02);     // Catch: Throwable -> L7
        return r2;
    L7:
        th = move-exception;
        throw th;
    }

    public final boolean a(d r2) {
        boolean r22 = this.f3598c.add(r2);
        if (r22 == false) goto L5;
        this.f3605k = true;
        l();
        k();
        p();
        notifyChanged();
    L5:
        return r22;
    }

    public Intent b(int r7) {
        Object r02 = this.f3596a;
        monitor-enter(r02);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (this.f3600f == null) goto L7;
        c();     // Catch: Throwable -> L9
        ActivityInfo r72 = ((a) this.f3597b.get(r7)).f3607a.activityInfo;     // Catch: Throwable -> L9
        ComponentName r1 = new ComponentName(r72.packageName, r72.name);     // Catch: Throwable -> L9
        Intent r73 = new Intent(this.f3600f);     // Catch: Throwable -> L9
        r73.setComponent(r1);     // Catch: Throwable -> L9
        a(new d(r1, System.currentTimeMillis(), 1.0f));     // Catch: Throwable -> L9
        monitor-exit(r02);     // Catch: Throwable -> L9
        return r73;
    L7:
        monitor-exit(r02);     // Catch: Throwable -> L9
        return null;
    }

    public final void c() {
        boolean r02 = j() | m();
        l();
        if (r02 == false) goto L6;
        p();
        notifyChanged();
        return;
    }

    public ResolveInfo e(int r3) {
        Object r02 = this.f3596a;
        monitor-enter(r02);
        c();     // Catch: Throwable -> L7
        ResolveInfo r32 = ((a) this.f3597b.get(r3)).f3607a;     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return r32;
    L7:
        th = move-exception;
        throw th;
    }

    public int f() {
        Object r02 = this.f3596a;
        monitor-enter(r02);
        c();     // Catch: Throwable -> L7
        int r1 = this.f3597b.size();     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    public int g(ResolveInfo r6) {
        Object r02 = this.f3596a;
        monitor-enter(r02);
        c();     // Catch: Throwable -> L10
        List r1 = this.f3597b;     // Catch: Throwable -> L10
        int r2 = r1.size();     // Catch: Throwable -> L10
        int r3 = 0;
    L5:
        if (r3 >= r2) goto L14;
        if (((a) r1.get(r3)).f3607a == r6) goto L8;
        r3 = r3 + 1;     // Catch: Throwable -> L10
        goto L5
    L8:
        monitor-exit(r02);     // Catch: Throwable -> L10
        return r3;
    L14:
        monitor-exit(r02);     // Catch: Throwable -> L10
        return -1;
    L10:
        th = move-exception;
        throw th;
    }

    public ResolveInfo h() {
        Object r02 = this.f3596a;
        monitor-enter(r02);
        c();     // Catch: Throwable -> L9
        if (this.f3597b.isEmpty() == true) goto L11;
        ResolveInfo r1 = ((a) this.f3597b.get(0)).f3607a;     // Catch: Throwable -> L9
        monitor-exit(r02);     // Catch: Throwable -> L9
        return r1;
    L11:
        monitor-exit(r02);     // Catch: Throwable -> L9
        return null;
    L9:
        th = move-exception;
        throw th;
    }

    public int i() {
        Object r02 = this.f3596a;
        monitor-enter(r02);
        c();     // Catch: Throwable -> L7
        int r1 = this.f3598c.size();     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    public final boolean j() {
        int r1 = 0;
        if (this.f3606l == true) goto L5;
    L11:
        return false;
    L5:
        if (this.f3600f == null) goto L11;
        this.f3606l = false;
        this.f3597b.clear();
        List<ResolveInfo> r02 = this.d.getPackageManager().queryIntentActivities(this.f3600f, 0);
        int r2 = r02.size();
    L7:
        if (r1 >= r2) goto L9;
        ResolveInfo r3 = r02.get(r1);
        this.f3597b.add(new a(r3));
        r1 = r1 + 1;
        goto L7
    L9:
        return true;
    }

    public final void k() {
        if (this.f3604j == false) goto L12;
        if (this.f3605k == false) goto L14;
        this.f3605k = false;
        if (TextUtils.isEmpty(this.f3599e) == true) goto L13;
        new e(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[]{new ArrayList(this.f3598c), this.f3599e});
        return;
    L13:
        return;
    L14:
        return;
    L12:
        throw new IllegalStateException("No preceding call to #readHistoricalData");
    }

    public final void l() {
        int r02 = this.f3598c.size() - this.f3602h;
        if (r02 <= 0) goto L8;
        this.f3605k = true;
        int r2 = 0;
    L6:
        if (r2 >= r02) goto L10;
        d r3 = (d) this.f3598c.remove(0);
        r2 = r2 + 1;
        goto L6
    L10:
        return;
    }

    public final boolean m() {
        if (this.f3603i == true) goto L5;
    L10:
        return false;
    L5:
        if (this.f3605k == false) goto L10;
        if (TextUtils.isEmpty(this.f3599e) == true) goto L10;
        this.f3603i = false;
        this.f3604j = true;
        n();
        return true;
    }

    public final void n() {
        FileInputStream r1 = this.d.openFileInput(this.f3599e);     // Catch: Throwable -> L48
        XmlPullParser r2 = Xml.newPullParser();     // Catch: Throwable -> L10 IOException -> L12 XmlPullParserException -> L14
        r2.setInput(r1, "UTF-8");     // Catch: Throwable -> L10 IOException -> L12 XmlPullParserException -> L14
        int r3 = 0;
    L6:
        if (r3 == 1) goto L17;
        if (r3 == 2) goto L17;
        r3 = r2.next();     // Catch: Throwable -> L10 IOException -> L12 XmlPullParserException -> L14
    L17:
        if ("historical-records".equals(r2.getName()) == false) goto L35;
        List r32 = this.f3598c;     // Catch: Throwable -> L10 IOException -> L12 XmlPullParserException -> L14
        r32.clear();     // Catch: Throwable -> L10 IOException -> L12 XmlPullParserException -> L14
    L19:
        int r5 = r2.next();     // Catch: Throwable -> L10 IOException -> L12 XmlPullParserException -> L14
        if (r5 == 1) goto L21;
        if (r5 == 3) goto L19;
        if (r5 == 4) goto L19;
        if ("historical-record".equals(r2.getName()) == false) goto L33;
        r32.add(new d(r2.getAttributeValue(null, "activity"), Long.parseLong(r2.getAttributeValue(null, CrashHianalyticsData.TIME)), Float.parseFloat(r2.getAttributeValue(null, "weight"))));     // Catch: Throwable -> L10 IOException -> L12 XmlPullParserException -> L14
        goto L19
    L33:
        throw new XmlPullParserException("Share records file not well-formed.");     // Catch: Throwable -> L10 IOException -> L12 XmlPullParserException -> L14
    L21:
        if (r1 == null) goto L46;
        r1.close();
        return;
    L46:
        return;
    L35:
        throw new XmlPullParserException("Share records file does not start with historical-records tag.");     // Catch: Throwable -> L10 IOException -> L12 XmlPullParserException -> L14
    L10:
        th = move-exception;
        if (r1 != null) goto L49;
    L45:
        throw th;
    L49:
        r1.close();     // Catch: IOException -> L47
    L12:
        e = move-exception;
        Log.e(f3593m, "Error reading historical recrod file: " + this.f3599e, e);     // Catch: Throwable -> L10
        if (r1 == null) goto L64;
    L38:
        r1.close();     // Catch: Throwable -> L48
        return;
    L64:
        return;
    L14:
        e = move-exception;
        Log.e(f3593m, "Error reading historical recrod file: " + this.f3599e, e);     // Catch: Throwable -> L10
        if (r1 != null) goto L38;
        return;
    }

    public void o(int r6) {
        Object r02 = this.f3596a;
        monitor-enter(r02);
        c();     // Catch: Throwable -> L7
        a r62 = (a) this.f3597b.get(r6);     // Catch: Throwable -> L7
        a r1 = (a) this.f3597b.get(0);     // Catch: Throwable -> L7
        if (r1 == null) goto L9;
        float r12 = (r1.f3608b - r62.f3608b) + 5.0f;     // Catch: Throwable -> L7
    L10:
        ActivityInfo r63 = r62.f3607a.activityInfo;     // Catch: Throwable -> L7
        a(new d(new ComponentName(r63.packageName, r63.name), System.currentTimeMillis(), r12));     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return;
    L9:
        r12 = 1.0f;
    L7:
        th = move-exception;
        throw th;
    }

    public final boolean p() {
        if (this.f3601g != null) goto L5;
        return false;
    L5:
        if (this.f3600f != null) goto L7;
        return false;
    L7:
        if (this.f3597b.isEmpty() == false) goto L9;
        return false;
    L9:
        if (this.f3598c.isEmpty() == true) goto L16;
        this.f3601g.a(this.f3600f, this.f3597b, Collections.unmodifiableList(this.f3598c));
        return true;
    L16:
        return false;
    }
}

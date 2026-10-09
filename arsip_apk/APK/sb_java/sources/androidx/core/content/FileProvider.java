package androidx.core.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.sessions.settings.RemoteSettings;
import io.sentry.android.core.performance.AppStartMetrics;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class FileProvider extends ContentProvider {

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f22728e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final File f22729f = null;

    /* renamed from: g, reason: collision with root package name */
    public static final HashMap f22730g = null;

    /* renamed from: a, reason: collision with root package name */
    public final Object f22731a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22732b;

    /* renamed from: c, reason: collision with root package name */
    public String f22733c;
    public b d;

    public static class a {
        public static File[] a(Context r02) {
            return r02.getExternalMediaDirs();
        }
    }

    public interface b {
        Uri a(File r1);

        File b(Uri r1);
    }

    public static class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public final String f22734a;

        /* renamed from: b, reason: collision with root package name */
        public final HashMap f22735b;

        public c(String r2) {
            this.f22735b = new HashMap();
            this.f22734a = r2;
        }

        @Override // androidx.core.content.FileProvider.b
        public Uri a(File r6) {
            String r62 = r6.getCanonicalPath();     // Catch: IOException -> L21
            Iterator r02 = this.f22735b.entrySet().iterator();
            Map.Entry r1 = null;
        L5:
            if (r02.hasNext() == false) goto L12;
            Map.Entry r2 = (Map.Entry) r02.next();
            String r3 = ((File) r2.getValue()).getPath();
            if (d(r62, r3) == false) goto L5;
            if (r1 == null) goto L11;
            if (r3.length() <= ((File) r1.getValue()).getPath().length()) goto L5;
        L11:
            r1 = r2;
            goto L5
        L12:
            if (r1 == null) goto L20;
            String r03 = ((File) r1.getValue()).getPath();
            if (r03.endsWith(RemoteSettings.FORWARD_SLASH_STRING) == false) goto L16;
            String r63 = r62.substring(r03.length());
        L18:
            return new Uri.Builder().scheme("content").authority(this.f22734a).encodedPath(Uri.encode((String) r1.getKey()) + '/' + Uri.encode(r63, RemoteSettings.FORWARD_SLASH_STRING)).build();
        L16:
            r63 = r62.substring(r03.length() + 1);
            goto L18
        L20:
            throw new IllegalArgumentException("Failed to find configured root that contains " + r62);
        L22:
            throw new IllegalArgumentException("Failed to resolve canonical path for " + r6);
        }

        @Override // androidx.core.content.FileProvider.b
        public File b(Uri r5) {
            String r02 = r5.getEncodedPath();
            int r1 = r02.indexOf(47, 1);
            if (r1 == (-1)) goto L18;
            String r3 = Uri.decode(r02.substring(1, r1));
            String r03 = Uri.decode(r02.substring(r1 + 1));
            File r12 = (File) this.f22735b.get(r3);
            if (r12 == null) goto L16;
            File r52 = new File(r12, r03);
            File r53 = r52.getCanonicalFile();     // Catch: IOException -> L13
            if (d(r53.getPath(), r12.getPath()) == false) goto L12;
            return r53;
        L12:
            throw new SecurityException("Resolved path jumped beyond configured root");
        L14:
            throw new IllegalArgumentException("Failed to resolve canonical path for " + r52);
        L16:
            throw new IllegalArgumentException("Unable to find configured root for " + r5);
        L18:
            throw new IllegalArgumentException("Unable to find path from root: " + r5);
        }

        public void c(String r4, File r5) {
            if (TextUtils.isEmpty(r4) == true) goto L11;
            this.f22735b.put(r4, r5.getCanonicalFile());
            return;
        L7:
            e = move-exception;
            throw new IllegalArgumentException("Failed to resolve canonical path for " + r5, e);
        L11:
            throw new IllegalArgumentException("Name must not be empty");
        }

        public final boolean d(String r2, String r3) {
            return FileProvider.a(r2).startsWith(FileProvider.a(r3) + '/');
        }
    }

    static {
        f22728e = new String[]{"_display_name", "_size"};
        f22729f = new File(RemoteSettings.FORWARD_SLASH_STRING);
        f22730g = new HashMap();
    }

    public FileProvider() {
        this(0);
    }

    public static /* synthetic */ String a(String r02) {
        return k(r02);
    }

    public static File b(File r4, String... r5) {
        int r02 = r5.length;
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L8;
        String r2 = r5[r1];
        if (r2 == null) goto L7;
        r4 = new File(r4, r2);
    L7:
        r1 = r1 + 1;
        goto L3
    L8:
        return r4;
    }

    public static Object[] c(Object[] r2, int r3) {
        Object[] r02 = new Object[r3];
        System.arraycopy(r2, 0, r02, 0, r3);
        return r02;
    }

    public static String[] d(String[] r2, int r3) {
        String[] r02 = new String[r3];
        System.arraycopy(r2, 0, r02, 0, r3);
        return r02;
    }

    public static XmlResourceParser e(Context r2, String r3, ProviderInfo r4, int r5) {
        if (r4 == null) goto L13;
        if (r4.metaData != null) goto L7;
        if (r5 == 0) goto L7;
        Bundle r32 = new Bundle(1);
        r4.metaData = r32;
        r32.putInt("android.support.FILE_PROVIDER_PATHS", r5);
    L7:
        XmlResourceParser r22 = r4.loadXmlMetaData(r2.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (r22 == null) goto L11;
        return r22;
    L11:
        throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
    L13:
        throw new IllegalArgumentException("Couldn't find meta-data for provider with authority " + r3);
    }

    public static b g(Context r2, String r3, int r4) {
        HashMap r02 = f22730g;
        monitor-enter(r02);
        b r1 = (b) r02.get(r3);     // Catch: Throwable -> L8
        if (r1 == null) goto L21;
    L16:
        monitor-exit(r02);     // Catch: Throwable -> L8
        return r1;
    L21:
        r1 = j(r2, r3, r4);     // Catch: Throwable -> L8 XmlPullParserException -> L10 IOException -> L13
        r02.put(r3, r1);     // Catch: Throwable -> L8
        goto L16
    L13:
        e = move-exception;
        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);     // Catch: Throwable -> L8
    L10:
        e = move-exception;
        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        throw th;
    }

    public static Uri h(Context r1, String r2, File r3) {
        return g(r1, r2, 0).a(r3);
    }

    public static int i(String r3) {
        if ("r".equals(r3) == false) goto L7;
        return 268435456;
    L7:
        if (Constants.INAPP_WINDOW.equals(r3) == false) goto L9;
        return 738197504;
    L9:
        if ("wt".equals(r3) == false) goto L12;
        return 738197504;
    L12:
        if ("wa".equals(r3) == false) goto L16;
        return 704643072;
    L16:
        if ("rw".equals(r3) == false) goto L20;
        return 939524096;
    L20:
        if ("rwt".equals(r3) == false) goto L24;
        return 1006632960;
    L24:
        throw new IllegalArgumentException("Invalid mode: " + r3);
    }

    public static b j(Context r6, String r7, int r8) {
        c r02 = new c(r7);
        XmlResourceParser r72 = e(r6, r7, r6.getPackageManager().resolveContentProvider(r7, 128), r8);
    L3:
        int r82 = r72.next();
        if (r82 == 1) goto L36;
        if (r82 != 2) goto L3;
        String r83 = r72.getName();
        File r2 = null;
        String r1 = r72.getAttributeValue(null, AppMeasurementSdk.ConditionalUserProperty.NAME);
        String r3 = r72.getAttributeValue(null, "path");
        if ("root-path".equals(r83) == false) goto L11;
        r2 = f22729f;
    L34:
        if (r2 == null) goto L3;
        r02.c(r1, b(r2, new String[]{r3}));
        goto L3
    L11:
        if ("files-path".equals(r83) == false) goto L14;
        r2 = r6.getFilesDir();
        goto L34
    L14:
        if ("cache-path".equals(r83) == false) goto L17;
        r2 = r6.getCacheDir();
        goto L34
    L17:
        if ("external-path".equals(r83) == false) goto L20;
        r2 = Environment.getExternalStorageDirectory();
        goto L34
    L20:
        if ("external-files-path".equals(r83) == false) goto L25;
        File[] r84 = androidx.core.content.b.getExternalFilesDirs(r6, null);
        if (r84.length <= 0) goto L34;
        r2 = r84[0];
        goto L34
    L25:
        if ("external-cache-path".equals(r83) == false) goto L30;
        File[] r85 = androidx.core.content.b.getExternalCacheDirs(r6);
        if (r85.length <= 0) goto L34;
        r2 = r85[0];
        goto L34
    L30:
        if ("external-media-path".equals(r83) == false) goto L34;
        File[] r86 = a.a(r6);
        if (r86.length <= 0) goto L34;
        r2 = r86[0];
        goto L34
    L36:
        return r02;
    }

    public static String k(String r2) {
        if (r2.length() > 0) goto L5;
        return r2;
    L5:
        if (r2.charAt(r2.length() - 1) == '/') goto L7;
        return r2;
    L7:
        return r2.substring(0, r2.length() - 1);
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context r2, ProviderInfo r3) {
        super.attachInfo(r2, r3);
        if (r3.exported == true) goto L30;
        if (r3.grantUriPermissions == false) goto L28;
        String r22 = r3.authority;
        if (r22 == null) goto L26;
        if (r22.trim().isEmpty() == true) goto L26;
        String r23 = r3.authority.split(";")[0];
        Object r32 = this.f22731a;
        monitor-enter(r32);
        this.f22733c = r23;     // Catch: Throwable -> L22
        monitor-exit(r32);     // Catch: Throwable -> L22
        HashMap r02 = f22730g;
        monitor-enter(r02);
        r02.remove(r23);     // Catch: Throwable -> L19
        monitor-exit(r02);     // Catch: Throwable -> L19
        return;
    L19:
        th = move-exception;
        throw th;
    L22:
        th = move-exception;
        throw th;
    L26:
        throw new SecurityException("Provider must have a non-empty authority");
    L28:
        throw new SecurityException("Provider must grant uri permissions");
    L30:
        throw new SecurityException("Provider must not be exported");
    }

    @Override // android.content.ContentProvider
    public int delete(Uri r1, String r2, String[] r3) {
        return f().b(r1).delete() ? 1 : 0;
    }

    public final b f() {
        Object r02 = this.f22731a;
        monitor-enter(r02);
        androidx.core.util.c.d(this.f22733c, "mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");     // Catch: Throwable -> L7
        if (this.d != null) goto L9;
        this.d = g(getContext(), this.f22733c, this.f22732b);     // Catch: Throwable -> L7
    L9:
        b r1 = this.d;     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri r3) {
        File r32 = f().b(r3);
        int r02 = r32.getName().lastIndexOf(46);
        if (r02 < 0) goto L7;
        String r33 = r32.getName().substring(r02 + 1);
        String r34 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(r33);
        if (r34 == null) goto L9;
        return r34;
    L9:
        return "application/octet-stream";
    L7:
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public String getTypeAnonymous(Uri r1) {
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri r1, ContentValues r2) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        AppStartMetrics.u(this);
        AppStartMetrics.v(this);
        return true;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri r2, String r3) {
        return ParcelFileDescriptor.open(f().b(r2), i(r3));
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri r7, String[] r8, String r9, String[] r10, String r11) {
        File r92 = f().b(r7);
        String r72 = r7.getQueryParameter("displayName");
        if (r8 != null) goto L5;
        r8 = f22728e;
    L5:
        String[] r102 = new String[r8.length];
        Object[] r112 = new Object[r8.length];
        int r02 = r8.length;
        int r1 = 0;
        int r2 = 0;
    L6:
        if (r1 >= r02) goto L19;
        String r3 = r8[r1];
        if ("_display_name".equals(r3) == false) goto L16;
        r102[r2] = "_display_name";
        int r32 = r2 + 1;
        if (r72 != null) goto L12;
        String r4 = r92.getName();
    L13:
        r112[r2] = r4;
    L14:
        r2 = r32;
    L18:
        r1 = r1 + 1;
        goto L6
    L12:
        r4 = r72;
        goto L13
    L16:
        if ("_size".equals(r3) == false) goto L18;
        r102[r2] = "_size";
        r32 = r2 + 1;
        r112[r2] = Long.valueOf(r92.length());
        goto L14
    L19:
        String[] r73 = d(r102, r2);
        Object[] r82 = c(r112, r2);
        MatrixCursor r93 = new MatrixCursor(r73, 1);
        r93.addRow(r82);
        return r93;
    }

    @Override // android.content.ContentProvider
    public int update(Uri r1, ContentValues r2, String r3, String[] r4) {
        throw new UnsupportedOperationException("No external updates");
    }

    public FileProvider(int r2) {
        this.f22731a = new Object();
        this.f22732b = r2;
    }
}

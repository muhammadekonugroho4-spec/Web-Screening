package com.koushikdutta.ion.loader;

import clickstream.internal.analytics.healthproto.Health;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.stats.CodePackage;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes6.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f41936a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f41937b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f41938c = null;
    public static final HashMap d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f41939e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final HashMap f41940f = null;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f41941a;

        /* renamed from: b, reason: collision with root package name */
        public final String f41942b;

        public a(int r1, String r2) {
            this.f41941a = r1;
            this.f41942b = r2;
        }
    }

    static {
        f41936a = new HashMap();
        f41937b = new HashMap();
        f41938c = new HashMap();
        d = new HashMap();
        f41939e = new HashMap();
        f41940f = new HashMap();
        b("MP3", 1, "audio/mpeg", 12297);
        b("MPGA", 1, "audio/mpeg", 12297);
        b("M4A", 2, "audio/mp4", 12299);
        b("WAV", 3, "audio/x-wav", 12296);
        a("WAV", 15, "audio/wav");
        a("AMR", 4, "audio/amr");
        a("AWB", 5, "audio/amr-wb");
        a("DIVX", 31, "video/divx");
        a("QCP", 13, "audio/qcelp");
        b("OGG", 7, "audio/ogg", 47362);
        b("OGG", 7, "application/ogg", 47362);
        b("OGA", 7, "audio/ogg", 47362);
        b("OGA", 7, "application/ogg", 47362);
        b("AAC", 8, "audio/aac", 47363);
        b("AAC", 8, "audio/aac-adts", 47363);
        a("MKA", 9, "audio/x-matroska");
        a("MID", 17, "audio/midi");
        a("MIDI", 17, "audio/midi");
        a("XMF", 17, "audio/midi");
        a("RTTTL", 17, "audio/midi");
        a("SMF", 18, "audio/sp-midi");
        a("IMY", 19, "audio/imelody");
        a("RTX", 17, "audio/midi");
        a(CodePackage.OTA, 17, "audio/midi");
        a("MXMF", 17, "audio/midi");
        b("MPEG", 21, "video/mpeg", 12299);
        b("MPG", 21, "video/mpeg", 12299);
        b("MP4", 21, "video/mp4", 12299);
        b("MPEG4", 21, "video/mpeg4", 12299);
        b("M4V", 22, "video/m4v", 12299);
        b("3GP", 23, "video/3gpp", 47492);
        b("3GPP", 23, "video/3gpp", 47492);
        b("3G2", 24, "video/3gpp2", 47492);
        b("3GPP2", 24, "video/3gpp2", 47492);
        a("MKV", 27, "video/x-matroska");
        a("WEBM", 30, "video/webm");
        a("TS", 28, "video/mp2ts");
        a("MPG", 28, "video/mp2ts");
        a("AVI", 29, "video/avi");
        b("JPG", 32, "image/jpeg", 14337);
        b("JPEG", 32, "image/jpeg", 14337);
        b("GIF", 33, "image/gif", 14343);
        b("PNG", 34, "image/png", 14347);
        b("BMP", 35, "image/x-ms-bmp", 14340);
        a("WBMP", 36, "image/vnd.wap.wbmp");
        a("WEBP", 37, "image/webp");
        b("M3U", 41, "audio/x-mpegurl", 47633);
        b("M3U", 41, "application/x-mpegurl", 47633);
        b("PLS", 42, "audio/x-scpls", 47636);
        b("WPL", 43, "application/vnd.ms-wpl", 47632);
        a("M3U8", 44, "application/vnd.apple.mpegurl");
        a("M3U8", 44, "audio/mpegurl");
        a("M3U8", 44, "audio/x-mpegurl");
        a("FL", 51, "application/x-android-drm-fl");
        b("TXT", 100, "text/plain", 12292);
        b("HTM", Health.EVENT_TIMESTAMP_FIELD_NUMBER, "text/html", 12293);
        b("HTML", Health.EVENT_TIMESTAMP_FIELD_NUMBER, "text/html", 12293);
        a("PDF", 102, "application/pdf");
        b("DOC", 104, "application/msword", 47747);
        b("XLS", LocationRequest.PRIORITY_NO_POWER, "application/vnd.ms-excel", 47749);
        b("PPT", 106, "application/mspowerpoint", 47750);
        b("FLAC", 10, "audio/flac", 47366);
        a("ZIP", 107, "application/zip");
        a("MPG", 200, "video/mp2p");
        a("MPEG", 200, "video/mp2p");
    }

    public static void a(String r2, int r3, String r4) {
        f41936a.put(r2, new a(r3, r4));
        f41937b.put(r4, Integer.valueOf(r3));
        f41940f.put(r4, r2);
    }

    public static void b(String r1, int r2, String r3, int r4) {
        a(r1, r2, r3);
        f41938c.put(r1, Integer.valueOf(r4));
        d.put(r3, Integer.valueOf(r4));
        f41939e.put(Integer.valueOf(r4), r3);
    }

    public static a c(String r2) {
        int r02 = r2.lastIndexOf(46);
        if (r02 >= 0) goto L7;
        return null;
    L7:
        return (a) f41936a.get(r2.substring(r02 + 1).toUpperCase(Locale.ROOT));
    }

    public static boolean d(int r1) {
        if (r1 < 21) goto L7;
        if (r1 > 31) goto L7;
        return true;
    L7:
        if (r1 < 200) goto L11;
        if (r1 > 200) goto L14;
        return true;
    L14:
        return false;
    L11:
        return false;
    }
}

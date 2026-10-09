package com.fingerprintjs.android.fingerprint.device_id_providers;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import com.fingerprintjs.android.fingerprint.tools.a;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class GsfIdProvider {

    /* renamed from: a, reason: collision with root package name */
    public final ContentResolver f37058a;

    public GsfIdProvider(ContentResolver r2) {
        p.l(r2, "contentResolver");
        this.f37058a = r2;
    }

    public static final /* synthetic */ String a(GsfIdProvider r02) {
        return r02.c();
    }

    public final String b() {
        return (String) a.a(new GsfIdProvider$getGsfAndroidId$1(this), "");
    }

    public final String c() {
        Uri r2 = Uri.parse("content://com.google.android.gsf.gservices");
        String[] r5 = {"android_id"};
        String r02 = null;
        Cursor r1 = this.f37058a.query(r2, null, null, r5, null);     // Catch: Exception -> L18
        if (r1 != null) goto L7;
        return null;
    L7:
        if (r1.moveToFirst() == true) goto L10;
    L16:
        r1.close();     // Catch: Exception -> L18
    L21:
        goto L17
    L10:
        if (r1.getColumnCount() < 2) goto L16;
        String r22 = r1.getString(1);     // Catch: NumberFormatException -> L15 Exception -> L18
        p.k(r22, "cursor.getString(1)");     // Catch: NumberFormatException -> L15 Exception -> L18
        String r23 = Long.toHexString(Long.parseLong(r22));     // Catch: NumberFormatException -> L15 Exception -> L18
        r1.close();     // Catch: NumberFormatException -> L15 Exception -> L18
        r02 = r23;
        goto L21
    L15:
        r1.close();     // Catch: Exception -> L18
    L17:
        return r02;
    }
}

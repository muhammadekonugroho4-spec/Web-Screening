package com.bumptech.glide.load.data.mediastore;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: f, reason: collision with root package name */
    public static final a f32602f = null;

    /* renamed from: a, reason: collision with root package name */
    public final a f32603a;

    /* renamed from: b, reason: collision with root package name */
    public final d f32604b;

    /* renamed from: c, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.b f32605c;
    public final ContentResolver d;

    /* renamed from: e, reason: collision with root package name */
    public final List f32606e;

    static {
        f32602f = new a();
    }

    public e(List r7, d r8, com.bumptech.glide.load.engine.bitmap_recycle.b r9, ContentResolver r10) {
        this(r7, f32602f, r8, r9, r10);
    }

    public int a(Uri r6) {
        InputStream r1 = null;
        r1 = this.d.openInputStream(r6);     // Catch: Throwable -> L7 Throwable -> L9 IOException -> L11
        int r62 = com.bumptech.glide.load.b.b(this.f32606e, r1, this.f32605c);     // Catch: Throwable -> L7 Throwable -> L9 IOException -> L11
        if (r1 != null) goto L26;
    L6:
        return r62;
    L26:
        r1.close();     // Catch: IOException -> L23
    L7:
        th = move-exception;
        if (0 != 0) goto L28;
    L22:
        throw th;
    L28:
        r1.close();     // Catch: IOException -> L24
    L9:
        e = move-exception;
        if (Log.isLoggable("ThumbStreamOpener", 3) == false) goto L16;
        Log.d("ThumbStreamOpener", "Failed to open uri: " + r6, e);     // Catch: Throwable -> L7
    L16:
        if (r1 == null) goto L34;
        r1.close();     // Catch: IOException -> L25
        return -1;
    L35:
        return -1;
    L34:
        return -1;
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x001b: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:11:0x001b */
    public final String b(Uri r7) {
        Cursor r1 = null;
        Cursor r2 = this.f32604b.a(r7);     // Catch: Throwable -> L17 SecurityException -> L19
        if (r2 != null) goto L32;
    L14:
        if (r2 == null) goto L16;
        r2.close();
    L16:
        return null;
    L32:
    L12:
        e = e;
    L23:
        if (Log.isLoggable("ThumbStreamOpener", 3) == false) goto L25;
        Log.d("ThumbStreamOpener", "Failed to query for thumbnail for Uri: " + r7, e);     // Catch: Throwable -> L10
    L25:
        if (r2 == null) goto L27;
        r2.close();
    L27:
        return null;
    L6:
        if (r2.moveToFirst() == false) goto L14;
        String r72 = r2.getString(0);     // Catch: Throwable -> L10 SecurityException -> L12
        r2.close();
        return r72;
    L10:
        th = th;
        r1 = r2;
    L28:
        if (r1 == null) goto L30;
        r1.close();
    L30:
        throw th;
    L19:
        e = e;
        r2 = null;
    L17:
        th = th;
        goto L28
    }

    public final boolean c(File r5) {
        if (this.f32603a.a(r5) == true) goto L5;
        return false;
    L5:
        if (0 >= this.f32603a.c(r5)) goto L10;
        return true;
    L10:
        return false;
    }

    public InputStream d(Uri r6) {
        String r02 = b(r6);
        if (TextUtils.isEmpty(r02) == false) goto L5;
        return null;
    L5:
        File r03 = this.f32603a.b(r02);
        if (c(r03) == true) goto L8;
        return null;
    L8:
        Uri r04 = Uri.fromFile(r03);
        return this.d.openInputStream(r04);
    L11:
        e = move-exception;
        throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + r6 + " -> " + r04).initCause(e));
    }

    public e(List r1, a r2, d r3, com.bumptech.glide.load.engine.bitmap_recycle.b r4, ContentResolver r5) {
        this.f32603a = r2;
        this.f32604b = r3;
        this.f32605c = r4;
        this.d = r5;
        this.f32606e = r1;
    }
}

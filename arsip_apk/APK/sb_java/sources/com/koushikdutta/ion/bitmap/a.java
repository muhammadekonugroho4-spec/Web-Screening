package com.koushikdutta.ion.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Point;
import com.koushikdutta.ion.ResponseServedFrom;
import java.io.File;

/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final Point f41728a;

    /* renamed from: b, reason: collision with root package name */
    public long f41729b;

    /* renamed from: c, reason: collision with root package name */
    public long f41730c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public ResponseServedFrom f41731e;

    /* renamed from: f, reason: collision with root package name */
    public final Bitmap f41732f;

    /* renamed from: g, reason: collision with root package name */
    public Exception f41733g;

    /* renamed from: h, reason: collision with root package name */
    public com.koushikdutta.ion.gif.a f41734h;

    /* renamed from: i, reason: collision with root package name */
    public BitmapRegionDecoder f41735i;

    /* renamed from: j, reason: collision with root package name */
    public File f41736j;

    /* renamed from: k, reason: collision with root package name */
    public final String f41737k;

    /* renamed from: l, reason: collision with root package name */
    public final com.koushikdutta.async.util.h f41738l;

    public a(String r3, String r4, Bitmap r5, Point r6) {
        this.f41729b = System.currentTimeMillis();
        this.f41738l = new com.koushikdutta.async.util.h();
        this.f41728a = r6;
        this.f41732f = r5;
        this.d = r3;
        this.f41737k = r4;
    }

    public int a() {
        Bitmap r02 = this.f41732f;
        if (r02 != null) goto L5;
        com.koushikdutta.ion.gif.a r03 = this.f41734h;
        if (r03 != null) goto L9;
        return 0;
    L9:
        return r03.c();
    L5:
        return r02.getRowBytes() * this.f41732f.getHeight();
    }
}

package com.journeyapps.barcodescanner;

import android.graphics.Bitmap;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.Result;
import java.util.Map;

/* loaded from: classes6.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public Result f41070a;

    /* renamed from: b, reason: collision with root package name */
    public n f41071b;

    /* renamed from: c, reason: collision with root package name */
    public final int f41072c;

    public c(Result r2, n r3) {
        this.f41072c = 2;
        this.f41070a = r2;
        this.f41071b = r3;
    }

    public BarcodeFormat a() {
        return this.f41070a.getBarcodeFormat();
    }

    public Bitmap b() {
        return this.f41071b.b(2);
    }

    public byte[] c() {
        return this.f41070a.getRawBytes();
    }

    public Map d() {
        return this.f41070a.getResultMetadata();
    }

    public String toString() {
        return this.f41070a.getText();
    }
}

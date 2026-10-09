package com.journeyapps.barcodescanner;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Reader;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.HybridBinarizer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class e implements ResultPointCallback {

    /* renamed from: a, reason: collision with root package name */
    public Reader f41165a;

    /* renamed from: b, reason: collision with root package name */
    public List f41166b;

    public e(Reader r2) {
        this.f41166b = new ArrayList();
        this.f41165a = r2;
    }

    public Result a(BinaryBitmap r3) {
        this.f41166b.clear();
        Reader r02 = this.f41165a;     // Catch: Throwable -> L8 Exception -> L15
        if ((r02 instanceof MultiFormatReader) == false) goto L10;
        Result r32 = ((MultiFormatReader) r02).decodeWithState(r3);     // Catch: Throwable -> L8 Exception -> L15
        this.f41165a.reset();
        return r32;
    L10:
        Result r33 = r02.decode(r3);     // Catch: Throwable -> L8 Exception -> L15
        this.f41165a.reset();
        return r33;
    L15:
        this.f41165a.reset();
        return null;
    L8:
        th = move-exception;
        this.f41165a.reset();
        throw th;
    }

    public Result b(LuminanceSource r1) {
        return a(d(r1));
    }

    public List c() {
        return new ArrayList(this.f41166b);
    }

    public BinaryBitmap d(LuminanceSource r3) {
        return new BinaryBitmap(new HybridBinarizer(r3));
    }

    @Override // com.google.zxing.ResultPointCallback
    public void foundPossibleResultPoint(ResultPoint r2) {
        this.f41166b.add(r2);
    }
}

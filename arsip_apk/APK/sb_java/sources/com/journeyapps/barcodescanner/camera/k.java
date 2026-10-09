package com.journeyapps.barcodescanner.camera;

import android.graphics.Rect;
import android.util.Log;
import com.journeyapps.barcodescanner.m;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f41141a = "k";

    public class a implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m f41142a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k f41143b;

        public a(k r1, m r2) {
            this.f41143b = r1;
            this.f41142a = r2;
        }

        public int a(m r3, m r4) {
            float r32 = this.f41143b.c(r3, this.f41142a);
            return Float.compare(this.f41143b.c(r4, this.f41142a), r32);
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Object r1, Object r2) {
            return a((m) r1, (m) r2);
        }
    }

    static {
    }

    public k() {
    }

    public List a(List r2, m r3) {
        if (r3 != null) goto L4;
        return r2;
    L4:
        Collections.sort(r2, new a(this, r3));
        return r2;
    }

    public m b(List r4, m r5) {
        List r42 = a(r4, r5);
        String r02 = f41141a;
        Log.i(r02, "Viewfinder size: " + r5);
        Log.i(r02, "Preview in order of preference: " + r42);
        return (m) r42.get(0);
    }

    public abstract float c(m r1, m r2);

    public abstract Rect d(m r1, m r2);
}

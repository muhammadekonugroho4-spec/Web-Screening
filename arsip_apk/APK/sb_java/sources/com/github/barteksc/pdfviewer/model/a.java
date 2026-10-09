package com.github.barteksc.pdfviewer.model;

import android.graphics.RectF;
import com.shockwave.pdfium.PdfDocument;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public float f37514a;

    /* renamed from: b, reason: collision with root package name */
    public float f37515b;

    /* renamed from: c, reason: collision with root package name */
    public float f37516c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public RectF f37517e;

    /* renamed from: f, reason: collision with root package name */
    public PdfDocument.Link f37518f;

    public a(float r1, float r2, float r3, float r4, RectF r5, PdfDocument.Link r6) {
        this.f37514a = r1;
        this.f37515b = r2;
        this.f37516c = r3;
        this.d = r4;
        this.f37517e = r5;
        this.f37518f = r6;
    }

    public PdfDocument.Link a() {
        return this.f37518f;
    }
}

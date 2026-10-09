package com.github.barteksc.pdfviewer.source;

import android.content.Context;
import com.github.barteksc.pdfviewer.util.d;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;
import java.io.InputStream;

/* loaded from: classes4.dex */
public class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public InputStream f37531a;

    public b(InputStream r1) {
        this.f37531a = r1;
    }

    @Override // com.github.barteksc.pdfviewer.source.a
    public PdfDocument a(Context r1, PdfiumCore r2, String r3) {
        return r2.n(d.b(this.f37531a), r3);
    }
}

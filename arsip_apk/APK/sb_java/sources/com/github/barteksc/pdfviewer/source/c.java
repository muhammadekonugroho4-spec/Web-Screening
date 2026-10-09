package com.github.barteksc.pdfviewer.source;

import android.content.Context;
import android.net.Uri;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;

/* loaded from: classes4.dex */
public class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public Uri f37532a;

    public c(Uri r1) {
        this.f37532a = r1;
    }

    @Override // com.github.barteksc.pdfviewer.source.a
    public PdfDocument a(Context r3, PdfiumCore r4, String r5) {
        return r4.m(r3.getContentResolver().openFileDescriptor(this.f37532a, "r"), r5);
    }
}

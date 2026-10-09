package com.github.barteksc.pdfviewer.exception;

/* loaded from: classes4.dex */
public class PageRenderingException extends Exception {
    private final int page;

    public PageRenderingException(int r1, Throwable r2) {
        super(r2);
        this.page = r1;
    }

    public int a() {
        return this.page;
    }
}

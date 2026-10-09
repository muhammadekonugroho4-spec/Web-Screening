package com.shockwave.pdfium;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.RectF;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.util.Size;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public class PdfiumCore {

    /* renamed from: b, reason: collision with root package name */
    public static final String f43921b = "com.shockwave.pdfium.PdfiumCore";

    /* renamed from: c, reason: collision with root package name */
    public static final Class f43922c = null;
    public static final Object d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Field f43923e;

    /* renamed from: a, reason: collision with root package name */
    public int f43924a;

    static {
        f43922c = FileDescriptor.class;
        System.loadLibrary("c++_shared");     // Catch: UnsatisfiedLinkError -> L5
        System.loadLibrary("modpng");     // Catch: UnsatisfiedLinkError -> L5
        System.loadLibrary("modft2");     // Catch: UnsatisfiedLinkError -> L5
        System.loadLibrary("modpdfium");     // Catch: UnsatisfiedLinkError -> L5
        System.loadLibrary("jniPdfium");     // Catch: UnsatisfiedLinkError -> L5
    L7:
        d = new Object();
        f43923e = null;
        return;
    L5:
        e = move-exception;
        Log.e(f43921b, "Native libraries failed to load - " + e);
        goto L7
    }

    public PdfiumCore(Context r2) {
        this.f43924a = r2.getResources().getDisplayMetrics().densityDpi;
        Log.d(f43921b, "Starting PdfiumAndroid 2.0.4");
    }

    public static int c(ParcelFileDescriptor r3) {
        /*  JADX ERROR: Simple mode code generation failed
            java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
            	at java.base/java.util.Objects.checkIndex(Objects.java:365)
            	at java.base/java.util.ArrayList.get(ArrayList.java:428)
            	at jadx.core.codegen.MethodGen.generateSimpleCode(MethodGen.java:361)
            	at jadx.core.codegen.MethodGen.addSimpleMethodCode(MethodGen.java:323)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:286)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
            	at jadx.core.ProcessClass.process(ProcessClass.java:79)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:401)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:389)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:339)
            */
        /*
            r0 = -1
            java.lang.reflect.Field r1 = com.shockwave.pdfium.PdfiumCore.f43923e     // Catch: java.lang.IllegalAccessException -> L14 java.lang.NoSuchFieldException -> L16
            if (r1 != 0) goto L18
            java.lang.Class r1 = com.shockwave.pdfium.PdfiumCore.f43922c     // Catch: java.lang.IllegalAccessException -> L14 java.lang.NoSuchFieldException -> L16
            java.lang.String r2 = "descriptor"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.IllegalAccessException -> L14 java.lang.NoSuchFieldException -> L16
            com.shockwave.pdfium.PdfiumCore.f43923e = r1     // Catch: java.lang.IllegalAccessException -> L14 java.lang.NoSuchFieldException -> L16
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.IllegalAccessException -> L14 java.lang.NoSuchFieldException -> L16
            goto L18
        L14:
            r3 = move-exception
            goto L23
        L16:
            r3 = move-exception
            goto L27
        L18:
            java.lang.reflect.Field r1 = com.shockwave.pdfium.PdfiumCore.f43923e     // Catch: java.lang.IllegalAccessException -> L14 java.lang.NoSuchFieldException -> L16
            java.io.FileDescriptor r3 = r3.getFileDescriptor()     // Catch: java.lang.IllegalAccessException -> L14 java.lang.NoSuchFieldException -> L16
            int r3 = r1.getInt(r3)     // Catch: java.lang.IllegalAccessException -> L14 java.lang.NoSuchFieldException -> L16
            return r3
        L23:
            r3.printStackTrace()
            return r0
        L27:
            r3.printStackTrace()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.shockwave.pdfium.PdfiumCore.c(android.os.ParcelFileDescriptor):int");
    }

    private native void nativeCloseDocument(long r1);

    private native void nativeClosePage(long r1);

    private native long nativeGetBookmarkDestIndex(long r1, long r3);

    private native String nativeGetBookmarkTitle(long r1);

    private native Integer nativeGetDestPageIndex(long r1, long r3);

    private native String nativeGetDocumentMetaText(long r1, String r3);

    private native Long nativeGetFirstChildBookmark(long r1, Long r3);

    private native RectF nativeGetLinkRect(long r1);

    private native String nativeGetLinkURI(long r1, long r3);

    private native int nativeGetPageCount(long r1);

    private native int nativeGetPageHeightPoint(long r1);

    private native long[] nativeGetPageLinks(long r1);

    private native Size nativeGetPageSizeByIndex(long r1, int r3, int r4);

    private native int nativeGetPageWidthPoint(long r1);

    private native Long nativeGetSiblingBookmark(long r1, long r3);

    private native long nativeLoadPage(long r1, int r3);

    private native long nativeOpenDocument(int r1, String r2);

    private native long nativeOpenMemDocument(byte[] r1, String r2);

    private native Point nativePageCoordsToDevice(long r1, int r3, int r4, int r5, int r6, int r7, double r8, double r10);

    private native void nativeRenderPageBitmap(long r1, Bitmap r3, int r4, int r5, int r6, int r7, int r8, boolean r9);

    public void a(PdfDocument r5) {
        Object r02 = d;
        monitor-enter(r02);
        Iterator r1 = r5.f43907c.keySet().iterator();     // Catch: Throwable -> L8
    L6:
        if (r1.hasNext() == false) goto L10;
        Integer r2 = (Integer) r1.next();     // Catch: Throwable -> L8
        nativeClosePage(((Long) r5.f43907c.get(r2)).longValue());     // Catch: Throwable -> L8
        goto L6
    L10:
        r5.f43907c.clear();     // Catch: Throwable -> L8
        nativeCloseDocument(r5.f43905a);     // Catch: Throwable -> L8
        ParcelFileDescriptor r12 = r5.f43906b;     // Catch: Throwable -> L8
        if (r12 != null) goto L22;
    L15:
        monitor-exit(r02);     // Catch: Throwable -> L8
        return;
    L22:
        r12.close();     // Catch: Throwable -> L8 IOException -> L19
    L14:
        r5.f43906b = null;     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        throw th;
    }

    public PdfDocument.Meta b(PdfDocument r6) {
        Object r02 = d;
        monitor-enter(r02);
        PdfDocument.Meta r1 = new PdfDocument.Meta();     // Catch: Throwable -> L7
        r1.f43914a = nativeGetDocumentMetaText(r6.f43905a, "Title");     // Catch: Throwable -> L7
        r1.f43915b = nativeGetDocumentMetaText(r6.f43905a, "Author");     // Catch: Throwable -> L7
        r1.f43916c = nativeGetDocumentMetaText(r6.f43905a, "Subject");     // Catch: Throwable -> L7
        r1.d = nativeGetDocumentMetaText(r6.f43905a, "Keywords");     // Catch: Throwable -> L7
        r1.f43917e = nativeGetDocumentMetaText(r6.f43905a, "Creator");     // Catch: Throwable -> L7
        r1.f43918f = nativeGetDocumentMetaText(r6.f43905a, "Producer");     // Catch: Throwable -> L7
        r1.f43919g = nativeGetDocumentMetaText(r6.f43905a, "CreationDate");     // Catch: Throwable -> L7
        r1.f43920h = nativeGetDocumentMetaText(r6.f43905a, "ModDate");     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    public int d(PdfDocument r4) {
        Object r02 = d;
        monitor-enter(r02);
        int r42 = nativeGetPageCount(r4.f43905a);     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return r42;
    L7:
        th = move-exception;
        throw th;
    }

    public int e(PdfDocument r2, int r3) {
        Object r02 = d;
        monitor-enter(r02);
        Long r22 = (Long) r2.f43907c.get(Integer.valueOf(r3));     // Catch: Throwable -> L9
        if (r22 == null) goto L12;
        int r23 = nativeGetPageHeightPoint(r22.longValue());     // Catch: Throwable -> L9
        monitor-exit(r02);     // Catch: Throwable -> L9
        return r23;
    L12:
        monitor-exit(r02);     // Catch: Throwable -> L9
        return 0;
    L9:
        th = move-exception;
        throw th;
    }

    public List f(PdfDocument r10, int r11) {
        Object r02 = d;
        monitor-enter(r02);
        ArrayList r1 = new ArrayList();     // Catch: Throwable -> L8
        Long r112 = (Long) r10.f43907c.get(Integer.valueOf(r11));     // Catch: Throwable -> L8
        if (r112 != null) goto L10;
        monitor-exit(r02);     // Catch: Throwable -> L8
        return r1;
    L10:
        long[] r113 = nativeGetPageLinks(r112.longValue());     // Catch: Throwable -> L8
        int r2 = r113.length;     // Catch: Throwable -> L8
        int r3 = 0;
    L11:
        if (r3 >= r2) goto L18;
        long r4 = r113[r3];     // Catch: Throwable -> L8
        Integer r6 = nativeGetDestPageIndex(r10.f43905a, r4);     // Catch: Throwable -> L8
        String r7 = nativeGetLinkURI(r10.f43905a, r4);     // Catch: Throwable -> L8
        RectF r42 = nativeGetLinkRect(r4);     // Catch: Throwable -> L8
        if (r42 == null) goto L17;
        if (r6 != null) goto L16;
        if (r7 == null) goto L17;
    L16:
        r1.add(new PdfDocument.Link(r42, r6, r7));     // Catch: Throwable -> L8
    L17:
        r3 = r3 + 1;     // Catch: Throwable -> L8
        goto L11
    L18:
        monitor-exit(r02);     // Catch: Throwable -> L8
        return r1;
    L8:
        th = move-exception;
        throw th;
    }

    public Size g(PdfDocument r4, int r5) {
        Object r02 = d;
        monitor-enter(r02);
        Size r42 = nativeGetPageSizeByIndex(r4.f43905a, r5, this.f43924a);     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return r42;
    L7:
        th = move-exception;
        throw th;
    }

    public int h(PdfDocument r2, int r3) {
        Object r02 = d;
        monitor-enter(r02);
        Long r22 = (Long) r2.f43907c.get(Integer.valueOf(r3));     // Catch: Throwable -> L9
        if (r22 == null) goto L12;
        int r23 = nativeGetPageWidthPoint(r22.longValue());     // Catch: Throwable -> L9
        monitor-exit(r02);     // Catch: Throwable -> L9
        return r23;
    L12:
        monitor-exit(r02);     // Catch: Throwable -> L9
        return 0;
    L9:
        th = move-exception;
        throw th;
    }

    public List i(PdfDocument r6) {
        Object r02 = d;
        monitor-enter(r02);
        ArrayList r1 = new ArrayList();     // Catch: Throwable -> L7
        Long r2 = nativeGetFirstChildBookmark(r6.f43905a, null);     // Catch: Throwable -> L7
        if (r2 == null) goto L9;
        p(r1, r6, r2.longValue());     // Catch: Throwable -> L7
    L9:
        monitor-exit(r02);     // Catch: Throwable -> L7
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    public Point j(PdfDocument r13, int r14, int r15, int r16, int r17, int r18, int r19, double r20, double r22) {
        return nativePageCoordsToDevice(((Long) r13.f43907c.get(Integer.valueOf(r14))).longValue(), r15, r16, r17, r18, r19, r20, r22);
    }

    public RectF k(PdfDocument r15, int r16, int r17, int r18, int r19, int r20, int r21, RectF r22) {
        Point r1 = j(r15, r16, r17, r18, r19, r20, r21, r22.left, r22.top);
        Point r152 = j(r15, r16, r17, r18, r19, r20, r21, r22.right, r22.bottom);
        return new RectF(r1.x, r1.y, r152.x, r152.y);
    }

    public PdfDocument l(ParcelFileDescriptor r2) {
        return m(r2, null);
    }

    public PdfDocument m(ParcelFileDescriptor r3, String r4) {
        PdfDocument r02 = new PdfDocument();
        r02.f43906b = r3;
        Object r1 = d;
        monitor-enter(r1);
        r02.f43905a = nativeOpenDocument(c(r3), r4);     // Catch: Throwable -> L7
        monitor-exit(r1);     // Catch: Throwable -> L7
        return r02;
    L7:
        th = move-exception;
        throw th;
    }

    public PdfDocument n(byte[] r3, String r4) {
        PdfDocument r02 = new PdfDocument();
        Object r1 = d;
        monitor-enter(r1);
        r02.f43905a = nativeOpenMemDocument(r3, r4);     // Catch: Throwable -> L7
        monitor-exit(r1);     // Catch: Throwable -> L7
        return r02;
    L7:
        th = move-exception;
        throw th;
    }

    public long o(PdfDocument r5, int r6) {
        Object r02 = d;
        monitor-enter(r02);
        long r1 = nativeLoadPage(r5.f43905a, r6);     // Catch: Throwable -> L7
        r5.f43907c.put(Integer.valueOf(r6), Long.valueOf(r1));     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    public final void p(List r5, PdfDocument r6, long r7) {
        PdfDocument.Bookmark r02 = new PdfDocument.Bookmark();
        r02.d = r7;
        r02.f43909b = nativeGetBookmarkTitle(r7);
        r02.f43910c = nativeGetBookmarkDestIndex(r6.f43905a, r7);
        r5.add(r02);
        Long r1 = nativeGetFirstChildBookmark(r6.f43905a, Long.valueOf(r7));
        if (r1 == null) goto L5;
        p(r02.a(), r6, r1.longValue());
    L5:
        Long r72 = nativeGetSiblingBookmark(r6.f43905a, r7);
        if (r72 == null) goto L9;
        p(r5, r6, r72.longValue());
        return;
    }

    public void q(PdfDocument r10, Bitmap r11, int r12, int r13, int r14, int r15, int r16) {
        r(r10, r11, r12, r13, r14, r15, r16, false);
    }

    public void r(PdfDocument r13, Bitmap r14, int r15, int r16, int r17, int r18, int r19, boolean r20) {
        Object r1 = d;
        monitor-enter(r1);
        nativeRenderPageBitmap(((Long) r13.f43907c.get(Integer.valueOf(r15))).longValue(), r14, this.f43924a, r16, r17, r18, r19, r20);     // Catch: Throwable -> L6 Exception -> L8 NullPointerException -> L10
    L14:
        monitor-exit(r1);     // Catch: Throwable -> L6
        return;
    L6:
        th = move-exception;
        throw th;
    L10:
        e = move-exception;
        Log.e(f43921b, "mContext may be null");     // Catch: Throwable -> L6
        e.printStackTrace();     // Catch: Throwable -> L6
    L8:
        e = move-exception;
        Log.e(f43921b, "Exception throw from native");     // Catch: Throwable -> L6
        e.printStackTrace();     // Catch: Throwable -> L6
        goto L14
    }
}

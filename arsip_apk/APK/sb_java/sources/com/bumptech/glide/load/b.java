package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class b {

    public class a implements h {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InputStream f32557a;

        public a(InputStream r1) {
            this.f32557a = r1;
        }

        @Override // com.bumptech.glide.load.b.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser r2) {
            ImageHeaderParser.ImageType r22 = r2.b(this.f32557a);     // Catch: Throwable -> L5
            this.f32557a.reset();
            return r22;
        L5:
            th = move-exception;
            this.f32557a.reset();
            throw th;
        }
    }

    /* renamed from: com.bumptech.glide.load.b$b, reason: collision with other inner class name */
    public class C0319b implements h {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ByteBuffer f32558a;

        public C0319b(ByteBuffer r1) {
            this.f32558a = r1;
        }

        @Override // com.bumptech.glide.load.b.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser r2) {
            ImageHeaderParser.ImageType r22 = r2.d(this.f32558a);     // Catch: Throwable -> L5
            com.bumptech.glide.util.a.d(this.f32558a);
            return r22;
        L5:
            th = move-exception;
            com.bumptech.glide.util.a.d(this.f32558a);
            throw th;
        }
    }

    public class c implements h {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ParcelFileDescriptorRewinder f32559a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.bumptech.glide.load.engine.bitmap_recycle.b f32560b;

        public c(ParcelFileDescriptorRewinder r1, com.bumptech.glide.load.engine.bitmap_recycle.b r2) {
            this.f32559a = r1;
            this.f32560b = r2;
        }

        @Override // com.bumptech.glide.load.b.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser r5) {
            RecyclableBufferedInputStream r02 = null;
            RecyclableBufferedInputStream r1 = new RecyclableBufferedInputStream(new FileInputStream(this.f32559a.d().getFileDescriptor()), this.f32560b);     // Catch: Throwable -> L9
            ImageHeaderParser.ImageType r52 = r5.b(r1);     // Catch: Throwable -> L7
            r1.release();
            this.f32559a.d();
            return r52;
        L7:
            th = th;
            r02 = r1;
        L10:
            if (r02 == null) goto L12;
            r02.release();
        L12:
            this.f32559a.d();
            throw th;
        L9:
            th = th;
            goto L10
        }
    }

    public class d implements g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ByteBuffer f32561a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.bumptech.glide.load.engine.bitmap_recycle.b f32562b;

        public d(ByteBuffer r1, com.bumptech.glide.load.engine.bitmap_recycle.b r2) {
            this.f32561a = r1;
            this.f32562b = r2;
        }

        @Override // com.bumptech.glide.load.b.g
        public int a(ImageHeaderParser r3) {
            int r32 = r3.a(this.f32561a, this.f32562b);     // Catch: Throwable -> L5
            com.bumptech.glide.util.a.d(this.f32561a);
            return r32;
        L5:
            th = move-exception;
            com.bumptech.glide.util.a.d(this.f32561a);
            throw th;
        }
    }

    public class e implements g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InputStream f32563a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.bumptech.glide.load.engine.bitmap_recycle.b f32564b;

        public e(InputStream r1, com.bumptech.glide.load.engine.bitmap_recycle.b r2) {
            this.f32563a = r1;
            this.f32564b = r2;
        }

        @Override // com.bumptech.glide.load.b.g
        public int a(ImageHeaderParser r3) {
            int r32 = r3.c(this.f32563a, this.f32564b);     // Catch: Throwable -> L5
            this.f32563a.reset();
            return r32;
        L5:
            th = move-exception;
            this.f32563a.reset();
            throw th;
        }
    }

    public class f implements g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ParcelFileDescriptorRewinder f32565a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.bumptech.glide.load.engine.bitmap_recycle.b f32566b;

        public f(ParcelFileDescriptorRewinder r1, com.bumptech.glide.load.engine.bitmap_recycle.b r2) {
            this.f32565a = r1;
            this.f32566b = r2;
        }

        @Override // com.bumptech.glide.load.b.g
        public int a(ImageHeaderParser r5) {
            RecyclableBufferedInputStream r02 = null;
            RecyclableBufferedInputStream r1 = new RecyclableBufferedInputStream(new FileInputStream(this.f32565a.d().getFileDescriptor()), this.f32566b);     // Catch: Throwable -> L9
            int r52 = r5.c(r1, this.f32566b);     // Catch: Throwable -> L7
            r1.release();
            this.f32565a.d();
            return r52;
        L7:
            th = th;
            r02 = r1;
        L10:
            if (r02 == null) goto L12;
            r02.release();
        L12:
            this.f32565a.d();
            throw th;
        L9:
            th = th;
            goto L10
        }
    }

    public interface g {
        int a(ImageHeaderParser r1);
    }

    public interface h {
        ImageHeaderParser.ImageType a(ImageHeaderParser r1);
    }

    public static int a(List r1, ParcelFileDescriptorRewinder r2, com.bumptech.glide.load.engine.bitmap_recycle.b r3) {
        return d(r1, new f(r2, r3));
    }

    public static int b(List r1, InputStream r2, com.bumptech.glide.load.engine.bitmap_recycle.b r3) {
        if (r2 != null) goto L6;
        return -1;
    L6:
        if (r2.markSupported() == true) goto L8;
        r2 = new RecyclableBufferedInputStream(r2, r3);
    L8:
        r2.mark(5242880);
        return d(r1, new e(r2, r3));
    }

    public static int c(List r1, ByteBuffer r2, com.bumptech.glide.load.engine.bitmap_recycle.b r3) {
        if (r2 != null) goto L6;
        return -1;
    L6:
        return d(r1, new d(r2, r3));
    }

    public static int d(List r4, g r5) {
        int r02 = r4.size();
        int r1 = 0;
    L4:
        if (r1 >= r02) goto L9;
        int r3 = r5.a((ImageHeaderParser) r4.get(r1));
        if (r3 != (-1)) goto L7;
        r1 = r1 + 1;
        goto L4
    L7:
        return r3;
    L9:
        return -1;
    }

    public static ImageHeaderParser.ImageType e(List r1, ParcelFileDescriptorRewinder r2, com.bumptech.glide.load.engine.bitmap_recycle.b r3) {
        return h(r1, new c(r2, r3));
    }

    public static ImageHeaderParser.ImageType f(List r1, InputStream r2, com.bumptech.glide.load.engine.bitmap_recycle.b r3) {
        if (r2 != null) goto L6;
        return ImageHeaderParser.ImageType.UNKNOWN;
    L6:
        if (r2.markSupported() == true) goto L8;
        r2 = new RecyclableBufferedInputStream(r2, r3);
    L8:
        r2.mark(5242880);
        return h(r1, new a(r2));
    }

    public static ImageHeaderParser.ImageType g(List r1, ByteBuffer r2) {
        if (r2 != null) goto L6;
        return ImageHeaderParser.ImageType.UNKNOWN;
    L6:
        return h(r1, new C0319b(r2));
    }

    public static ImageHeaderParser.ImageType h(List r4, h r5) {
        int r02 = r4.size();
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L9;
        ImageHeaderParser.ImageType r2 = r5.a((ImageHeaderParser) r4.get(r1));
        if (r2 != ImageHeaderParser.ImageType.UNKNOWN) goto L6;
        r1 = r1 + 1;
        goto L3
    L6:
        return r2;
    L9:
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}

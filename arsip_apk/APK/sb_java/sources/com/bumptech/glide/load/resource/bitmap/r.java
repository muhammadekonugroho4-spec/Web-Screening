package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class r implements ImageHeaderParser {
    public r() {
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int a(ByteBuffer r1, com.bumptech.glide.load.engine.bitmap_recycle.b r2) {
        return c(com.bumptech.glide.util.a.g(r1), r2);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType b(InputStream r1) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int c(InputStream r2, com.bumptech.glide.load.engine.bitmap_recycle.b r3) {
        int r22 = new androidx.exifinterface.media.a(r2).m("Orientation", 1);
        if (r22 != 0) goto L6;
        return -1;
    L6:
        return r22;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType d(ByteBuffer r1) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}

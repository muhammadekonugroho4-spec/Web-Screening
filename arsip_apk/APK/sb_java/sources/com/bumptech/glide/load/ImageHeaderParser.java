package com.bumptech.glide.load;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public interface ImageHeaderParser {

    public enum ImageType extends Enum<ImageType> {
        private static final /* synthetic */ ImageType[] $VALUES = null;
        public static final ImageType ANIMATED_AVIF = null;
        public static final ImageType ANIMATED_WEBP = null;
        public static final ImageType AVIF = null;
        public static final ImageType GIF = null;
        public static final ImageType JPEG = null;
        public static final ImageType PNG = null;
        public static final ImageType PNG_A = null;
        public static final ImageType RAW = null;
        public static final ImageType UNKNOWN = null;
        public static final ImageType WEBP = null;
        public static final ImageType WEBP_A = null;
        private final boolean hasAlpha;

        static {
            ImageType r02 = new ImageType("GIF", 0, true);
            GIF = r02;
            ImageType r1 = new ImageType("JPEG", 1, false);
            JPEG = r1;
            ImageType r2 = new ImageType("RAW", 2, false);
            RAW = r2;
            ImageType r3 = new ImageType("PNG_A", 3, true);
            PNG_A = r3;
            ImageType r4 = new ImageType("PNG", 4, false);
            PNG = r4;
            ImageType r5 = new ImageType("WEBP_A", 5, true);
            WEBP_A = r5;
            ImageType r6 = new ImageType("WEBP", 6, false);
            WEBP = r6;
            ImageType r7 = new ImageType("ANIMATED_WEBP", 7, true);
            ANIMATED_WEBP = r7;
            ImageType r8 = new ImageType("AVIF", 8, true);
            AVIF = r8;
            ImageType r9 = new ImageType("ANIMATED_AVIF", 9, true);
            ANIMATED_AVIF = r9;
            ImageType r10 = new ImageType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 10, false);
            UNKNOWN = r10;
            $VALUES = new ImageType[]{r02, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10};
        }

        ImageType(String r1, int r2, boolean r3) {
            this.hasAlpha = r3;
        }

        public static ImageType valueOf(String r1) {
            return (ImageType) Enum.valueOf(ImageType.class, r1);
        }

        public static ImageType[] values() {
            return (ImageType[]) $VALUES.clone();
        }

        public boolean hasAlpha() {
            return this.hasAlpha;
        }

        public boolean isWebp() {
            int r02 = a.f32555a[ordinal()];
            if (r02 != 1) goto L5;
        L10:
            return true;
        L5:
            if (r02 == 2) goto L10;
            if (r02 == 3) goto L10;
            return false;
        }
    }

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32555a = null;

        static {
            int[] r02 = new int[ImageType.values().length];
            f32555a = r02;
            r02[ImageType.WEBP.ordinal()] = 1;     // Catch: NoSuchFieldError -> L7
        L10:
            f32555a[ImageType.WEBP_A.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L12:
            f32555a[ImageType.ANIMATED_WEBP.ordinal()] = 3;     // Catch: NoSuchFieldError -> L9
            return;
        }
    }

    int a(ByteBuffer r1, com.bumptech.glide.load.engine.bitmap_recycle.b r2);

    ImageType b(InputStream r1);

    int c(InputStream r1, com.bumptech.glide.load.engine.bitmap_recycle.b r2);

    ImageType d(ByteBuffer r1);
}

package androidx.camera.core.impl;

import android.content.Context;

/* loaded from: classes.dex */
public interface UseCaseConfigFactory {

    /* renamed from: a, reason: collision with root package name */
    public static final UseCaseConfigFactory f5330a = null;

    public enum CaptureType extends Enum<CaptureType> {
        public static final CaptureType IMAGE_ANALYSIS = null;
        public static final CaptureType IMAGE_CAPTURE = null;
        public static final CaptureType METERING_REPEATING = null;
        public static final CaptureType PREVIEW = null;
        public static final CaptureType STREAM_SHARING = null;
        public static final CaptureType VIDEO_CAPTURE = null;

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ CaptureType[] f5331a = null;

        static {
            IMAGE_CAPTURE = new CaptureType("IMAGE_CAPTURE", 0);
            PREVIEW = new CaptureType("PREVIEW", 1);
            IMAGE_ANALYSIS = new CaptureType("IMAGE_ANALYSIS", 2);
            VIDEO_CAPTURE = new CaptureType("VIDEO_CAPTURE", 3);
            STREAM_SHARING = new CaptureType("STREAM_SHARING", 4);
            METERING_REPEATING = new CaptureType("METERING_REPEATING", 5);
            f5331a = a();
        }

        CaptureType(String r1, int r2) {
        }

        public static /* synthetic */ CaptureType[] a() {
            return new CaptureType[]{IMAGE_CAPTURE, PREVIEW, IMAGE_ANALYSIS, VIDEO_CAPTURE, STREAM_SHARING, METERING_REPEATING};
        }

        public static CaptureType valueOf(String r1) {
            return (CaptureType) Enum.valueOf(CaptureType.class, r1);
        }

        public static CaptureType[] values() {
            return (CaptureType[]) f5331a.clone();
        }
    }

    public class a implements UseCaseConfigFactory {
        public a() {
        }

        @Override // androidx.camera.core.impl.UseCaseConfigFactory
        public Config a(CaptureType r1, int r2) {
            return null;
        }
    }

    public interface b {
        UseCaseConfigFactory a(Context r1);
    }

    static {
        f5330a = new a();
    }

    Config a(CaptureType r1, int r2);
}

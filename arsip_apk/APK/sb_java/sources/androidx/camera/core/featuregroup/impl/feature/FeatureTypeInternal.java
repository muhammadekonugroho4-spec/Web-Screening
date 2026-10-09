package androidx.camera.core.featuregroup.impl.feature;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Landroidx/camera/core/featuregroup/impl/feature/FeatureTypeInternal;", "", "<init>", "(Ljava/lang/String;I)V", "DYNAMIC_RANGE", "FPS_RANGE", "VIDEO_STABILIZATION", "IMAGE_FORMAT", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public enum FeatureTypeInternal extends Enum<FeatureTypeInternal> {
    public static final FeatureTypeInternal DYNAMIC_RANGE = null;
    public static final FeatureTypeInternal FPS_RANGE = null;
    public static final FeatureTypeInternal IMAGE_FORMAT = null;
    public static final FeatureTypeInternal VIDEO_STABILIZATION = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ FeatureTypeInternal[] f4964a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f4965b = null;

    static {
        DYNAMIC_RANGE = new FeatureTypeInternal("DYNAMIC_RANGE", 0);
        FPS_RANGE = new FeatureTypeInternal("FPS_RANGE", 1);
        VIDEO_STABILIZATION = new FeatureTypeInternal("VIDEO_STABILIZATION", 2);
        IMAGE_FORMAT = new FeatureTypeInternal("IMAGE_FORMAT", 3);
        FeatureTypeInternal[] r02 = a();
        f4964a = r02;
        f4965b = kotlin.enums.b.a(r02);
    }

    FeatureTypeInternal(String r1, int r2) {
    }

    public static final /* synthetic */ FeatureTypeInternal[] a() {
        return new FeatureTypeInternal[]{DYNAMIC_RANGE, FPS_RANGE, VIDEO_STABILIZATION, IMAGE_FORMAT};
    }

    public static kotlin.enums.a getEntries() {
        return f4965b;
    }

    public static FeatureTypeInternal valueOf(String r1) {
        return (FeatureTypeInternal) Enum.valueOf(FeatureTypeInternal.class, r1);
    }

    public static FeatureTypeInternal[] values() {
        return (FeatureTypeInternal[]) f4964a.clone();
    }
}

package coil.decode;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcoil/decode/ExifOrientationPolicy;", "", "(Ljava/lang/String;I)V", "IGNORE", "RESPECT_PERFORMANCE", "RESPECT_ALL", "coil-base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum ExifOrientationPolicy extends Enum<ExifOrientationPolicy> {
    public static final ExifOrientationPolicy IGNORE = null;
    public static final ExifOrientationPolicy RESPECT_ALL = null;
    public static final ExifOrientationPolicy RESPECT_PERFORMANCE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ExifOrientationPolicy[] f29907a = null;

    static {
        IGNORE = new ExifOrientationPolicy("IGNORE", 0);
        RESPECT_PERFORMANCE = new ExifOrientationPolicy("RESPECT_PERFORMANCE", 1);
        RESPECT_ALL = new ExifOrientationPolicy("RESPECT_ALL", 2);
        f29907a = a();
    }

    ExifOrientationPolicy(String r1, int r2) {
    }

    public static final /* synthetic */ ExifOrientationPolicy[] a() {
        return new ExifOrientationPolicy[]{IGNORE, RESPECT_PERFORMANCE, RESPECT_ALL};
    }

    public static ExifOrientationPolicy valueOf(String r1) {
        return (ExifOrientationPolicy) Enum.valueOf(ExifOrientationPolicy.class, r1);
    }

    public static ExifOrientationPolicy[] values() {
        return (ExifOrientationPolicy[]) f29907a.clone();
    }
}

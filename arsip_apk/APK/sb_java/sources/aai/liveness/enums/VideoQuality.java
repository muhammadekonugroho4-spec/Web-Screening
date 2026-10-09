package aai.liveness.enums;

@Deprecated
/* loaded from: classes.dex */
public enum VideoQuality extends Enum<VideoQuality> {
    public static final VideoQuality HIGH = null;
    public static final VideoQuality MIDDLE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ VideoQuality[] f1660a = null;
    int bitRate;

    static {
        MIDDLE = new VideoQuality("MIDDLE", 0, 1000000);
        HIGH = new VideoQuality("HIGH", 1, 2000000);
        f1660a = a();
    }

    VideoQuality(String r1, int r2, int r3) {
        this.bitRate = r3;
    }

    public static /* synthetic */ VideoQuality[] a() {
        return new VideoQuality[]{MIDDLE, HIGH};
    }

    public static VideoQuality valueOf(String r1) {
        return (VideoQuality) Enum.valueOf(VideoQuality.class, r1);
    }

    public static VideoQuality[] values() {
        return (VideoQuality[]) f1660a.clone();
    }

    public int getBitRate() {
        return this.bitRate;
    }
}

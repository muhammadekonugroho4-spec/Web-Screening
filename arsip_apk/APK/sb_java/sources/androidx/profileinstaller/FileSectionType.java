package androidx.profileinstaller;

/* loaded from: classes4.dex */
enum FileSectionType extends Enum<FileSectionType> {
    public static final FileSectionType AGGREGATION_COUNT = null;
    public static final FileSectionType CLASSES = null;
    public static final FileSectionType DEX_FILES = null;
    public static final FileSectionType EXTRA_DESCRIPTORS = null;
    public static final FileSectionType METHODS = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ FileSectionType[] f27113a = null;
    private final long mValue;

    static {
        DEX_FILES = new FileSectionType("DEX_FILES", 0, 0);
        EXTRA_DESCRIPTORS = new FileSectionType("EXTRA_DESCRIPTORS", 1, 1);
        CLASSES = new FileSectionType("CLASSES", 2, 2);
        METHODS = new FileSectionType("METHODS", 3, 3);
        AGGREGATION_COUNT = new FileSectionType("AGGREGATION_COUNT", 4, 4);
        f27113a = a();
    }

    FileSectionType(String r1, int r2, long r3) {
        this.mValue = r3;
    }

    public static /* synthetic */ FileSectionType[] a() {
        return new FileSectionType[]{DEX_FILES, EXTRA_DESCRIPTORS, CLASSES, METHODS, AGGREGATION_COUNT};
    }

    public static FileSectionType valueOf(String r1) {
        return (FileSectionType) Enum.valueOf(FileSectionType.class, r1);
    }

    public static FileSectionType[] values() {
        return (FileSectionType[]) f27113a.clone();
    }

    public long getValue() {
        return this.mValue;
    }
}

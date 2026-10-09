package androidx.camera.core.impl;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u0011"}, d2 = {"Landroidx/camera/core/impl/StreamUseCase;", "", "intValue", "", "<init>", "(Ljava/lang/String;II)V", "DEFAULT", "PREVIEW", "VIDEO_RECORD", "STILL_CAPTURE", "VIDEO_CALL", "PREVIEW_VIDEO_STILL", "CROPPED_RAW", "value", "", "getValue", "()J", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public enum StreamUseCase extends Enum<StreamUseCase> {
    public static final StreamUseCase CROPPED_RAW = null;
    public static final StreamUseCase DEFAULT = null;
    public static final StreamUseCase PREVIEW = null;
    public static final StreamUseCase PREVIEW_VIDEO_STILL = null;
    public static final StreamUseCase STILL_CAPTURE = null;
    public static final StreamUseCase VIDEO_CALL = null;
    public static final StreamUseCase VIDEO_RECORD = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ StreamUseCase[] f5306a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f5307b = null;
    private final long value;

    static {
        DEFAULT = new StreamUseCase("DEFAULT", 0, 0);
        PREVIEW = new StreamUseCase("PREVIEW", 1, 1);
        VIDEO_RECORD = new StreamUseCase("VIDEO_RECORD", 2, 3);
        STILL_CAPTURE = new StreamUseCase("STILL_CAPTURE", 3, 2);
        VIDEO_CALL = new StreamUseCase("VIDEO_CALL", 4, 5);
        PREVIEW_VIDEO_STILL = new StreamUseCase("PREVIEW_VIDEO_STILL", 5, 4);
        CROPPED_RAW = new StreamUseCase("CROPPED_RAW", 6, 6);
        StreamUseCase[] r02 = a();
        f5306a = r02;
        f5307b = kotlin.enums.b.a(r02);
    }

    StreamUseCase(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static final /* synthetic */ StreamUseCase[] a() {
        return new StreamUseCase[]{DEFAULT, PREVIEW, VIDEO_RECORD, STILL_CAPTURE, VIDEO_CALL, PREVIEW_VIDEO_STILL, CROPPED_RAW};
    }

    public static kotlin.enums.a getEntries() {
        return f5307b;
    }

    public static StreamUseCase valueOf(String r1) {
        return (StreamUseCase) Enum.valueOf(StreamUseCase.class, r1);
    }

    public static StreamUseCase[] values() {
        return (StreamUseCase[]) f5306a.clone();
    }

    public final long getValue() {
        return this.value;
    }
}

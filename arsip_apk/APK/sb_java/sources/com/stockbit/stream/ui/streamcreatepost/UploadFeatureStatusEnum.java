package com.stockbit.stream.ui.streamcreatepost;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/stockbit/stream/ui/streamcreatepost/UploadFeatureStatusEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "UPLOAD_LOADING", "UPLOAD_READY", "UPLOAD_ERROR", "stream_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public enum UploadFeatureStatusEnum extends Enum<UploadFeatureStatusEnum> {
    public static final UploadFeatureStatusEnum UPLOAD_ERROR = null;
    public static final UploadFeatureStatusEnum UPLOAD_LOADING = null;
    public static final UploadFeatureStatusEnum UPLOAD_READY = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ UploadFeatureStatusEnum[] f145095a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f145096b = null;
    private final int value;

    static {
        UPLOAD_LOADING = new UploadFeatureStatusEnum("UPLOAD_LOADING", 0, 0);
        UPLOAD_READY = new UploadFeatureStatusEnum("UPLOAD_READY", 1, 1);
        UPLOAD_ERROR = new UploadFeatureStatusEnum("UPLOAD_ERROR", 2, 2);
        UploadFeatureStatusEnum[] r02 = a();
        f145095a = r02;
        f145096b = kotlin.enums.b.a(r02);
    }

    UploadFeatureStatusEnum(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static final /* synthetic */ UploadFeatureStatusEnum[] a() {
        return new UploadFeatureStatusEnum[]{UPLOAD_LOADING, UPLOAD_READY, UPLOAD_ERROR};
    }

    public static kotlin.enums.a getEntries() {
        return f145096b;
    }

    public static UploadFeatureStatusEnum valueOf(String r1) {
        return (UploadFeatureStatusEnum) Enum.valueOf(UploadFeatureStatusEnum.class, r1);
    }

    public static UploadFeatureStatusEnum[] values() {
        return (UploadFeatureStatusEnum[]) f145095a.clone();
    }

    public final int getValue() {
        return this.value;
    }
}

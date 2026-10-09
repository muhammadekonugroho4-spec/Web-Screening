package com.stockbit.usecase.liveness.model.type;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/stockbit/usecase/liveness/model/type/LivenessUploadUIType;", "", "path", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getPath", "()Ljava/lang/String;", "FILE_TYPE_UNSPECIFIED", "FILE_TYPE_AMEND_BANK_SELFIE", "FILE_TYPE_AMEND_BANK_LIVENESS", "FILE_TYPE_OA_LIVENESS", "usecase-liveness"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum LivenessUploadUIType extends Enum<LivenessUploadUIType> {
    public static final LivenessUploadUIType FILE_TYPE_AMEND_BANK_LIVENESS = null;
    public static final LivenessUploadUIType FILE_TYPE_AMEND_BANK_SELFIE = null;
    public static final LivenessUploadUIType FILE_TYPE_OA_LIVENESS = null;
    public static final LivenessUploadUIType FILE_TYPE_UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ LivenessUploadUIType[] f158234a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f158235b = null;
    private final String path;

    static {
        FILE_TYPE_UNSPECIFIED = new LivenessUploadUIType("FILE_TYPE_UNSPECIFIED", 0, "");
        FILE_TYPE_AMEND_BANK_SELFIE = new LivenessUploadUIType("FILE_TYPE_AMEND_BANK_SELFIE", 1, "upload_selfie");
        FILE_TYPE_AMEND_BANK_LIVENESS = new LivenessUploadUIType("FILE_TYPE_AMEND_BANK_LIVENESS", 2, "amend_bank");
        FILE_TYPE_OA_LIVENESS = new LivenessUploadUIType("FILE_TYPE_OA_LIVENESS", 3, "upload_liveness_oa");
        LivenessUploadUIType[] r02 = a();
        f158234a = r02;
        f158235b = b.a(r02);
    }

    LivenessUploadUIType(String r1, int r2, String r3) {
        this.path = r3;
    }

    public static final /* synthetic */ LivenessUploadUIType[] a() {
        return new LivenessUploadUIType[]{FILE_TYPE_UNSPECIFIED, FILE_TYPE_AMEND_BANK_SELFIE, FILE_TYPE_AMEND_BANK_LIVENESS, FILE_TYPE_OA_LIVENESS};
    }

    public static a getEntries() {
        return f158235b;
    }

    public static LivenessUploadUIType valueOf(String r1) {
        return (LivenessUploadUIType) Enum.valueOf(LivenessUploadUIType.class, r1);
    }

    public static LivenessUploadUIType[] values() {
        return (LivenessUploadUIType[]) f158234a.clone();
    }

    public final String getPath() {
        return this.path;
    }
}

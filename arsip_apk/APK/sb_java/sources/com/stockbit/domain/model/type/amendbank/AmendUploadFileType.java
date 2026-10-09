package com.stockbit.domain.model.type.amendbank;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/stockbit/domain/model/type/amendbank/AmendUploadFileType;", "", Constants.KEY_KEY, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "FILE_TYPE_UNSPECIFIED", "FILE_TYPE_SELFIE", "FILE_TYPE_LIVENESS", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum AmendUploadFileType extends Enum<AmendUploadFileType> {
    public static final AmendUploadFileType FILE_TYPE_LIVENESS = null;
    public static final AmendUploadFileType FILE_TYPE_SELFIE = null;
    public static final AmendUploadFileType FILE_TYPE_UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AmendUploadFileType[] f86284a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f86285b = null;
    private final String key;

    static {
        FILE_TYPE_UNSPECIFIED = new AmendUploadFileType("FILE_TYPE_UNSPECIFIED", 0, "");
        FILE_TYPE_SELFIE = new AmendUploadFileType("FILE_TYPE_SELFIE", 1, "upload_selfie");
        FILE_TYPE_LIVENESS = new AmendUploadFileType("FILE_TYPE_LIVENESS", 2, "amend_bank");
        AmendUploadFileType[] r02 = a();
        f86284a = r02;
        f86285b = b.a(r02);
    }

    AmendUploadFileType(String r1, int r2, String r3) {
        this.key = r3;
    }

    public static final /* synthetic */ AmendUploadFileType[] a() {
        return new AmendUploadFileType[]{FILE_TYPE_UNSPECIFIED, FILE_TYPE_SELFIE, FILE_TYPE_LIVENESS};
    }

    public static a getEntries() {
        return f86285b;
    }

    public static AmendUploadFileType valueOf(String r1) {
        return (AmendUploadFileType) Enum.valueOf(AmendUploadFileType.class, r1);
    }

    public static AmendUploadFileType[] values() {
        return (AmendUploadFileType[]) f86284a.clone();
    }

    public final String getKey() {
        return this.key;
    }
}

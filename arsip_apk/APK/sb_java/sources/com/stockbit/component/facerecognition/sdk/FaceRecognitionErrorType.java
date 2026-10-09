package com.stockbit.component.facerecognition.sdk;

import com.google.android.gms.stats.CodePackage;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/stockbit/component/facerecognition/sdk/FaceRecognitionErrorType;", "", "<init>", "(Ljava/lang/String;I)V", "CAMERA", "PERMISSION", "NETWORK", "VERIFICATION", "HELP_CLICKED", CodePackage.SECURITY, "USER_CANCELLED", "API", "OTHER", "face-recognition_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public enum FaceRecognitionErrorType extends Enum<FaceRecognitionErrorType> {
    public static final FaceRecognitionErrorType API = null;
    public static final FaceRecognitionErrorType CAMERA = null;
    public static final FaceRecognitionErrorType HELP_CLICKED = null;
    public static final FaceRecognitionErrorType NETWORK = null;
    public static final FaceRecognitionErrorType OTHER = null;
    public static final FaceRecognitionErrorType PERMISSION = null;
    public static final FaceRecognitionErrorType SECURITY = null;
    public static final FaceRecognitionErrorType USER_CANCELLED = null;
    public static final FaceRecognitionErrorType VERIFICATION = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ FaceRecognitionErrorType[] f71042a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f71043b = null;

    static {
        CAMERA = new FaceRecognitionErrorType("CAMERA", 0);
        PERMISSION = new FaceRecognitionErrorType("PERMISSION", 1);
        NETWORK = new FaceRecognitionErrorType("NETWORK", 2);
        VERIFICATION = new FaceRecognitionErrorType("VERIFICATION", 3);
        HELP_CLICKED = new FaceRecognitionErrorType("HELP_CLICKED", 4);
        SECURITY = new FaceRecognitionErrorType(CodePackage.SECURITY, 5);
        USER_CANCELLED = new FaceRecognitionErrorType("USER_CANCELLED", 6);
        API = new FaceRecognitionErrorType("API", 7);
        OTHER = new FaceRecognitionErrorType("OTHER", 8);
        FaceRecognitionErrorType[] r02 = a();
        f71042a = r02;
        f71043b = kotlin.enums.b.a(r02);
    }

    FaceRecognitionErrorType(String r1, int r2) {
    }

    public static final /* synthetic */ FaceRecognitionErrorType[] a() {
        return new FaceRecognitionErrorType[]{CAMERA, PERMISSION, NETWORK, VERIFICATION, HELP_CLICKED, SECURITY, USER_CANCELLED, API, OTHER};
    }

    public static kotlin.enums.a getEntries() {
        return f71043b;
    }

    public static FaceRecognitionErrorType valueOf(String r1) {
        return (FaceRecognitionErrorType) Enum.valueOf(FaceRecognitionErrorType.class, r1);
    }

    public static FaceRecognitionErrorType[] values() {
        return (FaceRecognitionErrorType[]) f71042a.clone();
    }
}

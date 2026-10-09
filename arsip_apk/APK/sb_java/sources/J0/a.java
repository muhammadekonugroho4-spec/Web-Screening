package J0;

import com.iab.digitalidentity.sdk.core.model.OneKycFlow;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f904a = null;

    static {
        int[] r02 = new int[OneKycFlow.values().length];
        r02[OneKycFlow.KTP_SCAN.ordinal()] = 1;     // Catch: NoSuchFieldError -> L11
    L19:
        r02[OneKycFlow.STANDALONE_IDENTITY_VERIFICATION.ordinal()] = 2;     // Catch: NoSuchFieldError -> L12
    L27:
        r02[OneKycFlow.STANDALONE_LIVENESS.ordinal()] = 3;     // Catch: NoSuchFieldError -> L13
    L21:
        r02[OneKycFlow.FACE_VERIFICATION.ordinal()] = 4;     // Catch: NoSuchFieldError -> L14
    L23:
        r02[OneKycFlow.CHALLENGE.ordinal()] = 5;     // Catch: NoSuchFieldError -> L15
    L17:
        r02[OneKycFlow.KYC.ordinal()] = 6;     // Catch: NoSuchFieldError -> L16
    L9:
        f904a = r02;
    }
}

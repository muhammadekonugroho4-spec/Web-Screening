package j0;

import com.iab.digitalidentity.sdk.core.model.OneKycFlow;

/* renamed from: j0.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC11753z {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f177275a = null;

    static {
        int[] r02 = new int[OneKycFlow.values().length];
        r02[OneKycFlow.STANDALONE_IDENTITY_VERIFICATION.ordinal()] = 1;     // Catch: NoSuchFieldError -> L7
    L9:
        r02[OneKycFlow.KTP_SCAN.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
    L5:
        f177275a = r02;
    }
}

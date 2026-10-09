package r0;

import com.iab.digitalidentity.sdk.core.model.OneKycNextFlowState;

/* renamed from: r0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC12121a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f183377a = null;

    static {
        int[] r02 = new int[OneKycNextFlowState.values().length];
        r02[OneKycNextFlowState.BLOCKED.ordinal()] = 1;     // Catch: NoSuchFieldError -> L12
    L21:
        r02[OneKycNextFlowState.DOCUMENT_CAPTURE.ordinal()] = 2;     // Catch: NoSuchFieldError -> L13
    L31:
        r02[OneKycNextFlowState.STATUS.ordinal()] = 3;     // Catch: NoSuchFieldError -> L14
    L23:
        r02[OneKycNextFlowState.CHALLENGE.ordinal()] = 4;     // Catch: NoSuchFieldError -> L15
    L25:
        r02[OneKycNextFlowState.CONSENT.ordinal()] = 5;     // Catch: NoSuchFieldError -> L16
    L19:
        r02[OneKycNextFlowState.USER_DETAIL.ordinal()] = 6;     // Catch: NoSuchFieldError -> L17
    L27:
        r02[OneKycNextFlowState.FORM.ordinal()] = 7;     // Catch: NoSuchFieldError -> L18
    L10:
        f183377a = r02;
    }
}

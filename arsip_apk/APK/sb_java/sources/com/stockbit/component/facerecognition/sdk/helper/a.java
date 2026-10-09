package com.stockbit.component.facerecognition.sdk.helper;

import com.iab.digitalidentity.sdk.core.constants.DigitalIdentityFlowErrorCode;
import com.stockbit.component.facerecognition.sdk.FaceRecognitionErrorType;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: com.stockbit.component.facerecognition.sdk.helper.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0705a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f71050a = null;

        static {
            int[] r02 = new int[DigitalIdentityFlowErrorCode.values().length];
            r02[DigitalIdentityFlowErrorCode.CAMERA.ordinal()] = 1;     // Catch: NoSuchFieldError -> L13
        L23:
            r02[DigitalIdentityFlowErrorCode.PERMISSION.ordinal()] = 2;     // Catch: NoSuchFieldError -> L14
        L35:
            r02[DigitalIdentityFlowErrorCode.NETWORK.ordinal()] = 3;     // Catch: NoSuchFieldError -> L15
        L25:
            r02[DigitalIdentityFlowErrorCode.VERIFICATION.ordinal()] = 4;     // Catch: NoSuchFieldError -> L16
        L27:
            r02[DigitalIdentityFlowErrorCode.HELP_CLICKED.ordinal()] = 5;     // Catch: NoSuchFieldError -> L17
        L21:
            r02[DigitalIdentityFlowErrorCode.SECURITY.ordinal()] = 6;     // Catch: NoSuchFieldError -> L18
        L29:
            r02[DigitalIdentityFlowErrorCode.USER_CANCELLED.ordinal()] = 7;     // Catch: NoSuchFieldError -> L19
        L31:
            r02[DigitalIdentityFlowErrorCode.API.ordinal()] = 8;     // Catch: NoSuchFieldError -> L20
        L11:
            f71050a = r02;
        }
    }

    public static final FaceRecognitionErrorType a(DigitalIdentityFlowErrorCode r1) {
        if (r1 != null) goto L4;
        int r12 = -1;
    L5:
        switch(r12) {
            case -1: goto L25;
            case 0: goto L7;
            case 1: goto L23;
            case 2: goto L21;
            case 3: goto L19;
            case 4: goto L17;
            case 5: goto L15;
            case 6: goto L13;
            case 7: goto L11;
            case 8: goto L9;
            default: goto L7;
        };
    L7:
        throw new NoWhenBranchMatchedException();
    L9:
        return FaceRecognitionErrorType.API;
    L11:
        return FaceRecognitionErrorType.USER_CANCELLED;
    L13:
        return FaceRecognitionErrorType.SECURITY;
    L15:
        return FaceRecognitionErrorType.HELP_CLICKED;
    L17:
        return FaceRecognitionErrorType.VERIFICATION;
    L19:
        return FaceRecognitionErrorType.NETWORK;
    L21:
        return FaceRecognitionErrorType.PERMISSION;
    L23:
        return FaceRecognitionErrorType.CAMERA;
    L25:
        return FaceRecognitionErrorType.OTHER;
    L4:
        r12 = C0705a.f71050a[r1.ordinal()];
        goto L5
    }
}

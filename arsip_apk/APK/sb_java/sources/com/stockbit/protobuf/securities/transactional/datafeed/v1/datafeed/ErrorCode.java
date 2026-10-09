package com.stockbit.protobuf.securities.transactional.datafeed.v1.datafeed;

import com.google.protobuf.Internal;

/* loaded from: classes10.dex */
public enum ErrorCode extends Enum<ErrorCode> implements Internal.EnumLite {
    private static final /* synthetic */ ErrorCode[] $VALUES = null;
    public static final ErrorCode ERROR_CODE_BAD_REQUEST = null;
    public static final int ERROR_CODE_BAD_REQUEST_VALUE = 400;
    public static final ErrorCode ERROR_CODE_UNAUTHORIZED = null;
    public static final int ERROR_CODE_UNAUTHORIZED_VALUE = 401;
    public static final ErrorCode ERROR_CODE_UNSPECIFIED = null;
    public static final int ERROR_CODE_UNSPECIFIED_VALUE = 0;
    public static final ErrorCode UNRECOGNIZED = null;
    private static final Internal.EnumLiteMap<ErrorCode> internalValueMap = null;
    private final int value;

    public static final class ErrorCodeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = null;

        static {
            INSTANCE = new ErrorCodeVerifier();
        }

        private ErrorCodeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (ErrorCode.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    private static /* synthetic */ ErrorCode[] $values() {
        return new ErrorCode[]{ERROR_CODE_UNSPECIFIED, ERROR_CODE_BAD_REQUEST, ERROR_CODE_UNAUTHORIZED, UNRECOGNIZED};
    }

    static {
        ERROR_CODE_UNSPECIFIED = new ErrorCode("ERROR_CODE_UNSPECIFIED", 0, 0);
        ERROR_CODE_BAD_REQUEST = new ErrorCode("ERROR_CODE_BAD_REQUEST", 1, ERROR_CODE_BAD_REQUEST_VALUE);
        ERROR_CODE_UNAUTHORIZED = new ErrorCode("ERROR_CODE_UNAUTHORIZED", 2, ERROR_CODE_UNAUTHORIZED_VALUE);
        UNRECOGNIZED = new ErrorCode("UNRECOGNIZED", 3, -1);
        $VALUES = $values();
        internalValueMap = new AnonymousClass1();
    }

    ErrorCode(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static ErrorCode forNumber(int r1) {
        if (r1 == 0) goto L14;
        if (r1 == 400) goto L12;
        if (r1 == 401) goto L10;
        return null;
    L10:
        return ERROR_CODE_UNAUTHORIZED;
    L12:
        return ERROR_CODE_BAD_REQUEST;
    L14:
        return ERROR_CODE_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<ErrorCode> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return ErrorCodeVerifier.INSTANCE;
    }

    public static ErrorCode valueOf(String r1) {
        return (ErrorCode) Enum.valueOf(ErrorCode.class, r1);
    }

    public static ErrorCode[] values() {
        return (ErrorCode[]) $VALUES.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static ErrorCode valueOf(int r02) {
        return forNumber(r02);
    }
}

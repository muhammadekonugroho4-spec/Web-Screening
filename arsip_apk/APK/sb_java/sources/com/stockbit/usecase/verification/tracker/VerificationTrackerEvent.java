package com.stockbit.usecase.verification.tracker;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lcom/stockbit/usecase/verification/tracker/VerificationTrackerEvent;", "", "message", "", "tag", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getTag", "START", "VERIFY_PASSWORD", "VERIFY_PIN", "VERIFY_IDENTITY", "REQUEST_OTP", "VERIFY_OTP", "START_FACE_MATCHING", "RESULT_FACE_MATCHING", "VERIFY_FACE_MATCHING", "INIT_DUKCAPIL", "GET_CURRENT_STATE_DUKCAPIL", "VERIFY_DUKCAPIL", "CANCEL", "FINISH", "usecase-verification_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum VerificationTrackerEvent extends Enum<VerificationTrackerEvent> {
    public static final VerificationTrackerEvent CANCEL = null;
    public static final VerificationTrackerEvent FINISH = null;
    public static final VerificationTrackerEvent GET_CURRENT_STATE_DUKCAPIL = null;
    public static final VerificationTrackerEvent INIT_DUKCAPIL = null;
    public static final VerificationTrackerEvent REQUEST_OTP = null;
    public static final VerificationTrackerEvent RESULT_FACE_MATCHING = null;
    public static final VerificationTrackerEvent START = null;
    public static final VerificationTrackerEvent START_FACE_MATCHING = null;
    public static final VerificationTrackerEvent VERIFY_DUKCAPIL = null;
    public static final VerificationTrackerEvent VERIFY_FACE_MATCHING = null;
    public static final VerificationTrackerEvent VERIFY_IDENTITY = null;
    public static final VerificationTrackerEvent VERIFY_OTP = null;
    public static final VerificationTrackerEvent VERIFY_PASSWORD = null;
    public static final VerificationTrackerEvent VERIFY_PIN = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ VerificationTrackerEvent[] f164528a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f164529b = null;
    private final String message;
    private final String tag;

    static {
        START = new VerificationTrackerEvent("START", 0, "Start Challenge", "start");
        VERIFY_PASSWORD = new VerificationTrackerEvent("VERIFY_PASSWORD", 1, "Verify Password", "password");
        VERIFY_PIN = new VerificationTrackerEvent("VERIFY_PIN", 2, "Verify PIN", "pin");
        VERIFY_IDENTITY = new VerificationTrackerEvent("VERIFY_IDENTITY", 3, "Verify Identity", "identity");
        REQUEST_OTP = new VerificationTrackerEvent("REQUEST_OTP", 4, "Request OTP", "request_otp");
        VERIFY_OTP = new VerificationTrackerEvent("VERIFY_OTP", 5, "Verify OTP", "verify_otp");
        START_FACE_MATCHING = new VerificationTrackerEvent("START_FACE_MATCHING", 6, "Start Face Matching", "start_face_matching");
        RESULT_FACE_MATCHING = new VerificationTrackerEvent("RESULT_FACE_MATCHING", 7, "Get Face Matching Result", "result_face_matching");
        VERIFY_FACE_MATCHING = new VerificationTrackerEvent("VERIFY_FACE_MATCHING", 8, "Verify Face Matching", "verify_face_matching");
        INIT_DUKCAPIL = new VerificationTrackerEvent("INIT_DUKCAPIL", 9, "Init Dukcapil Verification", "init_dukcapil");
        GET_CURRENT_STATE_DUKCAPIL = new VerificationTrackerEvent("GET_CURRENT_STATE_DUKCAPIL", 10, "Get Current State Dukcapil", "get_current_state_dukcapil");
        VERIFY_DUKCAPIL = new VerificationTrackerEvent("VERIFY_DUKCAPIL", 11, "Verify Dukcapil", "verify_dukcapil");
        CANCEL = new VerificationTrackerEvent("CANCEL", 12, "Cancel Verification", "cancel_verification");
        FINISH = new VerificationTrackerEvent("FINISH", 13, "Finish Verification", "finish_verification");
        VerificationTrackerEvent[] r02 = a();
        f164528a = r02;
        f164529b = kotlin.enums.b.a(r02);
    }

    VerificationTrackerEvent(String r1, int r2, String r3, String r4) {
        this.message = r3;
        this.tag = r4;
    }

    public static final /* synthetic */ VerificationTrackerEvent[] a() {
        return new VerificationTrackerEvent[]{START, VERIFY_PASSWORD, VERIFY_PIN, VERIFY_IDENTITY, REQUEST_OTP, VERIFY_OTP, START_FACE_MATCHING, RESULT_FACE_MATCHING, VERIFY_FACE_MATCHING, INIT_DUKCAPIL, GET_CURRENT_STATE_DUKCAPIL, VERIFY_DUKCAPIL, CANCEL, FINISH};
    }

    public static kotlin.enums.a getEntries() {
        return f164529b;
    }

    public static VerificationTrackerEvent valueOf(String r1) {
        return (VerificationTrackerEvent) Enum.valueOf(VerificationTrackerEvent.class, r1);
    }

    public static VerificationTrackerEvent[] values() {
        return (VerificationTrackerEvent[]) f164528a.clone();
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getTag() {
        return this.tag;
    }
}

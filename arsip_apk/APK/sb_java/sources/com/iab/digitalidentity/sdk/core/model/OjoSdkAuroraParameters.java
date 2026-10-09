package com.iab.digitalidentity.sdk.core.model;

import a0.AbstractC2053a;
import b.AbstractC4230a;
import b.AbstractC4231b;
import com.clevertap.android.sdk.Constants;
import com.google.common.primitives.Ints;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\bd\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 w2\u00020\u0001:\u0001wBÙ\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0005\u0012\b\b\u0002\u0010 \u001a\u00020\u0005\u0012\b\b\u0002\u0010!\u001a\u00020\u0007\u0012\b\b\u0002\u0010\"\u001a\u00020\u0007\u0012\b\b\u0002\u0010#\u001a\u00020\u0007\u0012\b\b\u0002\u0010$\u001a\u00020\u0007\u0012\b\b\u0002\u0010%\u001a\u00020\u0007\u0012\b\b\u0002\u0010&\u001a\u00020\u0007\u0012\b\b\u0002\u0010'\u001a\u00020\u0007¢\u0006\u0002\u0010(J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0007HÆ\u0003J\t\u0010Q\u001a\u00020\u0007HÆ\u0003J\t\u0010R\u001a\u00020\u0011HÆ\u0003J\t\u0010S\u001a\u00020\u0007HÆ\u0003J\t\u0010T\u001a\u00020\u0011HÆ\u0003J\t\u0010U\u001a\u00020\u0007HÆ\u0003J\t\u0010V\u001a\u00020\u0007HÆ\u0003J\t\u0010W\u001a\u00020\u0007HÆ\u0003J\t\u0010X\u001a\u00020\u0007HÆ\u0003J\t\u0010Y\u001a\u00020\u0007HÆ\u0003J\t\u0010Z\u001a\u00020\u0005HÆ\u0003J\t\u0010[\u001a\u00020\u0007HÆ\u0003J\t\u0010\\\u001a\u00020\u0007HÆ\u0003J\t\u0010]\u001a\u00020\u0007HÆ\u0003J\t\u0010^\u001a\u00020\u0011HÆ\u0003J\t\u0010_\u001a\u00020\u0007HÆ\u0003J\t\u0010`\u001a\u00020\u0007HÆ\u0003J\t\u0010a\u001a\u00020\u0005HÆ\u0003J\t\u0010b\u001a\u00020\u0005HÆ\u0003J\t\u0010c\u001a\u00020\u0007HÆ\u0003J\t\u0010d\u001a\u00020\u0007HÆ\u0003J\t\u0010e\u001a\u00020\u0007HÆ\u0003J\t\u0010f\u001a\u00020\u0007HÆ\u0003J\t\u0010g\u001a\u00020\u0007HÆ\u0003J\t\u0010h\u001a\u00020\u0007HÆ\u0003J\t\u0010i\u001a\u00020\u0007HÆ\u0003J\t\u0010j\u001a\u00020\u0007HÆ\u0003J\t\u0010k\u001a\u00020\u0003HÆ\u0003J\t\u0010l\u001a\u00020\u0005HÆ\u0003J\t\u0010m\u001a\u00020\u0003HÆ\u0003J\t\u0010n\u001a\u00020\u0007HÆ\u0003J\t\u0010o\u001a\u00020\u0007HÆ\u0003J\t\u0010p\u001a\u00020\u0007HÆ\u0003JÝ\u0002\u0010q\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00112\b\b\u0002\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u00052\b\b\u0002\u0010 \u001a\u00020\u00052\b\b\u0002\u0010!\u001a\u00020\u00072\b\b\u0002\u0010\"\u001a\u00020\u00072\b\b\u0002\u0010#\u001a\u00020\u00072\b\b\u0002\u0010$\u001a\u00020\u00072\b\b\u0002\u0010%\u001a\u00020\u00072\b\b\u0002\u0010&\u001a\u00020\u00072\b\b\u0002\u0010'\u001a\u00020\u0007HÆ\u0001J\u0013\u0010r\u001a\u00020\u00112\b\u0010s\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010t\u001a\u00020\u0005HÖ\u0001J\t\u0010u\u001a\u00020vHÖ\u0001R\u0016\u0010 \u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010\u001f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010*R\u0016\u0010\u001e\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0016\u0010\u001d\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010-R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010*R\u0016\u0010\u001c\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0016\u0010'\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010-R\u0016\u0010!\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010-R\u0016\u0010\u0015\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010-R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00103R\u0016\u0010&\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010-R\u0016\u0010%\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010-R\u0016\u0010\u0017\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010-R\u0016\u0010\u0016\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010-R\u0016\u0010\u0014\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010-R\u0016\u0010\u0013\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u00101R\u0016\u0010\u0019\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010-R\u0016\u0010\u001a\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010-R\u0016\u0010\u001b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010-R\u0016\u0010\u0018\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010-R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010*R\u0016\u0010\r\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010-R\u0016\u0010\f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010-R\u0016\u0010\u000e\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010-R\u0016\u0010\u000f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010-R\u0016\u0010\u000b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010-R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010-R\u0016\u0010$\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010-R\u0016\u0010\"\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010-R\u0016\u0010#\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010-R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u00103R\u0016\u0010\u0012\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010-R\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u00101¨\u0006x"}, d2 = {"Lcom/iab/digitalidentity/sdk/core/model/OjoSdkAuroraParameters;", "", "displayedColorChangeTime", "", "maximumNotOneFaceTimes", "", "significantFaceRate", "", "skipFirstNMilliseconds", "auroraMaxTrialTimes", "auroraRestartDelayTime", "qcOkThreshold", "qcBlurThreshold", "qcBlockThreshold", "qcBrightThreshold", "qcDarkThreshold", "successLogUploadOn", "", "successLogSampleRate", "failedLogUploadOn", "failedLogSampleRate", "debugPNGRatio", "eyeDistanceMinRate", "eyeDistanceMaxRate", "lastLandmarkDiffThreshold", "frontalFaceEulerXThreshold", "frontalFaceEulerYThreshold", "frontalFaceEulerZThreshold", "auroraRealtimeInference", "auroraLivenessThreshold", "auroraLivenessSpoofThreshold", "auroraLivenessNumberThreshold", "auroraColorNumberThreshold", "brightnessThreshold", "silentASRealThreshold", "silentASSpoofThreshold", "silentASBrightRealThreshold", "eyeCloseThreshold", "eyeBlockThreshold", "brightRejectThreshold", "(JIFJIJFFFFFZFZFFFFFFFFZFFIIFFFFFFF)V", "getAuroraColorNumberThreshold", "()I", "getAuroraLivenessNumberThreshold", "getAuroraLivenessSpoofThreshold", "()F", "getAuroraLivenessThreshold", "getAuroraMaxTrialTimes", "getAuroraRealtimeInference", "()Z", "getAuroraRestartDelayTime", "()J", "getBrightRejectThreshold", "getBrightnessThreshold", "getDebugPNGRatio", "getDisplayedColorChangeTime", "getEyeBlockThreshold", "getEyeCloseThreshold", "getEyeDistanceMaxRate", "getEyeDistanceMinRate", "getFailedLogSampleRate", "getFailedLogUploadOn", "getFrontalFaceEulerXThreshold", "getFrontalFaceEulerYThreshold", "getFrontalFaceEulerZThreshold", "getLastLandmarkDiffThreshold", "getMaximumNotOneFaceTimes", "getQcBlockThreshold", "getQcBlurThreshold", "getQcBrightThreshold", "getQcDarkThreshold", "getQcOkThreshold", "getSignificantFaceRate", "getSilentASBrightRealThreshold", "getSilentASRealThreshold", "getSilentASSpoofThreshold", "getSkipFirstNMilliseconds", "getSuccessLogSampleRate", "getSuccessLogUploadOn", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component4", "component5", "component6", "component7", "component8", "component9", Constants.COPY_TYPE, "equals", "other", "hashCode", "toString", "", "Companion", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OjoSdkAuroraParameters {
    public static final Companion Companion = null;
    private static final int DEFAULT_AURORA_AURORA_MAX_TRIAL_TIME = 5;
    private static final float DEFAULT_AURORA_BRIGHTNESS_THRESHOLD = 10.0f;
    private static final float DEFAULT_AURORA_BRIGHT_REJECT_THRESHOLD = 2.0f;
    private static final int DEFAULT_AURORA_COLOR_NUMBER_THRESHOLD = 2;
    private static final float DEFAULT_AURORA_DEBUG_PNG_RATIO = 100.0f;
    private static final long DEFAULT_AURORA_DISPLAY_COLOR_CHANGE_TIME = 250;
    private static final int DEFAULT_AURORA_ERROR_MESSAGE_CHANGE_TIME = 1000;
    private static final float DEFAULT_AURORA_EYE_BLOCK_THRESHOLD = 0.65f;
    private static final float DEFAULT_AURORA_EYE_CLOSE_THRESHOLD = 0.35f;
    private static final float DEFAULT_AURORA_EYE_DISTANCE_MAX_RATE = 0.35f;
    private static final float DEFAULT_AURORA_EYE_DISTANCE_MIN_RATE = 0.2f;
    private static final boolean DEFAULT_AURORA_FAILED_LOG_UPLOAD_ON = true;
    private static final float DEFAULT_AURORA_FAILED_LOG_UPLOAD_RATE = 1.0f;
    private static final float DEFAULT_AURORA_FRONTAL_FACE_EULER_X_THRESHOLD = 30.0f;
    private static final float DEFAULT_AURORA_FRONTAL_FACE_EULER_Y_THRESHOLD = 20.0f;
    private static final float DEFAULT_AURORA_FRONTAL_FACE_EULER_Z_THRESHOLD = 20.0f;
    private static final float DEFAULT_AURORA_LAST_LANDMARK_DIFF_THRESHOLD = 0.08f;
    private static final int DEFAULT_AURORA_LIVENESS_NUMBER_THRESHOLD = 2;
    private static final float DEFAULT_AURORA_LIVENESS_SPOOF_THRESHOLD = 0.1f;
    private static final float DEFAULT_AURORA_LIVENESS_THRESHOLD = 0.97f;
    private static final int DEFAULT_AURORA_MAXIMUM_NOT_ONE_FACE_TIMES = 3;
    private static final float DEFAULT_AURORA_QC_BLOCK_THRESHOLD = 0.85f;
    private static final float DEFAULT_AURORA_QC_BLUR_THRESHOLD = 0.1f;
    private static final float DEFAULT_AURORA_QC_BRIGHT_THRESHOLD = 0.56f;
    private static final float DEFAULT_AURORA_QC_DARK_THRESHOLD = 0.92f;
    private static final float DEFAULT_AURORA_QC_OK_THRESHOLD = 0.4f;
    private static final boolean DEFAULT_AURORA_REALTIME_INFERENCE = true;
    private static final long DEFAULT_AURORA_RESTART_DELAY_TIME = 500;
    private static final float DEFAULT_AURORA_SIGNIFICANT_FACE_RATE = 0.2f;
    private static final float DEFAULT_AURORA_SILENT_AS_BRIGHT_REAL_THRESHOLD = 0.6f;
    private static final float DEFAULT_AURORA_SILENT_AS_REAL_THRESHOLD = 0.6f;
    private static final float DEFAULT_AURORA_SILENT_AS_SPOOF_THRESHOLD = 0.7f;
    private static final long DEFAULT_AURORA_SKIP_FIRST_N_MILLISECONDS = 1000;
    private static final float DEFAULT_AURORA_SUCCESS_LOG_SAMPLE_RATE = 1.0f;
    private static final boolean DEFAULT_AURORA_SUCCESS_LOG_UPLOAD_ON = true;

    @SerializedName("colorNumberTh")
    private final int auroraColorNumberThreshold;

    @SerializedName("livenessNumberTh")
    private final int auroraLivenessNumberThreshold;

    @SerializedName("livenessSpoofTh")
    private final float auroraLivenessSpoofThreshold;

    @SerializedName("livenessTh")
    private final float auroraLivenessThreshold;

    @SerializedName("maxTrialTimes")
    private final int auroraMaxTrialTimes;

    @SerializedName("realtimeInference")
    private final boolean auroraRealtimeInference;

    @SerializedName("restartDelayTime")
    private final long auroraRestartDelayTime;

    @SerializedName("brightRejectTh")
    private final float brightRejectThreshold;

    @SerializedName("brightnessTh")
    private final float brightnessThreshold;

    @SerializedName("debugPNGRatio")
    private final float debugPNGRatio;

    @SerializedName("displayedColorChangeTime")
    private final long displayedColorChangeTime;

    @SerializedName("eyeBlockTh")
    private final float eyeBlockThreshold;

    @SerializedName("eyeCloseTh")
    private final float eyeCloseThreshold;

    @SerializedName("eyeDistanceMaxRate")
    private final float eyeDistanceMaxRate;

    @SerializedName("eyeDistanceMinRate")
    private final float eyeDistanceMinRate;

    @SerializedName("failedLogSampleRate")
    private final float failedLogSampleRate;

    @SerializedName("failedLogUploadOn")
    private final boolean failedLogUploadOn;

    @SerializedName("frontalFaceEulerXTh")
    private final float frontalFaceEulerXThreshold;

    @SerializedName("frontalFaceEulerYTh")
    private final float frontalFaceEulerYThreshold;

    @SerializedName("frontalFaceEulerZTh")
    private final float frontalFaceEulerZThreshold;

    @SerializedName("lastLandmarkDiffTh")
    private final float lastLandmarkDiffThreshold;

    @SerializedName("maximumNotOneFaceTimes")
    private final int maximumNotOneFaceTimes;

    @SerializedName("qcBlockTh")
    private final float qcBlockThreshold;

    @SerializedName("qcBlurTh")
    private final float qcBlurThreshold;

    @SerializedName("qcBrightTh")
    private final float qcBrightThreshold;

    @SerializedName("qcDarkTh")
    private final float qcDarkThreshold;

    @SerializedName("qcOkTh")
    private final float qcOkThreshold;

    @SerializedName("significantFaceRate")
    private final float significantFaceRate;

    @SerializedName("silentASBrightRealTh")
    private final float silentASBrightRealThreshold;

    @SerializedName("silentASRealTh")
    private final float silentASRealThreshold;

    @SerializedName("silentASSpoofTh")
    private final float silentASSpoofThreshold;

    @SerializedName("skipFirstNMilliseconds")
    private final long skipFirstNMilliseconds;

    @SerializedName("successLogSampleRate")
    private final float successLogSampleRate;

    @SerializedName("successLogUploadOn")
    private final boolean successLogUploadOn;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010*\u001a\u00020+R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/iab/digitalidentity/sdk/core/model/OjoSdkAuroraParameters$Companion;", "", "()V", "DEFAULT_AURORA_AURORA_MAX_TRIAL_TIME", "", "DEFAULT_AURORA_BRIGHTNESS_THRESHOLD", "", "DEFAULT_AURORA_BRIGHT_REJECT_THRESHOLD", "DEFAULT_AURORA_COLOR_NUMBER_THRESHOLD", "DEFAULT_AURORA_DEBUG_PNG_RATIO", "DEFAULT_AURORA_DISPLAY_COLOR_CHANGE_TIME", "", "DEFAULT_AURORA_ERROR_MESSAGE_CHANGE_TIME", "DEFAULT_AURORA_EYE_BLOCK_THRESHOLD", "DEFAULT_AURORA_EYE_CLOSE_THRESHOLD", "DEFAULT_AURORA_EYE_DISTANCE_MAX_RATE", "DEFAULT_AURORA_EYE_DISTANCE_MIN_RATE", "DEFAULT_AURORA_FAILED_LOG_UPLOAD_ON", "", "DEFAULT_AURORA_FAILED_LOG_UPLOAD_RATE", "DEFAULT_AURORA_FRONTAL_FACE_EULER_X_THRESHOLD", "DEFAULT_AURORA_FRONTAL_FACE_EULER_Y_THRESHOLD", "DEFAULT_AURORA_FRONTAL_FACE_EULER_Z_THRESHOLD", "DEFAULT_AURORA_LAST_LANDMARK_DIFF_THRESHOLD", "DEFAULT_AURORA_LIVENESS_NUMBER_THRESHOLD", "DEFAULT_AURORA_LIVENESS_SPOOF_THRESHOLD", "DEFAULT_AURORA_LIVENESS_THRESHOLD", "DEFAULT_AURORA_MAXIMUM_NOT_ONE_FACE_TIMES", "DEFAULT_AURORA_QC_BLOCK_THRESHOLD", "DEFAULT_AURORA_QC_BLUR_THRESHOLD", "DEFAULT_AURORA_QC_BRIGHT_THRESHOLD", "DEFAULT_AURORA_QC_DARK_THRESHOLD", "DEFAULT_AURORA_QC_OK_THRESHOLD", "DEFAULT_AURORA_REALTIME_INFERENCE", "DEFAULT_AURORA_RESTART_DELAY_TIME", "DEFAULT_AURORA_SIGNIFICANT_FACE_RATE", "DEFAULT_AURORA_SILENT_AS_BRIGHT_REAL_THRESHOLD", "DEFAULT_AURORA_SILENT_AS_REAL_THRESHOLD", "DEFAULT_AURORA_SILENT_AS_SPOOF_THRESHOLD", "DEFAULT_AURORA_SKIP_FIRST_N_MILLISECONDS", "DEFAULT_AURORA_SUCCESS_LOG_SAMPLE_RATE", "DEFAULT_AURORA_SUCCESS_LOG_UPLOAD_ON", "getDefaultAuroraParameters", "Lcom/iab/digitalidentity/sdk/core/model/OjoSdkAuroraParameters;", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(i r1) {
            this();
        }

        public final OjoSdkAuroraParameters getDefaultAuroraParameters() {
            return new OjoSdkAuroraParameters(OjoSdkAuroraParameters.DEFAULT_AURORA_DISPLAY_COLOR_CHANGE_TIME, 3, 0.2f, OjoSdkAuroraParameters.DEFAULT_AURORA_SKIP_FIRST_N_MILLISECONDS, 5, OjoSdkAuroraParameters.DEFAULT_AURORA_RESTART_DELAY_TIME, OjoSdkAuroraParameters.DEFAULT_AURORA_QC_OK_THRESHOLD, 0.1f, OjoSdkAuroraParameters.DEFAULT_AURORA_QC_BLOCK_THRESHOLD, OjoSdkAuroraParameters.DEFAULT_AURORA_QC_BRIGHT_THRESHOLD, OjoSdkAuroraParameters.DEFAULT_AURORA_QC_DARK_THRESHOLD, true, 1.0f, true, 1.0f, 100.0f, 0.2f, 0.35f, OjoSdkAuroraParameters.DEFAULT_AURORA_LAST_LANDMARK_DIFF_THRESHOLD, 30.0f, 20.0f, 20.0f, true, OjoSdkAuroraParameters.DEFAULT_AURORA_LIVENESS_THRESHOLD, 0.1f, 2, 2, OjoSdkAuroraParameters.DEFAULT_AURORA_BRIGHTNESS_THRESHOLD, 0.6f, OjoSdkAuroraParameters.DEFAULT_AURORA_SILENT_AS_SPOOF_THRESHOLD, 0.6f, 0.35f, OjoSdkAuroraParameters.DEFAULT_AURORA_EYE_BLOCK_THRESHOLD, OjoSdkAuroraParameters.DEFAULT_AURORA_BRIGHT_REJECT_THRESHOLD);
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public OjoSdkAuroraParameters() {
        long r1 = 0;
        int r3 = 0;
        float r4 = 0.0f;
        long r5 = 0;
        int r7 = 0;
        long r8 = 0;
        float r10 = 0.0f;
        float r11 = 0.0f;
        float r12 = 0.0f;
        float r13 = 0.0f;
        float r14 = 0.0f;
        boolean r15 = false;
        float r16 = 0.0f;
        boolean r17 = false;
        float r18 = 0.0f;
        float r19 = 0.0f;
        float r20 = 0.0f;
        float r21 = 0.0f;
        float r22 = 0.0f;
        float r23 = 0.0f;
        float r24 = 0.0f;
        float r25 = 0.0f;
        boolean r26 = false;
        float r27 = 0.0f;
        float r28 = 0.0f;
        int r29 = 0;
        int r30 = 0;
        float r31 = 0.0f;
        float r32 = 0.0f;
        float r33 = 0.0f;
        float r34 = 0.0f;
        float r35 = 0.0f;
        float r36 = 0.0f;
        float r37 = 0.0f;
        int r38 = -1;
        this(r1, r3, r4, r5, r7, r8, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, 3, null);
    }

    public static /* synthetic */ OjoSdkAuroraParameters copy$default(OjoSdkAuroraParameters r19, long r20, int r22, float r23, long r24, int r26, long r27, float r29, float r30, float r31, float r32, float r33, boolean r34, float r35, boolean r36, float r37, float r38, float r39, float r40, float r41, float r42, float r43, float r44, boolean r45, float r46, float r47, int r48, int r49, float r50, float r51, float r52, float r53, float r54, float r55, float r56, int r57, int r58, Object r59) {
        if ((r57 & 1) == 0) goto L5;
        long r2 = r19.displayedColorChangeTime;
    L7:
        if ((r57 & 2) == 0) goto L9;
        int r4 = r19.maximumNotOneFaceTimes;
    L11:
        if ((r57 & 4) == 0) goto L13;
        float r5 = r19.significantFaceRate;
    L15:
        if ((r57 & 8) == 0) goto L17;
        long r6 = r19.skipFirstNMilliseconds;
    L19:
        if ((r57 & 16) == 0) goto L21;
        int r8 = r19.auroraMaxTrialTimes;
    L23:
        if ((r57 & 32) == 0) goto L25;
        long r9 = r19.auroraRestartDelayTime;
    L27:
        if ((r57 & 64) == 0) goto L29;
        float r11 = r19.qcOkThreshold;
    L31:
        if ((r57 & 128) == 0) goto L33;
        float r12 = r19.qcBlurThreshold;
    L35:
        if ((r57 & 256) == 0) goto L37;
        float r13 = r19.qcBlockThreshold;
    L39:
        if ((r57 & 512) == 0) goto L41;
        float r14 = r19.qcBrightThreshold;
    L43:
        if ((r57 & 1024) == 0) goto L45;
        float r15 = r19.qcDarkThreshold;
    L46:
        long r16 = r2;
        if ((r57 & 2048) == 0) goto L49;
        boolean r25 = r19.successLogUploadOn;
    L51:
        if ((r57 & 4096) == 0) goto L53;
        float r3 = r19.successLogSampleRate;
    L54:
        boolean r202 = r25;
        if ((r57 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        boolean r28 = r19.failedLogUploadOn;
    L58:
        boolean r21 = r28;
        if ((r57 & 16384) == 0) goto L61;
        float r210 = r19.failedLogSampleRate;
    L63:
        if ((r57 & 32768) == 0) goto L65;
        float r1 = r19.debugPNGRatio;
    L66:
        float r222 = r1;
        if ((r57 & 65536) == 0) goto L69;
        float r17 = r19.eyeDistanceMinRate;
    L70:
        float r232 = r17;
        if ((r57 & 131072) == 0) goto L73;
        float r18 = r19.eyeDistanceMaxRate;
    L74:
        float r242 = r18;
        if ((r57 & 262144) == 0) goto L77;
        float r110 = r19.lastLandmarkDiffThreshold;
    L78:
        float r252 = r110;
        if ((r57 & 524288) == 0) goto L81;
        float r111 = r19.frontalFaceEulerXThreshold;
    L82:
        float r262 = r111;
        if ((r57 & 1048576) == 0) goto L85;
        float r112 = r19.frontalFaceEulerYThreshold;
    L86:
        float r272 = r112;
        if ((r57 & 2097152) == 0) goto L89;
        float r113 = r19.frontalFaceEulerZThreshold;
    L90:
        float r282 = r113;
        if ((r57 & 4194304) == 0) goto L93;
        boolean r114 = r19.auroraRealtimeInference;
    L94:
        boolean r292 = r114;
        if ((r57 & 8388608) == 0) goto L97;
        float r115 = r19.auroraLivenessThreshold;
    L98:
        float r302 = r115;
        if ((r57 & 16777216) == 0) goto L101;
        float r116 = r19.auroraLivenessSpoofThreshold;
    L102:
        float r312 = r116;
        if ((r57 & 33554432) == 0) goto L105;
        int r117 = r19.auroraLivenessNumberThreshold;
    L106:
        int r322 = r117;
        if ((r57 & 67108864) == 0) goto L109;
        int r118 = r19.auroraColorNumberThreshold;
    L110:
        int r332 = r118;
        if ((r57 & 134217728) == 0) goto L113;
        float r119 = r19.brightnessThreshold;
    L114:
        float r342 = r119;
        if ((r57 & 268435456) == 0) goto L117;
        float r120 = r19.silentASRealThreshold;
    L118:
        float r352 = r120;
        if ((r57 & 536870912) == 0) goto L121;
        float r121 = r19.silentASSpoofThreshold;
    L122:
        float r362 = r121;
        if ((r57 & Ints.MAX_POWER_OF_TWO) == 0) goto L125;
        float r122 = r19.silentASBrightRealThreshold;
    L126:
        float r372 = r122;
        if ((r57 & Integer.MIN_VALUE) == 0) goto L129;
        float r123 = r19.eyeCloseThreshold;
    L130:
        float r382 = r123;
        if ((r58 & 1) == 0) goto L133;
        float r124 = r19.eyeBlockThreshold;
    L135:
        if ((r58 & 2) == 0) goto L138;
        float r392 = r124;
        float r562 = r392;
        float r572 = r19.brightRejectThreshold;
        float r402 = r232;
        float r412 = r242;
        float r422 = r252;
        float r432 = r262;
        float r442 = r272;
        float r452 = r282;
        boolean r462 = r292;
        float r472 = r302;
        float r482 = r312;
        int r492 = r322;
        int r502 = r332;
        float r512 = r342;
        float r522 = r352;
        float r532 = r362;
        float r542 = r372;
        float r552 = r382;
        float r383 = r210;
        float r363 = r3;
        int r233 = r4;
        float r243 = r5;
        long r253 = r6;
        int r273 = r8;
        long r283 = r9;
        float r303 = r11;
        float r313 = r12;
        float r323 = r13;
        float r333 = r14;
        float r343 = r15;
        boolean r353 = r202;
        boolean r373 = r21;
        float r393 = r222;
    L140:
        return r19.copy(r16, r233, r243, r253, r273, r283, r303, r313, r323, r333, r343, r353, r363, r373, r383, r393, r402, r412, r422, r432, r442, r452, r462, r472, r482, r492, r502, r512, r522, r532, r542, r552, r562, r572);
    L138:
        r572 = r56;
        r562 = r124;
        r393 = r222;
        r402 = r232;
        r412 = r242;
        r422 = r252;
        r432 = r262;
        r442 = r272;
        r452 = r282;
        r462 = r292;
        r472 = r302;
        r482 = r312;
        r492 = r322;
        r502 = r332;
        r512 = r342;
        r522 = r352;
        r532 = r362;
        r542 = r372;
        r552 = r382;
        r383 = r210;
        r363 = r3;
        r233 = r4;
        r243 = r5;
        r253 = r6;
        r273 = r8;
        r283 = r9;
        r303 = r11;
        r313 = r12;
        r323 = r13;
        r333 = r14;
        r343 = r15;
        r353 = r202;
        r373 = r21;
        goto L140
    L133:
        r124 = r55;
        goto L135
    L129:
        r123 = r54;
        goto L130
    L125:
        r122 = r53;
        goto L126
    L121:
        r121 = r52;
        goto L122
    L117:
        r120 = r51;
        goto L118
    L113:
        r119 = r50;
        goto L114
    L109:
        r118 = r49;
        goto L110
    L105:
        r117 = r48;
        goto L106
    L101:
        r116 = r47;
        goto L102
    L97:
        r115 = r46;
        goto L98
    L93:
        r114 = r45;
        goto L94
    L89:
        r113 = r44;
        goto L90
    L85:
        r112 = r43;
        goto L86
    L81:
        r111 = r42;
        goto L82
    L77:
        r110 = r41;
        goto L78
    L73:
        r18 = r40;
        goto L74
    L69:
        r17 = r39;
        goto L70
    L65:
        r1 = r38;
        goto L66
    L61:
        r210 = r37;
        goto L63
    L57:
        r28 = r36;
        goto L58
    L53:
        r3 = r35;
        goto L54
    L49:
        r25 = r34;
        goto L51
    L45:
        r15 = r33;
        goto L46
    L41:
        r14 = r32;
        goto L43
    L37:
        r13 = r31;
        goto L39
    L33:
        r12 = r30;
        goto L35
    L29:
        r11 = r29;
        goto L31
    L25:
        r9 = r27;
        goto L27
    L21:
        r8 = r26;
        goto L23
    L17:
        r6 = r24;
        goto L19
    L13:
        r5 = r23;
        goto L15
    L9:
        r4 = r22;
        goto L11
    L5:
        r2 = r20;
        goto L7
    }

    public final long component1() {
        return this.displayedColorChangeTime;
    }

    public final float component10() {
        return this.qcBrightThreshold;
    }

    public final float component11() {
        return this.qcDarkThreshold;
    }

    public final boolean component12() {
        return this.successLogUploadOn;
    }

    public final float component13() {
        return this.successLogSampleRate;
    }

    public final boolean component14() {
        return this.failedLogUploadOn;
    }

    public final float component15() {
        return this.failedLogSampleRate;
    }

    public final float component16() {
        return this.debugPNGRatio;
    }

    public final float component17() {
        return this.eyeDistanceMinRate;
    }

    public final float component18() {
        return this.eyeDistanceMaxRate;
    }

    public final float component19() {
        return this.lastLandmarkDiffThreshold;
    }

    public final int component2() {
        return this.maximumNotOneFaceTimes;
    }

    public final float component20() {
        return this.frontalFaceEulerXThreshold;
    }

    public final float component21() {
        return this.frontalFaceEulerYThreshold;
    }

    public final float component22() {
        return this.frontalFaceEulerZThreshold;
    }

    public final boolean component23() {
        return this.auroraRealtimeInference;
    }

    public final float component24() {
        return this.auroraLivenessThreshold;
    }

    public final float component25() {
        return this.auroraLivenessSpoofThreshold;
    }

    public final int component26() {
        return this.auroraLivenessNumberThreshold;
    }

    public final int component27() {
        return this.auroraColorNumberThreshold;
    }

    public final float component28() {
        return this.brightnessThreshold;
    }

    public final float component29() {
        return this.silentASRealThreshold;
    }

    public final float component3() {
        return this.significantFaceRate;
    }

    public final float component30() {
        return this.silentASSpoofThreshold;
    }

    public final float component31() {
        return this.silentASBrightRealThreshold;
    }

    public final float component32() {
        return this.eyeCloseThreshold;
    }

    public final float component33() {
        return this.eyeBlockThreshold;
    }

    public final float component34() {
        return this.brightRejectThreshold;
    }

    public final long component4() {
        return this.skipFirstNMilliseconds;
    }

    public final int component5() {
        return this.auroraMaxTrialTimes;
    }

    public final long component6() {
        return this.auroraRestartDelayTime;
    }

    public final float component7() {
        return this.qcOkThreshold;
    }

    public final float component8() {
        return this.qcBlurThreshold;
    }

    public final float component9() {
        return this.qcBlockThreshold;
    }

    public final OjoSdkAuroraParameters copy(long r39, int r41, float r42, long r43, int r45, long r46, float r48, float r49, float r50, float r51, float r52, boolean r53, float r54, boolean r55, float r56, float r57, float r58, float r59, float r60, float r61, float r62, float r63, boolean r64, float r65, float r66, int r67, int r68, float r69, float r70, float r71, float r72, float r73, float r74, float r75) {
        return new OjoSdkAuroraParameters(r39, r41, r42, r43, r45, r46, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75);
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof OjoSdkAuroraParameters) == true) goto L8;
        return false;
    L8:
        OjoSdkAuroraParameters r82 = (OjoSdkAuroraParameters) r8;
        if (this.displayedColorChangeTime == r82.displayedColorChangeTime) goto L12;
        return false;
    L12:
        if (this.maximumNotOneFaceTimes == r82.maximumNotOneFaceTimes) goto L15;
        return false;
    L15:
        if (Float.compare(this.significantFaceRate, r82.significantFaceRate) == 0) goto L18;
        return false;
    L18:
        if (this.skipFirstNMilliseconds == r82.skipFirstNMilliseconds) goto L21;
        return false;
    L21:
        if (this.auroraMaxTrialTimes == r82.auroraMaxTrialTimes) goto L24;
        return false;
    L24:
        if (this.auroraRestartDelayTime == r82.auroraRestartDelayTime) goto L27;
        return false;
    L27:
        if (Float.compare(this.qcOkThreshold, r82.qcOkThreshold) == 0) goto L30;
        return false;
    L30:
        if (Float.compare(this.qcBlurThreshold, r82.qcBlurThreshold) == 0) goto L33;
        return false;
    L33:
        if (Float.compare(this.qcBlockThreshold, r82.qcBlockThreshold) == 0) goto L36;
        return false;
    L36:
        if (Float.compare(this.qcBrightThreshold, r82.qcBrightThreshold) == 0) goto L39;
        return false;
    L39:
        if (Float.compare(this.qcDarkThreshold, r82.qcDarkThreshold) == 0) goto L42;
        return false;
    L42:
        if (this.successLogUploadOn == r82.successLogUploadOn) goto L45;
        return false;
    L45:
        if (Float.compare(this.successLogSampleRate, r82.successLogSampleRate) == 0) goto L48;
        return false;
    L48:
        if (this.failedLogUploadOn == r82.failedLogUploadOn) goto L51;
        return false;
    L51:
        if (Float.compare(this.failedLogSampleRate, r82.failedLogSampleRate) == 0) goto L54;
        return false;
    L54:
        if (Float.compare(this.debugPNGRatio, r82.debugPNGRatio) == 0) goto L57;
        return false;
    L57:
        if (Float.compare(this.eyeDistanceMinRate, r82.eyeDistanceMinRate) == 0) goto L60;
        return false;
    L60:
        if (Float.compare(this.eyeDistanceMaxRate, r82.eyeDistanceMaxRate) == 0) goto L63;
        return false;
    L63:
        if (Float.compare(this.lastLandmarkDiffThreshold, r82.lastLandmarkDiffThreshold) == 0) goto L66;
        return false;
    L66:
        if (Float.compare(this.frontalFaceEulerXThreshold, r82.frontalFaceEulerXThreshold) == 0) goto L69;
        return false;
    L69:
        if (Float.compare(this.frontalFaceEulerYThreshold, r82.frontalFaceEulerYThreshold) == 0) goto L72;
        return false;
    L72:
        if (Float.compare(this.frontalFaceEulerZThreshold, r82.frontalFaceEulerZThreshold) == 0) goto L75;
        return false;
    L75:
        if (this.auroraRealtimeInference == r82.auroraRealtimeInference) goto L78;
        return false;
    L78:
        if (Float.compare(this.auroraLivenessThreshold, r82.auroraLivenessThreshold) == 0) goto L81;
        return false;
    L81:
        if (Float.compare(this.auroraLivenessSpoofThreshold, r82.auroraLivenessSpoofThreshold) == 0) goto L84;
        return false;
    L84:
        if (this.auroraLivenessNumberThreshold == r82.auroraLivenessNumberThreshold) goto L87;
        return false;
    L87:
        if (this.auroraColorNumberThreshold == r82.auroraColorNumberThreshold) goto L90;
        return false;
    L90:
        if (Float.compare(this.brightnessThreshold, r82.brightnessThreshold) == 0) goto L93;
        return false;
    L93:
        if (Float.compare(this.silentASRealThreshold, r82.silentASRealThreshold) == 0) goto L96;
        return false;
    L96:
        if (Float.compare(this.silentASSpoofThreshold, r82.silentASSpoofThreshold) == 0) goto L99;
        return false;
    L99:
        if (Float.compare(this.silentASBrightRealThreshold, r82.silentASBrightRealThreshold) == 0) goto L102;
        return false;
    L102:
        if (Float.compare(this.eyeCloseThreshold, r82.eyeCloseThreshold) == 0) goto L105;
        return false;
    L105:
        if (Float.compare(this.eyeBlockThreshold, r82.eyeBlockThreshold) == 0) goto L108;
        return false;
    L108:
        if (Float.compare(this.brightRejectThreshold, r82.brightRejectThreshold) == 0) goto L110;
        return false;
    L110:
        return true;
    }

    public final int getAuroraColorNumberThreshold() {
        return this.auroraColorNumberThreshold;
    }

    public final int getAuroraLivenessNumberThreshold() {
        return this.auroraLivenessNumberThreshold;
    }

    public final float getAuroraLivenessSpoofThreshold() {
        return this.auroraLivenessSpoofThreshold;
    }

    public final float getAuroraLivenessThreshold() {
        return this.auroraLivenessThreshold;
    }

    public final int getAuroraMaxTrialTimes() {
        return this.auroraMaxTrialTimes;
    }

    public final boolean getAuroraRealtimeInference() {
        return this.auroraRealtimeInference;
    }

    public final long getAuroraRestartDelayTime() {
        return this.auroraRestartDelayTime;
    }

    public final float getBrightRejectThreshold() {
        return this.brightRejectThreshold;
    }

    public final float getBrightnessThreshold() {
        return this.brightnessThreshold;
    }

    public final float getDebugPNGRatio() {
        return this.debugPNGRatio;
    }

    public final long getDisplayedColorChangeTime() {
        return this.displayedColorChangeTime;
    }

    public final float getEyeBlockThreshold() {
        return this.eyeBlockThreshold;
    }

    public final float getEyeCloseThreshold() {
        return this.eyeCloseThreshold;
    }

    public final float getEyeDistanceMaxRate() {
        return this.eyeDistanceMaxRate;
    }

    public final float getEyeDistanceMinRate() {
        return this.eyeDistanceMinRate;
    }

    public final float getFailedLogSampleRate() {
        return this.failedLogSampleRate;
    }

    public final boolean getFailedLogUploadOn() {
        return this.failedLogUploadOn;
    }

    public final float getFrontalFaceEulerXThreshold() {
        return this.frontalFaceEulerXThreshold;
    }

    public final float getFrontalFaceEulerYThreshold() {
        return this.frontalFaceEulerYThreshold;
    }

    public final float getFrontalFaceEulerZThreshold() {
        return this.frontalFaceEulerZThreshold;
    }

    public final float getLastLandmarkDiffThreshold() {
        return this.lastLandmarkDiffThreshold;
    }

    public final int getMaximumNotOneFaceTimes() {
        return this.maximumNotOneFaceTimes;
    }

    public final float getQcBlockThreshold() {
        return this.qcBlockThreshold;
    }

    public final float getQcBlurThreshold() {
        return this.qcBlurThreshold;
    }

    public final float getQcBrightThreshold() {
        return this.qcBrightThreshold;
    }

    public final float getQcDarkThreshold() {
        return this.qcDarkThreshold;
    }

    public final float getQcOkThreshold() {
        return this.qcOkThreshold;
    }

    public final float getSignificantFaceRate() {
        return this.significantFaceRate;
    }

    public final float getSilentASBrightRealThreshold() {
        return this.silentASBrightRealThreshold;
    }

    public final float getSilentASRealThreshold() {
        return this.silentASRealThreshold;
    }

    public final float getSilentASSpoofThreshold() {
        return this.silentASSpoofThreshold;
    }

    public final long getSkipFirstNMilliseconds() {
        return this.skipFirstNMilliseconds;
    }

    public final float getSuccessLogSampleRate() {
        return this.successLogSampleRate;
    }

    public final boolean getSuccessLogUploadOn() {
        return this.successLogUploadOn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int r02 = AbstractC2053a.a(this.qcDarkThreshold, AbstractC2053a.a(this.qcBrightThreshold, AbstractC2053a.a(this.qcBlockThreshold, AbstractC2053a.a(this.qcBlurThreshold, AbstractC2053a.a(this.qcOkThreshold, AbstractC4231b.a(this.auroraRestartDelayTime, AbstractC4230a.a(this.auroraMaxTrialTimes, AbstractC4231b.a(this.skipFirstNMilliseconds, AbstractC2053a.a(this.significantFaceRate, AbstractC4230a.a(this.maximumNotOneFaceTimes, Long.hashCode(this.displayedColorChangeTime) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        boolean r2 = this.successLogUploadOn;
        int r3 = 1;
        int r22 = r2;
        if (r2 == 0) goto L5;
        r22 = 1;
    L5:
        int r03 = AbstractC2053a.a(this.successLogSampleRate, (r02 + r22) * 31, 31);
        boolean r23 = this.failedLogUploadOn;
        int r24 = r23;
        if (r23 == 0) goto L8;
        r24 = 1;
    L8:
        int r04 = AbstractC2053a.a(this.frontalFaceEulerZThreshold, AbstractC2053a.a(this.frontalFaceEulerYThreshold, AbstractC2053a.a(this.frontalFaceEulerXThreshold, AbstractC2053a.a(this.lastLandmarkDiffThreshold, AbstractC2053a.a(this.eyeDistanceMaxRate, AbstractC2053a.a(this.eyeDistanceMinRate, AbstractC2053a.a(this.debugPNGRatio, AbstractC2053a.a(this.failedLogSampleRate, (r03 + r24) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
        boolean r25 = this.auroraRealtimeInference;
        if (r25 == true) goto L13;
        r3 = r25 ? 1 : 0;
    L13:
        return Float.hashCode(this.brightRejectThreshold) + AbstractC2053a.a(this.eyeBlockThreshold, AbstractC2053a.a(this.eyeCloseThreshold, AbstractC2053a.a(this.silentASBrightRealThreshold, AbstractC2053a.a(this.silentASSpoofThreshold, AbstractC2053a.a(this.silentASRealThreshold, AbstractC2053a.a(this.brightnessThreshold, AbstractC4230a.a(this.auroraColorNumberThreshold, AbstractC4230a.a(this.auroraLivenessNumberThreshold, AbstractC2053a.a(this.auroraLivenessSpoofThreshold, AbstractC2053a.a(this.auroraLivenessThreshold, (r04 + r3) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public String toString() {
        return "OjoSdkAuroraParameters(displayedColorChangeTime=" + this.displayedColorChangeTime + ", maximumNotOneFaceTimes=" + this.maximumNotOneFaceTimes + ", significantFaceRate=" + this.significantFaceRate + ", skipFirstNMilliseconds=" + this.skipFirstNMilliseconds + ", auroraMaxTrialTimes=" + this.auroraMaxTrialTimes + ", auroraRestartDelayTime=" + this.auroraRestartDelayTime + ", qcOkThreshold=" + this.qcOkThreshold + ", qcBlurThreshold=" + this.qcBlurThreshold + ", qcBlockThreshold=" + this.qcBlockThreshold + ", qcBrightThreshold=" + this.qcBrightThreshold + ", qcDarkThreshold=" + this.qcDarkThreshold + ", successLogUploadOn=" + this.successLogUploadOn + ", successLogSampleRate=" + this.successLogSampleRate + ", failedLogUploadOn=" + this.failedLogUploadOn + ", failedLogSampleRate=" + this.failedLogSampleRate + ", debugPNGRatio=" + this.debugPNGRatio + ", eyeDistanceMinRate=" + this.eyeDistanceMinRate + ", eyeDistanceMaxRate=" + this.eyeDistanceMaxRate + ", lastLandmarkDiffThreshold=" + this.lastLandmarkDiffThreshold + ", frontalFaceEulerXThreshold=" + this.frontalFaceEulerXThreshold + ", frontalFaceEulerYThreshold=" + this.frontalFaceEulerYThreshold + ", frontalFaceEulerZThreshold=" + this.frontalFaceEulerZThreshold + ", auroraRealtimeInference=" + this.auroraRealtimeInference + ", auroraLivenessThreshold=" + this.auroraLivenessThreshold + ", auroraLivenessSpoofThreshold=" + this.auroraLivenessSpoofThreshold + ", auroraLivenessNumberThreshold=" + this.auroraLivenessNumberThreshold + ", auroraColorNumberThreshold=" + this.auroraColorNumberThreshold + ", brightnessThreshold=" + this.brightnessThreshold + ", silentASRealThreshold=" + this.silentASRealThreshold + ", silentASSpoofThreshold=" + this.silentASSpoofThreshold + ", silentASBrightRealThreshold=" + this.silentASBrightRealThreshold + ", eyeCloseThreshold=" + this.eyeCloseThreshold + ", eyeBlockThreshold=" + this.eyeBlockThreshold + ", brightRejectThreshold=" + this.brightRejectThreshold + ")";
    }

    public OjoSdkAuroraParameters(long r1, int r3, float r4, long r5, int r7, long r8, float r10, float r11, float r12, float r13, float r14, boolean r15, float r16, boolean r17, float r18, float r19, float r20, float r21, float r22, float r23, float r24, float r25, boolean r26, float r27, float r28, int r29, int r30, float r31, float r32, float r33, float r34, float r35, float r36, float r37) {
        this.displayedColorChangeTime = r1;
        this.maximumNotOneFaceTimes = r3;
        this.significantFaceRate = r4;
        this.skipFirstNMilliseconds = r5;
        this.auroraMaxTrialTimes = r7;
        this.auroraRestartDelayTime = r8;
        this.qcOkThreshold = r10;
        this.qcBlurThreshold = r11;
        this.qcBlockThreshold = r12;
        this.qcBrightThreshold = r13;
        this.qcDarkThreshold = r14;
        this.successLogUploadOn = r15;
        this.successLogSampleRate = r16;
        this.failedLogUploadOn = r17;
        this.failedLogSampleRate = r18;
        this.debugPNGRatio = r19;
        this.eyeDistanceMinRate = r20;
        this.eyeDistanceMaxRate = r21;
        this.lastLandmarkDiffThreshold = r22;
        this.frontalFaceEulerXThreshold = r23;
        this.frontalFaceEulerYThreshold = r24;
        this.frontalFaceEulerZThreshold = r25;
        this.auroraRealtimeInference = r26;
        this.auroraLivenessThreshold = r27;
        this.auroraLivenessSpoofThreshold = r28;
        this.auroraLivenessNumberThreshold = r29;
        this.auroraColorNumberThreshold = r30;
        this.brightnessThreshold = r31;
        this.silentASRealThreshold = r32;
        this.silentASSpoofThreshold = r33;
        this.silentASBrightRealThreshold = r34;
        this.eyeCloseThreshold = r35;
        this.eyeBlockThreshold = r36;
        this.brightRejectThreshold = r37;
    }

    public /* synthetic */ OjoSdkAuroraParameters(long r35, int r37, float r38, long r39, int r41, long r42, float r44, float r45, float r46, float r47, float r48, boolean r49, float r50, boolean r51, float r52, float r53, float r54, float r55, float r56, float r57, float r58, float r59, boolean r60, float r61, float r62, int r63, int r64, float r65, float r66, float r67, float r68, float r69, float r70, float r71, int r72, int r73, i r74) {
        long r2 = 0;
        if ((r72 & 1) == 0) goto L5;
        long r4 = 0;
    L7:
        if ((r72 & 2) == 0) goto L9;
        int r1 = 0;
    L11:
        if ((r72 & 4) == 0) goto L13;
        float r7 = 0.0f;
    L15:
        if ((r72 & 8) == 0) goto L17;
        long r9 = 0;
    L19:
        if ((r72 & 16) == 0) goto L21;
        int r11 = 0;
    L23:
        if ((r72 & 32) != 0) goto L27;
        r2 = r42;
    L27:
        if ((r72 & 64) == 0) goto L29;
        float r12 = 0.0f;
    L31:
        if ((r72 & 128) == 0) goto L33;
        float r13 = 0.0f;
    L35:
        if ((r72 & 256) == 0) goto L37;
        float r14 = 0.0f;
    L39:
        if ((r72 & 512) == 0) goto L41;
        float r15 = 0.0f;
    L43:
        if ((r72 & 1024) == 0) goto L45;
        float r6 = 0.0f;
    L47:
        if ((r72 & 2048) == 0) goto L49;
        boolean r8 = false;
    L50:
        int r372 = r1;
        if ((r72 & 4096) == 0) goto L53;
        float r16 = 0.0f;
    L54:
        float r382 = r16;
        if ((r72 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        boolean r17 = false;
    L58:
        boolean r392 = r17;
        if ((r72 & 16384) == 0) goto L61;
        float r18 = 0.0f;
    L63:
        if ((r72 & 32768) == 0) goto L65;
        float r162 = 0.0f;
    L67:
        if ((r72 & 65536) == 0) goto L69;
        float r172 = 0.0f;
    L71:
        if ((r72 & 131072) == 0) goto L73;
        float r182 = 0.0f;
    L75:
        if ((r72 & 262144) == 0) goto L77;
        float r19 = 0.0f;
    L79:
        if ((r72 & 524288) == 0) goto L81;
        float r20 = 0.0f;
    L83:
        if ((r72 & 1048576) == 0) goto L85;
        float r21 = 0.0f;
    L87:
        if ((r72 & 2097152) == 0) goto L89;
        float r22 = 0.0f;
    L91:
        if ((r72 & 4194304) == 0) goto L93;
        boolean r23 = false;
    L95:
        if ((r72 & 8388608) == 0) goto L97;
        float r24 = 0.0f;
    L99:
        if ((r72 & 16777216) == 0) goto L101;
        float r25 = 0.0f;
    L103:
        if ((r72 & 33554432) == 0) goto L105;
        int r26 = 0;
    L107:
        if ((r72 & 67108864) == 0) goto L109;
        int r27 = 0;
    L111:
        if ((r72 & 134217728) == 0) goto L113;
        float r28 = 0.0f;
    L115:
        if ((r72 & 268435456) == 0) goto L117;
        float r29 = 0.0f;
    L119:
        if ((r72 & 536870912) == 0) goto L121;
        float r30 = 0.0f;
    L123:
        if ((r72 & Ints.MAX_POWER_OF_TWO) == 0) goto L125;
        float r31 = 0.0f;
    L127:
        if ((r72 & Integer.MIN_VALUE) == 0) goto L129;
        float r02 = 0.0f;
    L131:
        if ((r73 & 1) == 0) goto L133;
        float r32 = 0.0f;
    L135:
        if ((r73 & 2) == 0) goto L138;
        float r722 = 2.0f;
    L139:
        this(r4, r372, r7, r9, r11, r2, r12, r13, r14, r15, r6, r8, r382, r392, r18, r162, r172, r182, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r02, r32, r722);
        return;
    L138:
        r722 = r71;
        goto L139
    L133:
        r32 = r70;
        goto L135
    L129:
        r02 = r69;
        goto L131
    L125:
        r31 = r68;
        goto L127
    L121:
        r30 = r67;
        goto L123
    L117:
        r29 = r66;
        goto L119
    L113:
        r28 = r65;
        goto L115
    L109:
        r27 = r64;
        goto L111
    L105:
        r26 = r63;
        goto L107
    L101:
        r25 = r62;
        goto L103
    L97:
        r24 = r61;
        goto L99
    L93:
        r23 = r60;
        goto L95
    L89:
        r22 = r59;
        goto L91
    L85:
        r21 = r58;
        goto L87
    L81:
        r20 = r57;
        goto L83
    L77:
        r19 = r56;
        goto L79
    L73:
        r182 = r55;
        goto L75
    L69:
        r172 = r54;
        goto L71
    L65:
        r162 = r53;
        goto L67
    L61:
        r18 = r52;
        goto L63
    L57:
        r17 = r51;
        goto L58
    L53:
        r16 = r50;
        goto L54
    L49:
        r8 = r49;
        goto L50
    L45:
        r6 = r48;
        goto L47
    L41:
        r15 = r47;
        goto L43
    L37:
        r14 = r46;
        goto L39
    L33:
        r13 = r45;
        goto L35
    L29:
        r12 = r44;
        goto L31
    L21:
        r11 = r41;
        goto L23
    L17:
        r9 = r39;
        goto L19
    L13:
        r7 = r38;
        goto L15
    L9:
        r1 = r37;
        goto L11
    L5:
        r4 = r35;
        goto L7
    }
}

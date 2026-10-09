package com.iab.digitalidentity.sdk.core.model;

import a0.AbstractC2053a;
import b.AbstractC4230a;
import com.clevertap.android.sdk.Constants;
import com.google.common.primitives.Ints;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\bi\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 t2\u00020\u0001:\u0001tBÙ\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0005\u0012\b\b\u0002\u0010 \u001a\u00020\u0005\u0012\b\b\u0002\u0010!\u001a\u00020\u0005\u0012\b\b\u0002\u0010\"\u001a\u00020\u0005\u0012\b\b\u0002\u0010#\u001a\u00020\u0003\u0012\b\b\u0002\u0010$\u001a\u00020\u0003\u0012\b\b\u0002\u0010%\u001a\u00020\u0003¢\u0006\u0002\u0010&J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0005HÆ\u0003J\t\u0010M\u001a\u00020\u0005HÆ\u0003J\t\u0010N\u001a\u00020\u0005HÆ\u0003J\t\u0010O\u001a\u00020\u0005HÆ\u0003J\t\u0010P\u001a\u00020\u0005HÆ\u0003J\t\u0010Q\u001a\u00020\u0005HÆ\u0003J\t\u0010R\u001a\u00020\u0005HÆ\u0003J\t\u0010S\u001a\u00020\u0005HÆ\u0003J\t\u0010T\u001a\u00020\u0005HÆ\u0003J\t\u0010U\u001a\u00020\u0005HÆ\u0003J\t\u0010V\u001a\u00020\u0005HÆ\u0003J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\t\u0010X\u001a\u00020\u0005HÆ\u0003J\t\u0010Y\u001a\u00020\u0005HÆ\u0003J\t\u0010Z\u001a\u00020\u0005HÆ\u0003J\t\u0010[\u001a\u00020\u0005HÆ\u0003J\t\u0010\\\u001a\u00020\u0005HÆ\u0003J\t\u0010]\u001a\u00020\u0005HÆ\u0003J\t\u0010^\u001a\u00020\u0003HÆ\u0003J\t\u0010_\u001a\u00020\u0005HÆ\u0003J\t\u0010`\u001a\u00020\u0005HÆ\u0003J\t\u0010a\u001a\u00020\u0005HÆ\u0003J\t\u0010b\u001a\u00020\u0005HÆ\u0003J\t\u0010c\u001a\u00020\u0005HÆ\u0003J\t\u0010d\u001a\u00020\u0003HÆ\u0003J\t\u0010e\u001a\u00020\u0003HÆ\u0003J\t\u0010f\u001a\u00020\u0003HÆ\u0003J\t\u0010g\u001a\u00020\u0005HÆ\u0003J\t\u0010h\u001a\u00020\u0005HÆ\u0003J\t\u0010i\u001a\u00020\u0005HÆ\u0003J\t\u0010j\u001a\u00020\u0005HÆ\u0003J\t\u0010k\u001a\u00020\u0005HÆ\u0003J\t\u0010l\u001a\u00020\u0005HÆ\u0003JÝ\u0002\u0010m\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00052\b\b\u0002\u0010 \u001a\u00020\u00052\b\b\u0002\u0010!\u001a\u00020\u00052\b\b\u0002\u0010\"\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020\u0003HÆ\u0001J\u0013\u0010n\u001a\u00020o2\b\u0010p\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010q\u001a\u00020\u0003HÖ\u0001J\t\u0010r\u001a\u00020sHÖ\u0001R\u0016\u0010\u001f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0016\u0010 \u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010(R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010(R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010(R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010(R\u0016\u0010\u0013\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010(R\u0016\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010(R\u0016\u0010!\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010(R\u0016\u0010\"\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010(R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010(R\u0016\u0010%\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010+R\u0016\u0010\u0014\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010(R\u0016\u0010\u001d\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010(R\u0016\u0010\u001c\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010(R\u0016\u0010\u0017\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010+R\u0016\u0010\u0019\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010(R\u0016\u0010\u0018\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010(R\u0016\u0010\u0015\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010(R\u0016\u0010\u0016\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010(R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010(R\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010(R\u0016\u0010\u001b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010(R\u0016\u0010\u001a\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010(R\u0016\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010(R\u0016\u0010\u001e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010+R\u0016\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010(R\u0016\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010(R\u0016\u0010#\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010+R\u0016\u0010\u0012\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010(R\u0016\u0010\u0011\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010(R\u0016\u0010$\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010+R\u0016\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010(¨\u0006u"}, d2 = {"Lcom/iab/digitalidentity/sdk/core/model/OjoSdkParameters;", "", "alpha", "", "alphaMin", "", "alphaMax", "alphaMaxZoom", "alphaMaxBacklight", "faceThreshold", "blurWeight", "highlightWeight", "lowlightWeight", "backlightWeight", "zoomWeight", "rollWeight", "pitchWeight", "yawWeight", "translationWeight", "aspectRatioWeight", "cropMargin", "dvnThresh", "emwaStart", "decay", "decayMin", "decayMax", "ktpAspectRatioLow", "ktpAspectRatioHigh", "damagedWeight", "damagedThresh", "maxBestFrameScore", "acceptableThreshold", "acceptableWeight", "blockThreshold", "blockWeight", "statusMessageTime", "zoomBuffer", "captureWindow", "(IFFFFFFFFFFFFFFFFFFIFFFFFFIFFFFIII)V", "getAcceptableThreshold", "()F", "getAcceptableWeight", "getAlpha", "()I", "getAlphaMax", "getAlphaMaxBacklight", "getAlphaMaxZoom", "getAlphaMin", "getAspectRatioWeight", "getBacklightWeight", "getBlockThreshold", "getBlockWeight", "getBlurWeight", "getCaptureWindow", "getCropMargin", "getDamagedThresh", "getDamagedWeight", "getDecay", "getDecayMax", "getDecayMin", "getDvnThresh", "getEmwaStart", "getFaceThreshold", "getHighlightWeight", "getKtpAspectRatioHigh", "getKtpAspectRatioLow", "getLowlightWeight", "getMaxBestFrameScore", "getPitchWeight", "getRollWeight", "getStatusMessageTime", "getTranslationWeight", "getYawWeight", "getZoomBuffer", "getZoomWeight", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component4", "component5", "component6", "component7", "component8", "component9", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "", "Companion", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OjoSdkParameters {
    public static final Companion Companion = null;
    private static final float DEFAULT_KTP_ACCEPTABLE_THRESHOLD = 0.4f;
    private static final float DEFAULT_KTP_ACCEPTABLE_WEIGHT = 1.0f;
    private static final int DEFAULT_KTP_ALPHA = 30;
    private static final float DEFAULT_KTP_ALPHA_MAX = 0.94f;
    private static final float DEFAULT_KTP_ALPHA_MAX_BACKLIGHT = 0.8f;
    private static final float DEFAULT_KTP_ALPHA_MAX_ZOOM = 0.9f;
    private static final float DEFAULT_KTP_ALPHA_MIN = 0.8f;
    private static final float DEFAULT_KTP_ASPECT_RATIO_HIGH = 0.71f;
    private static final float DEFAULT_KTP_ASPECT_RATIO_LOW = 0.45f;
    private static final float DEFAULT_KTP_ASPECT_RATIO_WEIGHT = 0.1f;
    public static final float DEFAULT_KTP_BACKLIGHT_THRESHOLD = 0.0f;
    private static final float DEFAULT_KTP_BACKLIGHT_WEIGHT = 0.0f;
    private static final float DEFAULT_KTP_BLOCK_THRESHOLD = 0.37f;
    private static final float DEFAULT_KTP_BLOCK_WEIGHT = 0.0f;
    public static final float DEFAULT_KTP_BLUR_THRESHOLD = 0.46f;
    private static final float DEFAULT_KTP_BLUR_WEIGHT = 0.0f;
    private static final int DEFAULT_KTP_CAPTURE_WINDOW = 1000;
    private static final float DEFAULT_KTP_CROP_MARGIN = 0.15f;
    private static final float DEFAULT_KTP_DAMAGED_THRESHOLD = 1.0f;
    private static final float DEFAULT_KTP_DAMAGED_WEIGHT = 0.0f;
    private static final int DEFAULT_KTP_DECAY = 30;
    private static final float DEFAULT_KTP_DECAY_MAX = 0.02f;
    private static final float DEFAULT_KTP_DECAY_MIN = 0.0f;
    private static final float DEFAULT_KTP_DVN_THRESH = 0.4f;
    private static final float DEFAULT_KTP_EMWA_START = 1.0f;
    private static final float DEFAULT_KTP_FACE_THRESHOLD = 0.6f;
    public static final float DEFAULT_KTP_HIGHLIGHT_THRESHOLD = 0.5f;
    private static final float DEFAULT_KTP_HIGHLIGHT_WEIGHT = 0.0f;
    public static final float DEFAULT_KTP_LOWLIGHT_THRESHOLD = 0.46f;
    private static final float DEFAULT_KTP_LOWLIGHT_WEIGHT = 0.0f;
    private static final int DEFAULT_KTP_MAX_BEST_FRAME_SCORE = 25;
    private static final float DEFAULT_KTP_PITCH_WEIGHT = 0.1f;
    private static final float DEFAULT_KTP_ROLL_WEIGHT = 0.1f;
    private static final int DEFAULT_KTP_STATUS_MESSAGE_TIME = 1000;
    private static final float DEFAULT_KTP_TRANSLATION_WEIGHT = 0.1f;
    private static final float DEFAULT_KTP_YAW_WEIGHT = 0.1f;
    private static final int DEFAULT_KTP_ZOOM_BUFFER = 2;
    public static final float DEFAULT_KTP_ZOOM_HIGH = 150.0f;
    public static final float DEFAULT_KTP_ZOOM_LOW = 103.0f;
    private static final float DEFAULT_KTP_ZOOM_WEIGHT = 0.1f;
    public static final int DEFAULT_MANUAL_CAPTURE_BESTFRAME = -1;
    public static final int DEFAULT_MANUAL_CAPTURE_TIMEOUT = 999999;
    public static final int DEFAULT_MANUAL_CAPTURE_WINDOW = 999999;
    private static final int DEFAULT_SELFIE_ALPHA = 30;
    private static final float DEFAULT_SELFIE_ALPHA_MAX = 0.94f;
    private static final float DEFAULT_SELFIE_ALPHA_MAX_BACKLIGHT = 0.8f;
    private static final float DEFAULT_SELFIE_ALPHA_MAX_ZOOM = 0.9f;
    private static final float DEFAULT_SELFIE_ALPHA_MIN = 0.8f;
    public static final float DEFAULT_SELFIE_BACKLIGHT_THRESHOLD = 100.0f;
    private static final float DEFAULT_SELFIE_BACKLIGHT_WEIGHT = 0.0f;
    public static final float DEFAULT_SELFIE_BLUR_THRESHOLD = 30.0f;
    private static final float DEFAULT_SELFIE_BLUR_WEIGHT = 0.5f;
    private static final int DEFAULT_SELFIE_DECAY = 30;
    private static final float DEFAULT_SELFIE_DECAY_MAX = 0.02f;
    private static final float DEFAULT_SELFIE_DECAY_MIN = 0.0f;
    private static final float DEFAULT_SELFIE_EMWA_START = 100.0f;
    private static final float DEFAULT_SELFIE_FACE_THRESHOLD = 0.6f;
    public static final float DEFAULT_SELFIE_HIGHLIGHT_THRESHOLD = 80.0f;
    private static final float DEFAULT_SELFIE_HIGHLIGHT_WEIGHT = 0.18f;
    public static final float DEFAULT_SELFIE_LOWLIGHT_THRESHOLD = 80.0f;
    private static final float DEFAULT_SELFIE_LOWLIGHT_WEIGHT = 0.18f;
    public static final int DEFAULT_SELFIE_MIN_BLINKS = 0;
    private static final float DEFAULT_SELFIE_PITCH_WEIGHT = 0.2f;
    private static final float DEFAULT_SELFIE_ROLL_WEIGHT = 0.2f;
    private static final float DEFAULT_SELFIE_TRANSLATION_WEIGHT = 0.09f;
    private static final float DEFAULT_SELFIE_YAW_WEIGHT = 0.05f;
    public static final float DEFAULT_SELFIE_ZOOM_HIGH = 65.0f;
    public static final float DEFAULT_SELFIE_ZOOM_LOW = 40.0f;
    private static final float DEFAULT_SELFIE_ZOOM_WEIGHT = 0.2f;

    @SerializedName("acceptable_thresh")
    private final float acceptableThreshold;

    @SerializedName("acceptable_weight")
    private final float acceptableWeight;

    @SerializedName("alpha")
    private final int alpha;

    @SerializedName("alpha_max")
    private final float alphaMax;

    @SerializedName("alpha_max_backlight")
    private final float alphaMaxBacklight;

    @SerializedName("alpha_max_zoom")
    private final float alphaMaxZoom;

    @SerializedName("alpha_min")
    private final float alphaMin;

    @SerializedName("aspect_ratio_weight")
    private final float aspectRatioWeight;

    @SerializedName("backlight_weight")
    private final float backlightWeight;

    @SerializedName("block_thresh")
    private final float blockThreshold;

    @SerializedName("block_weight")
    private final float blockWeight;

    @SerializedName("blur_weight")
    private final float blurWeight;

    @SerializedName("capture_window")
    private final int captureWindow;

    @SerializedName("crop_margin")
    private final float cropMargin;

    @SerializedName("damaged_thresh")
    private final float damagedThresh;

    @SerializedName("damaged_weight")
    private final float damagedWeight;

    @SerializedName("decay")
    private final int decay;

    @SerializedName("decay_max")
    private final float decayMax;

    @SerializedName("decay_min")
    private final float decayMin;

    @SerializedName("dvn_thresh")
    private final float dvnThresh;

    @SerializedName("emwa_start")
    private final float emwaStart;

    @SerializedName("face_threshold")
    private final float faceThreshold;

    @SerializedName("highlight_weight")
    private final float highlightWeight;

    @SerializedName("ktp_aspect_ratio_high")
    private final float ktpAspectRatioHigh;

    @SerializedName("ktp_aspect_ratio_low")
    private final float ktpAspectRatioLow;

    @SerializedName("lowlight_weight")
    private final float lowlightWeight;

    @SerializedName("max_best_frame_score")
    private final int maxBestFrameScore;

    @SerializedName("pitch_weight")
    private final float pitchWeight;

    @SerializedName("roll_weight")
    private final float rollWeight;

    @SerializedName("status_message_time")
    private final int statusMessageTime;

    @SerializedName("translation_weight")
    private final float translationWeight;

    @SerializedName("yaw_weight")
    private final float yawWeight;

    @SerializedName("zoom_buffer")
    private final int zoomBuffer;

    @SerializedName("zoom_weight")
    private final float zoomWeight;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\bC\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010J\u001a\u00020KJ\u0006\u0010L\u001a\u00020KR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006M"}, d2 = {"Lcom/iab/digitalidentity/sdk/core/model/OjoSdkParameters$Companion;", "", "()V", "DEFAULT_KTP_ACCEPTABLE_THRESHOLD", "", "DEFAULT_KTP_ACCEPTABLE_WEIGHT", "DEFAULT_KTP_ALPHA", "", "DEFAULT_KTP_ALPHA_MAX", "DEFAULT_KTP_ALPHA_MAX_BACKLIGHT", "DEFAULT_KTP_ALPHA_MAX_ZOOM", "DEFAULT_KTP_ALPHA_MIN", "DEFAULT_KTP_ASPECT_RATIO_HIGH", "DEFAULT_KTP_ASPECT_RATIO_LOW", "DEFAULT_KTP_ASPECT_RATIO_WEIGHT", "DEFAULT_KTP_BACKLIGHT_THRESHOLD", "DEFAULT_KTP_BACKLIGHT_WEIGHT", "DEFAULT_KTP_BLOCK_THRESHOLD", "DEFAULT_KTP_BLOCK_WEIGHT", "DEFAULT_KTP_BLUR_THRESHOLD", "DEFAULT_KTP_BLUR_WEIGHT", "DEFAULT_KTP_CAPTURE_WINDOW", "DEFAULT_KTP_CROP_MARGIN", "DEFAULT_KTP_DAMAGED_THRESHOLD", "DEFAULT_KTP_DAMAGED_WEIGHT", "DEFAULT_KTP_DECAY", "DEFAULT_KTP_DECAY_MAX", "DEFAULT_KTP_DECAY_MIN", "DEFAULT_KTP_DVN_THRESH", "DEFAULT_KTP_EMWA_START", "DEFAULT_KTP_FACE_THRESHOLD", "DEFAULT_KTP_HIGHLIGHT_THRESHOLD", "DEFAULT_KTP_HIGHLIGHT_WEIGHT", "DEFAULT_KTP_LOWLIGHT_THRESHOLD", "DEFAULT_KTP_LOWLIGHT_WEIGHT", "DEFAULT_KTP_MAX_BEST_FRAME_SCORE", "DEFAULT_KTP_PITCH_WEIGHT", "DEFAULT_KTP_ROLL_WEIGHT", "DEFAULT_KTP_STATUS_MESSAGE_TIME", "DEFAULT_KTP_TRANSLATION_WEIGHT", "DEFAULT_KTP_YAW_WEIGHT", "DEFAULT_KTP_ZOOM_BUFFER", "DEFAULT_KTP_ZOOM_HIGH", "DEFAULT_KTP_ZOOM_LOW", "DEFAULT_KTP_ZOOM_WEIGHT", "DEFAULT_MANUAL_CAPTURE_BESTFRAME", "DEFAULT_MANUAL_CAPTURE_TIMEOUT", "DEFAULT_MANUAL_CAPTURE_WINDOW", "DEFAULT_SELFIE_ALPHA", "DEFAULT_SELFIE_ALPHA_MAX", "DEFAULT_SELFIE_ALPHA_MAX_BACKLIGHT", "DEFAULT_SELFIE_ALPHA_MAX_ZOOM", "DEFAULT_SELFIE_ALPHA_MIN", "DEFAULT_SELFIE_BACKLIGHT_THRESHOLD", "DEFAULT_SELFIE_BACKLIGHT_WEIGHT", "DEFAULT_SELFIE_BLUR_THRESHOLD", "DEFAULT_SELFIE_BLUR_WEIGHT", "DEFAULT_SELFIE_DECAY", "DEFAULT_SELFIE_DECAY_MAX", "DEFAULT_SELFIE_DECAY_MIN", "DEFAULT_SELFIE_EMWA_START", "DEFAULT_SELFIE_FACE_THRESHOLD", "DEFAULT_SELFIE_HIGHLIGHT_THRESHOLD", "DEFAULT_SELFIE_HIGHLIGHT_WEIGHT", "DEFAULT_SELFIE_LOWLIGHT_THRESHOLD", "DEFAULT_SELFIE_LOWLIGHT_WEIGHT", "DEFAULT_SELFIE_MIN_BLINKS", "DEFAULT_SELFIE_PITCH_WEIGHT", "DEFAULT_SELFIE_ROLL_WEIGHT", "DEFAULT_SELFIE_TRANSLATION_WEIGHT", "DEFAULT_SELFIE_YAW_WEIGHT", "DEFAULT_SELFIE_ZOOM_HIGH", "DEFAULT_SELFIE_ZOOM_LOW", "DEFAULT_SELFIE_ZOOM_WEIGHT", "getDefaultKtpParameters", "Lcom/iab/digitalidentity/sdk/core/model/OjoSdkParameters;", "getDefaultSelfieParameters", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(i r1) {
            this();
        }

        public final OjoSdkParameters getDefaultKtpParameters() {
            return new OjoSdkParameters(30, 0.8f, 0.94f, 0.9f, 0.8f, 0.6f, 0.0f, 0.0f, 0.0f, 0.0f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, OjoSdkParameters.DEFAULT_KTP_CROP_MARGIN, 0.4f, 1.0f, 30, 0.0f, 0.02f, OjoSdkParameters.DEFAULT_KTP_ASPECT_RATIO_LOW, OjoSdkParameters.DEFAULT_KTP_ASPECT_RATIO_HIGH, 0.0f, 1.0f, 25, 0.4f, 1.0f, OjoSdkParameters.DEFAULT_KTP_BLOCK_THRESHOLD, 0.0f, 1000, 2, 1000);
        }

        public final OjoSdkParameters getDefaultSelfieParameters() {
            int r1 = 30;
            float r2 = 0.8f;
            float r3 = 0.94f;
            float r4 = 0.9f;
            float r5 = 0.8f;
            float r6 = 0.6f;
            float r7 = 0.5f;
            float r8 = 0.18f;
            float r9 = 0.18f;
            float r10 = 0.0f;
            float r11 = 0.2f;
            float r12 = 0.2f;
            float r13 = 0.2f;
            float r14 = OjoSdkParameters.DEFAULT_SELFIE_YAW_WEIGHT;
            float r15 = OjoSdkParameters.DEFAULT_SELFIE_TRANSLATION_WEIGHT;
            float r16 = 0.0f;
            float r17 = 0.0f;
            float r18 = 0.0f;
            float r19 = 100.0f;
            int r20 = 30;
            float r21 = 0.0f;
            float r22 = 0.02f;
            float r23 = 0.0f;
            float r24 = 0.0f;
            float r25 = 0.0f;
            float r26 = 0.0f;
            int r27 = 0;
            float r28 = 0.0f;
            float r29 = 0.0f;
            float r30 = 0.0f;
            float r31 = 0.0f;
            int r32 = 0;
            int r33 = 0;
            int r34 = 0;
            int r35 = -3964928;
            return new OjoSdkParameters(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, 3, null);
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public OjoSdkParameters() {
        int r1 = 0;
        float r2 = 0.0f;
        float r3 = 0.0f;
        float r4 = 0.0f;
        float r5 = 0.0f;
        float r6 = 0.0f;
        float r7 = 0.0f;
        float r8 = 0.0f;
        float r9 = 0.0f;
        float r10 = 0.0f;
        float r11 = 0.0f;
        float r12 = 0.0f;
        float r13 = 0.0f;
        float r14 = 0.0f;
        float r15 = 0.0f;
        float r16 = 0.0f;
        float r17 = 0.0f;
        float r18 = 0.0f;
        float r19 = 0.0f;
        int r20 = 0;
        float r21 = 0.0f;
        float r22 = 0.0f;
        float r23 = 0.0f;
        float r24 = 0.0f;
        float r25 = 0.0f;
        float r26 = 0.0f;
        int r27 = 0;
        float r28 = 0.0f;
        float r29 = 0.0f;
        float r30 = 0.0f;
        float r31 = 0.0f;
        int r32 = 0;
        int r33 = 0;
        int r34 = 0;
        int r35 = -1;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, 3, null);
    }

    public static /* synthetic */ OjoSdkParameters copy$default(OjoSdkParameters r17, int r18, float r19, float r20, float r21, float r22, float r23, float r24, float r25, float r26, float r27, float r28, float r29, float r30, float r31, float r32, float r33, float r34, float r35, float r36, int r37, float r38, float r39, float r40, float r41, float r42, float r43, int r44, float r45, float r46, float r47, float r48, int r49, int r50, int r51, int r52, int r53, Object r54) {
        if ((r52 & 1) == 0) goto L5;
        int r2 = r17.alpha;
    L7:
        if ((r52 & 2) == 0) goto L9;
        float r3 = r17.alphaMin;
    L11:
        if ((r52 & 4) == 0) goto L13;
        float r4 = r17.alphaMax;
    L15:
        if ((r52 & 8) == 0) goto L17;
        float r5 = r17.alphaMaxZoom;
    L19:
        if ((r52 & 16) == 0) goto L21;
        float r6 = r17.alphaMaxBacklight;
    L23:
        if ((r52 & 32) == 0) goto L25;
        float r7 = r17.faceThreshold;
    L27:
        if ((r52 & 64) == 0) goto L29;
        float r8 = r17.blurWeight;
    L31:
        if ((r52 & 128) == 0) goto L33;
        float r9 = r17.highlightWeight;
    L35:
        if ((r52 & 256) == 0) goto L37;
        float r10 = r17.lowlightWeight;
    L39:
        if ((r52 & 512) == 0) goto L41;
        float r11 = r17.backlightWeight;
    L43:
        if ((r52 & 1024) == 0) goto L45;
        float r12 = r17.zoomWeight;
    L47:
        if ((r52 & 2048) == 0) goto L49;
        float r13 = r17.rollWeight;
    L51:
        if ((r52 & 4096) == 0) goto L53;
        float r14 = r17.pitchWeight;
    L55:
        if ((r52 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        float r15 = r17.yawWeight;
    L58:
        int r182 = r2;
        if ((r52 & 16384) == 0) goto L61;
        float r210 = r17.translationWeight;
    L63:
        if ((r52 & 32768) == 0) goto L65;
        float r1 = r17.aspectRatioWeight;
    L66:
        float r192 = r1;
        if ((r52 & 65536) == 0) goto L69;
        float r16 = r17.cropMargin;
    L70:
        float r202 = r16;
        if ((r52 & 131072) == 0) goto L73;
        float r110 = r17.dvnThresh;
    L74:
        float r212 = r110;
        if ((r52 & 262144) == 0) goto L77;
        float r111 = r17.emwaStart;
    L78:
        float r222 = r111;
        if ((r52 & 524288) == 0) goto L81;
        int r112 = r17.decay;
    L82:
        int r232 = r112;
        if ((r52 & 1048576) == 0) goto L85;
        float r113 = r17.decayMin;
    L86:
        float r242 = r113;
        if ((r52 & 2097152) == 0) goto L89;
        float r114 = r17.decayMax;
    L90:
        float r252 = r114;
        if ((r52 & 4194304) == 0) goto L93;
        float r115 = r17.ktpAspectRatioLow;
    L94:
        float r262 = r115;
        if ((r52 & 8388608) == 0) goto L97;
        float r116 = r17.ktpAspectRatioHigh;
    L98:
        float r272 = r116;
        if ((r52 & 16777216) == 0) goto L101;
        float r117 = r17.damagedWeight;
    L102:
        float r282 = r117;
        if ((r52 & 33554432) == 0) goto L105;
        float r118 = r17.damagedThresh;
    L106:
        float r292 = r118;
        if ((r52 & 67108864) == 0) goto L109;
        int r119 = r17.maxBestFrameScore;
    L110:
        int r302 = r119;
        if ((r52 & 134217728) == 0) goto L113;
        float r120 = r17.acceptableThreshold;
    L114:
        float r312 = r120;
        if ((r52 & 268435456) == 0) goto L117;
        float r121 = r17.acceptableWeight;
    L118:
        float r322 = r121;
        if ((r52 & 536870912) == 0) goto L121;
        float r122 = r17.blockThreshold;
    L122:
        float r332 = r122;
        if ((r52 & Ints.MAX_POWER_OF_TWO) == 0) goto L125;
        float r123 = r17.blockWeight;
    L126:
        float r342 = r123;
        if ((r52 & Integer.MIN_VALUE) == 0) goto L129;
        int r124 = r17.statusMessageTime;
    L130:
        int r352 = r124;
        if ((r53 & 1) == 0) goto L133;
        int r125 = r17.zoomBuffer;
    L135:
        if ((r53 & 2) == 0) goto L138;
        int r362 = r125;
        int r512 = r362;
        int r522 = r17.captureWindow;
        float r372 = r222;
        int r382 = r232;
        float r392 = r242;
        float r402 = r252;
        float r412 = r262;
        float r422 = r272;
        float r432 = r282;
        float r442 = r292;
        int r452 = r302;
        float r462 = r312;
        float r472 = r322;
        float r482 = r332;
        float r492 = r342;
        int r502 = r352;
        float r333 = r210;
        float r223 = r5;
        float r233 = r6;
        float r243 = r7;
        float r253 = r8;
        float r263 = r9;
        float r273 = r10;
        float r283 = r11;
        float r293 = r12;
        float r303 = r13;
        float r313 = r14;
        float r323 = r15;
        float r343 = r192;
        float r353 = r202;
        float r363 = r212;
        float r203 = r3;
        float r213 = r4;
    L140:
        return r17.copy(r182, r203, r213, r223, r233, r243, r253, r263, r273, r283, r293, r303, r313, r323, r333, r343, r353, r363, r372, r382, r392, r402, r412, r422, r432, r442, r452, r462, r472, r482, r492, r502, r512, r522);
    L138:
        r522 = r51;
        r512 = r125;
        r363 = r212;
        r372 = r222;
        r382 = r232;
        r392 = r242;
        r402 = r252;
        r412 = r262;
        r422 = r272;
        r432 = r282;
        r442 = r292;
        r452 = r302;
        r462 = r312;
        r472 = r322;
        r482 = r332;
        r492 = r342;
        r502 = r352;
        r333 = r210;
        r213 = r4;
        r223 = r5;
        r233 = r6;
        r243 = r7;
        r253 = r8;
        r263 = r9;
        r273 = r10;
        r283 = r11;
        r293 = r12;
        r303 = r13;
        r313 = r14;
        r323 = r15;
        r343 = r192;
        r353 = r202;
        r203 = r3;
        goto L140
    L133:
        r125 = r50;
        goto L135
    L129:
        r124 = r49;
        goto L130
    L125:
        r123 = r48;
        goto L126
    L121:
        r122 = r47;
        goto L122
    L117:
        r121 = r46;
        goto L118
    L113:
        r120 = r45;
        goto L114
    L109:
        r119 = r44;
        goto L110
    L105:
        r118 = r43;
        goto L106
    L101:
        r117 = r42;
        goto L102
    L97:
        r116 = r41;
        goto L98
    L93:
        r115 = r40;
        goto L94
    L89:
        r114 = r39;
        goto L90
    L85:
        r113 = r38;
        goto L86
    L81:
        r112 = r37;
        goto L82
    L77:
        r111 = r36;
        goto L78
    L73:
        r110 = r35;
        goto L74
    L69:
        r16 = r34;
        goto L70
    L65:
        r1 = r33;
        goto L66
    L61:
        r210 = r32;
        goto L63
    L57:
        r15 = r31;
        goto L58
    L53:
        r14 = r30;
        goto L55
    L49:
        r13 = r29;
        goto L51
    L45:
        r12 = r28;
        goto L47
    L41:
        r11 = r27;
        goto L43
    L37:
        r10 = r26;
        goto L39
    L33:
        r9 = r25;
        goto L35
    L29:
        r8 = r24;
        goto L31
    L25:
        r7 = r23;
        goto L27
    L21:
        r6 = r22;
        goto L23
    L17:
        r5 = r21;
        goto L19
    L13:
        r4 = r20;
        goto L15
    L9:
        r3 = r19;
        goto L11
    L5:
        r2 = r18;
        goto L7
    }

    public final int component1() {
        return this.alpha;
    }

    public final float component10() {
        return this.backlightWeight;
    }

    public final float component11() {
        return this.zoomWeight;
    }

    public final float component12() {
        return this.rollWeight;
    }

    public final float component13() {
        return this.pitchWeight;
    }

    public final float component14() {
        return this.yawWeight;
    }

    public final float component15() {
        return this.translationWeight;
    }

    public final float component16() {
        return this.aspectRatioWeight;
    }

    public final float component17() {
        return this.cropMargin;
    }

    public final float component18() {
        return this.dvnThresh;
    }

    public final float component19() {
        return this.emwaStart;
    }

    public final float component2() {
        return this.alphaMin;
    }

    public final int component20() {
        return this.decay;
    }

    public final float component21() {
        return this.decayMin;
    }

    public final float component22() {
        return this.decayMax;
    }

    public final float component23() {
        return this.ktpAspectRatioLow;
    }

    public final float component24() {
        return this.ktpAspectRatioHigh;
    }

    public final float component25() {
        return this.damagedWeight;
    }

    public final float component26() {
        return this.damagedThresh;
    }

    public final int component27() {
        return this.maxBestFrameScore;
    }

    public final float component28() {
        return this.acceptableThreshold;
    }

    public final float component29() {
        return this.acceptableWeight;
    }

    public final float component3() {
        return this.alphaMax;
    }

    public final float component30() {
        return this.blockThreshold;
    }

    public final float component31() {
        return this.blockWeight;
    }

    public final int component32() {
        return this.statusMessageTime;
    }

    public final int component33() {
        return this.zoomBuffer;
    }

    public final int component34() {
        return this.captureWindow;
    }

    public final float component4() {
        return this.alphaMaxZoom;
    }

    public final float component5() {
        return this.alphaMaxBacklight;
    }

    public final float component6() {
        return this.faceThreshold;
    }

    public final float component7() {
        return this.blurWeight;
    }

    public final float component8() {
        return this.highlightWeight;
    }

    public final float component9() {
        return this.lowlightWeight;
    }

    public final OjoSdkParameters copy(int r36, float r37, float r38, float r39, float r40, float r41, float r42, float r43, float r44, float r45, float r46, float r47, float r48, float r49, float r50, float r51, float r52, float r53, float r54, int r55, float r56, float r57, float r58, float r59, float r60, float r61, int r62, float r63, float r64, float r65, float r66, int r67, int r68, int r69) {
        return new OjoSdkParameters(r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof OjoSdkParameters) == true) goto L8;
        return false;
    L8:
        OjoSdkParameters r52 = (OjoSdkParameters) r5;
        if (this.alpha == r52.alpha) goto L12;
        return false;
    L12:
        if (Float.compare(this.alphaMin, r52.alphaMin) == 0) goto L15;
        return false;
    L15:
        if (Float.compare(this.alphaMax, r52.alphaMax) == 0) goto L18;
        return false;
    L18:
        if (Float.compare(this.alphaMaxZoom, r52.alphaMaxZoom) == 0) goto L21;
        return false;
    L21:
        if (Float.compare(this.alphaMaxBacklight, r52.alphaMaxBacklight) == 0) goto L24;
        return false;
    L24:
        if (Float.compare(this.faceThreshold, r52.faceThreshold) == 0) goto L27;
        return false;
    L27:
        if (Float.compare(this.blurWeight, r52.blurWeight) == 0) goto L30;
        return false;
    L30:
        if (Float.compare(this.highlightWeight, r52.highlightWeight) == 0) goto L33;
        return false;
    L33:
        if (Float.compare(this.lowlightWeight, r52.lowlightWeight) == 0) goto L36;
        return false;
    L36:
        if (Float.compare(this.backlightWeight, r52.backlightWeight) == 0) goto L39;
        return false;
    L39:
        if (Float.compare(this.zoomWeight, r52.zoomWeight) == 0) goto L42;
        return false;
    L42:
        if (Float.compare(this.rollWeight, r52.rollWeight) == 0) goto L45;
        return false;
    L45:
        if (Float.compare(this.pitchWeight, r52.pitchWeight) == 0) goto L48;
        return false;
    L48:
        if (Float.compare(this.yawWeight, r52.yawWeight) == 0) goto L51;
        return false;
    L51:
        if (Float.compare(this.translationWeight, r52.translationWeight) == 0) goto L54;
        return false;
    L54:
        if (Float.compare(this.aspectRatioWeight, r52.aspectRatioWeight) == 0) goto L57;
        return false;
    L57:
        if (Float.compare(this.cropMargin, r52.cropMargin) == 0) goto L60;
        return false;
    L60:
        if (Float.compare(this.dvnThresh, r52.dvnThresh) == 0) goto L63;
        return false;
    L63:
        if (Float.compare(this.emwaStart, r52.emwaStart) == 0) goto L66;
        return false;
    L66:
        if (this.decay == r52.decay) goto L69;
        return false;
    L69:
        if (Float.compare(this.decayMin, r52.decayMin) == 0) goto L72;
        return false;
    L72:
        if (Float.compare(this.decayMax, r52.decayMax) == 0) goto L75;
        return false;
    L75:
        if (Float.compare(this.ktpAspectRatioLow, r52.ktpAspectRatioLow) == 0) goto L78;
        return false;
    L78:
        if (Float.compare(this.ktpAspectRatioHigh, r52.ktpAspectRatioHigh) == 0) goto L81;
        return false;
    L81:
        if (Float.compare(this.damagedWeight, r52.damagedWeight) == 0) goto L84;
        return false;
    L84:
        if (Float.compare(this.damagedThresh, r52.damagedThresh) == 0) goto L87;
        return false;
    L87:
        if (this.maxBestFrameScore == r52.maxBestFrameScore) goto L90;
        return false;
    L90:
        if (Float.compare(this.acceptableThreshold, r52.acceptableThreshold) == 0) goto L93;
        return false;
    L93:
        if (Float.compare(this.acceptableWeight, r52.acceptableWeight) == 0) goto L96;
        return false;
    L96:
        if (Float.compare(this.blockThreshold, r52.blockThreshold) == 0) goto L99;
        return false;
    L99:
        if (Float.compare(this.blockWeight, r52.blockWeight) == 0) goto L102;
        return false;
    L102:
        if (this.statusMessageTime == r52.statusMessageTime) goto L105;
        return false;
    L105:
        if (this.zoomBuffer == r52.zoomBuffer) goto L108;
        return false;
    L108:
        if (this.captureWindow == r52.captureWindow) goto L110;
        return false;
    L110:
        return true;
    }

    public final float getAcceptableThreshold() {
        return this.acceptableThreshold;
    }

    public final float getAcceptableWeight() {
        return this.acceptableWeight;
    }

    public final int getAlpha() {
        return this.alpha;
    }

    public final float getAlphaMax() {
        return this.alphaMax;
    }

    public final float getAlphaMaxBacklight() {
        return this.alphaMaxBacklight;
    }

    public final float getAlphaMaxZoom() {
        return this.alphaMaxZoom;
    }

    public final float getAlphaMin() {
        return this.alphaMin;
    }

    public final float getAspectRatioWeight() {
        return this.aspectRatioWeight;
    }

    public final float getBacklightWeight() {
        return this.backlightWeight;
    }

    public final float getBlockThreshold() {
        return this.blockThreshold;
    }

    public final float getBlockWeight() {
        return this.blockWeight;
    }

    public final float getBlurWeight() {
        return this.blurWeight;
    }

    public final int getCaptureWindow() {
        return this.captureWindow;
    }

    public final float getCropMargin() {
        return this.cropMargin;
    }

    public final float getDamagedThresh() {
        return this.damagedThresh;
    }

    public final float getDamagedWeight() {
        return this.damagedWeight;
    }

    public final int getDecay() {
        return this.decay;
    }

    public final float getDecayMax() {
        return this.decayMax;
    }

    public final float getDecayMin() {
        return this.decayMin;
    }

    public final float getDvnThresh() {
        return this.dvnThresh;
    }

    public final float getEmwaStart() {
        return this.emwaStart;
    }

    public final float getFaceThreshold() {
        return this.faceThreshold;
    }

    public final float getHighlightWeight() {
        return this.highlightWeight;
    }

    public final float getKtpAspectRatioHigh() {
        return this.ktpAspectRatioHigh;
    }

    public final float getKtpAspectRatioLow() {
        return this.ktpAspectRatioLow;
    }

    public final float getLowlightWeight() {
        return this.lowlightWeight;
    }

    public final int getMaxBestFrameScore() {
        return this.maxBestFrameScore;
    }

    public final float getPitchWeight() {
        return this.pitchWeight;
    }

    public final float getRollWeight() {
        return this.rollWeight;
    }

    public final int getStatusMessageTime() {
        return this.statusMessageTime;
    }

    public final float getTranslationWeight() {
        return this.translationWeight;
    }

    public final float getYawWeight() {
        return this.yawWeight;
    }

    public final int getZoomBuffer() {
        return this.zoomBuffer;
    }

    public final float getZoomWeight() {
        return this.zoomWeight;
    }

    public int hashCode() {
        int r02 = Integer.hashCode(this.alpha) * 31;
        int r03 = AbstractC2053a.a(this.alphaMin, r02, 31);
        int r04 = AbstractC2053a.a(this.alphaMax, r03, 31);
        int r05 = AbstractC2053a.a(this.alphaMaxZoom, r04, 31);
        int r06 = AbstractC2053a.a(this.alphaMaxBacklight, r05, 31);
        int r07 = AbstractC2053a.a(this.faceThreshold, r06, 31);
        int r08 = AbstractC2053a.a(this.blurWeight, r07, 31);
        int r09 = AbstractC2053a.a(this.highlightWeight, r08, 31);
        int r010 = AbstractC2053a.a(this.lowlightWeight, r09, 31);
        int r011 = AbstractC2053a.a(this.backlightWeight, r010, 31);
        int r012 = AbstractC2053a.a(this.zoomWeight, r011, 31);
        int r013 = AbstractC2053a.a(this.rollWeight, r012, 31);
        int r014 = AbstractC2053a.a(this.pitchWeight, r013, 31);
        int r015 = AbstractC2053a.a(this.yawWeight, r014, 31);
        int r016 = AbstractC2053a.a(this.translationWeight, r015, 31);
        int r017 = AbstractC2053a.a(this.aspectRatioWeight, r016, 31);
        int r018 = AbstractC2053a.a(this.cropMargin, r017, 31);
        int r019 = AbstractC2053a.a(this.dvnThresh, r018, 31);
        int r020 = AbstractC2053a.a(this.emwaStart, r019, 31);
        int r021 = AbstractC4230a.a(this.decay, r020, 31);
        int r022 = AbstractC2053a.a(this.decayMin, r021, 31);
        int r023 = AbstractC2053a.a(this.decayMax, r022, 31);
        int r024 = AbstractC2053a.a(this.ktpAspectRatioLow, r023, 31);
        int r025 = AbstractC2053a.a(this.ktpAspectRatioHigh, r024, 31);
        int r026 = AbstractC2053a.a(this.damagedWeight, r025, 31);
        int r027 = AbstractC2053a.a(this.damagedThresh, r026, 31);
        int r028 = AbstractC4230a.a(this.maxBestFrameScore, r027, 31);
        int r029 = AbstractC2053a.a(this.acceptableThreshold, r028, 31);
        int r030 = AbstractC2053a.a(this.acceptableWeight, r029, 31);
        int r031 = AbstractC2053a.a(this.blockThreshold, r030, 31);
        int r032 = AbstractC2053a.a(this.blockWeight, r031, 31);
        int r033 = AbstractC4230a.a(this.statusMessageTime, r032, 31);
        int r034 = AbstractC4230a.a(this.zoomBuffer, r033, 31);
        return Integer.hashCode(this.captureWindow) + r034;
    }

    public String toString() {
        return "OjoSdkParameters(alpha=" + this.alpha + ", alphaMin=" + this.alphaMin + ", alphaMax=" + this.alphaMax + ", alphaMaxZoom=" + this.alphaMaxZoom + ", alphaMaxBacklight=" + this.alphaMaxBacklight + ", faceThreshold=" + this.faceThreshold + ", blurWeight=" + this.blurWeight + ", highlightWeight=" + this.highlightWeight + ", lowlightWeight=" + this.lowlightWeight + ", backlightWeight=" + this.backlightWeight + ", zoomWeight=" + this.zoomWeight + ", rollWeight=" + this.rollWeight + ", pitchWeight=" + this.pitchWeight + ", yawWeight=" + this.yawWeight + ", translationWeight=" + this.translationWeight + ", aspectRatioWeight=" + this.aspectRatioWeight + ", cropMargin=" + this.cropMargin + ", dvnThresh=" + this.dvnThresh + ", emwaStart=" + this.emwaStart + ", decay=" + this.decay + ", decayMin=" + this.decayMin + ", decayMax=" + this.decayMax + ", ktpAspectRatioLow=" + this.ktpAspectRatioLow + ", ktpAspectRatioHigh=" + this.ktpAspectRatioHigh + ", damagedWeight=" + this.damagedWeight + ", damagedThresh=" + this.damagedThresh + ", maxBestFrameScore=" + this.maxBestFrameScore + ", acceptableThreshold=" + this.acceptableThreshold + ", acceptableWeight=" + this.acceptableWeight + ", blockThreshold=" + this.blockThreshold + ", blockWeight=" + this.blockWeight + ", statusMessageTime=" + this.statusMessageTime + ", zoomBuffer=" + this.zoomBuffer + ", captureWindow=" + this.captureWindow + ")";
    }

    public OjoSdkParameters(int r1, float r2, float r3, float r4, float r5, float r6, float r7, float r8, float r9, float r10, float r11, float r12, float r13, float r14, float r15, float r16, float r17, float r18, float r19, int r20, float r21, float r22, float r23, float r24, float r25, float r26, int r27, float r28, float r29, float r30, float r31, int r32, int r33, int r34) {
        this.alpha = r1;
        this.alphaMin = r2;
        this.alphaMax = r3;
        this.alphaMaxZoom = r4;
        this.alphaMaxBacklight = r5;
        this.faceThreshold = r6;
        this.blurWeight = r7;
        this.highlightWeight = r8;
        this.lowlightWeight = r9;
        this.backlightWeight = r10;
        this.zoomWeight = r11;
        this.rollWeight = r12;
        this.pitchWeight = r13;
        this.yawWeight = r14;
        this.translationWeight = r15;
        this.aspectRatioWeight = r16;
        this.cropMargin = r17;
        this.dvnThresh = r18;
        this.emwaStart = r19;
        this.decay = r20;
        this.decayMin = r21;
        this.decayMax = r22;
        this.ktpAspectRatioLow = r23;
        this.ktpAspectRatioHigh = r24;
        this.damagedWeight = r25;
        this.damagedThresh = r26;
        this.maxBestFrameScore = r27;
        this.acceptableThreshold = r28;
        this.acceptableWeight = r29;
        this.blockThreshold = r30;
        this.blockWeight = r31;
        this.statusMessageTime = r32;
        this.zoomBuffer = r33;
        this.captureWindow = r34;
    }

    public /* synthetic */ OjoSdkParameters(int r35, float r36, float r37, float r38, float r39, float r40, float r41, float r42, float r43, float r44, float r45, float r46, float r47, float r48, float r49, float r50, float r51, float r52, float r53, int r54, float r55, float r56, float r57, float r58, float r59, float r60, int r61, float r62, float r63, float r64, float r65, int r66, int r67, int r68, int r69, int r70, i r71) {
        if ((r69 & 1) == 0) goto L5;
        int r1 = 0;
    L7:
        if ((r69 & 2) == 0) goto L9;
        float r3 = 0.0f;
    L11:
        if ((r69 & 4) == 0) goto L13;
        float r5 = 0.0f;
    L15:
        if ((r69 & 8) == 0) goto L17;
        float r6 = 0.0f;
    L19:
        if ((r69 & 16) == 0) goto L21;
        float r7 = 0.0f;
    L23:
        if ((r69 & 32) == 0) goto L25;
        float r8 = 0.0f;
    L27:
        if ((r69 & 64) == 0) goto L29;
        float r9 = 0.0f;
    L31:
        if ((r69 & 128) == 0) goto L33;
        float r10 = 0.0f;
    L35:
        if ((r69 & 256) == 0) goto L37;
        float r11 = 0.0f;
    L39:
        if ((r69 & 512) == 0) goto L41;
        float r12 = 0.0f;
    L43:
        if ((r69 & 1024) == 0) goto L45;
        float r13 = 0.0f;
    L47:
        if ((r69 & 2048) == 0) goto L49;
        float r14 = 0.0f;
    L51:
        if ((r69 & 4096) == 0) goto L53;
        float r15 = 0.0f;
    L55:
        if ((r69 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        float r2 = 0.0f;
    L59:
        if ((r69 & 16384) == 0) goto L61;
        float r4 = 0.0f;
    L63:
        if ((r69 & 32768) == 0) goto L65;
        float r16 = 0.0f;
    L67:
        if ((r69 & 65536) == 0) goto L69;
        float r17 = 0.0f;
    L71:
        if ((r69 & 131072) == 0) goto L73;
        float r18 = 0.0f;
    L75:
        if ((r69 & 262144) == 0) goto L77;
        float r19 = 0.0f;
    L79:
        if ((r69 & 524288) == 0) goto L81;
        int r20 = 0;
    L83:
        if ((r69 & 1048576) == 0) goto L85;
        float r21 = 0.0f;
    L87:
        if ((r69 & 2097152) == 0) goto L89;
        float r22 = 0.0f;
    L91:
        if ((r69 & 4194304) == 0) goto L93;
        float r23 = 0.0f;
    L95:
        if ((r69 & 8388608) == 0) goto L97;
        float r24 = 0.0f;
    L99:
        if ((r69 & 16777216) == 0) goto L101;
        float r25 = 0.0f;
    L103:
        if ((r69 & 33554432) == 0) goto L105;
        float r26 = 0.0f;
    L107:
        if ((r69 & 67108864) == 0) goto L109;
        int r27 = 0;
    L111:
        if ((r69 & 134217728) == 0) goto L113;
        float r28 = 0.0f;
    L115:
        if ((r69 & 268435456) == 0) goto L117;
        float r29 = 0.0f;
    L119:
        if ((r69 & 536870912) == 0) goto L121;
        float r30 = 0.0f;
    L123:
        if ((r69 & Ints.MAX_POWER_OF_TWO) == 0) goto L125;
        float r31 = 0.0f;
    L127:
        if ((r69 & Integer.MIN_VALUE) == 0) goto L129;
        int r02 = 0;
    L131:
        if ((r70 & 1) == 0) goto L133;
        int r32 = 0;
    L135:
        if ((r70 & 2) == 0) goto L138;
        int r692 = 0;
    L139:
        this(r1, r3, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r2, r4, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r02, r32, r692);
        return;
    L138:
        r692 = r68;
        goto L139
    L133:
        r32 = r67;
        goto L135
    L129:
        r02 = r66;
        goto L131
    L125:
        r31 = r65;
        goto L127
    L121:
        r30 = r64;
        goto L123
    L117:
        r29 = r63;
        goto L119
    L113:
        r28 = r62;
        goto L115
    L109:
        r27 = r61;
        goto L111
    L105:
        r26 = r60;
        goto L107
    L101:
        r25 = r59;
        goto L103
    L97:
        r24 = r58;
        goto L99
    L93:
        r23 = r57;
        goto L95
    L89:
        r22 = r56;
        goto L91
    L85:
        r21 = r55;
        goto L87
    L81:
        r20 = r54;
        goto L83
    L77:
        r19 = r53;
        goto L79
    L73:
        r18 = r52;
        goto L75
    L69:
        r17 = r51;
        goto L71
    L65:
        r16 = r50;
        goto L67
    L61:
        r4 = r49;
        goto L63
    L57:
        r2 = r48;
        goto L59
    L53:
        r15 = r47;
        goto L55
    L49:
        r14 = r46;
        goto L51
    L45:
        r13 = r45;
        goto L47
    L41:
        r12 = r44;
        goto L43
    L37:
        r11 = r43;
        goto L39
    L33:
        r10 = r42;
        goto L35
    L29:
        r9 = r41;
        goto L31
    L25:
        r8 = r40;
        goto L27
    L21:
        r7 = r39;
        goto L23
    L17:
        r6 = r38;
        goto L19
    L13:
        r5 = r37;
        goto L15
    L9:
        r3 = r36;
        goto L11
    L5:
        r1 = r35;
        goto L7
    }
}

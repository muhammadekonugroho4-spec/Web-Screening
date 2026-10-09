package com.gojek.ojosdk;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Point;
import android.graphics.Rect;
import androidx.core.app.NotificationCompat;
import clickstream.internal.analytics.healthproto.Health;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.gojek.ojosdk.exif.ExifInterface;
import com.gojek.ojosdk.exif.ExifTag;
import com.google.android.flexbox.FlexItem;
import com.google.android.material.internal.ViewUtils;
import com.google.common.primitives.Ints;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.AbstractC11778w;
import kotlin.collections.S;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlin.m;
import kotlinx.coroutines.scheduling.CoroutineScheduler;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\u0018\u0000 \u00052\u00020\u0001:\u000f\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0012"}, d2 = {"Lcom/gojek/ojosdk/Ojo;", "", "()V", "AuroraColors", "CardType", "Companion", "DetectionResult", "ErrorCode", "Face", "FacePose", "ImageWriter", "Landmark", "Object", "PixelFormat", "Rotation", "Status", "WakewordDetectionOptions", "WakewordDetectionResult", "OJOSDK_withoutModelsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class Ojo {
    public static final Companion Companion = null;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/gojek/ojosdk/Ojo$AuroraColors;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "OTHER", "RED", "GREEN", "BLUE", "YELLOW", "WHITE", "OJOSDK_withoutModelsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum AuroraColors extends Enum<AuroraColors> {
        private static final /* synthetic */ AuroraColors[] $VALUES = null;
        public static final AuroraColors BLUE = null;
        public static final AuroraColors GREEN = null;
        public static final AuroraColors OTHER = null;
        public static final AuroraColors RED = null;
        public static final AuroraColors WHITE = null;
        public static final AuroraColors YELLOW = null;
        private final int value;

        private static final /* synthetic */ AuroraColors[] $values() {
            return new AuroraColors[]{OTHER, RED, GREEN, BLUE, YELLOW, WHITE};
        }

        static {
            OTHER = new AuroraColors("OTHER", 0, -1);
            RED = new AuroraColors("RED", 1, 16727140);
            GREEN = new AuroraColors("GREEN", 2, 3988540);
            BLUE = new AuroraColors("BLUE", 3, 3932415);
            YELLOW = new AuroraColors("YELLOW", 4, 16762940);
            WHITE = new AuroraColors("WHITE", 5, FlexItem.MAX_SIZE);
            $VALUES = $values();
        }

        AuroraColors(String r1, int r2, int r3) {
            this.value = r3;
        }

        public static AuroraColors valueOf(String r1) {
            return (AuroraColors) Enum.valueOf(AuroraColors.class, r1);
        }

        public static AuroraColors[] values() {
            return (AuroraColors[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/gojek/ojosdk/Ojo$CardType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "KTP", "SIM", "SELFIE", "SELFIE_WITH_ID", "OJOSDK_withoutModelsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum CardType extends Enum<CardType> {
        private static final /* synthetic */ CardType[] $VALUES = null;
        public static final CardType KTP = null;
        public static final CardType SELFIE = null;
        public static final CardType SELFIE_WITH_ID = null;
        public static final CardType SIM = null;
        private final int value;

        private static final /* synthetic */ CardType[] $values() {
            return new CardType[]{KTP, SIM, SELFIE, SELFIE_WITH_ID};
        }

        static {
            KTP = new CardType("KTP", 0, 0);
            SIM = new CardType("SIM", 1, 1);
            SELFIE = new CardType("SELFIE", 2, 2);
            SELFIE_WITH_ID = new CardType("SELFIE_WITH_ID", 3, 3);
            $VALUES = $values();
        }

        CardType(String r1, int r2, int r3) {
            this.value = r3;
        }

        public static CardType valueOf(String r1) {
            return (CardType) Enum.valueOf(CardType.class, r1);
        }

        public static CardType[] values() {
            return (CardType[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\be\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JK\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\rH\u0087 JÕ\u0001\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010%\u001a\u00020#2\b\b\u0002\u0010&\u001a\u00020#2\b\b\u0002\u0010'\u001a\u00020#2\b\b\u0002\u0010(\u001a\u00020#2\b\b\u0002\u0010)\u001a\u00020#2\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020\rH\u0087 J\t\u0010.\u001a\u00020\u0004H\u0087 Js\u0010/\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010)\u001a\u00020#H\u0087 J\u0019\u00100\u001a\u00020\u00042\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0087 J\u0011\u00105\u001a\u00020\r2\u0006\u00106\u001a\u00020\rH\u0087 J\t\u00107\u001a\u000208H\u0087 J\t\u00109\u001a\u00020\rH\u0087 J\t\u0010:\u001a\u00020\rH\u0087 J\t\u0010;\u001a\u00020\rH\u0087 J5\u0010<\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\r2\u0006\u0010>\u001a\u00020\r2\u0006\u0010?\u001a\u00020\r2\b\b\u0002\u0010@\u001a\u00020\b2\b\b\u0002\u0010A\u001a\u00020#H\u0087 J5\u0010B\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\r2\u0006\u0010>\u001a\u00020\r2\u0006\u0010?\u001a\u00020\r2\b\b\u0002\u0010@\u001a\u00020\b2\b\b\u0002\u0010A\u001a\u00020#H\u0087 J5\u0010C\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\r2\u0006\u0010>\u001a\u00020\r2\u0006\u0010?\u001a\u00020\r2\b\b\u0002\u0010@\u001a\u00020\b2\b\b\u0002\u0010A\u001a\u00020#H\u0087 J\u001b\u0010D\u001a\u00020\u00042\u0006\u0010E\u001a\u00020\r2\b\b\u0002\u0010@\u001a\u00020\bH\u0087 J#\u0010F\u001a\u00020\u00042\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020\b2\b\b\u0002\u0010(\u001a\u00020#H\u0087 J#\u0010F\u001a\u00020\u00042\u0006\u0010J\u001a\u00020\r2\u0006\u0010I\u001a\u00020\b2\b\b\u0002\u0010(\u001a\u00020#H\u0087 J!\u0010K\u001a\u00020\u00042\u0006\u0010L\u001a\u00020M2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\bH\u0087 J©\u0001\u0010N\u001a\u00020\u00042\b\b\u0002\u0010O\u001a\u00020P2\b\b\u0002\u0010Q\u001a\u00020P2\b\b\u0002\u0010R\u001a\u00020P2\b\b\u0002\u0010S\u001a\u00020P2\b\b\u0002\u0010T\u001a\u00020P2\b\b\u0002\u0010U\u001a\u00020\b2\b\b\u0002\u0010V\u001a\u00020\b2\b\b\u0002\u0010W\u001a\u00020P2\b\b\u0002\u0010X\u001a\u00020P2\b\b\u0002\u0010Y\u001a\u00020P2\b\b\u0002\u0010Z\u001a\u00020P2\b\b\u0002\u0010[\u001a\u00020P2\b\b\u0002\u0010\\\u001a\u00020P2\b\b\u0002\u0010]\u001a\u00020\b2\b\b\u0002\u0010^\u001a\u00020\b2\b\b\u0002\u0010_\u001a\u00020\bH\u0087 Jº\u0004\u0010`\u001a\u00020\u00042\b\b\u0002\u0010a\u001a\u00020P2\b\b\u0002\u0010b\u001a\u00020#2\b\b\u0002\u0010c\u001a\u00020\b2\b\b\u0002\u0010d\u001a\u00020\b2\b\b\u0002\u0010]\u001a\u00020\b2\b\b\u0002\u0010^\u001a\u00020\b2\b\b\u0002\u0010e\u001a\u00020+2\b\b\u0002\u0010f\u001a\u00020\b2\b\b\u0002\u0010g\u001a\u00020P2\b\b\u0002\u0010h\u001a\u00020+2\b\b\u0002\u0010i\u001a\u00020\b2\b\b\u0002\u0010j\u001a\u00020+2\b\b\u0002\u0010k\u001a\u00020+2\b\b\u0002\u0010l\u001a\u00020P2\b\b\u0002\u0010m\u001a\u00020P2\b\b\u0002\u0010n\u001a\u00020P2\b\b\u0002\u0010o\u001a\u00020P2\b\b\u0002\u0010p\u001a\u00020P2\b\b\u0002\u0010q\u001a\u00020#2\b\b\u0002\u0010r\u001a\u00020P2\b\b\u0002\u0010s\u001a\u00020#2\b\b\u0002\u0010t\u001a\u00020P2\b\b\u0002\u0010u\u001a\u00020P2\b\b\u0002\u0010v\u001a\u00020P2\b\b\u0002\u0010w\u001a\u00020P2\b\b\u0002\u0010x\u001a\u00020P2\b\b\u0002\u0010y\u001a\u00020P2\b\b\u0002\u0010z\u001a\u00020P2\b\b\u0002\u0010{\u001a\u00020P2\b\b\u0002\u0010|\u001a\u00020#2\b\b\u0002\u0010}\u001a\u00020P2\b\b\u0002\u0010~\u001a\u00020P2\b\b\u0002\u0010\u007f\u001a\u00020\b2\t\b\u0002\u0010\u0080\u0001\u001a\u00020\b2\t\b\u0002\u0010\u0081\u0001\u001a\u00020P2\t\b\u0002\u0010\u0082\u0001\u001a\u00020P2\t\b\u0002\u0010\u0083\u0001\u001a\u00020P2\t\b\u0002\u0010\u0084\u0001\u001a\u00020P2\t\b\u0002\u0010\u0085\u0001\u001a\u00020P2\t\b\u0002\u0010\u0086\u0001\u001a\u00020P2\t\b\u0002\u0010\u0087\u0001\u001a\u00020P2\t\b\u0002\u0010\u0088\u0001\u001a\u00020P2\t\b\u0002\u0010\u0089\u0001\u001a\u00020\b2\t\b\u0002\u0010\u008a\u0001\u001a\u00020\b2\t\b\u0002\u0010\u008b\u0001\u001a\u00020\b2\t\b\u0002\u0010\u008c\u0001\u001a\u00020\b2\t\b\u0002\u0010\u008d\u0001\u001a\u00020P2\t\b\u0002\u0010\u008e\u0001\u001a\u00020P2\t\b\u0002\u0010\u008f\u0001\u001a\u00020P2\t\b\u0002\u0010\u0090\u0001\u001a\u00020P2\t\b\u0002\u0010\u0091\u0001\u001a\u00020\b2\t\b\u0002\u0010\u0092\u0001\u001a\u00020\b2\t\b\u0002\u0010\u0093\u0001\u001a\u00020\b2\t\b\u0002\u0010\u0094\u0001\u001a\u00020PH\u0087 Jñ\u0001\u0010\u0095\u0001\u001a\u00020\u00042\t\b\u0002\u0010\u0096\u0001\u001a\u00020P2\t\b\u0002\u0010\u0097\u0001\u001a\u00020P2\t\b\u0002\u0010\u0098\u0001\u001a\u00020P2\t\b\u0002\u0010\u0099\u0001\u001a\u00020P2\t\b\u0002\u0010\u009a\u0001\u001a\u00020P2\t\b\u0002\u0010\u009b\u0001\u001a\u00020P2\t\b\u0002\u0010\u009c\u0001\u001a\u00020P2\t\b\u0002\u0010\u009d\u0001\u001a\u00020P2\t\b\u0002\u0010\u009e\u0001\u001a\u00020P2\t\b\u0002\u0010\u009f\u0001\u001a\u00020P2\t\b\u0002\u0010 \u0001\u001a\u00020P2\t\b\u0002\u0010¡\u0001\u001a\u00020P2\t\b\u0002\u0010¢\u0001\u001a\u00020P2\t\b\u0002\u0010£\u0001\u001a\u00020\b2\t\b\u0002\u0010¤\u0001\u001a\u00020\b2\t\b\u0002\u0010¥\u0001\u001a\u00020P2\t\b\u0002\u0010¦\u0001\u001a\u00020P2\t\b\u0002\u0010§\u0001\u001a\u00020P2\t\b\u0002\u0010¨\u0001\u001a\u00020P2\t\b\u0002\u0010©\u0001\u001a\u00020P2\t\b\u0002\u0010ª\u0001\u001a\u00020PH\u0087 J\n\u0010«\u0001\u001a\u00020\u0004H\u0087 Jn\u0010¬\u0001\u001a\u00020\u00042\b\u0010G\u001a\u0004\u0018\u00010H2\u000b\b\u0002\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\f\u001a\u00020\r2\t\b\u0002\u0010®\u0001\u001a\u00020\b2\t\b\u0002\u0010¯\u0001\u001a\u00020P2\u0007\u0010°\u0001\u001a\u00020\b2\u0007\u0010±\u0001\u001a\u00020\b2\u0007\u0010²\u0001\u001a\u00020\b2\u0007\u0010³\u0001\u001a\u00020\b2\u0007\u0010´\u0001\u001a\u00020\bH\u0087 ¨\u0006µ\u0001"}, d2 = {"Lcom/gojek/ojosdk/Ojo$Companion;", "", "()V", "ci", "Lcom/gojek/ojosdk/Ojo$ErrorCode;", "cardType", "Lcom/gojek/ojosdk/Ojo$CardType;", "normSize", "", "rotation", "Lcom/gojek/ojosdk/Ojo$Rotation;", "edWindow", "logFilePath", "", "context", "Landroid/content/Context;", "sessionId", "df", "yBuffer", "", "uBuffer", "vBuffer", "yRowStride", "yPixelStride", "uRowStride", "uPixelStride", "vRowStride", "vPixelStride", "width", "height", "pixelFormat", "Lcom/gojek/ojosdk/Ojo$PixelFormat;", "result", "Lcom/gojek/ojosdk/Ojo$DetectionResult;", "detectMultipleFaces", "", "doFaceDetection", "doImageAnalysis", "doLivenessDetection", "doBlinkDetection", "doAuroraLivenessCheck", "processInGrayscale", "imageTimeStamp", "", "screenUpdateTime", "screenUpdateColor", "di", "ds", "dw", "wakewordDetectionOptions", "Lcom/gojek/ojosdk/Ojo$WakewordDetectionOptions;", "wakewordDetectionResult", "Lcom/gojek/ojosdk/Ojo$WakewordDetectionResult;", "ec", "plaintext", "gf", "", "gl", "gv", "gz", "s1", "filepath", "userComment", "description", "quality", "debugMode", "s2", "s3", "sa", "outputPath", "sm", "assetManager", "Landroid/content/res/AssetManager;", "numThreads", "faceDetectionModelPath", "sr", "cardROI", "Landroid/graphics/Rect;", "st1", "acceptableThresh", "", "blurThresh", "highlightThresh", "lowlightThresh", "blockThresh", "statusMessageTime", "zoomBuffer", "zoomLow", "zoomHigh", "cropMargin", "aspectRatioLow", "aspectRatioHigh", "dvnThresh", "timeout", "captureWindow", "maxBestFrameScore", "st2", "faceDetThresh", "faceTracking", "minBlinks", "mouthBlinks", "displayedColorChangeTime", "maximumNotOneFaceTimes", "significantFaceRate", "skipFirstNMilliseconds", "auroraMaxTrialTimes", "auroraRestartDelayTime", "qcErrorMessageChangeTime", "qcOkThreshold", "qcBlurThreshold", "qcBlockThreshold", "qcBrightThreshold", "qcDarkThreshold", "successLogUploadOn", "successLogSampleRate", "failedLogUploadOn", "failedLogSampleRate", "debugPNGRatio", "eyeDistanceMinRate", "eyeDistanceMaxRate", "lastLandmarkDiffThreshold", "frontalFaceEulerXThreshold", "frontalFaceEulerYThreshold", "frontalFaceEulerZThreshold", "auroraRealtimeInference", "auroraLivenessThreshold", "auroraLivenessSpoofThreshold", "auroraLivenessNumberThreshold", "auroraColorNumberThreshold", "brightnessThreshold", "silentASRealThreshold", "silentASSpoofThreshold", "silentASBrightRealThreshold", "brightRejectThreshold", "eyeOpenThreshold", "eyeCloseThreshold", "eyeBlockThreshold", "eyeBlinkInterval", "eyeCloseInterval", "eyeBlockInterval", "eyeCloseNum", "eyeRegionCheckThreshold", "mouthOpenThreshold", "mouthCloseThreshold", "mouthBlockThreshold", "mouthBlinkInterval", "mouthOpenInterval", "mouthBlockInterval", "mouthRegionCheckThreshold", "sw", "acceptableWeight", "blurWeight", "highlightWeight", "lowlightWeight", "blockWeight", "backlightWeight", "zoomWeight", "rollWeight", "pitchWeight", "yawWeight", "aspectRatioWeight", "translationWeight", "ewmaStartVal", "nAlpha", "nDecay", "alphaMin", "alphaMax", "decayMin", "decayMax", "alphaMaxZoom", "alphaMaxBacklight", "wd", "wi", "modelPath", "saveTopK", "saveMinProb", "num_mfcc", "sample_rate", "chunk_length_ms", "sequence_length_ms", "delay_ms", "OJOSDK_withoutModelsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(i r1) {
            this();
        }

        public static /* synthetic */ ErrorCode ci$default(Companion r8, CardType r9, int r10, Rotation r11, int r12, String r13, Context r14, String r15, int r16, java.lang.Object r17) {
            if ((r16 & 8) == 0) goto L5;
            r12 = 5;
        L5:
            int r4 = r12;
            if ((r16 & 16) == 0) goto L8;
            String r5 = "";
        L10:
            if ((r16 & 32) == 0) goto L12;
            r14 = null;
        L12:
            Context r6 = r14;
            if ((r16 & 64) == 0) goto L15;
            String r7 = "";
            CardType r1 = r9;
            int r2 = r10;
            Rotation r3 = r11;
            Companion r02 = r8;
        L17:
            return r02.ci(r1, r2, r3, r4, r5, r6, r7);
        L15:
            r7 = r15;
            r02 = r8;
            r1 = r9;
            r2 = r10;
            r3 = r11;
            goto L17
        L8:
            r5 = r13;
            goto L10
        }

        public static /* synthetic */ ErrorCode df$default(Companion r29, byte[] r30, byte[] r31, byte[] r32, int r33, int r34, int r35, int r36, int r37, int r38, int r39, int r40, PixelFormat r41, DetectionResult r42, boolean r43, boolean r44, boolean r45, boolean r46, boolean r47, boolean r48, boolean r49, long r50, long r52, String r54, int r55, java.lang.Object r56) {
            if ((r55 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L5;
            boolean r17 = false;
        L7:
            if ((r55 & 16384) == 0) goto L9;
            boolean r18 = true;
        L11:
            if ((32768 & r55) == 0) goto L13;
            boolean r19 = true;
        L15:
            if ((65536 & r55) == 0) goto L17;
            boolean r20 = true;
        L19:
            if ((131072 & r55) == 0) goto L21;
            boolean r21 = true;
        L23:
            if ((262144 & r55) == 0) goto L25;
            boolean r22 = true;
        L27:
            if ((524288 & r55) == 0) goto L29;
            boolean r23 = false;
        L31:
            if ((1048576 & r55) == 0) goto L33;
            long r24 = -1;
        L35:
            if ((2097152 & r55) == 0) goto L37;
            long r26 = -1;
        L39:
            if ((r55 & 4194304) == 0) goto L42;
            String r28 = "WHITE";
        L44:
            return r29.df(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r17, r18, r19, r20, r21, r22, r23, r24, r26, r28);
        L42:
            r28 = r54;
            goto L44
        L37:
            r26 = r52;
            goto L39
        L33:
            r24 = r50;
            goto L35
        L29:
            r23 = r49;
            goto L31
        L25:
            r22 = r48;
            goto L27
        L21:
            r21 = r47;
            goto L23
        L17:
            r20 = r46;
            goto L19
        L13:
            r19 = r45;
            goto L15
        L9:
            r18 = r44;
            goto L11
        L5:
            r17 = r43;
            goto L7
        }

        public static /* synthetic */ ErrorCode ds$default(Companion r15, byte[] r16, byte[] r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26, PixelFormat r27, boolean r28, int r29, java.lang.Object r30) {
            if ((r29 & 4096) == 0) goto L6;
            boolean r14 = false;
        L8:
            return r15.ds(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r14);
        L6:
            r14 = r28;
            goto L8
        }

        public static /* synthetic */ ErrorCode s1$default(Companion r6, String r7, String r8, String r9, int r10, boolean r11, int r12, java.lang.Object r13) {
            if ((r12 & 8) == 0) goto L5;
            r10 = 100;
        L5:
            int r4 = r10;
            if ((r12 & 16) == 0) goto L9;
            r11 = false;
        L9:
            return r6.s1(r7, r8, r9, r4, r11);
        }

        public static /* synthetic */ ErrorCode s2$default(Companion r6, String r7, String r8, String r9, int r10, boolean r11, int r12, java.lang.Object r13) {
            if ((r12 & 8) == 0) goto L5;
            r10 = 100;
        L5:
            int r4 = r10;
            if ((r12 & 16) == 0) goto L9;
            r11 = false;
        L9:
            return r6.s2(r7, r8, r9, r4, r11);
        }

        public static /* synthetic */ ErrorCode s3$default(Companion r6, String r7, String r8, String r9, int r10, boolean r11, int r12, java.lang.Object r13) {
            if ((r12 & 8) == 0) goto L5;
            r10 = 100;
        L5:
            int r4 = r10;
            if ((r12 & 16) == 0) goto L9;
            r11 = false;
        L9:
            return r6.s3(r7, r8, r9, r4, r11);
        }

        public static /* synthetic */ ErrorCode sa$default(Companion r02, String r1, int r2, int r3, java.lang.Object r4) {
            if ((r3 & 2) == 0) goto L6;
            r2 = 100;
        L6:
            return r02.sa(r1, r2);
        }

        public static /* synthetic */ ErrorCode sm$default(Companion r02, String r1, int r2, boolean r3, int r4, java.lang.Object r5) {
            if ((r4 & 4) == 0) goto L6;
            r3 = true;
        L6:
            return r02.sm(r1, r2, r3);
        }

        public static /* synthetic */ ErrorCode st1$default(Companion r17, float r18, float r19, float r20, float r21, float r22, int r23, int r24, float r25, float r26, float r27, float r28, float r29, float r30, int r31, int r32, int r33, int r34, java.lang.Object r35) {
            float r2 = 0.37f;
            if ((r34 & 1) == 0) goto L5;
            float r1 = 0.37f;
        L7:
            if ((r34 & 2) == 0) goto L9;
            float r3 = 0.46f;
        L11:
            if ((r34 & 4) == 0) goto L13;
            float r4 = 0.35f;
        L15:
            if ((r34 & 8) != 0) goto L18;
            r2 = r21;
        L18:
            float r6 = 0.15f;
            if ((r34 & 16) == 0) goto L21;
            float r5 = 0.15f;
        L23:
            if ((r34 & 32) == 0) goto L25;
            int r7 = 1000;
        L27:
            if ((r34 & 64) == 0) goto L29;
            int r9 = 3;
        L31:
            if ((r34 & 128) == 0) goto L33;
            float r10 = 112.0f;
        L35:
            if ((r34 & 256) == 0) goto L37;
            float r11 = 150.0f;
        L39:
            if ((r34 & 512) != 0) goto L43;
            r6 = r27;
        L43:
            if ((r34 & 1024) == 0) goto L45;
            float r12 = 0.45f;
        L47:
            if ((r34 & 2048) == 0) goto L49;
            float r13 = 0.71f;
        L51:
            if ((r34 & 4096) == 0) goto L53;
            float r14 = 0.4f;
        L55:
            if ((r34 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
            int r15 = 30;
        L59:
            if ((r34 & 16384) == 0) goto L61;
            int r8 = 1000;
        L63:
            if ((r34 & 32768) == 0) goto L66;
            int r342 = 25;
        L68:
            return r17.st1(r1, r3, r4, r2, r5, r7, r9, r10, r11, r6, r12, r13, r14, r15, r8, r342);
        L66:
            r342 = r33;
            goto L68
        L61:
            r8 = r32;
            goto L63
        L57:
            r15 = r31;
            goto L59
        L53:
            r14 = r30;
            goto L55
        L49:
            r13 = r29;
            goto L51
        L45:
            r12 = r28;
            goto L47
        L37:
            r11 = r26;
            goto L39
        L33:
            r10 = r25;
            goto L35
        L29:
            r9 = r24;
            goto L31
        L25:
            r7 = r23;
            goto L27
        L21:
            r5 = r22;
            goto L23
        L13:
            r4 = r20;
            goto L15
        L9:
            r3 = r19;
            goto L11
        L5:
            r1 = r18;
            goto L7
        }

        public static /* synthetic */ ErrorCode st2$default(Companion r51, float r52, boolean r53, int r54, int r55, int r56, int r57, long r58, int r60, float r61, long r62, int r64, long r65, long r67, float r69, float r70, float r71, float r72, float r73, boolean r74, float r75, boolean r76, float r77, float r78, float r79, float r80, float r81, float r82, float r83, float r84, boolean r85, float r86, float r87, int r88, int r89, float r90, float r91, float r92, float r93, float r94, float r95, float r96, float r97, int r98, int r99, int r100, int r101, float r102, float r103, float r104, float r105, int r106, int r107, int r108, float r109, int r110, int r111, java.lang.Object r112) {
            if ((r110 & 1) == 0) goto L5;
            float r2 = -1.0f;
        L7:
            if ((r110 & 2) == 0) goto L9;
            boolean r4 = false;
        L11:
            if ((r110 & 4) == 0) goto L13;
            int r6 = -1;
        L15:
            if ((r110 & 8) == 0) goto L17;
            int r8 = -1;
        L19:
            if ((r110 & 16) == 0) goto L21;
            int r9 = -1;
        L23:
            if ((r110 & 32) == 0) goto L25;
            int r10 = -1;
        L26:
            long r12 = -1;
            if ((r110 & 64) == 0) goto L29;
            long r14 = -1;
        L31:
            if ((r110 & 128) == 0) goto L33;
            int r11 = -1;
        L35:
            if ((r110 & 256) == 0) goto L37;
            float r3 = -1.0f;
        L39:
            if ((r110 & 512) == 0) goto L41;
            long r16 = -1;
        L43:
            if ((r110 & 1024) == 0) goto L45;
            int r5 = -1;
        L47:
            if ((r110 & 2048) == 0) goto L49;
            long r18 = -1;
        L51:
            if ((r110 & 4096) != 0) goto L55;
            r12 = r67;
        L55:
            if ((r110 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
            float r7 = -1.0f;
        L58:
            float r20 = r2;
            if ((r110 & 16384) == 0) goto L61;
            float r22 = -1.0f;
        L63:
            if ((r110 & 32768) == 0) goto L65;
            float r222 = -1.0f;
        L67:
            if ((r110 & 65536) == 0) goto L69;
            float r24 = -1.0f;
        L71:
            if ((r110 & 131072) == 0) goto L73;
            float r26 = -1.0f;
        L74:
            boolean r28 = true;
            if ((r110 & 262144) == 0) goto L77;
            boolean r27 = true;
        L79:
            if ((r110 & 524288) == 0) goto L81;
            float r29 = -1.0f;
        L83:
            if ((r110 & 1048576) != 0) goto L87;
            r28 = r76;
        L87:
            if ((r110 & 2097152) == 0) goto L89;
            float r30 = -1.0f;
        L91:
            if ((r110 & 4194304) == 0) goto L93;
            float r31 = -1.0f;
        L95:
            if ((r110 & 8388608) == 0) goto L97;
            float r32 = -1.0f;
        L99:
            if ((r110 & 16777216) == 0) goto L101;
            float r33 = -1.0f;
        L103:
            if ((r110 & 33554432) == 0) goto L105;
            float r34 = -1.0f;
        L107:
            if ((r110 & 67108864) == 0) goto L109;
            float r35 = -1.0f;
        L111:
            if ((r110 & 134217728) == 0) goto L113;
            float r36 = -1.0f;
        L115:
            if ((r110 & 268435456) == 0) goto L117;
            float r37 = -1.0f;
        L119:
            if ((r110 & 536870912) == 0) goto L121;
            boolean r38 = false;
        L123:
            if ((r110 & Ints.MAX_POWER_OF_TWO) == 0) goto L125;
            float r39 = -1.0f;
        L127:
            if ((r110 & Integer.MIN_VALUE) == 0) goto L129;
            float r02 = -1.0f;
        L131:
            if ((r111 & 1) == 0) goto L133;
            int r40 = -1;
        L135:
            if ((r111 & 2) == 0) goto L137;
            int r41 = -1;
        L139:
            if ((r111 & 4) == 0) goto L141;
            float r42 = -1.0f;
        L143:
            if ((r111 & 8) == 0) goto L145;
            float r43 = -1.0f;
        L147:
            if ((r111 & 16) == 0) goto L149;
            float r44 = -1.0f;
        L151:
            if ((r111 & 32) == 0) goto L153;
            float r45 = -1.0f;
        L155:
            if ((r111 & 64) == 0) goto L157;
            float r46 = -1.0f;
        L158:
            float r522 = r02;
            if ((r111 & 128) == 0) goto L161;
            float r03 = -1.0f;
        L162:
            float r542 = r03;
            if ((r111 & 256) == 0) goto L165;
            float r04 = -1.0f;
        L166:
            float r552 = r04;
            if ((r111 & 512) == 0) goto L169;
            float r05 = -1.0f;
        L170:
            float r562 = r05;
            if ((r111 & 1024) == 0) goto L173;
            int r06 = -1;
        L174:
            int r572 = r06;
            if ((r111 & 2048) == 0) goto L177;
            int r07 = -1;
        L178:
            int r582 = r07;
            if ((r111 & 4096) == 0) goto L181;
            int r08 = -1;
        L182:
            int r59 = r08;
            if ((r111 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L185;
            int r09 = -1;
        L186:
            int r602 = r09;
            if ((r111 & 16384) == 0) goto L189;
            float r010 = -1.0f;
        L191:
            if ((r111 & 32768) == 0) goto L193;
            float r21 = -1.0f;
        L195:
            if ((r111 & 65536) == 0) goto L197;
            float r23 = -1.0f;
        L199:
            if ((r111 & 131072) == 0) goto L201;
            float r25 = -1.0f;
        L203:
            if ((r111 & 262144) == 0) goto L205;
            int r47 = -1;
        L207:
            if ((r111 & 524288) == 0) goto L209;
            int r48 = -1;
        L211:
            if ((r111 & 1048576) == 0) goto L213;
            int r49 = -1;
        L215:
            if ((r111 & 2097152) == 0) goto L218;
            float r1102 = -1.0f;
        L220:
            return r51.st2(r20, r4, r6, r8, r9, r10, r14, r11, r3, r16, r5, r18, r12, r7, r22, r222, r24, r26, r27, r29, r28, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r522, r40, r41, r42, r43, r44, r45, r46, r542, r552, r562, r572, r582, r59, r602, r010, r21, r23, r25, r47, r48, r49, r1102);
        L218:
            r1102 = r109;
            goto L220
        L213:
            r49 = r108;
            goto L215
        L209:
            r48 = r107;
            goto L211
        L205:
            r47 = r106;
            goto L207
        L201:
            r25 = r105;
            goto L203
        L197:
            r23 = r104;
            goto L199
        L193:
            r21 = r103;
            goto L195
        L189:
            r010 = r102;
            goto L191
        L185:
            r09 = r101;
            goto L186
        L181:
            r08 = r100;
            goto L182
        L177:
            r07 = r99;
            goto L178
        L173:
            r06 = r98;
            goto L174
        L169:
            r05 = r97;
            goto L170
        L165:
            r04 = r96;
            goto L166
        L161:
            r03 = r95;
            goto L162
        L157:
            r46 = r94;
            goto L158
        L153:
            r45 = r93;
            goto L155
        L149:
            r44 = r92;
            goto L151
        L145:
            r43 = r91;
            goto L147
        L141:
            r42 = r90;
            goto L143
        L137:
            r41 = r89;
            goto L139
        L133:
            r40 = r88;
            goto L135
        L129:
            r02 = r87;
            goto L131
        L125:
            r39 = r86;
            goto L127
        L121:
            r38 = r85;
            goto L123
        L117:
            r37 = r84;
            goto L119
        L113:
            r36 = r83;
            goto L115
        L109:
            r35 = r82;
            goto L111
        L105:
            r34 = r81;
            goto L107
        L101:
            r33 = r80;
            goto L103
        L97:
            r32 = r79;
            goto L99
        L93:
            r31 = r78;
            goto L95
        L89:
            r30 = r77;
            goto L91
        L81:
            r29 = r75;
            goto L83
        L77:
            r27 = r74;
            goto L79
        L73:
            r26 = r73;
            goto L74
        L69:
            r24 = r72;
            goto L71
        L65:
            r222 = r71;
            goto L67
        L61:
            r22 = r70;
            goto L63
        L57:
            r7 = r69;
            goto L58
        L49:
            r18 = r65;
            goto L51
        L45:
            r5 = r64;
            goto L47
        L41:
            r16 = r62;
            goto L43
        L37:
            r3 = r61;
            goto L39
        L33:
            r11 = r60;
            goto L35
        L29:
            r14 = r58;
            goto L31
        L25:
            r10 = r57;
            goto L26
        L21:
            r9 = r56;
            goto L23
        L17:
            r8 = r55;
            goto L19
        L13:
            r6 = r54;
            goto L15
        L9:
            r4 = r53;
            goto L11
        L5:
            r2 = r52;
            goto L7
        }

        public static /* synthetic */ ErrorCode sw$default(Companion r23, float r24, float r25, float r26, float r27, float r28, float r29, float r30, float r31, float r32, float r33, float r34, float r35, float r36, int r37, int r38, float r39, float r40, float r41, float r42, float r43, float r44, int r45, java.lang.Object r46) {
            float r2 = 1.0f;
            if ((r45 & 1) == 0) goto L5;
            float r1 = 1.0f;
        L7:
            if ((r45 & 2) == 0) goto L9;
            float r3 = 1.0f;
        L11:
            if ((r45 & 4) == 0) goto L13;
            float r4 = 1.0f;
        L15:
            if ((r45 & 8) == 0) goto L17;
            float r5 = 1.0f;
        L19:
            if ((r45 & 16) == 0) goto L21;
            float r6 = 1.0f;
        L23:
            if ((r45 & 32) == 0) goto L25;
            float r7 = 1.0f;
        L27:
            if ((r45 & 64) == 0) goto L29;
            float r8 = 1.0f;
        L31:
            if ((r45 & 128) == 0) goto L33;
            float r9 = 1.0f;
        L35:
            if ((r45 & 256) == 0) goto L37;
            float r10 = 1.0f;
        L39:
            if ((r45 & 512) == 0) goto L41;
            float r11 = 1.0f;
        L43:
            if ((r45 & 1024) == 0) goto L45;
            float r12 = 1.0f;
        L47:
            if ((r45 & 2048) == 0) goto L49;
            float r13 = 1.0f;
        L51:
            if ((r45 & 4096) != 0) goto L55;
            r2 = r36;
        L55:
            if ((r45 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
            int r14 = 30;
        L59:
            if ((r45 & 16384) == 0) goto L61;
            int r15 = 30;
        L63:
            if ((r45 & 32768) == 0) goto L65;
            float r16 = 0.8f;
        L67:
            if ((r45 & 65536) == 0) goto L69;
            float r18 = 0.94f;
        L71:
            if ((r45 & 131072) == 0) goto L73;
            float r19 = 0.0f;
        L75:
            if ((r45 & 262144) == 0) goto L77;
            float r20 = 0.02f;
        L79:
            if ((r45 & 524288) == 0) goto L81;
            float r21 = 0.9f;
        L83:
            if ((r45 & 1048576) == 0) goto L86;
            float r452 = 0.8f;
        L88:
            return r23.sw(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r2, r14, r15, r16, r18, r19, r20, r21, r452);
        L86:
            r452 = r44;
            goto L88
        L81:
            r21 = r43;
            goto L83
        L77:
            r20 = r42;
            goto L79
        L73:
            r19 = r41;
            goto L75
        L69:
            r18 = r40;
            goto L71
        L65:
            r16 = r39;
            goto L67
        L61:
            r15 = r38;
            goto L63
        L57:
            r14 = r37;
            goto L59
        L49:
            r13 = r35;
            goto L51
        L45:
            r12 = r34;
            goto L47
        L41:
            r11 = r33;
            goto L43
        L37:
            r10 = r32;
            goto L39
        L33:
            r9 = r31;
            goto L35
        L29:
            r8 = r30;
            goto L31
        L25:
            r7 = r29;
            goto L27
        L21:
            r6 = r28;
            goto L23
        L17:
            r5 = r27;
            goto L19
        L13:
            r4 = r26;
            goto L15
        L9:
            r3 = r25;
            goto L11
        L5:
            r1 = r24;
            goto L7
        }

        public static /* synthetic */ ErrorCode wi$default(Companion r1, AssetManager r2, String r3, String r4, int r5, float r6, int r7, int r8, int r9, int r10, int r11, int r12, java.lang.Object r13) {
            if ((r12 & 2) == 0) goto L6;
            r3 = "";
        L6:
            if ((r12 & 4) == 0) goto L9;
            r4 = "";
        L9:
            if ((r12 & 8) == 0) goto L12;
            r5 = 0;
        L12:
            if ((r12 & 16) == 0) goto L15;
            r6 = 1.0f;
        L15:
            return r1.wi(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11);
        }

        public final ErrorCode ci(CardType r1, int r2, Rotation r3, int r4, String r5, Context r6, String r7) {
            return Ojo.ci(r1, r2, r3, r4, r5, r6, r7);
        }

        public final ErrorCode df(byte[] r30, byte[] r31, byte[] r32, int r33, int r34, int r35, int r36, int r37, int r38, int r39, int r40, PixelFormat r41, DetectionResult r42) {
            p.l(r30, "yBuffer");
            p.l(r31, "uBuffer");
            p.l(r32, "vBuffer");
            p.l(r41, "pixelFormat");
            p.l(r42, "result");
            return df$default(this, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, false, false, false, false, false, false, false, 0, 0, null, 8380416, null);
        }

        public final ErrorCode di() {
            return Ojo.di();
        }

        public final ErrorCode ds(byte[] r18, byte[] r19, byte[] r20, int r21, int r22, int r23, int r24, int r25, int r26, int r27, int r28, PixelFormat r29) {
            p.l(r18, "yBuffer");
            p.l(r19, "uBuffer");
            p.l(r20, "vBuffer");
            p.l(r29, "pixelFormat");
            return ds$default(this, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, false, 4096, null);
        }

        public final ErrorCode dw(WakewordDetectionOptions r1, WakewordDetectionResult r2) {
            return Ojo.dw(r1, r2);
        }

        public final String ec(String r1) {
            return Ojo.ec(r1);
        }

        public final float[] gf() {
            return Ojo.gf();
        }

        public final String gl() {
            return Ojo.gl();
        }

        public final String gv() {
            return Ojo.gv();
        }

        public final String gz() {
            return Ojo.gz();
        }

        public final ErrorCode s1(String r1, String r2, String r3, int r4, boolean r5) {
            return Ojo.s1(r1, r2, r3, r4, r5);
        }

        public final ErrorCode s2(String r1, String r2, String r3, int r4, boolean r5) {
            return Ojo.s2(r1, r2, r3, r4, r5);
        }

        public final ErrorCode s3(String r1, String r2, String r3, int r4, boolean r5) {
            return Ojo.s3(r1, r2, r3, r4, r5);
        }

        public final ErrorCode sa(String r1, int r2) {
            return Ojo.sa(r1, r2);
        }

        public final ErrorCode sm(AssetManager r1, int r2, boolean r3) {
            return Ojo.sm(r1, r2, r3);
        }

        public final ErrorCode sr(Rect r1, int r2, int r3) {
            return Ojo.sr(r1, r2, r3);
        }

        public final ErrorCode st1() {
            return st1$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 65535, null);
        }

        public final ErrorCode st2() {
            return st2$default(this, 0.0f, false, 0, 0, 0, 0, 0, 0, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0.0f, -1, 4194303, null);
        }

        public final ErrorCode sw() {
            return sw$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2097151, null);
        }

        public final ErrorCode wd() {
            return Ojo.wd();
        }

        public final ErrorCode wi(AssetManager r1, String r2, String r3, int r4, float r5, int r6, int r7, int r8, int r9, int r10) {
            return Ojo.wi(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10);
        }

        private Companion() {
        }

        public static /* synthetic */ ErrorCode sm$default(Companion r02, AssetManager r1, int r2, boolean r3, int r4, java.lang.Object r5) {
            if ((r4 & 4) == 0) goto L6;
            r3 = true;
        L6:
            return r02.sm(r1, r2, r3);
        }

        public final ErrorCode df(byte[] r30, byte[] r31, byte[] r32, int r33, int r34, int r35, int r36, int r37, int r38, int r39, int r40, PixelFormat r41, DetectionResult r42, boolean r43) {
            p.l(r30, "yBuffer");
            p.l(r31, "uBuffer");
            p.l(r32, "vBuffer");
            p.l(r41, "pixelFormat");
            p.l(r42, "result");
            return df$default(this, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, false, false, false, false, false, false, 0, 0, null, 8372224, null);
        }

        public final ErrorCode ds(byte[] r1, byte[] r2, byte[] r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, PixelFormat r12, boolean r13) {
            return Ojo.ds(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13);
        }

        public final ErrorCode sm(String r1, int r2, boolean r3) {
            return Ojo.sm(r1, r2, r3);
        }

        public final ErrorCode st1(float r21) {
            return st1$default(this, r21, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 65534, null);
        }

        public final ErrorCode st2(float r64) {
            return st2$default(this, r64, false, 0, 0, 0, 0, 0, 0, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0.0f, -2, 4194303, null);
        }

        public final ErrorCode sw(float r26) {
            return sw$default(this, r26, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, CoroutineScheduler.MAX_SUPPORTED_POOL_SIZE, null);
        }

        public final ErrorCode df(byte[] r30, byte[] r31, byte[] r32, int r33, int r34, int r35, int r36, int r37, int r38, int r39, int r40, PixelFormat r41, DetectionResult r42, boolean r43, boolean r44) {
            p.l(r30, "yBuffer");
            p.l(r31, "uBuffer");
            p.l(r32, "vBuffer");
            p.l(r41, "pixelFormat");
            p.l(r42, "result");
            return df$default(this, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, false, false, false, false, false, 0, 0, null, 8355840, null);
        }

        public final ErrorCode st1(float r21, float r22) {
            return st1$default(this, r21, r22, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 65532, null);
        }

        public final ErrorCode st2(float r64, boolean r65) {
            return st2$default(this, r64, r65, 0, 0, 0, 0, 0, 0, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0.0f, -4, 4194303, null);
        }

        public final ErrorCode sw(float r26, float r27) {
            return sw$default(this, r26, r27, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2097148, null);
        }

        public final ErrorCode df(byte[] r30, byte[] r31, byte[] r32, int r33, int r34, int r35, int r36, int r37, int r38, int r39, int r40, PixelFormat r41, DetectionResult r42, boolean r43, boolean r44, boolean r45) {
            p.l(r30, "yBuffer");
            p.l(r31, "uBuffer");
            p.l(r32, "vBuffer");
            p.l(r41, "pixelFormat");
            p.l(r42, "result");
            return df$default(this, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, false, false, false, false, 0, 0, null, 8323072, null);
        }

        public final ErrorCode st1(float r21, float r22, float r23) {
            return st1$default(this, r21, r22, r23, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 65528, null);
        }

        public final ErrorCode st2(float r64, boolean r65, int r66) {
            return st2$default(this, r64, r65, r66, 0, 0, 0, 0, 0, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0.0f, -8, 4194303, null);
        }

        public final ErrorCode sw(float r26, float r27, float r28) {
            return sw$default(this, r26, r27, r28, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2097144, null);
        }

        public final ErrorCode df(byte[] r30, byte[] r31, byte[] r32, int r33, int r34, int r35, int r36, int r37, int r38, int r39, int r40, PixelFormat r41, DetectionResult r42, boolean r43, boolean r44, boolean r45, boolean r46) {
            p.l(r30, "yBuffer");
            p.l(r31, "uBuffer");
            p.l(r32, "vBuffer");
            p.l(r41, "pixelFormat");
            p.l(r42, "result");
            return df$default(this, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, false, false, false, 0, 0, null, 8257536, null);
        }

        public final ErrorCode st1(float r21, float r22, float r23, float r24) {
            return st1$default(this, r21, r22, r23, r24, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 65520, null);
        }

        public final ErrorCode st2(float r64, boolean r65, int r66, int r67) {
            return st2$default(this, r64, r65, r66, r67, 0, 0, 0, 0, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0.0f, -16, 4194303, null);
        }

        public final ErrorCode sw(float r26, float r27, float r28, float r29) {
            return sw$default(this, r26, r27, r28, r29, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2097136, null);
        }

        public final ErrorCode df(byte[] r30, byte[] r31, byte[] r32, int r33, int r34, int r35, int r36, int r37, int r38, int r39, int r40, PixelFormat r41, DetectionResult r42, boolean r43, boolean r44, boolean r45, boolean r46, boolean r47) {
            p.l(r30, "yBuffer");
            p.l(r31, "uBuffer");
            p.l(r32, "vBuffer");
            p.l(r41, "pixelFormat");
            p.l(r42, "result");
            return df$default(this, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, false, false, 0, 0, null, 8126464, null);
        }

        public final ErrorCode st1(float r21, float r22, float r23, float r24, float r25) {
            return st1$default(this, r21, r22, r23, r24, r25, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 65504, null);
        }

        public final ErrorCode st2(float r64, boolean r65, int r66, int r67, int r68) {
            return st2$default(this, r64, r65, r66, r67, r68, 0, 0, 0, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0.0f, -32, 4194303, null);
        }

        public final ErrorCode sw(float r26, float r27, float r28, float r29, float r30) {
            return sw$default(this, r26, r27, r28, r29, r30, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2097120, null);
        }

        public final ErrorCode df(byte[] r30, byte[] r31, byte[] r32, int r33, int r34, int r35, int r36, int r37, int r38, int r39, int r40, PixelFormat r41, DetectionResult r42, boolean r43, boolean r44, boolean r45, boolean r46, boolean r47, boolean r48) {
            p.l(r30, "yBuffer");
            p.l(r31, "uBuffer");
            p.l(r32, "vBuffer");
            p.l(r41, "pixelFormat");
            p.l(r42, "result");
            return df$default(this, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, false, 0, 0, null, 7864320, null);
        }

        public final ErrorCode st1(float r21, float r22, float r23, float r24, float r25, int r26) {
            return st1$default(this, r21, r22, r23, r24, r25, r26, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 65472, null);
        }

        public final ErrorCode st2(float r64, boolean r65, int r66, int r67, int r68, int r69) {
            return st2$default(this, r64, r65, r66, r67, r68, r69, 0, 0, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0.0f, -64, 4194303, null);
        }

        public final ErrorCode sw(float r26, float r27, float r28, float r29, float r30, float r31) {
            return sw$default(this, r26, r27, r28, r29, r30, r31, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2097088, null);
        }

        public final ErrorCode df(byte[] r30, byte[] r31, byte[] r32, int r33, int r34, int r35, int r36, int r37, int r38, int r39, int r40, PixelFormat r41, DetectionResult r42, boolean r43, boolean r44, boolean r45, boolean r46, boolean r47, boolean r48, boolean r49) {
            p.l(r30, "yBuffer");
            p.l(r31, "uBuffer");
            p.l(r32, "vBuffer");
            p.l(r41, "pixelFormat");
            p.l(r42, "result");
            return df$default(this, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, 0, 0, null, 7340032, null);
        }

        public final ErrorCode st1(float r21, float r22, float r23, float r24, float r25, int r26, int r27) {
            return st1$default(this, r21, r22, r23, r24, r25, r26, r27, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 65408, null);
        }

        public final ErrorCode st2(float r64, boolean r65, int r66, int r67, int r68, int r69, long r70) {
            return st2$default(this, r64, r65, r66, r67, r68, r69, r70, 0, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0.0f, -128, 4194303, null);
        }

        public final ErrorCode sw(float r26, float r27, float r28, float r29, float r30, float r31, float r32) {
            return sw$default(this, r26, r27, r28, r29, r30, r31, r32, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2097024, null);
        }

        public final ErrorCode df(byte[] r30, byte[] r31, byte[] r32, int r33, int r34, int r35, int r36, int r37, int r38, int r39, int r40, PixelFormat r41, DetectionResult r42, boolean r43, boolean r44, boolean r45, boolean r46, boolean r47, boolean r48, boolean r49, long r50) {
            p.l(r30, "yBuffer");
            p.l(r31, "uBuffer");
            p.l(r32, "vBuffer");
            p.l(r41, "pixelFormat");
            p.l(r42, "result");
            return df$default(this, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, 0, null, 6291456, null);
        }

        public final ErrorCode st1(float r21, float r22, float r23, float r24, float r25, int r26, int r27, float r28) {
            return st1$default(this, r21, r22, r23, r24, r25, r26, r27, r28, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 65280, null);
        }

        public final ErrorCode st2(float r64, boolean r65, int r66, int r67, int r68, int r69, long r70, int r72) {
            return st2$default(this, r64, r65, r66, r67, r68, r69, r70, r72, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0.0f, -256, 4194303, null);
        }

        public final ErrorCode sw(float r26, float r27, float r28, float r29, float r30, float r31, float r32, float r33) {
            return sw$default(this, r26, r27, r28, r29, r30, r31, r32, r33, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2096896, null);
        }

        public final ErrorCode df(byte[] r30, byte[] r31, byte[] r32, int r33, int r34, int r35, int r36, int r37, int r38, int r39, int r40, PixelFormat r41, DetectionResult r42, boolean r43, boolean r44, boolean r45, boolean r46, boolean r47, boolean r48, boolean r49, long r50, long r52) {
            p.l(r30, "yBuffer");
            p.l(r31, "uBuffer");
            p.l(r32, "vBuffer");
            p.l(r41, "pixelFormat");
            p.l(r42, "result");
            return df$default(this, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r52, null, 4194304, null);
        }

        public final ErrorCode st1(float r21, float r22, float r23, float r24, float r25, int r26, int r27, float r28, float r29) {
            return st1$default(this, r21, r22, r23, r24, r25, r26, r27, r28, r29, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 65024, null);
        }

        public final ErrorCode st2(float r64, boolean r65, int r66, int r67, int r68, int r69, long r70, int r72, float r73) {
            return st2$default(this, r64, r65, r66, r67, r68, r69, r70, r72, r73, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0.0f, -512, 4194303, null);
        }

        public final ErrorCode sw(float r26, float r27, float r28, float r29, float r30, float r31, float r32, float r33, float r34) {
            return sw$default(this, r26, r27, r28, r29, r30, r31, r32, r33, r34, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2096640, null);
        }

        public final ErrorCode df(byte[] r1, byte[] r2, byte[] r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, PixelFormat r12, DetectionResult r13, boolean r14, boolean r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20, long r21, long r23, String r25) {
            return Ojo.df(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r23, r25);
        }

        public final ErrorCode st1(float r21, float r22, float r23, float r24, float r25, int r26, int r27, float r28, float r29, float r30) {
            return st1$default(this, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, 0.0f, 0.0f, 0.0f, 0, 0, 0, 64512, null);
        }

        public final ErrorCode st2(float r64, boolean r65, int r66, int r67, int r68, int r69, long r70, int r72, float r73, long r74) {
            return st2$default(this, r64, r65, r66, r67, r68, r69, r70, r72, r73, r74, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0.0f, -1024, 4194303, null);
        }

        public final ErrorCode sw(float r26, float r27, float r28, float r29, float r30, float r31, float r32, float r33, float r34, float r35) {
            return sw$default(this, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2096128, null);
        }

        public final ErrorCode st1(float r21, float r22, float r23, float r24, float r25, int r26, int r27, float r28, float r29, float r30, float r31) {
            return st1$default(this, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, 0.0f, 0.0f, 0, 0, 0, 63488, null);
        }

        public final ErrorCode st2(float r64, boolean r65, int r66, int r67, int r68, int r69, long r70, int r72, float r73, long r74, int r76) {
            return st2$default(this, r64, r65, r66, r67, r68, r69, r70, r72, r73, r74, r76, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0.0f, -2048, 4194303, null);
        }

        public final ErrorCode sw(float r26, float r27, float r28, float r29, float r30, float r31, float r32, float r33, float r34, float r35, float r36) {
            return sw$default(this, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2095104, null);
        }

        public final ErrorCode st1(float r21, float r22, float r23, float r24, float r25, int r26, int r27, float r28, float r29, float r30, float r31, float r32) {
            return st1$default(this, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, 0.0f, 0, 0, 0, 61440, null);
        }

        public final ErrorCode st2(float r64, boolean r65, int r66, int r67, int r68, int r69, long r70, int r72, float r73, long r74, int r76, long r77) {
            return st2$default(this, r64, r65, r66, r67, r68, r69, r70, r72, r73, r74, r76, r77, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0.0f, -4096, 4194303, null);
        }

        public final ErrorCode sw(float r26, float r27, float r28, float r29, float r30, float r31, float r32, float r33, float r34, float r35, float r36, float r37) {
            return sw$default(this, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2093056, null);
        }

        public final ErrorCode st1(float r21, float r22, float r23, float r24, float r25, int r26, int r27, float r28, float r29, float r30, float r31, float r32, float r33) {
            return st1$default(this, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, 0, 0, 0, 57344, null);
        }

        public final ErrorCode st2(float r64, boolean r65, int r66, int r67, int r68, int r69, long r70, int r72, float r73, long r74, int r76, long r77, long r79) {
            return st2$default(this, r64, r65, r66, r67, r68, r69, r70, r72, r73, r74, r76, r77, r79, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0.0f, -8192, 4194303, null);
        }

        public final ErrorCode sw(float r26, float r27, float r28, float r29, float r30, float r31, float r32, float r33, float r34, float r35, float r36, float r37, float r38) {
            return sw$default(this, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2088960, null);
        }

        public final ErrorCode st1(float r21, float r22, float r23, float r24, float r25, int r26, int r27, float r28, float r29, float r30, float r31, float r32, float r33, int r34) {
            return st1$default(this, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, 0, 0, 49152, null);
        }

        public final ErrorCode st2(float r64, boolean r65, int r66, int r67, int r68, int r69, long r70, int r72, float r73, long r74, int r76, long r77, long r79, float r81) {
            return st2$default(this, r64, r65, r66, r67, r68, r69, r70, r72, r73, r74, r76, r77, r79, r81, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0.0f, -16384, 4194303, null);
        }

        public final ErrorCode sw(float r26, float r27, float r28, float r29, float r30, float r31, float r32, float r33, float r34, float r35, float r36, float r37, float r38, int r39) {
            return sw$default(this, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2080768, null);
        }

        public final ErrorCode st1(float r21, float r22, float r23, float r24, float r25, int r26, int r27, float r28, float r29, float r30, float r31, float r32, float r33, int r34, int r35) {
            return st1$default(this, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, 0, 32768, null);
        }

        public final ErrorCode st2(float r64, boolean r65, int r66, int r67, int r68, int r69, long r70, int r72, float r73, long r74, int r76, long r77, long r79, float r81, float r82) {
            return st2$default(this, r64, r65, r66, r67, r68, r69, r70, r72, r73, r74, r76, r77, r79, r81, r82, 0.0f, 0.0f, 0.0f, false, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0.0f, -32768, 4194303, null);
        }

        public final ErrorCode sw(float r26, float r27, float r28, float r29, float r30, float r31, float r32, float r33, float r34, float r35, float r36, float r37, float r38, int r39, int r40) {
            return sw$default(this, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2064384, null);
        }

        public final ErrorCode st1(float r1, float r2, float r3, float r4, float r5, int r6, int r7, float r8, float r9, float r10, float r11, float r12, float r13, int r14, int r15, int r16) {
            return Ojo.st1(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16);
        }

        public final ErrorCode st2(float r64, boolean r65, int r66, int r67, int r68, int r69, long r70, int r72, float r73, long r74, int r76, long r77, long r79, float r81, float r82, float r83) {
            return st2$default(this, r64, r65, r66, r67, r68, r69, r70, r72, r73, r74, r76, r77, r79, r81, r82, r83, 0.0f, 0.0f, false, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0.0f, -65536, 4194303, null);
        }

        public final ErrorCode sw(float r26, float r27, float r28, float r29, float r30, float r31, float r32, float r33, float r34, float r35, float r36, float r37, float r38, int r39, int r40, float r41) {
            return sw$default(this, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2031616, null);
        }

        public final ErrorCode st2(float r64, boolean r65, int r66, int r67, int r68, int r69, long r70, int r72, float r73, long r74, int r76, long r77, long r79, float r81, float r82, float r83, float r84) {
            return st2$default(this, r64, r65, r66, r67, r68, r69, r70, r72, r73, r74, r76, r77, r79, r81, r82, r83, r84, 0.0f, false, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0.0f, -131072, 4194303, null);
        }

        public final ErrorCode sw(float r26, float r27, float r28, float r29, float r30, float r31, float r32, float r33, float r34, float r35, float r36, float r37, float r38, int r39, int r40, float r41, float r42) {
            return sw$default(this, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, 0.0f, 0.0f, 0.0f, 0.0f, 1966080, null);
        }

        public final ErrorCode st2(float r64, boolean r65, int r66, int r67, int r68, int r69, long r70, int r72, float r73, long r74, int r76, long r77, long r79, float r81, float r82, float r83, float r84, float r85) {
            return st2$default(this, r64, r65, r66, r67, r68, r69, r70, r72, r73, r74, r76, r77, r79, r81, r82, r83, r84, r85, false, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0.0f, -262144, 4194303, null);
        }

        public final ErrorCode sw(float r26, float r27, float r28, float r29, float r30, float r31, float r32, float r33, float r34, float r35, float r36, float r37, float r38, int r39, int r40, float r41, float r42, float r43) {
            return sw$default(this, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, 0.0f, 0.0f, 0.0f, 1835008, null);
        }

        public final ErrorCode st2(float r64, boolean r65, int r66, int r67, int r68, int r69, long r70, int r72, float r73, long r74, int r76, long r77, long r79, float r81, float r82, float r83, float r84, float r85, boolean r86) {
            return st2$default(this, r64, r65, r66, r67, r68, r69, r70, r72, r73, r74, r76, r77, r79, r81, r82, r83, r84, r85, r86, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0.0f, -524288, 4194303, null);
        }

        public final ErrorCode sw(float r26, float r27, float r28, float r29, float r30, float r31, float r32, float r33, float r34, float r35, float r36, float r37, float r38, int r39, int r40, float r41, float r42, float r43, float r44) {
            return sw$default(this, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, 0.0f, 0.0f, 1572864, null);
        }

        public final ErrorCode st2(float r64, boolean r65, int r66, int r67, int r68, int r69, long r70, int r72, float r73, long r74, int r76, long r77, long r79, float r81, float r82, float r83, float r84, float r85, boolean r86, float r87) {
            return st2$default(this, r64, r65, r66, r67, r68, r69, r70, r72, r73, r74, r76, r77, r79, r81, r82, r83, r84, r85, r86, r87, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0.0f, -1048576, 4194303, null);
        }

        public final ErrorCode sw(float r26, float r27, float r28, float r29, float r30, float r31, float r32, float r33, float r34, float r35, float r36, float r37, float r38, int r39, int r40, float r41, float r42, float r43, float r44, float r45) {
            return sw$default(this, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, 0.0f, 1048576, null);
        }

        public final ErrorCode st2(float r64, boolean r65, int r66, int r67, int r68, int r69, long r70, int r72, float r73, long r74, int r76, long r77, long r79, float r81, float r82, float r83, float r84, float r85, boolean r86, float r87, boolean r88) {
            return st2$default(this, r64, r65, r66, r67, r68, r69, r70, r72, r73, r74, r76, r77, r79, r81, r82, r83, r84, r85, r86, r87, r88, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0.0f, -2097152, 4194303, null);
        }

        public final ErrorCode sw(float r1, float r2, float r3, float r4, float r5, float r6, float r7, float r8, float r9, float r10, float r11, float r12, float r13, int r14, int r15, float r16, float r17, float r18, float r19, float r20, float r21) {
            return Ojo.sw(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21);
        }

        public final ErrorCode st2(float r64, boolean r65, int r66, int r67, int r68, int r69, long r70, int r72, float r73, long r74, int r76, long r77, long r79, float r81, float r82, float r83, float r84, float r85, boolean r86, float r87, boolean r88, float r89) {
            return st2$default(this, r64, r65, r66, r67, r68, r69, r70, r72, r73, r74, r76, r77, r79, r81, r82, r83, r84, r85, r86, r87, r88, r89, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0.0f, -4194304, 4194303, null);
        }

        public final ErrorCode st2(float r64, boolean r65, int r66, int r67, int r68, int r69, long r70, int r72, float r73, long r74, int r76, long r77, long r79, float r81, float r82, float r83, float r84, float r85, boolean r86, float r87, boolean r88, float r89, float r90) {
            return st2$default(this, r64, r65, r66, r67, r68, r69, r70, r72, r73, r74, r76, r77, r79, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0.0f, -8388608, 4194303, null);
        }

        public final ErrorCode st2(float r64, boolean r65, int r66, int r67, int r68, int r69, long r70, int r72, float r73, long r74, int r76, long r77, long r79, float r81, float r82, float r83, float r84, float r85, boolean r86, float r87, boolean r88, float r89, float r90, float r91) {
            return st2$default(this, r64, r65, r66, r67, r68, r69, r70, r72, r73, r74, r76, r77, r79, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0.0f, -16777216, 4194303, null);
        }

        public final ErrorCode st2(float r64, boolean r65, int r66, int r67, int r68, int r69, long r70, int r72, float r73, long r74, int r76, long r77, long r79, float r81, float r82, float r83, float r84, float r85, boolean r86, float r87, boolean r88, float r89, float r90, float r91, float r92) {
            return st2$default(this, r64, r65, r66, r67, r68, r69, r70, r72, r73, r74, r76, r77, r79, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0.0f, -33554432, 4194303, null);
        }

        public final ErrorCode st2(float r64, boolean r65, int r66, int r67, int r68, int r69, long r70, int r72, float r73, long r74, int r76, long r77, long r79, float r81, float r82, float r83, float r84, float r85, boolean r86, float r87, boolean r88, float r89, float r90, float r91, float r92, float r93) {
            return st2$default(this, r64, r65, r66, r67, r68, r69, r70, r72, r73, r74, r76, r77, r79, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0.0f, -67108864, 4194303, null);
        }

        public final ErrorCode st2(float r64, boolean r65, int r66, int r67, int r68, int r69, long r70, int r72, float r73, long r74, int r76, long r77, long r79, float r81, float r82, float r83, float r84, float r85, boolean r86, float r87, boolean r88, float r89, float r90, float r91, float r92, float r93, float r94) {
            return st2$default(this, r64, r65, r66, r67, r68, r69, r70, r72, r73, r74, r76, r77, r79, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0.0f, -134217728, 4194303, null);
        }

        public final ErrorCode st2(float r64, boolean r65, int r66, int r67, int r68, int r69, long r70, int r72, float r73, long r74, int r76, long r77, long r79, float r81, float r82, float r83, float r84, float r85, boolean r86, float r87, boolean r88, float r89, float r90, float r91, float r92, float r93, float r94, float r95) {
            return st2$default(this, r64, r65, r66, r67, r68, r69, r70, r72, r73, r74, r76, r77, r79, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, 0.0f, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0.0f, -268435456, 4194303, null);
        }

        public final ErrorCode st2(float r64, boolean r65, int r66, int r67, int r68, int r69, long r70, int r72, float r73, long r74, int r76, long r77, long r79, float r81, float r82, float r83, float r84, float r85, boolean r86, float r87, boolean r88, float r89, float r90, float r91, float r92, float r93, float r94, float r95, float r96) {
            return st2$default(this, r64, r65, r66, r67, r68, r69, r70, r72, r73, r74, r76, r77, r79, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0.0f, -536870912, 4194303, null);
        }

        public final ErrorCode st2(float r64, boolean r65, int r66, int r67, int r68, int r69, long r70, int r72, float r73, long r74, int r76, long r77, long r79, float r81, float r82, float r83, float r84, float r85, boolean r86, float r87, boolean r88, float r89, float r90, float r91, float r92, float r93, float r94, float r95, float r96, boolean r97) {
            return st2$default(this, r64, r65, r66, r67, r68, r69, r70, r72, r73, r74, r76, r77, r79, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0.0f, -1073741824, 4194303, null);
        }

        public final ErrorCode st2(float r64, boolean r65, int r66, int r67, int r68, int r69, long r70, int r72, float r73, long r74, int r76, long r77, long r79, float r81, float r82, float r83, float r84, float r85, boolean r86, float r87, boolean r88, float r89, float r90, float r91, float r92, float r93, float r94, float r95, float r96, boolean r97, float r98) {
            return st2$default(this, r64, r65, r66, r67, r68, r69, r70, r72, r73, r74, r76, r77, r79, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0.0f, Integer.MIN_VALUE, 4194303, null);
        }

        public final ErrorCode st2(float r64, boolean r65, int r66, int r67, int r68, int r69, long r70, int r72, float r73, long r74, int r76, long r77, long r79, float r81, float r82, float r83, float r84, float r85, boolean r86, float r87, boolean r88, float r89, float r90, float r91, float r92, float r93, float r94, float r95, float r96, boolean r97, float r98, float r99) {
            return st2$default(this, r64, r65, r66, r67, r68, r69, r70, r72, r73, r74, r76, r77, r79, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0.0f, 0, 4194303, null);
        }

        public final ErrorCode st2(float r64, boolean r65, int r66, int r67, int r68, int r69, long r70, int r72, float r73, long r74, int r76, long r77, long r79, float r81, float r82, float r83, float r84, float r85, boolean r86, float r87, boolean r88, float r89, float r90, float r91, float r92, float r93, float r94, float r95, float r96, boolean r97, float r98, float r99, int r100) {
            return st2$default(this, r64, r65, r66, r67, r68, r69, r70, r72, r73, r74, r76, r77, r79, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0.0f, 0, 4194302, null);
        }

        public final ErrorCode st2(float r64, boolean r65, int r66, int r67, int r68, int r69, long r70, int r72, float r73, long r74, int r76, long r77, long r79, float r81, float r82, float r83, float r84, float r85, boolean r86, float r87, boolean r88, float r89, float r90, float r91, float r92, float r93, float r94, float r95, float r96, boolean r97, float r98, float r99, int r100, int r101) {
            return st2$default(this, r64, r65, r66, r67, r68, r69, r70, r72, r73, r74, r76, r77, r79, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0.0f, 0, 4194300, null);
        }

        public final ErrorCode st2(float r64, boolean r65, int r66, int r67, int r68, int r69, long r70, int r72, float r73, long r74, int r76, long r77, long r79, float r81, float r82, float r83, float r84, float r85, boolean r86, float r87, boolean r88, float r89, float r90, float r91, float r92, float r93, float r94, float r95, float r96, boolean r97, float r98, float r99, int r100, int r101, float r102) {
            return st2$default(this, r64, r65, r66, r67, r68, r69, r70, r72, r73, r74, r76, r77, r79, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0.0f, 0, 4194296, null);
        }

        public final ErrorCode st2(float r64, boolean r65, int r66, int r67, int r68, int r69, long r70, int r72, float r73, long r74, int r76, long r77, long r79, float r81, float r82, float r83, float r84, float r85, boolean r86, float r87, boolean r88, float r89, float r90, float r91, float r92, float r93, float r94, float r95, float r96, boolean r97, float r98, float r99, int r100, int r101, float r102, float r103) {
            return st2$default(this, r64, r65, r66, r67, r68, r69, r70, r72, r73, r74, r76, r77, r79, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0.0f, 0, 4194288, null);
        }

        public final ErrorCode st2(float r64, boolean r65, int r66, int r67, int r68, int r69, long r70, int r72, float r73, long r74, int r76, long r77, long r79, float r81, float r82, float r83, float r84, float r85, boolean r86, float r87, boolean r88, float r89, float r90, float r91, float r92, float r93, float r94, float r95, float r96, boolean r97, float r98, float r99, int r100, int r101, float r102, float r103, float r104) {
            return st2$default(this, r64, r65, r66, r67, r68, r69, r70, r72, r73, r74, r76, r77, r79, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0.0f, 0, 4194272, null);
        }

        public final ErrorCode st2(float r64, boolean r65, int r66, int r67, int r68, int r69, long r70, int r72, float r73, long r74, int r76, long r77, long r79, float r81, float r82, float r83, float r84, float r85, boolean r86, float r87, boolean r88, float r89, float r90, float r91, float r92, float r93, float r94, float r95, float r96, boolean r97, float r98, float r99, int r100, int r101, float r102, float r103, float r104, float r105) {
            return st2$default(this, r64, r65, r66, r67, r68, r69, r70, r72, r73, r74, r76, r77, r79, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0.0f, 0, 4194240, null);
        }

        public final ErrorCode st2(float r64, boolean r65, int r66, int r67, int r68, int r69, long r70, int r72, float r73, long r74, int r76, long r77, long r79, float r81, float r82, float r83, float r84, float r85, boolean r86, float r87, boolean r88, float r89, float r90, float r91, float r92, float r93, float r94, float r95, float r96, boolean r97, float r98, float r99, int r100, int r101, float r102, float r103, float r104, float r105, float r106) {
            return st2$default(this, r64, r65, r66, r67, r68, r69, r70, r72, r73, r74, r76, r77, r79, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0.0f, 0, 4194176, null);
        }

        public final ErrorCode st2(float r64, boolean r65, int r66, int r67, int r68, int r69, long r70, int r72, float r73, long r74, int r76, long r77, long r79, float r81, float r82, float r83, float r84, float r85, boolean r86, float r87, boolean r88, float r89, float r90, float r91, float r92, float r93, float r94, float r95, float r96, boolean r97, float r98, float r99, int r100, int r101, float r102, float r103, float r104, float r105, float r106, float r107) {
            return st2$default(this, r64, r65, r66, r67, r68, r69, r70, r72, r73, r74, r76, r77, r79, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0.0f, 0, 4194048, null);
        }

        public final ErrorCode st2(float r64, boolean r65, int r66, int r67, int r68, int r69, long r70, int r72, float r73, long r74, int r76, long r77, long r79, float r81, float r82, float r83, float r84, float r85, boolean r86, float r87, boolean r88, float r89, float r90, float r91, float r92, float r93, float r94, float r95, float r96, boolean r97, float r98, float r99, int r100, int r101, float r102, float r103, float r104, float r105, float r106, float r107, float r108) {
            return st2$default(this, r64, r65, r66, r67, r68, r69, r70, r72, r73, r74, r76, r77, r79, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0.0f, 0, 4193792, null);
        }

        public final ErrorCode st2(float r64, boolean r65, int r66, int r67, int r68, int r69, long r70, int r72, float r73, long r74, int r76, long r77, long r79, float r81, float r82, float r83, float r84, float r85, boolean r86, float r87, boolean r88, float r89, float r90, float r91, float r92, float r93, float r94, float r95, float r96, boolean r97, float r98, float r99, int r100, int r101, float r102, float r103, float r104, float r105, float r106, float r107, float r108, float r109) {
            return st2$default(this, r64, r65, r66, r67, r68, r69, r70, r72, r73, r74, r76, r77, r79, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0.0f, 0, 4193280, null);
        }

        public final ErrorCode st2(float r64, boolean r65, int r66, int r67, int r68, int r69, long r70, int r72, float r73, long r74, int r76, long r77, long r79, float r81, float r82, float r83, float r84, float r85, boolean r86, float r87, boolean r88, float r89, float r90, float r91, float r92, float r93, float r94, float r95, float r96, boolean r97, float r98, float r99, int r100, int r101, float r102, float r103, float r104, float r105, float r106, float r107, float r108, float r109, int r110) {
            return st2$default(this, r64, r65, r66, r67, r68, r69, r70, r72, r73, r74, r76, r77, r79, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0.0f, 0, 4192256, null);
        }

        public final ErrorCode st2(float r64, boolean r65, int r66, int r67, int r68, int r69, long r70, int r72, float r73, long r74, int r76, long r77, long r79, float r81, float r82, float r83, float r84, float r85, boolean r86, float r87, boolean r88, float r89, float r90, float r91, float r92, float r93, float r94, float r95, float r96, boolean r97, float r98, float r99, int r100, int r101, float r102, float r103, float r104, float r105, float r106, float r107, float r108, float r109, int r110, int r111) {
            return st2$default(this, r64, r65, r66, r67, r68, r69, r70, r72, r73, r74, r76, r77, r79, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110, r111, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0.0f, 0, 4190208, null);
        }

        public final ErrorCode st2(float r64, boolean r65, int r66, int r67, int r68, int r69, long r70, int r72, float r73, long r74, int r76, long r77, long r79, float r81, float r82, float r83, float r84, float r85, boolean r86, float r87, boolean r88, float r89, float r90, float r91, float r92, float r93, float r94, float r95, float r96, boolean r97, float r98, float r99, int r100, int r101, float r102, float r103, float r104, float r105, float r106, float r107, float r108, float r109, int r110, int r111, int r112) {
            return st2$default(this, r64, r65, r66, r67, r68, r69, r70, r72, r73, r74, r76, r77, r79, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110, r111, r112, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0.0f, 0, 4186112, null);
        }

        public final ErrorCode st2(float r64, boolean r65, int r66, int r67, int r68, int r69, long r70, int r72, float r73, long r74, int r76, long r77, long r79, float r81, float r82, float r83, float r84, float r85, boolean r86, float r87, boolean r88, float r89, float r90, float r91, float r92, float r93, float r94, float r95, float r96, boolean r97, float r98, float r99, int r100, int r101, float r102, float r103, float r104, float r105, float r106, float r107, float r108, float r109, int r110, int r111, int r112, int r113) {
            return st2$default(this, r64, r65, r66, r67, r68, r69, r70, r72, r73, r74, r76, r77, r79, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110, r111, r112, r113, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0.0f, 0, 4177920, null);
        }

        public final ErrorCode st2(float r64, boolean r65, int r66, int r67, int r68, int r69, long r70, int r72, float r73, long r74, int r76, long r77, long r79, float r81, float r82, float r83, float r84, float r85, boolean r86, float r87, boolean r88, float r89, float r90, float r91, float r92, float r93, float r94, float r95, float r96, boolean r97, float r98, float r99, int r100, int r101, float r102, float r103, float r104, float r105, float r106, float r107, float r108, float r109, int r110, int r111, int r112, int r113, float r114) {
            return st2$default(this, r64, r65, r66, r67, r68, r69, r70, r72, r73, r74, r76, r77, r79, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110, r111, r112, r113, r114, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0.0f, 0, 4161536, null);
        }

        public final ErrorCode st2(float r64, boolean r65, int r66, int r67, int r68, int r69, long r70, int r72, float r73, long r74, int r76, long r77, long r79, float r81, float r82, float r83, float r84, float r85, boolean r86, float r87, boolean r88, float r89, float r90, float r91, float r92, float r93, float r94, float r95, float r96, boolean r97, float r98, float r99, int r100, int r101, float r102, float r103, float r104, float r105, float r106, float r107, float r108, float r109, int r110, int r111, int r112, int r113, float r114, float r115) {
            return st2$default(this, r64, r65, r66, r67, r68, r69, r70, r72, r73, r74, r76, r77, r79, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110, r111, r112, r113, r114, r115, 0.0f, 0.0f, 0, 0, 0, 0.0f, 0, 4128768, null);
        }

        public final ErrorCode st2(float r64, boolean r65, int r66, int r67, int r68, int r69, long r70, int r72, float r73, long r74, int r76, long r77, long r79, float r81, float r82, float r83, float r84, float r85, boolean r86, float r87, boolean r88, float r89, float r90, float r91, float r92, float r93, float r94, float r95, float r96, boolean r97, float r98, float r99, int r100, int r101, float r102, float r103, float r104, float r105, float r106, float r107, float r108, float r109, int r110, int r111, int r112, int r113, float r114, float r115, float r116) {
            return st2$default(this, r64, r65, r66, r67, r68, r69, r70, r72, r73, r74, r76, r77, r79, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110, r111, r112, r113, r114, r115, r116, 0.0f, 0, 0, 0, 0.0f, 0, 4063232, null);
        }

        public final ErrorCode st2(float r64, boolean r65, int r66, int r67, int r68, int r69, long r70, int r72, float r73, long r74, int r76, long r77, long r79, float r81, float r82, float r83, float r84, float r85, boolean r86, float r87, boolean r88, float r89, float r90, float r91, float r92, float r93, float r94, float r95, float r96, boolean r97, float r98, float r99, int r100, int r101, float r102, float r103, float r104, float r105, float r106, float r107, float r108, float r109, int r110, int r111, int r112, int r113, float r114, float r115, float r116, float r117) {
            return st2$default(this, r64, r65, r66, r67, r68, r69, r70, r72, r73, r74, r76, r77, r79, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110, r111, r112, r113, r114, r115, r116, r117, 0, 0, 0, 0.0f, 0, 3932160, null);
        }

        public final ErrorCode st2(float r64, boolean r65, int r66, int r67, int r68, int r69, long r70, int r72, float r73, long r74, int r76, long r77, long r79, float r81, float r82, float r83, float r84, float r85, boolean r86, float r87, boolean r88, float r89, float r90, float r91, float r92, float r93, float r94, float r95, float r96, boolean r97, float r98, float r99, int r100, int r101, float r102, float r103, float r104, float r105, float r106, float r107, float r108, float r109, int r110, int r111, int r112, int r113, float r114, float r115, float r116, float r117, int r118) {
            return st2$default(this, r64, r65, r66, r67, r68, r69, r70, r72, r73, r74, r76, r77, r79, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110, r111, r112, r113, r114, r115, r116, r117, r118, 0, 0, 0.0f, 0, 3670016, null);
        }

        public final ErrorCode st2(float r64, boolean r65, int r66, int r67, int r68, int r69, long r70, int r72, float r73, long r74, int r76, long r77, long r79, float r81, float r82, float r83, float r84, float r85, boolean r86, float r87, boolean r88, float r89, float r90, float r91, float r92, float r93, float r94, float r95, float r96, boolean r97, float r98, float r99, int r100, int r101, float r102, float r103, float r104, float r105, float r106, float r107, float r108, float r109, int r110, int r111, int r112, int r113, float r114, float r115, float r116, float r117, int r118, int r119) {
            return st2$default(this, r64, r65, r66, r67, r68, r69, r70, r72, r73, r74, r76, r77, r79, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110, r111, r112, r113, r114, r115, r116, r117, r118, r119, 0, 0.0f, 0, 3145728, null);
        }

        public final ErrorCode st2(float r64, boolean r65, int r66, int r67, int r68, int r69, long r70, int r72, float r73, long r74, int r76, long r77, long r79, float r81, float r82, float r83, float r84, float r85, boolean r86, float r87, boolean r88, float r89, float r90, float r91, float r92, float r93, float r94, float r95, float r96, boolean r97, float r98, float r99, int r100, int r101, float r102, float r103, float r104, float r105, float r106, float r107, float r108, float r109, int r110, int r111, int r112, int r113, float r114, float r115, float r116, float r117, int r118, int r119, int r120) {
            return st2$default(this, r64, r65, r66, r67, r68, r69, r70, r72, r73, r74, r76, r77, r79, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110, r111, r112, r113, r114, r115, r116, r117, r118, r119, r120, 0.0f, 0, 2097152, null);
        }

        public final ErrorCode st2(float r1, boolean r2, int r3, int r4, int r5, int r6, long r7, int r9, float r10, long r11, int r13, long r14, long r16, float r18, float r19, float r20, float r21, float r22, boolean r23, float r24, boolean r25, float r26, float r27, float r28, float r29, float r30, float r31, float r32, float r33, boolean r34, float r35, float r36, int r37, int r38, float r39, float r40, float r41, float r42, float r43, float r44, float r45, float r46, int r47, int r48, int r49, int r50, float r51, float r52, float r53, float r54, int r55, int r56, int r57, float r58) {
            return Ojo.st2(r1, r2, r3, r4, r5, r6, r7, r9, r10, r11, r13, r14, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58);
        }
    }

    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b0\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0004\b\f\u0010\rR\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R(\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u0007\u0010\u001bR\"\u0010\u001d\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010$\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010%\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)R\"\u0010-\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010%\u001a\u0004\b.\u0010'\"\u0004\b/\u0010)R\"\u00100\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010%\u001a\u0004\b1\u0010'\"\u0004\b2\u0010)R\"\u00103\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010%\u001a\u0004\b4\u0010'\"\u0004\b5\u0010)R\"\u00106\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010%\u001a\u0004\b7\u0010'\"\u0004\b8\u0010)R\"\u00109\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010%\u001a\u0004\b:\u0010'\"\u0004\b;\u0010)R\"\u0010<\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010%\u001a\u0004\b=\u0010'\"\u0004\b>\u0010)R\"\u0010?\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010%\u001a\u0004\b@\u0010'\"\u0004\bA\u0010)R\"\u0010B\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010%\u001a\u0004\bC\u0010'\"\u0004\bD\u0010)R\"\u0010E\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010%\u001a\u0004\bF\u0010'\"\u0004\bG\u0010)R\"\u0010H\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010%\u001a\u0004\bI\u0010'\"\u0004\bJ\u0010)R\"\u0010K\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010%\u001a\u0004\bL\u0010'\"\u0004\bM\u0010)R\"\u0010N\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010\u0010\u001a\u0004\bO\u0010\u0012\"\u0004\bP\u0010\u0014R\"\u0010Q\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010%\u001a\u0004\bR\u0010'\"\u0004\bS\u0010)R\"\u0010U\u001a\u00020T8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\"\u0010[\u001a\u00020T8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010V\u001a\u0004\b\\\u0010X\"\u0004\b]\u0010ZR\"\u0010^\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR(\u0010e\u001a\b\u0012\u0004\u0012\u00020d0\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010\u0018\u001a\u0004\bf\u0010\u001a\"\u0004\b\t\u0010\u001bR\"\u0010g\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bg\u0010_\u001a\u0004\bh\u0010a\"\u0004\bi\u0010cR\"\u0010k\u001a\u00020j8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\"\u0010q\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010%\u001a\u0004\br\u0010'\"\u0004\bs\u0010)¨\u0006t"}, d2 = {"Lcom/gojek/ojosdk/Ojo$DetectionResult;", "", "<init>", "()V", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lkotlin/w;", "setFaces", "([I)V", "setObjects", "Ljava/util/HashMap;", "", "toHashMap", "()Ljava/util/HashMap;", "", "zoom", "I", "getZoom", "()I", "setZoom", "(I)V", "Ljava/util/ArrayList;", "Lcom/gojek/ojosdk/Ojo$Face;", "faces", "Ljava/util/ArrayList;", "getFaces", "()Ljava/util/ArrayList;", "(Ljava/util/ArrayList;)V", "Lcom/gojek/ojosdk/Ojo$FacePose;", "facePose", "Lcom/gojek/ojosdk/Ojo$FacePose;", "getFacePose", "()Lcom/gojek/ojosdk/Ojo$FacePose;", "setFacePose", "(Lcom/gojek/ojosdk/Ojo$FacePose;)V", "", "okScore", "F", "getOkScore", "()F", "setOkScore", "(F)V", "blurScore", "getBlurScore", "setBlurScore", "blockScore", "getBlockScore", "setBlockScore", "lowlightScore", "getLowlightScore", "setLowlightScore", "highlightScore", "getHighlightScore", "setHighlightScore", "backlightScore", "getBacklightScore", "setBacklightScore", "damagedScore", "getDamagedScore", "setDamagedScore", "blurScoreRaw", "getBlurScoreRaw", "setBlurScoreRaw", "blockScoreRaw", "getBlockScoreRaw", "setBlockScoreRaw", "lowlightScoreRaw", "getLowlightScoreRaw", "setLowlightScoreRaw", "highlightScoreRaw", "getHighlightScoreRaw", "setHighlightScoreRaw", "damagedScoreRaw", "getDamagedScoreRaw", "setDamagedScoreRaw", "backlightScoreRaw", "getBacklightScoreRaw", "setBacklightScoreRaw", "zoomRaw", "getZoomRaw", "setZoomRaw", com.clevertap.android.sdk.Constants.INAPP_ASPECT_RATIO, "getAspectRatio", "setAspectRatio", "Lcom/gojek/ojosdk/Ojo$Status;", NotificationCompat.CATEGORY_STATUS, "Lcom/gojek/ojosdk/Ojo$Status;", "getStatus", "()Lcom/gojek/ojosdk/Ojo$Status;", "setStatus", "(Lcom/gojek/ojosdk/Ojo$Status;)V", "forceStatus", "getForceStatus", "setForceStatus", "rawValues", "Ljava/lang/String;", "getRawValues", "()Ljava/lang/String;", "setRawValues", "(Ljava/lang/String;)V", "Lcom/gojek/ojosdk/Ojo$Object;", "objects", "getObjects", "edValues", "getEdValues", "setEdValues", "Lcom/gojek/ojosdk/Ojo$AuroraColors;", "auroraColors", "Lcom/gojek/ojosdk/Ojo$AuroraColors;", "getAuroraColors", "()Lcom/gojek/ojosdk/Ojo$AuroraColors;", "setAuroraColors", "(Lcom/gojek/ojosdk/Ojo$AuroraColors;)V", FirebaseAnalytics.Param.SCORE, "getScore", "setScore", "OJOSDK_withoutModelsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class DetectionResult {
        private float aspectRatio;
        private AuroraColors auroraColors;
        private float backlightScore;
        private float backlightScoreRaw;
        private float blockScore;
        private float blockScoreRaw;
        private float blurScore;
        private float blurScoreRaw;
        private float damagedScore;
        private float damagedScoreRaw;
        private String edValues;
        private FacePose facePose;
        private ArrayList<Face> faces;
        private Status forceStatus;
        private float highlightScore;
        private float highlightScoreRaw;
        private float lowlightScore;
        private float lowlightScoreRaw;
        private ArrayList<Object> objects;
        private float okScore;
        private String rawValues;
        private float score;
        private Status status;
        private int zoom;
        private int zoomRaw;

        public DetectionResult() {
            this.zoom = -1;
            this.faces = new ArrayList();
            this.facePose = FacePose.UNKNOWN;
            this.okScore = -1.0f;
            this.blurScore = -1.0f;
            this.blockScore = -1.0f;
            this.lowlightScore = -1.0f;
            this.highlightScore = -1.0f;
            this.backlightScore = -1.0f;
            this.damagedScore = -1.0f;
            this.blurScoreRaw = -1.0f;
            this.blockScoreRaw = -1.0f;
            this.lowlightScoreRaw = -1.0f;
            this.highlightScoreRaw = -1.0f;
            this.damagedScoreRaw = -1.0f;
            this.backlightScoreRaw = -1.0f;
            this.zoomRaw = -1;
            Status r02 = Status.UNKNOWN;
            this.status = r02;
            this.forceStatus = r02;
            this.rawValues = "";
            this.objects = new ArrayList();
            this.edValues = "";
            this.auroraColors = AuroraColors.OTHER;
            this.score = -1.0f;
        }

        public final float getAspectRatio() {
            return this.aspectRatio;
        }

        public final AuroraColors getAuroraColors() {
            return this.auroraColors;
        }

        public final float getBacklightScore() {
            return this.backlightScore;
        }

        public final float getBacklightScoreRaw() {
            return this.backlightScoreRaw;
        }

        public final float getBlockScore() {
            return this.blockScore;
        }

        public final float getBlockScoreRaw() {
            return this.blockScoreRaw;
        }

        public final float getBlurScore() {
            return this.blurScore;
        }

        public final float getBlurScoreRaw() {
            return this.blurScoreRaw;
        }

        public final float getDamagedScore() {
            return this.damagedScore;
        }

        public final float getDamagedScoreRaw() {
            return this.damagedScoreRaw;
        }

        public final String getEdValues() {
            return this.edValues;
        }

        public final FacePose getFacePose() {
            return this.facePose;
        }

        public final ArrayList<Face> getFaces() {
            return this.faces;
        }

        public final Status getForceStatus() {
            return this.forceStatus;
        }

        public final float getHighlightScore() {
            return this.highlightScore;
        }

        public final float getHighlightScoreRaw() {
            return this.highlightScoreRaw;
        }

        public final float getLowlightScore() {
            return this.lowlightScore;
        }

        public final float getLowlightScoreRaw() {
            return this.lowlightScoreRaw;
        }

        public final ArrayList<Object> getObjects() {
            return this.objects;
        }

        public final float getOkScore() {
            return this.okScore;
        }

        public final String getRawValues() {
            return this.rawValues;
        }

        public final float getScore() {
            return this.score;
        }

        public final Status getStatus() {
            return this.status;
        }

        public final int getZoom() {
            return this.zoom;
        }

        public final int getZoomRaw() {
            return this.zoomRaw;
        }

        public final void setAspectRatio(float r1) {
            this.aspectRatio = r1;
        }

        public final void setAuroraColors(AuroraColors r2) {
            p.l(r2, "<set-?>");
            this.auroraColors = r2;
        }

        public final void setBacklightScore(float r1) {
            this.backlightScore = r1;
        }

        public final void setBacklightScoreRaw(float r1) {
            this.backlightScoreRaw = r1;
        }

        public final void setBlockScore(float r1) {
            this.blockScore = r1;
        }

        public final void setBlockScoreRaw(float r1) {
            this.blockScoreRaw = r1;
        }

        public final void setBlurScore(float r1) {
            this.blurScore = r1;
        }

        public final void setBlurScoreRaw(float r1) {
            this.blurScoreRaw = r1;
        }

        public final void setDamagedScore(float r1) {
            this.damagedScore = r1;
        }

        public final void setDamagedScoreRaw(float r1) {
            this.damagedScoreRaw = r1;
        }

        public final void setEdValues(String r2) {
            p.l(r2, "<set-?>");
            this.edValues = r2;
        }

        public final void setFacePose(FacePose r2) {
            p.l(r2, "<set-?>");
            this.facePose = r2;
        }

        public final void setFaces(ArrayList<Face> r2) {
            p.l(r2, "<set-?>");
            this.faces = r2;
        }

        public final void setForceStatus(Status r2) {
            p.l(r2, "<set-?>");
            this.forceStatus = r2;
        }

        public final void setHighlightScore(float r1) {
            this.highlightScore = r1;
        }

        public final void setHighlightScoreRaw(float r1) {
            this.highlightScoreRaw = r1;
        }

        public final void setLowlightScore(float r1) {
            this.lowlightScore = r1;
        }

        public final void setLowlightScoreRaw(float r1) {
            this.lowlightScoreRaw = r1;
        }

        public final void setObjects(ArrayList<Object> r2) {
            p.l(r2, "<set-?>");
            this.objects = r2;
        }

        public final void setOkScore(float r1) {
            this.okScore = r1;
        }

        public final void setRawValues(String r2) {
            p.l(r2, "<set-?>");
            this.rawValues = r2;
        }

        public final void setScore(float r1) {
            this.score = r1;
        }

        public final void setStatus(Status r2) {
            p.l(r2, "<set-?>");
            this.status = r2;
        }

        public final void setZoom(int r1) {
            this.zoom = r1;
        }

        public final void setZoomRaw(int r1) {
            this.zoomRaw = r1;
        }

        public final HashMap<String, java.lang.Object> toHashMap() {
            Pair r3 = m.a("zoom", Integer.valueOf(this.zoom));
            ArrayList<Face> r1 = this.faces;
            ArrayList r2 = new ArrayList(AbstractC11778w.z(r1, 10));
            int r5 = r1.size();
            int r7 = 0;
        L3:
            if (r7 >= r5) goto L5;
            Face r8 = r1.get(r7);
            r7 = r7 + 1;
            r2.add(r8.toHashMap());
            goto L3
        L5:
            Pair r12 = m.a("faces", r2);
            Pair r52 = m.a("facePose", this.facePose.name());
            Pair r22 = m.a("okScore", Float.valueOf(this.okScore));
            Pair r72 = m.a("blurScore", Float.valueOf(this.blurScore));
            Pair r82 = m.a("blockScore", Float.valueOf(this.blockScore));
            Pair r9 = m.a("lowlightScore", Float.valueOf(this.lowlightScore));
            Pair r10 = m.a("highlightScore", Float.valueOf(this.highlightScore));
            Pair r11 = m.a("backlightScore", Float.valueOf(this.backlightScore));
            Pair r122 = m.a("damagedScore", Float.valueOf(this.damagedScore));
            Pair r13 = m.a("blurScoreRaw", Float.valueOf(this.blurScoreRaw));
            Pair r14 = m.a("lowlightScoreRaw", Float.valueOf(this.lowlightScoreRaw));
            Pair r15 = m.a("highlightScoreRaw", Float.valueOf(this.highlightScoreRaw));
            Pair r4 = m.a("backlightScoreRaw", Float.valueOf(this.backlightScoreRaw));
            Pair r16 = m.a("damagedScoreRaw", Float.valueOf(this.damagedScoreRaw));
            Pair r17 = m.a("zoomRaw", Integer.valueOf(this.zoomRaw));
            Pair r18 = m.a(com.clevertap.android.sdk.Constants.INAPP_ASPECT_RATIO, Float.valueOf(this.aspectRatio));
            Pair r19 = m.a("rawValues", this.rawValues);
            Pair r110 = m.a("edValues", this.edValues);
            Pair r111 = m.a("auroraColors", this.auroraColors.name());
            Pair r112 = m.a(NotificationCompat.CATEGORY_STATUS, this.status.name());
            ArrayList<Object> r6 = this.objects;
            ArrayList r113 = new ArrayList(AbstractC11778w.z(r6, 10));
            int r23 = r6.size();
            int r32 = 0;
        L6:
            if (r32 >= r23) goto L9;
            Object r162 = r6.get(r32);
            r32 = r32 + 1;
            int r27 = r23;
            r113.add(r162.toHashMap());
            r23 = r27;
            goto L6
        L9:
            return S.m(new Pair[]{r3, r12, r52, r22, r72, r82, r9, r10, r11, r122, r13, r14, r15, r4, r16, r17, r18, r19, r110, r111, r112, m.a("objects", r113), m.a(FirebaseAnalytics.Param.SCORE, Float.valueOf(this.score))});
        }

        public final void setFaces(int[] r18) {
            p.l(r18, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.faces.clear();
            int r2 = r18.length / 16;
            int r4 = 0;
        L3:
            if (r4 >= r2) goto L9;
            int r6 = r4 * 16;
            Rect r5 = new Rect(r18[r6], r18[r6 + 1], r18[r6 + 2], r18[r6 + 3]);
            Landmark r11 = new Landmark(new Point(r18[r6 + 4], r18[r6 + 9]), new Point(r18[r6 + 5], r18[r6 + 10]), new Point(r18[r6 + 6], r18[r6 + 11]), new Point(r18[r6 + 7], r18[r6 + 12]), new Point(r18[r6 + 8], r18[r6 + 13]));
            ArrayList<Face> r7 = this.faces;
            int r9 = r18[r6 + 14];
            boolean r10 = true;
            if (r18[r6 + 15] == 1) goto L8;
            r10 = false;
        L8:
            r7.add(new Face(r5, r11, r9, r10));
            r4 = r4 + 1;
            goto L3
        }

        public final void setObjects(int[] r11) {
            p.l(r11, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.objects.clear();
            int r02 = r11.length / 8;
            int r2 = 0;
        L3:
            if (r2 >= r02) goto L17;
            int r3 = r2 * 8;
            Rect r4 = new Rect(r11[r3], r11[r3 + 1], r11[r3 + 2], r11[r3 + 3]);
            if (r11[r3 + 4] != 0) goto L7;
            String r5 = "e-KTP";
        L8:
            int r6 = r11[r3 + 5];
            boolean r8 = true;
            if (r11[r3 + 6] != 1) goto L11;
            boolean r7 = true;
        L13:
            if (r11[r3 + 7] == 1) goto L16;
            r8 = false;
        L16:
            this.objects.add(new Object(r4, r5, r6, r7, r8));
            r2 = r2 + 1;
            goto L3
        L11:
            r7 = false;
            goto L13
        L7:
            r5 = "Others";
            goto L8
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b(\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*¨\u0006+"}, d2 = {"Lcom/gojek/ojosdk/Ojo$ErrorCode;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "OK", "NULLPTRERR", "VALUEERR", "ALLOCERR", "MODELS_NOT_LOADED", "FD_ERR", "FD_ALLOCERR", "FD_MEMERR", "FD_MODELERR", "FD_MODELPATHERR", "FD_NULLPTRERR", "IQ_ERR", "IQ_ALLOCERR", "IQ_MEMERR", "IQ_MODELERR", "IQ_MODELPATHERR", "IQ_NULLPTRERR", "LD_ERR", "LD_ALLOCERR", "LD_MEMERR", "LD_MODELERR", "LD_MODELPATHERR", "LD_NULLPTRERR", "LD_TRACKERERR", "BEST_FRAME_UNAVAILABLE", "SECOND_FRAME_UNAVAILABLE", "SWITCH_FRAME_UNAVAILABLE", "PARSE_INVALID_JPEG", "PARSE_UNKNOWN_BYTEALIGN", "PARSE_ABSENT_DATA", "PARSE_CORRUPT_DATA", "PARSE_UNKNOWN", "JSS_VALID", "JSS_INVALIDCOM", "JSS_INVALIDKEY", "JSS_INVALIDSTEG", "OJOSDK_withoutModelsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum ErrorCode extends Enum<ErrorCode> {
        private static final /* synthetic */ ErrorCode[] $VALUES = null;
        public static final ErrorCode ALLOCERR = null;
        public static final ErrorCode BEST_FRAME_UNAVAILABLE = null;
        public static final ErrorCode FD_ALLOCERR = null;
        public static final ErrorCode FD_ERR = null;
        public static final ErrorCode FD_MEMERR = null;
        public static final ErrorCode FD_MODELERR = null;
        public static final ErrorCode FD_MODELPATHERR = null;
        public static final ErrorCode FD_NULLPTRERR = null;
        public static final ErrorCode IQ_ALLOCERR = null;
        public static final ErrorCode IQ_ERR = null;
        public static final ErrorCode IQ_MEMERR = null;
        public static final ErrorCode IQ_MODELERR = null;
        public static final ErrorCode IQ_MODELPATHERR = null;
        public static final ErrorCode IQ_NULLPTRERR = null;
        public static final ErrorCode JSS_INVALIDCOM = null;
        public static final ErrorCode JSS_INVALIDKEY = null;
        public static final ErrorCode JSS_INVALIDSTEG = null;
        public static final ErrorCode JSS_VALID = null;
        public static final ErrorCode LD_ALLOCERR = null;
        public static final ErrorCode LD_ERR = null;
        public static final ErrorCode LD_MEMERR = null;
        public static final ErrorCode LD_MODELERR = null;
        public static final ErrorCode LD_MODELPATHERR = null;
        public static final ErrorCode LD_NULLPTRERR = null;
        public static final ErrorCode LD_TRACKERERR = null;
        public static final ErrorCode MODELS_NOT_LOADED = null;
        public static final ErrorCode NULLPTRERR = null;
        public static final ErrorCode OK = null;
        public static final ErrorCode PARSE_ABSENT_DATA = null;
        public static final ErrorCode PARSE_CORRUPT_DATA = null;
        public static final ErrorCode PARSE_INVALID_JPEG = null;
        public static final ErrorCode PARSE_UNKNOWN = null;
        public static final ErrorCode PARSE_UNKNOWN_BYTEALIGN = null;
        public static final ErrorCode SECOND_FRAME_UNAVAILABLE = null;
        public static final ErrorCode SWITCH_FRAME_UNAVAILABLE = null;
        public static final ErrorCode VALUEERR = null;
        private final int value;

        private static final /* synthetic */ ErrorCode[] $values() {
            return new ErrorCode[]{OK, NULLPTRERR, VALUEERR, ALLOCERR, MODELS_NOT_LOADED, FD_ERR, FD_ALLOCERR, FD_MEMERR, FD_MODELERR, FD_MODELPATHERR, FD_NULLPTRERR, IQ_ERR, IQ_ALLOCERR, IQ_MEMERR, IQ_MODELERR, IQ_MODELPATHERR, IQ_NULLPTRERR, LD_ERR, LD_ALLOCERR, LD_MEMERR, LD_MODELERR, LD_MODELPATHERR, LD_NULLPTRERR, LD_TRACKERERR, BEST_FRAME_UNAVAILABLE, SECOND_FRAME_UNAVAILABLE, SWITCH_FRAME_UNAVAILABLE, PARSE_INVALID_JPEG, PARSE_UNKNOWN_BYTEALIGN, PARSE_ABSENT_DATA, PARSE_CORRUPT_DATA, PARSE_UNKNOWN, JSS_VALID, JSS_INVALIDCOM, JSS_INVALIDKEY, JSS_INVALIDSTEG};
        }

        static {
            OK = new ErrorCode("OK", 0, 0);
            NULLPTRERR = new ErrorCode("NULLPTRERR", 1, 1);
            VALUEERR = new ErrorCode("VALUEERR", 2, 2);
            ALLOCERR = new ErrorCode("ALLOCERR", 3, 3);
            MODELS_NOT_LOADED = new ErrorCode("MODELS_NOT_LOADED", 4, 4);
            FD_ERR = new ErrorCode("FD_ERR", 5, 257);
            FD_ALLOCERR = new ErrorCode("FD_ALLOCERR", 6, 258);
            FD_MEMERR = new ErrorCode("FD_MEMERR", 7, 259);
            FD_MODELERR = new ErrorCode("FD_MODELERR", 8, 260);
            FD_MODELPATHERR = new ErrorCode("FD_MODELPATHERR", 9, 261);
            FD_NULLPTRERR = new ErrorCode("FD_NULLPTRERR", 10, 262);
            IQ_ERR = new ErrorCode("IQ_ERR", 11, 513);
            IQ_ALLOCERR = new ErrorCode("IQ_ALLOCERR", 12, 514);
            IQ_MEMERR = new ErrorCode("IQ_MEMERR", 13, 515);
            IQ_MODELERR = new ErrorCode("IQ_MODELERR", 14, 516);
            IQ_MODELPATHERR = new ErrorCode("IQ_MODELPATHERR", 15, 517);
            IQ_NULLPTRERR = new ErrorCode("IQ_NULLPTRERR", 16, 518);
            LD_ERR = new ErrorCode("LD_ERR", 17, 769);
            LD_ALLOCERR = new ErrorCode("LD_ALLOCERR", 18, 770);
            LD_MEMERR = new ErrorCode("LD_MEMERR", 19, 771);
            LD_MODELERR = new ErrorCode("LD_MODELERR", 20, 772);
            LD_MODELPATHERR = new ErrorCode("LD_MODELPATHERR", 21, 773);
            LD_NULLPTRERR = new ErrorCode("LD_NULLPTRERR", 22, 774);
            LD_TRACKERERR = new ErrorCode("LD_TRACKERERR", 23, 775);
            BEST_FRAME_UNAVAILABLE = new ErrorCode("BEST_FRAME_UNAVAILABLE", 24, 1281);
            SECOND_FRAME_UNAVAILABLE = new ErrorCode("SECOND_FRAME_UNAVAILABLE", 25, 1282);
            SWITCH_FRAME_UNAVAILABLE = new ErrorCode("SWITCH_FRAME_UNAVAILABLE", 26, 1283);
            PARSE_INVALID_JPEG = new ErrorCode("PARSE_INVALID_JPEG", 27, 32);
            PARSE_UNKNOWN_BYTEALIGN = new ErrorCode("PARSE_UNKNOWN_BYTEALIGN", 28, 33);
            PARSE_ABSENT_DATA = new ErrorCode("PARSE_ABSENT_DATA", 29, 34);
            PARSE_CORRUPT_DATA = new ErrorCode("PARSE_CORRUPT_DATA", 30, 35);
            PARSE_UNKNOWN = new ErrorCode("PARSE_UNKNOWN", 31, 36);
            JSS_VALID = new ErrorCode("JSS_VALID", 32, 100);
            JSS_INVALIDCOM = new ErrorCode("JSS_INVALIDCOM", 33, Health.EVENT_TIMESTAMP_FIELD_NUMBER);
            JSS_INVALIDKEY = new ErrorCode("JSS_INVALIDKEY", 34, 102);
            JSS_INVALIDSTEG = new ErrorCode("JSS_INVALIDSTEG", 35, 104);
            $VALUES = $values();
        }

        ErrorCode(String r1, int r2, int r3) {
            this.value = r3;
        }

        public static ErrorCode valueOf(String r1) {
            return (ErrorCode) Enum.valueOf(ErrorCode.class, r1);
        }

        public static ErrorCode[] values() {
            return (ErrorCode[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00010\u001bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/gojek/ojosdk/Ojo$Face;", "", "boundingBox", "Landroid/graphics/Rect;", "landmark", "Lcom/gojek/ojosdk/Ojo$Landmark;", "confidenceScore", "", "isCropped", "", "(Landroid/graphics/Rect;Lcom/gojek/ojosdk/Ojo$Landmark;IZ)V", "getBoundingBox", "()Landroid/graphics/Rect;", "setBoundingBox", "(Landroid/graphics/Rect;)V", "getConfidenceScore", "()I", "setConfidenceScore", "(I)V", "()Z", "setCropped", "(Z)V", "getLandmark", "()Lcom/gojek/ojosdk/Ojo$Landmark;", "setLandmark", "(Lcom/gojek/ojosdk/Ojo$Landmark;)V", "toHashMap", "Ljava/util/HashMap;", "", "OJOSDK_withoutModelsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Face {
        private Rect boundingBox;
        private int confidenceScore;
        private boolean isCropped;
        private Landmark landmark;

        public Face(Rect r2, Landmark r3, int r4, boolean r5) {
            p.l(r2, "boundingBox");
            p.l(r3, "landmark");
            this.boundingBox = r2;
            this.landmark = r3;
            this.confidenceScore = r4;
            this.isCropped = r5;
        }

        public final Rect getBoundingBox() {
            return this.boundingBox;
        }

        public final int getConfidenceScore() {
            return this.confidenceScore;
        }

        public final Landmark getLandmark() {
            return this.landmark;
        }

        public final boolean isCropped() {
            return this.isCropped;
        }

        public final void setBoundingBox(Rect r2) {
            p.l(r2, "<set-?>");
            this.boundingBox = r2;
        }

        public final void setConfidenceScore(int r1) {
            this.confidenceScore = r1;
        }

        public final void setCropped(boolean r1) {
            this.isCropped = r1;
        }

        public final void setLandmark(Landmark r2) {
            p.l(r2, "<set-?>");
            this.landmark = r2;
        }

        public final HashMap<String, java.lang.Object> toHashMap() {
            return S.m(new Pair[]{m.a("boundingBoxLeft", Integer.valueOf(this.boundingBox.left)), m.a("boundingBoxTop", Integer.valueOf(this.boundingBox.top)), m.a("boundingBoxRight", Integer.valueOf(this.boundingBox.right)), m.a("boundingBoxBottom", Integer.valueOf(this.boundingBox.bottom)), m.a("landmark", this.landmark.toHashMap()), m.a("confidenceScore", Integer.valueOf(this.confidenceScore)), m.a("isCropped", Boolean.valueOf(this.isCropped))});
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/gojek/ojosdk/Ojo$FacePose;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "LEFT", "RIGHT", "UP", "DOWN", "CENTER", GrsBaseInfo.CountryCodeSource.UNKNOWN, "OJOSDK_withoutModelsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum FacePose extends Enum<FacePose> {
        private static final /* synthetic */ FacePose[] $VALUES = null;
        public static final FacePose CENTER = null;
        public static final FacePose DOWN = null;
        public static final FacePose LEFT = null;
        public static final FacePose RIGHT = null;
        public static final FacePose UNKNOWN = null;
        public static final FacePose UP = null;
        private final int value;

        private static final /* synthetic */ FacePose[] $values() {
            return new FacePose[]{LEFT, RIGHT, UP, DOWN, CENTER, UNKNOWN};
        }

        static {
            LEFT = new FacePose("LEFT", 0, 0);
            RIGHT = new FacePose("RIGHT", 1, 1);
            UP = new FacePose("UP", 2, 2);
            DOWN = new FacePose("DOWN", 3, 3);
            CENTER = new FacePose("CENTER", 4, 4);
            UNKNOWN = new FacePose(GrsBaseInfo.CountryCodeSource.UNKNOWN, 5, 5);
            $VALUES = $values();
        }

        FacePose(String r1, int r2, int r3) {
            this.value = r3;
        }

        public static FacePose valueOf(String r1) {
            return (FacePose) Enum.valueOf(FacePose.class, r1);
        }

        public static FacePose[] values() {
            return (FacePose[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/gojek/ojosdk/Ojo$ImageWriter;", "", "()V", "Companion", "OJOSDK_withoutModelsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class ImageWriter {
        public static final Companion Companion = null;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0007¨\u0006\u000b"}, d2 = {"Lcom/gojek/ojosdk/Ojo$ImageWriter$Companion;", "", "()V", "execute", "", "byteArray", "", "outputStream", "Ljava/io/OutputStream;", "userComment", "description", "OJOSDK_withoutModelsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(i r1) {
                this();
            }

            public final String execute(byte[] r4, OutputStream r5, String r6, String r7) {
                p.l(r4, "byteArray");
                p.l(r5, "outputStream");
                p.l(r6, "userComment");
                p.l(r7, "description");
                ExifInterface r02 = new ExifInterface();     // Catch: Exception -> L6
                ExifTag r62 = r02.buildTag(ExifInterface.TAG_USER_COMMENT, r6);     // Catch: Exception -> L6
                int r1 = ExifInterface.TAG_IMAGE_DESCRIPTION;     // Catch: Exception -> L6
                if (r7.length() != 0) goto L8;
                r7 = " ";
            L8:
                ExifTag r72 = r02.buildTag(r1, r7);     // Catch: Exception -> L6
                r02.setTag(r62);     // Catch: Exception -> L6
                r02.setTag(r72);     // Catch: Exception -> L6
                r02.writeExif(r4, r5);     // Catch: Exception -> L6
                return "Written successfully.";
            L6:
                e = move-exception;
                return e.toString();
            }

            private Companion() {
            }
        }

        static {
            Companion = new Companion(null);
        }

        public ImageWriter() {
        }

        public static final String execute(byte[] r1, OutputStream r2, String r3, String r4) {
            return Companion.execute(r1, r2, r3, r4);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/gojek/ojosdk/Ojo$Landmark;", "", "LEFT_EYE", "Landroid/graphics/Point;", "RIGHT_EYE", "NOSE", "MOUTH_LEFT", "MOUTH_RIGHT", "(Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Point;)V", "getLEFT_EYE", "()Landroid/graphics/Point;", "getMOUTH_LEFT", "getMOUTH_RIGHT", "getNOSE", "getRIGHT_EYE", "toHashMap", "Ljava/util/HashMap;", "", "", "OJOSDK_withoutModelsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Landmark {
        private final Point LEFT_EYE;
        private final Point MOUTH_LEFT;
        private final Point MOUTH_RIGHT;
        private final Point NOSE;
        private final Point RIGHT_EYE;

        public Landmark(Point r2, Point r3, Point r4, Point r5, Point r6) {
            p.l(r2, "LEFT_EYE");
            p.l(r3, "RIGHT_EYE");
            p.l(r4, "NOSE");
            p.l(r5, "MOUTH_LEFT");
            p.l(r6, "MOUTH_RIGHT");
            this.LEFT_EYE = r2;
            this.RIGHT_EYE = r3;
            this.NOSE = r4;
            this.MOUTH_LEFT = r5;
            this.MOUTH_RIGHT = r6;
        }

        public final Point getLEFT_EYE() {
            return this.LEFT_EYE;
        }

        public final Point getMOUTH_LEFT() {
            return this.MOUTH_LEFT;
        }

        public final Point getMOUTH_RIGHT() {
            return this.MOUTH_RIGHT;
        }

        public final Point getNOSE() {
            return this.NOSE;
        }

        public final Point getRIGHT_EYE() {
            return this.RIGHT_EYE;
        }

        public final HashMap<String, Integer> toHashMap() {
            return S.m(new Pair[]{m.a("LEFT_EYE_X", Integer.valueOf(this.LEFT_EYE.x)), m.a("LEFT_EYE_Y", Integer.valueOf(this.LEFT_EYE.y)), m.a("RIGHT_EYE_X", Integer.valueOf(this.RIGHT_EYE.x)), m.a("RIGHT_EYE_Y", Integer.valueOf(this.RIGHT_EYE.y)), m.a("NOSE_X", Integer.valueOf(this.NOSE.x)), m.a("NOSE_Y", Integer.valueOf(this.NOSE.y)), m.a("MOUTH_LEFT_X", Integer.valueOf(this.MOUTH_LEFT.x)), m.a("MOUTH_LEFT_Y", Integer.valueOf(this.MOUTH_LEFT.y)), m.a("MOUTH_RIGHT_X", Integer.valueOf(this.MOUTH_RIGHT.x)), m.a("MOUTH_RIGHT_Y", Integer.valueOf(this.MOUTH_RIGHT.y))});
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u001dR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\n\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0014\"\u0004\b\u0017\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/gojek/ojosdk/Ojo$Object;", "", "boundingBox", "Landroid/graphics/Rect;", Constants.ScionAnalytics.PARAM_LABEL, "", "confidenceScore", "", "isCropped", "", "isCroppedRaw", "(Landroid/graphics/Rect;Ljava/lang/String;IZZ)V", "getBoundingBox", "()Landroid/graphics/Rect;", "setBoundingBox", "(Landroid/graphics/Rect;)V", "getConfidenceScore", "()I", "setConfidenceScore", "(I)V", "()Z", "setCropped", "(Z)V", "setCroppedRaw", "getLabel", "()Ljava/lang/String;", "setLabel", "(Ljava/lang/String;)V", "toHashMap", "Ljava/util/HashMap;", "OJOSDK_withoutModelsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Object {
        private Rect boundingBox;
        private int confidenceScore;
        private boolean isCropped;
        private boolean isCroppedRaw;
        private String label;

        public Object(Rect r2, String r3, int r4, boolean r5, boolean r6) {
            p.l(r2, "boundingBox");
            p.l(r3, Constants.ScionAnalytics.PARAM_LABEL);
            this.boundingBox = r2;
            this.label = r3;
            this.confidenceScore = r4;
            this.isCropped = r5;
            this.isCroppedRaw = r6;
        }

        public final Rect getBoundingBox() {
            return this.boundingBox;
        }

        public final int getConfidenceScore() {
            return this.confidenceScore;
        }

        public final String getLabel() {
            return this.label;
        }

        public final boolean isCropped() {
            return this.isCropped;
        }

        public final boolean isCroppedRaw() {
            return this.isCroppedRaw;
        }

        public final void setBoundingBox(Rect r2) {
            p.l(r2, "<set-?>");
            this.boundingBox = r2;
        }

        public final void setConfidenceScore(int r1) {
            this.confidenceScore = r1;
        }

        public final void setCropped(boolean r1) {
            this.isCropped = r1;
        }

        public final void setCroppedRaw(boolean r1) {
            this.isCroppedRaw = r1;
        }

        public final void setLabel(String r2) {
            p.l(r2, "<set-?>");
            this.label = r2;
        }

        public final HashMap<String, java.lang.Object> toHashMap() {
            return S.m(new Pair[]{m.a("boundingBoxLeft", Integer.valueOf(this.boundingBox.left)), m.a("boundingBoxTop", Integer.valueOf(this.boundingBox.top)), m.a("boundingBoxRight", Integer.valueOf(this.boundingBox.right)), m.a("boundingBoxBottom", Integer.valueOf(this.boundingBox.bottom)), m.a(Constants.ScionAnalytics.PARAM_LABEL, this.label), m.a("confidenceScore", Integer.valueOf(this.confidenceScore)), m.a("isCropped", Boolean.valueOf(this.isCropped)), m.a("isCroppedRaw", Boolean.valueOf(this.isCroppedRaw))});
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/gojek/ojosdk/Ojo$PixelFormat;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "NV21", "RGBA", "BGRA", "NV12", "YU12", "I420", "OJOSDK_withoutModelsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum PixelFormat extends Enum<PixelFormat> {
        private static final /* synthetic */ PixelFormat[] $VALUES = null;
        public static final PixelFormat BGRA = null;
        public static final PixelFormat I420 = null;
        public static final PixelFormat NV12 = null;
        public static final PixelFormat NV21 = null;
        public static final PixelFormat RGBA = null;
        public static final PixelFormat YU12 = null;
        private final int value;

        private static final /* synthetic */ PixelFormat[] $values() {
            return new PixelFormat[]{NV21, RGBA, BGRA, NV12, YU12, I420};
        }

        static {
            NV21 = new PixelFormat("NV21", 0, 0);
            RGBA = new PixelFormat("RGBA", 1, 1);
            BGRA = new PixelFormat("BGRA", 2, 2);
            NV12 = new PixelFormat("NV12", 3, 3);
            YU12 = new PixelFormat("YU12", 4, 4);
            I420 = new PixelFormat("I420", 5, 5);
            $VALUES = $values();
        }

        PixelFormat(String r1, int r2, int r3) {
            this.value = r3;
        }

        public static PixelFormat valueOf(String r1) {
            return (PixelFormat) Enum.valueOf(PixelFormat.class, r1);
        }

        public static PixelFormat[] values() {
            return (PixelFormat[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/gojek/ojosdk/Ojo$Rotation;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "ROTATION_0", "ROTATION_270", "ROTATION_MIRRORED_90", "ROTATION_MIRRORED_270", "OJOSDK_withoutModelsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum Rotation extends Enum<Rotation> {
        private static final /* synthetic */ Rotation[] $VALUES = null;
        public static final Rotation ROTATION_0 = null;
        public static final Rotation ROTATION_270 = null;
        public static final Rotation ROTATION_MIRRORED_270 = null;
        public static final Rotation ROTATION_MIRRORED_90 = null;
        private final int value;

        private static final /* synthetic */ Rotation[] $values() {
            return new Rotation[]{ROTATION_0, ROTATION_270, ROTATION_MIRRORED_90, ROTATION_MIRRORED_270};
        }

        static {
            ROTATION_0 = new Rotation("ROTATION_0", 0, 0);
            ROTATION_270 = new Rotation("ROTATION_270", 1, 3);
            ROTATION_MIRRORED_90 = new Rotation("ROTATION_MIRRORED_90", 2, 5);
            ROTATION_MIRRORED_270 = new Rotation("ROTATION_MIRRORED_270", 3, 7);
            $VALUES = $values();
        }

        Rotation(String r1, int r2, int r3) {
            this.value = r3;
        }

        public static Rotation valueOf(String r1) {
            return (Rotation) Enum.valueOf(Rotation.class, r1);
        }

        public static Rotation[] values() {
            return (Rotation[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b;\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=¨\u0006>"}, d2 = {"Lcom/gojek/ojosdk/Ojo$Status;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "NO_ISSUE", "PASS", GrsBaseInfo.CountryCodeSource.UNKNOWN, "LIVENESS_FAILED", "FRAUD", "EYE_BLINK_FAILED", "AURORA_RETRIES_FAILED", "TIME_EXPIRED_NO_FACE", "TIME_EXPIRED_NO_CARD", "TIME_EXPIRED_MULTIPLE_FACE", "TIME_EXPIRED_TOO_NEAR", "TIME_EXPIRED_TOO_FAR", "TIME_EXPIRED_CROPPED", "TIME_EXPIRED_BLOCKED", "TIME_EXPIRED_LOWLIGHT", "TIME_EXPIRED_HIGHLIGHT", "TIME_EXPIRED_BACKLIGHT", "TIME_EXPIRED_LIGHTING", "TIME_EXPIRED_BLUR", "TIME_EXPIRED_OTHERS", "LOAD_MODEL_FAILED", "TIME_EXPIRED_DAMAGED", "MOUTH_BLINK_FAILED", "TIME_EXPIRED_NOT_STEADY", "TIME_EXPIRED_NOT_IN_CENTER", "TIME_EXPIRED_ROTATION", "ENV_BRIGHT_FAILED", "FACE_NOT_DETECTED", "CARD_NOT_DETECTED", "FACE_DROPPED", "MULTIPLE_FACES", "TOO_NEAR", "TOO_FAR", "CROPPED", "BLOCKED", "LOWLIGHT", "HIGHLIGHT", "BACKLIGHT", "FIX_LIGHTING", "BLUR", "MOTION_DETECTED", "ROTATION_DETECTED", "DAMAGED", "MOTION_EYES", "MOTION_MOUTH", "AURORA_FLASHING", "AURORA_INFERENCE", "AURORA_RESTART", "EYES_CLOSED", "EYES_BLOCKED", "BLINK_EYES", "MOUTH_OPEN", "MOUTH_BLOCKED", "BLINK_MOUTH", "CAPTURE_WINDOW_STARTED", "OJOSDK_withoutModelsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum Status extends Enum<Status> {
        private static final /* synthetic */ Status[] $VALUES = null;
        public static final Status AURORA_FLASHING = null;
        public static final Status AURORA_INFERENCE = null;
        public static final Status AURORA_RESTART = null;
        public static final Status AURORA_RETRIES_FAILED = null;
        public static final Status BACKLIGHT = null;
        public static final Status BLINK_EYES = null;
        public static final Status BLINK_MOUTH = null;
        public static final Status BLOCKED = null;
        public static final Status BLUR = null;
        public static final Status CAPTURE_WINDOW_STARTED = null;
        public static final Status CARD_NOT_DETECTED = null;
        public static final Status CROPPED = null;
        public static final Status DAMAGED = null;
        public static final Status ENV_BRIGHT_FAILED = null;
        public static final Status EYES_BLOCKED = null;
        public static final Status EYES_CLOSED = null;
        public static final Status EYE_BLINK_FAILED = null;
        public static final Status FACE_DROPPED = null;
        public static final Status FACE_NOT_DETECTED = null;
        public static final Status FIX_LIGHTING = null;
        public static final Status FRAUD = null;
        public static final Status HIGHLIGHT = null;
        public static final Status LIVENESS_FAILED = null;
        public static final Status LOAD_MODEL_FAILED = null;
        public static final Status LOWLIGHT = null;
        public static final Status MOTION_DETECTED = null;
        public static final Status MOTION_EYES = null;
        public static final Status MOTION_MOUTH = null;
        public static final Status MOUTH_BLINK_FAILED = null;
        public static final Status MOUTH_BLOCKED = null;
        public static final Status MOUTH_OPEN = null;
        public static final Status MULTIPLE_FACES = null;
        public static final Status NO_ISSUE = null;
        public static final Status PASS = null;
        public static final Status ROTATION_DETECTED = null;
        public static final Status TIME_EXPIRED_BACKLIGHT = null;
        public static final Status TIME_EXPIRED_BLOCKED = null;
        public static final Status TIME_EXPIRED_BLUR = null;
        public static final Status TIME_EXPIRED_CROPPED = null;
        public static final Status TIME_EXPIRED_DAMAGED = null;
        public static final Status TIME_EXPIRED_HIGHLIGHT = null;
        public static final Status TIME_EXPIRED_LIGHTING = null;
        public static final Status TIME_EXPIRED_LOWLIGHT = null;
        public static final Status TIME_EXPIRED_MULTIPLE_FACE = null;
        public static final Status TIME_EXPIRED_NOT_IN_CENTER = null;
        public static final Status TIME_EXPIRED_NOT_STEADY = null;
        public static final Status TIME_EXPIRED_NO_CARD = null;
        public static final Status TIME_EXPIRED_NO_FACE = null;
        public static final Status TIME_EXPIRED_OTHERS = null;
        public static final Status TIME_EXPIRED_ROTATION = null;
        public static final Status TIME_EXPIRED_TOO_FAR = null;
        public static final Status TIME_EXPIRED_TOO_NEAR = null;
        public static final Status TOO_FAR = null;
        public static final Status TOO_NEAR = null;
        public static final Status UNKNOWN = null;
        private final int value;

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{NO_ISSUE, PASS, UNKNOWN, LIVENESS_FAILED, FRAUD, EYE_BLINK_FAILED, AURORA_RETRIES_FAILED, TIME_EXPIRED_NO_FACE, TIME_EXPIRED_NO_CARD, TIME_EXPIRED_MULTIPLE_FACE, TIME_EXPIRED_TOO_NEAR, TIME_EXPIRED_TOO_FAR, TIME_EXPIRED_CROPPED, TIME_EXPIRED_BLOCKED, TIME_EXPIRED_LOWLIGHT, TIME_EXPIRED_HIGHLIGHT, TIME_EXPIRED_BACKLIGHT, TIME_EXPIRED_LIGHTING, TIME_EXPIRED_BLUR, TIME_EXPIRED_OTHERS, LOAD_MODEL_FAILED, TIME_EXPIRED_DAMAGED, MOUTH_BLINK_FAILED, TIME_EXPIRED_NOT_STEADY, TIME_EXPIRED_NOT_IN_CENTER, TIME_EXPIRED_ROTATION, ENV_BRIGHT_FAILED, FACE_NOT_DETECTED, CARD_NOT_DETECTED, FACE_DROPPED, MULTIPLE_FACES, TOO_NEAR, TOO_FAR, CROPPED, BLOCKED, LOWLIGHT, HIGHLIGHT, BACKLIGHT, FIX_LIGHTING, BLUR, MOTION_DETECTED, ROTATION_DETECTED, DAMAGED, MOTION_EYES, MOTION_MOUTH, AURORA_FLASHING, AURORA_INFERENCE, AURORA_RESTART, EYES_CLOSED, EYES_BLOCKED, BLINK_EYES, MOUTH_OPEN, MOUTH_BLOCKED, BLINK_MOUTH, CAPTURE_WINDOW_STARTED};
        }

        static {
            NO_ISSUE = new Status("NO_ISSUE", 0, 0);
            PASS = new Status("PASS", 1, 1);
            UNKNOWN = new Status(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2, 256);
            LIVENESS_FAILED = new Status("LIVENESS_FAILED", 3, 257);
            FRAUD = new Status("FRAUD", 4, 258);
            EYE_BLINK_FAILED = new Status("EYE_BLINK_FAILED", 5, 259);
            AURORA_RETRIES_FAILED = new Status("AURORA_RETRIES_FAILED", 6, 260);
            TIME_EXPIRED_NO_FACE = new Status("TIME_EXPIRED_NO_FACE", 7, 261);
            TIME_EXPIRED_NO_CARD = new Status("TIME_EXPIRED_NO_CARD", 8, 262);
            TIME_EXPIRED_MULTIPLE_FACE = new Status("TIME_EXPIRED_MULTIPLE_FACE", 9, 263);
            TIME_EXPIRED_TOO_NEAR = new Status("TIME_EXPIRED_TOO_NEAR", 10, 264);
            TIME_EXPIRED_TOO_FAR = new Status("TIME_EXPIRED_TOO_FAR", 11, 265);
            TIME_EXPIRED_CROPPED = new Status("TIME_EXPIRED_CROPPED", 12, 266);
            TIME_EXPIRED_BLOCKED = new Status("TIME_EXPIRED_BLOCKED", 13, 267);
            TIME_EXPIRED_LOWLIGHT = new Status("TIME_EXPIRED_LOWLIGHT", 14, 268);
            TIME_EXPIRED_HIGHLIGHT = new Status("TIME_EXPIRED_HIGHLIGHT", 15, 269);
            TIME_EXPIRED_BACKLIGHT = new Status("TIME_EXPIRED_BACKLIGHT", 16, SubsamplingScaleImageView.ORIENTATION_270);
            TIME_EXPIRED_LIGHTING = new Status("TIME_EXPIRED_LIGHTING", 17, 271);
            TIME_EXPIRED_BLUR = new Status("TIME_EXPIRED_BLUR", 18, 272);
            TIME_EXPIRED_OTHERS = new Status("TIME_EXPIRED_OTHERS", 19, 273);
            LOAD_MODEL_FAILED = new Status("LOAD_MODEL_FAILED", 20, 274);
            TIME_EXPIRED_DAMAGED = new Status("TIME_EXPIRED_DAMAGED", 21, 275);
            MOUTH_BLINK_FAILED = new Status("MOUTH_BLINK_FAILED", 22, 276);
            TIME_EXPIRED_NOT_STEADY = new Status("TIME_EXPIRED_NOT_STEADY", 23, 277);
            TIME_EXPIRED_NOT_IN_CENTER = new Status("TIME_EXPIRED_NOT_IN_CENTER", 24, 278);
            TIME_EXPIRED_ROTATION = new Status("TIME_EXPIRED_ROTATION", 25, 279);
            ENV_BRIGHT_FAILED = new Status("ENV_BRIGHT_FAILED", 26, 280);
            FACE_NOT_DETECTED = new Status("FACE_NOT_DETECTED", 27, 512);
            CARD_NOT_DETECTED = new Status("CARD_NOT_DETECTED", 28, 513);
            FACE_DROPPED = new Status("FACE_DROPPED", 29, 514);
            MULTIPLE_FACES = new Status("MULTIPLE_FACES", 30, 515);
            TOO_NEAR = new Status("TOO_NEAR", 31, ViewUtils.EDGE_TO_EDGE_FLAGS);
            TOO_FAR = new Status("TOO_FAR", 32, 769);
            CROPPED = new Status("CROPPED", 33, 770);
            BLOCKED = new Status("BLOCKED", 34, 771);
            LOWLIGHT = new Status("LOWLIGHT", 35, 772);
            HIGHLIGHT = new Status("HIGHLIGHT", 36, 773);
            BACKLIGHT = new Status("BACKLIGHT", 37, 774);
            FIX_LIGHTING = new Status("FIX_LIGHTING", 38, 775);
            BLUR = new Status("BLUR", 39, 776);
            MOTION_DETECTED = new Status("MOTION_DETECTED", 40, 777);
            ROTATION_DETECTED = new Status("ROTATION_DETECTED", 41, 778);
            DAMAGED = new Status("DAMAGED", 42, 779);
            MOTION_EYES = new Status("MOTION_EYES", 43, 780);
            MOTION_MOUTH = new Status("MOTION_MOUTH", 44, 781);
            AURORA_FLASHING = new Status("AURORA_FLASHING", 45, 1024);
            AURORA_INFERENCE = new Status("AURORA_INFERENCE", 46, 1025);
            AURORA_RESTART = new Status("AURORA_RESTART", 47, 1026);
            EYES_CLOSED = new Status("EYES_CLOSED", 48, 1280);
            EYES_BLOCKED = new Status("EYES_BLOCKED", 49, 1281);
            BLINK_EYES = new Status("BLINK_EYES", 50, 1282);
            MOUTH_OPEN = new Status("MOUTH_OPEN", 51, 1296);
            MOUTH_BLOCKED = new Status("MOUTH_BLOCKED", 52, 1297);
            BLINK_MOUTH = new Status("BLINK_MOUTH", 53, 1298);
            CAPTURE_WINDOW_STARTED = new Status("CAPTURE_WINDOW_STARTED", 54, 1537);
            $VALUES = $values();
        }

        Status(String r1, int r2, int r3) {
            this.value = r3;
        }

        public static Status valueOf(String r1) {
            return (Status) Enum.valueOf(Status.class, r1);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/gojek/ojosdk/Ojo$WakewordDetectionOptions;", "", "()V", "frame", "", "getFrame", "()[F", "setFrame", "([F)V", com.clevertap.android.sdk.Constants.KEY_ID, "", "getId", "()I", "setId", "(I)V", "loudnessFactor", "", "getLoudnessFactor", "()F", "setLoudnessFactor", "(F)V", "toHashMap", "Ljava/util/HashMap;", "", "OJOSDK_withoutModelsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class WakewordDetectionOptions {
        public float[] frame;

        /* renamed from: id, reason: collision with root package name */
        private int f37934id;
        private float loudnessFactor;

        public WakewordDetectionOptions() {
            this.loudnessFactor = 1.0f;
        }

        public final float[] getFrame() {
            float[] r02 = this.frame;
            if (r02 == null) goto L5;
            return r02;
        L5:
            p.D("frame");
            return null;
        }

        public final int getId() {
            return this.f37934id;
        }

        public final float getLoudnessFactor() {
            return this.loudnessFactor;
        }

        public final void setFrame(float[] r2) {
            p.l(r2, "<set-?>");
            this.frame = r2;
        }

        public final void setId(int r1) {
            this.f37934id = r1;
        }

        public final void setLoudnessFactor(float r1) {
            this.loudnessFactor = r1;
        }

        public final HashMap<String, java.lang.Object> toHashMap() {
            return S.m(new Pair[]{m.a("frame", getFrame()), m.a(com.clevertap.android.sdk.Constants.KEY_ID, Integer.valueOf(this.f37934id)), m.a("loudnessFactor", Float.valueOf(this.loudnessFactor))});
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u0010R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/gojek/ojosdk/Ojo$WakewordDetectionResult;", "", "()V", com.clevertap.android.sdk.Constants.KEY_ID, "", "getId", "()I", "setId", "(I)V", "pred", "", "getPred", "()F", "setPred", "(F)V", "toHashMap", "Ljava/util/HashMap;", "", "OJOSDK_withoutModelsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class WakewordDetectionResult {

        /* renamed from: id, reason: collision with root package name */
        private int f37935id;
        private float pred;

        public WakewordDetectionResult() {
            this.f37935id = -1;
            this.pred = -1.0f;
        }

        public final int getId() {
            return this.f37935id;
        }

        public final float getPred() {
            return this.pred;
        }

        public final void setId(int r1) {
            this.f37935id = r1;
        }

        public final void setPred(float r1) {
            this.pred = r1;
        }

        public final HashMap<String, java.lang.Object> toHashMap() {
            return S.m(new Pair[]{m.a(com.clevertap.android.sdk.Constants.KEY_ID, Integer.valueOf(this.f37935id)), m.a("pred", Float.valueOf(this.pred))});
        }
    }

    static {
        Companion = new Companion(null);
        System.loadLibrary("ojo");
    }

    public Ojo() {
    }

    public static final native ErrorCode ci(CardType r02, int r1, Rotation r2, int r3, String r4, Context r5, String r6);

    public static final ErrorCode df(byte[] r14, byte[] r15, byte[] r16, int r17, int r18, int r19, int r20, int r21, int r22, int r23, int r24, PixelFormat r25, DetectionResult r26) {
        return Companion.df(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26);
    }

    public static final native ErrorCode df(byte[] r02, byte[] r1, byte[] r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, PixelFormat r11, DetectionResult r12, boolean r13, boolean r14, boolean r15, boolean r16, boolean r17, boolean r18, boolean r19, long r20, long r22, String r24);

    public static final native ErrorCode di();

    public static final ErrorCode ds(byte[] r13, byte[] r14, byte[] r15, int r16, int r17, int r18, int r19, int r20, int r21, int r22, int r23, PixelFormat r24) {
        return Companion.ds(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24);
    }

    public static final native ErrorCode ds(byte[] r02, byte[] r1, byte[] r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, PixelFormat r11, boolean r12);

    public static final native ErrorCode dw(WakewordDetectionOptions r02, WakewordDetectionResult r1);

    public static final native String ec(String r02);

    public static final native float[] gf();

    public static final native String gl();

    public static final native String gv();

    public static final native String gz();

    public static final native ErrorCode s1(String r02, String r1, String r2, int r3, boolean r4);

    public static final native ErrorCode s2(String r02, String r1, String r2, int r3, boolean r4);

    public static final native ErrorCode s3(String r02, String r1, String r2, int r3, boolean r4);

    public static final native ErrorCode sa(String r02, int r1);

    public static final native ErrorCode sm(AssetManager r02, int r1, boolean r2);

    public static final native ErrorCode sm(String r02, int r1, boolean r2);

    public static final native ErrorCode sr(Rect r02, int r1, int r2);

    public static final ErrorCode st1() {
        return Companion.st1();
    }

    public static final native ErrorCode st1(float r02, float r1, float r2, float r3, float r4, int r5, int r6, float r7, float r8, float r9, float r10, float r11, float r12, int r13, int r14, int r15);

    public static final ErrorCode st2() {
        return Companion.st2();
    }

    public static final native ErrorCode st2(float r02, boolean r1, int r2, int r3, int r4, int r5, long r6, int r8, float r9, long r10, int r12, long r13, long r15, float r17, float r18, float r19, float r20, float r21, boolean r22, float r23, boolean r24, float r25, float r26, float r27, float r28, float r29, float r30, float r31, float r32, boolean r33, float r34, float r35, int r36, int r37, float r38, float r39, float r40, float r41, float r42, float r43, float r44, float r45, int r46, int r47, int r48, int r49, float r50, float r51, float r52, float r53, int r54, int r55, int r56, float r57);

    public static final ErrorCode sw() {
        return Companion.sw();
    }

    public static final native ErrorCode sw(float r02, float r1, float r2, float r3, float r4, float r5, float r6, float r7, float r8, float r9, float r10, float r11, float r12, int r13, int r14, float r15, float r16, float r17, float r18, float r19, float r20);

    public static final native ErrorCode wd();

    public static final native ErrorCode wi(AssetManager r02, String r1, String r2, int r3, float r4, int r5, int r6, int r7, int r8, int r9);

    public static final ErrorCode df(byte[] r15, byte[] r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, PixelFormat r26, DetectionResult r27, boolean r28) {
        return Companion.df(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28);
    }

    public static final ErrorCode st1(float r1) {
        return Companion.st1(r1);
    }

    public static final ErrorCode st2(float r1) {
        return Companion.st2(r1);
    }

    public static final ErrorCode sw(float r1) {
        return Companion.sw(r1);
    }

    public static final ErrorCode df(byte[] r17, byte[] r18, byte[] r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26, int r27, PixelFormat r28, DetectionResult r29, boolean r30, boolean r31) {
        return Companion.df(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31);
    }

    public static final ErrorCode st1(float r1, float r2) {
        return Companion.st1(r1, r2);
    }

    public static final ErrorCode st2(float r1, boolean r2) {
        return Companion.st2(r1, r2);
    }

    public static final ErrorCode sw(float r1, float r2) {
        return Companion.sw(r1, r2);
    }

    public static final ErrorCode df(byte[] r18, byte[] r19, byte[] r20, int r21, int r22, int r23, int r24, int r25, int r26, int r27, int r28, PixelFormat r29, DetectionResult r30, boolean r31, boolean r32, boolean r33) {
        return Companion.df(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33);
    }

    public static final ErrorCode st1(float r1, float r2, float r3) {
        return Companion.st1(r1, r2, r3);
    }

    public static final ErrorCode st2(float r1, boolean r2, int r3) {
        return Companion.st2(r1, r2, r3);
    }

    public static final ErrorCode sw(float r1, float r2, float r3) {
        return Companion.sw(r1, r2, r3);
    }

    public static final ErrorCode df(byte[] r19, byte[] r20, byte[] r21, int r22, int r23, int r24, int r25, int r26, int r27, int r28, int r29, PixelFormat r30, DetectionResult r31, boolean r32, boolean r33, boolean r34, boolean r35) {
        return Companion.df(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35);
    }

    public static final ErrorCode st1(float r1, float r2, float r3, float r4) {
        return Companion.st1(r1, r2, r3, r4);
    }

    public static final ErrorCode st2(float r1, boolean r2, int r3, int r4) {
        return Companion.st2(r1, r2, r3, r4);
    }

    public static final ErrorCode sw(float r1, float r2, float r3, float r4) {
        return Companion.sw(r1, r2, r3, r4);
    }

    public static final ErrorCode df(byte[] r20, byte[] r21, byte[] r22, int r23, int r24, int r25, int r26, int r27, int r28, int r29, int r30, PixelFormat r31, DetectionResult r32, boolean r33, boolean r34, boolean r35, boolean r36, boolean r37) {
        return Companion.df(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37);
    }

    public static final ErrorCode st1(float r6, float r7, float r8, float r9, float r10) {
        return Companion.st1(r6, r7, r8, r9, r10);
    }

    public static final ErrorCode st2(float r6, boolean r7, int r8, int r9, int r10) {
        return Companion.st2(r6, r7, r8, r9, r10);
    }

    public static final ErrorCode sw(float r6, float r7, float r8, float r9, float r10) {
        return Companion.sw(r6, r7, r8, r9, r10);
    }

    public static final ErrorCode df(byte[] r21, byte[] r22, byte[] r23, int r24, int r25, int r26, int r27, int r28, int r29, int r30, int r31, PixelFormat r32, DetectionResult r33, boolean r34, boolean r35, boolean r36, boolean r37, boolean r38, boolean r39) {
        return Companion.df(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39);
    }

    public static final ErrorCode st1(float r7, float r8, float r9, float r10, float r11, int r12) {
        return Companion.st1(r7, r8, r9, r10, r11, r12);
    }

    public static final ErrorCode st2(float r7, boolean r8, int r9, int r10, int r11, int r12) {
        return Companion.st2(r7, r8, r9, r10, r11, r12);
    }

    public static final ErrorCode sw(float r7, float r8, float r9, float r10, float r11, float r12) {
        return Companion.sw(r7, r8, r9, r10, r11, r12);
    }

    public static final ErrorCode df(byte[] r22, byte[] r23, byte[] r24, int r25, int r26, int r27, int r28, int r29, int r30, int r31, int r32, PixelFormat r33, DetectionResult r34, boolean r35, boolean r36, boolean r37, boolean r38, boolean r39, boolean r40, boolean r41) {
        return Companion.df(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41);
    }

    public static final ErrorCode st1(float r8, float r9, float r10, float r11, float r12, int r13, int r14) {
        return Companion.st1(r8, r9, r10, r11, r12, r13, r14);
    }

    public static final ErrorCode st2(float r9, boolean r10, int r11, int r12, int r13, int r14, long r15) {
        return Companion.st2(r9, r10, r11, r12, r13, r14, r15);
    }

    public static final ErrorCode sw(float r8, float r9, float r10, float r11, float r12, float r13, float r14) {
        return Companion.sw(r8, r9, r10, r11, r12, r13, r14);
    }

    public static final ErrorCode df(byte[] r24, byte[] r25, byte[] r26, int r27, int r28, int r29, int r30, int r31, int r32, int r33, int r34, PixelFormat r35, DetectionResult r36, boolean r37, boolean r38, boolean r39, boolean r40, boolean r41, boolean r42, boolean r43, long r44) {
        return Companion.df(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44);
    }

    public static final ErrorCode st1(float r9, float r10, float r11, float r12, float r13, int r14, int r15, float r16) {
        return Companion.st1(r9, r10, r11, r12, r13, r14, r15, r16);
    }

    public static final ErrorCode st2(float r10, boolean r11, int r12, int r13, int r14, int r15, long r16, int r18) {
        return Companion.st2(r10, r11, r12, r13, r14, r15, r16, r18);
    }

    public static final ErrorCode sw(float r9, float r10, float r11, float r12, float r13, float r14, float r15, float r16) {
        return Companion.sw(r9, r10, r11, r12, r13, r14, r15, r16);
    }

    public static final ErrorCode df(byte[] r26, byte[] r27, byte[] r28, int r29, int r30, int r31, int r32, int r33, int r34, int r35, int r36, PixelFormat r37, DetectionResult r38, boolean r39, boolean r40, boolean r41, boolean r42, boolean r43, boolean r44, boolean r45, long r46, long r48) {
        return Companion.df(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r48);
    }

    public static final ErrorCode st1(float r10, float r11, float r12, float r13, float r14, int r15, int r16, float r17, float r18) {
        return Companion.st1(r10, r11, r12, r13, r14, r15, r16, r17, r18);
    }

    public static final ErrorCode st2(float r11, boolean r12, int r13, int r14, int r15, int r16, long r17, int r19, float r20) {
        return Companion.st2(r11, r12, r13, r14, r15, r16, r17, r19, r20);
    }

    public static final ErrorCode sw(float r10, float r11, float r12, float r13, float r14, float r15, float r16, float r17, float r18) {
        return Companion.sw(r10, r11, r12, r13, r14, r15, r16, r17, r18);
    }

    public static final ErrorCode st1(float r11, float r12, float r13, float r14, float r15, int r16, int r17, float r18, float r19, float r20) {
        return Companion.st1(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20);
    }

    public static final ErrorCode st2(float r13, boolean r14, int r15, int r16, int r17, int r18, long r19, int r21, float r22, long r23) {
        return Companion.st2(r13, r14, r15, r16, r17, r18, r19, r21, r22, r23);
    }

    public static final ErrorCode sw(float r11, float r12, float r13, float r14, float r15, float r16, float r17, float r18, float r19, float r20) {
        return Companion.sw(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20);
    }

    public static final ErrorCode st1(float r12, float r13, float r14, float r15, float r16, int r17, int r18, float r19, float r20, float r21, float r22) {
        return Companion.st1(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22);
    }

    public static final ErrorCode st2(float r14, boolean r15, int r16, int r17, int r18, int r19, long r20, int r22, float r23, long r24, int r26) {
        return Companion.st2(r14, r15, r16, r17, r18, r19, r20, r22, r23, r24, r26);
    }

    public static final ErrorCode sw(float r12, float r13, float r14, float r15, float r16, float r17, float r18, float r19, float r20, float r21, float r22) {
        return Companion.sw(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22);
    }

    public static final ErrorCode st1(float r13, float r14, float r15, float r16, float r17, int r18, int r19, float r20, float r21, float r22, float r23, float r24) {
        return Companion.st1(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24);
    }

    public static final ErrorCode st2(float r17, boolean r18, int r19, int r20, int r21, int r22, long r23, int r25, float r26, long r27, int r29, long r30) {
        return Companion.st2(r17, r18, r19, r20, r21, r22, r23, r25, r26, r27, r29, r30);
    }

    public static final ErrorCode sw(float r13, float r14, float r15, float r16, float r17, float r18, float r19, float r20, float r21, float r22, float r23, float r24) {
        return Companion.sw(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24);
    }

    public static final ErrorCode st1(float r14, float r15, float r16, float r17, float r18, int r19, int r20, float r21, float r22, float r23, float r24, float r25, float r26) {
        return Companion.st1(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26);
    }

    public static final ErrorCode st2(float r19, boolean r20, int r21, int r22, int r23, int r24, long r25, int r27, float r28, long r29, int r31, long r32, long r34) {
        return Companion.st2(r19, r20, r21, r22, r23, r24, r25, r27, r28, r29, r31, r32, r34);
    }

    public static final ErrorCode sw(float r14, float r15, float r16, float r17, float r18, float r19, float r20, float r21, float r22, float r23, float r24, float r25, float r26) {
        return Companion.sw(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26);
    }

    public static final ErrorCode st1(float r15, float r16, float r17, float r18, float r19, int r20, int r21, float r22, float r23, float r24, float r25, float r26, float r27, int r28) {
        return Companion.st1(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28);
    }

    public static final ErrorCode st2(float r20, boolean r21, int r22, int r23, int r24, int r25, long r26, int r28, float r29, long r30, int r32, long r33, long r35, float r37) {
        return Companion.st2(r20, r21, r22, r23, r24, r25, r26, r28, r29, r30, r32, r33, r35, r37);
    }

    public static final ErrorCode sw(float r15, float r16, float r17, float r18, float r19, float r20, float r21, float r22, float r23, float r24, float r25, float r26, float r27, int r28) {
        return Companion.sw(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28);
    }

    public static final ErrorCode st1(float r17, float r18, float r19, float r20, float r21, int r22, int r23, float r24, float r25, float r26, float r27, float r28, float r29, int r30, int r31) {
        return Companion.st1(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31);
    }

    public static final ErrorCode st2(float r21, boolean r22, int r23, int r24, int r25, int r26, long r27, int r29, float r30, long r31, int r33, long r34, long r36, float r38, float r39) {
        return Companion.st2(r21, r22, r23, r24, r25, r26, r27, r29, r30, r31, r33, r34, r36, r38, r39);
    }

    public static final ErrorCode sw(float r17, float r18, float r19, float r20, float r21, float r22, float r23, float r24, float r25, float r26, float r27, float r28, float r29, int r30, int r31) {
        return Companion.sw(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31);
    }

    public static final ErrorCode st2(float r22, boolean r23, int r24, int r25, int r26, int r27, long r28, int r30, float r31, long r32, int r34, long r35, long r37, float r39, float r40, float r41) {
        return Companion.st2(r22, r23, r24, r25, r26, r27, r28, r30, r31, r32, r34, r35, r37, r39, r40, r41);
    }

    public static final ErrorCode sw(float r18, float r19, float r20, float r21, float r22, float r23, float r24, float r25, float r26, float r27, float r28, float r29, float r30, int r31, int r32, float r33) {
        return Companion.sw(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33);
    }

    public static final ErrorCode st2(float r23, boolean r24, int r25, int r26, int r27, int r28, long r29, int r31, float r32, long r33, int r35, long r36, long r38, float r40, float r41, float r42, float r43) {
        return Companion.st2(r23, r24, r25, r26, r27, r28, r29, r31, r32, r33, r35, r36, r38, r40, r41, r42, r43);
    }

    public static final ErrorCode sw(float r19, float r20, float r21, float r22, float r23, float r24, float r25, float r26, float r27, float r28, float r29, float r30, float r31, int r32, int r33, float r34, float r35) {
        return Companion.sw(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35);
    }

    public static final ErrorCode st2(float r24, boolean r25, int r26, int r27, int r28, int r29, long r30, int r32, float r33, long r34, int r36, long r37, long r39, float r41, float r42, float r43, float r44, float r45) {
        return Companion.st2(r24, r25, r26, r27, r28, r29, r30, r32, r33, r34, r36, r37, r39, r41, r42, r43, r44, r45);
    }

    public static final ErrorCode sw(float r20, float r21, float r22, float r23, float r24, float r25, float r26, float r27, float r28, float r29, float r30, float r31, float r32, int r33, int r34, float r35, float r36, float r37) {
        return Companion.sw(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37);
    }

    public static final ErrorCode st2(float r25, boolean r26, int r27, int r28, int r29, int r30, long r31, int r33, float r34, long r35, int r37, long r38, long r40, float r42, float r43, float r44, float r45, float r46, boolean r47) {
        return Companion.st2(r25, r26, r27, r28, r29, r30, r31, r33, r34, r35, r37, r38, r40, r42, r43, r44, r45, r46, r47);
    }

    public static final ErrorCode sw(float r21, float r22, float r23, float r24, float r25, float r26, float r27, float r28, float r29, float r30, float r31, float r32, float r33, int r34, int r35, float r36, float r37, float r38, float r39) {
        return Companion.sw(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39);
    }

    public static final ErrorCode st2(float r26, boolean r27, int r28, int r29, int r30, int r31, long r32, int r34, float r35, long r36, int r38, long r39, long r41, float r43, float r44, float r45, float r46, float r47, boolean r48, float r49) {
        return Companion.st2(r26, r27, r28, r29, r30, r31, r32, r34, r35, r36, r38, r39, r41, r43, r44, r45, r46, r47, r48, r49);
    }

    public static final ErrorCode sw(float r22, float r23, float r24, float r25, float r26, float r27, float r28, float r29, float r30, float r31, float r32, float r33, float r34, int r35, int r36, float r37, float r38, float r39, float r40, float r41) {
        return Companion.sw(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41);
    }

    public static final ErrorCode st2(float r27, boolean r28, int r29, int r30, int r31, int r32, long r33, int r35, float r36, long r37, int r39, long r40, long r42, float r44, float r45, float r46, float r47, float r48, boolean r49, float r50, boolean r51) {
        return Companion.st2(r27, r28, r29, r30, r31, r32, r33, r35, r36, r37, r39, r40, r42, r44, r45, r46, r47, r48, r49, r50, r51);
    }

    public static final ErrorCode st2(float r28, boolean r29, int r30, int r31, int r32, int r33, long r34, int r36, float r37, long r38, int r40, long r41, long r43, float r45, float r46, float r47, float r48, float r49, boolean r50, float r51, boolean r52, float r53) {
        return Companion.st2(r28, r29, r30, r31, r32, r33, r34, r36, r37, r38, r40, r41, r43, r45, r46, r47, r48, r49, r50, r51, r52, r53);
    }

    public static final ErrorCode st2(float r29, boolean r30, int r31, int r32, int r33, int r34, long r35, int r37, float r38, long r39, int r41, long r42, long r44, float r46, float r47, float r48, float r49, float r50, boolean r51, float r52, boolean r53, float r54, float r55) {
        return Companion.st2(r29, r30, r31, r32, r33, r34, r35, r37, r38, r39, r41, r42, r44, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55);
    }

    public static final ErrorCode st2(float r30, boolean r31, int r32, int r33, int r34, int r35, long r36, int r38, float r39, long r40, int r42, long r43, long r45, float r47, float r48, float r49, float r50, float r51, boolean r52, float r53, boolean r54, float r55, float r56, float r57) {
        return Companion.st2(r30, r31, r32, r33, r34, r35, r36, r38, r39, r40, r42, r43, r45, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57);
    }

    public static final ErrorCode st2(float r31, boolean r32, int r33, int r34, int r35, int r36, long r37, int r39, float r40, long r41, int r43, long r44, long r46, float r48, float r49, float r50, float r51, float r52, boolean r53, float r54, boolean r55, float r56, float r57, float r58, float r59) {
        return Companion.st2(r31, r32, r33, r34, r35, r36, r37, r39, r40, r41, r43, r44, r46, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59);
    }

    public static final ErrorCode st2(float r32, boolean r33, int r34, int r35, int r36, int r37, long r38, int r40, float r41, long r42, int r44, long r45, long r47, float r49, float r50, float r51, float r52, float r53, boolean r54, float r55, boolean r56, float r57, float r58, float r59, float r60, float r61) {
        return Companion.st2(r32, r33, r34, r35, r36, r37, r38, r40, r41, r42, r44, r45, r47, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61);
    }

    public static final ErrorCode st2(float r33, boolean r34, int r35, int r36, int r37, int r38, long r39, int r41, float r42, long r43, int r45, long r46, long r48, float r50, float r51, float r52, float r53, float r54, boolean r55, float r56, boolean r57, float r58, float r59, float r60, float r61, float r62, float r63) {
        return Companion.st2(r33, r34, r35, r36, r37, r38, r39, r41, r42, r43, r45, r46, r48, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63);
    }

    public static final ErrorCode st2(float r34, boolean r35, int r36, int r37, int r38, int r39, long r40, int r42, float r43, long r44, int r46, long r47, long r49, float r51, float r52, float r53, float r54, float r55, boolean r56, float r57, boolean r58, float r59, float r60, float r61, float r62, float r63, float r64, float r65) {
        return Companion.st2(r34, r35, r36, r37, r38, r39, r40, r42, r43, r44, r46, r47, r49, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65);
    }

    public static final ErrorCode st2(float r35, boolean r36, int r37, int r38, int r39, int r40, long r41, int r43, float r44, long r45, int r47, long r48, long r50, float r52, float r53, float r54, float r55, float r56, boolean r57, float r58, boolean r59, float r60, float r61, float r62, float r63, float r64, float r65, float r66, float r67) {
        return Companion.st2(r35, r36, r37, r38, r39, r40, r41, r43, r44, r45, r47, r48, r50, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67);
    }

    public static final ErrorCode st2(float r36, boolean r37, int r38, int r39, int r40, int r41, long r42, int r44, float r45, long r46, int r48, long r49, long r51, float r53, float r54, float r55, float r56, float r57, boolean r58, float r59, boolean r60, float r61, float r62, float r63, float r64, float r65, float r66, float r67, float r68, boolean r69) {
        return Companion.st2(r36, r37, r38, r39, r40, r41, r42, r44, r45, r46, r48, r49, r51, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69);
    }

    public static final ErrorCode st2(float r37, boolean r38, int r39, int r40, int r41, int r42, long r43, int r45, float r46, long r47, int r49, long r50, long r52, float r54, float r55, float r56, float r57, float r58, boolean r59, float r60, boolean r61, float r62, float r63, float r64, float r65, float r66, float r67, float r68, float r69, boolean r70, float r71) {
        return Companion.st2(r37, r38, r39, r40, r41, r42, r43, r45, r46, r47, r49, r50, r52, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71);
    }

    public static final ErrorCode st2(float r38, boolean r39, int r40, int r41, int r42, int r43, long r44, int r46, float r47, long r48, int r50, long r51, long r53, float r55, float r56, float r57, float r58, float r59, boolean r60, float r61, boolean r62, float r63, float r64, float r65, float r66, float r67, float r68, float r69, float r70, boolean r71, float r72, float r73) {
        return Companion.st2(r38, r39, r40, r41, r42, r43, r44, r46, r47, r48, r50, r51, r53, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73);
    }

    public static final ErrorCode st2(float r39, boolean r40, int r41, int r42, int r43, int r44, long r45, int r47, float r48, long r49, int r51, long r52, long r54, float r56, float r57, float r58, float r59, float r60, boolean r61, float r62, boolean r63, float r64, float r65, float r66, float r67, float r68, float r69, float r70, float r71, boolean r72, float r73, float r74, int r75) {
        return Companion.st2(r39, r40, r41, r42, r43, r44, r45, r47, r48, r49, r51, r52, r54, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75);
    }

    public static final ErrorCode st2(float r40, boolean r41, int r42, int r43, int r44, int r45, long r46, int r48, float r49, long r50, int r52, long r53, long r55, float r57, float r58, float r59, float r60, float r61, boolean r62, float r63, boolean r64, float r65, float r66, float r67, float r68, float r69, float r70, float r71, float r72, boolean r73, float r74, float r75, int r76, int r77) {
        return Companion.st2(r40, r41, r42, r43, r44, r45, r46, r48, r49, r50, r52, r53, r55, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77);
    }

    public static final ErrorCode st2(float r41, boolean r42, int r43, int r44, int r45, int r46, long r47, int r49, float r50, long r51, int r53, long r54, long r56, float r58, float r59, float r60, float r61, float r62, boolean r63, float r64, boolean r65, float r66, float r67, float r68, float r69, float r70, float r71, float r72, float r73, boolean r74, float r75, float r76, int r77, int r78, float r79) {
        return Companion.st2(r41, r42, r43, r44, r45, r46, r47, r49, r50, r51, r53, r54, r56, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79);
    }

    public static final ErrorCode st2(float r42, boolean r43, int r44, int r45, int r46, int r47, long r48, int r50, float r51, long r52, int r54, long r55, long r57, float r59, float r60, float r61, float r62, float r63, boolean r64, float r65, boolean r66, float r67, float r68, float r69, float r70, float r71, float r72, float r73, float r74, boolean r75, float r76, float r77, int r78, int r79, float r80, float r81) {
        return Companion.st2(r42, r43, r44, r45, r46, r47, r48, r50, r51, r52, r54, r55, r57, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81);
    }

    public static final ErrorCode st2(float r43, boolean r44, int r45, int r46, int r47, int r48, long r49, int r51, float r52, long r53, int r55, long r56, long r58, float r60, float r61, float r62, float r63, float r64, boolean r65, float r66, boolean r67, float r68, float r69, float r70, float r71, float r72, float r73, float r74, float r75, boolean r76, float r77, float r78, int r79, int r80, float r81, float r82, float r83) {
        return Companion.st2(r43, r44, r45, r46, r47, r48, r49, r51, r52, r53, r55, r56, r58, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83);
    }

    public static final ErrorCode st2(float r44, boolean r45, int r46, int r47, int r48, int r49, long r50, int r52, float r53, long r54, int r56, long r57, long r59, float r61, float r62, float r63, float r64, float r65, boolean r66, float r67, boolean r68, float r69, float r70, float r71, float r72, float r73, float r74, float r75, float r76, boolean r77, float r78, float r79, int r80, int r81, float r82, float r83, float r84, float r85) {
        return Companion.st2(r44, r45, r46, r47, r48, r49, r50, r52, r53, r54, r56, r57, r59, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85);
    }

    public static final ErrorCode st2(float r45, boolean r46, int r47, int r48, int r49, int r50, long r51, int r53, float r54, long r55, int r57, long r58, long r60, float r62, float r63, float r64, float r65, float r66, boolean r67, float r68, boolean r69, float r70, float r71, float r72, float r73, float r74, float r75, float r76, float r77, boolean r78, float r79, float r80, int r81, int r82, float r83, float r84, float r85, float r86, float r87) {
        return Companion.st2(r45, r46, r47, r48, r49, r50, r51, r53, r54, r55, r57, r58, r60, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87);
    }

    public static final ErrorCode st2(float r46, boolean r47, int r48, int r49, int r50, int r51, long r52, int r54, float r55, long r56, int r58, long r59, long r61, float r63, float r64, float r65, float r66, float r67, boolean r68, float r69, boolean r70, float r71, float r72, float r73, float r74, float r75, float r76, float r77, float r78, boolean r79, float r80, float r81, int r82, int r83, float r84, float r85, float r86, float r87, float r88, float r89) {
        return Companion.st2(r46, r47, r48, r49, r50, r51, r52, r54, r55, r56, r58, r59, r61, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89);
    }

    public static final ErrorCode st2(float r47, boolean r48, int r49, int r50, int r51, int r52, long r53, int r55, float r56, long r57, int r59, long r60, long r62, float r64, float r65, float r66, float r67, float r68, boolean r69, float r70, boolean r71, float r72, float r73, float r74, float r75, float r76, float r77, float r78, float r79, boolean r80, float r81, float r82, int r83, int r84, float r85, float r86, float r87, float r88, float r89, float r90, float r91) {
        return Companion.st2(r47, r48, r49, r50, r51, r52, r53, r55, r56, r57, r59, r60, r62, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91);
    }

    public static final ErrorCode st2(float r48, boolean r49, int r50, int r51, int r52, int r53, long r54, int r56, float r57, long r58, int r60, long r61, long r63, float r65, float r66, float r67, float r68, float r69, boolean r70, float r71, boolean r72, float r73, float r74, float r75, float r76, float r77, float r78, float r79, float r80, boolean r81, float r82, float r83, int r84, int r85, float r86, float r87, float r88, float r89, float r90, float r91, float r92, float r93) {
        return Companion.st2(r48, r49, r50, r51, r52, r53, r54, r56, r57, r58, r60, r61, r63, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93);
    }

    public static final ErrorCode st2(float r49, boolean r50, int r51, int r52, int r53, int r54, long r55, int r57, float r58, long r59, int r61, long r62, long r64, float r66, float r67, float r68, float r69, float r70, boolean r71, float r72, boolean r73, float r74, float r75, float r76, float r77, float r78, float r79, float r80, float r81, boolean r82, float r83, float r84, int r85, int r86, float r87, float r88, float r89, float r90, float r91, float r92, float r93, float r94, int r95) {
        return Companion.st2(r49, r50, r51, r52, r53, r54, r55, r57, r58, r59, r61, r62, r64, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95);
    }

    public static final ErrorCode st2(float r50, boolean r51, int r52, int r53, int r54, int r55, long r56, int r58, float r59, long r60, int r62, long r63, long r65, float r67, float r68, float r69, float r70, float r71, boolean r72, float r73, boolean r74, float r75, float r76, float r77, float r78, float r79, float r80, float r81, float r82, boolean r83, float r84, float r85, int r86, int r87, float r88, float r89, float r90, float r91, float r92, float r93, float r94, float r95, int r96, int r97) {
        return Companion.st2(r50, r51, r52, r53, r54, r55, r56, r58, r59, r60, r62, r63, r65, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97);
    }

    public static final ErrorCode st2(float r51, boolean r52, int r53, int r54, int r55, int r56, long r57, int r59, float r60, long r61, int r63, long r64, long r66, float r68, float r69, float r70, float r71, float r72, boolean r73, float r74, boolean r75, float r76, float r77, float r78, float r79, float r80, float r81, float r82, float r83, boolean r84, float r85, float r86, int r87, int r88, float r89, float r90, float r91, float r92, float r93, float r94, float r95, float r96, int r97, int r98, int r99) {
        return Companion.st2(r51, r52, r53, r54, r55, r56, r57, r59, r60, r61, r63, r64, r66, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99);
    }

    public static final ErrorCode st2(float r52, boolean r53, int r54, int r55, int r56, int r57, long r58, int r60, float r61, long r62, int r64, long r65, long r67, float r69, float r70, float r71, float r72, float r73, boolean r74, float r75, boolean r76, float r77, float r78, float r79, float r80, float r81, float r82, float r83, float r84, boolean r85, float r86, float r87, int r88, int r89, float r90, float r91, float r92, float r93, float r94, float r95, float r96, float r97, int r98, int r99, int r100, int r101) {
        return Companion.st2(r52, r53, r54, r55, r56, r57, r58, r60, r61, r62, r64, r65, r67, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101);
    }

    public static final ErrorCode st2(float r53, boolean r54, int r55, int r56, int r57, int r58, long r59, int r61, float r62, long r63, int r65, long r66, long r68, float r70, float r71, float r72, float r73, float r74, boolean r75, float r76, boolean r77, float r78, float r79, float r80, float r81, float r82, float r83, float r84, float r85, boolean r86, float r87, float r88, int r89, int r90, float r91, float r92, float r93, float r94, float r95, float r96, float r97, float r98, int r99, int r100, int r101, int r102, float r103) {
        return Companion.st2(r53, r54, r55, r56, r57, r58, r59, r61, r62, r63, r65, r66, r68, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103);
    }

    public static final ErrorCode st2(float r54, boolean r55, int r56, int r57, int r58, int r59, long r60, int r62, float r63, long r64, int r66, long r67, long r69, float r71, float r72, float r73, float r74, float r75, boolean r76, float r77, boolean r78, float r79, float r80, float r81, float r82, float r83, float r84, float r85, float r86, boolean r87, float r88, float r89, int r90, int r91, float r92, float r93, float r94, float r95, float r96, float r97, float r98, float r99, int r100, int r101, int r102, int r103, float r104, float r105) {
        return Companion.st2(r54, r55, r56, r57, r58, r59, r60, r62, r63, r64, r66, r67, r69, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105);
    }

    public static final ErrorCode st2(float r55, boolean r56, int r57, int r58, int r59, int r60, long r61, int r63, float r64, long r65, int r67, long r68, long r70, float r72, float r73, float r74, float r75, float r76, boolean r77, float r78, boolean r79, float r80, float r81, float r82, float r83, float r84, float r85, float r86, float r87, boolean r88, float r89, float r90, int r91, int r92, float r93, float r94, float r95, float r96, float r97, float r98, float r99, float r100, int r101, int r102, int r103, int r104, float r105, float r106, float r107) {
        return Companion.st2(r55, r56, r57, r58, r59, r60, r61, r63, r64, r65, r67, r68, r70, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107);
    }

    public static final ErrorCode st2(float r56, boolean r57, int r58, int r59, int r60, int r61, long r62, int r64, float r65, long r66, int r68, long r69, long r71, float r73, float r74, float r75, float r76, float r77, boolean r78, float r79, boolean r80, float r81, float r82, float r83, float r84, float r85, float r86, float r87, float r88, boolean r89, float r90, float r91, int r92, int r93, float r94, float r95, float r96, float r97, float r98, float r99, float r100, float r101, int r102, int r103, int r104, int r105, float r106, float r107, float r108, float r109) {
        return Companion.st2(r56, r57, r58, r59, r60, r61, r62, r64, r65, r66, r68, r69, r71, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109);
    }

    public static final ErrorCode st2(float r57, boolean r58, int r59, int r60, int r61, int r62, long r63, int r65, float r66, long r67, int r69, long r70, long r72, float r74, float r75, float r76, float r77, float r78, boolean r79, float r80, boolean r81, float r82, float r83, float r84, float r85, float r86, float r87, float r88, float r89, boolean r90, float r91, float r92, int r93, int r94, float r95, float r96, float r97, float r98, float r99, float r100, float r101, float r102, int r103, int r104, int r105, int r106, float r107, float r108, float r109, float r110, int r111) {
        return Companion.st2(r57, r58, r59, r60, r61, r62, r63, r65, r66, r67, r69, r70, r72, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110, r111);
    }

    public static final ErrorCode st2(float r58, boolean r59, int r60, int r61, int r62, int r63, long r64, int r66, float r67, long r68, int r70, long r71, long r73, float r75, float r76, float r77, float r78, float r79, boolean r80, float r81, boolean r82, float r83, float r84, float r85, float r86, float r87, float r88, float r89, float r90, boolean r91, float r92, float r93, int r94, int r95, float r96, float r97, float r98, float r99, float r100, float r101, float r102, float r103, int r104, int r105, int r106, int r107, float r108, float r109, float r110, float r111, int r112, int r113) {
        return Companion.st2(r58, r59, r60, r61, r62, r63, r64, r66, r67, r68, r70, r71, r73, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110, r111, r112, r113);
    }

    public static final ErrorCode st2(float r59, boolean r60, int r61, int r62, int r63, int r64, long r65, int r67, float r68, long r69, int r71, long r72, long r74, float r76, float r77, float r78, float r79, float r80, boolean r81, float r82, boolean r83, float r84, float r85, float r86, float r87, float r88, float r89, float r90, float r91, boolean r92, float r93, float r94, int r95, int r96, float r97, float r98, float r99, float r100, float r101, float r102, float r103, float r104, int r105, int r106, int r107, int r108, float r109, float r110, float r111, float r112, int r113, int r114, int r115) {
        return Companion.st2(r59, r60, r61, r62, r63, r64, r65, r67, r68, r69, r71, r72, r74, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110, r111, r112, r113, r114, r115);
    }
}

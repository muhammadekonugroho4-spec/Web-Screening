package com.google.zxing.client.android.camera;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Build;
import android.util.Log;
import com.journeyapps.barcodescanner.camera.CameraSettings;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlinx.coroutines.DebugKt;

/* loaded from: classes6.dex */
public final class CameraConfigurationUtils {
    private static final int AREA_PER_1000 = 400;
    private static final float MAX_EXPOSURE_COMPENSATION = 1.5f;
    private static final int MAX_FPS = 20;
    private static final float MIN_EXPOSURE_COMPENSATION = 0.0f;
    private static final int MIN_FPS = 10;
    private static final Pattern SEMICOLON = null;
    private static final String TAG = "CameraConfiguration";

    static {
        SEMICOLON = Pattern.compile(";");
    }

    private CameraConfigurationUtils() {
    }

    @TargetApi(15)
    private static List<Camera.Area> buildMiddleArea(int r3) {
        int r2 = -r3;
        return Collections.singletonList(new Camera.Area(new Rect(r2, r2, r3, r3), 1));
    }

    public static String collectStats(Camera.Parameters r02) {
        return collectStats(r02.flatten());
    }

    private static String findSettableValue(String r5, Collection<String> r6, String... r7) {
        Log.i(TAG, "Requesting " + r5 + " value from among: " + Arrays.toString(r7));
        Log.i(TAG, "Supported " + r5 + " values: " + r6);
        if (r6 == null) goto L11;
        int r02 = r7.length;
        int r2 = 0;
    L5:
        if (r2 >= r02) goto L11;
        String r3 = r7[r2];
        if (r6.contains(r3) == true) goto L8;
        r2 = r2 + 1;
        goto L5
    L8:
        Log.i(TAG, "Can set " + r5 + " to: " + r3);
        return r3;
    L11:
        Log.i(TAG, "No supported values match");
        return null;
    }

    private static Integer indexOfClosestZoom(Camera.Parameters r10, double r11) {
        List<Integer> r02 = r10.getZoomRatios();
        Log.i(TAG, "Zoom ratios: " + r02);
        int r102 = r10.getMaxZoom();
        if (r02 != null) goto L5;
    L18:
        Log.w(TAG, "Invalid zoom ratios!");
        return null;
    L5:
        if (r02.isEmpty() == true) goto L18;
        if (r02.size() != (r102 + 1)) goto L18;
        double r112 = r11 * 100.0d;
        int r103 = 0;
        double r5 = Double.POSITIVE_INFINITY;
        int r1 = 0;
    L11:
        if (r103 >= r02.size()) goto L16;
        double r7 = Math.abs(r02.get(r103).intValue() - r112);
        if (r7 >= r5) goto L15;
        r1 = r103;
        r5 = r7;
    L15:
        r103 = r103 + 1;
        goto L11
    L16:
        Log.i(TAG, "Chose zoom ratio of " + (r02.get(r1).intValue() / 100.0d));
        return Integer.valueOf(r1);
    }

    public static void setBarcodeSceneMode(Camera.Parameters r3) {
        if ("barcode".equals(r3.getSceneMode()) == false) goto L6;
        Log.i(TAG, "Barcode scene mode already set");
        return;
    L6:
        String r02 = findSettableValue("scene mode", r3.getSupportedSceneModes(), new String[]{"barcode"});
        if (r02 == null) goto L10;
        r3.setSceneMode(r02);
        return;
    }

    public static void setBestExposure(Camera.Parameters r6, boolean r7) {
        int r02 = r6.getMinExposureCompensation();
        int r1 = r6.getMaxExposureCompensation();
        float r2 = r6.getExposureCompensationStep();
        if (r02 != 0) goto L5;
        if (r1 != 0) goto L5;
    L16:
        Log.i(TAG, "Camera does not support exposure compensation");
        return;
    L5:
        float r4 = 0.0f;
        if (r2 <= 0.0f) goto L16;
        if (r7 == true) goto L10;
        r4 = MAX_EXPOSURE_COMPENSATION;
    L10:
        int r72 = Math.round(r4 / r2);
        float r22 = r2 * r72;
        int r73 = Math.max(Math.min(r72, r1), r02);
        if (r6.getExposureCompensation() != r73) goto L14;
        Log.i(TAG, "Exposure compensation already set to " + r73 + " / " + r22);
        return;
    L14:
        Log.i(TAG, "Setting exposure compensation to " + r73 + " / " + r22);
        r6.setExposureCompensation(r73);
    }

    public static void setBestPreviewFPS(Camera.Parameters r2) {
        setBestPreviewFPS(r2, 10, 20);
    }

    public static void setFocus(Camera.Parameters r5, CameraSettings.FocusMode r6, boolean r7) {
        List<String> r02 = r5.getSupportedFocusModes();
        if (r7 == false) goto L5;
    L17:
        String r62 = findSettableValue("focus mode", r02, new String[]{DebugKt.DEBUG_PROPERTY_VALUE_AUTO});
    L18:
        if (r7 == true) goto L21;
        if (r62 != null) goto L21;
        r62 = findSettableValue("focus mode", r02, new String[]{"macro", "edof"});
    L21:
        if (r62 != null) goto L23;
        return;
    L23:
        if (r62.equals(r5.getFocusMode()) == false) goto L26;
        Log.i(TAG, "Focus mode already set to " + r62);
        return;
    L26:
        r5.setFocusMode(r62);
        return;
    L5:
        if (r6 == CameraSettings.FocusMode.AUTO) goto L17;
        if (r6 != CameraSettings.FocusMode.CONTINUOUS) goto L11;
        r62 = findSettableValue("focus mode", r02, new String[]{"continuous-picture", "continuous-video", DebugKt.DEBUG_PROPERTY_VALUE_AUTO});
        goto L18
    L11:
        if (r6 != CameraSettings.FocusMode.INFINITY) goto L14;
        r62 = findSettableValue("focus mode", r02, new String[]{"infinity"});
        goto L18
    L14:
        if (r6 != CameraSettings.FocusMode.MACRO) goto L16;
        r62 = findSettableValue("focus mode", r02, new String[]{"macro"});
        goto L18
    L16:
        r62 = null;
        goto L18
    }

    @TargetApi(15)
    public static void setFocusArea(Camera.Parameters r4) {
        if (r4.getMaxNumFocusAreas() <= 0) goto L6;
        Log.i(TAG, "Old focus areas: " + toString(r4.getFocusAreas()));
        List<Camera.Area> r02 = buildMiddleArea(400);
        Log.i(TAG, "Setting focus area to : " + toString(r02));
        r4.setFocusAreas(r02);
        return;
    L6:
        Log.i(TAG, "Device does not support focus areas");
    }

    public static void setInvertColor(Camera.Parameters r3) {
        if ("negative".equals(r3.getColorEffect()) == false) goto L6;
        Log.i(TAG, "Negative effect already set");
        return;
    L6:
        String r02 = findSettableValue("color effect", r3.getSupportedColorEffects(), new String[]{"negative"});
        if (r02 == null) goto L10;
        r3.setColorEffect(r02);
        return;
    }

    @TargetApi(15)
    public static void setMetering(Camera.Parameters r4) {
        if (r4.getMaxNumMeteringAreas() <= 0) goto L6;
        Log.i(TAG, "Old metering areas: " + r4.getMeteringAreas());
        List<Camera.Area> r02 = buildMiddleArea(400);
        Log.i(TAG, "Setting metering area to : " + toString(r02));
        r4.setMeteringAreas(r02);
        return;
    L6:
        Log.i(TAG, "Device does not support metering areas");
    }

    public static void setTorch(Camera.Parameters r3, boolean r4) {
        List<String> r02 = r3.getSupportedFlashModes();
        if (r4 == false) goto L5;
        String r42 = findSettableValue("flash mode", r02, new String[]{"torch", DebugKt.DEBUG_PROPERTY_VALUE_ON});
    L6:
        if (r42 != null) goto L8;
        return;
    L8:
        if (r42.equals(r3.getFlashMode()) == false) goto L11;
        Log.i(TAG, "Flash mode already set to " + r42);
        return;
    L11:
        Log.i(TAG, "Setting flash mode to " + r42);
        r3.setFlashMode(r42);
        return;
    L5:
        r42 = findSettableValue("flash mode", r02, new String[]{DebugKt.DEBUG_PROPERTY_VALUE_OFF});
        goto L6
    }

    @TargetApi(15)
    public static void setVideoStabilization(Camera.Parameters r2) {
        if (r2.isVideoStabilizationSupported() == true) goto L5;
        Log.i(TAG, "This device does not support video stabilization");
        return;
    L5:
        if (r2.getVideoStabilization() == false) goto L8;
        Log.i(TAG, "Video stabilization already enabled");
        return;
    L8:
        Log.i(TAG, "Enabling video stabilization...");
        r2.setVideoStabilization(true);
    }

    public static void setZoom(Camera.Parameters r2, double r3) {
        if (r2.isZoomSupported() == false) goto L13;
        Integer r32 = indexOfClosestZoom(r2, r3);
        if (r32 != null) goto L8;
        return;
    L8:
        if (r2.getZoom() != r32.intValue()) goto L11;
        Log.i(TAG, "Zoom is already set to " + r32);
        return;
    L11:
        Log.i(TAG, "Setting zoom to " + r32);
        r2.setZoom(r32.intValue());
        return;
    L13:
        Log.i(TAG, "Zoom is not supported");
    }

    private static String toString(Collection<int[]> r2) {
        if (r2 != null) goto L4;
        return "[]";
    L4:
        if (r2.isEmpty() == true) goto L21;
        StringBuilder r02 = new StringBuilder();
        r02.append('[');
        Iterator<int[]> r22 = r2.iterator();
    L8:
        if (r22.hasNext() == false) goto L12;
        r02.append(Arrays.toString(r22.next()));
        if (r22.hasNext() == false) goto L8;
        r02.append(", ");
        goto L8
    L12:
        r02.append(']');
        return r02.toString();
    L21:
        return "[]";
    }

    public static String collectStats(CharSequence r5) {
        StringBuilder r02 = new StringBuilder(1000);
        r02.append("BOARD=");
        r02.append(Build.BOARD);
        r02.append('\n');
        r02.append("BRAND=");
        r02.append(Build.BRAND);
        r02.append('\n');
        r02.append("CPU_ABI=");
        r02.append(Build.CPU_ABI);
        r02.append('\n');
        r02.append("DEVICE=");
        r02.append(Build.DEVICE);
        r02.append('\n');
        r02.append("DISPLAY=");
        r02.append(Build.DISPLAY);
        r02.append('\n');
        r02.append("FINGERPRINT=");
        r02.append(Build.FINGERPRINT);
        r02.append('\n');
        r02.append("HOST=");
        r02.append(Build.HOST);
        r02.append('\n');
        r02.append("ID=");
        r02.append(Build.ID);
        r02.append('\n');
        r02.append("MANUFACTURER=");
        r02.append(Build.MANUFACTURER);
        r02.append('\n');
        r02.append("MODEL=");
        r02.append(Build.MODEL);
        r02.append('\n');
        r02.append("PRODUCT=");
        r02.append(Build.PRODUCT);
        r02.append('\n');
        r02.append("TAGS=");
        r02.append(Build.TAGS);
        r02.append('\n');
        r02.append("TIME=");
        r02.append(Build.TIME);
        r02.append('\n');
        r02.append("TYPE=");
        r02.append(Build.TYPE);
        r02.append('\n');
        r02.append("USER=");
        r02.append(Build.USER);
        r02.append('\n');
        r02.append("VERSION.CODENAME=");
        r02.append(Build.VERSION.CODENAME);
        r02.append('\n');
        r02.append("VERSION.INCREMENTAL=");
        r02.append(Build.VERSION.INCREMENTAL);
        r02.append('\n');
        r02.append("VERSION.RELEASE=");
        r02.append(Build.VERSION.RELEASE);
        r02.append('\n');
        r02.append("VERSION.SDK_INT=");
        r02.append(Build.VERSION.SDK_INT);
        r02.append('\n');
        if (r5 == null) goto L8;
        String[] r52 = SEMICOLON.split(r5);
        Arrays.sort(r52);
        int r2 = r52.length;
        int r3 = 0;
    L5:
        if (r3 >= r2) goto L8;
        r02.append(r52[r3]);
        r02.append('\n');
        r3 = r3 + 1;
    L8:
        return r02.toString();
    }

    public static void setBestPreviewFPS(Camera.Parameters r8, int r9, int r10) {
        List<int[]> r02 = r8.getSupportedPreviewFpsRange();
        Log.i(TAG, "Supported FPS ranges: " + toString(r02));
        if (r02 != null) goto L5;
        return;
    L5:
        if (r02.isEmpty() == true) goto L31;
        Iterator<int[]> r03 = r02.iterator();
    L8:
        if (r03.hasNext() == false) goto L14;
        int[] r1 = r03.next();
        int r5 = r1[0];
        int r6 = r1[1];
        if (r5 < (r9 * 1000)) goto L8;
        if (r6 > (r10 * 1000)) goto L8;
    L15:
        if (r1 != null) goto L18;
        Log.i(TAG, "No suitable FPS range?");
        return;
    L18:
        int[] r92 = new int[2];
        r8.getPreviewFpsRange(r92);
        if (Arrays.equals(r92, r1) == false) goto L22;
        Log.i(TAG, "FPS range already set to " + Arrays.toString(r1));
        return;
    L22:
        Log.i(TAG, "Setting FPS range to " + Arrays.toString(r1));
        r8.setPreviewFpsRange(r1[0], r1[1]);
        return;
    L14:
        r1 = null;
        goto L15
    }

    @TargetApi(15)
    private static String toString(Iterable<Camera.Area> r3) {
        if (r3 != null) goto L5;
        return null;
    L5:
        StringBuilder r02 = new StringBuilder();
        Iterator<Camera.Area> r32 = r3.iterator();
    L7:
        if (r32.hasNext() == false) goto L10;
        Camera.Area r1 = r32.next();
        r02.append(r1.rect);
        r02.append(':');
        r02.append(r1.weight);
        r02.append(' ');
        goto L7
    L10:
        return r02.toString();
    }
}

package com.google.firebase.perf.logging;

/* loaded from: classes6.dex */
public final class ConsoleUrlGenerator {
    private static final String URL_BASE_PATH = "https://console.firebase.google.com";
    private static final String UTM_MEDIUM = "android-ide";
    private static final String UTM_SOURCE = "perf-android-sdk";

    public ConsoleUrlGenerator() {
    }

    public static String generateCustomTraceUrl(String r1, String r2, String r3) {
        return String.format("%s/troubleshooting/trace/DURATION_TRACE/%s?utm_source=%s&utm_medium=%s", new Object[]{getRootUrl(r1, r2), r3, UTM_SOURCE, UTM_MEDIUM});
    }

    public static String generateDashboardUrl(String r1, String r2) {
        return String.format("%s/trends?utm_source=%s&utm_medium=%s", new Object[]{getRootUrl(r1, r2), UTM_SOURCE, UTM_MEDIUM});
    }

    public static String generateScreenTraceUrl(String r1, String r2, String r3) {
        return String.format("%s/troubleshooting/trace/SCREEN_TRACE/%s?utm_source=%s&utm_medium=%s", new Object[]{getRootUrl(r1, r2), r3, UTM_SOURCE, UTM_MEDIUM});
    }

    private static String getRootUrl(String r1, String r2) {
        return String.format("%s/project/%s/performance/app/android:%s", new Object[]{URL_BASE_PATH, r1, r2});
    }
}

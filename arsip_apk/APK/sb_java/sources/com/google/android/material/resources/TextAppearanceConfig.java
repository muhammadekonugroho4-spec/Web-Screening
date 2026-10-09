package com.google.android.material.resources;

@Deprecated
/* loaded from: classes5.dex */
public class TextAppearanceConfig {
    private static boolean shouldLoadFontSynchronously;

    public TextAppearanceConfig() {
    }

    public static void setShouldLoadFontSynchronously(boolean r02) {
        shouldLoadFontSynchronously = r02;
    }

    public static boolean shouldLoadFontSynchronously() {
        return shouldLoadFontSynchronously;
    }
}

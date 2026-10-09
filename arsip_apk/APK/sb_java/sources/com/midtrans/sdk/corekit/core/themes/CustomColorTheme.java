package com.midtrans.sdk.corekit.core.themes;

import android.graphics.Color;
import com.midtrans.sdk.corekit.core.Logger;

/* loaded from: classes6.dex */
public class CustomColorTheme implements BaseColorTheme {
    private String colorPrimaryDarkHex;
    private String colorPrimaryHex;
    private String colorSecondaryHex;

    public CustomColorTheme(String r1, String r2, String r3) {
        this.colorPrimaryHex = r1;
        this.colorPrimaryDarkHex = r2;
        this.colorSecondaryHex = r3;
    }

    @Override // com.midtrans.sdk.corekit.core.themes.BaseColorTheme
    public int getPrimaryColor() {
    L10:
        Logger.e("Color cannot be parsed. Reverted back to default grey color.");
        return Color.parseColor("#999999");
    L4:
        if (this.colorPrimaryHex.startsWith("#") == true) goto L8;
        String r02 = "#" + this.colorPrimaryHex.toLowerCase();     // Catch: Exception -> L10
    L6:
        return Color.parseColor(r02);
    L8:
        r02 = this.colorPrimaryHex.toLowerCase();     // Catch: Exception -> L10
        goto L6
    }

    @Override // com.midtrans.sdk.corekit.core.themes.BaseColorTheme
    public int getPrimaryDarkColor() {
    L10:
        Logger.e("Color cannot be parsed. Reverted back to default grey color.");
        return Color.parseColor("#737373");
    L4:
        if (this.colorPrimaryDarkHex.startsWith("#") == true) goto L8;
        String r02 = "#" + this.colorPrimaryDarkHex.toLowerCase();     // Catch: Exception -> L10
    L6:
        return Color.parseColor(r02);
    L8:
        r02 = this.colorPrimaryDarkHex.toLowerCase();     // Catch: Exception -> L10
        goto L6
    }

    @Override // com.midtrans.sdk.corekit.core.themes.BaseColorTheme
    public int getSecondaryColor() {
    L10:
        Logger.e("Color cannot be parsed. Reverted back to default grey color.");
        return Color.parseColor("#adadad");
    L4:
        if (this.colorSecondaryHex.startsWith("#") == true) goto L8;
        String r02 = "#" + this.colorSecondaryHex.toLowerCase();     // Catch: Exception -> L10
    L6:
        return Color.parseColor(r02);
    L8:
        r02 = this.colorSecondaryHex.toLowerCase();     // Catch: Exception -> L10
        goto L6
    }
}

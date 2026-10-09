package com.google.zxing.client.android;

import android.content.Intent;
import com.clevertap.android.sdk.Constants;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.android.Intents;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public final class DecodeFormatManager {
    static final Set<BarcodeFormat> AZTEC_FORMATS = null;
    private static final Pattern COMMA_PATTERN = null;
    static final Set<BarcodeFormat> DATA_MATRIX_FORMATS = null;
    private static final Map<String, Set<BarcodeFormat>> FORMATS_FOR_MODE = null;
    static final Set<BarcodeFormat> INDUSTRIAL_FORMATS = null;
    private static final Set<BarcodeFormat> ONE_D_FORMATS = null;
    static final Set<BarcodeFormat> PDF417_FORMATS = null;
    static final Set<BarcodeFormat> PRODUCT_FORMATS = null;
    static final Set<BarcodeFormat> QR_CODE_FORMATS = null;

    static {
        COMMA_PATTERN = Pattern.compile(Constants.SEPARATOR_COMMA);
        EnumSet r02 = EnumSet.of(BarcodeFormat.QR_CODE);
        QR_CODE_FORMATS = r02;
        EnumSet r1 = EnumSet.of(BarcodeFormat.DATA_MATRIX);
        DATA_MATRIX_FORMATS = r1;
        EnumSet r2 = EnumSet.of(BarcodeFormat.AZTEC);
        AZTEC_FORMATS = r2;
        EnumSet r3 = EnumSet.of(BarcodeFormat.PDF_417);
        PDF417_FORMATS = r3;
        EnumSet r4 = EnumSet.of(BarcodeFormat.UPC_A, new BarcodeFormat[]{BarcodeFormat.UPC_E, BarcodeFormat.EAN_13, BarcodeFormat.EAN_8, BarcodeFormat.RSS_14, BarcodeFormat.RSS_EXPANDED});
        PRODUCT_FORMATS = r4;
        EnumSet r5 = EnumSet.of(BarcodeFormat.CODE_39, BarcodeFormat.CODE_93, BarcodeFormat.CODE_128, BarcodeFormat.ITF, BarcodeFormat.CODABAR);
        INDUSTRIAL_FORMATS = r5;
        EnumSet r6 = EnumSet.copyOf(r4);
        ONE_D_FORMATS = r6;
        r6.addAll(r5);
        HashMap r52 = new HashMap();
        FORMATS_FOR_MODE = r52;
        r52.put(Intents.Scan.ONE_D_MODE, r6);
        r52.put(Intents.Scan.PRODUCT_MODE, r4);
        r52.put(Intents.Scan.QR_CODE_MODE, r02);
        r52.put(Intents.Scan.DATA_MATRIX_MODE, r1);
        r52.put(Intents.Scan.AZTEC_MODE, r2);
        r52.put(Intents.Scan.PDF417_MODE, r3);
    }

    private DecodeFormatManager() {
    }

    public static Set<BarcodeFormat> parseDecodeFormats(Intent r2) {
        String r02 = r2.getStringExtra(Intents.Scan.FORMATS);
        if (r02 == null) goto L5;
        List r03 = Arrays.asList(COMMA_PATTERN.split(r02));
    L7:
        return parseDecodeFormats(r03, r2.getStringExtra(Intents.Scan.MODE));
    L5:
        r03 = null;
        goto L7
    }

    private static Set<BarcodeFormat> parseDecodeFormats(Iterable<String> r2, String r3) {
        if (r2 == null) goto L10;
        EnumSet r02 = EnumSet.noneOf(BarcodeFormat.class);
        Iterator<String> r22 = r2.iterator();     // Catch: IllegalArgumentException -> L15
    L5:
        if (r22.hasNext() == false) goto L9;
        r02.add(BarcodeFormat.valueOf(r22.next()));     // Catch: IllegalArgumentException -> L15
        goto L5
    L9:
        return r02;
    L10:
        if (r3 != null) goto L12;
        return null;
    L12:
        return FORMATS_FOR_MODE.get(r3);
    }
}

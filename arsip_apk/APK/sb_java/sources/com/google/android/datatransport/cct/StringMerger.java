package com.google.android.datatransport.cct;

/* loaded from: classes4.dex */
public final class StringMerger {
    public StringMerger() {
    }

    public static String mergeStrings(String r3, String r4) {
        int r02 = r3.length() - r4.length();
        if (r02 < 0) goto L16;
        if (r02 > 1) goto L16;
        StringBuilder r03 = new StringBuilder(r3.length() + r4.length());
        int r1 = 0;
    L8:
        if (r1 >= r3.length()) goto L14;
        r03.append(r3.charAt(r1));
        if (r4.length() <= r1) goto L12;
        r03.append(r4.charAt(r1));
    L12:
        r1 = r1 + 1;
        goto L8
    L14:
        return r03.toString();
    L16:
        throw new IllegalArgumentException("Invalid input received");
    }
}

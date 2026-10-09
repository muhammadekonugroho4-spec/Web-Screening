package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes5.dex */
abstract class LineBuffer {
    private StringBuilder line;
    private boolean sawReturn;

    public LineBuffer() {
        this.line = new StringBuilder();
    }

    @CanIgnoreReturnValue
    private boolean finishLine(boolean r3) throws IOException {
        if (this.sawReturn == false) goto L7;
        if (r3 == false) goto L6;
        String r02 = "\r\n";
    L10:
        handleLine(this.line.toString(), r02);
        this.line = new StringBuilder();
        this.sawReturn = false;
        return r3;
    L6:
        r02 = "\r";
        goto L10
    L7:
        if (r3 == false) goto L9;
        r02 = "\n";
        goto L10
    L9:
        r02 = "";
        goto L10
    }

    public void add(char[] r7, int r8, int r9) throws IOException {
        if (this.sawReturn == false) goto L12;
        if (r9 <= 0) goto L12;
        if (r7[r8] != '\n') goto L8;
        boolean r02 = true;
    L10:
        if (finishLine(r02) == false) goto L12;
        int r03 = r8 + 1;
    L13:
        int r82 = r8 + r9;
        int r92 = r03;
    L14:
        if (r03 >= r82) goto L32;
        char r4 = r7[r03];
        if (r4 != '\n') goto L18;
        this.line.append(r7, r92, r03 - r92);
        finishLine(true);
    L29:
        r92 = r03 + 1;
    L31:
        r03 = r03 + 1;
        goto L14
    L18:
        if (r4 != '\r') goto L31;
        this.line.append(r7, r92, r03 - r92);
        this.sawReturn = true;
        int r93 = r03 + 1;
        if (r93 >= r82) goto L29;
        if (r7[r93] != '\n') goto L25;
        boolean r42 = true;
    L27:
        if (finishLine(r42) == false) goto L29;
        r03 = r93;
        goto L29
    L25:
        r42 = false;
        goto L27
    L32:
        this.line.append(r7, r92, r82 - r92);
        return;
    L8:
        r02 = false;
    L12:
        r03 = r8;
        goto L13
    }

    public void finish() throws IOException {
        if (this.sawReturn == false) goto L5;
    L8:
        finishLine(false);
        return;
    L5:
        if (this.line.length() > 0) goto L8;
    }

    public abstract void handleLine(String r1, String r2) throws IOException;
}

package androidx.constraintlayout.core.parser;

import com.huawei.hms.android.SystemUtils;

/* loaded from: classes.dex */
public class CLParsingException extends Exception {
    private final String mElementClass;
    private final int mLineNumber;
    private final String mReason;

    public CLParsingException(String r1, c r2) {
        super(r1);
        this.mReason = r1;
        if (r2 == null) goto L6;
        this.mElementClass = r2.j();
        this.mLineNumber = r2.h();
        return;
    L6:
        this.mElementClass = SystemUtils.UNKNOWN;
        this.mLineNumber = 0;
    }

    public String a() {
        return this.mReason + " (" + this.mElementClass + " at line " + this.mLineNumber + ")";
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "CLParsingException (" + hashCode() + ") : " + a();
    }
}

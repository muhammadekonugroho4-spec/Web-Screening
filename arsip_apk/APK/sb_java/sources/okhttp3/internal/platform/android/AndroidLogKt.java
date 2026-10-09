package okhttp3.internal.platform.android;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ljava/util/logging/LogRecord;", "", "b", "(Ljava/util/logging/LogRecord;)I", "androidLevel", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AndroidLogKt {
    public static final /* synthetic */ int a(LogRecord r02) {
        return b(r02);
    }

    public static final int b(LogRecord r3) {
        int r02 = r3.getLevel().intValue();
        Level r1 = Level.INFO;
        if (r02 <= r1.intValue()) goto L7;
        return 5;
    L7:
        if (r3.getLevel().intValue() != r1.intValue()) goto L10;
        return 4;
    L10:
        return 3;
    }
}

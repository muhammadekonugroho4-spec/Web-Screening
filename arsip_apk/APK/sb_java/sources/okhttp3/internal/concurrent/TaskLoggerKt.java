package okhttp3.internal.concurrent;

import java.util.Arrays;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u001a+\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ljava/util/logging/Logger;", "Lokhttp3/internal/concurrent/Task;", "task", "Lokhttp3/internal/concurrent/TaskQueue;", "queue", "", "message", "Lkotlin/w;", "c", "(Ljava/util/logging/Logger;Lokhttp3/internal/concurrent/Task;Lokhttp3/internal/concurrent/TaskQueue;Ljava/lang/String;)V", "", "ns", "b", "(J)Ljava/lang/String;", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TaskLoggerKt {
    public static final /* synthetic */ void a(Logger r02, Task r1, TaskQueue r2, String r3) {
        c(r02, r1, r2, r3);
    }

    public static final String b(long r12) {
        if (r12 > (-999500000)) goto L6;
        String r122 = ((r12 - 500000000) / 1000000000) + " s ";
    L18:
        y r13 = y.f177509a;
        String r123 = String.format("%6s", Arrays.copyOf(new Object[]{r122}, 1));
        p.k(r123, "format(...)");
        return r123;
    L6:
        if (r12 > (-999500)) goto L9;
        r122 = ((r12 - 500000) / 1000000) + " ms";
        goto L18
    L9:
        if (r12 > 0) goto L12;
        r122 = ((r12 - 500) / 1000) + " µs";
        goto L18
    L12:
        if (r12 >= 999500) goto L15;
        r122 = ((r12 + 500) / 1000) + " µs";
        goto L18
    L15:
        if (r12 >= 999500000) goto L17;
        r122 = ((r12 + 500000) / 1000000) + " ms";
        goto L18
    L17:
        r122 = ((r12 + 500000000) / 1000000000) + " s ";
        goto L18
    }

    public static final void c(Logger r1, Task r2, TaskQueue r3, String r4) {
        StringBuilder r02 = new StringBuilder();
        r02.append(r3.h());
        r02.append(' ');
        y r32 = y.f177509a;
        String r33 = String.format("%-22s", Arrays.copyOf(new Object[]{r4}, 1));
        p.k(r33, "format(...)");
        r02.append(r33);
        r02.append(": ");
        r02.append(r2.b());
        r1.fine(r02.toString());
    }
}

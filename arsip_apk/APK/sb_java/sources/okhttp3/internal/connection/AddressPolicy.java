package okhttp3.internal.connection;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\n\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"Lokhttp3/internal/connection/AddressPolicy;", "", "", "minimumConcurrentCalls", "", "backoffDelayMillis", "backoffJitterMillis", "<init>", "(IJI)V", "a", "I", "b", "J", "c", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AddressPolicy {

    /* renamed from: a, reason: collision with root package name */
    public final int f181750a;

    /* renamed from: b, reason: collision with root package name */
    public final long f181751b;

    /* renamed from: c, reason: collision with root package name */
    public final int f181752c;

    public AddressPolicy() {
        int r1 = 0;
        long r2 = 0;
        int r4 = 0;
        this(r1, r2, r4, 7, null);
    }

    public AddressPolicy(int r1, long r2, int r4) {
        this.f181750a = r1;
        this.f181751b = r2;
        this.f181752c = r4;
    }

    public /* synthetic */ AddressPolicy(int r1, long r2, int r4, int r5, i r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = Constants.ONE_MIN_IN_MILLIS;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = 100;
    L11:
        this(r1, r2, r4);
    }
}

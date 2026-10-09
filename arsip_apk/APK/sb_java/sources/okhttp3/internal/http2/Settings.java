package okhttp3.internal.http2;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\b\u0018\u0000 \u001e2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\rJ\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001d\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000fR\u0011\u0010\u001f\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u000f¨\u0006!"}, d2 = {"Lokhttp3/internal/http2/Settings;", "", "<init>", "()V", "", Constants.KEY_ID, "value", "h", "(II)Lokhttp3/internal/http2/Settings;", "", "f", "(I)Z", "a", "(I)I", "i", "()I", Constants.INAPP_DATA_TAG, "defaultValue", "e", "other", "Lkotlin/w;", "g", "(Lokhttp3/internal/http2/Settings;)V", "I", "set", "", "b", "[I", "values", "headerTableSize", "c", "initialWindowSize", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Settings {

    /* renamed from: c, reason: collision with root package name */
    public static final Companion f182092c = null;

    /* renamed from: a, reason: collision with root package name */
    public int f182093a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f182094b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lokhttp3/internal/http2/Settings$Companion;", "", "<init>", "()V", "DEFAULT_INITIAL_WINDOW_SIZE", "", "HEADER_TABLE_SIZE", "ENABLE_PUSH", "MAX_CONCURRENT_STREAMS", "INITIAL_WINDOW_SIZE", "MAX_FRAME_SIZE", "MAX_HEADER_LIST_SIZE", "COUNT", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.i r1) {
            this();
        }

        private Companion() {
        }
    }

    static {
        f182092c = new Companion(null);
    }

    public Settings() {
        this.f182094b = new int[10];
    }

    public final int a(int r2) {
        return this.f182094b[r2];
    }

    public final int b() {
        if ((this.f182093a & 2) != 0) goto L5;
        return -1;
    L5:
        return this.f182094b[1];
    }

    public final int c() {
        if ((this.f182093a & 16) != 0) goto L5;
        return 65535;
    L5:
        return this.f182094b[4];
    }

    public final int d() {
        if ((this.f182093a & 8) != 0) goto L5;
        return Integer.MAX_VALUE;
    L5:
        return this.f182094b[3];
    }

    public final int e(int r2) {
        if ((this.f182093a & 32) != 0) goto L5;
        return r2;
    L5:
        return this.f182094b[5];
    }

    public final boolean f(int r3) {
        if (((1 << r3) & this.f182093a) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final void g(Settings r3) {
        p.l(r3, "other");
        int r02 = 0;
    L4:
        if (r02 >= 10) goto L9;
        if (r3.f(r02) == false) goto L8;
        h(r02, r3.a(r02));
    L8:
        r02 = r02 + 1;
        goto L4
    }

    public final Settings h(int r4, int r5) {
        if (r4 < 0) goto L7;
        int[] r02 = this.f182094b;
        if (r4 >= r02.length) goto L7;
        this.f182093a = (1 << r4) | this.f182093a;
        r02[r4] = r5;
    L7:
        return this;
    }

    public final int i() {
        return Integer.bitCount(this.f182093a);
    }
}

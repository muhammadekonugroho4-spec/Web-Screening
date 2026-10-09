package app.rive.runtime.kotlin.renderers;

import android.app.Activity;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.FrameMetrics;
import android.view.Window;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\r\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lapp/rive/runtime/kotlin/renderers/RendererMetrics;", "Landroid/view/Window$OnFrameMetricsAvailableListener;", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "Landroid/view/Window;", "window", "Landroid/view/FrameMetrics;", "frameMetrics", "", "dropCountSinceLastInvocation", "Lkotlin/w;", "onFrameMetricsAvailable", "(Landroid/view/Window;Landroid/view/FrameMetrics;I)V", "allFrames", "I", "sampleCount", "jankyFrames", "Ljava/math/BigDecimal;", "totalTime", "Ljava/math/BigDecimal;", "", "refreshRateMs", "F", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RendererMetrics implements Window.OnFrameMetricsAvailableListener {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private static final double ONE_MS_IN_NS = 1000000.0d;
    public static final int SAMPLES = 30;
    private static final String TAG = "RendererMetrics";
    private int allFrames;
    private int jankyFrames;
    private final float refreshRateMs;
    private int sampleCount;
    private BigDecimal totalTime;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lapp/rive/runtime/kotlin/renderers/RendererMetrics$Companion;", "", "()V", "ONE_MS_IN_NS", "", "SAMPLES", "", "TAG", "", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(i r1) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
        $stable = 8;
    }

    public RendererMetrics(Activity r4) {
        p.l(r4, "activity");
        this.totalTime = new BigDecimal(0.0d);
        Window r42 = r4.getWindow();
        if (Build.VERSION.SDK_INT < 30) goto L8;
        Display r43 = c.a(r42.getContext());
        if (r43 == null) goto L7;
        float r44 = r43.getRefreshRate();
    L9:
        y r02 = y.f177509a;
        String r03 = String.format("Refresh rate: %.1f Hz", Arrays.copyOf(new Object[]{Float.valueOf(r44)}, 1));
        p.k(r03, "format(...)");
        Log.i(TAG, r03);
        this.refreshRateMs = 1000 / r44;
        return;
    L7:
        Log.w(TAG, "Failed to get the display, defaulting to 60hz");
        r44 = 60.0f;
        goto L9
    L8:
        r44 = r42.getWindowManager().getDefaultDisplay().getRefreshRate();
        goto L9
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public void onFrameMetricsAvailable(Window r9, FrameMetrics r10, int r11) {
        if (r9 != null) goto L6;
        Log.w(TAG, "Invalid Window reference");
        return;
    L6:
        if (r10 != null) goto L9;
        Log.w(TAG, "Invalid FrameMetrics reference");
        return;
    L9:
        FrameMetrics r92 = new FrameMetrics(r10);
        this.allFrames++;
        this.sampleCount++;
        double r02 = r92.getMetric(8) / ONE_MS_IN_NS;
        BigDecimal r102 = this.totalTime.add(new BigDecimal(String.valueOf(r02)));
        p.k(r102, "add(...)");
        this.totalTime = r102;
        if (r102.compareTo(new BigDecimal(String.valueOf(this.refreshRateMs))) <= 0) goto L13;
        this.jankyFrames++;
    L13:
        if (this.sampleCount != 30) goto L16;
        this.sampleCount = 0;
        double r4 = r92.getMetric(4) / ONE_MS_IN_NS;
        double r6 = r92.getMetric(7) / ONE_MS_IN_NS;
        double r93 = r92.getMetric(6) / ONE_MS_IN_NS;
        Locale r2 = Locale.US;
        Double r03 = Double.valueOf(r02);
        Double r1 = Double.valueOf(r4);
        Double r3 = Double.valueOf(r6);
        Double r94 = Double.valueOf(r93);
        BigDecimal r103 = this.totalTime;
        BigDecimal r42 = BigDecimal.valueOf(this.allFrames);
        p.k(r42, "valueOf(...)");
        Log.i(TAG, String.format(r2, "\\n\n============ FrameMetrics ============\n=== Frame issued in:        %.2fms ===\n=== Draw Time:              %.2fms ===\n=== Swap Buffers Duration:  %.2fms ===\n=== GPU commands sent in:   %.2fms ===\n======================================\n=== Overall average:        %.2fms ===", new Object[]{r03, r1, r3, r94, r103.divide(r42, 2, RoundingMode.HALF_UP)}));
        return;
    }
}

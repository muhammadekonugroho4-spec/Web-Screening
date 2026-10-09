package androidx.camera.camera2.internal.compat.workaround;

import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import androidx.camera.core.AbstractC2209b0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f4405a;

    /* renamed from: b, reason: collision with root package name */
    public final ExtraSupportedOutputSizeQuirk f4406b;

    /* renamed from: c, reason: collision with root package name */
    public final e f4407c;

    public m(String r2) {
        this.f4406b = (ExtraSupportedOutputSizeQuirk) androidx.camera.camera2.internal.compat.quirk.e.b(ExtraSupportedOutputSizeQuirk.class);
        this.f4405a = r2;
        this.f4407c = new e(r2);
    }

    public final void a(List r2, int r3) {
        ExtraSupportedOutputSizeQuirk r02 = this.f4406b;
        if (r02 == null) goto L10;
        Size[] r32 = r02.d(r3);
        if (r32.length <= 0) goto L9;
        r2.addAll(Arrays.asList(r32));
        return;
    L9:
        return;
    }

    public Size[] b(Size[] r2, int r3) {
        ArrayList r02 = new ArrayList(Arrays.asList(r2));
        a(r02, r3);
        c(r02, r3);
        if (r02.isEmpty() == false) goto L6;
        AbstractC2209b0.l("OutputSizesCorrector", "Sizes array becomes empty after excluding problematic output sizes.");
    L6:
        return (Size[]) r02.toArray(new Size[0]);
    }

    public final void c(List r2, int r3) {
        List r32 = this.f4407c.a(r3);
        if (r32.isEmpty() == false) goto L5;
        return;
    L5:
        r2.removeAll(r32);
    }
}

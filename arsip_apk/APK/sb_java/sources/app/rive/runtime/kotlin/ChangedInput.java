package app.rive.runtime.kotlin;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lapp/rive/runtime/kotlin/ChangedInput;", "", "stateMachineName", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "value", "nestedArtboardPath", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getNestedArtboardPath", "getStateMachineName", "getValue", "()Ljava/lang/Object;", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ChangedInput {
    public static final int $stable = 8;
    private final String name;
    private final String nestedArtboardPath;
    private final String stateMachineName;
    private final Object value;

    static {
    }

    public ChangedInput(String r2, String r3, Object r4, String r5) {
        p.l(r2, "stateMachineName");
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.stateMachineName = r2;
        this.name = r3;
        this.value = r4;
        this.nestedArtboardPath = r5;
    }

    public static /* synthetic */ ChangedInput copy$default(ChangedInput r02, String r1, String r2, Object r3, String r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r02.stateMachineName;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r02.name;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r02.value;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r02.nestedArtboardPath;
    L15:
        return r02.copy(r1, r2, r3, r4);
    }

    public final String component1() {
        return this.stateMachineName;
    }

    public final String component2() {
        return this.name;
    }

    public final Object component3() {
        return this.value;
    }

    public final String component4() {
        return this.nestedArtboardPath;
    }

    public final ChangedInput copy(String r2, String r3, Object r4, String r5) {
        p.l(r2, "stateMachineName");
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        return new ChangedInput(r2, r3, r4, r5);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ChangedInput) == true) goto L8;
        return false;
    L8:
        ChangedInput r52 = (ChangedInput) r5;
        if (p.g(this.stateMachineName, r52.stateMachineName) == true) goto L12;
        return false;
    L12:
        if (p.g(this.name, r52.name) == true) goto L15;
        return false;
    L15:
        if (p.g(this.value, r52.value) == true) goto L18;
        return false;
    L18:
        if (p.g(this.nestedArtboardPath, r52.nestedArtboardPath) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNestedArtboardPath() {
        return this.nestedArtboardPath;
    }

    public final String getStateMachineName() {
        return this.stateMachineName;
    }

    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        int r02 = ((this.stateMachineName.hashCode() * 31) + this.name.hashCode()) * 31;
        Object r1 = this.value;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.nestedArtboardPath;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return r03 + r2;
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "ChangedInput(stateMachineName=" + this.stateMachineName + ", name=" + this.name + ", value=" + this.value + ", nestedArtboardPath=" + this.nestedArtboardPath + ')';
    }

    public /* synthetic */ ChangedInput(String r2, String r3, Object r4, String r5, int r6, i r7) {
        if ((r6 & 4) == 0) goto L6;
        r4 = null;
    L6:
        if ((r6 & 8) == 0) goto L8;
        r5 = null;
    L8:
        this(r2, r3, r4, r5);
    }
}

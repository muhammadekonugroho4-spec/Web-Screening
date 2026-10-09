package com.clevertap.android.sdk.inapp.evaluation;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/clevertap/android/sdk/inapp/evaluation/TriggerOperator;", "", "", "operatorValue", "<init>", "(Ljava/lang/String;II)V", "I", "getOperatorValue", "()I", "Companion", "a", "GreaterThan", "Equals", "LessThan", "Contains", "Between", "NotEquals", "Set", "NotSet", "NotContains", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum TriggerOperator extends Enum<TriggerOperator> {
    public static final TriggerOperator Between = null;
    public static final a Companion = null;
    public static final TriggerOperator Contains = null;
    public static final TriggerOperator Equals = null;
    public static final TriggerOperator GreaterThan = null;
    public static final TriggerOperator LessThan = null;
    public static final TriggerOperator NotContains = null;
    public static final TriggerOperator NotEquals = null;
    public static final TriggerOperator NotSet = null;
    public static final TriggerOperator Set = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ TriggerOperator[] f34151a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f34152b = null;
    private final int operatorValue;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final TriggerOperator a(int r6) {
            TriggerOperator[] r02 = TriggerOperator.values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L8;
            TriggerOperator r3 = r02[r2];
            if (r3.getOperatorValue() == r6) goto L9;
            r2 = r2 + 1;
        L9:
            if (r3 == null) goto L11;
            return r3;
        L11:
            return TriggerOperator.Equals;
        L8:
            r3 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        GreaterThan = new TriggerOperator("GreaterThan", 0, 0);
        Equals = new TriggerOperator("Equals", 1, 1);
        LessThan = new TriggerOperator("LessThan", 2, 2);
        Contains = new TriggerOperator("Contains", 3, 3);
        Between = new TriggerOperator("Between", 4, 4);
        NotEquals = new TriggerOperator("NotEquals", 5, 15);
        Set = new TriggerOperator("Set", 6, 26);
        NotSet = new TriggerOperator("NotSet", 7, 27);
        NotContains = new TriggerOperator("NotContains", 8, 28);
        TriggerOperator[] r02 = a();
        f34151a = r02;
        f34152b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    TriggerOperator(String r1, int r2, int r3) {
        this.operatorValue = r3;
    }

    public static final /* synthetic */ TriggerOperator[] a() {
        return new TriggerOperator[]{GreaterThan, Equals, LessThan, Contains, Between, NotEquals, Set, NotSet, NotContains};
    }

    public static kotlin.enums.a getEntries() {
        return f34152b;
    }

    public static TriggerOperator valueOf(String r1) {
        return (TriggerOperator) Enum.valueOf(TriggerOperator.class, r1);
    }

    public static TriggerOperator[] values() {
        return (TriggerOperator[]) f34151a.clone();
    }

    public final int getOperatorValue() {
        return this.operatorValue;
    }
}

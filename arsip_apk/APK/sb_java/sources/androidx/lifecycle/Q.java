package androidx.lifecycle;

/* loaded from: classes4.dex */
public abstract class Q {
    public static final /* synthetic */ String a(String r02) {
        return b(r02);
    }

    public static final String b(String r2) {
        return "StateFlow and LiveData are mutually exclusive for the same key. Please use either 'getMutableStateFlow' or 'getLiveData' for key '" + r2 + "', but not both.";
    }
}

package kotlinx.serialization.internal;

/* loaded from: classes3.dex */
public interface N extends kotlinx.serialization.b {
    kotlinx.serialization.b[] childSerializers();

    default kotlinx.serialization.b[] typeParametersSerializers() {
        return M0.f180611a;
    }
}

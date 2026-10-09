package kotlin.reflect;

/* loaded from: classes3.dex */
public interface l extends c {

    public interface a {
        l l();
    }

    public interface b extends a, h {
    }

    b getGetter();

    boolean isConst();

    boolean isLateinit();
}

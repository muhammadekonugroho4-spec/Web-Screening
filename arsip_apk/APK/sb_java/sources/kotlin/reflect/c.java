package kotlin.reflect;

import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public interface c extends b {
    Object call(Object... r1);

    Object callBy(Map r1);

    String getName();

    List getParameters();

    p getReturnType();

    List getTypeParameters();

    KVisibility getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}

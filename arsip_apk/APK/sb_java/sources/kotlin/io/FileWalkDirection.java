package kotlin.io;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\bB¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/io/FileWalkDirection;", "", "<init>", "(Ljava/lang/String;I)V", "TOP_DOWN", "BOTTOM_UP", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public enum FileWalkDirection extends Enum<FileWalkDirection> {
    public static final FileWalkDirection BOTTOM_UP = null;
    public static final FileWalkDirection TOP_DOWN = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ FileWalkDirection[] f177443a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f177444b = null;

    static {
        TOP_DOWN = new FileWalkDirection("TOP_DOWN", 0);
        BOTTOM_UP = new FileWalkDirection("BOTTOM_UP", 1);
        FileWalkDirection[] r02 = a();
        f177443a = r02;
        f177444b = kotlin.enums.b.a(r02);
    }

    FileWalkDirection(String r1, int r2) {
    }

    public static final /* synthetic */ FileWalkDirection[] a() {
        return new FileWalkDirection[]{TOP_DOWN, BOTTOM_UP};
    }

    public static kotlin.enums.a getEntries() {
        return f177444b;
    }

    public static FileWalkDirection valueOf(String r1) {
        return (FileWalkDirection) Enum.valueOf(FileWalkDirection.class, r1);
    }

    public static FileWalkDirection[] values() {
        return (FileWalkDirection[]) f177443a.clone();
    }
}

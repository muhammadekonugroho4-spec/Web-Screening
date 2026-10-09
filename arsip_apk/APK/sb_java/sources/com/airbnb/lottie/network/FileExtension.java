package com.airbnb.lottie.network;

/* loaded from: classes4.dex */
public enum FileExtension extends Enum<FileExtension> {
    public static final FileExtension JSON = null;
    public static final FileExtension ZIP = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ FileExtension[] f31464a = null;
    public final String extension;

    static {
        FileExtension r02 = new FileExtension("JSON", 0, ".json");
        JSON = r02;
        FileExtension r1 = new FileExtension("ZIP", 1, ".zip");
        ZIP = r1;
        f31464a = new FileExtension[]{r02, r1};
    }

    FileExtension(String r1, int r2, String r3) {
        this.extension = r3;
    }

    public static FileExtension valueOf(String r1) {
        return (FileExtension) Enum.valueOf(FileExtension.class, r1);
    }

    public static FileExtension[] values() {
        return (FileExtension[]) f31464a.clone();
    }

    public String tempExtension() {
        return ".temp" + this.extension;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.extension;
    }
}

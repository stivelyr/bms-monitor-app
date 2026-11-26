package defpackage;

import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public abstract class of3 {
    public static final UUID a = a("8900");
    public static final UUID b = a("8901");
    public static final UUID c = a("8902");
    public static final UUID d = a("8903");
    public static final UUID e = a("8904");
    public static final UUID f = a("8905");
    public static final UUID g = a("8906");
    public static final UUID h = a("8907");
    public static final UUID i;
    public static final byte[] j;

    static {
        a("8908");
        a("8909");
        i = a("8910");
        byte[] bArr = new byte[17];
        for (int i2 = 0; i2 < 17; i2++) {
            bArr[i2] = -1;
        }
        j = bArr;
    }

    public static UUID a(String str) {
        UUID uuidFromString = UUID.fromString("0000" + str + "-0000-1000-8000-00805f9b34fb");
        uuidFromString.getClass();
        return uuidFromString;
    }
}

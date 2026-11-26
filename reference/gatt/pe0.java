package defpackage;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;

/* JADX INFO: loaded from: classes.dex */
public final class pe0 extends gd7 implements w33 {
    final /* synthetic */ String $macAddress;
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ gf0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pe0(gf0 gf0Var, String str, wi1 wi1Var) {
        super(2, wi1Var);
        this.this$0 = gf0Var;
        this.$macAddress = str;
    }

    @Override // defpackage.w33
    public final Object p(Object obj, Object obj2) {
        return ((pe0) s((wi1) obj2, (al1) obj)).v(h28.a);
    }

    @Override // defpackage.b30
    public final wi1 s(wi1 wi1Var, Object obj) {
        return new pe0(this.this$0, this.$macAddress, wi1Var);
    }

    @Override // defpackage.b30
    public final Object v(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                pu1.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lf2.J(obj);
            return obj;
        }
        lf2.J(obj);
        gf0 gf0Var = this.this$0;
        String str = this.$macAddress;
        this.L$0 = gf0Var;
        this.L$1 = str;
        int i2 = 0;
        this.I$0 = 0;
        this.label = 1;
        gw0 gw0Var = new gw0(1, oa2.r(this));
        gw0Var.v();
        gw0Var.x(new oe0(i2, gf0Var));
        Object systemService = gf0Var.a.getSystemService("bluetooth");
        systemService.getClass();
        BluetoothDevice remoteDevice = ((BluetoothManager) systemService).getAdapter().getRemoteDevice(str);
        gf0Var.h = new me0(gw0Var, i2);
        gf0Var.f = remoteDevice.connectGatt(gf0Var.a, false, gf0Var.i, 2);
        Object objT = gw0Var.t();
        bl1 bl1Var = bl1.b;
        return objT == bl1Var ? bl1Var : objT;
    }
}

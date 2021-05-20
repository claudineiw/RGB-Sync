package CoolerMaster;

import IPerifericos.IKeyboard;

public class Keyboard extends ICoolerMaster implements IKeyboard {

    private final static int[][] zonasRGB = {{0x00000001,0x00000002,0x00000003,0x00000004,0x00000005,0x00000006,0x00000007,0x00000008,0x00000009,0x0000000A,0x0000000B,0x0000000C,0x0000000D,0x00001001,0x000001002,0x000001003,0x00006001,0x00006002,0x00006003,0x00006004},
                                       {0x0000000E,0x0000000F,0x00000011,0x00000012,0x00000013,0x00000014,0x00000015,0x00000016,0x00000017,0x00000018,0x00000019,0x0000001A,0x0000001B,0x0000001C,0x00001004,0x00001005,0x00001006,0x00002001,0x00002002,0x00002003,0x00002004},
                                       {0x0000001D,0x0000001E,0x0000001F,0x00000020,0x00000021,0x00000022,0x00000023,0x00000024,0x00000025,0x00000026,0x00000027,0x000000028,0x000000029,0x00000002A,0x00001007,0x00001008,0x00001009,0x00002005,0x00002006,0x00002007,0x00002009},
                                       {0x0000002C,0x0000002D,0x0000002E,0x0000002F,0x00000030,0x00000031,0x00000032,0x00000033,0x00000034,0x00000035,0x00000036,0x00000037,0x0000002B,0x0000200A,0x0000200B,0x0000200C},
                                       {0x00000039,0x0000003B,0x0000003C,0x0000003D,0x0000003E,0x0000003F,0x00000040,0x00000041,0x00000042,0x00000043,0x00000044,0x00000045,0x0000100A,0x0000200D,0x0000200E,0x0000200F,0x00002010},
                                       {0x00000046,0x00000047,0x00000048,0x0000004A,0x0000004C,0x0000004D,0x0000004E,0x0000004F,0x0000100B,0x0000100C,0x0000100D,0x00002011,0x00002013}                                       
                                        };

    public Keyboard(com.CollMaster.CoolerMasterSDK CoolerMasterSDK) {
        super(CoolerMasterSDK, zonasRGB);
    }

    @Override
    public int[][] getTeclas() {
        return this.teclas;
    }

    @Override
    public void colorirPorTecla(int tecla) {
        for (int i = 0; i < getTeclas().length; i++) {
            for (int y = 0; y < getTeclas()[i].length; y++) {
                if (getTeclas()[i][y] == (short) tecla) {
                    getCoolerMasterSDK().setKeyColor(i, y, super.getCor());
                    break;
                }
            }
        }

    }

}

package br.Matriz;

import java.util.Stack;

public class Regras {

    Stack[] regras = new Stack[64];
    
    public void inicia(){
        regras[1] = new Stack();
        regras[2] = new Stack();
        regras[3] = new Stack();
        regras[4] = new Stack();
        regras[5] = new Stack();
        regras[6] = new Stack();
        regras[7] = new Stack();
        regras[8] = new Stack();
        regras[9] = new Stack();
        regras[10] = new Stack();
        regras[11] = new Stack();
        regras[12] = new Stack();
        regras[13] = new Stack();
        regras[14] = new Stack();
        regras[15] = new Stack();
        regras[16] = new Stack();
        regras[17] = new Stack();
        regras[18] = new Stack();
        regras[19] = new Stack();
        regras[20] = new Stack();
        regras[21] = new Stack();
        regras[22] = new Stack();
        regras[23] = new Stack();
        regras[24] = new Stack();
        regras[25] = new Stack();
        regras[26] = new Stack();
        regras[27] = new Stack();
        regras[28] = new Stack();
        regras[29] = new Stack();
        regras[30] = new Stack();
        regras[31] = new Stack();
        regras[32] = new Stack();
        regras[33] = new Stack();
        regras[34] = new Stack();
        regras[35] = new Stack();
        regras[36] = new Stack();
        regras[37] = new Stack();
        regras[38] = new Stack();
        regras[39] = new Stack();
        regras[40] = new Stack();
        regras[41] = new Stack();
        regras[42] = new Stack();
        regras[43] = new Stack();
        regras[44] = new Stack();
        regras[45] = new Stack();
        regras[46] = new Stack();
        regras[47] = new Stack();
        regras[48] = new Stack();
        regras[49] = new Stack();
        regras[50] = new Stack();
        regras[51] = new Stack();
        regras[52] = new Stack();
        regras[53] = new Stack();
        regras[54] = new Stack();
        regras[55] = new Stack();
        regras[56] = new Stack();
        regras[57] = new Stack();
        regras[58] = new Stack();
        regras[59] = new Stack();
        regras[60] = new Stack();
        regras[61] = new Stack();
        regras[62] = new Stack();
        regras[63] = new Stack();
    }
    public void populaStack() {
        
                
        regras[1].push(8);
        regras[1].push(16);
        regras[1].push(31);
        regras[1].push(43);
        regras[1].push(44);
        regras[1].push(35);
        regras[2].push(45);
        regras[2].push(46);
        regras[2].push(47);
        regras[3].push(23);
        regras[3].push(48);
        regras[3].push(19);
        regras[4].push(22);
        regras[4].push(16);
        regras[4].push(26);
        regras[4].push(12);
        regras[4].push(31);
        regras[4].push(45);
        regras[5].push(17);
        regras[6].push(2);
        regras[6].push(49);
        regras[6].push(33);
        regras[6].push(50);
        regras[6].push(31);
        regras[6].push(51);
        regras[7].push(16);
        regras[7].push(52);
        regras[8].push(17);
        regras[9].push(36);
        regras[9].push(16);
        regras[9].push(52);
        regras[10].push(49);
        regras[10].push(33);
        regras[10].push(50);
        regras[10].push(31);
        regras[10].push(51);
        regras[11].push(17);
        regras[12].push(14);
        regras[13].push(6);
        regras[14].push(5);
        regras[15].push(9);
        regras[15].push(16);
        regras[15].push(53);
        regras[15].push(31);
        regras[15].push(44);
        regras[15].push(31);
        regras[15].push(47);
        regras[16].push(17);
        regras[17].push(39);
        regras[17].push(49);
        regras[17].push(33);
        regras[17].push(50);
        regras[17].push(54);
        regras[17].push(38);
        regras[18].push(17);
        regras[19].push(36);
        regras[19].push(49);
        regras[19].push(33);
        regras[19].push(50);
        regras[19].push(54);
        regras[20].push(17);
        regras[21].push(55);
        regras[21].push(31);
        regras[21].push(48);
        regras[22].push(17);
        regras[23].push(10);
        regras[23].push(39);
        regras[23].push(56);
        regras[23].push(57);
        regras[23].push(38);
        regras[24].push(58);
        regras[25].push(17);
        regras[26].push(36);
        regras[26].push(56);
        regras[26].push(57);
        regras[27].push(59);
        regras[27].push(60);
        regras[28].push(30);
        regras[28].push(59);
        regras[28].push(60);
        regras[29].push(41);
        regras[29].push(59);
        regras[29].push(60);
        regras[30].push(17);
        regras[31].push(61);
        regras[31].push(62);
        regras[32].push(37);
        regras[32].push(61);
        regras[32].push(62);
        regras[33].push(34);
        regras[33].push(61);
        regras[33].push(62);
        regras[34].push(17);
        regras[35].push(39);
        regras[35].push(58);
        regras[35].push(38);
        regras[36].push(16);
        regras[37].push(12);
        regras[38].push(11);
        regras[39].push(15);
        regras[39].push(63);
        regras[39].push(4);
        regras[39].push(44);
        regras[39].push(64);
        regras[40].push(58);
        regras[40].push(65);
        regras[40].push(58);
        regras[41].push(26);
        regras[42].push(27);
        regras[43].push(29);
        regras[44].push(25);
        regras[45].push(28);
        regras[46].push(24);
        regras[47].push(20);
        regras[47].push(48);
        regras[48].push(17);
        regras[49].push(16);
        regras[49].push(66);
        regras[50].push(18);
        regras[50].push(16);
        regras[50].push(32);
        regras[50].push(58);
        regras[50].push(3);
        regras[50].push(58);
        regras[50].push(21);
        regras[50].push(48);
        regras[51].push(67);
        regras[52].push(32);
        regras[52].push(58);
        regras[53].push(39);
        regras[53].push(68);
        regras[53].push(69);
        regras[53].push(38);
        regras[54].push(17);
        regras[55].push(16);
        regras[56].push(12);
        regras[57].push(11);
        regras[58].push(36);
        regras[58].push(68);
        regras[58].push(69);
        regras[59].push(17);
        regras[60].push(1);
        regras[60].push(63);
        regras[60].push(21);
        regras[60].push(48);
        regras[61].push(7);
        regras[61].push(39);
        regras[61].push(16);
        regras[61].push(38);
        regras[62].push(13);
        regras[63].push(13);
    }

    public Stack busca(int regra) {
        
        return regras[regra];
    }

}
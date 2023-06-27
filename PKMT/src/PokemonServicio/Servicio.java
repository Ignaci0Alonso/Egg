package PokemonServicio;

import Pokemon.*;
import java.util.*;

public class Servicio {

    Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public Pkm crearPkm(String[] tipos) {
        int cant;
        HashSet<String> tipo = new HashSet();
        do {
            System.out.println("Cuantos tipos tiene?");
            cant = scan.nextInt();
            if (cant < 1 || cant > 2) {
                System.out.println("Solo puede tener entre 1 y 2 tipos.");
            }
        } while (cant < 1 || cant > 2);

        System.out.println("Cuales son los tipos?");
        for (int i = 0; i < tipos.length; i++) {
            System.out.println((i + 1) + "- " + tipos[i]);
        }
        for (int i = 0; i < cant; i++) {
            int num;
            do {
                System.out.println("Ingrese el numero del tipo");
                num = scan.nextInt();
                if (num > tipos.length && num < 1) {
                    System.out.println("Opcion Invalida.");
                }
            } while (num > tipos.length && num < 1);
            tipo.add(tipos[num - 1]);
            System.out.println("Actualizado:");
            System.out.println(tipo.toString());
            System.out.println("");
        }

        return new Pkm(tipo, debilidades(tipo));
    }

    public Equipo crearEquipo(String[] tipos) {
        int cant;
        do {
            System.out.println("Cuantos pokemones tiene el equipo?");
            cant = scan.nextInt();
            if (cant < 1 || cant > 6) {
                System.out.println("Solo puede haber entre 1 y 6 pokemones en el equipo.");
            }
        } while (cant < 1 || cant > 6);
        ArrayList<Pkm> pokemones = new ArrayList();
        for (int i = 0; i < cant; i++) {
            pokemones.add(crearPkm(tipos));
        }
        
        return new Equipo(efectividades(tipos,pokemones), pokemones);
    }

    public HashSet<String> debilidades(HashSet<String> tipage) {
        HashSet<String> tipos = new HashSet();
        for (String tipo : tipage) {
            if (tipo.equalsIgnoreCase("ACE")) {
                tipos.add("FUE");
                tipos.add("LUC");
                tipos.add("TIE");
            }
            if (tipo.equalsIgnoreCase("AGU")) {
                tipos.add("PLA");
                tipos.add("ELE");
            }
            if (tipo.equalsIgnoreCase("BIC")) {
                tipos.add("FUE");
                tipos.add("ROC");
                tipos.add("VOL");
            }
            if (tipo.equalsIgnoreCase("DRA")) {
                tipos.add("DRA");
                tipos.add("HAD");
                tipos.add("HIE");
            }
            if (tipo.equalsIgnoreCase("ELE")) {
                tipos.add("TIE");
            }
            if (tipo.equalsIgnoreCase("FAN")) {
                tipos.add("FAN");
                tipos.add("SIN");
            }
            if (tipo.equalsIgnoreCase("FUE")) {
                tipos.add("AGU");
                tipos.add("ROC");
                tipos.add("TIE");

            }
            if (tipo.equalsIgnoreCase("HAD")) {
                tipos.add("FUE");
                tipos.add("VEN");
            }
            if (tipo.equalsIgnoreCase("HIE")) {
                tipos.add("ACE");
                tipos.add("FUE");
                tipos.add("LUC");
                tipos.add("ROC");
            }
            if (tipo.equalsIgnoreCase("LUC")) {
                tipos.add("HAD");
                tipos.add("PSI");
                tipos.add("VOL");
            }
            if (tipo.equalsIgnoreCase("NOR")) {
                tipos.add("LUC");
            }
            if (tipo.equalsIgnoreCase("PLA")) {
                tipos.add("BIC");
                tipos.add("VEN");
                tipos.add("HIE");
                tipos.add("FUE");
                tipos.add("VOL");
            }
            if (tipo.equalsIgnoreCase("PSI")) {
                tipos.add("BIC");
                tipos.add("FAN");
                tipos.add("SIN");
            }
            if (tipo.equalsIgnoreCase("ROC")) {
                tipos.add("ACE");
                tipos.add("AGU");
                tipos.add("LUC");
                tipos.add("TIE");
                tipos.add("PLA");
            }
            if (tipo.equalsIgnoreCase("SIN")) {
                tipos.add("BIC");
                tipos.add("HAD");
                tipos.add("LUC");
            }
            if (tipo.equalsIgnoreCase("TIE")) {
                tipos.add("AGU");
                tipos.add("HIE");
                tipos.add("PLA");
            }
            if (tipo.equalsIgnoreCase("VEN")) {
                tipos.add("PSI");
                tipos.add("TIE");
            }
            if (tipo.equalsIgnoreCase("VOL")) {
                tipos.add("ELE");
                tipos.add("HIE");
                tipos.add("ROC");
            }
            System.out.println(tipos);
        }
        return tipos;
    }

    public HashMap<String, Integer> efectividades(String[] tipage, ArrayList<Pkm> pokemones) {
        HashMap<String, Integer> efic = new HashMap();
        for (String tipage1 : tipage) {
            efic.put("\n"+tipage1, 0);
        }
        int contACE = 0;
        int contAGU = 0;
        int contBIC = 0;
        int contDRA = 0;
        int contELE = 0;
        int contFAN = 0;
        int contFUE = 0;
        int contHAD = 0;
        int contHIE = 0;
        int contLUC = 0;
        int contPLA = 0;
        int contPSI = 0;
        int contROC = 0;
        int contSIN = 0;
        int contTIE = 0;
        int contVEN = 0;
        int contVOL = 0;
        for (Pkm pokemon : pokemones) {
            for (String tipo : pokemon.getDebilidades()) {
                if (tipo.equalsIgnoreCase("ACE")) {
                    contACE++;
                    efic.put("\n"+tipo, contACE);
                }
                if (tipo.equalsIgnoreCase("AGU")) {
                    contAGU++;
                    efic.put("\n"+tipo, contAGU);
                }
                if (tipo.equalsIgnoreCase("BIC")) {
                    contBIC++;
                    efic.put("\n"+tipo, contBIC);
                }
                if (tipo.equalsIgnoreCase("DRA")) {
                    contDRA++;
                    efic.put("\n"+tipo, contDRA);
                }
                if (tipo.equalsIgnoreCase("ELE")) {
                    contELE++;
                    efic.put("\n"+tipo, contELE);
                }
                if (tipo.equalsIgnoreCase("FAN")) {
                    contFAN++;
                    efic.put("\n"+tipo, contFAN);
                }
                if (tipo.equalsIgnoreCase("FUE")) {
                    contFUE++;
                    efic.put("\n"+tipo, contFUE);

                }
                if (tipo.equalsIgnoreCase("HAD")) {
                    contHAD++;
                    efic.put("\n"+tipo, contHAD);
                }
                if (tipo.equalsIgnoreCase("HIE")) {
                    contHIE++;
                    efic.put("\n"+tipo, contHIE);
                }
                if (tipo.equalsIgnoreCase("LUC")) {
                    contLUC++;
                    efic.put("\n"+tipo, contLUC);
                }
                if (tipo.equalsIgnoreCase("PLA")) {
                   contPLA++;
                    efic.put("\n"+tipo, contPLA);
                }
                if (tipo.equalsIgnoreCase("PSI")) {
                    contPSI++;
                    efic.put("\n"+tipo, contPSI);
                }
                if (tipo.equalsIgnoreCase("ROC")) {
                    contROC++;
                    efic.put("\n"+tipo, contROC);
                }
                if (tipo.equalsIgnoreCase("SIN")) {
                    contSIN++;
                    efic.put("\n"+tipo, contSIN);
                }
                if (tipo.equalsIgnoreCase("TIE")) {
                    contTIE++;
                    efic.put("\n"+tipo, contTIE);
                }
                if (tipo.equalsIgnoreCase("VEN")) {
                    contVEN++;
                    efic.put("\n"+tipo, contVEN);
                }
                if (tipo.equalsIgnoreCase("VOL")) {
                    contVOL++;
                    efic.put("\n"+tipo, contVOL);
                }
            }

        }
        return efic;
    }

    private static String[][] typesTable = { //        //              NOR   FUE   AGU   ELE   PLA   HIE   LUC   VEN   TIE   ROCA  BIC   PSI   BIC   HAD   FAN   PLA   VOL   DRG   SIN   HAD
    //        /* NOR */{"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""},
    //        /* FUE */ {"", "2x", "1/2", "1x", "1x", "1x", "1x", "1x", "1x", "2x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x"},
    //        /* AGU */ {"", "2x", "1/2", "1x", "1x", "1x", "1x", "1x", "2x", "2x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x"},
    //        /* ELE */ {"", "1x", "2x", "1/2", "0x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "2x", "1x", "1x", "1x"},
    //        /* PLA */ {"", "1x", "1x", "1x", "1/2", "2x", "1x", "1x", "1x", "2x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x"},
    //        /* HIE */ {"", "1x", "1x", "1x", "1x", "1/2", "2x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "2x", "1x", "1x", "1x"},
    //        /* LUC */ {"", "1x", "1x", "1x", "1x", "1/2", "1/2", "2x", "1x", "2x", "1x", "1x", "1x", "1x", "2x", "1x", "1x", "1x", "1x", "1x"},
    //        /* VEN */ {"", "1x", "1x", "1x", "1x", "1x", "1x", "1/2", "1x", "1/2", "1x", "1x", "1x", "2x", "2x", "1x", "1x", "1x", "1x", "1x"},
    //        /* TIE */ {"", "1x", "1x", "1x", "2x", "1x", "1x", "1x", "1/2", "1/2", "2x", "1x", "2x", "1x", "1x", "1x", "1x", "1x", "1x", "1x"},
    //        /* ROCA */ {"", "1x", "1x", "1x", "1x", "2x", "1x", "1/2", "2x", "1/2", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x"},
    //        /* BIC */ {"", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "2x", "1/2", "1x", "1x", "1x", "2x", "1x", "1x"},
    //        /* PSI */ {"", "1x", "1x", "1x", "1x", "1x", "1x", "2x", "1x", "1x", "1x", "1x", "1/2", "1x", "1x", "1x", "1x", "1x", "1x", "1x"},
    //        /* BIC */ {"", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "2x", "1/2", "1x", "1x", "1x", "2x", "1x", "1x"},
    //        /* HAD */ {"", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "2x", "1x", "1x", "1x", "1x", "2x"},
    //        /* FAN */ {"", "1x", "1x", "2x", "1x", "1x", "1x", "1/2", "1x", "1x", "1x", "1x", "1x", "1x", "1/2", "2x", "1x", "1x", "1x", "1x"},
    //        /* PLA */ {"", "1x", "1x", "1x", "1x", "1x", "1/2", "2x", "1x", "1x", "2x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x"},
    //        /* VOL */ {"", "1x", "1x", "1x", "1x", "2x", "1x", "1x", "1x", "2x", "1x", "1x", "1x", "1x", "1x", "1/2", "1x", "1x", "1x", "1x"},
    //        /* DRG */ {"", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "2x", "1x", "1x", "1/2"},
    //        /* SIN */ {"", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1/2", "2x"},
    //        /* HAD */ {"", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1x", "1/2", "1/2", "1x", "1x"}
    };
}

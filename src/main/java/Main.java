/*
this class was made by derian
 */



import java.util.ArrayList;



public class Main
{


    public static void main(String[] args)
    {



        Farmer froilan = new Farmer();
        Farm froilansFarm = new Farm();
        Field field = new Field();



        CropRow corn = new CropRow();
        CropRow tomato = new CropRow();
        CropRow potato = new CropRow();
        CropRow onion = new CropRow();
        CropRow cabbage = new CropRow();



        ArrayList<CropRow> cropRows = new ArrayList<CropRow>();
        cropRows.add(corn);
        cropRows.add(tomato);
        cropRows.add(potato);
        cropRows.add(onion);
        cropRows.add(cabbage);



        field.setCropRows(cropRows);



        ChickenCoop chickenCoop1 = new ChickenCoop();
        ChickenCoop chickenCoop2 = new ChickenCoop();
        ChickenCoop chickenCoop3 = new ChickenCoop();
        ChickenCoop chickenCoop4 = new ChickenCoop();

        Chicken chicken1 = new Chicken();
        Chicken chicken2 = new Chicken();
        Chicken chicken3 = new Chicken();
        Chicken chicken4 = new Chicken();
        Chicken chicken5 = new Chicken();
        Chicken chicken6 = new Chicken();
        Chicken chicken7 = new Chicken();
        Chicken chicken8 = new Chicken();
        Chicken chicken9 = new Chicken();
        Chicken chicken10 = new Chicken();
        Chicken chicken11 = new Chicken();
        Chicken chicken12 = new Chicken();
        Chicken chicken13 = new Chicken();
        Chicken chicken14 = new Chicken();
        Chicken chicken15 = new Chicken();

        ArrayList<Chicken> chickensA = new ArrayList<Chicken>();
        ArrayList<Chicken> chickensB = new ArrayList<Chicken>();
        ArrayList<Chicken> chickensC = new ArrayList<Chicken>();
        ArrayList<Chicken> chickensD = new ArrayList<Chicken>();

        chickensA.add(chicken1);
        chickensA.add(chicken2);
        chickensA.add(chicken3);
        chickensA.add(chicken4);

        chickensB.add(chicken5);
        chickensB.add(chicken6);
        chickensB.add(chicken7);
        chickensB.add(chicken8);

        chickensC.add(chicken9);
        chickensC.add(chicken10);
        chickensC.add(chicken11);
        chickensC.add(chicken12);

        chickensD.add(chicken13);
        chickensD.add(chicken14);
        chickensD.add(chicken15);

        chickenCoop1.setChickens(chickensA);
        chickenCoop2.setChickens(chickensB);
        chickenCoop3.setChickens(chickensC);
        chickenCoop4.setChickens(chickensD);



        Stables stable1 = new Stables();
        Stables stable2 = new Stables();
        Stables stable3 = new Stables();

        Horse horse1 = new Horse();
        Horse horse2 = new Horse();
        Horse horse3 = new Horse();
        Horse horse4 = new Horse();
        Horse horse5 = new Horse();
        Horse horse6 = new Horse();
        Horse horse7 = new Horse();
        Horse horse8 = new Horse();
        Horse horse9 = new Horse();
        Horse horse10 = new Horse();

        ArrayList<Horse> horsesA = new ArrayList<Horse>();
        ArrayList<Horse> horsesB = new ArrayList<Horse>();
        ArrayList<Horse> horsesC = new ArrayList<Horse>();

        horsesA.add(horse1);
        horsesA.add(horse2);
        horsesA.add(horse3);
        horsesA.add(horse4);

        horsesB.add(horse5);
        horsesB.add(horse6);
        horsesB.add(horse7);

        horsesC.add(horse8);
        horsesC.add(horse9);
        horsesC.add(horse10);

        stable1.setHorse(horsesA);
        stable2.setHorse(horsesB);
        stable3.setHorse(horsesC);



        Farmer froilanda = new Farmer();

        CropDuster cropDuster = new CropDuster();
        Tractor tractor = new Tractor();



    }



}

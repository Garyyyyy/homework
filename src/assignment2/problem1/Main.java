package assignment2.problem1;

import assignment2.problem1.cabinet.AbstractCabinet;
import assignment2.problem1.cabinet.atreides.AtreidesHalf;
import assignment2.problem1.cabinet.atreides.AtreidesQuarter;
import assignment2.problem1.cabinet.luthien.LuthienHalf;
import assignment2.problem1.cabinet.luthien.LuthienQuarter;
import assignment2.problem1.cabinet.yossarian.YossarianHalf;
import assignment2.problem1.cabinet.yossarian.YossarianQuarter;
import assignment2.problem1.cabinet.yossarian.YossarianWardrobe;
import assignment2.problem1.door.belacqua.BelacquaHalf;
import assignment2.problem1.door.belacqua.BelacquaQuarter;
import assignment2.problem1.door.belacqua.BelacquaWardrobe;
import assignment2.problem1.door.gaga.GagaDoorQuarter;
import assignment2.problem1.door.gaga.GagaHalf;
import assignment2.problem1.door.slothrop.SlothropHalf;
import assignment2.problem1.door.slothrop.SlothropWardrobe;
import assignment2.problem1.drawer.gaga.GagaDrawerQuarter;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args){

        // Initiate All Cabinets Types
        AbstractFurniture yossarianWardrobe = new YossarianWardrobe();
        AbstractFurniture yossarianQuarter = new YossarianQuarter();
        AbstractFurniture yossarianHalf = new YossarianHalf();
        AbstractFurniture luthienHalf = new LuthienHalf();
        AbstractFurniture luthienQuarter = new LuthienQuarter();
        AbstractFurniture atreidesHalf = new AtreidesHalf();
        AbstractFurniture atreidesQuarter = new AtreidesQuarter();

        List<AbstractFurniture> cabinetList = new ArrayList<>();
        cabinetList.add(yossarianWardrobe);
        cabinetList.add(yossarianQuarter);
        cabinetList.add(yossarianHalf);
        cabinetList.add(luthienHalf);
        cabinetList.add(luthienQuarter);
        cabinetList.add(atreidesHalf);
        cabinetList.add(atreidesQuarter);

        // Initiate All Door Types
        AbstractFurniture belacquaWardrobe = new BelacquaWardrobe();
        AbstractFurniture belacquaHalf = new BelacquaHalf();
        AbstractFurniture belacquaQuarter = new BelacquaQuarter();
        AbstractFurniture gagaDoorQuarter = new GagaDoorQuarter();
        AbstractFurniture gagaHalf = new GagaHalf();
        AbstractFurniture slothropHalf = new SlothropHalf();
        AbstractFurniture slothropWardrobe = new SlothropWardrobe();

        List<AbstractFurniture> doorList = new ArrayList<>();
        doorList.add(belacquaWardrobe);
        doorList.add(belacquaHalf);
        doorList.add(belacquaQuarter);
        doorList.add(gagaDoorQuarter);
        doorList.add(gagaHalf);
        doorList.add(slothropWardrobe);
        doorList.add(slothropHalf);

        //Initiate All Drawer Types
        AbstractFurniture gagaDrawerQuarter = new GagaDrawerQuarter();

        List<AbstractFurniture> drawerList = new ArrayList<>();
        drawerList.add(gagaDrawerQuarter);

        Set<String> additionals = new HashSet<>();

        // Get Customer Form
        JSONParser parser = new JSONParser();


//        System.out.println(filePath);
        try(FileReader reader = new FileReader(Main.class.getClassLoader().getResource("CustomerRequestForm.json").getFile())){
            JSONObject jsonObject = (JSONObject) parser.parse(reader);

            search(jsonObject, cabinetList, doorList, drawerList);
            System.out.println(jsonObject.get("width"));
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

    public static List<List<AbstractFurniture>> search(JSONObject jsonObject, List<AbstractFurniture> cabinets, List<AbstractFurniture> doors, List<AbstractFurniture> drawers){
        List<List<AbstractFurniture>> list = new ArrayList<>();
        String unit = (String) jsonObject.get("unit");
        int targetWidth = unit.toLowerCase().equals("inch") ? ((Long)jsonObject.get("width")).intValue() : ((Long)jsonObject.get("width")).intValue() * 12;
        int targetheight = unit.toLowerCase().equals("inch") ? ((Long)jsonObject.get("height")).intValue() : ((Long)jsonObject.get("height")).intValue() * 12;
        int numOfShelves = ((Long)jsonObject.get("shelves")).intValue();
        int numOfDrawers = ((Long)jsonObject.get("drawers")).intValue();
        String targetColor = (String) jsonObject.get("color");
        String mountType = (String) jsonObject.get("mount");
        int budget = ((Long)jsonObject.get("budget")).intValue();

        for(AbstractFurniture cabinet : cabinets){
            
        }



        System.out.println(unit);

        return list;
    }

    public void addAdditionals(AbstractCabinet cabinet, Set<String> additionals){
        additionals.add("Door hinges");
        additionals.add("Door handles");

        if(cabinet.getSize() == "Quarter" && cabinet.getDepth() >= 18){
            additionals.add("18 inches drawers");
        }

        if(cabinet.isStandardWallMountRail()){
            additionals.add("Standard wall-mount rails");
        }

        if(cabinet.isWallFixtureForEarthquakeSafety()){
            additionals.add("Wall fixture attachment for earthquake safety");
        }


    }
}

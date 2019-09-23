package assignment2.problem1;

import assignment2.problem1.cabinet.AbstractCabinet;
import assignment2.problem1.cabinet.atreides.AtreidesHalf;
import assignment2.problem1.cabinet.atreides.AtreidesQuarter;
import assignment2.problem1.cabinet.luthien.LuthienHalf;
import assignment2.problem1.cabinet.luthien.LuthienQuarter;
import assignment2.problem1.cabinet.yossarian.YossarianHalf;
import assignment2.problem1.cabinet.yossarian.YossarianQuarter;
import assignment2.problem1.cabinet.yossarian.YossarianWardrobe;
import assignment2.problem1.door.AbstractDoor;
import assignment2.problem1.door.belacqua.BelacquaHalf;
import assignment2.problem1.door.belacqua.BelacquaQuarter;
import assignment2.problem1.door.belacqua.BelacquaWardrobe;
import assignment2.problem1.door.gaga.GagaDoorQuarter;
import assignment2.problem1.door.gaga.GagaHalf;
import assignment2.problem1.door.slothrop.SlothropHalf;
import assignment2.problem1.door.slothrop.SlothropWardrobe;
import assignment2.problem1.drawer.AbstractDrawer;
import assignment2.problem1.drawer.gaga.GagaDrawerQuarter;
import com.google.gson.Gson;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    @SuppressWarnings("unchecked")
    public static void main(String[] args){

        // Initiate All Cabinets Types
        AbstractCabinet yossarianWardrobe = new YossarianWardrobe();
        AbstractCabinet yossarianQuarter = new YossarianQuarter();
        AbstractCabinet yossarianHalf = new YossarianHalf();
        AbstractCabinet luthienHalf = new LuthienHalf();
        AbstractCabinet luthienQuarter = new LuthienQuarter();
        AbstractCabinet atreidesHalf = new AtreidesHalf();
        AbstractCabinet atreidesQuarter = new AtreidesQuarter();

        List<AbstractCabinet> cabinetList = new ArrayList<>();
        cabinetList.add(yossarianWardrobe);
        cabinetList.add(yossarianQuarter);
        cabinetList.add(yossarianHalf);
        cabinetList.add(luthienHalf);
        cabinetList.add(luthienQuarter);
        cabinetList.add(atreidesHalf);
        cabinetList.add(atreidesQuarter);

        // Initiate All Door Types
        AbstractDoor belacquaWardrobe = new BelacquaWardrobe();
        AbstractDoor belacquaHalf = new BelacquaHalf();
        AbstractDoor belacquaQuarter = new BelacquaQuarter();
        AbstractDoor gagaDoorQuarter = new GagaDoorQuarter();
        AbstractDoor gagaHalf = new GagaHalf();
        AbstractDoor slothropHalf = new SlothropHalf();
        AbstractDoor slothropWardrobe = new SlothropWardrobe();

        List<AbstractDoor> doorList = new ArrayList<>();
        doorList.add(belacquaWardrobe);
        doorList.add(belacquaHalf);
        doorList.add(belacquaQuarter);
        doorList.add(gagaDoorQuarter);
        doorList.add(gagaHalf);
        doorList.add(slothropWardrobe);
        doorList.add(slothropHalf);

        //Initiate All Drawer Types
        AbstractFurniture gagaDrawerQuarter = new GagaDrawerQuarter();

        List<AbstractDrawer> drawerList = new ArrayList<>();
        drawerList.add((AbstractDrawer) gagaDrawerQuarter);

        Set<String> additionals = new HashSet<>();

        // Get Customer Form
        JSONParser parser = new JSONParser();

        JSONArray cabinetToJson = new JSONArray();
        Gson gson = new Gson();

        try(FileReader reader = new FileReader(Main.class.getClassLoader().getResource("CustomerRequestForm.json").getFile())){
            JSONObject jsonObject = (JSONObject) parser.parse(reader);
            List<AbstractCabinet> searchRes = search(jsonObject, cabinetList, doorList, drawerList);
            for(AbstractCabinet cabinet : searchRes){
                cabinetToJson.add(cabinet);
            }

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Write JSON file
        try (FileWriter file = new FileWriter("Test.json")) {
            gson.toJson(cabinetToJson, file);
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }



    }

    public static List<AbstractCabinet> search(JSONObject jsonObject, List<AbstractCabinet> cabinets, List<AbstractDoor> doors, List<AbstractDrawer> drawers){
        List<AbstractCabinet> list = new ArrayList<>();
        String unit = (String) jsonObject.get("unit");
        int targetWidth = unit.toLowerCase().equals("inch") ? ((Long)jsonObject.get("width")).intValue() : ((Long)jsonObject.get("width")).intValue() * 12;
        int targetheight = unit.toLowerCase().equals("inch") ? ((Long)jsonObject.get("height")).intValue() : ((Long)jsonObject.get("height")).intValue() * 12;
        int numOfShelves = ((Long)jsonObject.get("shelves")).intValue();
        int numOfDrawers = ((Long)jsonObject.get("drawers")).intValue();
        String targetColor = (String) jsonObject.get("color");
        String mountType = (String) jsonObject.get("mount");
        int budget = ((Long)jsonObject.get("budget")).intValue();

        for(AbstractCabinet cabinet : cabinets){

            if(cabinet.getHeight() == targetheight && cabinet.getWidth() == targetWidth && cabinet.hasNumOfShelvesAndDrawers(numOfShelves, numOfDrawers) && cabinet.checkColors(targetColor) && cabinet.checkMountType(mountType)){
                list.add(cabinet);
                cabinet.matchDoor(targetColor, doors, drawers);
                break;
            }
        }

        return list;
    }
}

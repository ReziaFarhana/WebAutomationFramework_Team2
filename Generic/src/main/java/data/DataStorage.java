package data;

import databases.ConnectToSqlDB;
import utilities.DataReader;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataStorage {
    public static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public static DataReader excelReader = new DataReader();


    // Insert Data from into Database
    public static void insertDataIntoDB(List<String> listName, String tableName, String columnName) {
        List<String> list = getItems();
        connectToSqlDB = new ConnectToSqlDB();
        connectToSqlDB.insertDataFromArrayListToSqlTable(listName, tableName, columnName);
    }


    //  List items
    public static List<String> getItems() {
        List<String> items = new ArrayList<String>();
        items.add("Gucci Perfume");
        items.add("Gift sets");
        items.add("Hair Dryers");
        items.add("Play Station");
        return items;
    }

    //Database
    public static List<String> getItemsFromDB(String tableName, String columnName) throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase(tableName, columnName);
        System.out.println("Read Data From Database: ");
        return list;
    }


    //Excel file
    public static List<String> getItemsListFromExcel() throws Exception, IOException, SQLException, ClassNotFoundException {
        String path = "../Amazon/DataTest/AmazonData.xlsx";
        String[] myStringArray = excelReader.fileReader2(path, 0);
        for (int i = 1; i < myStringArray.length; i++)
            System.out.println(myStringArray[i] + " ");
        ArrayList<String> list = new ArrayList<String>();


        // Using add() method to add elements in array_list
        //System.out.println();
        for (int i = 0; i < myStringArray.length; i++) {
            list.add(myStringArray[i]);
            //System.out.print(list.get(i+1) + " ");
        }
        return list;
    }


    public static void getItemsListFromDB(String premiumBeauty, String premiumOptions) {
    }
}



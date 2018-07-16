import java.util.ArrayList;
import java.util.Collections;

public class Name {

    private ArrayList<String> names = new ArrayList<>();

    public Name() {
        names.add("Jack");
        names.add("Scott");
        names.add("Bob");
        names.add("James");
        names.add("Fred");
        names.add("Ali");
        names.add("Gabby");
    }

    public String getRandomNames() {
        Collections.shuffle(names);
        return names.get(0);
    }

    public ArrayList<String> getRandomTwoNames() {
        ArrayList<String> twoNames = new ArrayList<>();
        Collections.shuffle(names);
        twoNames.add(names.get(0));
        twoNames.add(names.get(1));
        return twoNames;
    }

    public ArrayList<String> getRandomThreeNames() {
        ArrayList<String> threeNames = new ArrayList<>();
        Collections.shuffle(names);
        threeNames.add(names.get(0));
        threeNames.add(names.get(1));
        threeNames.add(names.get(2));
        return threeNames;
    }


    public ArrayList<String> getRandomFourNames() {
        ArrayList<String> fourNames = new ArrayList<>();
        Collections.shuffle(names);
        fourNames.add(names.get(0));
        fourNames.add(names.get(1));
        fourNames.add(names.get(2));
        fourNames.add(names.get(3));
        return fourNames;
    }


}



